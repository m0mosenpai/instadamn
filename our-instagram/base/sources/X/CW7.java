package X;

/* loaded from: classes5.dex */
public final class CW7 {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CW7) {
                CW7 cw7 = (CW7) obj;
                if (!C14360o3.A0K(this.A02, cw7.A02) || !C14360o3.A0K(this.A01, cw7.A01) || !C14360o3.A0K(this.A03, cw7.A03) || !C14360o3.A0K(this.A04, cw7.A04) || this.A00 != cw7.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0K = (((AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31;
        int intValue = this.A00.intValue();
        if (intValue != 0) {
            str = "SQUARE";
        } else {
            str = "PORTRAIT";
        }
        return A0K + AbstractC25226BEj.A02(str, intValue);
    }

    public CW7(Integer num, String str, String str2, String str3, String str4) {
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = num;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FeedbackMedia(mediaUrl=");
        A1C.append(this.A02);
        A1C.append(", mediaId=");
        A1C.append(this.A01);
        A1C.append(", requestId=");
        A1C.append(this.A03);
        A1C.append(", responseId=");
        A1C.append(this.A04);
        A1C.append(AbstractC43591JPw.A00(56));
        if (this.A00.intValue() != 0) {
            str = "SQUARE";
        } else {
            str = "PORTRAIT";
        }
        return AbstractC25236BEt.A0Y(str, A1C);
    }
}
