package X;

import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;

/* renamed from: X.Rh8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC61208Rh8 {
    JSON(RealtimeLogsProvider.LOG_SUFFIX),
    ZIP(".zip"),
    GZIP(".gz");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    EnumC61208Rh8(String str) {
        this.A00 = str;
    }
}
