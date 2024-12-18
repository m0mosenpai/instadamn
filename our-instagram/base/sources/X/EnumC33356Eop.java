package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eop, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33356Eop {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33356Eop[] A01;
    public static final EnumC33356Eop A02;
    public static final EnumC33356Eop A03;
    public static final EnumC33356Eop A04;
    public static final EnumC33356Eop A05;
    public static final EnumC33356Eop A06;

    static {
        EnumC33356Eop enumC33356Eop = new EnumC33356Eop("SUCCESS", 0);
        A06 = enumC33356Eop;
        EnumC33356Eop enumC33356Eop2 = new EnumC33356Eop("INITIAL_LOAD", 1);
        A02 = enumC33356Eop2;
        EnumC33356Eop enumC33356Eop3 = new EnumC33356Eop("PAGINATION_LOAD", 2);
        A04 = enumC33356Eop3;
        EnumC33356Eop enumC33356Eop4 = new EnumC33356Eop("INITIAL_LOAD_FAILED", 3);
        A03 = enumC33356Eop4;
        EnumC33356Eop enumC33356Eop5 = new EnumC33356Eop("PAGINATION_LOAD_FAILED", 4);
        A05 = enumC33356Eop5;
        EnumC33356Eop[] enumC33356EopArr = {enumC33356Eop, enumC33356Eop2, enumC33356Eop3, enumC33356Eop4, enumC33356Eop5};
        A01 = enumC33356EopArr;
        A00 = AbstractC12190kN.A00(enumC33356EopArr);
    }

    public static EnumC33356Eop valueOf(String str) {
        return (EnumC33356Eop) Enum.valueOf(EnumC33356Eop.class, str);
    }

    public static EnumC33356Eop[] values() {
        return (EnumC33356Eop[]) A01.clone();
    }

    public EnumC33356Eop(String str, int i) {
    }
}
