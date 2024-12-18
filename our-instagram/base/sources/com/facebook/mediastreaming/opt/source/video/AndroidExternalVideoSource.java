package com.facebook.mediastreaming.opt.source.video;

import X.AbstractC166997dE;
import X.AnonymousClass001;
import X.C09170dP;
import X.C14360o3;
import X.C68912VeC;
import X.InterfaceC57904Pm8;
import X.VJM;
import X.VMV;
import X.WWm;
import X.X7X;
import android.util.Pair;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.opt.common.StreamingHybridClassBase;
import com.facebook.mediastreaming.opt.common.SurfaceHolder;
import com.facebook.mediastreaming.opt.source.SurfaceTextureHolder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class AndroidExternalVideoSource extends StreamingHybridClassBase implements InterfaceC57904Pm8 {
    public static final VMV Companion = new Object();
    public static final String TAG;
    public X7X frameSchedulerFactory;
    public int height;
    public int outputFrameRate;
    public final Map outputSurfaces;
    public boolean started;
    public AndroidVideoInput videoInput;
    public int width;

    private final native void onFrameDrawn(int i, long j, int i2, int i3);

    @Override // X.InterfaceC57904Pm8
    public void onVideoInputFrameAvailable(int i, long j) {
        if (this.started) {
            onFrameDrawn(i, j, this.width, this.height);
        }
    }

    public final void setVideoInput(AndroidVideoInput androidVideoInput) {
        C14360o3.A0B(androidVideoInput, 0);
        this.videoInput = androidVideoInput;
        androidVideoInput.setErrorListener(this);
        this.frameSchedulerFactory = androidVideoInput.getFrameSchedulerFactory();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.VMV, java.lang.Object] */
    static {
        C09170dP.A0C("mediastreaming");
        TAG = AnonymousClass001.A0R("mss:", "AndroidExternalVideoSource");
    }

    private final void ensureSurfaceOutput() {
        boolean z = this.started;
        HashMap hashMap = new HashMap(this.outputSurfaces);
        AndroidVideoInput androidVideoInput = this.videoInput;
        if (androidVideoInput != null) {
            if (androidVideoInput.enableCaptureRenderer()) {
                if (!hashMap.isEmpty()) {
                    new WWm(new C68912VeC(this, hashMap), this.width, this.height);
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                Iterator A15 = AbstractC166997dE.A15(this.outputSurfaces);
                while (A15.hasNext()) {
                    Map.Entry entry = (Map.Entry) A15.next();
                    androidVideoInput.setOutputSurface(((Number) entry.getKey()).intValue(), ((VJM) entry.getValue()).A02);
                }
            }
            if (z) {
                start();
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, X.VJM] */
    public final void setOutputSurface(int i, SurfaceHolder surfaceHolder, int i2, int i3, boolean z, boolean z2) {
        Map map = this.outputSurfaces;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            Map map2 = this.outputSurfaces;
            ?? obj = new Object();
            obj.A02 = surfaceHolder;
            obj.A01 = i2;
            obj.A00 = i3;
            map2.put(valueOf, obj);
        } else {
            VJM vjm = (VJM) this.outputSurfaces.get(valueOf);
            if (vjm != null) {
                vjm.A02 = surfaceHolder;
                if (surfaceHolder != null) {
                    vjm.A01 = i2;
                    vjm.A00 = i3;
                }
            }
        }
        long j = 0;
        Pair create = Pair.create(0, 0);
        Iterator A16 = AbstractC166997dE.A16(this.outputSurfaces);
        while (A16.hasNext()) {
            VJM vjm2 = (VJM) A16.next();
            int i4 = vjm2.A01;
            int i5 = vjm2.A00;
            long j2 = i4 * i5;
            if (j2 > j) {
                create = Pair.create(Integer.valueOf(i4), Integer.valueOf(i5));
                j = j2;
            }
        }
        Object obj2 = create.first;
        C14360o3.A06(obj2);
        int intValue = ((Number) obj2).intValue();
        Object obj3 = create.second;
        C14360o3.A06(obj3);
        setVideoConfig(intValue, ((Number) obj3).intValue(), this.outputFrameRate);
        if (this.started) {
            AndroidVideoInput androidVideoInput = this.videoInput;
            if (androidVideoInput != null) {
                if (androidVideoInput.enableCaptureRenderer()) {
                    Number number = (Number) create.first;
                    if (number != null) {
                        number.intValue();
                    }
                    ensureSurfaceOutput();
                    return;
                }
                androidVideoInput.setOutputSurface(i, surfaceHolder);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public final void setVideoConfig(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.outputFrameRate = i3;
    }

    public final void stop() {
        AndroidVideoInput androidVideoInput = this.videoInput;
        if (androidVideoInput != null) {
            androidVideoInput.stopRenderingToOutput();
            androidVideoInput.setOutputSurface((SurfaceTextureHolder) null, false);
            this.outputSurfaces.clear();
            this.started = false;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void uninitialize() {
        AndroidVideoInput androidVideoInput = this.videoInput;
        if (androidVideoInput != null) {
            androidVideoInput.removeErrorListener(this);
        }
    }

    public AndroidExternalVideoSource(HybridData hybridData) {
        super(hybridData);
        this.outputSurfaces = new HashMap();
    }

    public final void pause() {
        stop();
    }

    public final void pauseOutput(int i) {
        Integer valueOf = Integer.valueOf(i);
        if (this.outputSurfaces.containsKey(valueOf)) {
            this.outputSurfaces.get(valueOf);
            AndroidVideoInput androidVideoInput = this.videoInput;
            if (androidVideoInput != null) {
                androidVideoInput.pauseOutputSurface(i);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public final void resume() {
        start();
    }

    public final void resumeOutput(int i) {
        Integer valueOf = Integer.valueOf(i);
        if (this.outputSurfaces.containsKey(valueOf)) {
            this.outputSurfaces.get(valueOf);
            AndroidVideoInput androidVideoInput = this.videoInput;
            if (androidVideoInput != null) {
                androidVideoInput.resumeOutputSurface(i);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public final void start() {
        ensureSurfaceOutput();
        AndroidVideoInput androidVideoInput = this.videoInput;
        if (androidVideoInput != null) {
            androidVideoInput.startRenderingToOutput();
            this.started = true;
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
