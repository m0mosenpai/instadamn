package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1Pk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC26291Pk {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC26291Pk[] A01;
    public static final EnumC26291Pk A02;
    public static final EnumC26291Pk A03;
    public static final EnumC26291Pk A04;

    static {
        EnumC26291Pk enumC26291Pk = new EnumC26291Pk("SPONSORED", 0);
        A04 = enumC26291Pk;
        EnumC26291Pk enumC26291Pk2 = new EnumC26291Pk("ORGANIC", 1);
        A03 = enumC26291Pk2;
        EnumC26291Pk enumC26291Pk3 = new EnumC26291Pk("MULTI_AD", 2);
        A02 = enumC26291Pk3;
        EnumC26291Pk[] enumC26291PkArr = {enumC26291Pk, enumC26291Pk2, enumC26291Pk3};
        A01 = enumC26291PkArr;
        A00 = AbstractC12190kN.A00(enumC26291PkArr);
    }

    public static EnumC26291Pk valueOf(String str) {
        return (EnumC26291Pk) Enum.valueOf(EnumC26291Pk.class, str);
    }

    public static EnumC26291Pk[] values() {
        return (EnumC26291Pk[]) A01.clone();
    }

    public EnumC26291Pk(String str, int i) {
    }
}
