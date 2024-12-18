package X;

import java.util.concurrent.Executor;

/* renamed from: X.Pk9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57782Pk9 extends PVr {
    public InterfaceC16660sJ A00;
    public final C55132Obw A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16660sJ A05;
    public final InterfaceC16660sJ A06;
    public final boolean A07;
    public final boolean A08;

    @Override // X.InterfaceC31063Dl5
    public final void ETK(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A00 = interfaceC16660sJ;
    }

    public final void A00(InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        int i;
        AbstractC09800fd.A01("RpStore.subscribe", -1484224524);
        try {
            if (this.A07) {
                synchronized (super.A01) {
                    if (equals(OZP.A00)) {
                        OXE.A00.A03("RpStore", "subscribe called on finalized RpStore. No updates will be provided.", null);
                        i = -439180902;
                    } else {
                        C55736Op5 c55736Op5 = new C55736Op5(null);
                        interfaceC16660sJ.invoke(c55736Op5);
                        if (z) {
                            ((Executor) this.A02.getValue()).execute(new PPY(this, c55736Op5));
                        }
                        c55736Op5.A01(this.A01);
                        i = 1286764586;
                    }
                }
            } else if (equals(OZP.A00)) {
                OXE.A00.A03("RpStore", "subscribe called on finalized RpStore. No updates will be provided.", null);
                i = -864865470;
            } else {
                C55736Op5 c55736Op52 = new C55736Op5(null);
                interfaceC16660sJ.invoke(c55736Op52);
                if (z) {
                    ((Executor) this.A02.getValue()).execute(new PPZ(this, c55736Op52));
                }
                this.A00.invoke(new O1S(c55736Op52));
                i = -34839636;
            }
            AbstractC09800fd.A00(i);
        } catch (Throwable th) {
            AbstractC09800fd.A00(-288338737);
            throw th;
        }
    }

    @Override // X.InterfaceC31063Dl5
    public final InterfaceC16660sJ AyR() {
        return this.A00;
    }

    @Override // X.InterfaceC31063Dl5
    public final InterfaceC16820sZ B9j() {
        if (this.A08) {
            return super.A02;
        }
        InterfaceC16820sZ interfaceC16820sZ = this.A04;
        if (interfaceC16820sZ != null) {
            return interfaceC16820sZ;
        }
        throw AbstractC166987dD.A14("IllegalState - AtomicStateOverrideForGetState is null");
    }

    @Override // X.InterfaceC31063Dl5
    public final InterfaceC16660sJ Bmz() {
        return this.A05;
    }

    @Override // X.InterfaceC31063Dl5
    public final InterfaceC16660sJ C3O() {
        return this.A06;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57782Pk9(String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC31063Dl5 interfaceC31063Dl5, boolean z) {
        super(interfaceC31063Dl5);
        AbstractC167017dG.A1P(str, interfaceC31063Dl5);
        this.A08 = z;
        this.A04 = interfaceC16820sZ;
        this.A00 = new C65076Td9(35, this, interfaceC31063Dl5);
        this.A05 = new C65076Td9(36, this, interfaceC31063Dl5);
        this.A06 = new C65076Td9(37, this, interfaceC31063Dl5);
        this.A07 = z;
        this.A03 = AbstractC09440dt.A01(C57307PcT.A00);
        C17050sx A01 = AbstractC09440dt.A01(YL1.A00);
        this.A02 = A01;
        this.A01 = new C55132Obw((Executor) A01.getValue(), z);
    }
}
