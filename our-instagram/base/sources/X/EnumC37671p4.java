package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1p4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class EnumC37671p4 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC37671p4[] A02;
    public static final EnumC37671p4 A03;
    public static final EnumC37671p4 A04;
    public final String A00;

    public abstract int A00(int i, int i2);

    static {
        EnumC37671p4 enumC37671p4 = new EnumC37671p4() { // from class: X.1p5
            @Override // X.EnumC37671p4
            public final int A00(int i, int i2) {
                return i;
            }
        };
        A04 = enumC37671p4;
        EnumC37671p4 enumC37671p42 = new EnumC37671p4() { // from class: X.1p6
            @Override // X.EnumC37671p4
            public final int A00(int i, int i2) {
                return i + i2;
            }
        };
        A03 = enumC37671p42;
        EnumC37671p4[] enumC37671p4Arr = {enumC37671p4, enumC37671p42};
        A02 = enumC37671p4Arr;
        A01 = AbstractC12190kN.A00(enumC37671p4Arr);
    }

    public EnumC37671p4(String str, int i, String str2) {
        this.A00 = str2;
    }
}
