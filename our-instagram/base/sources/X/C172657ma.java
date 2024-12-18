package X;

/* renamed from: X.7ma, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172657ma {
    public final C172647mZ A00;
    public final C07S A01;
    public final C07T A02;
    public final InterfaceC09670ek A03;

    public C172657ma(C172647mZ c172647mZ, C07S c07s, C07T c07t, final AnonymousClass195 anonymousClass195) {
        C14360o3.A0B(c07t, 1);
        C14360o3.A0B(c07s, 2);
        C14360o3.A0B(c172647mZ, 3);
        this.A02 = c07t;
        this.A01 = c07s;
        this.A00 = c172647mZ;
        InterfaceC09670ek interfaceC09670ek = new InterfaceC09670ek() { // from class: X.7mb
            @Override // X.InterfaceC09670ek
            public final void DoQ(C07R c07r, C07X c07x) {
                C172657ma c172657ma = C172657ma.this;
                AnonymousClass195 anonymousClass1952 = anonymousClass195;
                C14360o3.A0B(c172657ma, 0);
                C14360o3.A0B(c07x, 2);
                if (c07x.getLifecycle().A07() == C07S.DESTROYED) {
                    anonymousClass1952.AGH(null);
                    c172657ma.A00();
                    return;
                }
                int compareTo = c07x.getLifecycle().A07().compareTo(c172657ma.A01);
                C172647mZ c172647mZ2 = c172657ma.A00;
                if (compareTo < 0) {
                    c172647mZ2.A01 = true;
                } else {
                    if (!c172647mZ2.A01) {
                        return;
                    }
                    if (!c172647mZ2.A00) {
                        c172647mZ2.A01 = false;
                        c172647mZ2.A00();
                        return;
                    }
                    throw new IllegalStateException("Cannot resume a finished dispatcher");
                }
            }
        };
        this.A03 = interfaceC09670ek;
        if (c07t.A07() == C07S.DESTROYED) {
            anonymousClass195.AGH(null);
            A00();
        } else {
            c07t.A09(interfaceC09670ek);
        }
    }

    public final void A00() {
        this.A02.A0A(this.A03);
        C172647mZ c172647mZ = this.A00;
        c172647mZ.A00 = true;
        c172647mZ.A00();
    }
}
