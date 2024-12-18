package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kcl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46209Kcl {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC46209Kcl[] A03;
    public static final EnumC46209Kcl A04;
    public static final EnumC46209Kcl A05;
    public final int A00;
    public final int A01;

    public static EnumC46209Kcl valueOf(String str) {
        return (EnumC46209Kcl) Enum.valueOf(EnumC46209Kcl.class, str);
    }

    public static EnumC46209Kcl[] values() {
        return (EnumC46209Kcl[]) A03.clone();
    }

    static {
        EnumC46209Kcl enumC46209Kcl = new EnumC46209Kcl("LAUNCH", 0, 2131956816, 2131956815);
        A05 = enumC46209Kcl;
        EnumC46209Kcl enumC46209Kcl2 = new EnumC46209Kcl("AUTO_MIGRATION", 1, 2131956808, 2131956807);
        A04 = enumC46209Kcl2;
        EnumC46209Kcl[] enumC46209KclArr = {enumC46209Kcl, enumC46209Kcl2};
        A03 = enumC46209KclArr;
        A02 = AbstractC12190kN.A00(enumC46209KclArr);
    }

    public EnumC46209Kcl(String str, int i, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
    }
}
