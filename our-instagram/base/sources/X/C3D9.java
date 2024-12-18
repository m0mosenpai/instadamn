package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3D9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3D9 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C3D9[] A01;
    public static final C3D9 A02;
    public static final C3D9 A03;
    public static final C3D9 A04;
    public static final C3D9 A05;
    public static final C3D9 A06;

    static {
        C3D9 c3d9 = new C3D9("CACHE", 0);
        A02 = c3d9;
        C3D9 c3d92 = new C3D9("NETWORK", 1);
        A03 = c3d92;
        C3D9 c3d93 = new C3D9("TRAY_RENDER", 2);
        A06 = c3d93;
        C3D9 c3d94 = new C3D9("POG_LOAD", 3);
        A04 = c3d94;
        C3D9 c3d95 = new C3D9("SELF_POG_LOAD", 4);
        A05 = c3d95;
        C3D9[] c3d9Arr = {c3d9, c3d92, c3d93, c3d94, c3d95};
        A01 = c3d9Arr;
        A00 = AbstractC12190kN.A00(c3d9Arr);
    }

    public static C3D9 valueOf(String str) {
        return (C3D9) Enum.valueOf(C3D9.class, str);
    }

    public static C3D9[] values() {
        return (C3D9[]) A01.clone();
    }

    public C3D9(String str, int i) {
    }
}
