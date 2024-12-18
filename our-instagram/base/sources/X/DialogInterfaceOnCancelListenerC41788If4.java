package X;

import android.content.DialogInterface;

/* renamed from: X.If4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnCancelListenerC41788If4 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C41155IJu A00;
    public final /* synthetic */ C3K0 A01;

    public DialogInterfaceOnCancelListenerC41788If4(C41155IJu c41155IJu, C3K0 c3k0) {
        this.A01 = c3k0;
        this.A00 = c41155IJu;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C3K0 c3k0 = this.A01;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        AbstractC40642I0a.A00(c3k0.A0B, this.A00, c3k0.A0D, false);
    }
}
