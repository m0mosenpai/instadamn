package X;

import android.content.DialogInterface;

/* renamed from: X.IfC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41796IfC implements DialogInterface.OnClickListener {
    public final /* synthetic */ FLJ A00;
    public final /* synthetic */ AnonymousClass389 A01;

    public DialogInterfaceOnClickListenerC41796IfC(FLJ flj, AnonymousClass389 anonymousClass389) {
        this.A00 = flj;
        this.A01 = anonymousClass389;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = this.A00.A02;
        if (str != null && str.length() != 0) {
            C12260kU.A0G(this.A01.A00.requireContext(), AbstractC08820cl.A03(str));
        }
    }
}
