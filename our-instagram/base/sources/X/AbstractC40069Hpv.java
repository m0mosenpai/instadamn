package X;

import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Hpv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40069Hpv {
    public static Map A00(InterfaceC74403Vw interfaceC74403Vw) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC74403Vw.BGU() != null) {
            A1I.put("image", interfaceC74403Vw.BGU());
        }
        C38321qM CEv = interfaceC74403Vw.CEv();
        if (CEv != null) {
            A1I.put(MediaStreamTrack.VIDEO_TRACK_KIND, CEv.A1D());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
