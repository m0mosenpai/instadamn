package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Vx4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69879Vx4 {
    public static URL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            User user = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Long l = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            Boolean bool3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("attribution".equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("background_image_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("countdown_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("digit_card_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("digit_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("end_background_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("end_ts".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("following_enabled".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("is_owner".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("start_background_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("text_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("viewer_is_following".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return new URL(user, bool, bool2, bool3, l, str, str2, str3, str4, str5, str6, str7, str8);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, URL url, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        User user = url.A00;
        if (user != null) {
            anonymousClass182.A0r("attribution");
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        String str = url.A05;
        if (str != null) {
            anonymousClass182.A0S("background_image_url", str);
        }
        String str2 = url.A06;
        if (str2 != null) {
            anonymousClass182.A0S("countdown_id", str2);
        }
        String str3 = url.A07;
        if (str3 != null) {
            anonymousClass182.A0S("digit_card_color", str3);
        }
        String str4 = url.A08;
        if (str4 != null) {
            anonymousClass182.A0S("digit_color", str4);
        }
        String str5 = url.A09;
        if (str5 != null) {
            anonymousClass182.A0S("end_background_color", str5);
        }
        Long l = url.A04;
        if (l != null) {
            anonymousClass182.A0R("end_ts", l.longValue());
        }
        Boolean bool = url.A01;
        if (bool != null) {
            anonymousClass182.A0T("following_enabled", bool.booleanValue());
        }
        Boolean bool2 = url.A02;
        if (bool2 != null) {
            anonymousClass182.A0T("is_owner", bool2.booleanValue());
        }
        String str6 = url.A0A;
        if (str6 != null) {
            anonymousClass182.A0S("start_background_color", str6);
        }
        AbstractC37301Gc2.A1E(anonymousClass182, url.A0B);
        String str7 = url.A0C;
        if (str7 != null) {
            anonymousClass182.A0S("text_color", str7);
        }
        Boolean bool3 = url.A03;
        if (bool3 != null) {
            anonymousClass182.A0T("viewer_is_following", bool3.booleanValue());
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }
}
