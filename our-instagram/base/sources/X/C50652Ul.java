package X;

import java.util.Map;

/* renamed from: X.2Ul, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50652Ul implements InterfaceC25221Lc {
    @Override // X.InterfaceC25221Lc
    public final void EHF(EnumC50702Ur enumC50702Ur, String str, String str2, Throwable th, Map map, int i) {
        EnumC12410kj enumC12410kj;
        C14360o3.A0B(enumC50702Ur, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        int ordinal = enumC50702Ur.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (th == null) {
                    C0w9.A04(str, str2, i);
                    return;
                } else {
                    C0w9.A05(str, str2, i, th);
                    return;
                }
            }
            enumC12410kj = EnumC12410kj.A0A;
        } else {
            enumC12410kj = EnumC12410kj.A09;
        }
        if (th == null) {
            C0w9.A01(enumC12410kj, str, str2);
        } else {
            C0w9.A02(enumC12410kj, str, str2, th);
        }
    }
}
