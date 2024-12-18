package X;

import android.view.View;

/* renamed from: X.OjH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55406OjH implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public ViewOnClickListenerC55406OjH(Object obj, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
        this.A03 = z2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1061480816);
                C56359P0u c56359P0u = (C56359P0u) this.A01;
                c56359P0u.A04.DdU(c56359P0u.A01, this.A02, this.A03);
                i = 848025542;
                break;
            case 1:
                A05 = C0f9.A05(79335138);
                P1A p1a = (P1A) this.A01;
                p1a.A04.DPB(p1a.A01, this.A02, this.A03);
                i = -2102949536;
                break;
            default:
                A05 = C0f9.A05(1888585785);
                P1A p1a2 = (P1A) this.A01;
                p1a2.A04.Dwf(p1a2.A01, this.A02, this.A03);
                i = 853744234;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
