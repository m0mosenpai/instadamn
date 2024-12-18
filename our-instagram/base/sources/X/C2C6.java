package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2C6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2C6 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C2C6[] A01;
    public static final C2C6 A02;
    public static final C2C6 A03;
    public static final C2C6 A04;
    public static final C2C6 A05;
    public static final C2C6 A06;
    public static final C2C6 A07;

    static {
        C2C6 c2c6 = new C2C6("VIDEO_FRAME_PROCESSOR_RELEASE_FRAME_UPPER_THRESHOLD", 0);
        A06 = c2c6;
        C2C6 c2c62 = new C2C6("VIDEO_FRAME_PROCESSOR_RELEASE_FRAME_LOWER_THRESHOLD", 1);
        A05 = c2c62;
        C2C6 c2c63 = new C2C6("EXOPLAYER_THREAD_POLLING_INTERVAL_MS", 2);
        A02 = c2c63;
        C2C6 c2c64 = new C2C6("VIDEO_WIDTH_TO_ENABLE_SR_EFFECTS", 3);
        A07 = c2c64;
        C2C6 c2c65 = new C2C6("THREAD_SLEEP_TIME_MS_FOR_DECODER_INIT_FAILURE", 4);
        A04 = c2c65;
        C2C6 c2c66 = new C2C6("MAXIMUM_BUFFER_AHEAD_PERIODS", 5);
        A03 = c2c66;
        C2C6[] c2c6Arr = {c2c6, c2c62, c2c63, c2c64, c2c65, c2c66};
        A01 = c2c6Arr;
        A00 = AbstractC12190kN.A00(c2c6Arr);
    }

    public static C2C6 valueOf(String str) {
        return (C2C6) Enum.valueOf(C2C6.class, str);
    }

    public static C2C6[] values() {
        return (C2C6[]) A01.clone();
    }

    public C2C6(String str, int i) {
    }
}
