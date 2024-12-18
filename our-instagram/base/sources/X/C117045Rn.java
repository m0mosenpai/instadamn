package X;

import java.util.List;

/* renamed from: X.5Rn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117045Rn {
    public C4NZ A00;
    public Integer A02;
    public String A03;
    public String A04;
    public List A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public String A05 = "";
    public C4NP A01 = new C4NP();

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("{ QPNode: ");
        sb.append(this.A03);
        sb.append(':');
        sb.append(this.A05);
        sb.append(':');
        sb.append(this.A02);
        sb.append(':');
        sb.append(this.A0A);
        sb.append(':');
        sb.append(this.A04);
        sb.append(':');
        sb.append(this.A08);
        sb.append(':');
        sb.append(this.A07);
        sb.append(':');
        sb.append(this.A0B);
        sb.append(":[");
        List list = this.A07;
        String str2 = null;
        if (list != null) {
            str = AbstractC001800i.A0P(", ", "", "", list, C65072Td1.A00);
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(":[");
        List list2 = this.A06;
        if (list2 != null) {
            str2 = AbstractC001800i.A0P(", ", "", "", list2, C65073Td2.A00);
        }
        sb.append(str2);
        sb.append("] contextual_filters");
        sb.append(this.A00);
        sb.append("] }");
        return sb.toString();
    }
}
