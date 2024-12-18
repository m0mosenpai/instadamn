package X;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.PHp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56772PHp implements InterfaceC86363t8 {
    public final int A00;
    public final Object A01;

    public C56772PHp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void CwQ(float f) {
        switch (this.A00) {
            case 1:
                C45487KCc.A02((C45487KCc) this.A01);
                return;
            case 2:
            default:
                return;
            case 3:
                InterfaceC145226gh interfaceC145226gh = ((C50674MYs) this.A01).A03;
                if (interfaceC145226gh == null) {
                    return;
                }
                interfaceC145226gh.Cul();
                return;
        }
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void D5o() {
    }

    @Override // X.InterfaceC86363t8
    public final void DB6() {
        switch (this.A00) {
            case 0:
                ((Runnable) this.A01).run();
                return;
            case 1:
            default:
                return;
            case 2:
                AbstractC43592JPx.A19(-1, (InterfaceC16660sJ) this.A01);
                return;
        }
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void DId(Integer num) {
        RecyclerView recyclerView;
        FragmentActivity fragmentActivity;
        switch (this.A00) {
            case 4:
                C52108N4g c52108N4g = (C52108N4g) this.A01;
                if (!c52108N4g.isResumed() || (recyclerView = c52108N4g.A04) == null || recyclerView.canScrollVertically(1)) {
                    return;
                }
                ((UFL) c52108N4g.A07.getValue()).A00();
                return;
            case 5:
                C14360o3.A0B(num, 0);
                C3DO c3do = C3DN.A00;
                C189478aR c189478aR = ((OwC) this.A01).A01;
                if (c189478aR != null) {
                    fragmentActivity = c189478aR.A03.getActivity();
                } else {
                    fragmentActivity = null;
                }
                C3DN A00 = c3do.A00(fragmentActivity);
                if (A00 == null) {
                    return;
                }
                ((C3DP) A00).A0N = true;
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void DZk(int i, int i2) {
        if (2 - this.A00 == 0) {
            AbstractC43592JPx.A19(i, (InterfaceC16660sJ) this.A01);
        }
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void CwR(Integer num, float f) {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void D5p(Integer num) {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void Dyj(C51752Mtb c51752Mtb) {
    }
}
