package X;

/* renamed from: X.9RO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9RO implements InterfaceC179087xK, InterfaceC179447xu, InterfaceC1809180t {
    public AnonymousClass810 A03;
    public InterfaceC1809280u A04;
    public final C179457xv A05;
    public final AbstractC179397xp A06;
    public int A02 = 0;
    public int A01 = 0;
    public boolean A00 = true;

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
    }

    public final void A00(AnonymousClass810 anonymousClass810) {
        this.A03 = anonymousClass810;
        this.A05.A04 = anonymousClass810;
        anonymousClass810.A00(this.A02, this.A01);
        InterfaceC1809280u interfaceC1809280u = this.A04;
        if (interfaceC1809280u != null) {
            interfaceC1809280u.DIE();
        }
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        AnonymousClass810 anonymousClass810;
        C179457xv c179457xv = this.A05;
        if (c179457xv.A04 == null && (anonymousClass810 = this.A03) != null) {
            c179457xv.A04 = anonymousClass810;
        }
    }

    @Override // X.InterfaceC179447xu
    public final InterfaceC179467xw B8Z() {
        return this.A05;
    }

    @Override // X.InterfaceC179447xu
    public final /* synthetic */ int BHw() {
        return 0;
    }

    @Override // X.InterfaceC1809180t
    public final C179407xq FBE(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.A02 = i;
        this.A01 = i2;
        C179457xv c179457xv = this.A05;
        AnonymousClass810 anonymousClass810 = c179457xv.A04;
        if (anonymousClass810 != null) {
            anonymousClass810.A00(i, i2);
        }
        AbstractC179397xp abstractC179397xp = this.A06;
        abstractC179397xp.A09(this.A02, this.A01, i3, i4, 0, false, false);
        c179457xv.A02 = i5;
        c179457xv.A01 = i6;
        c179457xv.A06 = z;
        if (i7 != 0) {
            c179457xv.A00 = i7;
        }
        return abstractC179397xp.A08();
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        if (this.A00) {
            this.A05.A04 = null;
            AnonymousClass810 anonymousClass810 = this.A03;
            if (anonymousClass810 != null) {
                anonymousClass810.A01();
                this.A03 = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.7xv, java.lang.Object] */
    public C9RO(AbstractC179397xp abstractC179397xp) {
        this.A06 = abstractC179397xp;
        ?? obj = new Object();
        this.A05 = obj;
        obj.A05 = abstractC179397xp.A08();
    }

    @Override // X.InterfaceC179447xu
    public final void EZr(InterfaceC1809280u interfaceC1809280u) {
        this.A04 = interfaceC1809280u;
    }
}
