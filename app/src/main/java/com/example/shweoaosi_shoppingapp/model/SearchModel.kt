package com.example.shweoaosi_shoppingapp.model

import com.google.gson.annotations.SerializedName


data class SearchModel(
    @SerializedName("Items") val items: List<Item?>? = listOf(),
    @SerializedName("title") val title: String? = "",
    @SerializedName("lastBuildDate") val lastBuildDate: String? = ""
) {

    data class Item(
        @SerializedName("Item") val item: Item? = Item()
    ) {

        data class Item(
            @SerializedName("mediumImageUrls") val mediumImageUrls: List<MediumImageUrl?>? = listOf(),
            @SerializedName("pointRate") val pointRate: Int? = 0,
            @SerializedName("shopOfTheYearFlag") val shopOfTheYearFlag: Int? = 0,
            @SerializedName("affiliateRate") val affiliateRate: String? = "",
            @SerializedName("shipOverseasFlag") val shipOverseasFlag: Int? = 0,
            @SerializedName("asurakuFlag") val asurakuFlag: Int? = 0,
            @SerializedName("endTime") val endTime: String? = "",
            @SerializedName("taxFlag") val taxFlag: Int? = 0,
            @SerializedName("startTime") val startTime: String? = "",
            @SerializedName("rank") val rank: Int? = 0,
            @SerializedName("itemCaption") val itemCaption: String? = "",
            @SerializedName("catchcopy") val catchcopy: String? = "",
            @SerializedName("smallImageUrls") val smallImageUrls: List<SmallImageUrl?>? = listOf(),
            @SerializedName("asurakuClosingTime") val asurakuClosingTime: String? = "",
            @SerializedName("carrier") val carrier: Int? = 0,
            @SerializedName("imageFlag") val imageFlag: Int? = 0,
            @SerializedName("shopAffiliateUrl") val shopAffiliateUrl: String? = "",
            @SerializedName("availability") val availability: Int? = 0,
            @SerializedName("itemCode") val itemCode: String? = "",
            @SerializedName("postageFlag") val postageFlag: Int? = 0,
            @SerializedName("itemName") val itemName: String? = "",
            @SerializedName("itemPrice") val itemPrice: String? = "",
            @SerializedName("pointRateEndTime") val pointRateEndTime: String? = "",
            @SerializedName("shopCode") val shopCode: String? = "",
            @SerializedName("affiliateUrl") val affiliateUrl: String? = "",
            @SerializedName("shopName") val shopName: String? = "",
            @SerializedName("asurakuArea") val asurakuArea: String? = "",
            @SerializedName("reviewCount") val reviewCount: Int? = 0,
            @SerializedName("shopUrl") val shopUrl: String? = "",
            @SerializedName("creditCardFlag") val creditCardFlag: Int? = 0,
            @SerializedName("reviewAverage") val reviewAverage: String? = "",
            @SerializedName("shipOverseasArea") val shipOverseasArea: String? = "",
            @SerializedName("genreId") val genreId: String? = "",
            @SerializedName("pointRateStartTime") val pointRateStartTime: String? = "",
            @SerializedName("itemUrl") val itemUrl: String? = "",
            val isLoadingView: Boolean = false
        ) {

            data class SmallImageUrl(
                @SerializedName("imageUrl") val imageUrl: String? = ""
            )


            data class MediumImageUrl(
                @SerializedName("imageUrl") val imageUrl: String? = ""
            )
        }
    }
}