package X;

import android.util.SparseArray;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3cN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC76753cN {
    public static final SparseArray A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC76753cN[] A03;
    public static final EnumC76753cN A04;
    public static final EnumC76753cN A05;
    public static final EnumC76753cN A06;
    public static final EnumC76753cN A07;
    public final int A00;

    static {
        EnumC76753cN enumC76753cN = new EnumC76753cN("NOT_SHARED", 0, 0);
        A04 = enumC76753cN;
        EnumC76753cN enumC76753cN2 = new EnumC76753cN("SHARING", 1, 1);
        A06 = enumC76753cN2;
        EnumC76753cN enumC76753cN3 = new EnumC76753cN("UNSHARING", 2, 2);
        A07 = enumC76753cN3;
        EnumC76753cN enumC76753cN4 = new EnumC76753cN("SHARED", 3, 3);
        A05 = enumC76753cN4;
        EnumC76753cN[] enumC76753cNArr = {enumC76753cN, enumC76753cN2, enumC76753cN3, enumC76753cN4};
        A03 = enumC76753cNArr;
        A02 = AbstractC12190kN.A00(enumC76753cNArr);
        A01 = new SparseArray();
        for (EnumC76753cN enumC76753cN5 : values()) {
            A01.put(enumC76753cN5.A00, enumC76753cN5);
        }
    }

    public static EnumC76753cN valueOf(String str) {
        return (EnumC76753cN) Enum.valueOf(EnumC76753cN.class, str);
    }

    public static EnumC76753cN[] values() {
        return (EnumC76753cN[]) A03.clone();
    }

    public EnumC76753cN(String str, int i, int i2) {
        this.A00 = i2;
    }
}
