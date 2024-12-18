package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VDy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68154VDy {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68154VDy[] A03;
    public static final EnumC68154VDy A04;
    public static final EnumC68154VDy A05;
    public static final EnumC68154VDy A06;
    public static final EnumC68154VDy A07;
    public static final EnumC68154VDy A08;
    public static final EnumC68154VDy A09;
    public final String A00;

    public static EnumC68154VDy valueOf(String str) {
        return (EnumC68154VDy) Enum.valueOf(EnumC68154VDy.class, str);
    }

    public static EnumC68154VDy[] values() {
        return (EnumC68154VDy[]) A03.clone();
    }

    static {
        EnumC68154VDy enumC68154VDy = new EnumC68154VDy("REQUESTED_CHAT", 0, "requested_chat");
        A08 = enumC68154VDy;
        EnumC68154VDy enumC68154VDy2 = new EnumC68154VDy("JOINED_CHAT", 1, "joined_chat");
        A07 = enumC68154VDy2;
        EnumC68154VDy enumC68154VDy3 = new EnumC68154VDy("CHAT_FULL", 2, "chat_full");
        A05 = enumC68154VDy3;
        EnumC68154VDy enumC68154VDy4 = new EnumC68154VDy("CHAT_ENDED", 3, "chat_ended");
        A04 = enumC68154VDy4;
        EnumC68154VDy enumC68154VDy5 = new EnumC68154VDy("DEFAULT", 4, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A06 = enumC68154VDy5;
        EnumC68154VDy enumC68154VDy6 = new EnumC68154VDy("UNKNOWN", 5, "unknown");
        A09 = enumC68154VDy6;
        EnumC68154VDy[] enumC68154VDyArr = {enumC68154VDy, enumC68154VDy2, enumC68154VDy3, enumC68154VDy4, enumC68154VDy5, enumC68154VDy6};
        A03 = enumC68154VDyArr;
        A02 = AbstractC12190kN.A00(enumC68154VDyArr);
        EnumC68154VDy[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC68154VDy enumC68154VDy7 : values) {
            linkedHashMap.put(enumC68154VDy7.A00, enumC68154VDy7);
        }
        A01 = linkedHashMap;
    }

    public EnumC68154VDy(String str, int i, String str2) {
        this.A00 = str2;
    }
}
