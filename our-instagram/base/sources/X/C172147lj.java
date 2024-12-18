package X;

/* renamed from: X.7lj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172147lj extends AbstractC172157lk {
    public EnumC171727l2 A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C172147lj) && this.A00 == ((C172147lj) obj).A00);
    }

    @Override // X.C1OX
    public final String getTypeName() {
        return "SIDE_BY_SIDE";
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C172147lj() {
        EnumC171727l2 enumC171727l2 = EnumC171727l2.A05;
        C14360o3.A0B(enumC171727l2, 1);
        this.A00 = enumC171727l2;
    }
}
