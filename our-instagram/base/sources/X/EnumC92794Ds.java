package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4Ds, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC92794Ds {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC92794Ds[] A03;
    public static final EnumC92794Ds A04;
    public static final EnumC92794Ds A05;
    public static final EnumC92794Ds A06;
    public static final EnumC92794Ds A07;
    public final String A00;

    static {
        EnumC92794Ds enumC92794Ds = new EnumC92794Ds("DJANGO", 0, "ig_django");
        A05 = enumC92794Ds;
        EnumC92794Ds enumC92794Ds2 = new EnumC92794Ds("MI", 1, "ig_messenger_infra");
        A07 = enumC92794Ds2;
        EnumC92794Ds enumC92794Ds3 = new EnumC92794Ds("ACT", 2, "ig_advanced_crypto_transport");
        A04 = enumC92794Ds3;
        EnumC92794Ds enumC92794Ds4 = new EnumC92794Ds("DJANGO_ACT_MIXED", 3, "ig_django_msys_mixed");
        A06 = enumC92794Ds4;
        EnumC92794Ds[] enumC92794DsArr = {enumC92794Ds, enumC92794Ds2, enumC92794Ds3, enumC92794Ds4};
        A03 = enumC92794DsArr;
        A02 = AbstractC12190kN.A00(enumC92794DsArr);
        EnumC92794Ds[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC92794Ds enumC92794Ds5 : values) {
            linkedHashMap.put(enumC92794Ds5.A00, enumC92794Ds5);
        }
        A01 = linkedHashMap;
    }

    public static EnumC92794Ds valueOf(String str) {
        return (EnumC92794Ds) Enum.valueOf(EnumC92794Ds.class, str);
    }

    public static EnumC92794Ds[] values() {
        return (EnumC92794Ds[]) A03.clone();
    }

    public final boolean A00() {
        if (this != A04 && this != A07) {
            return false;
        }
        return true;
    }

    public EnumC92794Ds(String str, int i, String str2) {
        this.A00 = str2;
    }
}
