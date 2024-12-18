package X;

/* renamed from: X.2Ky, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48562Ky {
    public static final C48562Ky A08 = new C48562Ky(C05F.A00, C16910sj.A00, -1, -1, false, false, false, false);
    public final long A00;
    public final long A01;
    public final Integer A02;
    public final java.util.Set A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C48562Ky(C48562Ky c48562Ky) {
        C14360o3.A0B(c48562Ky, 1);
        this.A05 = c48562Ky.A05;
        this.A06 = c48562Ky.A06;
        this.A02 = c48562Ky.A02;
        this.A04 = c48562Ky.A04;
        this.A07 = c48562Ky.A07;
        this.A03 = c48562Ky.A03;
        this.A01 = c48562Ky.A01;
        this.A00 = c48562Ky.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
            return false;
        }
        C48562Ky c48562Ky = (C48562Ky) obj;
        if (this.A05 != c48562Ky.A05 || this.A06 != c48562Ky.A06 || this.A04 != c48562Ky.A04 || this.A07 != c48562Ky.A07 || this.A01 != c48562Ky.A01 || this.A00 != c48562Ky.A00 || this.A02 != c48562Ky.A02) {
            return false;
        }
        return C14360o3.A0K(this.A03, c48562Ky.A03);
    }

    public final int hashCode() {
        Integer num = this.A02;
        int hashCode = (((((((((C50T.A00(num).hashCode() + num.intValue()) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31;
        long j = this.A01;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A00;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A03.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Constraints{requiredNetworkType=");
        Integer num = this.A02;
        if (num != null) {
            str = C50T.A00(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", requiresCharging=");
        sb.append(this.A05);
        sb.append(", requiresDeviceIdle=");
        sb.append(this.A06);
        sb.append(", requiresBatteryNotLow=");
        sb.append(this.A04);
        sb.append(", requiresStorageNotLow=");
        sb.append(this.A07);
        sb.append(", contentTriggerUpdateDelayMillis=");
        sb.append(this.A01);
        sb.append(", contentTriggerMaxDelayMillis=");
        sb.append(this.A00);
        sb.append(", contentUriTriggers=");
        sb.append(this.A03);
        sb.append(", }");
        return sb.toString();
    }

    public C48562Ky(Integer num, java.util.Set set, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(num, 1);
        C14360o3.A0B(set, 8);
        this.A02 = num;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = z3;
        this.A07 = z4;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = set;
    }
}
