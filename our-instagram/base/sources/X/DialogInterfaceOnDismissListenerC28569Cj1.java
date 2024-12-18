package X;

import android.content.DialogInterface;

/* renamed from: X.Cj1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnDismissListenerC28569Cj1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C30E A01;

    public DialogInterfaceOnDismissListenerC28569Cj1(C38321qM c38321qM, C30E c30e) {
        this.A01 = c30e;
        this.A00 = c38321qM;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C30E c30e = this.A01;
        C30E.A07(c30e, "fragment_resumed", false, false);
        C30E.A08(c30e, new ME1(18, this.A00, c30e), new C30191DRw(c30e, 22));
    }
}
