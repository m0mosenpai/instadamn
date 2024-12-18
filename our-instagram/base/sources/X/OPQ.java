package X;

import java.io.IOException;

/* loaded from: classes9.dex */
public final class OPQ {
    public static N3E parseFromJson(C16L c16l) {
        EnumC53192Nfo enumC53192Nfo;
        Integer num;
        String str;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            N3E n3e = new N3E();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_offensive".equals(A0s)) {
                    n3e.A04 = c16l.A0d();
                } else if (!"bully_classifier".equals(A0s) && !"hate_classifier".equals(A0s) && !"sexual_classifier".equals(A0s) && !"spam_classifier".equals(A0s)) {
                    if ("minimum_next_timestamp".equals(A0s)) {
                        n3e.A00 = c16l.A0y();
                    } else if ("text_language".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                            A1P = null;
                        } else {
                            A1P = c16l.A1P();
                        }
                        C14360o3.A0B(A1P, 0);
                        n3e.A03 = A1P;
                    } else if ("tiered_level".equals(A0s)) {
                        String A1Q = c16l.A1Q();
                        Integer[] A00 = C05F.A00(2);
                        int length = A00.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                num = A00[i];
                                if (1 - num.intValue() != 0) {
                                    str = "LEVEL_1";
                                } else {
                                    str = "LEVEL_2";
                                }
                                if (str.equals(A1Q)) {
                                    break;
                                }
                                i++;
                            } else {
                                num = null;
                                break;
                            }
                        }
                        n3e.A02 = num;
                    } else if ("warning_type".equals(A0s)) {
                        String A1Q2 = c16l.A1Q();
                        EnumC53192Nfo[] values = EnumC53192Nfo.values();
                        int length2 = values.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length2) {
                                enumC53192Nfo = values[i2];
                                if (C14360o3.A0K(enumC53192Nfo.A00, A1Q2)) {
                                    break;
                                }
                                i2++;
                            } else {
                                enumC53192Nfo = null;
                                break;
                            }
                        }
                        n3e.A01 = enumC53192Nfo;
                    } else {
                        C55702hA.A01(c16l, n3e, A0s);
                    }
                } else {
                    c16l.A0U();
                }
                c16l.A0z();
            }
            return n3e;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
