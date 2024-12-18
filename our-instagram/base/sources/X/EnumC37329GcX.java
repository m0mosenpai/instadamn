package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.GcX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC37329GcX {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC37329GcX[] A01;
    public static final EnumC37329GcX A02;
    public static final EnumC37329GcX A03;

    static {
        EnumC37329GcX enumC37329GcX = new EnumC37329GcX("VOLUME_UP", 0);
        A03 = enumC37329GcX;
        EnumC37329GcX enumC37329GcX2 = new EnumC37329GcX("VOLUME_DOWN", 1);
        A02 = enumC37329GcX2;
        EnumC37329GcX[] enumC37329GcXArr = {enumC37329GcX, enumC37329GcX2};
        A01 = enumC37329GcXArr;
        A00 = AbstractC12190kN.A00(enumC37329GcXArr);
    }

    public static EnumC37329GcX valueOf(String str) {
        return (EnumC37329GcX) Enum.valueOf(EnumC37329GcX.class, str);
    }

    public static EnumC37329GcX[] values() {
        return (EnumC37329GcX[]) A01.clone();
    }

    public EnumC37329GcX(String str, int i) {
    }
}
