package X;

import android.content.DialogInterface;

/* renamed from: X.Ig2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnShowListenerC41848Ig2 implements DialogInterface.OnShowListener {
    public final /* synthetic */ C3K0 A00;

    public DialogInterfaceOnShowListenerC41848Ig2(C3K0 c3k0) {
        this.A00 = c3k0;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        C3K0 c3k0 = this.A00;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        c3k0.A0A.postDelayed(new J36(c3k0), 1000L);
    }
}
