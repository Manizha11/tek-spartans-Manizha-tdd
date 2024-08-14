package playground;

    //POJO - DTO (data to object)
    public class Person {

        private String name;
        private int length;

        public Person(String name, int length) {
            this.name = name;
            this.length = length;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }
    }

