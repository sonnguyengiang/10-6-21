public class Ractangle {
        private double width;
        private double height;
        public Ractangle () {
        }
        public Ractangle (double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return this.width * this.height;
        }
        public double getPerimeter() {
            return (this.width + this.height) * 2;
        }
        public String display() {
            return "area is: " + getArea() + " \n perimeter is: " + getPerimeter();
        }
}
