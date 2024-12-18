package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hdk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39574Hdk {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39574Hdk[] A03;
    public static final EnumC39574Hdk A04;
    public static final EnumC39574Hdk A05;
    public static final EnumC39574Hdk A06;
    public static final EnumC39574Hdk A07;
    public final String A00;

    static {
        EnumC39574Hdk enumC39574Hdk = new EnumC39574Hdk("PRODUCT", 0, "product");
        A05 = enumC39574Hdk;
        EnumC39574Hdk enumC39574Hdk2 = new EnumC39574Hdk("COLLECTION", 1, "collection");
        A04 = enumC39574Hdk2;
        EnumC39574Hdk enumC39574Hdk3 = new EnumC39574Hdk("SELLER", 2, "seller");
        A06 = enumC39574Hdk3;
        EnumC39574Hdk enumC39574Hdk4 = new EnumC39574Hdk("UNKNOWN", 3, "unknown");
        A07 = enumC39574Hdk4;
        EnumC39574Hdk[] enumC39574HdkArr = {enumC39574Hdk, enumC39574Hdk2, enumC39574Hdk3, enumC39574Hdk4};
        A03 = enumC39574HdkArr;
        A02 = AbstractC12190kN.A00(enumC39574HdkArr);
        EnumC39574Hdk[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39574Hdk enumC39574Hdk5 : values) {
            A18.put(enumC39574Hdk5.A00, enumC39574Hdk5);
        }
        A01 = A18;
    }

    public static EnumC39574Hdk valueOf(String str) {
        return (EnumC39574Hdk) Enum.valueOf(EnumC39574Hdk.class, str);
    }

    public static EnumC39574Hdk[] values() {
        return (EnumC39574Hdk[]) A03.clone();
    }

    public EnumC39574Hdk(String str, int i, String str2) {
        this.A00 = str2;
    }
}
