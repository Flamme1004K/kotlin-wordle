package domain

class Tiles(val tiles: List<Tile>) {
    init {
        require(tiles.size == 5) { "타일은 5개로 구성되어야 합니다." }
    }
}
