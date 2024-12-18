package X;

/* renamed from: X.MnE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51406MnE extends AbstractC53420Nk9 {
    public final Integer A00;
    public final String A01;
    public final boolean A02;
    public final String A03;

    public C51406MnE(Integer num, String str, String str2, boolean z) {
        C14360o3.A0B(num, 3);
        this.A02 = z;
        this.A01 = str;
        this.A00 = num;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51406MnE) {
                C51406MnE c51406MnE = (C51406MnE) obj;
                if (this.A02 != c51406MnE.A02 || !C14360o3.A0K(this.A01, c51406MnE.A01) || this.A00 != c51406MnE.A00 || !C14360o3.A0K(this.A03, c51406MnE.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AbstractC166997dE.A0K(this.A01, AbstractC25225BEi.A08(this.A02));
        Integer num = this.A00;
        return AbstractC25226BEj.A03(this.A03, AbstractC167017dG.A0L(num, AbstractC72879XqD.A01(num), A0K));
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AvatarGenerationEnd(fromCache=");
        A1C.append(this.A02);
        A1C.append(", requestId=");
        A1C.append(this.A01);
        A1C.append(", resultCode=");
        Integer num = this.A00;
        if (num != null) {
            str = AbstractC72879XqD.A01(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", cdlResultCode=");
        return AbstractC25236BEt.A0Y(this.A03, A1C);
    }
}
