package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VDg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68143VDg {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC68143VDg[] A02;
    public static final EnumC68143VDg A03;
    public static final EnumC68143VDg A04;
    public static final EnumC68143VDg A05;
    public static final EnumC68143VDg A06;
    public final String A00;

    static {
        EnumC68143VDg enumC68143VDg = new EnumC68143VDg("TEXT_LIST", 0, "text_list");
        A03 = enumC68143VDg;
        EnumC68143VDg enumC68143VDg2 = new EnumC68143VDg("USER_GRID", 1, "user_grid");
        A05 = enumC68143VDg2;
        EnumC68143VDg enumC68143VDg3 = new EnumC68143VDg("USER_HSCROLL", 2, "user_hscroll");
        A06 = enumC68143VDg3;
        EnumC68143VDg enumC68143VDg4 = new EnumC68143VDg("UNKNOWN", 3, "unknown");
        A04 = enumC68143VDg4;
        EnumC68143VDg[] enumC68143VDgArr = {enumC68143VDg, enumC68143VDg2, enumC68143VDg3, enumC68143VDg4};
        A02 = enumC68143VDgArr;
        A01 = AbstractC12190kN.A00(enumC68143VDgArr);
    }

    public static EnumC68143VDg valueOf(String str) {
        return (EnumC68143VDg) Enum.valueOf(EnumC68143VDg.class, str);
    }

    public static EnumC68143VDg[] values() {
        return (EnumC68143VDg[]) A02.clone();
    }

    public EnumC68143VDg(String str, int i, String str2) {
        this.A00 = str2;
    }
}
