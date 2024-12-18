package X;

import android.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;

/* renamed from: X.7XR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7XR implements C7XS {
    public final AbstractC59962oe A00;
    public final InterfaceC1119153d A01;
    public final C7XU A02;
    public final InterfaceC08830cm A03;

    public C7XR(AbstractC59962oe abstractC59962oe, InterfaceC08830cm interfaceC08830cm) {
        C14360o3.A0B(abstractC59962oe, 1);
        this.A00 = abstractC59962oe;
        this.A03 = interfaceC08830cm;
        this.A02 = new C7XU() { // from class: X.7XT
            @Override // X.C7XU
            public final void DB3() {
            }

            @Override // X.C7XU
            public final void DAy() {
                C7XR.this.D01();
            }
        };
        this.A01 = new InterfaceC1119153d() { // from class: X.7XV
            @Override // X.InterfaceC1119153d
            public final void D00() {
            }

            @Override // X.InterfaceC1119153d
            public final void Czx() {
                C7XR.this.D01();
            }
        };
    }

    @Override // X.C7XS
    public final void Czt() {
        FragmentActivity activity;
        AbstractC59962oe abstractC59962oe = this.A00;
        if (abstractC59962oe.isAdded() && (activity = abstractC59962oe.getActivity()) != null && !activity.isFinishing()) {
            C30D.A04(abstractC59962oe.requireActivity(), C3WR.A01(new ContextThemeWrapper(abstractC59962oe.requireContext(), ((C7IM) this.A03.get()).A07.A0E), R.attr.backgroundColorSecondary));
        }
    }

    @Override // X.C7XS
    public final void D01() {
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            C3DN A00 = C3DN.A00.A00(activity);
            if (A00 != null && ((C3DP) A00).A0h) {
                return;
            }
            C30D.A04(activity, activity.getColor(R.color.igds_transparent_navigation_bar));
            AbstractC56402iY.A02(activity, activity.getColor(R.color.fds_transparent));
        }
    }

    @Override // X.C7XS
    public final void D0E() {
        FragmentActivity activity;
        AbstractC59962oe abstractC59962oe = this.A00;
        if (abstractC59962oe.isAdded() && (activity = abstractC59962oe.getActivity()) != null && !activity.isFinishing()) {
            C30D.A04(abstractC59962oe.requireActivity(), ((C7IM) this.A03.get()).A07.A09);
        }
    }
}
