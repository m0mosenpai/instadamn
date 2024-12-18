package X;

import android.media.AudioManager;
import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: X.7s6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175917s6 {
    public long A00;
    public long A01;
    public boolean A04;
    public Integer A03 = null;
    public Integer A02 = null;
    public final C175927s7 A05 = new C175927s7();

    public static HashMap A00(AudioManager audioManager, C175917s6 c175917s6, InterfaceC25222BDw interfaceC25222BDw) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap(6);
        if (interfaceC25222BDw != null) {
            hashMap.put("AP_Hash", String.valueOf(interfaceC25222BDw.hashCode()));
        }
        Integer num = c175917s6.A03;
        if (num != null) {
            hashMap.put("AP_AudioMixModeRec", String.format(null, "%d_%d_ms", num, Long.valueOf(elapsedRealtime - c175917s6.A01)));
        }
        Integer num2 = c175917s6.A02;
        if (num2 != null) {
            hashMap.put("AP_AudioDeviceChanged", String.format(null, "%d_%d_%d_ms", Integer.valueOf(c175917s6.A04 ? 1 : 0), num2, Long.valueOf(elapsedRealtime - c175917s6.A00)));
        }
        String property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property != null) {
            hashMap.put("AP_OutputFramesPerBuffer", property);
        }
        String property2 = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property2 != null) {
            hashMap.put("AP_OutputSampleRate", property2);
        }
        hashMap.put("AP_AMMode", String.valueOf(audioManager.getMode()));
        if (interfaceC25222BDw != null) {
            String debugInfo = interfaceC25222BDw.getDebugInfo();
            if (!debugInfo.isEmpty()) {
                hashMap.put("AP_FBADebugInfo", debugInfo);
            }
            String snapshot = interfaceC25222BDw.snapshot();
            if (snapshot != null) {
                hashMap.put("AP_FBACalls", snapshot);
            }
        }
        String A00 = c175917s6.A05.A00();
        if (A00 != null) {
            hashMap.put("AP_CallsSinceSnapshot", A00);
        }
        return hashMap;
    }
}
