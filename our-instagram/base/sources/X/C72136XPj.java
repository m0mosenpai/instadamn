package X;

/* renamed from: X.XPj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72136XPj extends C5Ti {
    public static final C72136XPj A00 = new C5Ti(0, 0);

    public C72136XPj() {
        super(0, 0);
    }

    @Override // X.C5Ti
    public final void A02(C5TZ c5tz, C5Z3 c5z3, C117565Tr c117565Tr, C5Z5 c5z5) {
        if (c117565Tr.A06 == 0) {
            C117565Tr.A04(c117565Tr);
            c117565Tr.A00 = 0;
            c117565Tr.A01 = (c117565Tr.A0I.length / 5) - c117565Tr.A04;
            c117565Tr.A02 = 0;
            c117565Tr.A03 = 0;
            c117565Tr.A07 = 0;
            return;
        }
        C5UC.A03("Cannot reset when inserting");
        throw C00O.createAndThrow();
    }
}
