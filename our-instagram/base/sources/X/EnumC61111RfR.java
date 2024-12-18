package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RfR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61111RfR {
    public static final EnumC61111RfR A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC61111RfR[] A02;
    public static final EnumC61111RfR A03;
    public static final EnumC61111RfR A04;

    static {
        EnumC61111RfR enumC61111RfR = new EnumC61111RfR("ONE_SIDE", 0);
        A03 = enumC61111RfR;
        EnumC61111RfR enumC61111RfR2 = new EnumC61111RfR("TWO_SIDES", 1);
        A04 = enumC61111RfR2;
        EnumC61111RfR[] enumC61111RfRArr = {enumC61111RfR, enumC61111RfR2};
        A02 = enumC61111RfRArr;
        A01 = AbstractC12190kN.A00(enumC61111RfRArr);
        A00 = enumC61111RfR;
    }

    public static EnumC61111RfR valueOf(String str) {
        return (EnumC61111RfR) Enum.valueOf(EnumC61111RfR.class, str);
    }

    public static EnumC61111RfR[] values() {
        return (EnumC61111RfR[]) A02.clone();
    }

    public EnumC61111RfR(String str, int i) {
    }
}
