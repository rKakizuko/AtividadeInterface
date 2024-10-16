class Carro implements Veiculo {
    @Override
    public void acelerar(){
        System.out.println("O Carro está acelerando. ");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando.");
    }
}