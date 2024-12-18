package X;

/* renamed from: X.CVn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27990CVn {
    public final CW7 A00;
    public final Integer A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27990CVn) {
                C27990CVn c27990CVn = (C27990CVn) obj;
                if (this.A01 != c27990CVn.A01 || !C14360o3.A0K(this.A02, c27990CVn.A02) || !C14360o3.A0K(this.A00, c27990CVn.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "IMAGE";
                break;
            case 2:
                str = "VIDEO";
                break;
            default:
                str = "TEXT";
                break;
        }
        return ((AbstractC25228BEl.A0F(str, intValue) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C27990CVn(CW7 cw7, Integer num, String str) {
        this.A01 = num;
        this.A02 = str;
        this.A00 = cw7;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FeedbackSuggestionPreviewState(previewType=");
        Integer num = this.A01;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "IMAGE";
                    break;
                case 2:
                    str = "VIDEO";
                    break;
                default:
                    str = "TEXT";
                    break;
            }
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", previewText=");
        A1C.append(this.A02);
        A1C.append(", generatedMedia=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
