package X;

import android.content.Context;
import android.media.MediaScannerConnection;
import java.util.Queue;

/* renamed from: X.Oh5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55340Oh5 implements MediaScannerConnection.MediaScannerConnectionClient {
    public final InterfaceC09390do A00;
    public final String A01;
    public final Queue A02;

    private final void A00() {
        Queue queue = this.A02;
        if (queue.isEmpty()) {
            ((MediaScannerConnection) this.A00.getValue()).disconnect();
            return;
        }
        Object remove = queue.remove();
        if (remove != null) {
            String str = (String) remove;
            InterfaceC09390do interfaceC09390do = this.A00;
            if (((MediaScannerConnection) interfaceC09390do.getValue()).isConnected()) {
                ((MediaScannerConnection) interfaceC09390do.getValue()).scanFile(str, this.A01);
                return;
            } else {
                C0w9.A03("MediaScannerUtil", "MediaScannerConnection was not connected successfully");
                return;
            }
        }
        throw AbstractC166997dE.A0g();
    }

    public C55340Oh5(Context context, String str, Queue queue) {
        this.A02 = queue;
        this.A01 = str;
        this.A00 = AbstractC09440dt.A01(new C57255Pbd(35, context, this));
    }

    @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
    public final void onMediaScannerConnected() {
        A00();
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, android.net.Uri uri) {
        A00();
    }
}
