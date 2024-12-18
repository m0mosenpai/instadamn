package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VCo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68130VCo {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC68130VCo[] A01;
    public static final EnumC68130VCo A02;
    public static final EnumC68130VCo A03;
    public static final EnumC68130VCo A04;

    public static EnumC68130VCo valueOf(String str) {
        return (EnumC68130VCo) Enum.valueOf(EnumC68130VCo.class, str);
    }

    public static EnumC68130VCo[] values() {
        return (EnumC68130VCo[]) A01.clone();
    }

    static {
        EnumC68130VCo enumC68130VCo = new EnumC68130VCo("RAW", 0);
        A03 = enumC68130VCo;
        EnumC68130VCo enumC68130VCo2 = new EnumC68130VCo("SEGMENTED_TRANSCODE", 1);
        A04 = enumC68130VCo2;
        EnumC68130VCo enumC68130VCo3 = new EnumC68130VCo("NON_SEGMENTED_TRANSCODE", 2);
        A02 = enumC68130VCo3;
        EnumC68130VCo[] enumC68130VCoArr = {enumC68130VCo, enumC68130VCo2, enumC68130VCo3, new EnumC68130VCo("RESIZED_PTV", 3)};
        A01 = enumC68130VCoArr;
        A00 = AbstractC12190kN.A00(enumC68130VCoArr);
    }

    public EnumC68130VCo(String str, int i) {
    }
}
