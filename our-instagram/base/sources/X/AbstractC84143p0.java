package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ClipsMashupType;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.List;

/* renamed from: X.3p0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC84143p0 {
    public static C84153p2 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            String str = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            ClipsMashupType clipsMashupType = null;
            Integer num = null;
            C4GH c4gh = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("can_toggle_mashups_allowed".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("formatted_mashups_count".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("has_been_mashed_up".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("has_nonmimicable_additional_audio".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("is_creator_requesting_mashup".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("is_light_weight_check".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("is_light_weight_reuse_allowed_check".equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if ("is_pivot_page_available".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("is_reuse_allowed".equals(A0q)) {
                    bool9 = Boolean.valueOf(c16l.A0d());
                } else if ("mashup_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    clipsMashupType = (ClipsMashupType) ClipsMashupType.A01.get(A1P);
                    if (clipsMashupType == null) {
                        clipsMashupType = ClipsMashupType.A0D;
                    }
                } else if ("mashups_allowed".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("non_privacy_filtered_mashups_media_count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("original_media".equals(A0q)) {
                    c4gh = AbstractC84333pQ.parseFromJson(c16l);
                } else if ("privacy_filtered_mashups_media_count".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("can_toggle_mashups_allowed", "ClipsMediaRemixConsumptionModel");
            } else if (bool2 != null || !(c16l instanceof C07950bF)) {
                if (bool3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_creator_requesting_mashup", "ClipsMediaRemixConsumptionModel");
                } else if (bool4 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("is_pivot_page_available", "ClipsMediaRemixConsumptionModel");
                } else if (bool5 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("mashups_allowed", "ClipsMediaRemixConsumptionModel");
                } else {
                    return new C84153p2(clipsMashupType, c4gh, bool6, bool7, bool8, bool9, num, num2, str, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("has_been_mashed_up", "ClipsMediaRemixConsumptionModel");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C84153p2 c84153p2) {
        anonymousClass182.A0d();
        anonymousClass182.A0T("can_toggle_mashups_allowed", c84153p2.A09);
        String str = c84153p2.A08;
        if (str != null) {
            anonymousClass182.A0S("formatted_mashups_count", str);
        }
        anonymousClass182.A0T("has_been_mashed_up", c84153p2.A0A);
        Boolean bool = c84153p2.A02;
        if (bool != null) {
            anonymousClass182.A0T("has_nonmimicable_additional_audio", bool.booleanValue());
        }
        anonymousClass182.A0T("is_creator_requesting_mashup", c84153p2.A0B);
        Boolean bool2 = c84153p2.A03;
        if (bool2 != null) {
            anonymousClass182.A0T("is_light_weight_check", bool2.booleanValue());
        }
        Boolean bool3 = c84153p2.A04;
        if (bool3 != null) {
            anonymousClass182.A0T("is_light_weight_reuse_allowed_check", bool3.booleanValue());
        }
        anonymousClass182.A0T("is_pivot_page_available", c84153p2.A0C);
        Boolean bool4 = c84153p2.A05;
        if (bool4 != null) {
            anonymousClass182.A0T("is_reuse_allowed", bool4.booleanValue());
        }
        ClipsMashupType clipsMashupType = c84153p2.A00;
        if (clipsMashupType != null) {
            anonymousClass182.A0S("mashup_type", clipsMashupType.A00);
        }
        anonymousClass182.A0T("mashups_allowed", c84153p2.A0D);
        Integer num = c84153p2.A06;
        if (num != null) {
            anonymousClass182.A0Q("non_privacy_filtered_mashups_media_count", num.intValue());
        }
        C4GH c4gh = c84153p2.A01;
        if (c4gh != null) {
            anonymousClass182.A0r("original_media");
            anonymousClass182.A0d();
            String str2 = c4gh.A05;
            if (str2 != null) {
                anonymousClass182.A0S("formatted_mashups_count", str2);
            }
            Boolean bool5 = c4gh.A01;
            if (bool5 != null) {
                anonymousClass182.A0T("is_light_weight_check", bool5.booleanValue());
            }
            anonymousClass182.A0T("is_pivot_page_available", c4gh.A0A);
            Boolean bool6 = c4gh.A02;
            if (bool6 != null) {
                anonymousClass182.A0T("mashups_allowed", bool6.booleanValue());
            }
            String str3 = c4gh.A06;
            if (str3 != null) {
                anonymousClass182.A0S("media_type", str3);
            }
            Integer num2 = c4gh.A03;
            if (num2 != null) {
                anonymousClass182.A0Q("non_privacy_filtered_mashups_media_count", num2.intValue());
            }
            String str4 = c4gh.A07;
            if (str4 != null) {
                anonymousClass182.A0S("pk", str4);
            }
            Integer num3 = c4gh.A04;
            if (num3 != null) {
                anonymousClass182.A0Q("privacy_filtered_mashups_media_count", num3.intValue());
            }
            String str5 = c4gh.A08;
            if (str5 != null) {
                anonymousClass182.A0S("product_type", str5);
            }
            List<Number> list = c4gh.A09;
            if (list != null) {
                C16V.A03(anonymousClass182, "sidecar_child_media_ids");
                for (Number number : list) {
                    if (number != null) {
                        anonymousClass182.A0i(number.longValue());
                    }
                }
                anonymousClass182.A0Z();
            }
            User user = c4gh.A00;
            if (user != null) {
                anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                Parcelable.Creator creator = User.CREATOR;
                AbstractC38851rI.A08(anonymousClass182, user);
            }
            anonymousClass182.A0a();
        }
        Integer num4 = c84153p2.A07;
        if (num4 != null) {
            anonymousClass182.A0Q("privacy_filtered_mashups_media_count", num4.intValue());
        }
        anonymousClass182.A0a();
    }
}
