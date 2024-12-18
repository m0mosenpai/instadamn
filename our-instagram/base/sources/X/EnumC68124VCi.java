package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VCi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68124VCi {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC68124VCi[] A01;
    public static final EnumC68124VCi A02;
    public static final EnumC68124VCi A03;

    static {
        EnumC68124VCi enumC68124VCi = new EnumC68124VCi("HEADER", 0);
        A02 = enumC68124VCi;
        EnumC68124VCi enumC68124VCi2 = new EnumC68124VCi("METADATA", 1);
        A03 = enumC68124VCi2;
        EnumC68124VCi[] enumC68124VCiArr = {enumC68124VCi, enumC68124VCi2};
        A01 = enumC68124VCiArr;
        A00 = AbstractC12190kN.A00(enumC68124VCiArr);
    }

    public static EnumC68124VCi valueOf(String str) {
        return (EnumC68124VCi) Enum.valueOf(EnumC68124VCi.class, str);
    }

    public static EnumC68124VCi[] values() {
        return (EnumC68124VCi[]) A01.clone();
    }

    public EnumC68124VCi(String str, int i) {
    }
}
