package org.webrtc;

import android.content.Context;
import android.graphics.Matrix;
import android.view.WindowManager;
import org.webrtc.VideoFrame;

/* loaded from: classes12.dex */
public interface CameraSession {

    /* renamed from: org.webrtc.CameraSession$-CC, reason: invalid class name */
    /* loaded from: classes12.dex */
    public abstract /* synthetic */ class CC {
        public static VideoFrame.TextureBuffer createTextureBufferWithModifiedTransformMatrix(TextureBufferImpl textureBufferImpl, boolean z, int i) {
            Matrix matrix = new Matrix();
            matrix.preTranslate(0.5f, 0.5f);
            if (z) {
                matrix.preScale(-1.0f, 1.0f);
            }
            matrix.preRotate(i);
            matrix.preTranslate(-0.5f, -0.5f);
            return textureBufferImpl.applyTransformMatrix(matrix, textureBufferImpl.getWidth(), textureBufferImpl.getHeight());
        }

        public static int getDeviceOrientation(Context context) {
            int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation == 3) {
                        return 270;
                    }
                    return 0;
                }
                return 180;
            }
            return 90;
        }
    }

    /* loaded from: classes12.dex */
    public interface CreateSessionCallback {
        void onDone(CameraSession cameraSession);

        void onFailure(FailureType failureType, String str);
    }

    /* loaded from: classes12.dex */
    public interface Events {
        void onCameraClosed(CameraSession cameraSession);

        void onCameraDisconnected(CameraSession cameraSession);

        void onCameraError(CameraSession cameraSession, String str);

        void onCameraOpening();

        void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame);
    }

    /* loaded from: classes12.dex */
    public enum FailureType {
        ERROR,
        DISCONNECTED
    }

    void stop();
}
