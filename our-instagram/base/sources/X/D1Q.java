package X;

import android.view.Choreographer;

/* loaded from: classes5.dex */
public final class D1Q implements Runnable {
    public final /* synthetic */ InterfaceC24901Jp A00;

    public D1Q(InterfaceC24901Jp interfaceC24901Jp) {
        this.A00 = interfaceC24901Jp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC24901Jp interfaceC24901Jp = this.A00;
        Choreographer choreographer = AnonymousClass134.choreographer;
        if (choreographer == null) {
            choreographer = Choreographer.getInstance();
            C14360o3.A0A(choreographer);
            AnonymousClass134.choreographer = choreographer;
        }
        choreographer.postFrameCallback(new ChoreographerFrameCallbackC28590CjV(interfaceC24901Jp));
    }
}
