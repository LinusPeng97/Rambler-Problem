public class RunRamblersAstart {
    public static void main(String[] args) {
        // the parameter in constructor is the coordination of the end point
        RamblersSearch ramblersSearch = new RamblersSearch(new Coords(15, 15), Distance.MANHATTAN);
        // the Coords parameter in this constructor is the start point
        ramblersSearch.runSearch(new RamblersState(new TerrainMap("tmc.pgm"), new Coords(0, 0), 0, 0), "AStar");
    }
}
