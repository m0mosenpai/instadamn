package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OJ6 {
    public final InterfaceC58202Pr8 A00;
    public final C23031Ai A01;
    public final C28179CbR A02;
    public final UserSession A03;

    public OJ6(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = AbstractC23021Ah.A00(userSession);
        this.A02 = new C28179CbR(userSession);
        InterfaceC58202Pr8 A00 = AbstractC54314NzY.A00(userSession);
        C14360o3.A07(A00);
        this.A00 = A00;
    }

    public final void A00(Context context, String str, String str2, int i) {
        Drawable drawable;
        C14360o3.A0B(str2, 3);
        C23031Ai c23031Ai = this.A01;
        InterfaceC16530ry interfaceC16530ry = c23031Ai.A4G;
        C0YR[] c0yrArr = C23031Ai.A8c;
        if (!AbstractC167017dG.A1b(c23031Ai, interfaceC16530ry, c0yrArr, 51) && str != null && (drawable = context.getDrawable(R.drawable.riffs_qp_riffs_qp)) != null) {
            boolean A1X = AbstractC167007dF.A1X(C17060sy.A01.A01(this.A03).A0M(), C05F.A0C);
            C54844OMp c54844OMp = new C54844OMp(context);
            InterfaceC58202Pr8 interfaceC58202Pr8 = this.A00;
            c54844OMp.A07 = AbstractC166997dE.A0p(context, interfaceC58202Pr8.AZf());
            c54844OMp.A05 = AbstractC166997dE.A0p(context, interfaceC58202Pr8.AZe(A1X));
            c54844OMp.A04(drawable);
            c54844OMp.A06 = C05F.A01;
            c54844OMp.A02(new Og4(this, str, str2, i, 4), AbstractC166997dE.A0p(context, 2131955881));
            c54844OMp.A03(new Og8(context, this, str, str2, i), AbstractC166997dE.A0p(context, 2131965052));
            c54844OMp.A0B = true;
            c54844OMp.A01();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02.A00, AbstractC111324zv.A00(448));
            Long A00 = C28179CbR.A00(str);
            if (A0f.isSampled() && A00 != null) {
                A0f.AAP("containermodule", "add_spin_nux");
                AbstractC37300Gc1.A0h(A0f, A00);
                AbstractC25229BEm.A19(A0f, i);
                AbstractC25225BEi.A1P(A0f, str2);
                AbstractC37300Gc1.A0e(BQL.A1E, A0f);
                AbstractC25225BEi.A1M(EnumC120795dP.A0E, A0f);
                AbstractC167017dG.A1C(A0f);
            }
            AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, 51, true);
        }
    }
}
