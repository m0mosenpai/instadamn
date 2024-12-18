package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.6X7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6X7 implements InterfaceC140616Xp {
    public InterfaceC140606Xo A00;
    public GradientSpinner A01;
    public boolean A02;
    public final Handler A03 = new Handler(Looper.getMainLooper());

    @Override // X.InterfaceC140616Xp
    public final void DFw(long j) {
        if (!this.A02) {
            this.A01.A08();
        }
        Handler handler = this.A03;
        handler.removeCallbacksAndMessages(null);
        handler.post(new C6X8(this, j, false));
    }

    @Override // X.InterfaceC140616Xp
    public final void DqK(boolean z, long j) {
        if (!this.A02) {
            this.A01.A08();
        }
        Handler handler = this.A03;
        handler.removeCallbacksAndMessages(null);
        handler.post(new C6X8(this, j, true));
    }

    @Override // X.InterfaceC140616Xp
    public final void onCancel() {
        if (!this.A02) {
            this.A01.A08();
        }
        this.A03.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC140616Xp
    public final void onStart() {
        GradientSpinner gradientSpinner = this.A01;
        if (gradientSpinner.A04 != gradientSpinner.A0P && !this.A02) {
            gradientSpinner.A06();
        }
    }

    public C6X7(InterfaceC140606Xo interfaceC140606Xo, GradientSpinner gradientSpinner, boolean z) {
        this.A01 = gradientSpinner;
        this.A00 = interfaceC140606Xo;
        this.A02 = z;
    }
}
