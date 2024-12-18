package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.facedetection.amlfacetracker.AMLFaceTracker;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import com.facebook.smartcapture.facetracker.FaceTrackerProvider;
import com.facebook.smartcapture.logging.SmartCaptureLogger;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SZG {
    public long A00;
    public final Handler A01 = AbstractC167007dF.A0J();
    public final FaceTrackerModelsProvider A02;
    public final FaceTrackerProvider A03;
    public final SmartCaptureLogger A04;
    public final WeakReference A05;
    public final WeakReference A06;
    public volatile SWH A07;
    public volatile Map A08;
    public volatile boolean A09;

    public static final synchronized void A00(SZG szg) {
        synchronized (szg) {
            if (((Context) szg.A06.get()) != null && !szg.A09) {
                SWH swh = szg.A07;
                if (swh != null) {
                    AMLFaceTracker aMLFaceTracker = swh.A00;
                    AMLFaceTracker.NativePeer nativePeer = aMLFaceTracker.A00;
                    if (nativePeer != null) {
                        nativePeer.mHybridData.resetNative();
                    }
                    aMLFaceTracker.A00 = null;
                }
                szg.A07 = null;
                szg.A09 = false;
                Map map = szg.A08;
                if (map != null) {
                    try {
                        SmartCaptureLogger smartCaptureLogger = szg.A04;
                        smartCaptureLogger.qplMarkerStart(33888866);
                        smartCaptureLogger.qplMarkerAnnotate(33888866, "event", "init");
                        smartCaptureLogger.qplMarkerAnnotate(33888866, "tracker", "aml");
                        szg.A07 = new SWH(map);
                        smartCaptureLogger.qplMarkerEnd(33888866, true);
                    } catch (Exception e) {
                        szg.A04.qplMarkerEnd(33888866, false);
                        szg.A01(e);
                    }
                } else {
                    szg.A09 = true;
                    szg.A01.post(new TO8(szg, C05F.A01));
                    Y6Z.A00(new CallableC58499PwS(szg, 4));
                }
            }
        }
    }

    public final synchronized void A01(Exception exc) {
        this.A04.logError("Failed to fetch face tracker models", exc);
        this.A01.post(new TO8(this, C05F.A0C));
    }

    public SZG(FaceTrackerModelsProvider faceTrackerModelsProvider, FaceTrackerProvider faceTrackerProvider, SmartCaptureLogger smartCaptureLogger, WeakReference weakReference, WeakReference weakReference2) {
        this.A06 = weakReference;
        this.A05 = weakReference2;
        this.A03 = faceTrackerProvider;
        this.A02 = faceTrackerModelsProvider;
        this.A04 = smartCaptureLogger;
    }
}
