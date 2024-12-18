package X;

/* renamed from: X.7Ne, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161947Ne extends C0T6 {
    public final int A00;
    public final long A01;
    public final Integer A02;
    public final EnumC161927Nc A03;

    public C161947Ne(EnumC161927Nc enumC161927Nc, Integer num, int i, long j) {
        C14360o3.A0B(enumC161927Nc, 1);
        C14360o3.A0B(num, 3);
        this.A03 = enumC161927Nc;
        this.A00 = i;
        this.A02 = num;
        this.A01 = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C161947Ne) {
                C161947Ne c161947Ne = (C161947Ne) obj;
                if (this.A03 != c161947Ne.A03 || this.A00 != c161947Ne.A00 || this.A02 != c161947Ne.A02 || this.A01 != c161947Ne.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode = ((this.A03.hashCode() * 31) + this.A00) * 31;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "FLUSH_APPEND";
                break;
            case 2:
                str = "DURATION_BASED";
                break;
            default:
                str = "APPEND";
                break;
        }
        int hashCode2 = (hashCode + str.hashCode() + intValue) * 31;
        long j = this.A01;
        return hashCode2 + ((int) (j ^ (j >>> 32)));
    }
}
