package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6P {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6P[] A01;
    public static final C6P A02;
    public static final C6P A03;
    public static final C6P A04;

    static {
        C6P c6p = new C6P(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A03 = c6p;
        C6P c6p2 = new C6P("REDISPLAY_KEYBOARD_OLD_APIS", 1);
        A04 = c6p2;
        C6P c6p3 = new C6P("DISMISS_ON_MUTE", 2);
        A02 = c6p3;
        C6P[] c6pArr = {c6p, c6p2, c6p3};
        A01 = c6pArr;
        A00 = AbstractC12190kN.A00(c6pArr);
    }

    public static C6P valueOf(String str) {
        return (C6P) Enum.valueOf(C6P.class, str);
    }

    public static C6P[] values() {
        return (C6P[]) A01.clone();
    }

    public C6P(String str, int i) {
    }
}
