package X;

import com.facebook.react.devsupport.CxxInspectorPackagerConnection;

/* renamed from: X.TKe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64567TKe implements Runnable {
    public final /* synthetic */ C65140TeF A00;

    public RunnableC64567TKe(C65140TeF c65140TeF) {
        this.A00 = c65140TeF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate = this.A00.A01;
        webSocketDelegate.didClose();
        webSocketDelegate.close();
    }
}
