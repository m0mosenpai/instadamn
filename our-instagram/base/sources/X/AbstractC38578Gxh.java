package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Gxh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38578Gxh extends C0T6 {
    public static Bundle A00(UserSession userSession, ImageUrl imageUrl, ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C09530e4[] c09530e4Arr = new C09530e4[28];
        System.arraycopy(new C09530e4[]{AbstractC166987dD.A1L("IgSessionManager.SESSION_TOKEN_KEY", userSession.token), AbstractC166987dD.A1L("mediaID", str11), AbstractC166987dD.A1L("adID", str2), AbstractC166987dD.A1L("formID", str10), AbstractC166987dD.A1L("app", "instagram"), AbstractC166987dD.A1L("trackingToken", str12), AbstractC166987dD.A1L("ad_creation_source", str), AbstractC166987dD.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str7), AbstractC166987dD.A1L("igUserName", str5), AbstractC166987dD.A1L("advertiser_fbidv2", str3), AbstractC166987dD.A1L("igUserId", str4), AbstractC166987dD.A1L("profilePicURI", imageUrl), AbstractC166987dD.A1L("brandingImageURI", extendedImageUrl), AbstractC166987dD.A1L(MSV.A00(379), Integer.valueOf(i)), AbstractC166987dD.A1L("carouselIndex", Integer.valueOf(i2)), AbstractC166987dD.A1L("mediaPosition", Integer.valueOf(i3)), AbstractC166987dD.A1L("dynamicItemID", str6), AbstractC166987dD.A1L("submitted", Boolean.valueOf(z3)), AbstractC166987dD.A1L("is_sensitive_vertical_ad", Boolean.valueOf(z6)), AbstractC166987dD.A1L("is_pharma_vertical_ad", Boolean.valueOf(z5)), AbstractC166987dD.A1L(MSV.A00(572), Boolean.valueOf(z7)), AbstractC166987dD.A1L("is_partnership_ad", Boolean.valueOf(z4)), AbstractC166987dD.A1L(MSV.A00(574), Boolean.valueOf(z8)), AbstractC166987dD.A1L(MSV.A00(489), Boolean.valueOf(z2)), AbstractC166987dD.A1L(MSV.A00(1331), Boolean.valueOf(z)), AbstractC166987dD.A1L(MSV.A00(445), str8), AbstractC166987dD.A1L(MSV.A00(446), str9)}, 0, c09530e4Arr, 0, 27);
        System.arraycopy(AbstractC25230BEn.A1b(MSV.A00(490), false), 0, c09530e4Arr, 27, 1);
        return AbstractC61636Rr0.A00(c09530e4Arr);
    }
}
