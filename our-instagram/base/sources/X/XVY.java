package X;

import java.util.List;

/* loaded from: classes12.dex */
public final class XVY extends C0T6 {
    public final int A00;
    public final long A01;
    public final XVS A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public XVY(XVS xvs, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, long j) {
        AbstractC167027dH.A0a(1, str, str2, str3, str4);
        AbstractC167007dF.A1H(str5, 5, list);
        C14360o3.A0B(str6, 9);
        C14360o3.A0B(xvs, 10);
        this.A08 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A03 = str4;
        this.A07 = str5;
        this.A00 = i;
        this.A09 = list;
        this.A01 = j;
        this.A04 = str6;
        this.A02 = xvs;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XVY) {
                XVY xvy = (XVY) obj;
                if (!C14360o3.A0K(this.A08, xvy.A08) || !C14360o3.A0K(this.A05, xvy.A05) || !C14360o3.A0K(this.A06, xvy.A06) || !C14360o3.A0K(this.A03, xvy.A03) || !C14360o3.A0K(this.A07, xvy.A07) || this.A00 != xvy.A00 || !C14360o3.A0K(this.A09, xvy.A09) || this.A01 != xvy.A01 || !C14360o3.A0K(this.A04, xvy.A04) || !C14360o3.A0K(this.A02, xvy.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0K(this.A04, AbstractC25236BEt.A01(this.A01, AbstractC166997dE.A0J(this.A09, (AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A08))))) + this.A00) * 31))));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AFIRealtimeInfo(signalId=");
        A1C.append(this.A08);
        A1C.append(", containerModule=");
        AbstractC72048XLo.A1T(A1C, this.A05);
        AbstractC72048XLo.A1R(A1C, this.A06);
        AbstractC72048XLo.A1Q(A1C, this.A03);
        AbstractC72048XLo.A1S(A1C, this.A07);
        A1C.append(this.A00);
        A1C.append(", mediaIds=");
        A1C.append(this.A09);
        A1C.append(", clickTimestamp=");
        A1C.append(this.A01);
        A1C.append(", clickMediaId=");
        A1C.append(this.A04);
        A1C.append(", afiLoggingInfo=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
