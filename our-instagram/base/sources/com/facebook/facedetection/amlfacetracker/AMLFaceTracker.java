package com.facebook.facedetection.amlfacetracker;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.C09170dP;
import X.C61768RtO;
import android.graphics.Bitmap;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class AMLFaceTracker {
    public NativePeer A00;

    /* loaded from: classes10.dex */
    public final class NativePeer {
        public static final C61768RtO Companion = new Object();
        public static volatile boolean jniLoaded;
        public final HybridData mHybridData;

        public final native void configure(AMLTrackerConfiguration aMLTrackerConfiguration);

        public final native AMLDetectedFace[] getLandmarksFromBitmap(Bitmap bitmap, int i, boolean z);

        public final native HybridData initHybrid();

        public final native void loadModels(String[] strArr, String[] strArr2);

        public final native AMLDetectedFace[] track(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

        public final native AMLDetectedFace[] trackBitmap(Bitmap bitmap, int i, boolean z);

        /* JADX WARN: Type inference failed for: r0v0, types: [X.RtO, java.lang.Object] */
        static {
            try {
                C09170dP.A0C("fb_amlfacetracker_jni");
                jniLoaded = true;
            } catch (Throwable unused) {
                jniLoaded = false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NativePeer(AMLTrackerConfiguration aMLTrackerConfiguration, Map map) {
            if (jniLoaded) {
                this.mHybridData = initHybrid();
                configure(aMLTrackerConfiguration);
                String[] strArr = new String[map.size()];
                String[] strArr2 = new String[map.size()];
                int i = 0;
                Iterator A15 = AbstractC166997dE.A15(map);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    Object key = A1K.getKey();
                    Object value = A1K.getValue();
                    strArr[i] = key;
                    strArr2[i] = value;
                    i++;
                }
                loadModels(strArr, strArr2);
                return;
            }
            throw AbstractC166987dD.A14("JNI init fail");
        }
    }
}
