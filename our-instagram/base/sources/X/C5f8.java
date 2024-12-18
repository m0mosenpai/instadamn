package X;

import java.io.IOException;

/* renamed from: X.5f8, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5f8 {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.5f9] */
    public static C5f9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if ("l".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A01 = str;
                } else if ("ui".equals(A0q)) {
                    obj.A00 = Long.valueOf(c16l.A0y());
                } else if ("pjid".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A07 = str;
                } else if ("nid".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A02 = str;
                } else if ("tid".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A08 = str;
                } else if ("hcs".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A04 = str;
                } else if ("hek".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A05 = str;
                } else if ("hki".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A06 = str;
                } else if ("ca".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A03 = str;
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C5f9 c5f9) {
        anonymousClass182.A0d();
        String str = c5f9.A01;
        if (str != null) {
            anonymousClass182.A0S("l", str);
        }
        Long l = c5f9.A00;
        if (l != null) {
            anonymousClass182.A0R("ui", l.longValue());
        }
        String str2 = c5f9.A07;
        if (str2 != null) {
            anonymousClass182.A0S("pjid", str2);
        }
        String str3 = c5f9.A02;
        if (str3 != null) {
            anonymousClass182.A0S("nid", str3);
        }
        String str4 = c5f9.A08;
        if (str4 != null) {
            anonymousClass182.A0S("tid", str4);
        }
        String str5 = c5f9.A04;
        if (str5 != null) {
            anonymousClass182.A0S("hcs", str5);
        }
        String str6 = c5f9.A05;
        if (str6 != null) {
            anonymousClass182.A0S("hek", str6);
        }
        String str7 = c5f9.A06;
        if (str7 != null) {
            anonymousClass182.A0S("hki", str7);
        }
        String str8 = c5f9.A03;
        if (str8 != null) {
            anonymousClass182.A0S("ca", str8);
        }
        anonymousClass182.A0a();
    }
}
