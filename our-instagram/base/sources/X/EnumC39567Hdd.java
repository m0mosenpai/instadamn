package X;

import com.instagram.realtimeclient.RealtimeConstants;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hdd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39567Hdd {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC39567Hdd[] A02;
    public static final EnumC39567Hdd A03;
    public static final EnumC39567Hdd A04;
    public static final EnumC39567Hdd A05;
    public static final EnumC39567Hdd A06;
    public final String A00;

    static {
        EnumC39567Hdd enumC39567Hdd = new EnumC39567Hdd("CONNECTED", 0, RealtimeConstants.MQTT_CONNECTED);
        A03 = enumC39567Hdd;
        EnumC39567Hdd enumC39567Hdd2 = new EnumC39567Hdd("UNCONNECTED", 1, "unconnected");
        A05 = enumC39567Hdd2;
        EnumC39567Hdd enumC39567Hdd3 = new EnumC39567Hdd("MARQUEE", 2, "marquee");
        A04 = enumC39567Hdd3;
        EnumC39567Hdd enumC39567Hdd4 = new EnumC39567Hdd("UNKNOWN", 3, "unknown");
        A06 = enumC39567Hdd4;
        EnumC39567Hdd[] enumC39567HddArr = {enumC39567Hdd, enumC39567Hdd2, enumC39567Hdd3, enumC39567Hdd4};
        A02 = enumC39567HddArr;
        A01 = AbstractC12190kN.A00(enumC39567HddArr);
    }

    public static EnumC39567Hdd valueOf(String str) {
        return (EnumC39567Hdd) Enum.valueOf(EnumC39567Hdd.class, str);
    }

    public static EnumC39567Hdd[] values() {
        return (EnumC39567Hdd[]) A02.clone();
    }

    public EnumC39567Hdd(String str, int i, String str2) {
        this.A00 = str2;
    }
}
