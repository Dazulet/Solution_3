package BuildExample;

public class Room {
        private String name;
        private String description;

        public Room(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

    public Object cloneEntity() {
        return null;
    }
}


