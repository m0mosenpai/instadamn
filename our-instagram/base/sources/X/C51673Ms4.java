package X;

/* renamed from: X.Ms4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51673Ms4 extends C0T6 {
    public final long A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Boolean A06;
    public final String A07;

    public C51673Ms4(Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, long j) {
        C14360o3.A0B(str2, 2);
        this.A07 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A00 = j;
        this.A01 = num;
        this.A05 = str5;
        this.A06 = bool;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51673Ms4) {
                C51673Ms4 c51673Ms4 = (C51673Ms4) obj;
                if (!C14360o3.A0K(this.A07, c51673Ms4.A07) || !C14360o3.A0K(this.A04, c51673Ms4.A04) || !C14360o3.A0K(this.A02, c51673Ms4.A02) || !C14360o3.A0K(this.A03, c51673Ms4.A03) || this.A00 != c51673Ms4.A00 || this.A01 != c51673Ms4.A01 || !C14360o3.A0K(this.A05, c51673Ms4.A05) || !C14360o3.A0K(this.A06, c51673Ms4.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A01 = AbstractC25236BEt.A01(this.A00, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A07)))));
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "IMAGE";
                break;
            case 2:
                str = "IMAGE_PHOTO";
                break;
            default:
                str = "AUDIO";
                break;
        }
        return AbstractC166997dE.A0K(this.A05, AbstractC25231BEo.A0H(str, intValue, A01)) + AbstractC167017dG.A0M(this.A06);
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CapturedSnapshot(sessionId=");
        A1C.append(this.A07);
        A1C.append(", playerSessionId=");
        A1C.append(this.A04);
        A1C.append(", fullFilePath=");
        A1C.append(this.A02);
        A1C.append(", mimeType=");
        A1C.append(this.A03);
        A1C.append(", previewTimestampUs=");
        A1C.append(this.A00);
        A1C.append(", type=");
        Integer num = this.A01;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "IMAGE";
                    break;
                case 2:
                    str = "IMAGE_PHOTO";
                    break;
                default:
                    str = "AUDIO";
                    break;
            }
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(AbstractC58317Pt9.A00(155));
        A1C.append(this.A05);
        A1C.append(", isFinalSnapshot=");
        return AbstractC167017dG.A0o(this.A06, A1C);
    }
}
