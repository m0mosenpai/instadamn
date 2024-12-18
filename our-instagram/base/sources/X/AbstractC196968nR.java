package X;

import java.io.IOException;

/* renamed from: X.8nR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC196968nR {
    public static C196948nP parseFromJson(C16L c16l) {
        String A1P;
        EnumC198268pb enumC198268pb;
        C14360o3.A0B(c16l, 0);
        try {
            C196948nP c196948nP = new C196948nP();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("media_type".equals(A0q)) {
                    String A1Q = c16l.A1Q();
                    C14360o3.A0B(A1Q, 0);
                    EnumC198268pb[] values = EnumC198268pb.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            enumC198268pb = values[i];
                            if (C14360o3.A0K(enumC198268pb.A01, A1Q)) {
                                break;
                            }
                            i++;
                        } else {
                            enumC198268pb = EnumC198268pb.A06;
                            break;
                        }
                    }
                    c196948nP.A02 = enumC198268pb;
                } else if ("media_json".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c196948nP.A05 = A1P;
                } else if ("recovery_count".equals(A0q)) {
                    c196948nP.A00 = c16l.A1D();
                } else if ("date_taken".equals(A0q)) {
                    c196948nP.A01 = c16l.A0y();
                }
                c16l.A0z();
            }
            String str = c196948nP.A05;
            if (str != null) {
                try {
                    EnumC198268pb enumC198268pb2 = c196948nP.A02;
                    if (enumC198268pb2 != null) {
                        int ordinal = enumC198268pb2.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                c196948nP.A04 = C9NR.parseFromJson(C16V.A00(str));
                                return c196948nP;
                            }
                            return c196948nP;
                        }
                        c196948nP.A03 = AbstractC196958nQ.parseFromJson(C16V.A00(str));
                        return c196948nP;
                    }
                    return c196948nP;
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to parse media in postprocess. mediaType: ");
                    sb.append(c196948nP.A02);
                    C196948nP.A00(e, sb.toString());
                    return c196948nP;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Null mediaJson in postprocess. mediaType: ");
            sb2.append(c196948nP.A02);
            throw new IllegalArgumentException(sb2.toString());
        } catch (IOException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new IOException(e3);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C196948nP c196948nP) {
        anonymousClass182.A0d();
        EnumC198268pb enumC198268pb = c196948nP.A02;
        if (enumC198268pb != null) {
            anonymousClass182.A0S("media_type", enumC198268pb.A01);
        }
        String str = c196948nP.A05;
        if (str != null) {
            anonymousClass182.A0S("media_json", str);
        }
        anonymousClass182.A0Q("recovery_count", c196948nP.A00);
        anonymousClass182.A0R("date_taken", c196948nP.A01);
        anonymousClass182.A0a();
    }
}
