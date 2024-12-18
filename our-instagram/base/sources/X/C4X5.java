package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.4X5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4X5 {
    public final C4SS A00;
    public final HeroPlayerSetting A01;
    public final Map A02;

    public C4X5(C4SS c4ss, HeroPlayerSetting heroPlayerSetting) {
        HashMap hashMap = new HashMap();
        this.A02 = hashMap;
        this.A01 = heroPlayerSetting;
        this.A00 = c4ss;
        hashMap.put(C4X6.VOD, new C4X7(heroPlayerSetting.A0e, heroPlayerSetting.A0G, heroPlayerSetting.A05, heroPlayerSetting.A0I));
        hashMap.put(C4X6.LIVE_DEFAULT, new C4X7(1, CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS, CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS, 30000));
        hashMap.put(C4X6.LIVE_API_TIER, new C4X7(1, 6000, 10000, 60000));
        hashMap.put(C4X6.LIVE_PREMIUM_TIER, new C4X7(1, 6000, 10000, 60000));
    }
}
