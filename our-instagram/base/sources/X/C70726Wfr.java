package X;

import android.animation.LayoutTransition;
import android.view.View;

/* renamed from: X.Wfr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70726Wfr implements InterfaceC41501vz {
    public final /* synthetic */ C84923qg A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ InterfaceC144776fx A02;
    public final /* synthetic */ C144466fS A03;

    public C70726Wfr(C84923qg c84923qg, C41181vS c41181vS, InterfaceC144776fx interfaceC144776fx, C144466fS c144466fS) {
        this.A01 = c41181vS;
        this.A03 = c144466fS;
        this.A00 = c84923qg;
        this.A02 = interfaceC144776fx;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(286702064);
        C72243Lx c72243Lx = (C72243Lx) obj;
        int A032 = C0f9.A03(1953949492);
        C14360o3.A0B(c72243Lx, 0);
        C38321qM c38321qM = c72243Lx.A01;
        if (c38321qM != null) {
            C41181vS c41181vS = this.A01;
            if (c38321qM.equals(c41181vS.A0b)) {
                C144466fS c144466fS = this.A03;
                C84923qg c84923qg = this.A00;
                InterfaceC144776fx interfaceC144776fx = this.A02;
                boolean z = c72243Lx.A04;
                if (c144466fS.A04) {
                    c144466fS.A04 = false;
                    if (z) {
                        interfaceC144776fx.D27();
                    }
                    LayoutTransition layoutTransition = c144466fS.A06.getLayoutTransition();
                    layoutTransition.addTransitionListener(new C70204WGx(layoutTransition));
                    layoutTransition.enableTransitionType(4);
                    C144466fS.A01(c84923qg, c41181vS, c144466fS);
                    AbstractC125325le.A07(new View[]{c144466fS.A05}, true);
                }
            }
        }
        C0f9.A0A(964652186, A032);
        C0f9.A0A(2121982818, A03);
    }
}
