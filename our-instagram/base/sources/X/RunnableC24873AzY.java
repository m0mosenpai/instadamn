package X;

import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.AzY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24873AzY implements Runnable {
    public final /* synthetic */ IgFrameLayout A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ C84823qW A02;
    public final /* synthetic */ InterfaceC144866g6 A03;
    public final /* synthetic */ C144396fL A04;

    public RunnableC24873AzY(IgFrameLayout igFrameLayout, C41181vS c41181vS, C84823qW c84823qW, InterfaceC144866g6 interfaceC144866g6, C144396fL c144396fL) {
        this.A00 = igFrameLayout;
        this.A02 = c84823qW;
        this.A04 = c144396fL;
        this.A01 = c41181vS;
        this.A03 = interfaceC144866g6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgFrameLayout igFrameLayout = this.A00;
        if (igFrameLayout.getVisibility() == 0) {
            C84823qW c84823qW = this.A02;
            C144396fL c144396fL = this.A04;
            int width = c144396fL.A00.getWidth();
            int height = AbstractC124845kp.A01(igFrameLayout).getHeight();
            C41181vS c41181vS = this.A01;
            AbstractC167017dG.A17(igFrameLayout, c41181vS, c84823qW, width, height);
            InterfaceC144866g6 interfaceC144866g6 = this.A03;
            if (interfaceC144866g6 != null) {
                interfaceC144866g6.Dok(c144396fL.A02, c41181vS, c84823qW);
            }
        }
    }
}
