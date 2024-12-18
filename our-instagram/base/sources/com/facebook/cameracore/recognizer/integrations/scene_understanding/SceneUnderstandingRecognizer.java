package com.facebook.cameracore.recognizer.integrations.scene_understanding;

import X.C09170dP;
import com.facebook.cameracore.recognizer.logger.RecognizerLogger;
import com.facebook.cameracore.util.Reference;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public abstract class SceneUnderstandingRecognizer {
    public final ScheduledExecutorService mExecutorService;
    public final HybridData mHybridData;

    public static native HybridData initHybrid(ScheduledExecutorService scheduledExecutorService, String str, String str2, String str3, RecognizerLogger recognizerLogger);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, long j, boolean z2, Reference reference);

    private native void nativeUpdateFrame(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, byte[] bArr, long j, boolean z2, Reference reference);

    private native void setRecognizedTargetHandler(SceneUnderstandingRecognizedTargetHandler sceneUnderstandingRecognizedTargetHandler);

    private native void startRecognizer();

    private native void stopRecognizer();

    static {
        C09170dP.A0C("scene-understanding-recognizer-android");
        C09170dP.A0D("torch-code-gen", 16);
        C09170dP.A0D("dynamic_pytorch_impl", 16);
    }
}
