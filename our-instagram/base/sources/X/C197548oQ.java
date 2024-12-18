package X;

import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import com.instagram.util.jpeg.JpegBridge;
import com.instagram.util.jpeg.NativeImage;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8oQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197548oQ {
    public Map A00 = new HashMap();

    public final synchronized NativeImage A00(Rect rect, UserSession userSession, C197348o5 c197348o5, String str) {
        NativeImage nativeImage;
        Map map = this.A00;
        C197558oR c197558oR = (C197558oR) map.get(str);
        if (c197558oR != null) {
            nativeImage = c197558oR.A00;
        } else {
            NativeImage A00 = C197568oS.A00(rect, c197348o5, str);
            if (A00 == null && C18U.A06(C06090Tz.A05, userSession, 36328864909115217L)) {
                int i = 0;
                do {
                    A00 = C197568oS.A00(rect, c197348o5, str);
                    if (A00 != null) {
                        break;
                    }
                    i++;
                } while (i < 3);
            }
            A00.getClass();
            C197558oR c197558oR2 = new C197558oR(A00, this);
            C197558oR c197558oR3 = (C197558oR) map.get(str);
            if (c197558oR3 != null) {
                JpegBridge.releaseNativeBuffer(c197558oR2.A00.bufferId);
                nativeImage = c197558oR3.A00;
            } else {
                map.put(str, c197558oR2);
                nativeImage = c197558oR2.A00;
            }
        }
        return nativeImage;
    }

    public final synchronized void A01(String str) {
        Map map = this.A00;
        C197558oR c197558oR = (C197558oR) map.get(str);
        if (c197558oR != null && c197558oR.A01.isEmpty()) {
            map.remove(str);
            JpegBridge.releaseNativeBuffer(c197558oR.A00.bufferId);
        }
    }
}
