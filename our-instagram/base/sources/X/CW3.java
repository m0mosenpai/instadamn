package X;

/* loaded from: classes5.dex */
public final class CW3 {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public CW3(Integer num, String str, String str2, String str3) {
        C14360o3.A0B(num, 4);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CW3) {
                CW3 cw3 = (CW3) obj;
                if (!C14360o3.A0K(this.A02, cw3.A02) || !C14360o3.A0K(this.A03, cw3.A03) || !C14360o3.A0K(this.A01, cw3.A01) || this.A00 != cw3.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02)));
        Integer num = this.A00;
        return A0K + AbstractC25230BEn.A0C(num, CL1.A00(num));
    }

    public final String toString() {
        return AnonymousClass001.A17("MetaAIPromptSheetPrompt(id=", this.A02, ", text=", this.A03, ", emojiText=", this.A01, ", action=", CL1.A00(this.A00), ')');
    }
}
