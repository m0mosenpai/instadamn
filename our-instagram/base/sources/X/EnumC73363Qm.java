package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3Qm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC73363Qm {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC73363Qm[] A02;
    public static final EnumC73363Qm A03;
    public static final EnumC73363Qm A04;
    public static final EnumC73363Qm A05;
    public final String A00;

    static {
        EnumC73363Qm enumC73363Qm = new EnumC73363Qm("NETWORK", 0, "n");
        A05 = enumC73363Qm;
        EnumC73363Qm enumC73363Qm2 = new EnumC73363Qm("CACHED", 1, "c");
        A03 = enumC73363Qm2;
        EnumC73363Qm enumC73363Qm3 = new EnumC73363Qm("LOCAL", 2, "l");
        A04 = enumC73363Qm3;
        EnumC73363Qm[] enumC73363QmArr = {enumC73363Qm, enumC73363Qm2, enumC73363Qm3};
        A02 = enumC73363QmArr;
        A01 = AbstractC12190kN.A00(enumC73363QmArr);
    }

    public static EnumC73363Qm valueOf(String str) {
        return (EnumC73363Qm) Enum.valueOf(EnumC73363Qm.class, str);
    }

    public static EnumC73363Qm[] values() {
        return (EnumC73363Qm[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC73363Qm(String str, int i, String str2) {
        this.A00 = str2;
    }
}
