package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.2nH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59162nH extends C0T6 implements InterfaceC59172nI {
    public final float A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final C80673iw A04;
    public final ImageUrl A05;
    public final InterfaceC59142nF A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59162nH) {
                C59162nH c59162nH = (C59162nH) obj;
                if (!C14360o3.A0K(this.A05, c59162nH.A05) || !C14360o3.A0K(this.A07, c59162nH.A07) || this.A02 != c59162nH.A02 || !C14360o3.A0K(this.A04, c59162nH.A04) || this.A03 != c59162nH.A03 || Float.compare(this.A00, c59162nH.A00) != 0 || this.A01 != c59162nH.A01 || this.A08 != c59162nH.A08 || this.A0B != c59162nH.A0B || this.A09 != c59162nH.A09 || !C14360o3.A0K(this.A06, c59162nH.A06) || this.A0A != c59162nH.A0A) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IgSingleImageSource(imageUrl=");
        sb.append(this.A05);
        sb.append(", miniPreviewPayload=");
        sb.append(this.A07);
        sb.append(", miniPreviewBlurRadius=");
        sb.append(this.A02);
        sb.append(", progressiveImageConfig=");
        sb.append(this.A04);
        sb.append(AbstractC43591JPw.A00(509));
        sb.append(this.A03);
        sb.append(", decodeAspectRatio=");
        sb.append(this.A00);
        sb.append(", maxSampleSize=");
        sb.append(this.A01);
        sb.append(", clearCachedItem=");
        sb.append(this.A08);
        sb.append(", shouldSkipNetworkRequest=");
        sb.append(this.A0B);
        sb.append(", reportProgress=");
        sb.append(this.A09);
        sb.append(", imagePostProcessor=");
        sb.append(this.A06);
        sb.append(", requestLowFidelityDecoding=");
        sb.append(this.A0A);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.A05.hashCode() * 31;
        String str = this.A07;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (((hashCode3 + hashCode) * 31) + this.A02) * 31;
        C80673iw c80673iw = this.A04;
        if (c80673iw == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c80673iw.hashCode();
        }
        long j = this.A03;
        int floatToIntBits = (((((((i2 + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A01) * 31;
        int i3 = 1237;
        if (this.A08) {
            i3 = 1231;
        }
        int i4 = (floatToIntBits + i3) * 31;
        int i5 = 1237;
        if (this.A0B) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A09) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        InterfaceC59142nF interfaceC59142nF = this.A06;
        if (interfaceC59142nF != null) {
            i = interfaceC59142nF.hashCode();
        }
        int i9 = (i8 + i) * 31;
        int i10 = 1237;
        if (this.A0A) {
            i10 = 1231;
        }
        return i9 + i10;
    }

    public C59162nH(C80673iw c80673iw, ImageUrl imageUrl, InterfaceC59142nF interfaceC59142nF, String str, float f, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A05 = imageUrl;
        this.A07 = str;
        this.A02 = i;
        this.A04 = c80673iw;
        this.A03 = j;
        this.A00 = f;
        this.A01 = i2;
        this.A08 = z;
        this.A0B = z2;
        this.A09 = z3;
        this.A06 = interfaceC59142nF;
        this.A0A = z4;
    }
}
