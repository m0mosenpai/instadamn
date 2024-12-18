package X;

import java.io.Serializable;

/* renamed from: X.793, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass793 implements Serializable {
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public int A00 = 0;
    public long A02 = 0;
    public String A04 = "";
    public boolean A0F = false;
    public int A01 = 1;
    public String A06 = "";
    public String A05 = "";
    public Integer A03 = C05F.A00;

    public final boolean A01(AnonymousClass793 anonymousClass793) {
        if (anonymousClass793 == null) {
            return false;
        }
        if (this == anonymousClass793) {
            return true;
        }
        return this.A00 == anonymousClass793.A00 && this.A02 == anonymousClass793.A02 && this.A04.equals(anonymousClass793.A04) && this.A0F == anonymousClass793.A0F && this.A01 == anonymousClass793.A01 && this.A06.equals(anonymousClass793.A06) && this.A03 == anonymousClass793.A03 && this.A05.equals(anonymousClass793.A05) && this.A0D == anonymousClass793.A0D;
    }

    public final void A00(AnonymousClass793 anonymousClass793) {
        if (anonymousClass793.A07) {
            int i = anonymousClass793.A00;
            this.A07 = true;
            this.A00 = i;
        }
        if (anonymousClass793.A0B) {
            long j = anonymousClass793.A02;
            this.A0B = true;
            this.A02 = j;
        }
        if (anonymousClass793.A09) {
            String str = anonymousClass793.A04;
            this.A09 = true;
            this.A04 = str;
        }
        if (anonymousClass793.A0A) {
            boolean z = anonymousClass793.A0F;
            this.A0A = true;
            this.A0F = z;
        }
        if (anonymousClass793.A0C) {
            int i2 = anonymousClass793.A01;
            this.A0C = true;
            this.A01 = i2;
        }
        if (anonymousClass793.A0E) {
            String str2 = anonymousClass793.A06;
            this.A0E = true;
            this.A06 = str2;
        }
        if (anonymousClass793.A08) {
            Integer num = anonymousClass793.A03;
            this.A08 = true;
            this.A03 = num;
        }
        if (anonymousClass793.A0D) {
            String str3 = anonymousClass793.A05;
            this.A0D = true;
            this.A05 = str3;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AnonymousClass793) && A01((AnonymousClass793) obj)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((2173 + this.A00) * 53) + Long.valueOf(this.A02).hashCode()) * 53) + this.A04.hashCode()) * 53;
        int i = 1231;
        int i2 = 1237;
        if (this.A0F) {
            i2 = 1231;
        }
        int hashCode2 = (((((hashCode + i2) * 53) + this.A01) * 53) + this.A06.hashCode()) * 53;
        Integer num = this.A03;
        int hashCode3 = (((hashCode2 + AbstractC225319wu.A00(num).hashCode() + num.intValue()) * 53) + this.A05.hashCode()) * 53;
        if (!this.A0D) {
            i = 1237;
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country Code: ");
        sb.append(this.A00);
        sb.append(" National Number: ");
        sb.append(this.A02);
        if (this.A0A && this.A0F) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.A0C) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.A01);
        }
        if (this.A09) {
            sb.append(" Extension: ");
            sb.append(this.A04);
        }
        if (this.A08) {
            sb.append(" Country Code Source: ");
            sb.append(AbstractC225319wu.A00(this.A03));
        }
        if (this.A0D) {
            sb.append(" Preferred Domestic Carrier Code: ");
            sb.append(this.A05);
        }
        return sb.toString();
    }
}
