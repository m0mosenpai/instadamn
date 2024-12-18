package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53112NeP {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53112NeP[] A01;
    public static final EnumC53112NeP A02;
    public static final EnumC53112NeP A03;

    static {
        EnumC53112NeP enumC53112NeP = new EnumC53112NeP("SMALL", 0);
        A03 = enumC53112NeP;
        EnumC53112NeP enumC53112NeP2 = new EnumC53112NeP("LARGE", 1);
        A02 = enumC53112NeP2;
        EnumC53112NeP[] enumC53112NePArr = {enumC53112NeP, enumC53112NeP2};
        A01 = enumC53112NePArr;
        A00 = AbstractC12190kN.A00(enumC53112NePArr);
    }

    public static EnumC53112NeP valueOf(String str) {
        return (EnumC53112NeP) Enum.valueOf(EnumC53112NeP.class, str);
    }

    public static EnumC53112NeP[] values() {
        return (EnumC53112NeP[]) A01.clone();
    }

    public EnumC53112NeP(String str, int i) {
    }
}
