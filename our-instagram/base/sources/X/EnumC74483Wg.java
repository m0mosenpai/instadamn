package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3Wg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC74483Wg {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC74483Wg[] A01;
    public static final EnumC74483Wg A02;
    public static final EnumC74483Wg A03;
    public static final EnumC74483Wg A04;
    public static final EnumC74483Wg A05;

    static {
        EnumC74483Wg enumC74483Wg = new EnumC74483Wg("LOADING", 0);
        A04 = enumC74483Wg;
        EnumC74483Wg enumC74483Wg2 = new EnumC74483Wg("NEEDS_RETRY", 1);
        A05 = enumC74483Wg2;
        EnumC74483Wg enumC74483Wg3 = new EnumC74483Wg("LOADED", 2);
        A03 = enumC74483Wg3;
        EnumC74483Wg enumC74483Wg4 = new EnumC74483Wg("ABORTING", 3);
        A02 = enumC74483Wg4;
        EnumC74483Wg[] enumC74483WgArr = {enumC74483Wg, enumC74483Wg2, enumC74483Wg3, enumC74483Wg4};
        A01 = enumC74483WgArr;
        A00 = AbstractC12190kN.A00(enumC74483WgArr);
    }

    public static EnumC74483Wg valueOf(String str) {
        return (EnumC74483Wg) Enum.valueOf(EnumC74483Wg.class, str);
    }

    public static EnumC74483Wg[] values() {
        return (EnumC74483Wg[]) A01.clone();
    }

    public EnumC74483Wg(String str, int i) {
    }
}
