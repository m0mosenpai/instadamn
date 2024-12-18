package X;

import android.os.Parcelable;
import com.instagram.api.schemas.MediaVCRTappableData;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.91r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2042191r {
    public static void A00(AnonymousClass182 anonymousClass182, MediaVCRTappableData mediaVCRTappableData, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        anonymousClass182.A0T(AbstractC111324zv.A00(180), mediaVCRTappableData.A0A);
        String str = mediaVCRTappableData.A03;
        if (str != null) {
            anonymousClass182.A0S("end_background_color", str);
        }
        Float f = mediaVCRTappableData.A01;
        if (f != null) {
            anonymousClass182.A0P("end_time_ms", f.floatValue());
        }
        User user = mediaVCRTappableData.A00;
        if (user != null) {
            anonymousClass182.A0r(AbstractC111324zv.A00(249));
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        String str2 = mediaVCRTappableData.A04;
        if (str2 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(C8S8.DEFAULT_SWIPE_ANIMATION_DURATION), str2);
        }
        String str3 = mediaVCRTappableData.A05;
        if (str3 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(251), str3);
        }
        String str4 = mediaVCRTappableData.A06;
        if (str4 != null) {
            anonymousClass182.A0S("original_media_code", str4);
        }
        String str5 = mediaVCRTappableData.A07;
        if (str5 != null) {
            anonymousClass182.A0S("original_media_id", str5);
        }
        String str6 = mediaVCRTappableData.A08;
        if (str6 != null) {
            anonymousClass182.A0S("start_background_color", str6);
        }
        Float f2 = mediaVCRTappableData.A02;
        if (f2 != null) {
            anonymousClass182.A0P("start_time_ms", f2.floatValue());
        }
        String str7 = mediaVCRTappableData.A09;
        if (str7 != null) {
            anonymousClass182.A0S("text_color", str7);
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }

    public static MediaVCRTappableData parseFromJson(C16L c16l) {
        String A00;
        String A002;
        String A003;
        String A004;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Float f = null;
            User user = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Float f2 = null;
            String str7 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(251);
                A002 = AbstractC111324zv.A00(C8S8.DEFAULT_SWIPE_ANIMATION_DURATION);
                A003 = AbstractC111324zv.A00(249);
                A004 = AbstractC111324zv.A00(180);
                if (A1J == c16r) {
                    break;
                }
                String A0q = c16l.A0q();
                c16l.A1J();
                if (A004.equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("end_background_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("end_time_ms".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if (A003.equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if (A002.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (A00.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("original_media_code".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("original_media_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("start_background_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("start_time_ms".equals(A0q)) {
                    f2 = new Float(c16l.A0U());
                } else if ("text_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(A004, "MediaVCRTappableData");
            } else if (user != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(A002, "MediaVCRTappableData");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00(A00, "MediaVCRTappableData");
                } else if (str5 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("original_media_id", "MediaVCRTappableData");
                } else {
                    return new MediaVCRTappableData(user, f, f2, str, str2, str3, str4, str5, str6, str7, bool.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00(A003, "MediaVCRTappableData");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
