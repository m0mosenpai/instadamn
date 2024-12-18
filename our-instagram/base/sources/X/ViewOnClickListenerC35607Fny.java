package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.save.model.SavedCollection;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Fny, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35607Fny implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    public ViewOnClickListenerC35607Fny(Object obj, int i, Object obj2, int i2, int i3) {
        this.A00 = i3;
        this.A04 = obj2;
        this.A03 = obj;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1378375758);
                DirectShareTarget directShareTarget = (DirectShareTarget) this.A04;
                GWZ gwz = (GWZ) this.A03;
                G2V g2v = (G2V) gwz;
                g2v.A01.A0K(directShareTarget, 6, this.A01, this.A02, g2v.A00);
                i = 82509500;
                break;
            case 1:
                ((InterfaceC58311Pt3) this.A03).DRz((C5HW) this.A04, this.A01, this.A02);
                return;
            case 2:
                A05 = C0f9.A05(-934760745);
                ((ENX) this.A04).A03((SavedCollection) this.A03, this.A02, this.A01);
                i = -1446974886;
                break;
            default:
                IKB ikb = (IKB) this.A03;
                int i2 = this.A01;
                InterfaceC41201vU interfaceC41201vU = (InterfaceC41201vU) this.A04;
                int i3 = this.A02;
                ReelDashboardFragment reelDashboardFragment = ikb.A06;
                if (i2 > 0 && reelDashboardFragment != null && (interfaceC41201vU instanceof C41181vS)) {
                    C41181vS c41181vS = (C41181vS) interfaceC41201vU;
                    C140966Yy A0r = AbstractC25225BEi.A0r(reelDashboardFragment.requireActivity(), reelDashboardFragment.A06);
                    A0r.A0E(ITS.A00(c41181vS.A0k, c41181vS.A0j, i3));
                    A0r.A04();
                    return;
                }
                return;
        }
        C0f9.A0C(i, A05);
    }
}
