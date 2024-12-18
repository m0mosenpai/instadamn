package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3aX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC75663aX {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC75663aX[] A03;
    public static final EnumC75663aX A04;
    public static final EnumC75663aX A05;
    public static final EnumC75663aX A06;
    public final String A00;

    static {
        EnumC75663aX enumC75663aX = new EnumC75663aX("DEFAULT", 0, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A04 = enumC75663aX;
        EnumC75663aX enumC75663aX2 = new EnumC75663aX("FAN_CLUB", 1, "fan_club");
        A05 = enumC75663aX2;
        EnumC75663aX enumC75663aX3 = new EnumC75663aX("PREVIEW", 2, "preview");
        A06 = enumC75663aX3;
        EnumC75663aX[] enumC75663aXArr = {enumC75663aX, enumC75663aX2, enumC75663aX3};
        A03 = enumC75663aXArr;
        A02 = AbstractC12190kN.A00(enumC75663aXArr);
        EnumC75663aX[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC75663aX enumC75663aX4 : values) {
            linkedHashMap.put(enumC75663aX4.A00, enumC75663aX4);
        }
        A01 = linkedHashMap;
    }

    public static EnumC75663aX valueOf(String str) {
        return (EnumC75663aX) Enum.valueOf(EnumC75663aX.class, str);
    }

    public static EnumC75663aX[] values() {
        return (EnumC75663aX[]) A03.clone();
    }

    public EnumC75663aX(String str, int i, String str2) {
        this.A00 = str2;
    }
}
