package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7R2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7R2 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C7R2[] A01;
    public static final C7R2 A02;
    public static final C7R2 A03;
    public static final C7R2 A04;
    public static final C7R2 A05;

    static {
        C7R2 c7r2 = new C7R2(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A05 = c7r2;
        C7R2 c7r22 = new C7R2("GROUP_WITH_ABOVE", 1);
        A02 = c7r22;
        C7R2 c7r23 = new C7R2("GROUP_WITH_BELOW", 2);
        A03 = c7r23;
        C7R2 c7r24 = new C7R2("GROUP_WITH_BOTH", 3);
        A04 = c7r24;
        C7R2[] c7r2Arr = {c7r2, c7r22, c7r23, c7r24};
        A01 = c7r2Arr;
        A00 = AbstractC12190kN.A00(c7r2Arr);
    }

    public static C7R2 valueOf(String str) {
        return (C7R2) Enum.valueOf(C7R2.class, str);
    }

    public static C7R2[] values() {
        return (C7R2[]) A01.clone();
    }

    public C7R2(String str, int i) {
    }
}
