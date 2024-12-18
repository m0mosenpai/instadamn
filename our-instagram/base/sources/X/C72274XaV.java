package X;

import com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ParcelableSignalData;
import java.util.List;
import java.util.Map;

/* renamed from: X.XaV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72274XaV extends AbstractC82583mM {
    public final long A00;
    public final XVS A01;
    public final EnumC64262vl A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public C72274XaV(XVS xvs, EnumC64262vl enumC64262vl, String str, String str2, String str3, String str4, String str5, List list, long j) {
        AbstractC167027dH.A0a(1, str, str2, str3, str4);
        C14360o3.A0B(list, 6);
        C14360o3.A0B(str5, 8);
        this.A05 = str;
        this.A06 = str2;
        this.A03 = str3;
        this.A07 = str4;
        this.A02 = enumC64262vl;
        this.A08 = list;
        this.A00 = j;
        this.A04 = str5;
        this.A01 = xvs;
    }

    @Override // X.AbstractC82583mM
    public final ParcelableSignalData A01() {
        String str = this.A05;
        String str2 = this.A06;
        String str3 = this.A03;
        String str4 = this.A07;
        EnumC64262vl enumC64262vl = this.A02;
        List list = this.A08;
        long j = this.A00;
        String str5 = this.A04;
        XVS xvs = this.A01;
        String str6 = xvs.A03;
        String str7 = xvs.A02;
        Map map = xvs.A08;
        String str8 = xvs.A04;
        long j2 = xvs.A00;
        return new ParcelableSignalData(enumC64262vl, null, null, null, null, null, null, null, null, null, null, null, xvs.A01, null, null, Long.valueOf(j), null, null, Long.valueOf(j2), str4, null, null, str, str2, str3, str5, null, null, null, null, str7, str6, str8, xvs.A06, xvs.A07, xvs.A05, list, map);
    }

    @Override // X.AbstractC82583mM
    public final long A00() {
        return this.A00;
    }

    @Override // X.AbstractC82583mM
    public final String A02() {
        return this.A05;
    }

    @Override // X.AbstractC82583mM
    public final String A03() {
        return this.A06;
    }

    @Override // X.AbstractC82583mM
    public final String A04() {
        return this.A07;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AFISignalData(containerModule=");
        AbstractC72048XLo.A1T(A1C, this.A05);
        AbstractC72048XLo.A1R(A1C, this.A06);
        AbstractC72048XLo.A1Q(A1C, this.A03);
        AbstractC72048XLo.A1S(A1C, this.A07);
        AbstractC72048XLo.A1P(A1C, this.A02);
        A1C.append(this.A08);
        A1C.append(", clickTimestamp=");
        A1C.append(this.A00);
        A1C.append(", clickMediaId=");
        A1C.append(this.A04);
        A1C.append(", afiLoggingInfo=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
