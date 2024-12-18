package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.81K, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C81K {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C81K[] A01;
    public static final C81K A02;
    public static final C81K A03;
    public static final C81K A04;
    public static final C81K A05;
    public static final C81K A06;
    public static final C81K A07;
    public static final C81K A08;
    public static final C81K A09;

    static {
        C81K c81k = new C81K(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A08 = c81k;
        C81K c81k2 = new C81K("ALL", 1);
        A02 = c81k2;
        C81K c81k3 = new C81K("CLOSE_FRIENDS_ENABLED_ONLY", 2);
        A04 = c81k3;
        C81K c81k4 = new C81K("GROUP_PROFILE", 3);
        A05 = c81k4;
        C81K c81k5 = new C81K("HALL_PASS_ONLY", 4);
        A06 = c81k5;
        C81K c81k6 = new C81K("CAMPFIRE_ONLY", 5);
        A03 = c81k6;
        C81K c81k7 = new C81K("OPAL", 6);
        A09 = c81k7;
        C81K c81k8 = new C81K("MY_WEEK", 7);
        A07 = c81k8;
        C81K[] c81kArr = {c81k, c81k2, c81k3, c81k4, c81k5, c81k6, c81k7, c81k8};
        A01 = c81kArr;
        A00 = AbstractC12190kN.A00(c81kArr);
    }

    public static C81K valueOf(String str) {
        return (C81K) Enum.valueOf(C81K.class, str);
    }

    public static C81K[] values() {
        return (C81K[]) A01.clone();
    }

    public C81K(String str, int i) {
    }
}
