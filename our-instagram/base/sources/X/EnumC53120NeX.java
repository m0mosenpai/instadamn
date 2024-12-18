package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53120NeX {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53120NeX[] A01;
    public static final EnumC53120NeX A02;
    public static final EnumC53120NeX A03;

    static {
        EnumC53120NeX enumC53120NeX = new EnumC53120NeX("VIEW", 0);
        A03 = enumC53120NeX;
        EnumC53120NeX enumC53120NeX2 = new EnumC53120NeX("EDIT", 1);
        A02 = enumC53120NeX2;
        EnumC53120NeX[] enumC53120NeXArr = {enumC53120NeX, enumC53120NeX2};
        A01 = enumC53120NeXArr;
        A00 = AbstractC12190kN.A00(enumC53120NeXArr);
    }

    public static EnumC53120NeX valueOf(String str) {
        return (EnumC53120NeX) Enum.valueOf(EnumC53120NeX.class, str);
    }

    public static EnumC53120NeX[] values() {
        return (EnumC53120NeX[]) A01.clone();
    }

    public EnumC53120NeX(String str, int i) {
    }
}
