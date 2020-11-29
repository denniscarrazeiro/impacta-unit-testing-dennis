package Smartphone;

import org.junit.Assert;
import org.junit.Test;

public class FuncionalidadesTest {

    @Test
    public void TestVerificarNivelBateria(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "medio";
        funcionalidades.setNivelBateria(50);
        atual = funcionalidades.verificarNivelBateria();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestVerificarNivelBateriaDesvio1(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "alto";
        funcionalidades.setNivelBateria(76);
        atual = funcionalidades.verificarNivelBateria();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestVerificarNivelBateriaDesvio2(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "baixo";
        funcionalidades.setNivelBateria(49);
        atual = funcionalidades.verificarNivelBateria();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestVerificarSinalAntena(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "baixo";
        funcionalidades.setSinalAntena(20);
        atual = funcionalidades.verificarSinalAntena();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestVerificarSinalAntenaDesvio1(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "medio";
        funcionalidades.setSinalAntena(51);
        atual = funcionalidades.verificarSinalAntena();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestVerificarSinalAntenaDesvio2(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "alto";
        funcionalidades.setSinalAntena(76);
        atual = funcionalidades.verificarSinalAntena();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestFazerLigacao(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "sua ligação está sendo efetuada";
        funcionalidades.setSaldoOperadora(10); // R$ 10 de saldo
        funcionalidades.setSinalAntena(90); // 90% de sinal da operadora
        atual = funcionalidades.fazerLigacao();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestFazerLigacaoDesvio1(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "não é possível fazer a ligação";
        funcionalidades.setSinalAntena(0); // 90% de sinal da operadora
        atual = funcionalidades.fazerLigacao();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestFazerLigacaoComando1(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "sua ligação de emergencia está sendo efetuada";
        funcionalidades.setSinalAntena(90); // 90% de sinal da operadora
        funcionalidades.setStatusLigacaoEmergencia(true);
        atual = funcionalidades.fazerLigacao();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestFazerLigacaoComando2(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "saldo insuficiente para efetuar a sua ligação";
        funcionalidades.setSinalAntena(90); // 90% de sinal da operadora
        funcionalidades.setStatusLigacaoEmergencia(false);
        funcionalidades.setSaldoOperadora(0);
        atual = funcionalidades.fazerLigacao();
        Assert.assertEquals(esperado,atual);
    }


    @Test
    public void TestEnviarSms(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "você não possui saldo suficiente para enviar sms.";
        funcionalidades.setSaldoOperadora(0); // R$ 0 de saldo
        atual = funcionalidades.enviarSms();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestEnviarSmsDesvio1(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "sua mensagem foi enviada";
        funcionalidades.setSaldoOperadora(10); // R$ 10 de saldo
        atual = funcionalidades.enviarSms();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestTirarFotografia(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "sua fotografia tirada. é possível vê-la no album de fotografia";
        funcionalidades.setNivelBateria(82.1); // 82% de bateria
        atual = funcionalidades.tirarFotografia();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestTirarFotografiaDesvio1(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "o nível da bateria está baixo. não é possível ativar a camera";
        funcionalidades.setNivelBateria(4); // 4% de bateria
        atual = funcionalidades.tirarFotografia();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestAtivarFlash(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "flash ativado";
        funcionalidades.setNivelBateria(10); //10% de bateria
        atual = funcionalidades.ativarFlash();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestAtivarFlashDesvio1(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "o nível da bateria está baixo. não é possível ativar o flash";
        funcionalidades.setNivelBateria(4); //4% de bateria
        atual = funcionalidades.ativarFlash();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void  TestAtivarModoAviao(){
        Funcionalidades funcionalidades = new Funcionalidades();
        boolean atual = false;
        boolean esperado = true;
        atual = funcionalidades.ativarModoAviao();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestAtivarAltoFalante(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "alto-falante ativado";
        funcionalidades.setNivelBateria(85); // 85% nível da bateria
        atual = funcionalidades.ativarAltoFalante();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestAtivarAltoFalanteDesvio1(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "o nível da bateria está baixo. não é possível ativar alto-falante";
        funcionalidades.setNivelBateria(9); // 9% nível da bateria
        atual = funcionalidades.ativarAltoFalante();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestAtivarRadio(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "radio ativado";
        funcionalidades.setNivelBateria(90); // 90% nível da bateria
        atual = funcionalidades.ativarRadio();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestAtivarRadioDesvio1(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "nível da bateria está baixo. não é possível ativar o radio";
        funcionalidades.setNivelBateria(9); // 9% nível da bateria
        atual = funcionalidades.ativarRadio();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestAumentarVolume(){
        Funcionalidades funcionalidades = new Funcionalidades();
        double nivelVolume = 75;
        String atual = "";
        String esperado = "nível atual: "+ nivelVolume;
        funcionalidades.setNivelVolume(nivelVolume);
        atual = funcionalidades.aumentarVolume();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void TestAumentarVolumeDesvio1(){
        Funcionalidades funcionalidades = new Funcionalidades();
        double nivelVolume = 85.3;
        String atual = "";
        String esperado = "nível do volume está muito alto";
        funcionalidades.setNivelVolume(nivelVolume);
        atual = funcionalidades.aumentarVolume();
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void  MockTestDesbloquear(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String senha = "123456@"; // MOCK senha
        String atual = "";
        String esperado = "celular desbloqueado";
        atual = funcionalidades.desbloquear(senha);
        Assert.assertEquals(esperado,atual);
    }

    @Test
    public void  MockTestDesbloquearDesvio1(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String senha = "123456"; // MOCK senha
        String atual = "";
        String esperado = "senha ínvalida";
        atual = funcionalidades.desbloquear(senha);
        Assert.assertEquals(esperado,atual);
    }


}
