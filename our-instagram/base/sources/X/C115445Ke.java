package X;

/* renamed from: X.5Ke, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115445Ke {
    public static final C115435Kd A00(C3JY c3jy, String str) {
        C14360o3.A0B(str, 0);
        int i = c3jy.A02;
        EnumC115415Kb A00 = EnumC115415Kb.A05.A00(i);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": Response ");
        sb.append(i);
        sb.append(", ");
        sb.append(c3jy.A03);
        return new C115435Kd(A00, sb.toString(), null, null, null, null, i);
    }

    public static final C115435Kd A01(EnumC115415Kb enumC115415Kb, String str, String str2, Throwable th) {
        C14360o3.A0B(enumC115415Kb, 0);
        C14360o3.A0B(str, 1);
        return new C115435Kd(enumC115415Kb, str, null, null, str2, th, -1);
    }

    public final C115435Kd A02(C3JY c3jy, C1CM c1cm, String str, Throwable th) {
        String str2;
        String A06;
        if (c3jy != null) {
            if (c3jy.A02 == 200) {
                return new C115435Kd(EnumC115415Kb.A0E, AnonymousClass001.A0g(str, ": Invalid reply, ", c3jy.A03), null, null, null, null, 200);
            }
            return A00(c3jy, str);
        }
        String message = th.getMessage();
        if (message != null && message.length() != 0) {
            message = new C11L("/VID_[0-9]+_[0-9]+\\.m").A00(new C11L(" ssl=0x[0-9a-f]+").A00(new C11L("[0-9a-f]+:[0-9a-f]+:[0-9a-f]+:[0-9a-f]+:[0-9a-f]+:[0-9a-f]+:[0-9a-f]+:[0-9a-f]+").A00(new C11L("[0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+").A00(message, "<IPv4>"), "<IPv6>"), " ssl=0x..."), "/VID_xx_xx.m");
        }
        EnumC115415Kb A01 = EnumC115415Kb.A05.A01(EnumC115415Kb.A0G, c1cm, th);
        if (A01 == EnumC115415Kb.A08) {
            A06 = AnonymousClass001.A0R(str, ": Airplane mode");
        } else {
            Throwable cause = th.getCause();
            if (cause == null || (str2 = cause.getMessage()) == null) {
                str2 = "NO_CAUSE";
            }
            A06 = AbstractC13670mt.A06("context: %s, %s:%s", str, message, str2);
        }
        return A01(A01, A06, null, th);
    }
}
