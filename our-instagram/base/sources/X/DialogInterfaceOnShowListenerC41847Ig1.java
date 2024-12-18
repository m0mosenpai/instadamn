package X;

import android.content.DialogInterface;
import android.view.ViewConfiguration;

/* renamed from: X.Ig1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnShowListenerC41847Ig1 implements DialogInterface.OnShowListener {
    public final /* synthetic */ C3K0 A00;

    public DialogInterfaceOnShowListenerC41847Ig1(C3K0 c3k0) {
        this.A00 = c3k0;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        C3K0 c3k0 = this.A00;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        c3k0.A0A.postDelayed(new J35(c3k0), ViewConfiguration.getDoubleTapTimeout());
    }
}
