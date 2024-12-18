package X;

import java.io.IOException;

/* renamed from: X.54p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1122154p {
    public static C206409Bx parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            C1122254r c1122254r = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("link_context".equals(A0q)) {
                    c1122254r = C54q.parseFromJson(c16l);
                } else if ("text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            C206409Bx c206409Bx = new C206409Bx(str);
            if (c1122254r != null) {
                c206409Bx.A00 = c1122254r;
            }
            return c206409Bx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(C206409Bx c206409Bx, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        if (c206409Bx.A00 != null) {
            anonymousClass182.A0r("link_context");
            C1122254r c1122254r = (C1122254r) c206409Bx.A00;
            anonymousClass182.A0d();
            if (c1122254r.A00 != null) {
                anonymousClass182.A0r("link_image_url");
                AbstractC222616c.A01(anonymousClass182, c1122254r.A00);
            }
            String str = c1122254r.A03;
            if (str != null) {
                anonymousClass182.A0S("link_title", str);
            }
            String str2 = c1122254r.A02;
            if (str2 != null) {
                anonymousClass182.A0S("link_body", str2);
            }
            String str3 = c1122254r.A05;
            if (str3 != null) {
                anonymousClass182.A0S("link_url", str3);
            }
            String str4 = c1122254r.A04;
            if (str4 != null) {
                anonymousClass182.A0S("link_summary", str4);
            }
            String str5 = c1122254r.A01;
            if (str5 != null) {
                anonymousClass182.A0S("link_playable_audio_url", str5);
            }
            if (c1122254r.A06 != null) {
                C16V.A03(anonymousClass182, "link_music_preview_countries_allowed");
                for (String str6 : c1122254r.A06) {
                    if (str6 != null) {
                        anonymousClass182.A0u(str6);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        String str7 = c206409Bx.A01;
        if (str7 != null) {
            anonymousClass182.A0S("text", str7);
        }
        anonymousClass182.A0a();
    }
}
