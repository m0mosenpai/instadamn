package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class OL2 {
    public final Context A00;
    public final C55099ObA A01;
    public final OKX A02;
    public final UserSession A03;
    public final AnonymousClass841 A04;
    public final InterfaceC58083Pp8 A05;
    public final boolean A06;

    public final void A00() {
        C55099ObA c55099ObA = this.A01;
        if (c55099ObA.A05()) {
            View view = c55099ObA.A01;
            if (view != null) {
                view.setAlpha(1.0f);
                Ok3.A00(c55099ObA.A01, 51, c55099ObA);
            }
            EnumC53230NgS enumC53230NgS = EnumC53230NgS.A04;
            UserSession userSession = this.A03;
            AnonymousClass841 anonymousClass841 = this.A04;
            ArrayList A01 = AbstractC55225Oes.A01(userSession, anonymousClass841, enumC53230NgS);
            if (this.A06 && AbstractC55229Oez.A01(userSession, anonymousClass841) == 0 && (!A01.isEmpty())) {
                this.A05.Dlv(true, A01.size());
                this.A02.A01(A01);
                c55099ObA.A03(true);
            } else {
                this.A05.Dlv(false, 0);
                this.A02.A01(C16930sl.A00);
                c55099ObA.A02();
            }
        }
    }

    public final void A01() {
        C55099ObA c55099ObA = this.A01;
        View view = c55099ObA.A01;
        if (view != null) {
            if (c55099ObA.A05()) {
                view.setVisibility(0);
                OJZ ojz = c55099ObA.A0C;
                if (ojz != null) {
                    ojz.A00(view);
                    return;
                }
                return;
            }
            view.setVisibility(8);
            return;
        }
        C0w9.A03("ProductTagRowControllerImpl", "maybeShow called before setRootView");
    }

    public OL2(Context context, UserSession userSession, AnonymousClass840 anonymousClass840, C55099ObA c55099ObA, InterfaceC58083Pp8 interfaceC58083Pp8, boolean z) {
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = c55099ObA;
        this.A05 = interfaceC58083Pp8;
        this.A06 = z;
        this.A02 = new OKX(interfaceC58083Pp8, z);
        this.A04 = anonymousClass840.A00();
    }
}
