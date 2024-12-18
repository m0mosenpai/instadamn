package X;

import android.content.DialogInterface;

/* renamed from: X.FiB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35334FiB implements DialogInterface.OnClickListener {
    public final /* synthetic */ FOg A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public DialogInterfaceOnClickListenerC35334FiB(FOg fOg, String str, boolean z) {
        this.A00 = fOg;
        this.A01 = str;
        this.A02 = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        FOg fOg = this.A00;
        fOg.A0D.A0B(this.A01, this.A02, fOg.A04);
    }
}
