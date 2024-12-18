package X;

/* renamed from: X.7u6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177107u6 implements InterfaceC179087xK, InterfaceC179447xu, InterfaceC1809180t {
    public int A00;
    public int A01;
    public final InterfaceC175517rR A03;
    public final AbstractC179397xp A04;
    public final C179457xv A02 = new Object();
    public final float[] A05 = new float[16];
    public final boolean A06 = C178607wY.A00();

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        InterfaceC175517rR interfaceC175517rR;
        AnonymousClass810 anonymousClass810;
        AnonymousClass810 anonymousClass8102;
        int i;
        C179457xv c179457xv = this.A02;
        if (c179457xv.A04 == null) {
            if (this.A06) {
                C9YQ c9yq = new C9YQ("SurfaceInput");
                c179457xv.A04 = c9yq;
                interfaceC175517rR = this.A03;
                anonymousClass810 = c9yq.A00;
                anonymousClass8102 = c9yq;
            } else {
                interfaceC175517rR = this.A03;
                AnonymousClass811 anonymousClass811 = new AnonymousClass811("SurfaceInput");
                anonymousClass811.A03 = 36197;
                anonymousClass810 = new AnonymousClass810(anonymousClass811);
                anonymousClass8102 = anonymousClass810;
                c179457xv.A04 = anonymousClass810;
            }
            interfaceC175517rR.Dsj(anonymousClass810.A00);
            int i2 = this.A01;
            if (i2 > 0 && (i = this.A00) > 0) {
                anonymousClass8102.A00(i2, i);
            }
        }
    }

    @Override // X.InterfaceC179447xu
    public final InterfaceC179467xw B8Z() {
        try {
            InterfaceC175517rR interfaceC175517rR = this.A03;
            interfaceC175517rR.FCQ();
            float[] fArr = this.A05;
            interfaceC175517rR.CAY(fArr);
            AbstractC179397xp abstractC179397xp = this.A04;
            abstractC179397xp.A0A(fArr);
            C179457xv c179457xv = this.A02;
            c179457xv.A05 = abstractC179397xp.A08();
            c179457xv.A03 = interfaceC175517rR.C8d();
        } catch (RuntimeException unused) {
        }
        return this.A02;
    }

    @Override // X.InterfaceC179447xu
    public final /* synthetic */ int BHw() {
        return 0;
    }

    @Override // X.InterfaceC179447xu
    public final void EZr(InterfaceC1809280u interfaceC1809280u) {
        this.A03.EZr(interfaceC1809280u);
    }

    @Override // X.InterfaceC1809180t
    public final C179407xq FBE(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        C179457xv c179457xv = this.A02;
        AnonymousClass810 anonymousClass810 = c179457xv.A04;
        if (anonymousClass810 != null) {
            anonymousClass810.A00(i, i2);
        }
        AbstractC179397xp abstractC179397xp = this.A04;
        abstractC179397xp.A09(this.A01, this.A00, i3, i4, 0, false, false);
        c179457xv.A02 = i5;
        c179457xv.A01 = i6;
        c179457xv.A00 = i7;
        c179457xv.A06 = z;
        return abstractC179397xp.A08();
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        C179457xv c179457xv = this.A02;
        AnonymousClass810 anonymousClass810 = c179457xv.A04;
        if (anonymousClass810 != null) {
            anonymousClass810.A01();
            c179457xv.A04 = null;
        }
        this.A03.Dsk();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7xv, java.lang.Object] */
    public C177107u6(InterfaceC175517rR interfaceC175517rR, AbstractC179397xp abstractC179397xp) {
        this.A04 = abstractC179397xp;
        this.A03 = interfaceC175517rR;
    }
}
