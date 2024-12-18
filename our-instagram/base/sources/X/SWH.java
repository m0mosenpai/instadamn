package X;

import com.facebook.facedetection.amlfacetracker.AMLFaceTracker;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SWH {
    public static final float A02;
    public static final float A03;
    public final AMLFaceTracker A00;
    public final SDX A01;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.facedetection.amlfacetracker.AMLTrackerConfiguration, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.facebook.facedetection.amlfacetracker.AMLFaceTracker] */
    public SWH(Map map) {
        AMLFaceTracker.NativePeer nativePeer;
        ?? obj = new Object();
        try {
            boolean z = AMLFaceTracker.NativePeer.jniLoaded;
            nativePeer = new AMLFaceTracker.NativePeer(new Object(), map);
        } catch (IllegalStateException unused) {
            nativePeer = null;
        }
        obj.A00 = nativePeer;
        this.A00 = obj;
        this.A01 = new SDX();
    }

    static {
        float degrees = (float) Math.toDegrees(3.141592653589793d);
        A02 = degrees;
        A03 = degrees / 2.0f;
    }
}
