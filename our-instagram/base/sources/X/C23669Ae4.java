package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Ae4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23669Ae4 implements InterfaceC25177BCa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C23669Ae4(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC25177BCa
    public final void DQ0() {
        switch (this.A00) {
            case 0:
                ((C187198Rm) this.A01).A07((C187318Ry) this.A02);
                return;
            case 1:
                ((C74P) this.A01).A08();
                AbstractC166987dD.A1Y(this.A02);
                return;
            case 2:
                ((InterfaceC23621Ds) this.A01).resumeWith(this.A02);
                return;
            default:
                C15370ps c15370ps = (C15370ps) this.A02;
                AbstractC62819SSr.A00((Drawable) c15370ps.A00, (InterfaceC65293ThR) this.A01);
                ((C5RP) c15370ps.A00).EFh(this);
                return;
        }
    }

    @Override // X.InterfaceC25177BCa
    public final void DZL() {
    }
}
