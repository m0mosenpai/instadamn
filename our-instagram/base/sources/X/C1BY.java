package X;

import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: X.1BY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1BY {
    public final synchronized C1BX A01(InterfaceC62772tG interfaceC62772tG) {
        return A00(interfaceC62772tG.BMf(), interfaceC62772tG.getFileName(), interfaceC62772tG.Axz(), interfaceC62772tG.BvU());
    }

    public final synchronized C1BX A02(String str) {
        C14360o3.A0B(str, 0);
        return A00(C1BZ.A02, str, false, true);
    }

    public static final C1BX A00(C1BZ c1bz, String str, boolean z, boolean z2) {
        Map map = C1BX.A04;
        C1BX c1bx = (C1BX) map.get(str);
        if (c1bx == null) {
            SharedPreferences sharedPreferences = AbstractC12290kX.A00.getSharedPreferences(str, 0);
            int ordinal = c1bz.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    C14360o3.A0A(sharedPreferences);
                    c1bx = new C23211Ba(sharedPreferences, str, z, z2);
                } else {
                    C14360o3.A0A(sharedPreferences);
                    c1bx = new C62782tH(sharedPreferences, str, true);
                }
            } else {
                C14360o3.A0A(sharedPreferences);
                c1bx = new C62782tH(sharedPreferences, str, false);
            }
            if (!((Boolean) AbstractC15930qn.A02.A0G.invoke()).booleanValue()) {
                C218914p.A03(EnumC220415e.A03, c1bx.A01);
            }
            map.put(str, c1bx);
        }
        return c1bx;
    }
}
