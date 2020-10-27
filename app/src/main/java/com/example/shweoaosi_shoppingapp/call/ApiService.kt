package com.example.shweoaosi_shoppingapp.call

import com.example.shweoaosi_shoppingapp.MyConstant
import com.example.shweoaosi_shoppingapp.model.SearchModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.HeaderMap
import retrofit2.http.QueryMap


/**
 * Created by heinhtet on 1/28/18.
 */
interface ApiService {
    //    @POST("oauth/token")
//    fun callLogin(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Content-Type") type: String = "application/json",
////        @Header("Accept") accept: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Body requestBody: RequestBody
//    ): Single<LoginModel>
//
    @GET("${MyConstant.API}advanced-searchaa")
    fun callSearch(
        @HeaderMap headerMap: Map<String, String>,
        @QueryMap queryMap: Map<String, String>
    ): Single<SearchModel>

//    @GET("${MyConstant.API}advanced-search")
//    fun callSearchInELibrary(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @QueryMap queryMap: Map<String, String>
////        @Query("search") search: String? = null,
////        @Query("subject") subject: String = Hawk.get(FilterEnum.SelectedSubject.toString(), ""),
////        @Query("resource_format") resource_format: String = Hawk.get(FilterEnum.SelectedResourceFormat.toString(), ""),
////        @Query("page") page: Int = 1
//    ): Single<SearchModel>
//
//    @GET("${MyConstant.API}advanced-search")
//    fun callSearchInRelated(
//        @HeaderMap headerMap: Map<String, String>,
//        @QueryMap queryMap: Map<String, String>
//    ): Single<SearchModel>
//
//    @GET("${MyConstant.API}advanced-search")
//    fun callResourceFormat(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Query("resource_format") resource_format: String,
//        @Query("page") page: Int = 1
//    ): Single<SearchModel>
//
//    @POST("${MyConstant.API}reset-password/send_reset_token")
//    fun callForgotPasswordEmailAndSMS(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("Accept") accept: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Body requestBody: RequestBody
//    ): Single<ForgotPasswordModel>
//
//    @POST("${MyConstant.API}reset-password/email/send_reset_token")
//    fun callForgotPasswordEmail(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("Accept") accept: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Body requestBody: RequestBody
//    ): Single<ForgotPasswordModel>
//
//    @POST("${MyConstant.API}change-password")
//    fun callChangePassword(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Content-Type") type: String = "application/json",
////        @Header("Accept") accept: String = "application/json",
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Body requestBody: RequestBody
//    ): Single<ChangePasswordModel>
//
//    @POST("${MyConstant.API}reset-password")
//    fun callForgotPasswordVerification(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("Accept") accept: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Body requestBody: RequestBody
//    ): Single<ForgotPasswordModel>
//
//    @POST("${MyConstant.API}register")
//    fun callRegister(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("Accept") accept: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Body requestBody: RequestBody
//    ): Single<RegisterModel>
//
//    @Multipart
//    @POST("${MyConstant.API}member/resource")
//    fun callUploadResource(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
////        @Header("Accept") accept: String = "application/json",
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") cType: String = "multipart/form-data",//comment by snsh
//        @PartMap partMap: Map<String, @JvmSuppressWildcards RequestBody>,
//        @Part cover_image: MultipartBody.Part,
//        @Part previews: MultipartBody.Part? = null,
//        @Part full_version_files: MultipartBody.Part? = null
//    ): Single<UploadResourceModel>
//
//    @Multipart
//    @POST("${MyConstant.API}member/resource/{id}")
//    fun callNewVersionResource(
//        @HeaderMap headerMap: Map<String, String>,
//        @PartMap partMap: Map<String, @JvmSuppressWildcards RequestBody>,
//        @Part cover_image: MultipartBody.Part? = null,
//        @Part previews: MultipartBody.Part? = null,
//        @Part full_version_files: MultipartBody.Part? = null,
//        @Path("id") id: Int
//    ): Single<NewVersionResourceModel>
//
//    @Multipart
//    @POST("${MyConstant.API}member/submit-for-approval/{id}")
//    fun callSubmitForApproval(
//        @HeaderMap headerMap: Map<String, String>,
//        @PartMap partMap: Map<String, @JvmSuppressWildcards RequestBody>,
//        @Path("id") id: Int
//    ): Single<AddNewAndAnnouncementModel>
//
//    @Multipart
//    @POST("${MyConstant.API}member/article")
//    fun callAddNewAndAnnouncement(
//        @HeaderMap headerMap: Map<String, String>,
//        @PartMap partMap: Map<String, @JvmSuppressWildcards RequestBody>,
//        @Part cover_image: MultipartBody.Part? = null
//    ): Single<AddNewAndAnnouncementModel>
//
//    @Multipart
//    @POST("${MyConstant.API}member/article/{id}")
//    fun callEditNewAndAnnouncement(
//        @HeaderMap headerMap: Map<String, String>,
//        @PartMap partMap: Map<String, @JvmSuppressWildcards RequestBody>,
//        @Part cover_image: MultipartBody.Part? = null,
//        @Path("id") id: Int
//    ): Single<AddNewAndAnnouncementModel>
//
//    @GET("${MyConstant.API}member/resource/{oldId}/new-version")
//    fun callNewVersionId(
//        @HeaderMap headerMap: Map<String, String>,
//        @Path("oldId") oldId: Int,
//        @QueryMap queryMap: Map<String, String>
//    ): Single<NewVersionIdModel>
//
//    @PUT("${MyConstant.API}member/resource/{id}")
//    fun callEditResource(
//        @HeaderMap headerMap: Map<String, String>,
//        @Path("id") id: Int,
//        @Body requestBody: RequestBody
//    ): Single<EditResourceModel>
//
//    @FormUrlEncoded
//    @POST("${MyConstant.API}member/resource/{id}/review")
//    fun callWriteReviewModel(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Accept") accept: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Path("id") id: Int,
//        @FieldMap partMap: Map<String, String>
//
//    ): Single<WriteReviewModel>
//
//    @FormUrlEncoded
//    @POST("${MyConstant.API}member/user/{id}")
//    fun callEditUser(
//        @HeaderMap headerMap: Map<String, String>,
//        @Path("id") id: Int,
//        @FieldMap partMap: Map<String, String>
//
//    ): Single<EditUserModel>
//
//    @FormUrlEncoded
//    @POST("${MyConstant.API}member/resource/{id}/report")
//    fun callReport(
//        @HeaderMap headerMap: Map<String, String>,
//        @Path("id") id: Int,
//        @FieldMap partMap: Map<String, String>
//
//    ): Single<WriteReviewModel>
//
//    @GET("${MyConstant.API}report-type")
//    fun callReportType(
//        @HeaderMap headerMap: Map<String, String>
//    ): Single<ArrayList<ReviewTypeModel>>
//
//    @GET("${MyConstant.API}resource/{id}/reviews")
//    fun callReview(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Accept") accept: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Path("id") id: Int,
//        @Query("page") page: Int = 1
//    ): Single<ReviewModel>
//
//    /*@POST("${MyConstant.API}member/resource/{id}/review")
//    fun callWriteReviewModel(
//        @Header("Authorization") authorization: String,
//        @Header("Accept") accept: String = "application/json",
//        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Path("id") id: Int,
//        @Body body: RequestBody
////        @FieldMap partMap: Map<String, String>
//    ): Single<WriteReviewModel>*/
//
//
//    @POST("${MyConstant.API}update-profile")
//    fun callUpdateProfile(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("Accept") accept: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Body requestBody: RequestBody
//    ): Single<UpdateProfileModel>
//
//    @POST("${MyConstant.API}verify/post_otp")
//    fun callOTP(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("Accept") accept: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Body requestBody: RequestBody
//    ): Single<OTPModel>
//
//    @POST("${MyConstant.API}resend/otp")
//    fun callResendOTP(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("Accept") accept: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Body requestBody: RequestBody
//    ): Single<ResendOTPModel>
//
//    @GET("${MyConstant.API}member/resource")
//    fun callUploadedResourceList(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Accept") accept: String = "application/json",
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Query("page") page: Int = 1
//    ): Single<UploadedResourceListModel>
//
//    @GET("${MyConstant.API}member/user")
//    fun callViewUser(
//        @HeaderMap headerMap: Map<String, String>,
//        @QueryMap queryMap: Map<String, String>
//    ): Single<ViewUserModel>
//
//    @GET("${MyConstant.API}member/user")
//    fun callManageUser(
//        @HeaderMap headerMap: Map<String, String>,
//        @QueryMap queryMap: Map<String, String>
//    ): Single<ManageUserModel>
//
//    @GET("${MyConstant.API}member/user/{id}/{action}")
//    fun callManageUserAction(
//        @HeaderMap headerMap: Map<String, String>,
//        @Path("id") id: String,
//        @Path("action") action: String
//    ): Single<ManageUserActionModel>
//
//    @GET("${MyConstant.API}member/favourite")
//    fun callFavouriteList(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Accept") accept: String = "application/json",
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Query("page") page: Int = 1
//    ): Single<FavouriteListModel>
//
//    @GET("${MyConstant.API}member/approval-request")
//    fun callManageResourceList(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Accept") accept: String = "application/json",
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Query("page") page: Int = 1,
//        @Query("approval_status") approvalStatus: Int? = null
//    ): Single<ManageResourceListModel>
//
//    @GET("${MyConstant.API}member/approval-request/{id}/{action}")
//    fun callManageResourceAction(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Accept") accept: String = "application/json",
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Path("id") id: String,
//        @Path("action") action: String
//    ): Single<ManageResourceActionModel>
//
//    @GET("${MyConstant.API}member/approval-request/{id}")
//    fun callApprovalDetailModel(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Accept") accept: String = "application/json",
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Path("id") id: String
//    ): Single<ApprovalDetailModel>
//
//    @GET("${MyConstant.API}accessible-right")
//    fun callAccessibleRight(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<ArrayList<AccessibleRightModel>>
//
//    @GET("${MyConstant.API}slide")
//    fun callSlideList(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<SlideListModel>
//
//    @GET("${MyConstant.API}user-type")
//    fun callUserTypes(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<ArrayList<UserTypeModel>>
//
//    @GET("${MyConstant.API}notification-channel")
//    fun callNotificationChannel(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<ArrayList<NotificationChannelModel>>
//
//    @GET("${MyConstant.API}colleges")
//    fun callEducationCollege(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<ArrayList<EducationCollegeModel>>
//
//    @GET("${MyConstant.API}subjects")
//    fun callSubjectList(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<ArrayList<SubjectListModel>>
//
//    @GET("${MyConstant.API}license")
//    fun callLicenseList(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<ArrayList<LicenseListModel>>
//
//    @GET("${MyConstant.API}resource-format")
//    fun callResourceFormatList(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<ArrayList<ResourceFormatListModel>>
//
//    @GET("${MyConstant.API}year-study-teaching")
//    fun callYearStudyTeachingList(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<ArrayList<YearStudyTeachingListModel>>
//
//    @GET("${MyConstant.API}subject")
//    fun callSubjectListNav(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<SubjectListNavModel>
//
//    @GET("${MyConstant.API}page/about-us")
//    fun callAboutUs(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<AboutUsModel>
//
//    @GET("${MyConstant.API}page/contact-us")
//    fun callContactUs(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<ContactUsModel>
//
//    @GET("${MyConstant.API}region-state")
//    fun callRegionState(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<ArrayList<RegionStateModel>>
//
//    @POST("${MyConstant.API}contact")
//    fun callContactForm(
//        @HeaderMap headerMap: Map<String, String>,
//        @Body requestBody: RequestBody
//    ): Single<ContactFormModel>
//
//    @GET("${MyConstant.API}page/disclaimer")
//    fun callDisclaimer(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<DisclaimerModel>
//
//    @GET("${MyConstant.API}faq")
//    fun callFAQAll(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<FAQAllModel>
//
//    @GET("${MyConstant.API}faq-category/general/faqs")
//    fun callFAQGeneralCategory(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<FAQAllModel>
//
//    @GET("${MyConstant.API}faq-category/learning/faqs")
//    fun callFAQLearningCategory(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<FAQAllModel>
//
//    @GET("${MyConstant.API}faq-category/elibrary/faqs")
//    fun callFAQELibraryCategory(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<FAQAllModel>
//
//    @GET("${MyConstant.API}featured-resource")
//    fun callFeatureResource(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Query("page") page: Int = 1
//    ): Single<FeatureResourceModel>
//
//    @GET("${MyConstant.API}resource")
//    fun callLatestResource(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Query("page") page: Int = 1
//    ): Single<LatestResourceModel>
//
//    @GET("${MyConstant.API}subject/{slug}/resource")
//    fun callResourceSubject(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Path("slug") slug: String,
//        @Query("page") page: Int = 1
//    ): Single<ResourceSubjectModel>
//
//    @GET("${MyConstant.API}member/add-to-favourite/{id}")
//    fun callAddToFavourite(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Content-Type") type: String = "application/json",
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Path("id") id: Int
//    ): Single<AddToFavouriteModel>
//
//    @GET("${MyConstant.API}member/remove-from-favourite/{id}")
//    fun callRemoveFromFavourite(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Content-Type") type: String = "application/json",
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Path("id") id: Int
//    ): Single<AddToFavouriteModel>
//
//    @GET("${MyConstant.API}member/notification")
//    fun callNotificationList(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Content-Type") type: String = "application/json",
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Query("page") page: Int = 1
//    ): Single<NotificationListModel>
//
//    @GET("${MyConstant.API}member/notification/{id}/mark-as-read")
//    fun callMarkAsReadNotification(
//        @HeaderMap headerMap: Map<String, String>,
//        @Path("id") id: String
//    ): Single<NotificationMarkAsRadModel>
//
//    @GET("${MyConstant.API}me")
//    fun callMe(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Content-Type") type: String = "application/json",
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<MeModel>
//
//    @GET("${MyConstant.API}resource/{id}")
//    fun callGuestResourceDetail(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Path("id") id: Int
//    ): Single<ResourceDetailModel>
//
//    //    @GET("${MyConstant.API}user/resource/{id}")
//    @GET("${MyConstant.API}member/resource/{id}")
//    fun callUserResourceDetail(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Content-Type") type: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
////        @Header("Authorization") authorization: String = getAuthorization(),
//        @Path("id") id: Int
//    ): Single<ResourceDetailModel>
////        @Query("page") page: Int = 1,
//
//    @GET("${MyConstant.API}resource/{id}/related")
//    fun callRelatedResource(
//        @HeaderMap headerMap: Map<String, String>,
//        @Path("id") id: Int
//    ): Single<RelatedResourceModel>
//
//    @GET("${MyConstant.API}article")
//    fun callNewsAndAnnouncement(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @QueryMap queryMap: Map<String, String>
////        @Query("page") page: Int = 1
//    ): Single<NewsAndAnnouncementModel>
//
//    @GET("${MyConstant.API}article-category")
//    fun callArticleCategoryList(
//        @HeaderMap headerMap: Map<String, String>
//    ): Single<ArrayList<ArticleCategoryListModel>>
//
//    @GET("${MyConstant.API}member/article")
//    fun callArticleList(
//        @HeaderMap headerMap: Map<String, String>,
//        @QueryMap queryMap: Map<String, String>
//    ): Single<ArticleListModel>
//
//    @GET("${MyConstant.API}article/{id}")
//    fun callNewsAndAnnouncementDetail(
//        @HeaderMap headerMap: Map<String, String>,
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("Content-Type") type: String = "application/json",
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale(),
//        @Path("id") id: Int
//    ): Single<NewsAndAnnouncementDetailModel>
//
//    @GET("${MyConstant.API}member/resource/{id}/related")
//    fun callResourceRelated(
//        @HeaderMap headerMap: Map<String, String>,
//        @Path("id") id: Int
//    ): Single<ResourceRelatedListModel>
//
//    @GET("${MyConstant.API}member/resource/{resourceId}/remove-resource/{id}")
//    fun callRemoveResourceRelated(
//        @HeaderMap headerMap: Map<String, String>,
//        @Path("resourceId") resourceId: Int,
//        @Path("id") id: Int
//    ): Single<RemoveResourceRelatedModel>
//
//    @POST("${MyConstant.API}member/resource/{resourceId}/add-resource")
//    fun callAddResourceRelated(
//        @HeaderMap headerMap: Map<String, String>,
//        @Path("resourceId") resourceId: Int,
//        @Query("resource_id") id: Int
//    ): Single<AddResourceRelatedModel>
//
//    @GET("${MyConstant.API}logout")
//    fun callLogout(
//        @HeaderMap headerMap: Map<String, String>
////        @Header("Authorization") authorization: String = getAuthorization(),
////        @Header("X-App-Locale") xAppLocale: String = getXAppLocale()
//    ): Single<LogoutModel>
}