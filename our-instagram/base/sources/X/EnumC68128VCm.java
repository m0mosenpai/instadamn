package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VCm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68128VCm {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC68128VCm[] A01;
    public static final EnumC68128VCm A02;
    public static final EnumC68128VCm A03;
    public static final EnumC68128VCm A04;

    static {
        EnumC68128VCm enumC68128VCm = new EnumC68128VCm("UNKNOWN", 0);
        A04 = enumC68128VCm;
        EnumC68128VCm enumC68128VCm2 = new EnumC68128VCm("NETWORK_FAILURE", 1);
        A02 = enumC68128VCm2;
        EnumC68128VCm enumC68128VCm3 = new EnumC68128VCm("STORAGE_INSUFFICIENT", 2);
        A03 = enumC68128VCm3;
        EnumC68128VCm[] enumC68128VCmArr = {enumC68128VCm, enumC68128VCm2, enumC68128VCm3};
        A01 = enumC68128VCmArr;
        A00 = AbstractC12190kN.A00(enumC68128VCmArr);
    }

    public static EnumC68128VCm valueOf(String str) {
        return (EnumC68128VCm) Enum.valueOf(EnumC68128VCm.class, str);
    }

    public static EnumC68128VCm[] values() {
        return (EnumC68128VCm[]) A01.clone();
    }

    public EnumC68128VCm(String str, int i) {
    }
}
