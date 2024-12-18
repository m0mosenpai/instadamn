package X;

/* loaded from: classes12.dex */
public final class XMP extends C6KR {
    public Object A00;
    public boolean A01;
    public final InterfaceC42161x6 A02;
    public final C6D4 A03;

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        if (!super.A03) {
            if (super.A00 == 0) {
                try {
                    Object apply = this.A03.apply(obj);
                    if (this.A01) {
                        boolean Eq1 = this.A02.Eq1(this.A00, apply);
                        this.A00 = apply;
                        if (Eq1) {
                            return;
                        }
                    } else {
                        this.A01 = true;
                        this.A00 = apply;
                    }
                } catch (Throwable th) {
                    A00(th);
                    return;
                }
            }
            this.A04.DVo(obj);
        }
    }

    @Override // X.InterfaceC136006Df
    public final int EJ7(int i) {
        InterfaceC135996De interfaceC135996De = super.A01;
        if (interfaceC135996De != null && (i & 4) == 0) {
            int EJ7 = interfaceC135996De.EJ7(i);
            if (EJ7 != 0) {
                super.A00 = EJ7;
            }
            return EJ7;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        r4.A00 = r2;
     */
    @Override // X.InterfaceC136016Dg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object poll() {
        /*
            r4 = this;
        L0:
            X.6De r0 = r4.A01
            java.lang.Object r3 = r0.poll()
            if (r3 != 0) goto La
            r3 = 0
            return r3
        La:
            X.6D4 r0 = r4.A03
            java.lang.Object r2 = r0.apply(r3)
            boolean r0 = r4.A01
            if (r0 != 0) goto L1a
            r0 = 1
            r4.A01 = r0
        L17:
            r4.A00 = r2
            return r3
        L1a:
            X.1x6 r1 = r4.A02
            java.lang.Object r0 = r4.A00
            boolean r0 = r1.Eq1(r0, r2)
            if (r0 == 0) goto L17
            r4.A00 = r2
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XMP.poll():java.lang.Object");
    }

    public XMP(InterfaceC42071wx interfaceC42071wx, InterfaceC42161x6 interfaceC42161x6, C6D4 c6d4) {
        super(interfaceC42071wx);
        this.A03 = c6d4;
        this.A02 = interfaceC42161x6;
    }
}
