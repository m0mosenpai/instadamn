package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C79 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C79[] A01;
    public static final C79 A02;
    public static final C79 A03;
    public static final C79 A04;
    public static final C79 A05;
    public static final C79 A06;
    public static final C79 A07;
    public static final C79 A08;

    static {
        C79 c79 = new C79("LEFT", 0);
        A05 = c79;
        C79 c792 = new C79("RIGHT", 1);
        A07 = c792;
        C79 c793 = new C79("CENTER", 2);
        A04 = c793;
        C79 c794 = new C79(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 3);
        A06 = c794;
        C79 c795 = new C79("TOP_RIGHT", 4);
        A08 = c795;
        C79 c796 = new C79("BOTTOM_RIGHT", 5);
        A03 = c796;
        C79 c797 = new C79("BOTTOM_LEFT", 6);
        A02 = c797;
        C79[] c79Arr = {c79, c792, c793, c794, c795, c796, c797, new C79("TOP_LEFT", 7)};
        A01 = c79Arr;
        A00 = AbstractC12190kN.A00(c79Arr);
    }

    public static C79 valueOf(String str) {
        return (C79) Enum.valueOf(C79.class, str);
    }

    public static C79[] values() {
        return (C79[]) A01.clone();
    }

    public C79(String str, int i) {
    }
}
