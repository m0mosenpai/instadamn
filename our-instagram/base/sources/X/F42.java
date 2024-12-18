package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F42 {
    public static C51752Mtb parseFromJson(C16L c16l) {
        String A00;
        String A002;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(5299);
                A002 = AbstractC111324zv.A00(5300);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if (A002.equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (A00.equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else {
                    num3 = AbstractC31178DnM.A0V(c16l, num3, A0s, "reaction");
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A002, c16l, "DirectBotMessageMetadata.SentimentData");
            } else if (num2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "DirectBotMessageMetadata.SentimentData");
            } else {
                return new C51752Mtb((Object) num3, num.intValue(), num2.intValue(), 8);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
