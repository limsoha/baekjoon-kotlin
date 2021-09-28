package math

fun breakEventPoint(fixedCost: Int, productionCost: Int, saleAmount: Int): String {

    if (productionCost >= saleAmount) {
        return "-1"
    }

    return (fixedCost / (saleAmount - productionCost) + 1).toString()
}