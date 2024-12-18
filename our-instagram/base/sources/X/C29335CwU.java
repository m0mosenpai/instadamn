package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.CwU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29335CwU implements InterfaceC31039Dkd {
    public boolean A00 = true;
    public final /* synthetic */ C0O A01;

    public C29335CwU(C0O c0o) {
        this.A01 = c0o;
    }

    @Override // X.InterfaceC31039Dkd
    public final void CvI() {
        C0O c0o = this.A01;
        FragmentActivity activity = c0o.getActivity();
        if (activity != null) {
            this.A00 = false;
            AbstractC167017dG.A0y(activity, C3DN.A00);
            c0o.A09 = false;
            AbstractC151756sL.A00().A01().A03(c0o.requireActivity(), c0o, AbstractC166987dD.A0r(((AbstractC26782Bs6) c0o).A00), "opal_nux", false);
            c0o.A0A = true;
        }
    }

    @Override // X.InterfaceC31039Dkd
    public final void DWM() {
        if (this.A00) {
            C0O.A02(this.A01);
        }
    }

    @Override // X.InterfaceC31039Dkd
    public final void Dmt() {
        C0O c0o = this.A01;
        FragmentActivity activity = c0o.getActivity();
        if (activity != null) {
            AbstractC167017dG.A0y(activity, C3DN.A00);
        }
        String str = c0o.A05;
        if (str == null) {
            str = "";
        }
        AbstractC34277F9x.A00(c0o, AbstractC166987dD.A0r(((AbstractC26782Bs6) c0o).A00), "tap", "skip", "opal_self_profile", str, null);
    }
}
