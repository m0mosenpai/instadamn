package X;

import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SZD {
    public String A00;
    public Map A01;
    public final C63187Sem A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public SZD(C63187Sem c63187Sem, String str, String str2, String str3, String str4, List list) {
        this.A03 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A02 = c63187Sem;
        this.A04 = str4;
        this.A07 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("{clientIdentifier='");
        A1C.append(this.A03);
        A1C.append("', willTopic='");
        A1C.append(this.A06);
        A1C.append("', willMessage='");
        A1C.append(this.A05);
        A1C.append("', userName='");
        A1C.append(this.A02);
        A1C.append("', phpOverride='");
        A1C.append(this.A00);
        A1C.append("'");
        return AbstractC167027dH.A0R(A1C);
    }

    public SZD(C63187Sem c63187Sem, String str, String str2, List list, Map map) {
        this.A03 = str;
        this.A07 = list;
        this.A06 = null;
        this.A05 = null;
        this.A02 = c63187Sem;
        this.A04 = str2;
        this.A01 = map;
    }
}
