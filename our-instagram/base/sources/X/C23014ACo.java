package X;

import com.instagram.debug.devoptions.debughead.util.MemoryUtil;

/* renamed from: X.ACo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23014ACo {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23014ACo)) {
            return false;
        }
        C23014ACo c23014ACo = (C23014ACo) obj;
        return this.A05 == c23014ACo.A05 && this.A04 == c23014ACo.A04 && this.A00 == c23014ACo.A00 && this.A03 == c23014ACo.A03 && this.A06.equals(c23014ACo.A06) && this.A01 == c23014ACo.A01 && this.A02 == c23014ACo.A02;
    }

    public final int hashCode() {
        return ((((AbstractC166997dE.A0K(this.A06, ((((((((this.A05 * 31) + this.A04) * 31) + this.A00) * 31) + this.A03) * 31) + 5) * 31) + 2) * 31) + this.A01) * 31) + this.A02;
    }

    public C23014ACo(AAQ aaq) {
        int min;
        this.A05 = aaq.A04;
        this.A04 = aaq.A03;
        int i = aaq.A02;
        this.A03 = i;
        this.A06 = aaq.A06;
        Integer num = aaq.A05;
        if (num != null) {
            min = num.intValue();
        } else {
            min = Math.min((int) (r3 * r2 * 0.07d * i * 2.0d), MemoryUtil.MAX_ALLOC_SIZE);
        }
        this.A00 = min;
        this.A07 = aaq.A07;
        this.A08 = aaq.A08;
        this.A09 = aaq.A09;
        this.A01 = aaq.A00;
        this.A02 = aaq.A01;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoEncoderConfig{width=");
        A1C.append(this.A05);
        A1C.append(", height=");
        A1C.append(this.A04);
        A1C.append(", bitRate=");
        A1C.append(this.A00);
        A1C.append(MSV.A00(289));
        A1C.append(this.A03);
        A1C.append(", iFrameIntervalS=");
        A1C.append(5);
        A1C.append(", colorRange=");
        A1C.append(2);
        A1C.append(", colorStandard=");
        A1C.append(this.A01);
        A1C.append(AbstractC111324zv.A00(1403));
        A1C.append(this.A02);
        A1C.append(", profile='");
        A1C.append(this.A06);
        A1C.append('\'');
        A1C.append(", configureBFrames=");
        A1C.append(this.A07);
        A1C.append(", explicitlySetBaseline=");
        A1C.append(this.A08);
        A1C.append(", explicitlySetColorEncoding=");
        A1C.append(this.A09);
        return AbstractC167027dH.A0R(A1C);
    }
}
