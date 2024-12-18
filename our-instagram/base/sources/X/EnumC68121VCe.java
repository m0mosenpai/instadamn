package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VCe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68121VCe {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC68121VCe[] A01;
    public static final EnumC68121VCe A02;
    public static final EnumC68121VCe A03;

    static {
        EnumC68121VCe enumC68121VCe = new EnumC68121VCe("SINGLE_POST", 0);
        A03 = enumC68121VCe;
        EnumC68121VCe enumC68121VCe2 = new EnumC68121VCe("COMPARE_2_POSTS", 1);
        A02 = enumC68121VCe2;
        EnumC68121VCe[] enumC68121VCeArr = {enumC68121VCe, enumC68121VCe2};
        A01 = enumC68121VCeArr;
        A00 = AbstractC12190kN.A00(enumC68121VCeArr);
    }

    public static EnumC68121VCe valueOf(String str) {
        return (EnumC68121VCe) Enum.valueOf(EnumC68121VCe.class, str);
    }

    public static EnumC68121VCe[] values() {
        return (EnumC68121VCe[]) A01.clone();
    }

    public EnumC68121VCe(String str, int i) {
    }
}
