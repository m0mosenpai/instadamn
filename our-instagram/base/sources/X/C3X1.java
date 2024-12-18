package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3X1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3X1 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C3X1[] A01;
    public static final C3X1 A02;
    public static final C3X1 A03;
    public static final C3X1 A04;

    static {
        C3X1 c3x1 = new C3X1("RETRY_TEXT", 0);
        A04 = c3x1;
        C3X1 c3x12 = new C3X1("RETRY_ICON", 1);
        A03 = c3x12;
        C3X1 c3x13 = new C3X1(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 2);
        A02 = c3x13;
        C3X1[] c3x1Arr = {c3x1, c3x12, c3x13};
        A01 = c3x1Arr;
        A00 = AbstractC12190kN.A00(c3x1Arr);
    }

    public static C3X1 valueOf(String str) {
        return (C3X1) Enum.valueOf(C3X1.class, str);
    }

    public static C3X1[] values() {
        return (C3X1[]) A01.clone();
    }

    public C3X1(String str, int i) {
    }
}
