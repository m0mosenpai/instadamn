package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3l3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC81843l3 {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC81843l3[] A03;
    public static final EnumC81843l3 A04;
    public static final EnumC81843l3 A05;
    public static final EnumC81843l3 A06;
    public final String A00;

    static {
        EnumC81843l3 enumC81843l3 = new EnumC81843l3("MESSAGE_WARNING", 0, "message_warning");
        A05 = enumC81843l3;
        EnumC81843l3 enumC81843l32 = new EnumC81843l3("MESSAGE_SEND_FAILED", 1, "message_send_failed");
        A04 = enumC81843l32;
        EnumC81843l3 enumC81843l33 = new EnumC81843l3("UNKNOWN", 2, "unknown");
        A06 = enumC81843l33;
        EnumC81843l3[] enumC81843l3Arr = {enumC81843l3, enumC81843l32, enumC81843l33};
        A03 = enumC81843l3Arr;
        A02 = AbstractC12190kN.A00(enumC81843l3Arr);
        EnumC81843l3[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC81843l3 enumC81843l34 : values) {
            linkedHashMap.put(enumC81843l34.A00, enumC81843l34);
        }
        A01 = linkedHashMap;
    }

    public static EnumC81843l3 valueOf(String str) {
        return (EnumC81843l3) Enum.valueOf(EnumC81843l3.class, str);
    }

    public static EnumC81843l3[] values() {
        return (EnumC81843l3[]) A03.clone();
    }

    public EnumC81843l3(String str, int i, String str2) {
        this.A00 = str2;
    }
}
