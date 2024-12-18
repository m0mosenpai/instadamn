package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Epr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33420Epr {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC33420Epr[] A04;
    public static final EnumC33420Epr A05;
    public static final EnumC33420Epr A06;
    public static final EnumC33420Epr A07;
    public static final EnumC33420Epr A08;
    public final int A00;
    public final int A01;
    public final int A02;

    public static EnumC33420Epr valueOf(String str) {
        return (EnumC33420Epr) Enum.valueOf(EnumC33420Epr.class, str);
    }

    public static EnumC33420Epr[] values() {
        return (EnumC33420Epr[]) A04.clone();
    }

    static {
        EnumC33420Epr enumC33420Epr = new EnumC33420Epr("ADD_YOURS", 0, 2131971095, 2131971090, 148);
        A05 = enumC33420Epr;
        EnumC33420Epr enumC33420Epr2 = new EnumC33420Epr("QUESTIONS", 1, 2131971106, 2131971103, 150);
        A08 = enumC33420Epr2;
        EnumC33420Epr enumC33420Epr3 = new EnumC33420Epr("CHALLENGES", 2, 2131954986, 2131973639, 162);
        A06 = enumC33420Epr3;
        EnumC33420Epr enumC33420Epr4 = new EnumC33420Epr("DAILY_PROMPT", 3, 2131958897, 2131971100, 163);
        A07 = enumC33420Epr4;
        EnumC33420Epr[] enumC33420EprArr = {enumC33420Epr, enumC33420Epr2, enumC33420Epr3, enumC33420Epr4};
        A04 = enumC33420EprArr;
        A03 = AbstractC12190kN.A00(enumC33420EprArr);
    }

    public EnumC33420Epr(String str, int i, int i2, int i3, int i4) {
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }
}
