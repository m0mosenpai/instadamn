package X;

import android.util.SparseArray;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6m2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC148326m2 {
    public static final SparseArray A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC148326m2[] A03;
    public static final EnumC148326m2 A04;
    public static final EnumC148326m2 A05;
    public static final EnumC148326m2 A06;
    public final int A00;

    static {
        EnumC148326m2 enumC148326m2 = new EnumC148326m2("STICKER", 0, 0);
        A06 = enumC148326m2;
        EnumC148326m2 enumC148326m22 = new EnumC148326m2("EMOJI", 1, 1);
        A04 = enumC148326m22;
        EnumC148326m2 enumC148326m23 = new EnumC148326m2("PLUS_BUTTON", 2, 2);
        A05 = enumC148326m23;
        EnumC148326m2[] enumC148326m2Arr = {enumC148326m2, enumC148326m22, enumC148326m23};
        A03 = enumC148326m2Arr;
        A02 = AbstractC12190kN.A00(enumC148326m2Arr);
        A01 = new SparseArray();
        for (EnumC148326m2 enumC148326m24 : values()) {
            A01.put(enumC148326m24.A00, enumC148326m24);
        }
    }

    public static EnumC148326m2 valueOf(String str) {
        return (EnumC148326m2) Enum.valueOf(EnumC148326m2.class, str);
    }

    public static EnumC148326m2[] values() {
        return (EnumC148326m2[]) A03.clone();
    }

    public EnumC148326m2(String str, int i, int i2) {
        this.A00 = i2;
    }
}
