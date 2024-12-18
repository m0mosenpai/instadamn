package X;

import java.io.IOException;

/* renamed from: X.FVk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34808FVk {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.ECS, X.1um, X.1ul] */
    public static ECS parseFromJson(C16L c16l) {
        Integer num;
        String str;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("action".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    Integer[] A00 = C05F.A00(3);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            switch (num.intValue()) {
                                case 1:
                                    str = "AUTO_CONFIRMED";
                                    break;
                                case 2:
                                    str = "UNKNOWN";
                                    break;
                                default:
                                    str = "SMS_SENT";
                                    break;
                            }
                            if (!str.equalsIgnoreCase(A1Q)) {
                                i++;
                            }
                        } else {
                            num = C05F.A0C;
                        }
                    }
                    c40791um.A01 = num;
                } else if ("phone_verification_settings".equals(A0s)) {
                    c40791um.A00 = F8W.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
