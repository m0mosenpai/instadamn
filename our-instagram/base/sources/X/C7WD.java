package X;

/* renamed from: X.7WD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7WD {
    public final /* synthetic */ C7W4 A00;

    public C7WD(C7W4 c7w4) {
        this.A00 = c7w4;
    }

    public final boolean A00() {
        C7W4 c7w4 = this.A00;
        C7U0 c7u0 = c7w4.A08;
        if (c7u0 == null) {
            C14360o3.A0F("clientInfra");
            throw C00O.createAndThrow();
        }
        C7TT C7W = c7u0.C7r().C7W();
        if (C7W.A08 != 29 || C7W.A0n) {
            return true;
        }
        if (!C18U.A06(C06090Tz.A05, c7w4.A0d, 36319377331920238L)) {
            return true;
        }
        return false;
    }
}
