package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.43v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC910343v {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC910343v[] A02;
    public static final EnumC910343v A03;
    public static final EnumC910343v A04;
    public static final EnumC910343v A05;
    public final int A00;

    static {
        EnumC910343v enumC910343v = new EnumC910343v("DEFAULT", 0, 0);
        A03 = enumC910343v;
        EnumC910343v enumC910343v2 = new EnumC910343v("ROUNDED", 1, 1);
        A04 = enumC910343v2;
        EnumC910343v enumC910343v3 = new EnumC910343v("TEMPLATE_ASSET", 2, 3);
        A05 = enumC910343v3;
        EnumC910343v[] enumC910343vArr = {enumC910343v, enumC910343v2, enumC910343v3};
        A02 = enumC910343vArr;
        A01 = AbstractC12190kN.A00(enumC910343vArr);
    }

    public static EnumC910343v valueOf(String str) {
        return (EnumC910343v) Enum.valueOf(EnumC910343v.class, str);
    }

    public static EnumC910343v[] values() {
        return (EnumC910343v[]) A02.clone();
    }

    public EnumC910343v(String str, int i, int i2) {
        this.A00 = i2;
    }
}
