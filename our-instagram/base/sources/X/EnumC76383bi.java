package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3bi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC76383bi {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC76383bi[] A03;
    public static final EnumC76383bi A04;
    public static final EnumC76383bi A05;
    public static final EnumC76383bi A06;
    public static final EnumC76383bi A07;
    public static final EnumC76383bi A08;
    public static final EnumC76383bi A09;
    public static final EnumC76383bi A0A;
    public static final EnumC76383bi A0B;
    public static final EnumC76383bi A0C;
    public static final EnumC76383bi A0D;
    public static final EnumC76383bi A0E;
    public static final EnumC76383bi A0F;
    public static final EnumC76383bi A0G;
    public static final EnumC76383bi A0H;
    public final String A00;

    static {
        EnumC76383bi enumC76383bi = new EnumC76383bi("DEFAULT", 0, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A06 = enumC76383bi;
        EnumC76383bi enumC76383bi2 = new EnumC76383bi("CLOSE_FRIENDS", 1, "besties");
        A04 = enumC76383bi2;
        EnumC76383bi enumC76383bi3 = new EnumC76383bi("FAN_CLUB", 2, "fan_club");
        A07 = enumC76383bi3;
        EnumC76383bi enumC76383bi4 = new EnumC76383bi("ROLL_CALL_FOLLOWERS", 3, "followers_only_rollcall");
        A0F = enumC76383bi4;
        EnumC76383bi enumC76383bi5 = new EnumC76383bi("ROLL_CALL_MUTUALS", 4, "mutual_followers_rollcall");
        A0G = enumC76383bi5;
        EnumC76383bi enumC76383bi6 = new EnumC76383bi("CUSTOM", 5, "custom");
        A05 = enumC76383bi6;
        EnumC76383bi enumC76383bi7 = new EnumC76383bi("FOLLOWERS_ONLY", 6, "followers_only");
        A08 = enumC76383bi7;
        EnumC76383bi enumC76383bi8 = new EnumC76383bi("FRIEND_LIST", 7, "friend_list");
        A09 = enumC76383bi8;
        EnumC76383bi enumC76383bi9 = new EnumC76383bi("PUBLIC_CHAT", 8, "public_chat");
        A0D = enumC76383bi9;
        EnumC76383bi enumC76383bi10 = new EnumC76383bi("HALLPASS", 9, "hallpass");
        A0A = enumC76383bi10;
        EnumC76383bi enumC76383bi11 = new EnumC76383bi("SHARE_TO_DIRECT_PREVIEW", 10, "share_to_direct_preview");
        A0H = enumC76383bi11;
        EnumC76383bi enumC76383bi12 = new EnumC76383bi("OPAL", 11, "opal");
        A0C = enumC76383bi12;
        EnumC76383bi enumC76383bi13 = new EnumC76383bi("MUTUAL_FOLLOWERS", 12, "mutual_followers");
        A0B = enumC76383bi13;
        EnumC76383bi enumC76383bi14 = new EnumC76383bi("REPLY_CONTROL", 13, "reply_control");
        A0E = enumC76383bi14;
        EnumC76383bi[] enumC76383biArr = {enumC76383bi, enumC76383bi2, enumC76383bi3, enumC76383bi4, enumC76383bi5, enumC76383bi6, enumC76383bi7, enumC76383bi8, enumC76383bi9, enumC76383bi10, enumC76383bi11, enumC76383bi12, enumC76383bi13, enumC76383bi14};
        A03 = enumC76383biArr;
        A02 = AbstractC12190kN.A00(enumC76383biArr);
        EnumC76383bi[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC76383bi enumC76383bi15 : values) {
            linkedHashMap.put(enumC76383bi15.A00, enumC76383bi15);
        }
        A01 = linkedHashMap;
    }

    public static EnumC76383bi valueOf(String str) {
        return (EnumC76383bi) Enum.valueOf(EnumC76383bi.class, str);
    }

    public static EnumC76383bi[] values() {
        return (EnumC76383bi[]) A03.clone();
    }

    public EnumC76383bi(String str, int i, String str2) {
        this.A00 = str2;
    }
}
