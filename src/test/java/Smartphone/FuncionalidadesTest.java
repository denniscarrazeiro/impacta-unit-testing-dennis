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
    public void TestVerificarSinalAntena(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "baixo";
        funcionalidades.setSinalAntena(20);
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
    public void TestEnviarSms(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "você não possui saldo suficiente para enviar sms.";
        funcionalidades.setSaldoOperadora(0); // R$ 0 de saldo
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
    public void TestAtivarFlash(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "flash ativado";
        funcionalidades.setNivelBateria(10); //10% de bateria
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
    public void TestAtivarRadio(){
        Funcionalidades funcionalidades = new Funcionalidades();
        String atual = "";
        String esperado = "radio ativado";
        funcionalidades.setNivelBateria(90); // 90% nível da bateria
        atual = funcionalidades.ativarRadio();
        Assert.assertEquals(esperado,atual);
    }
    @Test
    public void TestAumentarVolume(){
        Funcionalidades funcionalidades = new Funcionalidades();
        double nivelBateria = 85.3;
        String atual = "";
        String esperado = "nível atual: "+ nivelBateria;
        funcionalidades.setNivelBateria(nivelBateria);
        atual = funcionalidades.aumentarVolume();
        Assert.assertEquals(esperado,atual);
    }


}
