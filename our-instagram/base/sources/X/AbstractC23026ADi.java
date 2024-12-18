package X;

import java.io.IOException;

/* renamed from: X.ADi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23026ADi {
    public static C9ZT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            Float f = null;
            String str = null;
            C211729Zg c211729Zg = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("sfx_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("sfx_audio".equals(A0s)) {
                    c211729Zg = AbstractC226889zk.parseFromJson(c16l);
                } else if ("start_time_ms".equals(A0s)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("volume".equals(A0s)) {
                    f = AbstractC167007dF.A0b(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("sfx_name", c16l, "ClipsSoundEffect");
            } else if (c211729Zg != null || !(c16l instanceof C07950bF)) {
                if (l == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("start_time_ms", c16l, "ClipsSoundEffect");
                } else if (f == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("volume", c16l, "ClipsSoundEffect");
                } else {
                    return new C9ZT(c211729Zg, str, f.floatValue(), l.longValue());
                }
            } else {
                AbstractC166997dE.A1V("sfx_audio", c16l, "ClipsSoundEffect");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C9ZT c9zt) {
        anonymousClass182.A0d();
        String str = c9zt.A03;
        if (str != null) {
            anonymousClass182.A0S("sfx_name", str);
        }
        C211729Zg c211729Zg = c9zt.A02;
        if (c211729Zg != null) {
            anonymousClass182.A0r("sfx_audio");
            anonymousClass182.A0d();
            String str2 = c211729Zg.A04;
            if (str2 != null) {
                anonymousClass182.A0S("file_path", str2);
            }
            anonymousClass182.A0Q("duration_ms", c211729Zg.A01);
            String str3 = c211729Zg.A02;
            if (str3 != null) {
                anonymousClass182.A0S("audio_asset_id", str3);
            }
            String str4 = c211729Zg.A03;
            if (str4 != null) {
                anonymousClass182.A0S("audio_cluster_id", str4);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0R("start_time_ms", c9zt.A01);
        anonymousClass182.A0P("volume", c9zt.A00);
        anonymousClass182.A0a();
    }
}
