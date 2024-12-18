package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3dg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC77563dg {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC77563dg[] A02;
    public static final EnumC77563dg A03;
    public static final EnumC77563dg A04;
    public final String A00;

    static {
        EnumC77563dg enumC77563dg = new EnumC77563dg("FOLLOW_BUTTON", 0, "follow_button");
        A03 = enumC77563dg;
        EnumC77563dg enumC77563dg2 = new EnumC77563dg("FOLLOW_BUTTON_EXPANDED_AREA", 1, "follow_button_expanded_area");
        A04 = enumC77563dg2;
        EnumC77563dg[] enumC77563dgArr = {enumC77563dg, enumC77563dg2};
        A02 = enumC77563dgArr;
        A01 = AbstractC12190kN.A00(enumC77563dgArr);
    }

    public static EnumC77563dg valueOf(String str) {
        return (EnumC77563dg) Enum.valueOf(EnumC77563dg.class, str);
    }

    public static EnumC77563dg[] values() {
        return (EnumC77563dg[]) A02.clone();
    }

    public EnumC77563dg(String str, int i, String str2) {
        this.A00 = str2;
    }
}
