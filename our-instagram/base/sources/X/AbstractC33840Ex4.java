package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ex4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33840Ex4 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        long A00;
        int i = 0;
        int A0D = AbstractC25230BEn.A0D(c6fw.A03(0), "null cannot be cast to non-null type kotlin.Number");
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        if (AbstractC14490oL.A09(C6BQ.A04(c6fq))) {
            if (A0D == 1) {
                i = AbstractC167017dG.A0K(AbstractC31174DnI.A0m(A0W).C6d()) * 60;
            }
            return Integer.valueOf(i);
        }
        if (A0D != 0) {
            if (A0D != 1) {
                return 0;
            }
            A00 = AbstractC31175DnJ.A02(A0W);
        } else {
            A00 = new C29W(A0W).A00();
        }
        return Long.valueOf(A00);
    }
}
