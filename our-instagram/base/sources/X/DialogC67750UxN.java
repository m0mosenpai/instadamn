package X;

import android.content.Context;

/* renamed from: X.UxN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class DialogC67750UxN extends Q5b {
    public final /* synthetic */ C67752UxP A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC67750UxN(Context context, C67752UxP c67752UxP, InterfaceC16820sZ interfaceC16820sZ, int i) {
        super(context, i);
        this.A00 = c67752UxP;
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.Q5b, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        InterfaceC16820sZ interfaceC16820sZ = this.A01;
        if (interfaceC16820sZ == null) {
            super.cancel();
        } else {
            interfaceC16820sZ.invoke();
        }
    }

    @Override // X.DialogC12630l8, android.app.Dialog
    public final void onBackPressed() {
        if (!this.A00.Cnu()) {
            super.onBackPressed();
        }
    }
}
