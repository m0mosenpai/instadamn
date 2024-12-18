package X;

import android.view.View;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Ij3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41972Ij3 implements View.OnClickListener {
    public final /* synthetic */ C84823qW A00;
    public final /* synthetic */ InterfaceC41201vU A01;
    public final /* synthetic */ InterfaceC144796fz A02;
    public final /* synthetic */ C144316fD A03;

    public ViewOnClickListenerC41972Ij3(C84823qW c84823qW, InterfaceC41201vU interfaceC41201vU, InterfaceC144796fz interfaceC144796fz, C144316fD c144316fD) {
        this.A02 = interfaceC144796fz;
        this.A01 = interfaceC41201vU;
        this.A03 = c144316fD;
        this.A00 = c84823qW;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(313380843);
        InterfaceC144796fz interfaceC144796fz = this.A02;
        C38321qM BQN = this.A01.BQN();
        if (BQN != null) {
            C144316fD c144316fD = this.A03;
            interfaceC144796fz.DTK(BQN, c144316fD, this.A00);
            IgTextView igTextView = c144316fD.A02;
            if (igTextView != null) {
                if (igTextView.isHapticFeedbackEnabled()) {
                    IgTextView igTextView2 = c144316fD.A02;
                    if (igTextView2 != null) {
                        igTextView2.performHapticFeedback(1);
                    }
                }
                C0f9.A0C(-2108833881, A05);
                return;
            }
            C14360o3.A0F("buttonView");
            throw C00O.createAndThrow();
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0C(439326280, A05);
        throw A0g;
    }
}
