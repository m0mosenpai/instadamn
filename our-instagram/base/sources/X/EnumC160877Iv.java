package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7Iv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC160877Iv {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC160877Iv[] A02;
    public static final EnumC160877Iv A03;
    public static final EnumC160877Iv A04;
    public static final EnumC160877Iv A05;
    public final int A00;

    static {
        EnumC160877Iv enumC160877Iv = new EnumC160877Iv("ADMIN_ONLY", 0, 0);
        A03 = enumC160877Iv;
        EnumC160877Iv enumC160877Iv2 = new EnumC160877Iv("ALL_MEMBERS", 1, 1);
        A04 = enumC160877Iv2;
        EnumC160877Iv enumC160877Iv3 = new EnumC160877Iv("UNKNOWN", 2, -1);
        A05 = enumC160877Iv3;
        EnumC160877Iv[] enumC160877IvArr = {enumC160877Iv, enumC160877Iv2, enumC160877Iv3};
        A02 = enumC160877IvArr;
        A01 = AbstractC12190kN.A00(enumC160877IvArr);
    }

    public static EnumC160877Iv valueOf(String str) {
        return (EnumC160877Iv) Enum.valueOf(EnumC160877Iv.class, str);
    }

    public static EnumC160877Iv[] values() {
        return (EnumC160877Iv[]) A02.clone();
    }

    public EnumC160877Iv(String str, int i, int i2) {
        this.A00 = i2;
    }
}
