package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.RyO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62053RyO {
    public static String A00(int i) {
        if (i == 1) {
            return "POWER_METRICS_PROC_CPU_USER_TIME";
        }
        if (i == 2) {
            return "POWER_METRICS_PROC_CPU_SYSTEM_TIME";
        }
        if (i == 30) {
            return "POWER_METRICS_SESSION_POWER_DRAIN";
        }
        if (i == 46) {
            return "POWER_METRICS_MQTT_ATTRIBUTION_DATA";
        }
        if (i == 48) {
            return "POWER_METRICS_CPU_SPIN_TRACING";
        }
        if (i == 89) {
            return "POWER_METRICS_RANDOM_LOOM_TRACING";
        }
        if (i == 101) {
            return "POWER_METRICS_RADIO_MOBILE_HIGH_POWER_ACTIVE_S";
        }
        if (i == 2260) {
            return "POWER_METRICS_REPORT_METRICS";
        }
        if (i == 15245) {
            return "POWER_METRICS_STORE_METRICS";
        }
        if (i == 55) {
            return "POWER_METRICS_MQTT_FULL_POWER_TIME";
        }
        if (i == 56) {
            return "POWER_METRICS_MQTT_LOW_POWER_TIME";
        }
        if (i == 62) {
            return "POWER_METRICS_AVG_BRIGHTNESS";
        }
        if (i == 63) {
            return "POWER_METRICS_DISPLAY_ENERGY";
        }
        if (i == 73) {
            return "POWER_METRICS_MOBILE_RX_BYTES";
        }
        if (i == 74) {
            return "POWER_METRICS_MOBILE_TX_BYTES";
        }
        switch (i) {
            case 4:
                return "POWER_METRICS_SESSION_BATTERY_DRAIN";
            case 5:
                return "POWER_METRICS_MQTT_NUM_RADIO_WAKEUPS";
            case 6:
                return "POWER_METRICS_MQTT_TRAFFIC_COUNT";
            case 7:
                return "POWER_METRICS_MQTT_SENT_BYTES";
            case 8:
                return "POWER_METRICS_MQTT_RECEIVED_BYTES";
            default:
                switch (i) {
                    case 10:
                        return "POWER_METRICS_LIGER_LOW_POWER_TIME";
                    case 11:
                        return "POWER_METRICS_LIGER_FULL_POWER_TIME";
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        return "POWER_METRICS_LIGER_ATTRIBUTION_DATA";
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        return "POWER_METRICS_LIGER_UP_BYTES";
                    case 14:
                        return "POWER_METRICS_LIGER_DOWN_BYTES";
                    case Process.SIGTERM /* 15 */:
                        return "POWER_METRICS_LIGER_REQUEST_COUNT";
                    case 16:
                        return "POWER_METRICS_LIGER_WAKEUP_COUNT";
                    default:
                        switch (i) {
                            case 22:
                                return "POWER_METRICS_LOCATION_ATTRIBUTION_DATA";
                            case 23:
                                return "POWER_METRICS_LOCATION_COARSE_TIME_MS";
                            case 24:
                                return "POWER_METRICS_LOCATION_MEDIUM_TIME_MS";
                            case 25:
                                return "POWER_METRICS_LOCATION_FINE_TIME_MS";
                            default:
                                switch (i) {
                                    case 79:
                                        return "POWER_METRICS_WIFI_TX_BYTES";
                                    case 80:
                                        return "POWER_METRICS_WIFI_RX_BYTES";
                                    case 81:
                                        return "POWER_METRICS_SESSION_END_BATTERY_LEVEL";
                                    case 82:
                                        return "POWER_METRICS_SESSION_BATTERY_WAS_CHARGING";
                                    default:
                                        switch (i) {
                                            case 111:
                                                return "POWER_METRICS_BATTERY_DISCHARGE_TRACING";
                                            case 112:
                                                return "POWER_METRICS_CPU_SPIN_BLACKBOX_TRACING";
                                            case 113:
                                                return "POWER_METRICS_RANDOM_LOOM_TRACING_FG";
                                            case 114:
                                                return "POWER_METRICS_RANDOM_LOOM_TRACING_BG";
                                            default:
                                                return "UNDEFINED_QPL_EVENT";
                                        }
                                }
                        }
                }
        }
    }
}
