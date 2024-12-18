package X;

import java.io.IOException;

/* renamed from: X.I7o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40838I7o {
    public static C51759Mti parseFromJson(C16L c16l) {
        String A1P;
        EnumC39567Hdd enumC39567Hdd;
        C14360o3.A0B(c16l, 0);
        try {
            C51759Mti c51759Mti = new C51759Mti(11);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("broadcast".equals(A0s)) {
                    c51759Mti.A00 = C41655Ibn.parseFromJson(c16l);
                } else if (MSV.A00(992).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    EnumC39567Hdd[] values = EnumC39567Hdd.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            enumC39567Hdd = values[i];
                            if (C14360o3.A0K(A1P, enumC39567Hdd.A00)) {
                                break;
                            }
                            i++;
                        } else {
                            enumC39567Hdd = EnumC39567Hdd.A06;
                            break;
                        }
                    }
                    c51759Mti.A01 = enumC39567Hdd;
                }
                c16l.A0z();
            }
            return c51759Mti;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
