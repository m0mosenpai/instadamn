package X;

import java.io.IOException;

/* renamed from: X.FcL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35048FcL {
    public static EBK parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            EBK ebk = new EBK();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                A00(c16l, ebk, AbstractC166997dE.A0s(c16l));
                c16l.A0z();
            }
            return ebk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C16L c16l, EBK ebk, String str) {
        String A1P;
        if ("error_message_header".equals(str)) {
            if (c16l.A11() == C16R.A0G) {
                A1P = null;
            } else {
                A1P = c16l.A1P();
            }
            ebk.A00 = A1P;
            return;
        }
        C55702hA.A01(c16l, ebk, str);
    }
}
