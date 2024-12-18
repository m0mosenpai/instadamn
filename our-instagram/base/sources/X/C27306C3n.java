package X;

/* renamed from: X.C3n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27306C3n extends AbstractC27455C9x {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27306C3n) {
                C27306C3n c27306C3n = (C27306C3n) obj;
                if (!C14360o3.A0K(this.A02, c27306C3n.A02) || !C14360o3.A0K(this.A03, c27306C3n.A03) || this.A01 != c27306C3n.A01 || this.A00 != c27306C3n.A00 || this.A04 != c27306C3n.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02));
        Integer num = this.A01;
        int A0L = AbstractC167017dG.A0L(num, AbstractC27729CKw.A00(num), A0K);
        Integer num2 = this.A00;
        return AbstractC166987dD.A0K(this.A04, AbstractC167017dG.A0L(num2, CZF.A01(num2), A0L));
    }

    public C27306C3n(Integer num, Integer num2, String str, String str2, boolean z) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = num;
        this.A00 = num2;
        this.A04 = z;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Download(imageId=");
        AbstractC25235BEs.A1K(A1C, this.A02);
        A1C.append(this.A03);
        A1C.append(", mediaType=");
        Integer num = this.A01;
        if (num != null) {
            str = AbstractC27729CKw.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(AbstractC111324zv.A00(565));
        Integer num2 = this.A00;
        if (num2 != null) {
            str2 = CZF.A01(num2);
        } else {
            str2 = "null";
        }
        A1C.append(str2);
        A1C.append(", isEditScreen=");
        return AbstractC25236BEt.A0a(A1C, this.A04);
    }
}
