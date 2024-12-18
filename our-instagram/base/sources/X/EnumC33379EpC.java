package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33379EpC {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33379EpC[] A02;
    public static final EnumC33379EpC A03;
    public static final EnumC33379EpC A04;
    public final int A00;

    public static EnumC33379EpC valueOf(String str) {
        return (EnumC33379EpC) Enum.valueOf(EnumC33379EpC.class, str);
    }

    public static EnumC33379EpC[] values() {
        return (EnumC33379EpC[]) A02.clone();
    }

    static {
        EnumC33379EpC enumC33379EpC = new EnumC33379EpC("Links", 0, 2131965255);
        A04 = enumC33379EpC;
        EnumC33379EpC enumC33379EpC2 = new EnumC33379EpC("Channels", 1, 2131955107);
        A03 = enumC33379EpC2;
        EnumC33379EpC[] enumC33379EpCArr = {enumC33379EpC, enumC33379EpC2};
        A02 = enumC33379EpCArr;
        A01 = AbstractC12190kN.A00(enumC33379EpCArr);
    }

    public EnumC33379EpC(String str, int i, int i2) {
        this.A00 = i2;
    }
}
