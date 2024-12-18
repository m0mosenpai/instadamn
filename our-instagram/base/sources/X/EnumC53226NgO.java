package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53226NgO {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53226NgO[] A02;
    public static final EnumC53226NgO A03;
    public static final EnumC53226NgO A04;
    public static final EnumC53226NgO A05;
    public static final EnumC53226NgO A06;
    public final int A00;

    public static EnumC53226NgO valueOf(String str) {
        return (EnumC53226NgO) Enum.valueOf(EnumC53226NgO.class, str);
    }

    public static EnumC53226NgO[] values() {
        return (EnumC53226NgO[]) A02.clone();
    }

    static {
        EnumC53226NgO enumC53226NgO = new EnumC53226NgO("FOR_YOU", 0, 2131967993);
        A03 = enumC53226NgO;
        EnumC53226NgO enumC53226NgO2 = new EnumC53226NgO("TRENDING", 1, 2131967922);
        A06 = enumC53226NgO2;
        EnumC53226NgO enumC53226NgO3 = new EnumC53226NgO("SAVED", 2, 2131967991);
        A05 = enumC53226NgO3;
        EnumC53226NgO enumC53226NgO4 = new EnumC53226NgO("ORIGINAL_AUDIO", 3, 2131967990);
        A04 = enumC53226NgO4;
        EnumC53226NgO[] enumC53226NgOArr = {enumC53226NgO, enumC53226NgO2, enumC53226NgO3, enumC53226NgO4};
        A02 = enumC53226NgOArr;
        A01 = AbstractC12190kN.A00(enumC53226NgOArr);
    }

    public EnumC53226NgO(String str, int i, int i2) {
        this.A00 = i2;
    }
}
