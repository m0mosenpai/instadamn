package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nhn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53311Nhn {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53311Nhn[] A02;
    public static final EnumC53311Nhn A03;
    public static final EnumC53311Nhn A04;
    public static final EnumC53311Nhn A05;
    public final String A00;

    static {
        EnumC53311Nhn enumC53311Nhn = new EnumC53311Nhn("MENU_SHEET", 0, "menu_sheet");
        A04 = enumC53311Nhn;
        EnumC53311Nhn enumC53311Nhn2 = new EnumC53311Nhn("VISIBILITY_SHEET", 1, "visibility_sheet");
        A05 = enumC53311Nhn2;
        EnumC53311Nhn enumC53311Nhn3 = new EnumC53311Nhn("DEV_OPTIONS_FEED", 2, "dev_options_feed");
        A03 = enumC53311Nhn3;
        EnumC53311Nhn[] enumC53311NhnArr = {enumC53311Nhn, enumC53311Nhn2, enumC53311Nhn3};
        A02 = enumC53311NhnArr;
        A01 = AbstractC12190kN.A00(enumC53311NhnArr);
    }

    public static EnumC53311Nhn valueOf(String str) {
        return (EnumC53311Nhn) Enum.valueOf(EnumC53311Nhn.class, str);
    }

    public static EnumC53311Nhn[] values() {
        return (EnumC53311Nhn[]) A02.clone();
    }

    public final String A00() {
        return this.A00;
    }

    public EnumC53311Nhn(String str, int i, String str2) {
        this.A00 = str2;
    }
}
