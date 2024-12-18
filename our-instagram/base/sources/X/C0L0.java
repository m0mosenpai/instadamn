package X;

/* renamed from: X.0L0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0L0 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L0(C211211o c211211o) {
        super(0);
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(c211211o) { // from class: X.13c
            public final C211211o A00;

            @Override // X.AbstractC211911v
            public final String A06() {
                return "AdsCacheInitializer";
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
            /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
            @Override // X.AbstractC211911v
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void A07() {
                /*
                    r7 = this;
                    X.11o r0 = r7.A00
                    X.11v r0 = r0.A00()
                    X.122 r0 = (X.AnonymousClass122) r0
                    X.0ll r3 = r0.A08()
                    boolean r0 = r3 instanceof com.instagram.common.session.UserSession
                    if (r0 == 0) goto Le0
                    X.0Tz r2 = X.C06090Tz.A05
                    r0 = 36310538287710372(0x81003e003e00a4, double:3.026268851725473E-306)
                    boolean r0 = X.C18U.A06(r2, r3, r0)
                    if (r0 == 0) goto L39
                    r0 = 36597180106214128(0x8204f100030af0, double:3.2075422919612074E-306)
                    long r4 = X.C18U.A01(r2, r3, r0)
                    int r1 = (int) r4
                    if (r1 == 0) goto Lf6
                    r0 = 1
                    if (r1 == r0) goto Le8
                    r0 = 2
                    if (r1 != r0) goto L39
                    X.1Iz r1 = X.AbstractC24641Ih.A02
                    X.NGs r0 = new X.NGs
                    r0.<init>(r3)
                    r1.Ep8(r0)
                L39:
                    r0 = 36310538288693422(0x81003e004d00ae, double:3.0262688523471577E-306)
                    boolean r0 = X.C18U.A06(r2, r3, r0)
                    if (r0 == 0) goto L5a
                    X.1Pi r5 = X.C26271Pi.A02
                    X.1PB r4 = X.C1PB.A00
                    r0 = 17
                    X.MLi r1 = new X.MLi
                    r1.<init>(r3, r0)
                    r0 = 0
                    X.C14360o3.A0B(r4, r0)
                    X.1Pj r0 = r5.A00(r4)
                    r1.invoke(r0)
                L5a:
                    X.0Tz r4 = X.C06090Tz.A06
                    r0 = 2342160801698158155(0x208106d70010164b, double:4.063714094321314E-152)
                    boolean r0 = X.C18U.A06(r4, r3, r0)
                    if (r0 == 0) goto L7d
                    X.1Pi r6 = X.C26271Pi.A02
                    X.1PB r5 = X.C1PB.A00
                    r0 = 31
                    X.9Ee r1 = new X.9Ee
                    r1.<init>(r3, r0)
                    r0 = 0
                    X.C14360o3.A0B(r5, r0)
                    X.1Pj r0 = r6.A00(r5)
                    r1.invoke(r0)
                L7d:
                    r0 = 36318797505763820(0x8107c1000019ec, double:3.031492014479675E-306)
                    boolean r0 = X.C18U.A06(r2, r3, r0)
                    if (r0 != 0) goto Le1
                    r0 = 36318797505894893(0x8107c1000219ed, double:3.031492014562566E-306)
                    boolean r0 = X.C18U.A06(r4, r3, r0)
                    if (r0 != 0) goto Le1
                    r0 = 36319347261578433(0x81084100001cc1, double:3.0318396822705253E-306)
                    boolean r0 = X.C18U.A06(r2, r3, r0)
                    if (r0 != 0) goto La9
                    r0 = 36319347261709506(0x81084100021cc2, double:3.0318396823534164E-306)
                    boolean r0 = X.C18U.A06(r4, r3, r0)
                    if (r0 == 0) goto Lbf
                La9:
                    X.1Pi r5 = X.C26271Pi.A02
                    X.2sN r2 = X.C62222sN.A00
                    r0 = 22
                Laf:
                    X.MLi r1 = new X.MLi
                    r1.<init>(r3, r0)
                    r0 = 0
                    X.C14360o3.A0B(r2, r0)
                    X.1Pj r0 = r5.A00(r2)
                    r1.invoke(r0)
                Lbf:
                    r0 = 36321619299280520(0x810a5200002688, double:3.0332765280620866E-306)
                    boolean r0 = X.C18U.A06(r4, r3, r0)
                    if (r0 == 0) goto Le0
                    X.1Pi r4 = X.C26271Pi.A02
                    X.1PB r2 = X.C1PB.A00
                    r0 = 24
                    X.MLi r1 = new X.MLi
                    r1.<init>(r3, r0)
                    r0 = 0
                    X.C14360o3.A0B(r2, r0)
                    X.1Pj r0 = r4.A00(r2)
                    r1.invoke(r0)
                Le0:
                    return
                Le1:
                    X.1Pi r5 = X.C26271Pi.A02
                    X.2sN r2 = X.C62222sN.A00
                    r0 = 20
                    goto Laf
                Le8:
                    X.0nS r1 = X.C14120nc.A00()
                    X.NG8 r0 = new X.NG8
                    r0.<init>(r3)
                    r1.ATO(r0)
                    goto L39
                Lf6:
                    r0 = r3
                    com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
                    X.C1P7.A02(r0)
                    goto L39
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C215013c.A07():void");
            }

            {
                this.A00 = c211211o;
            }
        };
    }
}
