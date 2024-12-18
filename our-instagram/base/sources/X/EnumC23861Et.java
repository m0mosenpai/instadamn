package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1Et, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC23861Et {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC23861Et[] A04;
    public static final EnumC23861Et A05;
    public static final EnumC23861Et A06;
    public final int A00;
    public final String A01;
    public final boolean A02;

    static {
        EnumC23861Et enumC23861Et = new EnumC23861Et("KATANA", "com.facebook.katana", 0, 0, true);
        A05 = enumC23861Et;
        EnumC23861Et enumC23861Et2 = new EnumC23861Et("WAKIZASHI", "com.facebook.wakizashi", 1, 0, true);
        A06 = enumC23861Et2;
        EnumC23861Et[] enumC23861EtArr = {enumC23861Et, enumC23861Et2, new EnumC23861Et("LITE", "com.facebook.lite", 2, 58962169, false)};
        A04 = enumC23861EtArr;
        A03 = AbstractC12190kN.A00(enumC23861EtArr);
    }

    public static EnumC23861Et valueOf(String str) {
        return (EnumC23861Et) Enum.valueOf(EnumC23861Et.class, str);
    }

    public static EnumC23861Et[] values() {
        return (EnumC23861Et[]) A04.clone();
    }

    public EnumC23861Et(String str, String str2, int i, int i2, boolean z) {
        this.A01 = str2;
        this.A02 = z;
        this.A00 = i2;
    }
}
