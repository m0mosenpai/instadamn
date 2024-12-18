package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.7BF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7BF extends C3OO implements C7QD, C7QE, InterfaceC162937Re, C7BG {
    public C7Q8 A00;
    public C7QH A01;
    public final Drawable A02;
    public final TextView A03;
    public final C7BH A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7BF(TextView textView) {
        super(textView);
        C14360o3.A0B(textView, 1);
        this.A03 = textView;
        this.A02 = AbstractC162807Qr.A00();
        this.A04 = new C7BH(new C9EL(this, 30));
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A03;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A01;
    }

    @Override // X.InterfaceC162937Re
    public final void F82(int i) {
        C7MU.A00(this.A03.getBackground(), i);
    }

    @Override // X.C7BG
    public final void EZ4(C7Q8 c7q8) {
        this.A00 = c7q8;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A01 = c7qh;
    }
}
