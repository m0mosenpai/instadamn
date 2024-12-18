package X;

import android.view.View;

/* renamed from: X.AzE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24853AzE implements Runnable {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C84823qW A01;
    public final /* synthetic */ C144376fJ A02;
    public final /* synthetic */ InterfaceC144876g7 A03;

    public RunnableC24853AzE(C41181vS c41181vS, C84823qW c84823qW, C144376fJ c144376fJ, InterfaceC144876g7 interfaceC144876g7) {
        this.A02 = c144376fJ;
        this.A00 = c41181vS;
        this.A01 = c84823qW;
        this.A03 = interfaceC144876g7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C144376fJ c144376fJ = this.A02;
        C41181vS c41181vS = this.A00;
        C84823qW c84823qW = this.A01;
        View A00 = C144376fJ.A00(c144376fJ);
        if (A00.getVisibility() == 0) {
            int width = c144376fJ.A03.getWidth();
            Object parent = C144376fJ.A00(c144376fJ).getParent();
            parent.getClass();
            AbstractC167017dG.A17(A00, c41181vS, c84823qW, width, ((View) parent).getHeight());
        }
        InterfaceC144876g7 interfaceC144876g7 = this.A03;
        if (interfaceC144876g7 != null) {
            interfaceC144876g7.Dok(C144376fJ.A00(c144376fJ), c41181vS, c84823qW);
        }
    }
}
