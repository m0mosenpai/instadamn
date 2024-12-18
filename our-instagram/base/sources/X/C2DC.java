package X;

/* renamed from: X.2DC, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2DC {
    public C5YV A01;
    public C5AO A02;
    public boolean A04;
    public float A00 = 1.0f;
    public AnonymousClass583 A03 = AnonymousClass583.Ltr;
    public final InterfaceC16660sJ A05 = new C206929Dx(this, 46);

    public boolean A02(AnonymousClass583 anonymousClass583) {
        return false;
    }

    public abstract long A03();

    public abstract void A04(InterfaceC1128857w interfaceC1128857w);

    public boolean A05(float f) {
        return false;
    }

    public boolean A06(C5YV c5yv) {
        return false;
    }

    public final void A01(C5YV c5yv, InterfaceC1128857w interfaceC1128857w, float f, long j) {
        boolean z = false;
        if (this.A00 != f) {
            if (!A05(f)) {
                C5AO c5ao = this.A02;
                if (f == 1.0f) {
                    if (c5ao != null) {
                        c5ao.EPa(f);
                    }
                    this.A04 = false;
                } else {
                    if (c5ao == null) {
                        c5ao = new C5AN();
                        this.A02 = c5ao;
                    }
                    c5ao.EPa(f);
                    this.A04 = true;
                }
            }
            this.A00 = f;
        }
        if (!C14360o3.A0K(this.A01, c5yv)) {
            if (!A06(c5yv)) {
                if (c5yv == null) {
                    C5AO c5ao2 = this.A02;
                    if (c5ao2 != null) {
                        c5ao2.ERj(null);
                    }
                } else {
                    C5AO c5ao3 = this.A02;
                    if (c5ao3 == null) {
                        c5ao3 = new C5AN();
                        this.A02 = c5ao3;
                    }
                    c5ao3.ERj(c5yv);
                    z = true;
                }
                this.A04 = z;
            }
            this.A01 = c5yv;
        }
        AnonymousClass583 layoutDirection = interfaceC1128857w.getLayoutDirection();
        if (this.A03 != layoutDirection) {
            A02(layoutDirection);
            this.A03 = layoutDirection;
        }
        long Bxc = interfaceC1128857w.Bxc();
        float A02 = C5YC.A02(Bxc) - C5YC.A02(j);
        float A00 = C5YC.A00(Bxc) - C5YC.A00(j);
        AnonymousClass587 anonymousClass587 = (AnonymousClass587) interfaceC1128857w.AzL();
        C58A c58a = anonymousClass587.A01;
        c58a.COj(0.0f, 0.0f, A02, A00);
        if (f > 0.0f) {
            try {
                if (C5YC.A02(j) > 0.0f && C5YC.A00(j) > 0.0f) {
                    if (this.A04) {
                        C114205Dh A01 = AbstractC119355as.A01(0L, C5YB.A00(C5YC.A02(j), C5YC.A00(j)));
                        AnonymousClass585 anonymousClass585 = anonymousClass587.A02.A02.A01;
                        C5AO c5ao4 = this.A02;
                        if (c5ao4 == null) {
                            c5ao4 = new C5AN();
                            this.A02 = c5ao4;
                        }
                        try {
                            anonymousClass585.ELk(A01, c5ao4);
                            A04(interfaceC1128857w);
                            anonymousClass585.EKS();
                        } catch (Throwable th) {
                            anonymousClass585.EKS();
                            throw th;
                        }
                    } else {
                        A04(interfaceC1128857w);
                    }
                }
            } finally {
                c58a.COj(-0.0f, -0.0f, -A02, -A00);
            }
        }
    }
}
