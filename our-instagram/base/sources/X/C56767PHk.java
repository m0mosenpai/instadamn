package X;

import android.content.DialogInterface;

/* renamed from: X.PHk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56767PHk implements C7XU {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;

    @Override // X.C7XU
    public final void DB3() {
    }

    public C56767PHk(DialogInterface.OnDismissListener onDismissListener) {
        this.A00 = onDismissListener;
    }

    @Override // X.C7XU
    public final void DAy() {
        this.A00.onDismiss(null);
    }
}
