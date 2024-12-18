package X;

/* renamed from: X.0tq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17550tq {
    public static C17530to parseFromJson(C16L c16l) {
        return (C17530to) C16V.A01(c16l, new C1EH() { // from class: X.0tp
            @Override // X.C1EH
            public final /* bridge */ /* synthetic */ Object invoke(C16L c16l2) {
                C17530to c17530to = new C17530to();
                if (c16l2.A11() != C16R.A0D) {
                    c16l2.A0z();
                    return null;
                }
                while (c16l2.A1J() != C16R.A09) {
                    String A0q = c16l2.A0q();
                    c16l2.A1J();
                    String str = null;
                    if ("media_id".equals(A0q)) {
                        if (c16l2.A11() != C16R.A0G) {
                            str = c16l2.A1P();
                        }
                        c17530to.A05 = str;
                    } else if ("version".equals(A0q)) {
                        c17530to.A01 = c16l2.A1D();
                    } else if ("media_pct".equals(A0q)) {
                        c17530to.A00 = (float) c16l2.A0U();
                    } else if ("time_info".equals(A0q)) {
                        c17530to.A02 = AbstractC17660u1.parseFromJson(c16l2);
                    } else if ("was_share_tapped".equals(A0q)) {
                        c17530to.A08 = c16l2.A0d();
                    } else if ("client_position".equals(A0q)) {
                        c17530to.A03 = Integer.valueOf(c16l2.A1D());
                    } else if ("author_id".equals(A0q)) {
                        if (c16l2.A11() != C16R.A0G) {
                            str = c16l2.A1P();
                        }
                        c17530to.A04 = str;
                    } else if ("product_type".equals(A0q)) {
                        if (c16l2.A11() != C16R.A0G) {
                            str = c16l2.A1P();
                        }
                        c17530to.A06 = str;
                    }
                    c16l2.A0z();
                }
                return c17530to;
            }
        });
    }

    public static void A00(AnonymousClass182 anonymousClass182, C17530to c17530to) {
        anonymousClass182.A0d();
        String str = c17530to.A05;
        if (str != null) {
            anonymousClass182.A0S("media_id", str);
        }
        anonymousClass182.A0Q("version", c17530to.A01);
        anonymousClass182.A0P("media_pct", c17530to.A00);
        if (c17530to.A02 != null) {
            anonymousClass182.A0r("time_info");
            C17640tz c17640tz = c17530to.A02;
            anonymousClass182.A0d();
            C17630ty c17630ty = c17640tz.A05;
            C0JO c0jo = c17640tz.A04;
            anonymousClass182.A0R("10", Math.max(c17630ty.A00(c0jo.now()), c17640tz.A00));
            anonymousClass182.A0R("25", Math.max(c17640tz.A06.A00(c0jo.now()), c17640tz.A01));
            anonymousClass182.A0R("50", c17640tz.A01());
            anonymousClass182.A0R("75", Math.max(c17640tz.A08.A00(c0jo.now()), c17640tz.A03));
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("was_share_tapped", c17530to.A08);
        Integer num = c17530to.A03;
        if (num != null) {
            anonymousClass182.A0Q("client_position", num.intValue());
        }
        String str2 = c17530to.A04;
        if (str2 != null) {
            anonymousClass182.A0S("author_id", str2);
        }
        String str3 = c17530to.A06;
        if (str3 != null) {
            anonymousClass182.A0S("product_type", str3);
        }
        anonymousClass182.A0a();
    }
}
