package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.0yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC20090yg {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC20090yg[] A01;
    public static final EnumC20090yg A02;
    public static final EnumC20090yg A03;

    static {
        EnumC20090yg enumC20090yg = new EnumC20090yg("User", 0);
        A03 = enumC20090yg;
        EnumC20090yg enumC20090yg2 = new EnumC20090yg("Device", 1);
        A02 = enumC20090yg2;
        EnumC20090yg[] enumC20090ygArr = {enumC20090yg, enumC20090yg2};
        A01 = enumC20090ygArr;
        A00 = AbstractC12190kN.A00(enumC20090ygArr);
    }

    public static EnumC20090yg valueOf(String str) {
        return (EnumC20090yg) Enum.valueOf(EnumC20090yg.class, str);
    }

    public static EnumC20090yg[] values() {
        return (EnumC20090yg[]) A01.clone();
    }

    public EnumC20090yg(String str, int i) {
    }
}
