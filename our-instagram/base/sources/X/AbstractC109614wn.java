package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.hashtag.HashtagImpl;
import java.io.IOException;

/* renamed from: X.4wn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC109614wn {
    public static HashtagImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Integer num = null;
            Integer num2 = null;
            String str = null;
            Boolean bool3 = null;
            String str2 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Integer num3 = null;
            String str3 = null;
            Boolean bool6 = null;
            SimpleImageUrl simpleImageUrl = null;
            String str4 = null;
            String str5 = null;
            Boolean bool7 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("allow_following".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("allow_muting_story".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("follow_status".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("following".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("formatted_media_count".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("hide_use_hashtag_button".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("is_eligible_for_survey".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("is_local".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("media_count".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("non_violating".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("profile_pic_url".equals(A0q)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if ("search_result_subtitle".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("search_subtitle".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("use_default_avatar".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            return new HashtagImpl(simpleImageUrl, bool, bool2, bool3, bool4, bool5, bool6, bool7, num, num2, num3, str, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, HashtagImpl hashtagImpl) {
        anonymousClass182.A0d();
        Boolean bool = hashtagImpl.A01;
        if (bool != null) {
            anonymousClass182.A0T("allow_following", bool.booleanValue());
        }
        Boolean bool2 = hashtagImpl.A02;
        if (bool2 != null) {
            anonymousClass182.A0T("allow_muting_story", bool2.booleanValue());
        }
        Integer num = hashtagImpl.A08;
        if (num != null) {
            anonymousClass182.A0Q("follow_status", num.intValue());
        }
        Integer num2 = hashtagImpl.A09;
        if (num2 != null) {
            anonymousClass182.A0Q("following", num2.intValue());
        }
        String str = hashtagImpl.A0B;
        if (str != null) {
            anonymousClass182.A0S("formatted_media_count", str);
        }
        Boolean bool3 = hashtagImpl.A03;
        if (bool3 != null) {
            anonymousClass182.A0T("hide_use_hashtag_button", bool3.booleanValue());
        }
        String str2 = hashtagImpl.A0C;
        if (str2 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
        }
        Boolean bool4 = hashtagImpl.A04;
        if (bool4 != null) {
            anonymousClass182.A0T("is_eligible_for_survey", bool4.booleanValue());
        }
        Boolean bool5 = hashtagImpl.A05;
        if (bool5 != null) {
            anonymousClass182.A0T("is_local", bool5.booleanValue());
        }
        Integer num3 = hashtagImpl.A0A;
        if (num3 != null) {
            anonymousClass182.A0Q("media_count", num3.intValue());
        }
        String str3 = hashtagImpl.A0D;
        if (str3 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str3);
        }
        Boolean bool6 = hashtagImpl.A06;
        if (bool6 != null) {
            anonymousClass182.A0T("non_violating", bool6.booleanValue());
        }
        ImageUrl imageUrl = hashtagImpl.A00;
        if (imageUrl != null) {
            anonymousClass182.A0r("profile_pic_url");
            AbstractC222616c.A01(anonymousClass182, imageUrl);
        }
        String str4 = hashtagImpl.A0E;
        if (str4 != null) {
            anonymousClass182.A0S("search_result_subtitle", str4);
        }
        String str5 = hashtagImpl.A0F;
        if (str5 != null) {
            anonymousClass182.A0S("search_subtitle", str5);
        }
        Boolean bool7 = hashtagImpl.A07;
        if (bool7 != null) {
            anonymousClass182.A0T("use_default_avatar", bool7.booleanValue());
        }
        anonymousClass182.A0a();
    }
}
