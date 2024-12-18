package X;

/* renamed from: X.L9n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47805L9n {
    public final EnumC46206Kci A00;
    public final String A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;

    public C47805L9n(EnumC46206Kci enumC46206Kci, Integer num, Long l, String str, String str2, String str3) {
        AbstractC25229BEm.A1I(str, 2, num);
        this.A03 = l;
        this.A01 = str;
        this.A05 = str2;
        this.A00 = enumC46206Kci;
        this.A04 = str3;
        this.A02 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47805L9n) {
                C47805L9n c47805L9n = (C47805L9n) obj;
                if (!C14360o3.A0K(this.A03, c47805L9n.A03) || !C14360o3.A0K(this.A01, c47805L9n.A01) || !C14360o3.A0K(this.A05, c47805L9n.A05) || this.A00 != c47805L9n.A00 || !C14360o3.A0K(this.A04, c47805L9n.A04) || this.A02 != c47805L9n.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J = (AbstractC166997dE.A0J(this.A00, (AbstractC166997dE.A0K(this.A01, AbstractC167017dG.A0M(this.A03) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A04)) * 31;
        Integer num = this.A02;
        return A0J + AbstractC25230BEn.A0C(num, AbstractC46544Kij.A00(num));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VirtualDeviceMetadata(creationTimeSeconds=");
        A1C.append(this.A03);
        A1C.append(", id=");
        A1C.append(this.A01);
        A1C.append(", createdOn=");
        A1C.append(this.A05);
        A1C.append(", type=");
        A1C.append(this.A00);
        A1C.append(", cloudAccount=");
        A1C.append(this.A04);
        A1C.append(", migrationStatus=");
        return AbstractC25236BEt.A0Y(AbstractC46544Kij.A00(this.A02), A1C);
    }
}
