package X;

/* renamed from: X.5lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125515lx extends C0T6 {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C125515lx) {
                C125515lx c125515lx = (C125515lx) obj;
                if (!C14360o3.A0K(this.A01, c125515lx.A01) || !C14360o3.A0K(this.A02, c125515lx.A02) || this.A00 != c125515lx.A00 || !C14360o3.A0K(this.A03, c125515lx.A03) || this.A04 != c125515lx.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        int hashCode2 = ((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31;
        Integer num = this.A00;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "ONE";
                    break;
                case 2:
                    str = "TWO";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
            hashCode = str.hashCode() + intValue;
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str2 = this.A03;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i3 = (i2 + i) * 31;
        int i4 = 1237;
        if (this.A04) {
            i4 = 1231;
        }
        return i3 + i4;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("AvatarConfig(avatarId=");
        sb.append(this.A01);
        sb.append(", configHash=");
        sb.append(this.A02);
        sb.append(", convergence=");
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "ONE";
                    break;
                case 2:
                    str = "TWO";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", revisionId=");
        sb.append(this.A03);
        sb.append(", isStyle2AutoMigrated=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public C125515lx(Integer num, String str, String str2, String str3, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
        this.A03 = str3;
        this.A04 = z;
    }
}
