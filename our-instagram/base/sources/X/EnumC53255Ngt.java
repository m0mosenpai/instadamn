package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ngt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53255Ngt {
    public static final Map A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC53255Ngt[] A04;
    public static final EnumC53255Ngt A05;
    public static final EnumC53255Ngt A06;
    public static final EnumC53255Ngt A07;
    public static final EnumC53255Ngt A08;
    public static final EnumC53255Ngt A09;
    public final long A00;
    public final String A01;

    static {
        EnumC53255Ngt enumC53255Ngt = new EnumC53255Ngt("UPSELL_DESIGN_VARIANT_0", 0, 0L, "9");
        A05 = enumC53255Ngt;
        EnumC53255Ngt enumC53255Ngt2 = new EnumC53255Ngt("UPSELL_DESIGN_VARIANT_1", 1, 1L, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A06 = enumC53255Ngt2;
        EnumC53255Ngt enumC53255Ngt3 = new EnumC53255Ngt("UPSELL_DESIGN_VARIANT_IGDS_FOLLOW_UP_2", 2, 17L, "17");
        A07 = enumC53255Ngt3;
        EnumC53255Ngt enumC53255Ngt4 = new EnumC53255Ngt("UPSELL_DESIGN_VARIANT_OPC_MONETIZATION", 3, 18L, "18");
        A09 = enumC53255Ngt4;
        EnumC53255Ngt enumC53255Ngt5 = new EnumC53255Ngt("UPSELL_DESIGN_VARIANT_OPC_BRAND_BUILDING", 4, 19L, "19");
        A08 = enumC53255Ngt5;
        EnumC53255Ngt[] enumC53255NgtArr = {enumC53255Ngt, enumC53255Ngt2, enumC53255Ngt3, enumC53255Ngt4, enumC53255Ngt5, new EnumC53255Ngt("UPSELL_DESIGN_VARIANT_OPC_CREATOR_SUCCESS", 5, 20L, "20")};
        A04 = enumC53255NgtArr;
        A03 = AbstractC12190kN.A00(enumC53255NgtArr);
        EnumC53255Ngt[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC53255Ngt enumC53255Ngt6 : values) {
            A18.put(Long.valueOf(enumC53255Ngt6.A00), enumC53255Ngt6);
        }
        A02 = A18;
    }

    public static EnumC53255Ngt valueOf(String str) {
        return (EnumC53255Ngt) Enum.valueOf(EnumC53255Ngt.class, str);
    }

    public static EnumC53255Ngt[] values() {
        return (EnumC53255Ngt[]) A04.clone();
    }

    public EnumC53255Ngt(String str, int i, long j, String str2) {
        this.A00 = j;
        this.A01 = str2;
    }
}
