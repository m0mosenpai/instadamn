package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.IMj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41220IMj {
    public final UserSession A00;
    public final InterfaceC09390do A01;

    public C41220IMj(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = J8V.A00(this, 3);
    }

    public final void A00(Context context, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, String str, boolean z) {
        C14360o3.A0B(abstractC018607g, 2);
        InterfaceC09390do interfaceC09390do = this.A01;
        Object A02 = ((C2GT) interfaceC09390do.getValue()).A02();
        C2GT c2gt = (C2GT) interfaceC09390do.getValue();
        Boolean valueOf = Boolean.valueOf(z);
        c2gt.A0B(valueOf);
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A00;
        c08730cb.A01(userSession).A03.EQ6(valueOf);
        C57264Pbm c57264Pbm = new C57264Pbm(this, interfaceC11380iw, str, 3, z);
        C43208J8f A00 = C43208J8f.A00(A02, this, 31);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("commerce/shopping_auto_highlight/update/");
        A0c.A0I("enable_auto_highlight", z);
        C1ON A0Q = AbstractC31177DnL.A0Q(A0c);
        C37484Gf2.A00(A0Q, A00, c57264Pbm, 16);
        C1GJ.A00(context, abstractC018607g, A0Q);
    }

    public final void A01(Context context, AbstractC018607g abstractC018607g, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(abstractC018607g, 1);
        UserSession userSession = this.A00;
        C43361JEc A01 = C43361JEc.A01(interfaceC16660sJ, 23);
        C1ON c1on = AbstractC1571873x.A05(context, userSession, null, null, null, C05F.A0Y, null, userSession.userId, false).A00;
        C37460Gee.A00(c1on, interfaceC16820sZ, userSession, A01, 9);
        C1GJ.A00(context, abstractC018607g, c1on);
    }
}
