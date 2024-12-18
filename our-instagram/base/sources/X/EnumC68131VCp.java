package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VCp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68131VCp {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC68131VCp[] A01;
    public static final EnumC68131VCp A02;
    public static final EnumC68131VCp A03;
    public static final EnumC68131VCp A04;

    static {
        EnumC68131VCp enumC68131VCp = new EnumC68131VCp("AUTH", 0);
        A02 = enumC68131VCp;
        EnumC68131VCp enumC68131VCp2 = new EnumC68131VCp("CAPTURE", 1);
        A03 = enumC68131VCp2;
        EnumC68131VCp enumC68131VCp3 = new EnumC68131VCp("CHARGE", 2);
        A04 = enumC68131VCp3;
        EnumC68131VCp[] enumC68131VCpArr = {enumC68131VCp, enumC68131VCp2, enumC68131VCp3};
        A01 = enumC68131VCpArr;
        A00 = AbstractC12190kN.A00(enumC68131VCpArr);
    }

    public static EnumC68131VCp valueOf(String str) {
        return (EnumC68131VCp) Enum.valueOf(EnumC68131VCp.class, str);
    }

    public static EnumC68131VCp[] values() {
        return (EnumC68131VCp[]) A01.clone();
    }

    public EnumC68131VCp(String str, int i) {
    }
}
