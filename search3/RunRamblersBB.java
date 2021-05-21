public class RunRamblersBB {
    public static void main(String[] args) {
        RamblersSearch ramblersSearch = new RamblersSearch(new Coords(5, 5));
        ramblersSearch.runSearch(new RamblersState(new TerrainMap("search3/tmc.pgm"), new Coords(0, 0), 0), "branchAndBound");
    }
}
