package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VE3 {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VE3[] A03;
    public static final VE3 A04;
    public static final VE3 A05;
    public static final VE3 A06;
    public static final VE3 A07;
    public static final VE3 A08;
    public static final VE3 A09;
    public static final VE3 A0A;
    public final String A00;

    public static VE3 valueOf(String str) {
        return (VE3) Enum.valueOf(VE3.class, str);
    }

    public static VE3[] values() {
        return (VE3[]) A03.clone();
    }

    static {
        VE3 ve3 = new VE3("LEGACY_CHAT_STICKER", 0, "");
        A08 = ve3;
        VE3 ve32 = new VE3("DEFAULT", 1, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A06 = ve32;
        VE3 ve33 = new VE3("SUBSCRIBER", 2, "subscriber");
        A09 = ve33;
        VE3 ve34 = new VE3("DISCOVERABLE", 3, "discoverable");
        A07 = ve34;
        VE3 ve35 = new VE3("BROADCAST", 4, "broadcast");
        A05 = ve35;
        VE3 ve36 = new VE3("AI_AGENT", 5, "ai_agent");
        A04 = ve36;
        VE3 ve37 = new VE3("UNKNOWN", 6, "unknown");
        A0A = ve37;
        VE3[] ve3Arr = {ve3, ve32, ve33, ve34, ve35, ve36, ve37};
        A03 = ve3Arr;
        A02 = AbstractC12190kN.A00(ve3Arr);
        VE3[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (VE3 ve38 : values) {
            linkedHashMap.put(ve38.A00, ve38);
        }
        A01 = linkedHashMap;
    }

    public VE3(String str, int i, String str2) {
        this.A00 = str2;
    }
}
