package org.example.service;

import org.example.domain.*;
import org.example.exceptions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FormatadorServiceTest {

    @Test
    public void deveFormatarAgencia() throws AgenciaNullException, TamanhoAgenciaException {
        FormatadorService formatador = new FormatadorService();

        String resultado = formatador.formataAgenciaConta("12-3");

        Assertions.assertEquals("123", resultado);
    }

    @Test
    public void deveFormatarAgenciaException() throws AgenciaNullException, TamanhoAgenciaException{
        FormatadorService formatador = new FormatadorService();

        Exception resultado = Assertions.assertThrows(TamanhoAgenciaException.class, () -> formatador.formataAgenciaConta("12-45"));

        Assertions.assertEquals("Agencia inválida. Deve conter apenas 3 digítos.", resultado.getMessage());
    }

    @Test
    public void deveFormatarAgenciaTryCatch() throws AgenciaNullException, TamanhoAgenciaException{
        FormatadorService formatador = new FormatadorService();

        try {
            String agenciaFormatada = formatador.formataAgenciaConta("12-3");
            System.out.println("Agência formatada: " + agenciaFormatada);
        } catch (AgenciaNullException | TamanhoAgenciaException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void deveFormatarNumero() throws NumeroNullException, TamanhoNumeroException {
        FormatadorService formatador = new FormatadorService();

        String resultado = formatador.formataNumeroConta("123-456");

        Assertions.assertEquals("123456", resultado);
    }

    @Test
    public void deveFormatarNumeroException() {
        FormatadorService formatador = new FormatadorService();

        Exception resultado = Assertions.assertThrows(NumeroNullException.class, () -> formatador.formataNumeroConta(null));

        Assertions.assertEquals("Número da conta não pode ser nulo!", resultado.getMessage());
    }

    @Test
    public void deveFormatarNumeroTryCatch() {
        FormatadorService formatador = new FormatadorService();

        try {
            String numeroFormatado = formatador.formataNumeroConta(null);
            System.out.println("Número formartado: ");
        } catch (NumeroNullException | TamanhoNumeroException e) {
            e.getMessage();
        }
    }

    @Test
    public void criacaoContaPoupancaTryCatch() {
        try {
            Poupanca poupanca = new Poupanca("123-456", "12-3", 0.0);
            PessoaJuridica ricardo = new PessoaJuridica("Ricardo", poupanca, "123456789");
            System.out.println("O número da minha conta nova é: " + poupanca.getNumero());
        } catch (SaldoMenorQueCinquentaException e) {
            e.getMessage();
        }
    }

    @Test
    public void saqueDeValorMaiorQueSaldoException() {
        Corrente contaRicardo = new Corrente("123-456", "12-3", 100.00);
        PessoaFisica ricardo = new PessoaFisica("Ricardo", contaRicardo, "132456789-10", EstadoCivil.CASADO);

        Exception resultado = Assertions.assertThrows(SaldoMenorQueValorInformadoException.class, () -> contaRicardo.saque(200.00));

        Assertions.assertEquals("Não foi possível completar a transação. Seu saldo é menor que o valor informado.", resultado.getMessage());
    }
}
