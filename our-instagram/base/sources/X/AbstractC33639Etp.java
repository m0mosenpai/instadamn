package X;

/* renamed from: X.Etp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33639Etp {
    public static final Integer A00(String str) {
        String str2;
        C14360o3.A0B(str, 0);
        for (Integer num : C05F.A00(5)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "com.facebook.katana";
                    break;
                case 2:
                    str2 = "com.facebook.wakizashi";
                    break;
                case 3:
                    str2 = "com.facebook.orca";
                    break;
                case 4:
                    str2 = "com.facebook.lite";
                    break;
                default:
                    str2 = "";
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return null;
    }
}
