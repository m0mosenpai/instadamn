package X;

import android.content.DialogInterface;

/* renamed from: X.CiS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnCancelListenerC28534CiS implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C25814BbV A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public DialogInterfaceOnCancelListenerC28534CiS(C25814BbV c25814BbV, String str, String str2, boolean z) {
        this.A00 = c25814BbV;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.A00.A0C.A0D("unpin_dialog_cancel", this.A01, this.A02, this.A03);
    }
}
