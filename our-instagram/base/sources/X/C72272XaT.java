package X;

import com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ParcelableSignalData;
import java.util.List;

/* renamed from: X.XaT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72272XaT extends AbstractC82583mM {
    public final long A00;
    public final EnumC64262vl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    @Override // X.AbstractC82583mM
    public final ParcelableSignalData A01() {
        String str = this.A04;
        String str2 = this.A05;
        String str3 = this.A02;
        String str4 = this.A06;
        EnumC64262vl enumC64262vl = this.A01;
        List list = this.A07;
        long j = this.A00;
        return new ParcelableSignalData(enumC64262vl, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Long.valueOf(j), null, null, null, str4, null, null, str, str2, str3, this.A03, null, null, null, null, null, null, null, null, null, null, list, null);
    }

    public C72272XaT(EnumC64262vl enumC64262vl, String str, String str2, String str3, String str4, String str5, List list, long j) {
        AbstractC167017dG.A1P(str, str2);
        C14360o3.A0B(str4, 4);
        this.A04 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A06 = str4;
        this.A01 = enumC64262vl;
        this.A07 = list;
        this.A00 = j;
        this.A03 = str5;
    }

    @Override // X.AbstractC82583mM
    public final long A00() {
        return this.A00;
    }

    @Override // X.AbstractC82583mM
    public final String A02() {
        return this.A04;
    }

    @Override // X.AbstractC82583mM
    public final String A03() {
        return this.A05;
    }

    @Override // X.AbstractC82583mM
    public final String A04() {
        return this.A06;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TapAndHoldSignalData(containerModule=");
        AbstractC72048XLo.A1T(A1C, this.A04);
        AbstractC72048XLo.A1R(A1C, this.A05);
        AbstractC72048XLo.A1Q(A1C, this.A02);
        AbstractC72048XLo.A1S(A1C, this.A06);
        AbstractC72048XLo.A1P(A1C, this.A01);
        A1C.append(this.A07);
        A1C.append(", clickTimestamp=");
        A1C.append(this.A00);
        A1C.append(", clickMediaId=");
        return AbstractC25236BEt.A0Y(this.A03, A1C);
    }
}
