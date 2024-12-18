package X;

/* renamed from: X.7l3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C171737l3 extends AbstractC172157lk {
    public float A00 = 1.0f;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C171737l3) && Float.compare(this.A00, ((C171737l3) obj).A00) == 0);
    }

    @Override // X.C1OX
    public final String getTypeName() {
        return "PICTURE_IN_PICTURE";
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }
}
