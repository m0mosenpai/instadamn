package X;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.W5f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70124W5f {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final VE8 A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C70124W5f c70124W5f = (C70124W5f) obj;
                if (this.A04 != c70124W5f.A04 || this.A03 != c70124W5f.A03 || this.A02 != c70124W5f.A02 || this.A05 != c70124W5f.A05 || this.A01 != c70124W5f.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public static C70124W5f A00(String str) {
        int i;
        if ("high".equalsIgnoreCase(str)) {
            i = 8;
        } else if ("main".equalsIgnoreCase(str)) {
            i = 2;
        } else if ("baseline".equalsIgnoreCase(str)) {
            i = 1;
        } else {
            return null;
        }
        return new C70124W5f(VE8.CODEC_VIDEO_H264, i, 256, false, false);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, Integer.valueOf(this.A03), Integer.valueOf(this.A02), Boolean.valueOf(this.A05), Boolean.valueOf(this.A01)});
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("codec", this.A04);
        hashMap.put("profile", Integer.valueOf(this.A03));
        hashMap.put("level", Integer.valueOf(this.A02));
        hashMap.put("useBframe", Boolean.valueOf(this.A05));
        return AbstractC1126356r.A04(C70124W5f.class, hashMap);
    }

    public C70124W5f(VE8 ve8, int i, int i2, boolean z, boolean z2) {
        this.A03 = i;
        this.A02 = i2;
        this.A04 = ve8;
        this.A05 = z;
        this.A01 = z2;
    }
}
