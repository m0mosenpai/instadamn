package X;

import com.facebook.vmasaver.VmaSaver;

/* renamed from: X.1St, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26971St extends C0R8 {
    @Override // X.InterfaceC05710Rv
    public final String getName() {
        return "MemoryRedFixer";
    }

    @Override // X.InterfaceC05710Rv
    public final void CNZ() {
        C1TU A01;
        if (A05(C10420hA.class) != null && (A01 = C1TU.A01()) != null && A01.A09.A09) {
            A01.A93(new C108494ua());
            A01.A93(new InterfaceC18130ux() { // from class: X.4uc
                public final int A00;
                public final int A01;
                public final int A02;
                public final int A03;
                public final int A04;
                public final int A05;
                public final boolean A06;

                {
                    C20150ym.A07(AbstractC20100yh.A00(36314103107684773L));
                    this.A06 = C20150ym.A07(AbstractC20100yh.A00(36314103108012455L));
                    this.A04 = (int) C20150ym.A01(AbstractC20100yh.A00(36595578084264121L));
                    this.A03 = (int) C20150ym.A01(AbstractC20100yh.A00(36595578084067511L));
                    this.A00 = (int) C20150ym.A01(AbstractC20100yh.A00(36595578084001974L));
                    this.A01 = (int) C20150ym.A01(AbstractC20100yh.A00(36595578084198584L));
                    this.A02 = (int) C20150ym.A01(AbstractC20100yh.A00(36595578084460730L));
                    this.A05 = (int) C20150ym.A01(AbstractC20100yh.A00(36595578084657340L));
                }

                @Override // X.InterfaceC18130ux
                public final void Cvs(C0TY c0ty) {
                    int ordinal = c0ty.ordinal();
                    if (ordinal != 1 && ordinal != 2) {
                        return;
                    }
                    if (this.A06) {
                        VmaSaver.freeWebviewReservedMemory();
                    }
                    if (ordinal != 1) {
                        int i = this.A04;
                        if (i == 1 || i == 2) {
                            VmaSaver.freeCompactingGcSemiSpace(this.A03);
                        }
                        int i2 = this.A00;
                        if (i2 == 1 || i2 == 2) {
                            VmaSaver.shrinkArtRegionSpace(this.A01, this.A02);
                        }
                        int i3 = this.A05;
                        if (i3 != 3 && i3 != 4) {
                            if (i3 != 1 && i3 != 2) {
                                return;
                            }
                        }
                        VmaSaver.setJemallocRetain(false);
                    } else {
                        if (this.A04 == 1) {
                            VmaSaver.freeCompactingGcSemiSpace(this.A03);
                        }
                        if (this.A00 == 1) {
                            VmaSaver.shrinkArtRegionSpace(this.A01, this.A02);
                        }
                        int i4 = this.A05;
                        if (i4 != 3) {
                            if (i4 != 1) {
                                return;
                            }
                        }
                        VmaSaver.setJemallocRetain(false);
                    }
                    VmaSaver.purgeJemallocHeap();
                }
            });
            A08();
        }
    }
}
