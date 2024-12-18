package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F5A {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.G5q, java.lang.Object] */
    public static C36441G5q parseFromJson(C16L c16l) {
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("thread".equals(A0s)) {
                    obj.A00 = JV4.parseFromJson(c16l);
                } else if (AbstractC31171DnF.A1Z(A0s)) {
                    obj.A01 = AbstractC31171DnF.A0S(c16l, false);
                }
                c16l.A0z();
            }
            if (obj.A00 != null) {
                num = C05F.A00;
            } else if (obj.A01 != null) {
                num = C05F.A01;
            } else {
                C0w9.A03("Invalid DirectShareSheetRecipientType", "DirectShareSheetRecipientType is neither thread nor user");
                return obj;
            }
            obj.A02 = num;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
