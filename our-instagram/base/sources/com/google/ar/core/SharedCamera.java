package com.google.ar.core;

import X.AbstractC166987dD;
import X.AbstractC65702TsY;
import X.Y08;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class SharedCamera {
    public final Session A01;
    public final Y08 A02 = new Y08(null);
    public Handler A00 = new Handler(AbstractC65702TsY.A0G("SharedCameraHandlerThread"));

    private native void nativeSharedCameraCaptureSessionActive(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionClosed(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionConfigureFailed(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionConfigured(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionReady(long j, CameraCaptureSession cameraCaptureSession);

    private native ImageReader nativeSharedCameraGetImageReader(long j, CameraDevice cameraDevice);

    private native ImageReader nativeSharedCameraGetImageReaderMotionTracking(long j, CameraDevice cameraDevice);

    private native Surface nativeSharedCameraGetSurface(long j, CameraDevice cameraDevice);

    private native SurfaceTexture nativeSharedCameraGetSurfaceTexture(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnClosed(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnDisconnected(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnOpened(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraSetAppSurfaces(long j, String str, List list);

    private native void nativeSharedCameraSetCaptureCallback(long j, CameraCaptureSession.CaptureCallback captureCallback, Handler handler);

    public static SurfaceTexture A00(SharedCamera sharedCamera) {
        return sharedCamera.nativeSharedCameraGetSurfaceTexture(sharedCamera.A01.nativeWrapperHandle, sharedCamera.A02.A01);
    }

    public static Surface A01(SharedCamera sharedCamera) {
        return sharedCamera.nativeSharedCameraGetSurface(sharedCamera.A01.nativeWrapperHandle, sharedCamera.A02.A01);
    }

    public static void A02(CameraCaptureSession cameraCaptureSession, SharedCamera sharedCamera) {
        sharedCamera.nativeSharedCameraCaptureSessionActive(sharedCamera.A01.nativeWrapperHandle, cameraCaptureSession);
    }

    public static void A03(CameraCaptureSession cameraCaptureSession, SharedCamera sharedCamera) {
        sharedCamera.nativeSharedCameraCaptureSessionClosed(sharedCamera.A01.nativeWrapperHandle, cameraCaptureSession);
    }

    public static void A04(CameraCaptureSession cameraCaptureSession, SharedCamera sharedCamera) {
        sharedCamera.nativeSharedCameraCaptureSessionConfigureFailed(sharedCamera.A01.nativeWrapperHandle, cameraCaptureSession);
    }

    public static void A05(CameraCaptureSession cameraCaptureSession, SharedCamera sharedCamera) {
        sharedCamera.nativeSharedCameraCaptureSessionConfigured(sharedCamera.A01.nativeWrapperHandle, cameraCaptureSession);
    }

    public static void A06(CameraCaptureSession cameraCaptureSession, SharedCamera sharedCamera) {
        sharedCamera.nativeSharedCameraCaptureSessionReady(sharedCamera.A01.nativeWrapperHandle, cameraCaptureSession);
    }

    public static void A07(CameraDevice cameraDevice, SharedCamera sharedCamera) {
        sharedCamera.nativeSharedCameraOnClosed(sharedCamera.A01.nativeWrapperHandle, cameraDevice);
    }

    public static void A08(CameraDevice cameraDevice, SharedCamera sharedCamera) {
        sharedCamera.nativeSharedCameraOnDisconnected(sharedCamera.A01.nativeWrapperHandle, cameraDevice);
        sharedCamera.A02.A01 = null;
    }

    public static void A09(CameraDevice cameraDevice, SharedCamera sharedCamera) {
        sharedCamera.A02.A01 = cameraDevice;
        sharedCamera.nativeSharedCameraOnOpened(sharedCamera.A01.nativeWrapperHandle, cameraDevice);
    }

    public static void A0A(SharedCamera sharedCamera) {
        Session session = sharedCamera.A01;
        long j = session.nativeWrapperHandle;
        Y08 y08 = sharedCamera.A02;
        ImageReader nativeSharedCameraGetImageReader = sharedCamera.nativeSharedCameraGetImageReader(j, y08.A01);
        if (nativeSharedCameraGetImageReader != null) {
            nativeSharedCameraGetImageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: X.APJ
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    Image acquireLatestImage = imageReader.acquireLatestImage();
                    if (acquireLatestImage != null) {
                        acquireLatestImage.close();
                    }
                }
            }, sharedCamera.A00);
        }
        ImageReader nativeSharedCameraGetImageReaderMotionTracking = sharedCamera.nativeSharedCameraGetImageReaderMotionTracking(session.nativeWrapperHandle, y08.A01);
        if (nativeSharedCameraGetImageReaderMotionTracking != null) {
            nativeSharedCameraGetImageReaderMotionTracking.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: X.APJ
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    Image acquireLatestImage = imageReader.acquireLatestImage();
                    if (acquireLatestImage != null) {
                        acquireLatestImage.close();
                    }
                }
            }, sharedCamera.A00);
        }
    }

    public final void A0C(CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        nativeSharedCameraSetCaptureCallback(this.A01.nativeWrapperHandle, captureCallback, handler);
    }

    public final void A0D(String str, List list) {
        this.A02.A03.put(str, list);
        nativeSharedCameraSetAppSurfaces(this.A01.nativeWrapperHandle, str, list);
    }

    public SharedCamera(Session session) {
        this.A01 = session;
    }

    public final ArrayList A0B() {
        ArrayList A1E = AbstractC166987dD.A1E();
        Y08 y08 = this.A02;
        A1E.add(y08.A02);
        Session session = this.A01;
        ImageReader nativeSharedCameraGetImageReaderMotionTracking = nativeSharedCameraGetImageReaderMotionTracking(session.nativeWrapperHandle, y08.A01);
        if (nativeSharedCameraGetImageReaderMotionTracking != null) {
            A1E.add(nativeSharedCameraGetImageReaderMotionTracking.getSurface());
        }
        A1E.add(nativeSharedCameraGetImageReader(session.nativeWrapperHandle, y08.A01).getSurface());
        return A1E;
    }
}
