package X;

import android.os.RemoteException;
import com.instagram.direct.stella.api.ISendDirectMessageCallback;

/* renamed from: X.P1x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56386P1x implements InterfaceC57946Pms {
    public final /* synthetic */ C56134Ovu A00;
    public final /* synthetic */ ISendDirectMessageCallback A01;

    public C56386P1x(C56134Ovu c56134Ovu, ISendDirectMessageCallback iSendDirectMessageCallback) {
        this.A00 = c56134Ovu;
        this.A01 = iSendDirectMessageCallback;
    }

    @Override // X.InterfaceC57946Pms
    public final void DTH(String str, boolean z, String str2) {
        boolean remove;
        ISendDirectMessageCallback iSendDirectMessageCallback;
        C56134Ovu c56134Ovu = this.A00;
        synchronized (c56134Ovu.A01) {
            remove = c56134Ovu.A02.remove(str);
        }
        if (remove && (iSendDirectMessageCallback = this.A01) != null) {
            try {
                iSendDirectMessageCallback.DTG(str, z);
            } catch (RemoteException unused) {
            }
        }
    }
}
