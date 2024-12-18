package X;

/* loaded from: classes6.dex */
public final class FRT {
    public final Integer A00;
    public final Integer A01;

    public FRT(Integer num, Integer num2) {
        C14360o3.A0B(num2, 2);
        this.A00 = num;
        this.A01 = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FRT) {
                FRT frt = (FRT) obj;
                if (this.A00 != frt.A00 || this.A01 != frt.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        int intValue = this.A00.intValue();
        if (intValue != 0) {
            str = "COMPOSER_PLUS";
        } else {
            str = "COMPOSER";
        }
        int hashCode = (str.hashCode() + intValue) * 31;
        int intValue2 = this.A01.intValue();
        if (intValue2 != 0) {
            str2 = "GROUP";
        } else {
            str2 = "ONE_TO_ONE";
        }
        return hashCode + str2.hashCode() + intValue2;
    }

    public final String toString() {
        String str;
        String str2;
        if (this.A00.intValue() != 0) {
            str = "COMPOSER_PLUS";
        } else {
            str = "COMPOSER";
        }
        String A00 = AbstractC111324zv.A00(1457);
        if (this.A01.intValue() != 0) {
            str2 = "GROUP";
        } else {
            str2 = "ONE_TO_ONE";
        }
        return AnonymousClass001.A0v("MetaAIPromptSheetLoggingParams(entryPoint=", str, A00, str2, ')');
    }
}
