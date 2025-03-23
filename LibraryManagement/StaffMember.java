class StaffMember extends Member {
    private String position;
    
    public StaffMember(int id, String name, int memberId, String position) {
        super(id, name, memberId);
        this.position = position;
    }
    
    @Override
    public void borrowBook(Book book) {
        super.borrowBook(book);
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Position: " + position);
    }
}
