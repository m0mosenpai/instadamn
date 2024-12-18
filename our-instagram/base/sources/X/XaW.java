package X;

import com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ParcelableSignalData;
import java.util.List;

/* loaded from: classes12.dex */
public final class XaW extends AbstractC82583mM {
    public final long A00;
    public final EnumC64262vl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;

    public XaW(EnumC64262vl enumC64262vl, String str, String str2, String str3, String str4, String str5, List list, long j, boolean z) {
        AbstractC25233BEq.A0x(2, str, str2, str3);
        this.A08 = z;
        this.A05 = str;
        this.A00 = j;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = enumC64262vl;
        this.A07 = list;
        this.A02 = str4;
        this.A06 = str5;
    }

    @Override // X.AbstractC82583mM
    public final ParcelableSignalData A01() {
        boolean z = this.A08;
        String str = this.A05;
        long j = this.A00;
        String str2 = this.A03;
        String str3 = this.A04;
        EnumC64262vl enumC64262vl = this.A01;
        List list = this.A07;
        String str4 = this.A02;
        String str5 = this.A06;
        return new ParcelableSignalData(enumC64262vl, null, Boolean.valueOf(z), null, null, null, null, null, null, null, null, null, null, null, null, Long.valueOf(j), null, null, null, str, null, null, str2, str3, null, str4, null, null, null, null, str5, null, null, null, null, null, list, null);
    }

    @Override // X.AbstractC82583mM
    public final long A00() {
        return this.A00;
    }

    @Override // X.AbstractC82583mM
    public final String A02() {
        return this.A03;
    }

    @Override // X.AbstractC82583mM
    public final String A03() {
        return this.A04;
    }

    @Override // X.AbstractC82583mM
    public final String A04() {
        return this.A05;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AdClickSignalData(isAdClick=");
        A1C.append(this.A08);
        A1C.append(", itemId=");
        A1C.append(this.A05);
        A1C.append(", clickTimestamp=");
        A1C.append(this.A00);
        A1C.append(", containerModule=");
        AbstractC72048XLo.A1T(A1C, this.A03);
        AbstractC72048XLo.A1S(A1C, this.A04);
        AbstractC72048XLo.A1P(A1C, this.A01);
        A1C.append(this.A07);
        A1C.append(", clickMediaId=");
        A1C.append(this.A02);
        A1C.append(MSV.A00(23));
        return AbstractC25236BEt.A0Y(this.A06, A1C);
    }
}
