package X;

/* renamed from: X.4JL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4JL extends C46h {
    public final Object A00;

    @Override // X.C46h
    public final boolean equals(Object object) {
        if (object instanceof C4JL) {
            return this.A00.equals(((C4JL) object).A00);
        }
        return false;
    }

    @Override // X.C46h
    public final int hashCode() {
        return this.A00.hashCode() + 1502476572;
    }

    @Override // X.C46h
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC58317Pt9.A00(193));
        sb.append(this.A00);
        sb.append(")");
        return sb.toString();
    }

    public C4JL(Object reference) {
        this.A00 = reference;
    }
}
