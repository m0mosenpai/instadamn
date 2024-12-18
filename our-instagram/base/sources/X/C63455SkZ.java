package X;

import android.media.MediaScannerConnection;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;

/* renamed from: X.SkZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63455SkZ implements MediaScannerConnection.OnScanCompletedListener {
    public final /* synthetic */ R32 A00;

    public C63455SkZ(R32 r32) {
        this.A00 = r32;
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, android.net.Uri uri) {
        InterfaceC65622ToD interfaceC65622ToD = this.A00.A02;
        if (uri != null) {
            interfaceC65622ToD.resolve(uri.toString());
        } else {
            interfaceC65622ToD.reject(CameraRollManager.ERROR_UNABLE_TO_SAVE, "Could not add image to gallery");
        }
    }
}
