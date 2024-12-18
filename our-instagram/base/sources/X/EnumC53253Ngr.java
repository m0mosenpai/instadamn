package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ngr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53253Ngr {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53253Ngr[] A03;
    public static final EnumC53253Ngr A04;
    public static final EnumC53253Ngr A05;
    public static final EnumC53253Ngr A06;
    public final String A00;
    public final String A01;

    static {
        EnumC53253Ngr enumC53253Ngr = new EnumC53253Ngr("EVERYONE", "everyone", "everyone", 0);
        A04 = enumC53253Ngr;
        EnumC53253Ngr enumC53253Ngr2 = new EnumC53253Ngr("PEOPLE_YOU_FOLLOW", "people_you_follow", "people_you_follow", 1);
        A06 = enumC53253Ngr2;
        EnumC53253Ngr enumC53253Ngr3 = new EnumC53253Ngr("OFF", "off", "off", 2);
        A05 = enumC53253Ngr3;
        EnumC53253Ngr[] enumC53253NgrArr = {enumC53253Ngr, enumC53253Ngr2, enumC53253Ngr3};
        A03 = enumC53253NgrArr;
        A02 = AbstractC12190kN.A00(enumC53253NgrArr);
    }

    public static EnumC53253Ngr valueOf(String str) {
        return (EnumC53253Ngr) Enum.valueOf(EnumC53253Ngr.class, str);
    }

    public static EnumC53253Ngr[] values() {
        return (EnumC53253Ngr[]) A03.clone();
    }

    public EnumC53253Ngr(String str, String str2, String str3, int i) {
        this.A00 = str2;
        this.A01 = str3;
    }
}
