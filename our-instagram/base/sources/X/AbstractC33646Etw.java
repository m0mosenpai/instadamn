package X;

import java.io.IOException;

/* renamed from: X.Etw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33646Etw {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.FEf] */
    public static C34389FEf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC43591JPw.A00(464).equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("authorization_header".equals(A0s)) {
                    obj.A00 = AbstractC33645Etv.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
