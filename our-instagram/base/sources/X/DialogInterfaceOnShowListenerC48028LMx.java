package X;

import android.content.DialogInterface;

/* renamed from: X.LMx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class DialogInterfaceOnShowListenerC48028LMx implements DialogInterface.OnShowListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C26747BrT A01;

    public DialogInterfaceOnShowListenerC48028LMx(C26747BrT c26747BrT, long j) {
        this.A01 = c26747BrT;
        this.A00 = j;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        C26747BrT c26747BrT = this.A01;
        C28458ChA.A00.A04(AbstractC166987dD.A0r(c26747BrT.A01), null, "challenge_end_dialog", null, ((C25872BcU) c26747BrT.A00.getValue()).A04, null, null, null, AbstractC43594JPz.A10(this.A00), null, null, null, null);
    }
}
