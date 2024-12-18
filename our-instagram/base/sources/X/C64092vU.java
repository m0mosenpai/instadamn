package X;

/* renamed from: X.2vU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64092vU {
    public static final InterfaceC14020nS A03 = new InterfaceC14020nS() { // from class: X.2vV
        @Override // X.InterfaceC14020nS
        public final void ATN(C14160ng c14160ng) {
            throw new UnsupportedOperationException();
        }

        @Override // X.InterfaceC14020nS
        public final void ATO(AbstractRunnableC14200nk abstractRunnableC14200nk) {
            abstractRunnableC14200nk.run();
        }
    };
    public final InterfaceC11360iu A00;
    public final C005001p A01 = new C005001p(50);
    public final InterfaceC14020nS A02;

    public final C82383m1 A00(String str) {
        C005001p c005001p = this.A01;
        C82383m1 c82383m1 = (C82383m1) c005001p.get(str);
        if (c82383m1 == null) {
            C82383m1 c82383m12 = new C82383m1();
            c005001p.put(str, c82383m12);
            return c82383m12;
        }
        return c82383m1;
    }

    public final void A01(final InterfaceC64122vX interfaceC64122vX, C82383m1 c82383m1, Object obj, Object obj2) {
        if (c82383m1.A05 >= 250) {
            String str = c82383m1.A07;
            if (str == null) {
                str = C1QM.A00.A02.A00;
            }
            final Object AGl = interfaceC64122vX.AGl(c82383m1, obj, obj2, str);
            this.A02.ATO(new AbstractRunnableC14200nk() { // from class: X.5nn
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(347);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Object obj3 = AGl;
                    if (obj3 != null) {
                        this.A00.EHW(interfaceC64122vX.AMA(obj3));
                    }
                }
            });
        }
        c82383m1.A02();
    }

    public C64092vU(InterfaceC11360iu interfaceC11360iu, boolean z) {
        InterfaceC14020nS interfaceC14020nS;
        this.A00 = interfaceC11360iu;
        if (z) {
            C0o0 A00 = AbstractC14350nz.A00();
            A00.A01 = "VpvdImpressionsHelper-worker";
            interfaceC14020nS = new C18240vB(A00);
        } else {
            interfaceC14020nS = A03;
        }
        this.A02 = interfaceC14020nS;
    }
}
