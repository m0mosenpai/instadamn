package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nge, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53241Nge {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53241Nge[] A02;
    public static final EnumC53241Nge A03;
    public static final EnumC53241Nge A04;
    public static final EnumC53241Nge A05;
    public static final EnumC53241Nge A06;
    public static final EnumC53241Nge A07;
    public static final EnumC53241Nge A08;
    public static final EnumC53241Nge A09;
    public static final EnumC53241Nge A0A;
    public static final EnumC53241Nge A0B;
    public final String A00;

    static {
        EnumC53241Nge enumC53241Nge = new EnumC53241Nge("DEVICE_IDLE_REQUIRED", 0, "DeviceIdleRequired");
        A03 = enumC53241Nge;
        EnumC53241Nge enumC53241Nge2 = new EnumC53241Nge("EXTERNAL_POWER_REQUIRED", 1, "ExternalPowerRequired");
        A04 = enumC53241Nge2;
        EnumC53241Nge enumC53241Nge3 = new EnumC53241Nge("WIFI_REQUIRED", 2, "WiFiConnectivityRequired");
        A0B = enumC53241Nge3;
        EnumC53241Nge enumC53241Nge4 = new EnumC53241Nge("MAX_EXECUTION_TIME_SEC", 3, "MaximumExecutionTime");
        A06 = enumC53241Nge4;
        EnumC53241Nge enumC53241Nge5 = new EnumC53241Nge("MAX_EXECUTION_TIME_PER_DAY_SEC", 4, "MaximumExecutionTimePerDay");
        A05 = enumC53241Nge5;
        EnumC53241Nge enumC53241Nge6 = new EnumC53241Nge("MAX_NETWORK_CONSUMPTION_PER_DAY_BYTES", 5, "MaximumNetworkConsumptionPerDay");
        A07 = enumC53241Nge6;
        EnumC53241Nge enumC53241Nge7 = new EnumC53241Nge("MIN_BATTERY_LEVEL", 6, "MinimumBatteryLevel");
        A09 = enumC53241Nge7;
        EnumC53241Nge enumC53241Nge8 = new EnumC53241Nge("MIN_AVAILABLE_MEMORY_BYTES", 7, "MinimumAvailableMemory");
        A08 = enumC53241Nge8;
        EnumC53241Nge enumC53241Nge9 = new EnumC53241Nge("MIN_EVICTABLE_MEMORY_BYTES", 8, "MinimumEvictableMemory");
        A0A = enumC53241Nge9;
        EnumC53241Nge[] enumC53241NgeArr = {enumC53241Nge, enumC53241Nge2, enumC53241Nge3, enumC53241Nge4, enumC53241Nge5, enumC53241Nge6, enumC53241Nge7, enumC53241Nge8, enumC53241Nge9, new EnumC53241Nge("MIN_FREE_DISK_SPACE_BYTES", 9, "MinimumFreeDiskSpace")};
        A02 = enumC53241NgeArr;
        A01 = AbstractC12190kN.A00(enumC53241NgeArr);
    }

    public static EnumC53241Nge valueOf(String str) {
        return (EnumC53241Nge) Enum.valueOf(EnumC53241Nge.class, str);
    }

    public static EnumC53241Nge[] values() {
        return (EnumC53241Nge[]) A02.clone();
    }

    public EnumC53241Nge(String str, int i, String str2) {
        this.A00 = str2;
    }
}
