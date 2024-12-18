package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HeT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39619HeT {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC39619HeT[] A02;
    public static final EnumC39619HeT A03;
    public static final EnumC39619HeT A04;
    public static final EnumC39619HeT A05;
    public static final EnumC39619HeT A06;
    public final String A00;

    static {
        EnumC39619HeT enumC39619HeT = new EnumC39619HeT("CHEVRON_BUTTON", 0, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A03 = enumC39619HeT;
        EnumC39619HeT enumC39619HeT2 = new EnumC39619HeT("REPORT_AD_BUTTON", 1, "2");
        A05 = enumC39619HeT2;
        EnumC39619HeT enumC39619HeT3 = new EnumC39619HeT("HIDE_AD_BUTTON", 2, "3");
        A04 = enumC39619HeT3;
        EnumC39619HeT enumC39619HeT4 = new EnumC39619HeT("REPORT_BUTTON", 3, "4");
        A06 = enumC39619HeT4;
        EnumC39619HeT[] enumC39619HeTArr = {enumC39619HeT, enumC39619HeT2, enumC39619HeT3, enumC39619HeT4};
        A02 = enumC39619HeTArr;
        A01 = AbstractC12190kN.A00(enumC39619HeTArr);
    }

    public static EnumC39619HeT valueOf(String str) {
        return (EnumC39619HeT) Enum.valueOf(EnumC39619HeT.class, str);
    }

    public static EnumC39619HeT[] values() {
        return (EnumC39619HeT[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC39619HeT(String str, int i, String str2) {
        this.A00 = str2;
    }
}
