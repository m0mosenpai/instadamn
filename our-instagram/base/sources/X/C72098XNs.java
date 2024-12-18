package X;

import android.hardware.Camera;
import android.os.SystemClock;
import java.util.List;

/* renamed from: X.XNs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72098XNs implements Camera.PreviewCallback {
    public final /* synthetic */ C72096XNq A00;

    public C72098XNs(C72096XNq c72096XNq) {
        this.A00 = c72096XNq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.8n0, java.lang.Object] */
    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        if (bArr != null) {
            C196998nU.A00().A02();
            ?? obj = new Object();
            C72096XNq c72096XNq = this.A00;
            int i = c72096XNq.A00;
            C176877tj c176877tj = c72096XNq.A01;
            int i2 = c176877tj.A02;
            int i3 = c176877tj.A01;
            obj.A09 = bArr;
            obj.A01 = i;
            obj.A02 = i2;
            obj.A00 = i3;
            obj.A03 = SystemClock.elapsedRealtimeNanos();
            List list = c72096XNq.A03.A00;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((InterfaceC25160BBf) list.get(i4)).Dad(obj);
            }
        }
    }
}
