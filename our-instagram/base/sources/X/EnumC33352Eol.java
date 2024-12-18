package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eol, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33352Eol {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33352Eol[] A01;
    public static final EnumC33352Eol A02;
    public static final EnumC33352Eol A03;
    public static final EnumC33352Eol A04;
    public static final EnumC33352Eol A05;

    static {
        EnumC33352Eol enumC33352Eol = new EnumC33352Eol("Error", 0);
        A02 = enumC33352Eol;
        EnumC33352Eol enumC33352Eol2 = new EnumC33352Eol("Loading", 1);
        A04 = enumC33352Eol2;
        EnumC33352Eol enumC33352Eol3 = new EnumC33352Eol("Success", 2);
        A05 = enumC33352Eol3;
        EnumC33352Eol enumC33352Eol4 = new EnumC33352Eol("Idle", 3);
        A03 = enumC33352Eol4;
        EnumC33352Eol[] enumC33352EolArr = {enumC33352Eol, enumC33352Eol2, enumC33352Eol3, enumC33352Eol4};
        A01 = enumC33352EolArr;
        A00 = AbstractC12190kN.A00(enumC33352EolArr);
    }

    public static EnumC33352Eol valueOf(String str) {
        return (EnumC33352Eol) Enum.valueOf(EnumC33352Eol.class, str);
    }

    public static EnumC33352Eol[] values() {
        return (EnumC33352Eol[]) A01.clone();
    }

    public EnumC33352Eol(String str, int i) {
    }
}
