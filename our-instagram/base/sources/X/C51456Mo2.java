package X;

/* renamed from: X.Mo2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51456Mo2 extends AbstractC53421NkA {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public C51456Mo2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, int i4) {
        AbstractC167007dF.A1H(str2, 2, str3);
        this.A09 = str;
        this.A0A = str2;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A0B = str3;
        this.A05 = str4;
        this.A08 = str5;
        this.A06 = str6;
        this.A04 = str7;
        this.A07 = str8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51456Mo2) {
                C51456Mo2 c51456Mo2 = (C51456Mo2) obj;
                if (!C14360o3.A0K(this.A09, c51456Mo2.A09) || !C14360o3.A0K(this.A0A, c51456Mo2.A0A) || this.A01 != c51456Mo2.A01 || this.A02 != c51456Mo2.A02 || this.A03 != c51456Mo2.A03 || this.A00 != c51456Mo2.A00 || !C14360o3.A0K(this.A0B, c51456Mo2.A0B) || !C14360o3.A0K(this.A05, c51456Mo2.A05) || !C14360o3.A0K(this.A08, c51456Mo2.A08) || !C14360o3.A0K(this.A06, c51456Mo2.A06) || !C14360o3.A0K(this.A04, c51456Mo2.A04) || !C14360o3.A0K(this.A07, c51456Mo2.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A07, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A0B, (((((((AbstractC166997dE.A0K(this.A0A, AbstractC166987dD.A0J(this.A09)) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + this.A00) * 31))))));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ODRTemplateGenerateSuccessEvent(templateFilePath=");
        A1C.append(this.A09);
        A1C.append(", templateId=");
        A1C.append(this.A0A);
        A1C.append(", templateFrameCount=");
        A1C.append(this.A01);
        A1C.append(AbstractC43591JPw.A00(517));
        A1C.append(this.A02);
        A1C.append(AbstractC43591JPw.A00(518));
        A1C.append(this.A03);
        A1C.append(", fps=");
        A1C.append(this.A00);
        A1C.append(", templatePackName=");
        A1C.append(this.A0B);
        A1C.append(", instructionKeyId=");
        A1C.append(this.A05);
        A1C.append(", stableId=");
        A1C.append(this.A08);
        A1C.append(", mediaTemplateId=");
        A1C.append(this.A06);
        A1C.append(", accessibilityLabel=");
        A1C.append(this.A04);
        A1C.append(", mediaTemplateName=");
        return AbstractC25236BEt.A0Y(this.A07, A1C);
    }
}
