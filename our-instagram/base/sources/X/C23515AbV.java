package X;

/* renamed from: X.AbV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23515AbV implements BER {
    public int A00;
    public int A01;
    public C178907x2 A02;
    public C179427xs A03;
    public InterfaceC179037xF A04;
    public InterfaceC179037xF A05;
    public boolean A06;
    public final C178747wm A07;
    public final InterfaceC179077xJ A08;
    public final BER A09;
    public final boolean A0A;
    public final InterfaceC179077xJ[] A0B;

    public C23515AbV(C178747wm c178747wm, InterfaceC179077xJ interfaceC179077xJ, BER ber, boolean z) {
        C14360o3.A0B(ber, 1);
        this.A09 = ber;
        this.A08 = interfaceC179077xJ;
        this.A07 = c178747wm;
        this.A0A = z;
        this.A0B = new InterfaceC179077xJ[]{ber, interfaceC179077xJ};
        this.A06 = true;
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        C14360o3.A0B(interfaceC180227zC, 0);
        this.A06 = true;
        InterfaceC179077xJ[] interfaceC179077xJArr = this.A0B;
        int i = 0;
        do {
            interfaceC179077xJArr[i].ACv(interfaceC180227zC);
            i++;
        } while (i < 2);
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
        C14360o3.A0B(c178907x2, 0);
        this.A02 = c178907x2;
        InterfaceC179077xJ[] interfaceC179077xJArr = this.A0B;
        int i = 0;
        do {
            interfaceC179077xJArr[i].CNk(c178907x2);
            i++;
        } while (i < 2);
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ InterfaceC179467xw EGc(InterfaceC179467xw interfaceC179467xw, InterfaceC179437xt interfaceC179437xt, InterfaceC179037xF interfaceC179037xF, Long l) {
        return interfaceC179467xw;
    }

    @Override // X.InterfaceC179077xJ
    public final void EGd(InterfaceC179037xF interfaceC179037xF, Long l) {
        String str;
        C14360o3.A0B(interfaceC179037xF, 0);
        if (this.A06) {
            C178747wm c178747wm = this.A07;
            C179427xs c179427xs = new C179427xs(c178747wm, new C179387xo(), new C179417xr(), true);
            this.A03 = c179427xs;
            C179027xE BET = interfaceC179037xF.BET();
            this.A04 = BET;
            BET.A8h(c179427xs, 0);
            C179427xs c179427xs2 = this.A03;
            if (c179427xs2 != null) {
                C1809380v c1809380v = new C1809380v(c178747wm, c179427xs2);
                C179027xE BEU = interfaceC179037xF.BEU();
                this.A05 = BEU;
                BEU.EWA(c1809380v, 0);
                this.A06 = false;
            }
            str = "intermediateFramebuffer";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C179427xs c179427xs3 = this.A03;
        if (c179427xs3 != null) {
            c179427xs3.A03(this.A01, this.A00, 0);
            BER ber = this.A09;
            InterfaceC179037xF interfaceC179037xF2 = this.A04;
            if (interfaceC179037xF2 != null) {
                ber.EGd(interfaceC179037xF2, l);
                InterfaceC179037xF interfaceC179037xF3 = this.A05;
                if (interfaceC179037xF3 != null) {
                    AbstractC199718sN.A00(interfaceC179037xF, interfaceC179037xF3, 500);
                    if (interfaceC179037xF != interfaceC179037xF3) {
                        AbstractC199718sN.A00(interfaceC179037xF, interfaceC179037xF3, 1011);
                        AbstractC199718sN.A00(interfaceC179037xF, interfaceC179037xF3, 1012);
                    }
                    InterfaceC179077xJ interfaceC179077xJ = this.A08;
                    InterfaceC179037xF interfaceC179037xF4 = this.A05;
                    if (interfaceC179037xF4 != null) {
                        interfaceC179077xJ.EGd(interfaceC179037xF4, l);
                        return;
                    }
                }
                str = "storiesGraphIo";
            } else {
                str = "intermediateIo";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "intermediateFramebuffer";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.BER
    public final /* synthetic */ void EZt(InterfaceC25162BBi interfaceC25162BBi) {
    }

    @Override // X.InterfaceC179077xJ
    public final void FDL(int i, Object obj) {
        C14360o3.A0B(obj, 1);
        InterfaceC179077xJ[] interfaceC179077xJArr = this.A0B;
        int i2 = 0;
        do {
            interfaceC179077xJArr[i2].FDL(i, obj);
            i2++;
        } while (i2 < 2);
    }

    @Override // X.BER
    public final void A8K(C23504AbK c23504AbK) {
        this.A09.A8K(c23504AbK);
    }

    @Override // X.InterfaceC179077xJ
    public final int AlT() {
        InterfaceC179077xJ[] interfaceC179077xJArr = this.A0B;
        int i = 0;
        int i2 = 0;
        do {
            i2 |= interfaceC179077xJArr[i].AlT();
            i++;
        } while (i < 2);
        return i2;
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ int AwF() {
        return 0;
    }

    @Override // X.InterfaceC179077xJ
    public final boolean CLu() {
        InterfaceC179077xJ[] interfaceC179077xJArr = this.A0B;
        int i = 0;
        while (!interfaceC179077xJArr[i].CLu()) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ boolean Cbr() {
        return false;
    }

    @Override // X.BER
    public final void EFD(C23504AbK c23504AbK) {
        this.A09.EFD(c23504AbK);
    }

    @Override // X.InterfaceC179077xJ
    public final void FBm(int i, int i2, int i3, boolean z, int i4, int i5) {
        int[] iArr;
        this.A01 = i4;
        this.A00 = i5;
        if (!this.A0A) {
            this.A09.FBm(i, i2, i3, z, i4, i5);
            this.A08.FBm(i, i4, i5, z, i4, i5);
            return;
        }
        if (i2 < i4 && i3 < i5) {
            iArr = new int[]{i2, (int) (i2 / (i4 / i5))};
        } else {
            iArr = new int[]{i4, i5};
        }
        this.A09.FBm(i, i2, i3, z, iArr[0], iArr[1]);
        this.A08.FBm(i, iArr[0], iArr[1], z, i4, i5);
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        InterfaceC179077xJ[] interfaceC179077xJArr = this.A0B;
        int i = 0;
        do {
            interfaceC179077xJArr[i].detach();
            i++;
        } while (i < 2);
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
        InterfaceC179077xJ[] interfaceC179077xJArr = this.A0B;
        int i = 0;
        do {
            interfaceC179077xJArr[i].release();
            i++;
        } while (i < 2);
    }
}
