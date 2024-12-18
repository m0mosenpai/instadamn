package X;

/* renamed from: X.F0n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34034F0n {
    public static final Integer A00(String str) {
        for (Integer num : C05F.A00(9)) {
            if (str != null) {
                Integer num2 = C05F.A0Y;
                if (AbstractC002300n.A0h(str, "selfie_captcha", false)) {
                    return num2;
                }
            }
            if (C14360o3.A0K(AbstractC34035F0o.A00(num), str)) {
                return num;
            }
        }
        return C05F.A1F;
    }
}
