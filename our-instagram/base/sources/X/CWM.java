package X;

/* loaded from: classes5.dex */
public final class CWM {
    public final C27989CVm A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final C09530e4 A0C;
    public final boolean A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CWM) {
                CWM cwm = (CWM) obj;
                if (!C14360o3.A0K(this.A0A, cwm.A0A) || !C14360o3.A0K(this.A04, cwm.A04) || !C14360o3.A0K(this.A05, cwm.A05) || !C14360o3.A0K(this.A03, cwm.A03) || !C14360o3.A0K(this.A06, cwm.A06) || !C14360o3.A0K(this.A08, cwm.A08) || !C14360o3.A0K(this.A07, cwm.A07) || this.A02 != cwm.A02 || !C14360o3.A0K(this.A0C, cwm.A0C) || this.A01 != cwm.A01 || !C14360o3.A0K(this.A09, cwm.A09) || !C14360o3.A0K(this.A0B, cwm.A0B) || !C14360o3.A0K(this.A00, cwm.A00) || this.A0D != cwm.A0D) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = (((((((AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A0A))) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31;
        Integer num = this.A02;
        int A0J = AbstractC166997dE.A0J(this.A0C, AbstractC167017dG.A0L(num, AbstractC27729CKw.A00(num), A0K));
        Integer num2 = this.A01;
        return AbstractC166987dD.A0K(this.A0D, (((((AbstractC167017dG.A0L(num2, CZF.A01(num2), A0J) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC166997dE.A0I(this.A00)) * 31);
    }

    public CWM(C27989CVm c27989CVm, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, C09530e4 c09530e4, boolean z) {
        AbstractC167027dH.A13(str, str2, str3);
        C14360o3.A0B(num2, 10);
        this.A0A = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A03 = str4;
        this.A06 = str5;
        this.A08 = str6;
        this.A07 = str7;
        this.A02 = num;
        this.A0C = c09530e4;
        this.A01 = num2;
        this.A09 = str8;
        this.A0B = str9;
        this.A00 = c27989CVm;
        this.A0D = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ImagineGeneratedMedia(uri=");
        A1C.append(this.A0A);
        A1C.append(", id=");
        A1C.append(this.A04);
        A1C.append(", prompt=");
        A1C.append(this.A05);
        A1C.append(", displayPrompt=");
        A1C.append(this.A03);
        A1C.append(AbstractC111324zv.A00(1443));
        A1C.append(this.A06);
        A1C.append(", responseId=");
        A1C.append(this.A08);
        A1C.append(", requestId=");
        A1C.append(this.A07);
        A1C.append(", mediaType=");
        A1C.append(AbstractC27729CKw.A00(this.A02));
        A1C.append(", mediaResolution=");
        A1C.append(this.A0C);
        A1C.append(AbstractC111324zv.A00(565));
        A1C.append(CZF.A01(this.A01));
        A1C.append(", trackingToken=");
        A1C.append(this.A09);
        A1C.append(AbstractC111324zv.A00(1463));
        A1C.append(this.A0B);
        A1C.append(", generatedPromptSummaryData=");
        A1C.append(this.A00);
        A1C.append(", isMediaPersonalized=");
        return AbstractC25236BEt.A0a(A1C, this.A0D);
    }
}
