package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33377EpA {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33377EpA[] A02;
    public static final EnumC33377EpA A03;
    public static final EnumC33377EpA A04;
    public final EnumC33462Eqx A00;

    static {
        EnumC33377EpA enumC33377EpA = new EnumC33377EpA(EnumC33462Eqx.POSTBACK, "POSTBACK", 0);
        A04 = enumC33377EpA;
        EnumC33377EpA enumC33377EpA2 = new EnumC33377EpA(EnumC33462Eqx.WEB_URL, "OPEN_URL", 1);
        A03 = enumC33377EpA2;
        EnumC33377EpA[] enumC33377EpAArr = {enumC33377EpA, enumC33377EpA2};
        A02 = enumC33377EpAArr;
        A01 = AbstractC12190kN.A00(enumC33377EpAArr);
    }

    public static EnumC33377EpA valueOf(String str) {
        return (EnumC33377EpA) Enum.valueOf(EnumC33377EpA.class, str);
    }

    public static EnumC33377EpA[] values() {
        return (EnumC33377EpA[]) A02.clone();
    }

    public EnumC33377EpA(EnumC33462Eqx enumC33462Eqx, String str, int i) {
        this.A00 = enumC33462Eqx;
    }
}
