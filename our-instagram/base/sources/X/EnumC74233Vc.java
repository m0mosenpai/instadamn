package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3Vc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC74233Vc {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC74233Vc[] A01;
    public static final EnumC74233Vc A02;
    public static final EnumC74233Vc A03;

    static {
        EnumC74233Vc enumC74233Vc = new EnumC74233Vc("HORIZONTAL", 0);
        A02 = enumC74233Vc;
        EnumC74233Vc enumC74233Vc2 = new EnumC74233Vc("VERTICAL", 1);
        A03 = enumC74233Vc2;
        EnumC74233Vc[] enumC74233VcArr = {enumC74233Vc, enumC74233Vc2};
        A01 = enumC74233VcArr;
        A00 = AbstractC12190kN.A00(enumC74233VcArr);
    }

    public static EnumC74233Vc valueOf(String str) {
        return (EnumC74233Vc) Enum.valueOf(EnumC74233Vc.class, str);
    }

    public static EnumC74233Vc[] values() {
        return (EnumC74233Vc[]) A01.clone();
    }

    public EnumC74233Vc(String str, int i) {
    }
}
