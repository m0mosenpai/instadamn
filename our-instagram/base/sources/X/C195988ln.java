package X;

/* renamed from: X.8ln, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195988ln {
    public final void A01(String str, String str2) {
        C14360o3.A0B(str, 0);
        C195998lo c195998lo = AbstractC195978lm.A00;
        String A00 = A00(str);
        C14360o3.A0B(A00, 0);
        if (!C0K8.A01.isLoggable(3) && c195998lo.A00) {
            C0K8.A0D(A00, str2);
        }
    }

    public final void A02(String str, String str2) {
        C195998lo c195998lo = AbstractC195978lm.A00;
        String A00 = A00(str);
        C14360o3.A0B(A00, 0);
        if (!C0K8.A01.isLoggable(4) && c195998lo.A00) {
            C0K8.A0D(A00, str2);
        }
    }

    public final void A03(String str, String str2) {
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(A00(str), 0);
    }

    public final void A04(String str, String str2, Throwable th) {
        String A00 = A00(str);
        C14360o3.A0B(A00, 0);
        C0K8.A0F(A00, str2, th);
    }

    public final void A06(String str, String str2, Throwable th) {
        String A00 = A00(str);
        C14360o3.A0B(A00, 0);
        C0K8.A0H(A00, str2, th);
    }

    public static final String A00(String str) {
        if (!AbstractC002300n.A0h(str, "sup:", false)) {
            return AnonymousClass001.A0R("sup:", str);
        }
        return str;
    }

    public final void A05(String str, String str2, Throwable th) {
        String A00 = A00(str);
        C14360o3.A0B(A00, 0);
        C0K8.A0G(A00, str2, th);
    }

    public final void A07(String str, String str2, Throwable th) {
        String A00 = A00(str);
        C14360o3.A0B(A00, 0);
        C0K8.A0I(A00, str2, th);
    }
}
