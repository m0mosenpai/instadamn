package X;

/* renamed from: X.Ewx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33833Ewx {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, MSV.A00(10));
        C102884kP c102884kP = (C102884kP) A00;
        C102884kP A08 = c102884kP.A08(40);
        if (A08 != null) {
            AHE ahe = null;
            String str = "";
            String A0H = c102884kP.A0H();
            if (A0H != null) {
                str = A0H;
            }
            String A0G = c102884kP.A0G();
            AHE A002 = FDI.A00(A08);
            String A0J = c102884kP.A0J();
            int A03 = c102884kP.A03(35, 0);
            C102884kP A082 = c102884kP.A08(38);
            if (A082 != null) {
                ahe = FDI.A00(A082);
            }
            C25671My A003 = AbstractC25651Mw.A00(C6BQ.A0B(c6fq));
            Object A032 = c6fw.A03(0);
            A003.E4s(new C8P9(new C1816383s(null, ahe, A002, A0J, AbstractC31175DnJ.A0Z(c6fw, AbstractC31171DnF.A0f(A032)), A0G, (String) A032, "", str, A03)));
            return null;
        }
        throw AbstractC166987dD.A12("Requires valid creator model");
    }
}
