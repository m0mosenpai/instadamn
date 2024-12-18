package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VFz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68207VFz {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68207VFz[] A03;
    public static final EnumC68207VFz A04;
    public static final EnumC68207VFz A05;
    public static final EnumC68207VFz A06;
    public static final EnumC68207VFz A07;
    public static final EnumC68207VFz A08;
    public static final EnumC68207VFz A09;
    public static final EnumC68207VFz A0A;
    public static final EnumC68207VFz A0B;
    public static final EnumC68207VFz A0C;
    public static final EnumC68207VFz A0D;
    public static final EnumC68207VFz A0E;
    public static final EnumC68207VFz A0F;
    public static final EnumC68207VFz A0G;
    public static final EnumC68207VFz A0H;
    public final String A00;

    static {
        EnumC68207VFz enumC68207VFz = new EnumC68207VFz("NOT_MAPPED", 0, "-1");
        A0A = enumC68207VFz;
        EnumC68207VFz enumC68207VFz2 = new EnumC68207VFz("REPORT_CONTENT", 1, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A0E = enumC68207VFz2;
        EnumC68207VFz enumC68207VFz3 = new EnumC68207VFz("BLOCK_ACTOR", 2, "2");
        A04 = enumC68207VFz3;
        EnumC68207VFz enumC68207VFz4 = new EnumC68207VFz("IP_VIOLATION_EDUCATION", 3, "3");
        A06 = enumC68207VFz4;
        EnumC68207VFz enumC68207VFz5 = new EnumC68207VFz("UNFOLLOW", 4, "8");
        A0H = enumC68207VFz5;
        EnumC68207VFz enumC68207VFz6 = new EnumC68207VFz("LEARN_MORE_EDUCATION", 5, "10");
        A08 = enumC68207VFz6;
        EnumC68207VFz enumC68207VFz7 = new EnumC68207VFz("HOW_TO_BLOCK_USER_EDUCATION", 6, "11");
        A05 = enumC68207VFz7;
        EnumC68207VFz enumC68207VFz8 = new EnumC68207VFz("PLACE_HOLDER_CONTENT_ACTION", 7, "12");
        A0C = enumC68207VFz8;
        EnumC68207VFz enumC68207VFz9 = new EnumC68207VFz("PLACE_HOLDER_BULLY_CONTENT_ACTION", 8, "13");
        A0B = enumC68207VFz9;
        EnumC68207VFz enumC68207VFz10 = new EnumC68207VFz("PLACE_HOLDER_I_JUST_DONT_LIKE_CONTENT_ACTION", 9, "14");
        A0D = enumC68207VFz10;
        EnumC68207VFz enumC68207VFz11 = new EnumC68207VFz("SELF_INJURY_EDUCATION_ACTION", 10, "15");
        A0G = enumC68207VFz11;
        EnumC68207VFz enumC68207VFz12 = new EnumC68207VFz("RESTRICT_ACTOR", 11, "16");
        A0F = enumC68207VFz12;
        EnumC68207VFz enumC68207VFz13 = new EnumC68207VFz("LEARN_MORE_ADS", 12, "19");
        A07 = enumC68207VFz13;
        EnumC68207VFz enumC68207VFz14 = new EnumC68207VFz("NOTIFY_GUARDIAN", 13, "23");
        A09 = enumC68207VFz14;
        EnumC68207VFz[] enumC68207VFzArr = {enumC68207VFz, enumC68207VFz2, enumC68207VFz3, enumC68207VFz4, enumC68207VFz5, enumC68207VFz6, enumC68207VFz7, enumC68207VFz8, enumC68207VFz9, enumC68207VFz10, enumC68207VFz11, enumC68207VFz12, enumC68207VFz13, enumC68207VFz14, new EnumC68207VFz("GET_SUPPORT", 14, "30")};
        A03 = enumC68207VFzArr;
        A02 = AbstractC12190kN.A00(enumC68207VFzArr);
        EnumC68207VFz[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC68207VFz enumC68207VFz15 : values) {
            linkedHashMap.put(enumC68207VFz15.A00, enumC68207VFz15);
        }
        A01 = linkedHashMap;
    }

    public static EnumC68207VFz valueOf(String str) {
        return (EnumC68207VFz) Enum.valueOf(EnumC68207VFz.class, str);
    }

    public static EnumC68207VFz[] values() {
        return (EnumC68207VFz[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC68207VFz(String str, int i, String str2) {
        this.A00 = str2;
    }
}
