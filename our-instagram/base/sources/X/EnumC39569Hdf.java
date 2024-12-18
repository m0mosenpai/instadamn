package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hdf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39569Hdf {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC39569Hdf[] A02;
    public static final EnumC39569Hdf A03;
    public static final EnumC39569Hdf A04;
    public static final EnumC39569Hdf A05;
    public static final EnumC39569Hdf A06;
    public final int A00;

    public static EnumC39569Hdf valueOf(String str) {
        return (EnumC39569Hdf) Enum.valueOf(EnumC39569Hdf.class, str);
    }

    public static EnumC39569Hdf[] values() {
        return (EnumC39569Hdf[]) A02.clone();
    }

    static {
        EnumC39569Hdf enumC39569Hdf = new EnumC39569Hdf("PEOPLE", 0, 2131975155);
        A03 = enumC39569Hdf;
        EnumC39569Hdf enumC39569Hdf2 = new EnumC39569Hdf("PRODUCTS", 1, 2131975161);
        A04 = enumC39569Hdf2;
        EnumC39569Hdf enumC39569Hdf3 = new EnumC39569Hdf("SCHEDULED_LIVE", 2, 2131975163);
        A05 = enumC39569Hdf3;
        EnumC39569Hdf enumC39569Hdf4 = new EnumC39569Hdf("UPCOMING_EVENT", 3, 2131975165);
        A06 = enumC39569Hdf4;
        EnumC39569Hdf[] enumC39569HdfArr = {enumC39569Hdf, enumC39569Hdf2, enumC39569Hdf3, enumC39569Hdf4};
        A02 = enumC39569HdfArr;
        A01 = AbstractC12190kN.A00(enumC39569HdfArr);
    }

    public EnumC39569Hdf(String str, int i, int i2) {
        this.A00 = i2;
    }
}
