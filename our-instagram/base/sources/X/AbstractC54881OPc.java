package X;

import java.io.IOException;

/* renamed from: X.OPc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54881OPc {
    public static C51757Mtg parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C51757Mtg c51757Mtg = new C51757Mtg(22);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c51757Mtg.A02 = A1P;
                } else if ("start".equals(A0s)) {
                    c51757Mtg.A01 = AbstractC166997dE.A0h(c16l);
                } else if ("end".equals(A0s)) {
                    c51757Mtg.A00 = AbstractC166997dE.A0h(c16l);
                }
                c16l.A0z();
            }
            return c51757Mtg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C51757Mtg c51757Mtg, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        String str = c51757Mtg.A02;
        if (str != null) {
            anonymousClass182.A0S("text", str);
        }
        Number number = (Number) c51757Mtg.A01;
        if (number != null) {
            anonymousClass182.A0Q("start", number.intValue());
        }
        Number number2 = (Number) c51757Mtg.A00;
        if (number2 != null) {
            anonymousClass182.A0Q("end", number2.intValue());
        }
        anonymousClass182.A0a();
    }
}
