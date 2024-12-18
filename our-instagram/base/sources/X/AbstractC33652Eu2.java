package X;

/* renamed from: X.Eu2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33652Eu2 {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : C05F.A00(8)) {
            switch (num.intValue()) {
                case 1:
                    str2 = AbstractC63083Sc6.A01(31, 8, 21);
                    break;
                case 2:
                    str2 = "password";
                    break;
                case 3:
                    str2 = "email";
                    break;
                case 4:
                    str2 = AbstractC63083Sc6.A01(9, 12, 108);
                    break;
                case 5:
                    str2 = "full_name";
                    break;
                case 6:
                    str2 = "sentry";
                    break;
                case 7:
                    str2 = "confirmation_code";
                    break;
                default:
                    str2 = "unknown";
                    break;
            }
            if (C14360o3.A0K(str2, str)) {
                return num;
            }
        }
        return C05F.A00;
    }
}
