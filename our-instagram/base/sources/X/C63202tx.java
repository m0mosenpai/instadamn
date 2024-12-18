package X;

import android.content.Context;

/* renamed from: X.2tx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63202tx implements InterfaceC63212ty {
    public static final InterfaceC62642t3 A06 = new InterfaceC62642t3() { // from class: X.2tz
        @Override // X.InterfaceC62642t3
        public final boolean AF5(Context context) {
            return AbstractC72723Nt.A00(context);
        }
    };
    public final C63172tu A00;
    public final InterfaceC62642t3 A01;
    public final InterfaceC63192tw A02;
    public final C1I3 A03;
    public final C63162tt A04;
    public final C63142tr A05;

    @Override // X.InterfaceC63212ty
    public final boolean AF5(Context context) {
        InterfaceC62642t3 interfaceC62642t3 = this.A01;
        if (interfaceC62642t3 == null) {
            interfaceC62642t3 = A06;
        }
        return interfaceC62642t3.AF5(context);
    }

    @Override // X.InterfaceC63212ty
    public final C63142tr Abv() {
        return this.A05;
    }

    @Override // X.InterfaceC63212ty
    public final InterfaceC63192tw AgW() {
        return this.A02;
    }

    @Override // X.InterfaceC63212ty
    public final C63162tt AgX() {
        return this.A04;
    }

    @Override // X.InterfaceC63212ty
    public final C63172tu BGp() {
        return this.A00;
    }

    @Override // X.InterfaceC63212ty
    public final C1I3 Br2() {
        return this.A03;
    }

    public C63202tx(C63172tu c63172tu, InterfaceC62642t3 interfaceC62642t3, InterfaceC63192tw interfaceC63192tw, C1I3 c1i3, C63162tt c63162tt, C63142tr c63142tr) {
        this.A03 = c1i3;
        this.A04 = c63162tt;
        this.A05 = c63142tr;
        this.A00 = c63172tu;
        this.A01 = interfaceC62642t3;
        this.A02 = interfaceC63192tw;
    }
}
