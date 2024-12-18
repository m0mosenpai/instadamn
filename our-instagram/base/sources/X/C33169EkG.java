package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.EkG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33169EkG extends AbstractC86353t7 {
    public final /* synthetic */ C79853ha A00;
    public final /* synthetic */ C23031Ai A01;

    public C33169EkG(C79853ha c79853ha, C23031Ai c23031Ai) {
        this.A01 = c23031Ai;
        this.A00 = c79853ha;
    }

    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void DB6() {
        this.A01.A0Q();
        C79853ha c79853ha = this.A00;
        FragmentActivity activity = c79853ha.A00.getActivity();
        if (activity != null) {
            C55772hI.A00(c79853ha.A02).A09(activity, "back");
        }
    }
}
