package X;

import android.content.DialogInterface;

/* renamed from: X.OfM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnCancelListenerC55248OfM implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public DialogInterfaceOnCancelListenerC55248OfM(Object obj, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = z2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        boolean z;
        boolean z2;
        P4X p4x;
        Long l;
        String A0V;
        String str;
        if (this.A00 != 0) {
            C51011MgI A01 = ((N67) this.A01).A01();
            z = this.A03;
            z2 = this.A02;
            p4x = A01.A09;
            l = A01.A0B;
            A0V = AbstractC50523MSb.A0V(A01.A08);
            str = A01.A0C;
        } else {
            NP7 A02 = ((N6D) this.A01).A02();
            z = this.A03;
            z2 = this.A02;
            p4x = A02.A04;
            l = A02.A06;
            A0V = AbstractC50523MSb.A0V(A02.A03);
            str = A02.A07;
        }
        p4x.A05(l, A0V, str, z, z2);
    }
}
