package X;

/* renamed from: X.Mo9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51462Mo9 extends AbstractC53423NkC {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51462Mo9) {
                C51462Mo9 c51462Mo9 = (C51462Mo9) obj;
                if (!C14360o3.A0K(this.A05, c51462Mo9.A05) || !C14360o3.A0K(this.A01, c51462Mo9.A01) || !C14360o3.A0K(this.A04, c51462Mo9.A04) || !C14360o3.A0K(this.A03, c51462Mo9.A03) || !C14360o3.A0K(this.A02, c51462Mo9.A02) || !C14360o3.A0K(this.A00, c51462Mo9.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0O(this.A05) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A00);
    }

    public C51462Mo9(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A05 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A02 = str5;
        this.A00 = str6;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TemplateMetaData(mediaTemplateKeyId=");
        A1C.append(this.A05);
        A1C.append(", instructionKeyId=");
        A1C.append(this.A01);
        A1C.append(", stableId=");
        A1C.append(this.A04);
        A1C.append(", mediaTemplateName=");
        A1C.append(this.A03);
        A1C.append(", mediaTemplateId=");
        A1C.append(this.A02);
        A1C.append(", accessibilityLabel=");
        return AbstractC25236BEt.A0Y(this.A00, A1C);
    }
}
