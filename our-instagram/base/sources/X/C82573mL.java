package X;

/* renamed from: X.3mL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82573mL extends AbstractC82583mM {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final long A0A;
    public final EnumC64262vl A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;

    public C82573mL(EnumC64262vl enumC64262vl, String str, String str2, String str3, String str4, String str5, String str6, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, long j2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(enumC64262vl, 2);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str3, 4);
        C14360o3.A0B(str4, 8);
        C14360o3.A0B(str5, 9);
        C14360o3.A0B(str6, 17);
        this.A0E = str;
        this.A0B = enumC64262vl;
        this.A0G = str2;
        this.A0F = str3;
        this.A0A = j;
        this.A09 = j2;
        this.A00 = f;
        this.A0C = str4;
        this.A0D = str5;
        this.A06 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A02 = i4;
        this.A08 = i5;
        this.A01 = i6;
        this.A07 = i7;
        this.A0H = str6;
        this.A05 = i8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SeenStateSignalData(itemId=");
        sb.append(this.A0E);
        sb.append(", itemType=");
        sb.append(this.A0B);
        sb.append(AbstractC58317Pt9.A00(60));
        sb.append(this.A0G);
        sb.append(", mediaId=");
        sb.append(this.A0F);
        sb.append(", mediaTimeSpent=");
        sb.append(this.A0A);
        sb.append(", mediaLastSeenTimestamp=");
        sb.append(this.A09);
        sb.append(", mediaPercentVisible=");
        sb.append(this.A00);
        sb.append(", containerModule=");
        sb.append(this.A0C);
        sb.append(AbstractC111324zv.A00(280));
        sb.append(this.A0D);
        sb.append(", multiAdsType=");
        sb.append(this.A06);
        sb.append(", gapToLastAd=");
        sb.append(this.A03);
        sb.append(", gapToLastNetego=");
        sb.append(this.A04);
        sb.append(", clientInsertionPosition=");
        sb.append(this.A02);
        sb.append(", reelGapToLastAd=");
        sb.append(this.A08);
        sb.append(", adConsumedMediaGap=");
        sb.append(this.A01);
        sb.append(", numMediaConsumedInAd=");
        sb.append(this.A07);
        sb.append(MSV.A00(23));
        sb.append(this.A0H);
        sb.append(", impSignature=");
        sb.append(this.A05);
        sb.append(')');
        return sb.toString();
    }

    @Override // X.AbstractC82583mM
    public final String A04() {
        return this.A0E;
    }
}
