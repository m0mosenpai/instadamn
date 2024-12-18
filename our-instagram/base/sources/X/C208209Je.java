package X;

import com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ParcelableSignalData;
import java.util.List;

/* renamed from: X.9Je, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208209Je extends AbstractC82583mM {
    public final long A00;
    public final EnumC64262vl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public C208209Je(EnumC64262vl enumC64262vl, String str, String str2, String str3, String str4, String str5, String str6, List list, long j) {
        AbstractC167027dH.A0a(1, str, str2, str3, str4);
        this.A05 = str;
        this.A06 = str2;
        this.A03 = str3;
        this.A07 = str4;
        this.A01 = enumC64262vl;
        this.A08 = list;
        this.A00 = j;
        this.A04 = str5;
        this.A02 = str6;
    }

    @Override // X.AbstractC82583mM
    public final long A00() {
        return this.A00;
    }

    @Override // X.AbstractC82583mM
    public final ParcelableSignalData A01() {
        String str = this.A05;
        String str2 = this.A06;
        String str3 = this.A03;
        String str4 = this.A07;
        EnumC64262vl enumC64262vl = this.A01;
        List list = this.A08;
        long j = this.A00;
        return new ParcelableSignalData(enumC64262vl, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Long.valueOf(j), null, null, null, str4, null, null, str, str2, str3, this.A04, null, null, null, this.A02, null, null, null, null, null, null, list, null);
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
        A1C.append("ProfileTapSignalData(containerModule=");
        A1C.append(this.A05);
        A1C.append(", inventorySource=");
        A1C.append(this.A06);
        A1C.append(", authorId=");
        A1C.append(this.A03);
        A1C.append(", itemId=");
        A1C.append(this.A07);
        A1C.append(", itemType=");
        A1C.append(this.A01);
        A1C.append(", mediaIds=");
        A1C.append(this.A08);
        A1C.append(", clickTimestamp=");
        A1C.append(this.A00);
        A1C.append(", clickMediaId=");
        A1C.append(this.A04);
        A1C.append(AbstractC111324zv.A00(52));
        A1C.append(this.A02);
        return AbstractC167017dG.A0p(A1C);
    }
}
