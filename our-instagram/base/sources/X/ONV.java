package X;

import com.instagram.api.schemas.LimitedInteractionsVersions;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class ONV {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.N2V, X.1um, X.1ul] */
    public static N2V parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_enabled".equals(A0s)) {
                    c40791um.A04 = AbstractC166997dE.A0d(c16l);
                } else if ("limited_categories".equals(A0s)) {
                    c40791um.A00 = AbstractC53778NqU.parseFromJson(c16l);
                } else if ("limited_features".equals(A0s)) {
                    c40791um.A01 = AbstractC53779NqV.parseFromJson(c16l);
                } else if ("reminder_date".equals(A0s)) {
                    c40791um.A05 = AbstractC31173DnH.A0h(c16l);
                } else if ("start_date".equals(A0s)) {
                    c40791um.A06 = AbstractC31173DnH.A0h(c16l);
                } else if ("version".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    LimitedInteractionsVersions limitedInteractionsVersions = (LimitedInteractionsVersions) LimitedInteractionsVersions.A01.get(A1P);
                    if (limitedInteractionsVersions == null) {
                        limitedInteractionsVersions = LimitedInteractionsVersions.A04;
                    }
                    c40791um.A03 = limitedInteractionsVersions;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            Boolean bool = c40791um.A04;
            C124545kG c124545kG = c40791um.A00;
            C51788Mus c51788Mus = c40791um.A01;
            C14360o3.A0A(c51788Mus);
            Long l = c40791um.A05;
            Long l2 = c40791um.A06;
            LimitedInteractionsVersions limitedInteractionsVersions2 = c40791um.A03;
            C14360o3.A0A(limitedInteractionsVersions2);
            c40791um.A02 = new C51789Mut(c124545kG, c51788Mus, limitedInteractionsVersions2, bool, l, l2);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}