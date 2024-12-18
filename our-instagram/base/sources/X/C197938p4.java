package X;

import android.view.Surface;

/* renamed from: X.8p4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C197938p4 extends AbstractC185778Lx implements InterfaceC197918p2 {
    public int A00;
    public int A01;
    public long A02;
    public Surface A03;
    public InterfaceC197958p6 A04;
    public final C176537tB A05;
    public final EnumC185798Lz A06;

    @Override // X.InterfaceC185788Ly
    public final EnumC197888oz BI3() {
        return null;
    }

    @Override // X.InterfaceC185788Ly
    public final String BOj() {
        return "SurfaceOutput";
    }

    public void A00(long j) {
        EnumC185798Lz enumC185798Lz = this.A06;
        if (enumC185798Lz == EnumC185798Lz.CAPTURE || enumC185798Lz == EnumC185798Lz.PEER) {
            j = this.A05.A00(j);
        }
        this.A02 = j;
        AbstractC180277zH abstractC180277zH = super.A00;
        if (abstractC180277zH != null) {
            abstractC180277zH.A04(j);
        }
    }

    public final void A01(Surface surface, int i, int i2) {
        if (surface != null) {
            if (surface == this.A03 && super.A02.get()) {
                if (i != this.A01 || i2 != this.A00) {
                    this.A01 = i;
                    this.A00 = i2;
                    return;
                }
                return;
            }
            if (this.A03 != null) {
                InterfaceC197958p6 interfaceC197958p6 = this.A04;
                if (interfaceC197958p6 != null) {
                    interfaceC197958p6.EpZ(this);
                }
                this.A03 = null;
            }
            this.A03 = surface;
            this.A01 = i;
            this.A00 = i2;
            InterfaceC197958p6 interfaceC197958p62 = this.A04;
            if (interfaceC197958p62 == null) {
                return;
            }
            interfaceC197958p62.EpX(surface, this);
            return;
        }
        throw new IllegalArgumentException("surface cannot be null");
    }

    @Override // X.InterfaceC197918p2
    public final int BqV() {
        return 0;
    }

    @Override // X.InterfaceC185788Ly
    public final EnumC185798Lz CFJ() {
        return this.A06;
    }

    @Override // X.InterfaceC185788Ly
    public final void CNg(InterfaceC197958p6 interfaceC197958p6, InterfaceC197978p8 interfaceC197978p8) {
        this.A04 = interfaceC197958p6;
        Surface surface = this.A03;
        if (surface != null) {
            interfaceC197958p6.EpX(surface, this);
        }
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final int getWidth() {
        return this.A01;
    }

    public C197938p4(Surface surface, EnumC185798Lz enumC185798Lz, int i, int i2) {
        if (surface != null) {
            this.A03 = surface;
            this.A01 = i;
            this.A00 = i2;
            this.A06 = enumC185798Lz;
            this.A05 = new C176537tB();
            return;
        }
        throw new IllegalArgumentException("surface cannot be null");
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public boolean AFZ() {
        Surface surface;
        if (super.AFZ() && (surface = this.A03) != null && surface.isValid()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC185788Ly
    public final void destroy() {
        release();
    }
}
