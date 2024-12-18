package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class D2T implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C84823qW A02;
    public final /* synthetic */ InterfaceC41201vU A03;
    public final /* synthetic */ C144216f3 A04;

    public D2T(ViewGroup viewGroup, UserSession userSession, C84823qW c84823qW, InterfaceC41201vU interfaceC41201vU, C144216f3 c144216f3) {
        this.A04 = c144216f3;
        this.A02 = c84823qW;
        this.A00 = viewGroup;
        this.A03 = interfaceC41201vU;
        this.A01 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A04.A01;
        C84823qW c84823qW = this.A02;
        ViewGroup viewGroup = this.A00;
        C138436Oz.A04(view, c84823qW, this.A03.Ack(this.A01), viewGroup.getWidth(), viewGroup.getHeight(), true);
    }
}
