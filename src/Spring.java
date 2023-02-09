public enum Spring {
    MARCH ("март"){
        @Override
        public void met() {
            System.out.println("таит снег");
        }
    },
    APRIL ("апрель") {
        @Override
        public void met() {
            System.out.println("цветение почек растении");
        }
    },
    MAY ("май"){
        @Override
        public void met() {
            System.out.println("цветение растении");
        }
    };

    private String name;

    Spring(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void met() ;

    @Override
    public String toString() {
        return "Spring{" +
                "name='" + name + '\'' +
                '}';
    }
}
