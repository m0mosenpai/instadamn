package X;

/* renamed from: X.KrL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47064KrL {
    public static final C7Q4 A00(C47Z c47z) {
        C7Q4 c7q4;
        C14360o3.A0B(c47z, 0);
        EnumC40111tc enumC40111tc = c47z.A1G;
        if (enumC40111tc == EnumC40111tc.A0a) {
            String str = c47z.A3V;
            if (str == null) {
                str = c47z.A1N.A0F;
            }
            String str2 = c47z.A33;
            c7q4 = new C7Q4(c47z.A13, enumC40111tc, Float.valueOf(c47z.A02), null, null, null, str, str2, c47z.A35, c47z.A57, c47z.A5D);
        } else {
            String str3 = c47z.A2s;
            String str4 = c47z.A2u;
            String str5 = c47z.A33;
            if (str5 == null) {
                str5 = c47z.A3L;
            }
            c7q4 = new C7Q4(c47z.A13, enumC40111tc, Float.valueOf(c47z.A02), str3, str4, str5, null, null, c47z.A35, c47z.A57, c47z.A5D);
        }
        C7Q4.A00(c7q4);
        return c7q4;
    }
}
