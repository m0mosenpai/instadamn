package X;

/* loaded from: classes4.dex */
public final class AZH implements InterfaceC179467xw, InterfaceC179087xK {
    public int A00;
    public int A01;
    public int A03;
    public long A05;
    public AnonymousClass810 A06;
    public C179407xq A07;
    public C68685VaL A08;
    public boolean A0A;
    public boolean A0B;
    public final String A0C;
    public int A04 = -1;
    public int A02 = -1;
    public boolean A09 = false;

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
    }

    @Override // X.InterfaceC179467xw
    public final int ApO() {
        return this.A00;
    }

    @Override // X.InterfaceC179467xw
    public final int AxI() {
        return this.A01;
    }

    @Override // X.InterfaceC179467xw
    public final C68685VaL BD8() {
        return this.A08;
    }

    @Override // X.InterfaceC179467xw
    public final int BaI() {
        return this.A03;
    }

    @Override // X.InterfaceC179467xw
    public final long C8d() {
        return this.A05;
    }

    @Override // X.InterfaceC179467xw
    public final C179407xq CGV() {
        return this.A07;
    }

    @Override // X.InterfaceC179467xw
    public final boolean CVE() {
        return this.A0A;
    }

    @Override // X.InterfaceC179467xw
    public final boolean CdG() {
        return this.A0B;
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        AnonymousClass810 anonymousClass810 = this.A06;
        if (anonymousClass810 != null) {
            anonymousClass810.A01();
        }
        this.A06 = null;
        this.A04 = -1;
        this.A02 = -1;
        this.A09 = false;
    }

    @Override // X.InterfaceC179467xw
    public final AnonymousClass810 getTexture() {
        AnonymousClass810 anonymousClass810 = this.A06;
        anonymousClass810.getClass();
        return anonymousClass810;
    }

    public AZH(String str) {
        this.A0C = str;
    }

    @Override // X.InterfaceC179467xw
    public final void EVi(C68685VaL c68685VaL) {
        this.A08 = c68685VaL;
    }
}
