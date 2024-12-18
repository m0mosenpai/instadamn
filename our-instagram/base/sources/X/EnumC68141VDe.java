package X;

import android.util.SparseArray;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VDe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68141VDe {
    public static final SparseArray A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68141VDe[] A03;
    public static final EnumC68141VDe A04;
    public static final EnumC68141VDe A05;
    public static final EnumC68141VDe A06;
    public final int A00;

    static {
        EnumC68141VDe enumC68141VDe = new EnumC68141VDe("NOT_SHARED", 0, 0);
        A04 = enumC68141VDe;
        EnumC68141VDe enumC68141VDe2 = new EnumC68141VDe("SHARING", 1, 1);
        A05 = enumC68141VDe2;
        EnumC68141VDe enumC68141VDe3 = new EnumC68141VDe("UNSHARING", 2, 2);
        A06 = enumC68141VDe3;
        EnumC68141VDe[] enumC68141VDeArr = {enumC68141VDe, enumC68141VDe2, enumC68141VDe3, new EnumC68141VDe("SHARED", 3, 3)};
        A03 = enumC68141VDeArr;
        A02 = AbstractC12190kN.A00(enumC68141VDeArr);
        A01 = new SparseArray();
        for (EnumC68141VDe enumC68141VDe4 : values()) {
            A01.put(enumC68141VDe4.A00, enumC68141VDe4);
        }
    }

    public static EnumC68141VDe valueOf(String str) {
        return (EnumC68141VDe) Enum.valueOf(EnumC68141VDe.class, str);
    }

    public static EnumC68141VDe[] values() {
        return (EnumC68141VDe[]) A03.clone();
    }

    public EnumC68141VDe(String str, int i, int i2) {
        this.A00 = i2;
    }
}
