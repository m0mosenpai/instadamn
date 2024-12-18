package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I0K {
    public static C26215Bif parseFromJson(C16L c16l) {
        String A00;
        String A002;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            ArrayList arrayList = null;
            Long l = null;
            ArrayList arrayList2 = null;
            H4C h4c = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(271);
                A002 = AbstractC111324zv.A00(72);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("audience".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC111324zv.A00(195).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("expiring_at".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("media_count".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if (A002.equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1J(c16l, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (AbstractC43591JPw.A00(50).equals(A0s)) {
                    h4c = IOY.parseFromJson(c16l);
                } else {
                    num3 = AbstractC31178DnM.A0V(c16l, num3, A0s, A00);
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("audience", c16l, "PotatoContainerMediaInfoImpl");
            } else if (num2 != null || !(c16l instanceof C07950bF)) {
                if (arrayList2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A002, c16l, "PotatoContainerMediaInfoImpl");
                } else if (num3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "PotatoContainerMediaInfoImpl");
                } else {
                    return new C26215Bif(h4c, l, arrayList, arrayList2, num.intValue(), num2.intValue(), num3.intValue());
                }
            } else {
                AbstractC166997dE.A1V("media_count", c16l, "PotatoContainerMediaInfoImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
