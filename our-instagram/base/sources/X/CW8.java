package X;

/* loaded from: classes5.dex */
public final class CW8 {
    public final InterfaceC30851DhQ A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CW8) {
                CW8 cw8 = (CW8) obj;
                if (!C14360o3.A0K(this.A02, cw8.A02) || !C14360o3.A0K(this.A04, cw8.A04) || !C14360o3.A0K(this.A03, cw8.A03) || !C14360o3.A0K(this.A00, cw8.A00) || this.A01 != cw8.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0J = AbstractC166997dE.A0J(this.A00, ((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A03)) * 31);
        int intValue = this.A01.intValue();
        if (1 != intValue) {
            str = "SUGGESTED_PROMPT";
        } else {
            str = "SUGGESTED_CONTENT";
        }
        return A0J + AbstractC25226BEj.A02(str, intValue);
    }

    public CW8(InterfaceC30851DhQ interfaceC30851DhQ, Integer num, String str, String str2, String str3) {
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A00 = interfaceC30851DhQ;
        this.A01 = num;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("WriteWithAIContext(initialContent=");
        A1C.append(this.A02);
        A1C.append(", prompt=");
        A1C.append(this.A04);
        A1C.append(", initialPromptRequestId=");
        A1C.append(this.A03);
        A1C.append(", requestInput=");
        A1C.append(this.A00);
        A1C.append(", suggestedPromptType=");
        if (1 - this.A01.intValue() != 0) {
            str = "SUGGESTED_PROMPT";
        } else {
            str = "SUGGESTED_CONTENT";
        }
        return AbstractC25236BEt.A0Y(str, A1C);
    }
}
