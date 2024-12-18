package X;

import android.view.View;

/* renamed from: X.Ij1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41970Ij1 implements View.OnClickListener {
    public final /* synthetic */ InterfaceC144836g3 A00;
    public final /* synthetic */ C144296fB A01;
    public final /* synthetic */ C84823qW A02;
    public final /* synthetic */ InterfaceC41201vU A03;

    public ViewOnClickListenerC41970Ij1(InterfaceC144836g3 interfaceC144836g3, C144296fB c144296fB, C84823qW c84823qW, InterfaceC41201vU interfaceC41201vU) {
        this.A00 = interfaceC144836g3;
        this.A03 = interfaceC41201vU;
        this.A01 = c144296fB;
        this.A02 = c84823qW;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(279839946);
        InterfaceC144836g3 interfaceC144836g3 = this.A00;
        C38321qM BQN = this.A03.BQN();
        if (BQN != null) {
            C144296fB c144296fB = this.A01;
            interfaceC144836g3.D2p(BQN, c144296fB, c144296fB, this.A02);
            View view2 = c144296fB.A00;
            if (view2 != null) {
                if (view2.isHapticFeedbackEnabled()) {
                    View view3 = c144296fB.A00;
                    if (view3 != null) {
                        view3.performHapticFeedback(1);
                    }
                }
                C0f9.A0C(-1168124184, A05);
                return;
            }
            C14360o3.A0F("buttonView");
            throw C00O.createAndThrow();
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0C(-975129858, A05);
        throw A0g;
    }
}
