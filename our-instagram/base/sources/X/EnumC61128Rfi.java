package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rfi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61128Rfi {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61128Rfi[] A01;
    public static final EnumC61128Rfi A02;
    public static final EnumC61128Rfi A03;
    public static final EnumC61128Rfi A04;
    public static final EnumC61128Rfi A05;
    public static final EnumC61128Rfi A06;

    static {
        EnumC61128Rfi enumC61128Rfi = new EnumC61128Rfi("UNINITIALIZED", 0);
        A05 = enumC61128Rfi;
        EnumC61128Rfi enumC61128Rfi2 = new EnumC61128Rfi("VOLTRON_LOADED", 1);
        A06 = enumC61128Rfi2;
        EnumC61128Rfi enumC61128Rfi3 = new EnumC61128Rfi("PROVIDER_LOADED", 2);
        A03 = enumC61128Rfi3;
        EnumC61128Rfi enumC61128Rfi4 = new EnumC61128Rfi("SPARE_CHILD_PROCESS_CREATED", 3);
        A04 = enumC61128Rfi4;
        EnumC61128Rfi enumC61128Rfi5 = new EnumC61128Rfi("BROWSER_LOADED", 4);
        A02 = enumC61128Rfi5;
        EnumC61128Rfi[] enumC61128RfiArr = {enumC61128Rfi, enumC61128Rfi2, enumC61128Rfi3, enumC61128Rfi4, enumC61128Rfi5};
        A01 = enumC61128RfiArr;
        A00 = AbstractC12190kN.A00(enumC61128RfiArr);
    }

    public static EnumC61128Rfi valueOf(String str) {
        return (EnumC61128Rfi) Enum.valueOf(EnumC61128Rfi.class, str);
    }

    public static EnumC61128Rfi[] values() {
        return (EnumC61128Rfi[]) A01.clone();
    }

    public EnumC61128Rfi(String str, int i) {
    }
}
