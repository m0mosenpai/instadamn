package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VDf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68142VDf {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC68142VDf[] A02;
    public static final EnumC68142VDf A03;
    public static final EnumC68142VDf A04;
    public static final EnumC68142VDf A05;
    public static final EnumC68142VDf A06;
    public final int A00;

    static {
        EnumC68142VDf enumC68142VDf = new EnumC68142VDf("GOOGLE_PLAY_STORE_LIGHT", 0, 1);
        A06 = enumC68142VDf;
        EnumC68142VDf enumC68142VDf2 = new EnumC68142VDf("GOOGLE_PLAY_STORE_DARK", 1, 2);
        A05 = enumC68142VDf2;
        EnumC68142VDf enumC68142VDf3 = new EnumC68142VDf("APPLE_APP_STORE_LIGHT", 2, 3);
        A04 = enumC68142VDf3;
        EnumC68142VDf enumC68142VDf4 = new EnumC68142VDf("APPLE_APP_STORE_DARK", 3, 4);
        A03 = enumC68142VDf4;
        EnumC68142VDf[] enumC68142VDfArr = {enumC68142VDf, enumC68142VDf2, enumC68142VDf3, enumC68142VDf4};
        A02 = enumC68142VDfArr;
        A01 = AbstractC12190kN.A00(enumC68142VDfArr);
    }

    public static EnumC68142VDf valueOf(String str) {
        return (EnumC68142VDf) Enum.valueOf(EnumC68142VDf.class, str);
    }

    public static EnumC68142VDf[] values() {
        return (EnumC68142VDf[]) A02.clone();
    }

    public EnumC68142VDf(String str, int i, int i2) {
        this.A00 = i2;
    }
}
