package X;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

/* renamed from: X.5Kc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115425Kc {
    public final EnumC115415Kb A01(EnumC115415Kb enumC115415Kb, C1CM c1cm, Throwable th) {
        C14360o3.A0B(enumC115415Kb, 0);
        if (th != null) {
            if (th instanceof FileNotFoundException) {
                return EnumC115415Kb.A0H;
            }
            if (th instanceof IOException) {
                if (c1cm.A05()) {
                    return EnumC115415Kb.A08;
                }
                if (!(th instanceof UnknownHostException) && c1cm.A07(false)) {
                    return EnumC115415Kb.A0A;
                }
                return EnumC115415Kb.A0T;
            }
            return A01(enumC115415Kb, c1cm, th.getCause());
        }
        return enumC115415Kb;
    }

    public final EnumC115415Kb A00(int i) {
        if (i != 511) {
            if (i >= 300) {
                if (i <= 308) {
                    return EnumC115415Kb.A0K;
                }
                if (i >= 500) {
                    if (i < 600) {
                        return EnumC115415Kb.A0O;
                    }
                } else if (i >= 400) {
                    if (i != 429) {
                        if (i == 422) {
                            return EnumC115415Kb.A09;
                        }
                        if (i == 400) {
                            return EnumC115415Kb.A0J;
                        }
                        return EnumC115415Kb.A0F;
                    }
                }
            }
            C0w9.A03("ErrorType", AnonymousClass001.A0O("Unexpected status code ", i));
            return EnumC115415Kb.A0P;
        }
        return EnumC115415Kb.A0B;
    }
}
