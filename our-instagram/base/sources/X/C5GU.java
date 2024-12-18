package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5GU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5GU {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C5GU[] A03;
    public static final C5GU A04;
    public static final C5GU A05;
    public static final C5GU A06;
    public static final C5GU A07;
    public static final C5GU A08;
    public static final C5GU A09;
    public static final C5GU A0A;
    public static final C5GU A0B;
    public final String A00;

    static {
        C5GU c5gu = new C5GU("AT_SHOP", 0, "at_shop");
        A04 = c5gu;
        C5GU c5gu2 = new C5GU("DROP", 1, "drop");
        A06 = c5gu2;
        C5GU c5gu3 = new C5GU("DROP_V2", 2, "drop_v2");
        A07 = c5gu3;
        C5GU c5gu4 = new C5GU("SALE", 3, "sale");
        A08 = c5gu4;
        C5GU c5gu5 = new C5GU("SELLER_CURATED", 4, "seller_curated");
        A09 = c5gu5;
        C5GU c5gu6 = new C5GU("SELLER_CURATED_V2", 5, "seller_curated_v2");
        A0A = c5gu6;
        C5GU c5gu7 = new C5GU("DISCOUNT", 6, "discount");
        A05 = c5gu7;
        C5GU c5gu8 = new C5GU("UNKNOWN", 7, "unknown");
        A0B = c5gu8;
        C5GU[] c5guArr = {c5gu, c5gu2, c5gu3, c5gu4, c5gu5, c5gu6, c5gu7, c5gu8};
        A03 = c5guArr;
        A02 = AbstractC12190kN.A00(c5guArr);
        C5GU[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (C5GU c5gu9 : values) {
            linkedHashMap.put(c5gu9.A00, c5gu9);
        }
        A01 = linkedHashMap;
    }

    public static C5GU valueOf(String str) {
        return (C5GU) Enum.valueOf(C5GU.class, str);
    }

    public static C5GU[] values() {
        return (C5GU[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public C5GU(String str, int i, String str2) {
        this.A00 = str2;
    }
}
