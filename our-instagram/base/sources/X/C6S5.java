package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6S5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6S5 {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C6S5[] A03;
    public static final C6S5 A04;
    public static final C6S5 A05;
    public static final C6S5 A06;
    public static final C6S5 A07;
    public static final C6S5 A08;
    public final String A00;

    static {
        C6S5 c6s5 = new C6S5("DISABLED", 0, "disabled");
        A05 = c6s5;
        C6S5 c6s52 = new C6S5("DEFAULT", 1, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A04 = c6s52;
        C6S5 c6s53 = new C6S5("INVERTED", 2, "inverted");
        A06 = c6s53;
        C6S5 c6s54 = new C6S5("OUTLINED", 3, "default_outline");
        A08 = c6s54;
        C6S5 c6s55 = new C6S5("INVERTED_OUTLINED", 4, "inverted_outline");
        A07 = c6s55;
        C6S5[] c6s5Arr = {c6s5, c6s52, c6s53, c6s54, c6s55};
        A03 = c6s5Arr;
        A02 = AbstractC12190kN.A00(c6s5Arr);
        C6S5[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (C6S5 c6s56 : values) {
            linkedHashMap.put(c6s56.A00, c6s56);
        }
        A01 = linkedHashMap;
    }

    public static C6S5 valueOf(String str) {
        return (C6S5) Enum.valueOf(C6S5.class, str);
    }

    public static C6S5[] values() {
        return (C6S5[]) A03.clone();
    }

    public C6S5(String str, int i, String str2) {
        this.A00 = str2;
    }
}
