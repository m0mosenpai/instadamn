package X;

/* loaded from: classes5.dex */
public final class CW0 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final Integer A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CW0) {
                CW0 cw0 = (CW0) obj;
                if (this.A03 != cw0.A03 || !C14360o3.A0K(this.A02, cw0.A02) || !C14360o3.A0K(this.A00, cw0.A00) || !C14360o3.A0K(this.A01, cw0.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A03.intValue();
        if (intValue != 0) {
            str = "CREATED";
        } else {
            str = "GENERATED";
        }
        return ((AbstractC166997dE.A0K(this.A02, AbstractC25228BEl.A0F(str, intValue)) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public final String toString() {
        String str;
        if (this.A03.intValue() != 0) {
            str = "CREATED";
        } else {
            str = "GENERATED";
        }
        return AnonymousClass001.A17("PromptSummaryData(summaryType=", str, ", summaryText=", this.A02, ", requestId=", this.A00, ", responseId=", this.A01, ')');
    }

    public CW0(Integer num, String str, String str2, String str3) {
        this.A03 = num;
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
