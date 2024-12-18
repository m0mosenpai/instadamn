package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HYF extends C4A7 {
    public final C92694De A00;
    public final UserSession A01;
    public final CPI A02;
    public final Map A03;
    public final Map A04;

    public final void A00(Context context, InterfaceC11380iw interfaceC11380iw, EnumC77173d3 enumC77173d3, String str) {
        C14360o3.A0B(enumC77173d3, 3);
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A01;
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        if (A0h != null) {
            EnumC77173d3 enumC77173d32 = EnumC77173d3.A02;
            if (enumC77173d3 == enumC77173d32) {
                enumC77173d32 = EnumC77173d3.A03;
            }
            C57532kS.A00(userSession).A0M(interfaceC11380iw, enumC77173d32, A0h, AbstractC15820qc.A07(), null, false);
            C14360o3.A0B(userSession, 4);
            I0H.A00(userSession, C57532kS.A00(userSession).A0L(A0h), enumC77173d32, A0h);
            C1ON A00 = AbstractC41706Idc.A00(context, userSession, enumC77173d32, A0h, null, null, null, -1, -1, null, null, interfaceC11380iw.getModuleName(), null, null, false, false);
            A00.A00 = new HG2(0, null, A0h, userSession, null);
            C1GJ.A03(A00);
        }
    }

    public HYF(UserSession userSession, CPI cpi) {
        super("Chains", C4A8.A00(274450118));
        this.A02 = cpi;
        this.A01 = userSession;
        this.A03 = AbstractC166987dD.A1G();
        this.A00 = AbstractC166177bl.A00(C92674Dc.A00);
        this.A04 = AbstractC166987dD.A1G();
    }
}
