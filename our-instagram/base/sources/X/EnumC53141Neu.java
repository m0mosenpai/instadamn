package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Neu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53141Neu {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53141Neu[] A01;
    public static final EnumC53141Neu A02;
    public static final EnumC53141Neu A03;
    public static final EnumC53141Neu A04;

    static {
        EnumC53141Neu enumC53141Neu = new EnumC53141Neu("IG_FEATURE_NOT_ENABLED", 0);
        A02 = enumC53141Neu;
        EnumC53141Neu enumC53141Neu2 = new EnumC53141Neu("SYSTEM_PERMISSION_DENIED", 1);
        A04 = enumC53141Neu2;
        EnumC53141Neu enumC53141Neu3 = new EnumC53141Neu("SYSTEM_FEATURE_NOT_PRESENT", 2);
        A03 = enumC53141Neu3;
        EnumC53141Neu[] enumC53141NeuArr = {enumC53141Neu, enumC53141Neu2, enumC53141Neu3};
        A01 = enumC53141NeuArr;
        A00 = AbstractC12190kN.A00(enumC53141NeuArr);
    }

    public static EnumC53141Neu valueOf(String str) {
        return (EnumC53141Neu) Enum.valueOf(EnumC53141Neu.class, str);
    }

    public static EnumC53141Neu[] values() {
        return (EnumC53141Neu[]) A01.clone();
    }

    public EnumC53141Neu(String str, int i) {
    }
}
