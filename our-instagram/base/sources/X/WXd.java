package X;

import java.util.Map;

/* loaded from: classes11.dex */
public final class WXd implements InterfaceC25221Lc {
    @Override // X.InterfaceC25221Lc
    public final void EHF(EnumC50702Ur enumC50702Ur, String str, String str2, Throwable th, Map map, int i) {
        C14360o3.A0B(enumC50702Ur, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        int ordinal = enumC50702Ur.ordinal();
        if (ordinal != 2 && ordinal != 3) {
            throw new RuntimeException(str2);
        }
    }
}
