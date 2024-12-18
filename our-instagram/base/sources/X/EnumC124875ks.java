package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5ks, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC124875ks {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC124875ks[] A01;
    public static final EnumC124875ks A02;
    public static final EnumC124875ks A03;
    public static final EnumC124875ks A04;
    public static final EnumC124875ks A05;

    static {
        EnumC124875ks enumC124875ks = new EnumC124875ks("DID_NOT_SYNC", 0);
        A02 = enumC124875ks;
        EnumC124875ks enumC124875ks2 = new EnumC124875ks("FAILURE", 1);
        A03 = enumC124875ks2;
        EnumC124875ks enumC124875ks3 = new EnumC124875ks("SUCCESS_DID_UPDATE", 2);
        A05 = enumC124875ks3;
        EnumC124875ks enumC124875ks4 = new EnumC124875ks("SUCCESS_DID_NOT_UPDATE", 3);
        A04 = enumC124875ks4;
        EnumC124875ks[] enumC124875ksArr = {enumC124875ks, enumC124875ks2, enumC124875ks3, enumC124875ks4};
        A01 = enumC124875ksArr;
        A00 = AbstractC12190kN.A00(enumC124875ksArr);
    }

    public static EnumC124875ks valueOf(String str) {
        return (EnumC124875ks) Enum.valueOf(EnumC124875ks.class, str);
    }

    public static EnumC124875ks[] values() {
        return (EnumC124875ks[]) A01.clone();
    }

    public EnumC124875ks(String str, int i) {
    }
}
