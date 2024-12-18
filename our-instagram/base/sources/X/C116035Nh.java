package X;

/* renamed from: X.5Nh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116035Nh extends C0T6 {
    public final int A00;
    public final long A01;
    public final Long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C116035Nh) {
                C116035Nh c116035Nh = (C116035Nh) obj;
                if (this.A00 != c116035Nh.A00 || this.A01 != c116035Nh.A01 || !C14360o3.A0K(this.A02, c116035Nh.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScreenTimeSyncStateEntity(id=");
        sb.append(this.A00);
        sb.append(", lastSyncTime=");
        sb.append(this.A01);
        sb.append(", tiaLastIntervalEnd=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int i = this.A00 * 31;
        long j = this.A01;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.A02;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return i2 + hashCode;
    }

    public C116035Nh(Long l, int i, long j) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = l;
    }
}
