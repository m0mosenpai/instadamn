package X;

import com.facebook.react.devsupport.CxxInspectorPackagerConnection;

/* renamed from: X.TNl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64629TNl implements Runnable {
    public final /* synthetic */ C65140TeF A00;
    public final /* synthetic */ Throwable A01;

    public RunnableC64629TNl(C65140TeF c65140TeF, Throwable th) {
        this.A00 = c65140TeF;
        this.A01 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String message = this.A01.getMessage();
        CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate = this.A00.A01;
        if (message == null) {
            message = "<Unknown error>";
        }
        webSocketDelegate.didFailWithError(null, message);
        webSocketDelegate.close();
    }
}
