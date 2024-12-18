package X;

/* renamed from: X.L9j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47801L9j {
    public final long A00;
    public final long A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47801L9j) {
                C47801L9j c47801L9j = (C47801L9j) obj;
                if (this.A03 != c47801L9j.A03 || !C14360o3.A0K(this.A02, c47801L9j.A02) || this.A01 != c47801L9j.A01 || this.A00 != c47801L9j.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public C47801L9j(long j, String str, boolean z, long j2) {
        this.A03 = z;
        this.A02 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    public final int hashCode() {
        int A07 = AbstractC167007dF.A07(this.A01, AbstractC166997dE.A0K(this.A02, AbstractC167007dF.A0D(this.A03, 38161)));
        long j = this.A00;
        return A07 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("StickerTypeaheadConfigParams(getStickerConcurrently=");
        A1C.append(true);
        A1C.append(", typeaheadLibEnabled=");
        A1C.append(this.A03);
        A1C.append(", liveRules=");
        A1C.append(this.A02);
        A1C.append(", triggerMinLen=");
        A1C.append(this.A01);
        A1C.append(", triggerMaxWord=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
