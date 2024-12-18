package X;

import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;

/* loaded from: classes9.dex */
public final class POH implements Runnable {
    public final /* synthetic */ IgLiteCameraProxy A00;

    public POH(IgLiteCameraProxy igLiteCameraProxy) {
        this.A00 = igLiteCameraProxy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.getApi().enableCamera(false);
    }
}
