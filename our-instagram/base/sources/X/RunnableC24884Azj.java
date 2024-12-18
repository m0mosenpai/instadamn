package X;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.Azj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24884Azj implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ XGG A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C84823qW A03;
    public final /* synthetic */ InterfaceC41201vU A04;
    public final /* synthetic */ C144316fD A05;

    public RunnableC24884Azj(ViewGroup viewGroup, XGG xgg, UserSession userSession, C84823qW c84823qW, InterfaceC41201vU interfaceC41201vU, C144316fD c144316fD) {
        this.A05 = c144316fD;
        this.A03 = c84823qW;
        this.A01 = xgg;
        this.A00 = viewGroup;
        this.A04 = interfaceC41201vU;
        this.A02 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C144316fD c144316fD = this.A05;
        c144316fD.A04.A03(0);
        ViewGroup viewGroup = c144316fD.A00;
        if (viewGroup == null) {
            C14360o3.A0F("buttonWrapperView");
            throw C00O.createAndThrow();
        }
        C84823qW c84823qW = this.A03;
        XGG xgg = this.A01;
        ViewGroup viewGroup2 = this.A00;
        int width = viewGroup2.getWidth();
        int height = viewGroup2.getHeight();
        float Ack = this.A04.Ack(this.A02);
        C14360o3.A0B(xgg, 2);
        Rect A0U = AbstractC166987dD.A0U();
        AbstractC138846Qp.A01(A0U, c84823qW, Ack, width, height);
        RunnableC24850AzB runnableC24850AzB = new RunnableC24850AzB(A0U, viewGroup, xgg, c84823qW);
        if (viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
            runnableC24850AzB.run();
        } else if (viewGroup.isLaidOut()) {
            AbstractC13880nE.A0r(viewGroup, runnableC24850AzB);
        } else {
            AbstractC13880nE.A0q(viewGroup, runnableC24850AzB);
        }
    }
}
