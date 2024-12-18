package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RgE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61153RgE {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC61153RgE[] A02;
    public static final EnumC61153RgE A03;
    public static final EnumC61153RgE A04;
    public static final EnumC61153RgE A05;
    public static final EnumC61153RgE A06;
    public final String A00;

    static {
        EnumC61153RgE enumC61153RgE = new EnumC61153RgE("TOP", 0, "top");
        A06 = enumC61153RgE;
        EnumC61153RgE enumC61153RgE2 = new EnumC61153RgE("BOTTOM", 1, "bottom");
        A03 = enumC61153RgE2;
        EnumC61153RgE enumC61153RgE3 = new EnumC61153RgE("LEFT", 2, "left");
        A04 = enumC61153RgE3;
        EnumC61153RgE enumC61153RgE4 = new EnumC61153RgE("RIGHT", 3, "right");
        A05 = enumC61153RgE4;
        EnumC61153RgE[] enumC61153RgEArr = {enumC61153RgE, enumC61153RgE2, enumC61153RgE3, enumC61153RgE4};
        A02 = enumC61153RgEArr;
        A01 = AbstractC12190kN.A00(enumC61153RgEArr);
    }

    public static EnumC61153RgE valueOf(String str) {
        return (EnumC61153RgE) Enum.valueOf(EnumC61153RgE.class, str);
    }

    public static EnumC61153RgE[] values() {
        return (EnumC61153RgE[]) A02.clone();
    }

    public EnumC61153RgE(String str, int i, String str2) {
        this.A00 = str2;
    }
}
