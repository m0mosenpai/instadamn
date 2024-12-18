package X;

import android.util.SparseArray;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53229NgR {
    public static final SparseArray A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53229NgR[] A03;
    public static final EnumC53229NgR A04;
    public static final EnumC53229NgR A05;
    public static final EnumC53229NgR A06;
    public static final EnumC53229NgR A07;
    public final int A00;

    static {
        EnumC53229NgR enumC53229NgR = new EnumC53229NgR("PHOTO", 0, 0);
        A06 = enumC53229NgR;
        EnumC53229NgR enumC53229NgR2 = new EnumC53229NgR("VIDEO", 1, 1);
        A07 = enumC53229NgR2;
        EnumC53229NgR enumC53229NgR3 = new EnumC53229NgR("OTHER", 2, 2);
        A05 = enumC53229NgR3;
        EnumC53229NgR enumC53229NgR4 = new EnumC53229NgR("MIXED", 3, 3);
        A04 = enumC53229NgR4;
        EnumC53229NgR[] enumC53229NgRArr = {enumC53229NgR, enumC53229NgR2, enumC53229NgR3, enumC53229NgR4};
        A03 = enumC53229NgRArr;
        A02 = AbstractC12190kN.A00(enumC53229NgRArr);
        A01 = new SparseArray();
        for (EnumC53229NgR enumC53229NgR5 : values()) {
            A01.put(enumC53229NgR5.A00, enumC53229NgR5);
        }
    }

    public static EnumC53229NgR valueOf(String str) {
        return (EnumC53229NgR) Enum.valueOf(EnumC53229NgR.class, str);
    }

    public static EnumC53229NgR[] values() {
        return (EnumC53229NgR[]) A03.clone();
    }

    public EnumC53229NgR(String str, int i, int i2) {
        this.A00 = i2;
    }
}
