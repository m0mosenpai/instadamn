package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7O {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C7O[] A02;
    public static final C7O A03;
    public static final C7O A04;
    public static final C7O A05;
    public final String A00;

    static {
        C7O c7o = new C7O("SLIDE_UP", 0, "slide_up");
        A05 = c7o;
        C7O c7o2 = new C7O("FADE_IN", 1, "fade_in");
        A03 = c7o2;
        C7O c7o3 = new C7O(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 2, "");
        A04 = c7o3;
        C7O[] c7oArr = {c7o, c7o2, c7o3};
        A02 = c7oArr;
        A01 = AbstractC12190kN.A00(c7oArr);
    }

    public static C7O valueOf(String str) {
        return (C7O) Enum.valueOf(C7O.class, str);
    }

    public static C7O[] values() {
        return (C7O[]) A02.clone();
    }

    public C7O(String str, int i, String str2) {
        this.A00 = str2;
    }
}
