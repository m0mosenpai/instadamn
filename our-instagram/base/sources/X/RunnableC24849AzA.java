package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.AzA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24849AzA implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C84823qW A01;
    public final /* synthetic */ InterfaceC41201vU A02;
    public final /* synthetic */ C144326fE A03;

    public RunnableC24849AzA(UserSession userSession, C84823qW c84823qW, InterfaceC41201vU interfaceC41201vU, C144326fE c144326fE) {
        this.A03 = c144326fE;
        this.A02 = interfaceC41201vU;
        this.A01 = c84823qW;
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C144326fE c144326fE = this.A03;
        InterfaceC41201vU interfaceC41201vU = this.A02;
        C84823qW c84823qW = this.A01;
        UserSession userSession = this.A00;
        View view = c144326fE.A00;
        if (view != null) {
            ViewGroup A01 = AbstractC124845kp.A01(view);
            View view2 = c144326fE.A00;
            if (view2 != null) {
                C138436Oz.A04(view2, c84823qW, interfaceC41201vU.Ack(userSession), A01.getWidth(), A01.getHeight(), true);
                c144326fE.A0A.A03(0);
                return;
            }
        }
        C14360o3.A0F("view");
        throw C00O.createAndThrow();
    }
}
