package X;

import java.util.HashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.VrX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69568VrX {
    public long A00;
    public final XC1 A01;
    public final Map A02;

    public C69568VrX(XC1 xc1, WDI wdi, Map map) {
        C14360o3.A0B(xc1, 3);
        HashMap hashMap = new HashMap();
        this.A02 = hashMap;
        hashMap.putAll(map);
        if (!hashMap.containsKey("media_type")) {
            hashMap.put("media_type", MediaStreamTrack.VIDEO_TRACK_KIND);
        }
        if (wdi != null) {
            HashMap hashMap2 = new HashMap();
            int i = wdi.A0C;
            if (i != 0) {
                hashMap2.put("target_width", String.valueOf(i));
            }
            int i2 = wdi.A0A;
            if (i2 != 0) {
                hashMap2.put("target_height", String.valueOf(i2));
            }
            if (wdi.A01() != 0) {
                hashMap2.put("target_bit_rate", String.valueOf(wdi.A01()));
            }
            hashMap2.put("target_rotation_angle", String.valueOf(wdi.A05));
            hashMap.putAll(hashMap2);
        }
        this.A01 = xc1;
    }

    public final void A00(Exception exc) {
        XC1 xc1 = this.A01;
        AbstractC68335VMv.A00(xc1, exc, "media_upload_process_failure", this.A02, xc1.now() - this.A00);
    }
}
