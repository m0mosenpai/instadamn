package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C6n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC27384C6n {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC27384C6n[] A01;
    public static final EnumC27384C6n A02;
    public static final EnumC27384C6n A03;
    public static final EnumC27384C6n A04;
    public static final EnumC27384C6n A05;

    static {
        EnumC27384C6n enumC27384C6n = new EnumC27384C6n("ELIGIBLE", 0);
        A03 = enumC27384C6n;
        EnumC27384C6n enumC27384C6n2 = new EnumC27384C6n("INELIGIBLE", 1);
        A04 = enumC27384C6n2;
        EnumC27384C6n enumC27384C6n3 = new EnumC27384C6n("ALREADY_JOINED", 2);
        A02 = enumC27384C6n3;
        EnumC27384C6n enumC27384C6n4 = new EnumC27384C6n("UNKNOWN", 3);
        A05 = enumC27384C6n4;
        EnumC27384C6n[] enumC27384C6nArr = {enumC27384C6n, enumC27384C6n2, enumC27384C6n3, enumC27384C6n4};
        A01 = enumC27384C6nArr;
        A00 = AbstractC12190kN.A00(enumC27384C6nArr);
    }

    public static EnumC27384C6n valueOf(String str) {
        return (EnumC27384C6n) Enum.valueOf(EnumC27384C6n.class, str);
    }

    public static EnumC27384C6n[] values() {
        return (EnumC27384C6n[]) A01.clone();
    }

    public EnumC27384C6n(String str, int i) {
    }
}
