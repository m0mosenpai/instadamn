package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import java.util.Collection;
import java.util.List;

/* renamed from: X.GiS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37691GiS implements C32O {
    public final Context A00;
    public final UserSession A01;
    public final String A02;

    @Override // X.C32O
    public final void D3D() {
    }

    @Override // X.C32O
    public final void DyU(Collection collection, int i) {
    }

    public C37691GiS(UserSession userSession, Context context, String str) {
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = str;
    }

    @Override // X.C32O
    public final /* bridge */ /* synthetic */ void D7b(Object obj, List list, int i) {
        InterfaceC104804nl interfaceC104804nl;
        IgShowreelComposition Bx5;
        C120985dq A0G = AbstractC37302Gc3.A0G(obj);
        EnumC129395t1 enumC129395t1 = A0G.A01;
        if (AbstractC37647Ghg.A01(enumC129395t1) && A0G.A06().A08()) {
            UserSession userSession = this.A01;
            Context context = this.A00;
            EnumC140736Yb enumC140736Yb = EnumC140736Yb.A05;
            InterfaceC104804nl interfaceC104804nl2 = A0G.A06().A06;
            if (interfaceC104804nl2 == null) {
                interfaceC104804nl2 = new C52r(null, null);
            }
            IgShowreelNativeAnimationIntf Bx7 = interfaceC104804nl2.Bx7();
            if (Bx7 != null) {
                C14120nc.A00().ATO(new HJW(context, userSession, new C139366Sr(AbstractC25226BEj.A1E(A0G), A0G.BzL(userSession)), Bx7, enumC140736Yb));
                return;
            }
            throw AbstractC166987dD.A14(AbstractC111324zv.A00(857));
        }
        if (!AbstractC37647Ghg.A01(enumC129395t1) || !A0G.A06().A07() || (interfaceC104804nl = A0G.A06().A06) == null || (Bx5 = interfaceC104804nl.Bx5()) == null) {
            return;
        }
        C6V4.A00(this.A01).A01(Bx5.Aqq(), this.A02, Bx5.Acz());
    }
}
