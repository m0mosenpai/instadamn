package X;

/* renamed from: X.R6k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60547R6k extends AbstractC64515THi {
    public final Object A00;

    @Override // X.AbstractC64515THi
    public final boolean equals(Object obj) {
        if (obj instanceof C60547R6k) {
            return this.A00.equals(((C60547R6k) obj).A00);
        }
        return false;
    }

    @Override // X.AbstractC64515THi
    public final int hashCode() {
        return this.A00.hashCode() + 1502476572;
    }

    public C60547R6k(Object obj) {
        this.A00 = obj;
    }

    public static C60547R6k A00(Object obj) {
        obj.getClass();
        return new C60547R6k(obj);
    }

    @Override // X.AbstractC64515THi
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Optional.of(");
        return AbstractC58323PtF.A0q(this.A00, A1C);
    }
}
