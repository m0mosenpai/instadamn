package X;

import com.instagram.autoplay.models.AutoplayGlobalConfig;

/* renamed from: X.Tvc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65873Tvc {
    public final C65863TvQ A00;
    public final C3Q4 A01;

    public C65873Tvc(C65863TvQ c65863TvQ, C3Q4 c3q4) {
        C14360o3.A0B(c3q4, 2);
        this.A00 = c65863TvQ;
        this.A01 = c3q4;
    }

    public final int A00() {
        C65863TvQ c65863TvQ = this.A00;
        if (c65863TvQ.A01().globalConfig.respectNativeAutoplayLimitations && !this.A01.A00()) {
            return 0;
        }
        int ordinal = this.A01.A00.ordinal();
        if (ordinal != 2) {
            AutoplayGlobalConfig autoplayGlobalConfig = c65863TvQ.A01().globalConfig;
            if (ordinal != 1) {
                return autoplayGlobalConfig.androidMemoryGreenMaxConcurrentVideos;
            }
            return autoplayGlobalConfig.androidMemoryOrangeMaxConcurrentVideos;
        }
        return c65863TvQ.A01().globalConfig.androidMemoryRedMaxConcurrentVideos;
    }
}
