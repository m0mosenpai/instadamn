package X;

import java.util.List;

/* renamed from: X.W5l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70126W5l {
    public UXS A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;

    public C70126W5l(UXS uxs, String str, String str2, List list, List list2, List list3, List list4, List list5, boolean z, boolean z2) {
        AbstractC167007dF.A1G(list, 1, uxs);
        this.A02 = list;
        this.A04 = list2;
        this.A03 = list3;
        this.A01 = list4;
        this.A00 = uxs;
        this.A05 = str;
        this.A09 = z;
        this.A08 = z2;
        this.A06 = str2;
        this.A07 = list5;
    }

    public static /* synthetic */ C70126W5l A00(C70126W5l c70126W5l, String str, List list, int i) {
        List list2;
        List list3;
        List list4;
        UXS uxs;
        boolean z;
        boolean z2;
        String str2;
        String str3 = str;
        List list5 = list;
        List list6 = null;
        if ((i & 1) != 0) {
            list5 = c70126W5l.A02;
        }
        if ((i & 2) != 0) {
            list2 = c70126W5l.A04;
        } else {
            list2 = null;
        }
        if ((i & 4) != 0) {
            list3 = c70126W5l.A03;
        } else {
            list3 = null;
        }
        if ((i & 8) != 0) {
            list4 = c70126W5l.A01;
        } else {
            list4 = null;
        }
        if ((i & 16) != 0) {
            uxs = c70126W5l.A00;
        } else {
            uxs = null;
        }
        if ((i & 32) != 0) {
            str3 = c70126W5l.A05;
        }
        if ((i & 64) != 0) {
            z = c70126W5l.A09;
        } else {
            z = false;
        }
        if ((i & 128) != 0) {
            z2 = c70126W5l.A08;
        } else {
            z2 = false;
        }
        if ((i & 256) != 0) {
            str2 = c70126W5l.A06;
        } else {
            str2 = null;
        }
        if ((i & 512) != 0) {
            list6 = c70126W5l.A07;
        }
        C14360o3.A0B(list5, 0);
        AbstractC167027dH.A0a(1, list2, list3, list4, uxs);
        C14360o3.A0B(list6, 9);
        return new C70126W5l(uxs, str3, str2, list5, list2, list3, list4, list6, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C70126W5l) {
                C70126W5l c70126W5l = (C70126W5l) obj;
                if (!C14360o3.A0K(this.A02, c70126W5l.A02) || !C14360o3.A0K(this.A04, c70126W5l.A04) || !C14360o3.A0K(this.A03, c70126W5l.A03) || !C14360o3.A0K(this.A01, c70126W5l.A01) || !C14360o3.A0K(this.A00, c70126W5l.A00) || !C14360o3.A0K(this.A05, c70126W5l.A05) || this.A09 != c70126W5l.A09 || this.A08 != c70126W5l.A08 || !C14360o3.A0K(this.A06, c70126W5l.A06) || !C14360o3.A0K(this.A07, c70126W5l.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0D = AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A09, (AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A04, this.A02.hashCode() * 31)))) + AbstractC167017dG.A0O(this.A05)) * 31));
        String str = this.A06;
        if (str != null) {
            i = str.hashCode();
        }
        return ((A0D + i) * 31) + this.A07.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentMethodComponentData(availablePaymentMethods=");
        sb.append(this.A02);
        sb.append(", unsupportedPaymentMethods=");
        sb.append(this.A04);
        sb.append(", newCredentialOptions=");
        sb.append(this.A03);
        sb.append(", apmOptions=");
        sb.append(this.A01);
        sb.append(", paymentAddressFormConfig=");
        sb.append(this.A00);
        sb.append(", addedPaymentMethodId=");
        sb.append(this.A05);
        sb.append(", shouldOrderNewOptionsFirst=");
        sb.append(this.A09);
        sb.append(", shouldDeprioritizeCreditCard=");
        sb.append(this.A08);
        sb.append(", orderId=");
        sb.append(this.A06);
        sb.append(", cardFormFieldConfig=");
        return AbstractC167017dG.A0o(this.A07, sb);
    }
}
