package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4Qe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC95184Qe {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC95184Qe[] A01;
    public static final EnumC95184Qe A02;
    public static final EnumC95184Qe A03;
    public static final EnumC95184Qe A04;
    public static final EnumC95184Qe A05;
    public static final EnumC95184Qe A06;

    static {
        EnumC95184Qe enumC95184Qe = new EnumC95184Qe("FIT", 0);
        A04 = enumC95184Qe;
        EnumC95184Qe enumC95184Qe2 = new EnumC95184Qe("FILL", 1);
        A03 = enumC95184Qe2;
        EnumC95184Qe enumC95184Qe3 = new EnumC95184Qe("FIT_WITH_LIMITS", 2);
        A05 = enumC95184Qe3;
        EnumC95184Qe enumC95184Qe4 = new EnumC95184Qe("TOP_CROP", 3);
        A06 = enumC95184Qe4;
        EnumC95184Qe enumC95184Qe5 = new EnumC95184Qe("CUSTOM_CROP_TOP_COORDINATE", 4);
        A02 = enumC95184Qe5;
        EnumC95184Qe[] enumC95184QeArr = {enumC95184Qe, enumC95184Qe2, enumC95184Qe3, enumC95184Qe4, enumC95184Qe5, new EnumC95184Qe("TOP_CENTER_SQUARE_CROP_LIVE_DIVIDER", 5)};
        A01 = enumC95184QeArr;
        A00 = AbstractC12190kN.A00(enumC95184QeArr);
    }

    public static EnumC95184Qe valueOf(String str) {
        return (EnumC95184Qe) Enum.valueOf(EnumC95184Qe.class, str);
    }

    public static EnumC95184Qe[] values() {
        return (EnumC95184Qe[]) A01.clone();
    }

    public EnumC95184Qe(String str, int i) {
    }
}
