package X;

import android.content.DialogInterface;

/* loaded from: classes4.dex */
public final class ANX implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C8JT A00;

    public ANX(C8JT c8jt) {
        this.A00 = c8jt;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C8JT c8jt = this.A00;
        AnonymousClass229.A01(c8jt.A1D).A1m("EXIT_DIALOG_CANCEL");
        C8JT.A0n(c8jt);
    }
}
