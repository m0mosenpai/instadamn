package X;

import android.content.DialogInterface;

/* renamed from: X.OgA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55289OgA implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public DialogInterfaceOnClickListenerC55289OgA(C128175qm c128175qm, N6J n6j, String str, String str2, int i, boolean z) {
        this.A00 = i;
        this.A02 = n6j;
        this.A05 = z;
        this.A03 = str;
        this.A01 = c128175qm;
        this.A04 = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        N6J n6j;
        switch (this.A00) {
            case 0:
                n6j = (N6J) this.A02;
                N6J.A03(n6j).Clh("not_now");
                break;
            case 1:
                n6j = (N6J) this.A02;
                break;
            default:
                return;
        }
        boolean z = this.A05;
        N6J.A0D((C128175qm) this.A01, n6j, this.A03, this.A04, z);
    }
}
