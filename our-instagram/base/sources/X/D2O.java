package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class D2O implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C144296fB A01;
    public final /* synthetic */ C84823qW A02;
    public final /* synthetic */ InterfaceC41201vU A03;

    public D2O(UserSession userSession, C144296fB c144296fB, C84823qW c84823qW, InterfaceC41201vU interfaceC41201vU) {
        this.A01 = c144296fB;
        this.A03 = interfaceC41201vU;
        this.A02 = c84823qW;
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C144296fB c144296fB = this.A01;
        InterfaceC41201vU interfaceC41201vU = this.A03;
        C84823qW c84823qW = this.A02;
        UserSession userSession = this.A00;
        View view = c144296fB.A01;
        if (view != null) {
            ViewGroup A01 = AbstractC124845kp.A01(view);
            View view2 = c144296fB.A01;
            if (view2 != null) {
                C138436Oz.A04(view2, c84823qW, interfaceC41201vU.Ack(userSession), A01.getWidth(), A01.getHeight(), true);
                return;
            }
        }
        C14360o3.A0F("stickerContainerView");
        throw C00O.createAndThrow();
    }
}
