package dev.chachy.data;

    import java.util.Map;

    public class Student extends Person {
        private Map<String, Float> marks;

        public void setMarks(Map<String, Float> marks) {
            this.marks = marks;
        }

        public Map<String, Float> getMarks() {
            return marks;
        }
    }
