package X;

import com.instagram.api.schemas.ErrorHandlingResponseType;
import com.instagram.api.schemas.ErrorLevel;
import java.util.List;

/* loaded from: classes11.dex */
public final class UPI extends C0T6 {
    public final ErrorHandlingResponseType A00;
    public final ErrorLevel A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public UPI(ErrorHandlingResponseType errorHandlingResponseType, ErrorLevel errorLevel, String str, String str2, String str3, String str4, List list) {
        C14360o3.A0B(errorHandlingResponseType, 7);
        this.A02 = str;
        this.A06 = list;
        this.A03 = str2;
        this.A01 = errorLevel;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = errorHandlingResponseType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPI) {
                UPI upi = (UPI) obj;
                if (!C14360o3.A0K(this.A02, upi.A02) || !C14360o3.A0K(this.A06, upi.A06) || !C14360o3.A0K(this.A03, upi.A03) || this.A01 != upi.A01 || !C14360o3.A0K(this.A04, upi.A04) || !C14360o3.A0K(this.A05, upi.A05) || this.A00 != upi.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31;
        String str = this.A05;
        if (str != null) {
            i = str.hashCode();
        }
        return ((A0O + i) * 31) + this.A00.hashCode();
    }
}
