package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IQ3 {
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.46k] */
    public static C914346k parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C103434lJ c103434lJ = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("layout".equals(A0s)) {
                    c103434lJ = AbstractC102744kB.A00(c16l);
                } else if ("payload".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            obj.A00 = c103434lJ;
            obj.A01 = str;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C914346k c914346k) {
        anonymousClass182.A0d();
        C103434lJ c103434lJ = c914346k.A00;
        if (c103434lJ != null) {
            anonymousClass182.A0r("layout");
            AbstractC102744kB.A02(anonymousClass182, c103434lJ);
        }
        String str = c914346k.A01;
        if (str != null) {
            anonymousClass182.A0S("payload", str);
        }
        anonymousClass182.A0a();
    }
}
