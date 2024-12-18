package X;

/* renamed from: X.0Hs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03560Hs extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03560Hs(C211211o c211211o) {
        super(0);
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(c211211o) { // from class: X.14k
            public final C211211o A00;

            @Override // X.AbstractC211911v
            public final String A06() {
                return "MediaCodecTrackingInitializer";
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [X.0IK, java.lang.Object] */
            @Override // X.AbstractC211911v
            public final void A07() {
                C211211o c211211o2 = this.A00;
                AbstractC12990ll A08 = ((AnonymousClass122) c211211o2.A00()).A08();
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, A08, 36321902767187846L)) {
                    C006802i c006802i = C006802i.A0p;
                    C14360o3.A07(c006802i);
                    C0IL.A01(new C0I4(c006802i));
                }
                if (C18U.A06(c06090Tz, ((AnonymousClass122) c211211o2.A00()).A08(), 36321902767122309L)) {
                    C0IL.A01(new Object());
                }
            }

            {
                this.A00 = c211211o;
            }
        };
    }
}
