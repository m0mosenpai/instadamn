package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5xz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC132215xz {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC132215xz[] A01;
    public static final EnumC132215xz A02;
    public static final EnumC132215xz A03;
    public static final EnumC132215xz A04;

    static {
        EnumC132215xz enumC132215xz = new EnumC132215xz("NOT_FEDERATED", 0);
        A03 = enumC132215xz;
        EnumC132215xz enumC132215xz2 = new EnumC132215xz("WILL_BE_FEDERATED", 1);
        A04 = enumC132215xz2;
        EnumC132215xz enumC132215xz3 = new EnumC132215xz("FEDERATED", 2);
        A02 = enumC132215xz3;
        EnumC132215xz[] enumC132215xzArr = {enumC132215xz, enumC132215xz2, enumC132215xz3};
        A01 = enumC132215xzArr;
        A00 = AbstractC12190kN.A00(enumC132215xzArr);
    }

    public static EnumC132215xz valueOf(String str) {
        return (EnumC132215xz) Enum.valueOf(EnumC132215xz.class, str);
    }

    public static EnumC132215xz[] values() {
        return (EnumC132215xz[]) A01.clone();
    }

    public EnumC132215xz(String str, int i) {
    }
}
