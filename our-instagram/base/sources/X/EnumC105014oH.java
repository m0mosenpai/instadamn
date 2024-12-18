package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4oH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC105014oH {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC105014oH[] A02;
    public static final EnumC105014oH A03;
    public static final EnumC105014oH A04;
    public static final EnumC105014oH A05;
    public final String A00;

    static {
        EnumC105014oH enumC105014oH = new EnumC105014oH("DATA", 0, "DATA");
        A03 = enumC105014oH;
        EnumC105014oH enumC105014oH2 = new EnumC105014oH("VOICE", 1, "VOICE");
        A05 = enumC105014oH2;
        EnumC105014oH enumC105014oH3 = new EnumC105014oH("SMS", 2, "SMS");
        A04 = enumC105014oH3;
        EnumC105014oH[] enumC105014oHArr = {enumC105014oH, enumC105014oH2, enumC105014oH3};
        A02 = enumC105014oHArr;
        A01 = AbstractC12190kN.A00(enumC105014oHArr);
    }

    public static EnumC105014oH valueOf(String str) {
        return (EnumC105014oH) Enum.valueOf(EnumC105014oH.class, str);
    }

    public static EnumC105014oH[] values() {
        return (EnumC105014oH[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC105014oH(String str, int i, String str2) {
        this.A00 = str2;
    }
}
