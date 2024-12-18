package X;

import android.os.SystemClock;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.bridge.ReactMarker;

/* loaded from: classes10.dex */
public final class STV {
    public static volatile boolean A00;

    public static synchronized void A00() {
        synchronized (STV.class) {
            if (!A00) {
                SystemClock.uptimeMillis();
                C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ReactBridge.staticInit::load:reactnativejni", 458066061);
                ReactMarker.logMarker(RhX.A16);
                C09170dP.A0C("reactnativejni");
                ReactMarker.logMarker(RhX.A15);
                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -990212833);
                SystemClock.uptimeMillis();
                A00 = true;
            }
        }
    }
}
