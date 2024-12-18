package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.J5i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43145J5i implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ ViewOnTouchListenerC97504Zk A01;
    public final /* synthetic */ C84823qW A02;
    public final /* synthetic */ InterfaceC41201vU A03;

    public RunnableC43145J5i(UserSession userSession, ViewOnTouchListenerC97504Zk viewOnTouchListenerC97504Zk, C84823qW c84823qW, InterfaceC41201vU interfaceC41201vU) {
        this.A01 = viewOnTouchListenerC97504Zk;
        this.A00 = userSession;
        this.A03 = interfaceC41201vU;
        this.A02 = c84823qW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A01(this.A00, this.A02, this.A03);
    }
}
