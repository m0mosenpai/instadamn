package X;

import android.content.DialogInterface;

/* renamed from: X.FiM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35345FiM implements DialogInterface.OnClickListener {
    public final /* synthetic */ C32706EaX A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public DialogInterfaceOnClickListenerC35345FiM(C32706EaX c32706EaX, String str, boolean z, boolean z2) {
        this.A00 = c32706EaX;
        this.A01 = str;
        this.A02 = z;
        this.A03 = z2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C32706EaX c32706EaX = this.A00;
        c32706EaX.A0N();
        c32706EaX.A0E().A0B(this.A01, this.A02, this.A03);
    }
}
