package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NhH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53279NhH {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53279NhH[] A01;
    public static final EnumC53279NhH A02;
    public static final EnumC53279NhH A03;
    public static final EnumC53279NhH A04;
    public static final EnumC53279NhH A05;
    public static final EnumC53279NhH A06;
    public static final EnumC53279NhH A07;

    static {
        EnumC53279NhH enumC53279NhH = new EnumC53279NhH("EFFECT", 0);
        A04 = enumC53279NhH;
        EnumC53279NhH enumC53279NhH2 = new EnumC53279NhH("FILTER", 1);
        A05 = enumC53279NhH2;
        EnumC53279NhH enumC53279NhH3 = new EnumC53279NhH("MULTIPEER", 2);
        A06 = enumC53279NhH3;
        EnumC53279NhH enumC53279NhH4 = new EnumC53279NhH("SOLO_BACKGROUNDS", 3);
        A07 = enumC53279NhH4;
        EnumC53279NhH enumC53279NhH5 = new EnumC53279NhH("AVATAR", 4);
        A02 = enumC53279NhH5;
        EnumC53279NhH enumC53279NhH6 = new EnumC53279NhH("AVATAR_BACKGROUND", 5);
        A03 = enumC53279NhH6;
        EnumC53279NhH[] enumC53279NhHArr = {enumC53279NhH, enumC53279NhH2, enumC53279NhH3, enumC53279NhH4, enumC53279NhH5, enumC53279NhH6};
        A01 = enumC53279NhHArr;
        A00 = AbstractC12190kN.A00(enumC53279NhHArr);
    }

    public static EnumC53279NhH valueOf(String str) {
        return (EnumC53279NhH) Enum.valueOf(EnumC53279NhH.class, str);
    }

    public static EnumC53279NhH[] values() {
        return (EnumC53279NhH[]) A01.clone();
    }

    public final EnumC53238Ngb A00(boolean z) {
        switch (ordinal()) {
            case 0:
                return EnumC53238Ngb.A06;
            case 1:
                if (!z) {
                    return EnumC53238Ngb.A07;
                }
                return EnumC53238Ngb.A05;
            case 2:
                return EnumC53238Ngb.A08;
            case 3:
                return EnumC53238Ngb.A09;
            case 4:
                return EnumC53238Ngb.A03;
            case 5:
                return EnumC53238Ngb.A04;
            default:
                throw B4Z.A00();
        }
    }

    public EnumC53279NhH(String str, int i) {
    }
}
