package X;

/* renamed from: X.8kn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195478kn extends C0T6 {
    public final String A00;
    public final String A01;
    public final java.util.Set A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195478kn) {
                C195478kn c195478kn = (C195478kn) obj;
                if (this.A03 != c195478kn.A03 || !C14360o3.A0K(this.A00, c195478kn.A00) || !C14360o3.A0K(this.A01, c195478kn.A01) || !C14360o3.A0K(this.A02, c195478kn.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaginatedCloudMedia(hasNextPage=");
        sb.append(this.A03);
        sb.append(", endCursor=");
        sb.append(this.A00);
        sb.append(", finalMediaId=");
        sb.append(this.A01);
        sb.append(", cloudMedia=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int i2 = i * 31;
        String str = this.A00;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        String str2 = this.A01;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return ((i4 + i3) * 31) + this.A02.hashCode();
    }

    public C195478kn(String str, String str2, java.util.Set set, boolean z) {
        this.A03 = z;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = set;
    }
}
