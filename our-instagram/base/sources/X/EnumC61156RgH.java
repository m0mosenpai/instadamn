package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RgH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61156RgH {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC61156RgH[] A02;
    public static final EnumC61156RgH A03;
    public static final EnumC61156RgH A04;
    public static final EnumC61156RgH A05;
    public static final EnumC61156RgH A06;
    public final String A00;

    static {
        EnumC61156RgH enumC61156RgH = new EnumC61156RgH("LEFT", 0, "LEFT");
        A04 = enumC61156RgH;
        EnumC61156RgH enumC61156RgH2 = new EnumC61156RgH("UP", 1, "UP");
        A06 = enumC61156RgH2;
        EnumC61156RgH enumC61156RgH3 = new EnumC61156RgH("RIGHT", 2, "RIGHT");
        A05 = enumC61156RgH3;
        EnumC61156RgH enumC61156RgH4 = new EnumC61156RgH("DOWN", 3, "DOWN");
        A03 = enumC61156RgH4;
        EnumC61156RgH[] enumC61156RgHArr = {enumC61156RgH, enumC61156RgH2, enumC61156RgH3, enumC61156RgH4};
        A02 = enumC61156RgHArr;
        A01 = AbstractC12190kN.A00(enumC61156RgHArr);
    }

    public static EnumC61156RgH valueOf(String str) {
        return (EnumC61156RgH) Enum.valueOf(EnumC61156RgH.class, str);
    }

    public static EnumC61156RgH[] values() {
        return (EnumC61156RgH[]) A02.clone();
    }

    public EnumC61156RgH(String str, int i, String str2) {
        this.A00 = str2;
    }
}
