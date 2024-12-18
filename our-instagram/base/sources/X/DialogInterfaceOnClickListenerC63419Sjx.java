package X;

import android.content.DialogInterface;

/* renamed from: X.Sjx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class DialogInterfaceOnClickListenerC63419Sjx implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass740 A00;

    public DialogInterfaceOnClickListenerC63419Sjx(AnonymousClass740 anonymousClass740) {
        this.A00 = anonymousClass740;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        AnonymousClass740 anonymousClass740 = this.A00;
        C140966Yy c140966Yy = new C140966Yy(anonymousClass740.A02, anonymousClass740.A05);
        c140966Yy.A0D(C2FP.A0E().A03(AbstractC166987dD.A0b(), "home"));
        c140966Yy.A04();
    }
}
