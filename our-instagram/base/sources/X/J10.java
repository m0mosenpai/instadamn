package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;

/* loaded from: classes7.dex */
public final class J10 implements InterfaceC1571373s {
    public final int A00;
    public final Object A01;

    public J10(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC1571373s
    public final void DDQ() {
    }

    @Override // X.InterfaceC1571373s
    public final void DDR() {
        switch (this.A00) {
            case 0:
                RecentAdActivityFragment recentAdActivityFragment = (RecentAdActivityFragment) this.A01;
                AbstractC906141w.A01(recentAdActivityFragment.requireActivity(), AbstractC166987dD.A0r(recentAdActivityFragment.A0E));
                return;
            case 1:
                HDJ hdj = (HDJ) this.A01;
                FragmentActivity activity = hdj.getActivity();
                if (activity == null) {
                    return;
                }
                C140966Yy A0r = AbstractC25225BEi.A0r(activity, hdj.A03);
                A0r.A0E(FBR.A00(EnumC72365Xc1.A0M, null));
                A0r.A04();
                return;
            case 2:
                ((C38288GsX) this.A01).A0S.CJ0();
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC1571373s
    public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
    }
}
