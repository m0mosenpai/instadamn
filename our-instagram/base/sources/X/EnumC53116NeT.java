package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53116NeT {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53116NeT[] A01;
    public static final EnumC53116NeT A02;
    public static final EnumC53116NeT A03;

    static {
        EnumC53116NeT enumC53116NeT = new EnumC53116NeT("UPLOAD", 0);
        A03 = enumC53116NeT;
        EnumC53116NeT enumC53116NeT2 = new EnumC53116NeT("GALLERY", 1);
        A02 = enumC53116NeT2;
        EnumC53116NeT[] enumC53116NeTArr = {enumC53116NeT, enumC53116NeT2};
        A01 = enumC53116NeTArr;
        A00 = AbstractC12190kN.A00(enumC53116NeTArr);
    }

    public static EnumC53116NeT valueOf(String str) {
        return (EnumC53116NeT) Enum.valueOf(EnumC53116NeT.class, str);
    }

    public static EnumC53116NeT[] values() {
        return (EnumC53116NeT[]) A01.clone();
    }

    public EnumC53116NeT(String str, int i) {
    }
}
