package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3YU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YU {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C3YU[] A03;
    public static final C3YU A04;
    public static final C3YU A05;
    public final String A00;

    static {
        C3YU c3yu = new C3YU("DEFAULT", 0, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A05 = c3yu;
        C3YU c3yu2 = new C3YU("ARCHIVED", 1, "only_me");
        A04 = c3yu2;
        C3YU[] c3yuArr = {c3yu, c3yu2};
        A03 = c3yuArr;
        A02 = AbstractC12190kN.A00(c3yuArr);
        C3YU[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (C3YU c3yu3 : values) {
            linkedHashMap.put(c3yu3.A00, c3yu3);
        }
        A01 = linkedHashMap;
    }

    public static C3YU valueOf(String str) {
        return (C3YU) Enum.valueOf(C3YU.class, str);
    }

    public static C3YU[] values() {
        return (C3YU[]) A03.clone();
    }

    public C3YU(String str, int i, String str2) {
        this.A00 = str2;
    }
}
