package Smartphone;

public class Funcionalidades {

    private double nivelBateria;
    private double sinalAntena;
    private double nivelVolume;
    private double saldoOperadora;
    private boolean bluetooth;
    private boolean wifi;
    private boolean ligacaoEmergencia;

    public void setNivelBateria(double _nivelBateria){
        this.nivelBateria = _nivelBateria;
    }

    public double getNivelBateria(){
        return this.nivelBateria;
    }

    public void setSinalAntena(double _sinalAntena){
        this.sinalAntena = _sinalAntena;
    }
    public double getSinalAntena(){
        return this.sinalAntena;
    }

    public void setSaldoOperadora(double _saldoOperadora){
        this.saldoOperadora = _saldoOperadora;
    }

    public double getSaldoOperadora(){
        return  this.saldoOperadora;
    }

    public void setNivelVolume(double _nivelVolume){
        this.nivelVolume = _nivelVolume;
    }

    public double getNivelVolume(){
        return this.nivelVolume;
    }

    public void setStatusBluetooth(boolean _statusBluetooth){
        this.bluetooth = _statusBluetooth;
    }

    public boolean getStatusBluetooth(){
        return this.bluetooth;
    }

    public void setStatusWifi(boolean _statusWifi){
        this.wifi = _statusWifi;
    }
    public boolean getStatusWifi(){
        return this.wifi;
    }

    public void setStatusLigacaoEmergencia(boolean _statusLigacaoEmergencia){
        this.ligacaoEmergencia = _statusLigacaoEmergencia;
    }
    public boolean getStatusLigacaoEmergencia(){
        return this.ligacaoEmergencia;
    }

    public String verificarNivelBateria(){
        if(this.getNivelBateria() >= 75){
            return "alto";
        }else if(this.getNivelBateria() >= 50){
            return "medio";
        }else{
            return "baixo";
        }
    }

    public String verificarSinalAntena(){
        if(this.getSinalAntena() >= 75){
            return "alto";
        }else if(this.getSinalAntena() >= 50){
            return "medio";
        }else{
            return "baixo";
        }
    }

    public String fazerLigacao(){
        if(this.getSinalAntena() == 0){
            return "não é possível fazer a ligação";
        }else{
            if(this.getStatusLigacaoEmergencia()){
                return "sua ligação de emergencia está sendo efetuada";
            }else if(this.saldoOperadora > 0.3) {
                return "sua ligação está sendo efetuada";
            }else{
                return "saldo insuficiente para efetuar a sua ligação";
            }
        }
    }

    public String enviarSms(){
        if(this.getSaldoOperadora() == 0){
            return "você não possui saldo suficiente para enviar sms.";
        }else{
            return "sua mensagem foi enviada";
        }
    }

    public String tirarFotografia(){
        if(this.nivelBateria <= 5){
            return "o nível da bateria está baixo. não é possível ativar a camera";
        }else{
            return "sua fotografia tirada. é possível vê-la no album de fotografia";
        }
    }

    public String ativarFlash(){
        if(this.nivelBateria <= 5){
            return "o nível da bateria está baixo. não é possível ativar alto-falante";
        }else{
            return "flash ativado";
        }
    }

    public boolean ativarModoAviao(){
        this.setStatusWifi(false);
        this.setStatusBluetooth(false);
        this.setSinalAntena(0);
        if(this.getStatusWifi() == false && this.getStatusBluetooth() == false && this.getSinalAntena() == 0){
            return true;
        }else{
            return false;
        }
    }

    public String ativarAltoFalante(){
        if(this.getNivelBateria() <= 10){
            return "o nível da bateria está baixo. não é possível ativar alto-falante";
        }else{
            return "alto-falante ativado";
        }
    }

    public String ativarRadio(){
        if(this.getNivelBateria() <= 10){
            return "nível da bateria está baixo. não é possível ativa o radio";
        }else{
            return "radio ativado";
        }
    }

    public String aumentarVolume(){
        if(this.getNivelVolume() >= 80){
            return "nível do volume está muito alto";
        }else{
            return "nível atual: "+ this.getNivelBateria();
        }
    }

}
