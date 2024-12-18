package X;

import java.io.IOException;

/* renamed from: X.Vx6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69881Vx6 {
    public static URN parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Boolean bool = null;
            String str3 = null;
            String str4 = null;
            Float f = null;
            Integer num = null;
            String str5 = null;
            Boolean bool2 = null;
            Float f2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("background_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("emoji".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("is_interactive_music_sticker".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("question".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("slider_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("slider_vote_average".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if ("slider_vote_count".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("text_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("viewer_can_vote".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("viewer_vote".equals(A0s)) {
                    f2 = AbstractC167007dF.A0a(c16l);
                }
                c16l.A0z();
            }
            return new URN(bool, bool2, f, f2, num, str, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, URN urn, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        String str = urn.A05;
        if (str != null) {
            anonymousClass182.A0S("background_color", str);
        }
        String str2 = urn.A06;
        if (str2 != null) {
            anonymousClass182.A0S("emoji", str2);
        }
        Boolean bool = urn.A00;
        if (bool != null) {
            anonymousClass182.A0T("is_interactive_music_sticker", bool.booleanValue());
        }
        String str3 = urn.A07;
        if (str3 != null) {
            anonymousClass182.A0S("question", str3);
        }
        String str4 = urn.A08;
        if (str4 != null) {
            anonymousClass182.A0S("slider_id", str4);
        }
        Float f = urn.A02;
        if (f != null) {
            anonymousClass182.A0P("slider_vote_average", f.floatValue());
        }
        Integer num = urn.A04;
        if (num != null) {
            anonymousClass182.A0Q("slider_vote_count", num.intValue());
        }
        String str5 = urn.A09;
        if (str5 != null) {
            anonymousClass182.A0S("text_color", str5);
        }
        Boolean bool2 = urn.A01;
        if (bool2 != null) {
            anonymousClass182.A0T("viewer_can_vote", bool2.booleanValue());
        }
        Float f2 = urn.A03;
        if (f2 != null) {
            anonymousClass182.A0P("viewer_vote", f2.floatValue());
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }
}
