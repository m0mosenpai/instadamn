package X;

import java.util.HashSet;

/* renamed from: X.0LP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LP {
    public final String A00;
    public final String A01;
    public static final java.util.Set A0H = new HashSet();
    public static final C0LP A02 = new C0LP("anr_report_file", "__", false);
    public static final C0LP A0C = new C0LP("minidump_file", "", false);
    public static final C0LP A03 = new C0LP("APP_PROCESS_FILE", "", true);
    public static final C0LP A05 = new C0LP("blackbox_trace_file", "_r_", true);
    public static final C0LP A04 = new C0LP("blackbox_fnrel_trace_file", "_r_", true);
    public static final C0LP A07 = new C0LP("bluetooth_secure_traffic_file", "", true);
    public static final C0LP A06 = new C0LP("bluetooth_insecure_traffic_file", "", true);
    public static final C0LP A08 = new C0LP("CORE_DUMP", "", true);
    public static final C0LP A09 = new C0LP("FAT_MINIDUMP", "", true);
    public static final C0LP A0A = new C0LP("fury_traces_file", "_r_", true);
    public static final C0LP A0B = new C0LP("logcat_file", "", true);
    public static final C0LP A0D = new C0LP("msys_crash_reporter_file", "", true);
    public static final C0LP A0E = new C0LP("properties_file", "", true);
    public static final C0LP A0F = new C0LP("report_source_file", "", true);
    public static final C0LP A0G = new C0LP("system_health_file", "", true);

    public final String toString() {
        return this.A00;
    }

    public C0LP(String str, String str2, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        if (!z) {
            A0H.add(str);
        }
    }
}
