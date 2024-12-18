package X;

import android.content.DialogInterface;

/* renamed from: X.FiC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35335FiC implements DialogInterface.OnClickListener {
    public final /* synthetic */ C31289DpB A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public DialogInterfaceOnClickListenerC35335FiC(C31289DpB c31289DpB, String str, String str2) {
        this.A00 = c31289DpB;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.A02(EnumC33478ErD.DISMISS, this.A02, this.A01);
    }
}
