package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9s2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222619s2 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC222619s2[] A01;
    public static final EnumC222619s2 A02;
    public static final EnumC222619s2 A03;

    static {
        EnumC222619s2 enumC222619s2 = new EnumC222619s2("None", 0);
        A03 = enumC222619s2;
        EnumC222619s2 enumC222619s22 = new EnumC222619s2("AssetHubCutoutTextSticker", 1);
        A02 = enumC222619s22;
        EnumC222619s2[] enumC222619s2Arr = {enumC222619s2, enumC222619s22};
        A01 = enumC222619s2Arr;
        A00 = AbstractC12190kN.A00(enumC222619s2Arr);
    }

    public static EnumC222619s2 valueOf(String str) {
        return (EnumC222619s2) Enum.valueOf(EnumC222619s2.class, str);
    }

    public static EnumC222619s2[] values() {
        return (EnumC222619s2[]) A01.clone();
    }

    public EnumC222619s2(String str, int i) {
    }
}
