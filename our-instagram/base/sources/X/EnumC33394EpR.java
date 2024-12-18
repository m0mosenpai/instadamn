package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33394EpR {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33394EpR[] A02;
    public static final EnumC33394EpR A03;
    public static final EnumC33394EpR A04;
    public static final EnumC33394EpR A05;
    public static final EnumC33394EpR A06;
    public static final EnumC33394EpR A07;
    public final int A00;

    static {
        EnumC33394EpR enumC33394EpR = new EnumC33394EpR("NOTSEEN", 0, 0);
        A05 = enumC33394EpR;
        EnumC33394EpR enumC33394EpR2 = new EnumC33394EpR("SEEN", 1, 1);
        A06 = enumC33394EpR2;
        EnumC33394EpR enumC33394EpR3 = new EnumC33394EpR("CONSENT", 2, 2);
        A03 = enumC33394EpR3;
        EnumC33394EpR enumC33394EpR4 = new EnumC33394EpR("WITHDRAW", 3, 3);
        A07 = enumC33394EpR4;
        EnumC33394EpR enumC33394EpR5 = new EnumC33394EpR("NOTAPPLICABLE", 4, 4);
        A04 = enumC33394EpR5;
        EnumC33394EpR[] enumC33394EpRArr = {enumC33394EpR, enumC33394EpR2, enumC33394EpR3, enumC33394EpR4, enumC33394EpR5, new EnumC33394EpR("BLOCKING", 5, 11)};
        A02 = enumC33394EpRArr;
        A01 = AbstractC12190kN.A00(enumC33394EpRArr);
    }

    public static EnumC33394EpR valueOf(String str) {
        return (EnumC33394EpR) Enum.valueOf(EnumC33394EpR.class, str);
    }

    public static EnumC33394EpR[] values() {
        return (EnumC33394EpR[]) A02.clone();
    }

    public EnumC33394EpR(String str, int i, int i2) {
        this.A00 = i2;
    }
}
