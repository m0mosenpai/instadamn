package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes10.dex */
public final class TNI implements Runnable {
    public final /* synthetic */ C58887QEx A00;
    public final /* synthetic */ InterfaceC172717mh A01;

    public TNI(C58887QEx c58887QEx, InterfaceC172717mh interfaceC172717mh) {
        this.A00 = c58887QEx;
        this.A01 = interfaceC172717mh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C58887QEx c58887QEx = this.A00;
        C2GS c2gs = AbstractC63223SfY.A03(c58887QEx).A0O;
        FragmentActivity activity = this.A01.getActivity();
        if (activity != null) {
            c2gs.A06(activity, c58887QEx.A0A);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
