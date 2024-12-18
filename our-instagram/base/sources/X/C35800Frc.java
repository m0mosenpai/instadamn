package X;

import android.widget.CompoundButton;

/* renamed from: X.Frc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35800Frc implements InterfaceC48212Jk {
    public final /* synthetic */ CompoundButton A00;
    public final /* synthetic */ C14510oO A01;
    public final /* synthetic */ boolean A02;

    public C35800Frc(CompoundButton compoundButton, C14510oO c14510oO, boolean z) {
        this.A00 = compoundButton;
        this.A01 = c14510oO;
        this.A02 = z;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        CompoundButton compoundButton = this.A00;
        compoundButton.setEnabled(true);
        this.A01.A00 = false;
        compoundButton.setChecked(!this.A02);
    }
}
