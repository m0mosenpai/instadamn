package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.AzD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24852AzD implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ C84823qW A02;
    public final /* synthetic */ C144286fA A03;

    public RunnableC24852AzD(UserSession userSession, C41181vS c41181vS, C84823qW c84823qW, C144286fA c144286fA) {
        this.A03 = c144286fA;
        this.A00 = userSession;
        this.A01 = c41181vS;
        this.A02 = c84823qW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C144286fA c144286fA = this.A03;
        C41181vS c41181vS = this.A01;
        C84823qW c84823qW = this.A02;
        View view = c144286fA.A01;
        if (view != null) {
            ViewGroup A01 = AbstractC124845kp.A01(view);
            View view2 = c144286fA.A01;
            if (view2 != null) {
                AbstractC167017dG.A17(view2, c41181vS, c84823qW, A01.getWidth(), A01.getHeight());
                return;
            }
        }
        C14360o3.A0F("stickerContainerView");
        throw C00O.createAndThrow();
    }
}
