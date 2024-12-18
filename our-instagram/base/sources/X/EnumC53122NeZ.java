package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53122NeZ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53122NeZ[] A01;
    public static final EnumC53122NeZ A02;
    public static final EnumC53122NeZ A03;

    static {
        EnumC53122NeZ enumC53122NeZ = new EnumC53122NeZ("VIEW_BOUND", 0);
        A03 = enumC53122NeZ;
        EnumC53122NeZ enumC53122NeZ2 = new EnumC53122NeZ("FRAME_RENDERED", 1);
        A02 = enumC53122NeZ2;
        EnumC53122NeZ[] enumC53122NeZArr = {enumC53122NeZ, enumC53122NeZ2};
        A01 = enumC53122NeZArr;
        A00 = AbstractC12190kN.A00(enumC53122NeZArr);
    }

    public static EnumC53122NeZ valueOf(String str) {
        return (EnumC53122NeZ) Enum.valueOf(EnumC53122NeZ.class, str);
    }

    public static EnumC53122NeZ[] values() {
        return (EnumC53122NeZ[]) A01.clone();
    }

    public EnumC53122NeZ(String str, int i) {
    }
}
