package X;

import android.content.DialogInterface;

/* renamed from: X.IfN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41807IfN implements DialogInterface.OnClickListener {
    public final /* synthetic */ C42090Ikx A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public DialogInterfaceOnClickListenerC41807IfN(C42090Ikx c42090Ikx, String str, String str2, String str3) {
        this.A00 = c42090Ikx;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C42090Ikx c42090Ikx = this.A00;
        AbstractC55224Oeq.A09(c42090Ikx.A04.requireActivity(), c42090Ikx.A0A, this.A01, null, this.A03, this.A02);
    }
}
