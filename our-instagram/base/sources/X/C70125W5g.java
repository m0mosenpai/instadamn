package X;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.W5g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70125W5g {
    public static final C69498VpT A06 = new Object();
    public final long A00;
    public final long A01;
    public final WDI A02;
    public final EnumC68130VCo A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70125W5g)) {
            return false;
        }
        C70125W5g c70125W5g = (C70125W5g) obj;
        return this.A05 == c70125W5g.A05 && this.A04 == c70125W5g.A04 && this.A03 == c70125W5g.A03 && this.A02 == c70125W5g.A02;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A02, Boolean.valueOf(this.A05), Boolean.valueOf(this.A04)});
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("mUploadMode", this.A03);
        hashMap.put("mVideoTranscodeParams", this.A02);
        hashMap.put("mIsStreamingEnabled", Boolean.valueOf(this.A05));
        hashMap.put("mShouldEnableVideoSegmentationMode", Boolean.valueOf(this.A04));
        return hashMap.toString();
    }

    public C70125W5g(WDI wdi, EnumC68130VCo enumC68130VCo, long j, long j2, boolean z, boolean z2) {
        this.A03 = enumC68130VCo;
        this.A02 = wdi;
        this.A05 = z;
        this.A04 = z2;
        this.A01 = j;
        this.A00 = j2;
    }
}
