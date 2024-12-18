package X;

import com.instagram.api.schemas.PaymentCredentialTypeEnum;
import java.util.List;

/* loaded from: classes11.dex */
public final class UQ6 extends C0T6 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public UQ6(MUW muw, MUW muw2, PaymentCredentialTypeEnum paymentCredentialTypeEnum, String str, String str2, String str3, String str4, List list) {
        C14360o3.A0B(list, 6);
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A01 = muw;
        this.A02 = list;
        this.A03 = paymentCredentialTypeEnum;
        this.A04 = muw2;
    }

    public final boolean equals(Object obj) {
        UQ6 uq6;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof UQ6) {
                    uq6 = (UQ6) obj;
                    if (uq6.A00 != 1 || !C14360o3.A0K(this.A03, uq6.A03) || !C14360o3.A0K(this.A07, uq6.A07) || !C14360o3.A0K(this.A06, uq6.A06) || !C14360o3.A0K(this.A02, uq6.A02) || !C14360o3.A0K(this.A08, uq6.A08) || !C14360o3.A0K(this.A05, uq6.A05) || !C14360o3.A0K(this.A01, uq6.A01)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof UQ6)) {
                return false;
            }
            uq6 = (UQ6) obj;
            if (uq6.A00 != 0 || !C14360o3.A0K(this.A05, uq6.A05) || !C14360o3.A0K(this.A06, uq6.A06) || !C14360o3.A0K(this.A07, uq6.A07) || !C14360o3.A0K(this.A08, uq6.A08) || !C14360o3.A0K(this.A01, uq6.A01) || !C14360o3.A0K(this.A02, uq6.A02) || this.A03 != uq6.A03) {
                return false;
            }
        } else {
            return true;
        }
        if (!C14360o3.A0K(this.A04, uq6.A04)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0087, code lost:
    
        if (r0 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0045, code lost:
    
        if (r0 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008a, code lost:
    
        r2 = r0.hashCode();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            if (r0 == 0) goto L49
            java.lang.Object r0 = r3.A03
            r2 = 0
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A07
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A06
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A08
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A05
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A04
            if (r0 != 0) goto L8a
        L47:
            int r1 = r1 + r2
            return r1
        L49:
            java.lang.String r0 = r3.A05
            r2 = 0
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A06
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A07
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A08
            int r0 = X.AbstractC167017dG.A0O(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A01
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A02
            int r1 = X.AbstractC166997dE.A0J(r0, r1)
            java.lang.Object r0 = r3.A03
            int r0 = X.AbstractC167017dG.A0M(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A04
            if (r0 != 0) goto L8a
            goto L47
        L8a:
            int r2 = r0.hashCode()
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UQ6.hashCode():int");
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RtcMessageEventHeader(sequenceNumber=");
        sb.append(this.A03);
        sb.append(AbstractC111324zv.A00(1451));
        sb.append(this.A07);
        sb.append(", receiverUserId=");
        sb.append(this.A06);
        sb.append(", retryCount=");
        sb.append(this.A02);
        sb.append(AbstractC111324zv.A00(1459));
        sb.append(this.A08);
        sb.append(", conferenceName=");
        sb.append(this.A05);
        sb.append(", conferenceType=");
        sb.append(this.A01);
        sb.append(", type=");
        return AbstractC167017dG.A0o(this.A04, sb);
    }

    public UQ6(Integer num, Integer num2, Integer num3, Long l, String str, String str2, String str3, String str4) {
        this.A03 = l;
        this.A07 = str;
        this.A06 = str2;
        this.A02 = num;
        this.A08 = str3;
        this.A05 = str4;
        this.A01 = num2;
        this.A04 = num3;
    }
}
