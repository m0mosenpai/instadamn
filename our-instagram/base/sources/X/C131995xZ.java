package X;

import java.util.List;

/* renamed from: X.5xZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131995xZ extends C0T6 {
    public final C126875oR A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("CrosspostingDestination(id=");
        sb.append(this.A03);
        sb.append(", name=");
        sb.append(this.A04);
        sb.append(", type=");
        Integer num = this.A02;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "FB_USER";
                    break;
                case 2:
                    str = "FB_ADDITIONAL_PROFILE";
                    break;
                case 3:
                    str = "FB_PAGE";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", linkageType=");
        Integer num2 = this.A01;
        if (num2 != null) {
            str2 = C9H5.A01(num2);
        } else {
            str2 = "null";
        }
        sb.append(str2);
        sb.append(", profilePic=");
        sb.append(this.A05);
        sb.append(", customServiceData=");
        sb.append(this.A00);
        sb.append(", surfaceToXpostEligibilities=");
        sb.append(this.A06);
        sb.append(')');
        return sb.toString();
    }

    public C131995xZ(C126875oR c126875oR, Integer num, Integer num2, String str, String str2, String str3, List list) {
        this.A03 = str;
        this.A04 = str2;
        this.A02 = num;
        this.A01 = num2;
        this.A05 = str3;
        this.A00 = c126875oR;
        this.A06 = list;
    }

    public C131995xZ() {
        this(null, C05F.A00, C05F.A0C, "", "", "", C16930sl.A00);
    }
}
