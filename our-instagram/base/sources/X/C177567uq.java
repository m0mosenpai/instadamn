package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.util.Arrays;

/* renamed from: X.7uq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177567uq {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;

    public C177567uq(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.A01 = i2;
        this.A08 = i9;
        this.A03 = i4;
        this.A02 = i3;
        this.A07 = i8;
        this.A04 = i5;
        this.A05 = i6;
        this.A06 = i7;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C177567uq c177567uq = (C177567uq) obj;
            if (this.A01 != c177567uq.A01 || this.A08 != c177567uq.A08 || this.A03 != c177567uq.A03 || this.A02 != c177567uq.A02 || this.A07 != c177567uq.A07 || this.A04 != c177567uq.A04 || this.A05 != c177567uq.A05 || this.A06 != c177567uq.A06 || this.A00 != c177567uq.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A08), Integer.valueOf(this.A03), Integer.valueOf(this.A02), Integer.valueOf(this.A07), Integer.valueOf(this.A04), Integer.valueOf(this.A05), Integer.valueOf(this.A06), Integer.valueOf(this.A00), "audio/mp4a-latm"});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioEncoderConfig{bitRate=");
        sb.append(this.A01);
        sb.append(MSV.A00(638));
        sb.append(this.A08);
        sb.append(MSV.A00(StringTreeSet.MAX_SYMBOL_COUNT));
        sb.append(this.A03);
        sb.append(", bufferSize=");
        sb.append(this.A02);
        sb.append(", pcmEncoding=");
        sb.append(this.A07);
        sb.append(", dequeueInputBufferTimeoutMs=");
        sb.append(this.A04);
        sb.append(", endOfStreamDequeueOutputBufferTimeoutUs=");
        sb.append(this.A05);
        sb.append(", maxTryAgainLaterRetries=");
        sb.append(this.A06);
        sb.append(", aacProfile=");
        sb.append(this.A00);
        sb.append(", audioMimeType=");
        sb.append("audio/mp4a-latm");
        sb.append('}');
        return sb.toString();
    }
}
