package X;

/* renamed from: X.0Hm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03520Hm extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03520Hm(C211211o c211211o) {
        super(0);
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(c211211o) { // from class: X.13M
            public final C211211o A00;

            @Override // X.AbstractC211911v
            public final void A04(C226418s c226418s) {
                C14360o3.A0B(c226418s, 0);
                long j = this.A01;
                long j2 = super.A00;
                c226418s.A0Q(c226418s.A02, "MEMORY_MANAGER_INIT_START", j);
                c226418s.A0Q(c226418s.A02, "MEMORY_MANAGER_INIT_END", j2);
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "MemoryManagerInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                ((AnonymousClass122) this.A00.A00()).A08();
                int A01 = (int) C20150ym.A01(AbstractC20100yh.A00(36611774405024079L));
                boolean A07 = C20150ym.A07(AbstractC20100yh.A00(36330299428389670L));
                boolean A072 = C20150ym.A07(AbstractC20100yh.A00(36330299428455207L));
                int A012 = (int) C20150ym.A01(AbstractC20100yh.A00(36611774405220688L));
                int A013 = (int) C20150ym.A01(AbstractC20100yh.A00(36611774405286225L));
                int A014 = (int) C20150ym.A01(AbstractC20100yh.A00(36611774405351762L));
                boolean A073 = C20150ym.A07(AbstractC20100yh.A00(36316229117743293L));
                boolean A074 = C20150ym.A07(AbstractC20100yh.A00(2342169537661384638L));
                boolean A075 = C20150ym.A07(AbstractC20100yh.A00(36330299428258597L));
                int A015 = (int) C20150ym.A01(AbstractC20100yh.A00(36608003424655018L));
                boolean A076 = C20150ym.A07(AbstractC20100yh.A00(36326528448018368L));
                boolean A077 = C20150ym.A07(AbstractC20100yh.A00(2342169537661450175L));
                boolean A078 = C20150ym.A07(AbstractC20100yh.A00(36326528448411586L));
                boolean A079 = C20150ym.A07(AbstractC20100yh.A00(2342169537662171075L));
                boolean A0710 = C20150ym.A07(AbstractC20100yh.A00(2342169537662236612L));
                boolean A0711 = C20150ym.A07(AbstractC20100yh.A00(36326528448673734L));
                int A016 = (int) C20150ym.A01(AbstractC20100yh.A00(36608003425441452L));
                int A017 = (int) C20150ym.A01(AbstractC20100yh.A00(36611774405744980L));
                C006802i c006802i = C006802i.A0p;
                C14360o3.A07(c006802i);
                C1KG c1kg = new C1KG(c006802i, new C1KF(A01, A012, A013, A014, A015, A016, A017, true, true, true, A073, A07, A072, A075, A074, A077, A076, A078, A079, A0710, A0711));
                synchronized (C1KH.A01) {
                    C1KH.A00 = c1kg;
                }
            }

            {
                this.A00 = c211211o;
            }
        };
    }
}
