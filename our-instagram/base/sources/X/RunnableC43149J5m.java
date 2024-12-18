package X;

import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.J5m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43149J5m implements Runnable {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C84823qW A01;
    public final /* synthetic */ C144196f1 A02;
    public final /* synthetic */ InterfaceC144756fv A03;

    public RunnableC43149J5m(C41181vS c41181vS, C84823qW c84823qW, C144196f1 c144196f1, InterfaceC144756fv interfaceC144756fv) {
        this.A02 = c144196f1;
        this.A00 = c41181vS;
        this.A01 = c84823qW;
        this.A03 = interfaceC144756fv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C144196f1 c144196f1 = this.A02;
        C41181vS c41181vS = this.A00;
        C84823qW c84823qW = this.A01;
        ImageView imageView = c144196f1.A01;
        if (imageView != null) {
            ViewGroup viewGroup = c144196f1.A00;
            C14360o3.A0A(viewGroup);
            int width = viewGroup.getWidth();
            ViewGroup viewGroup2 = c144196f1.A00;
            C14360o3.A0A(viewGroup2);
            C138436Oz.A04(imageView, c84823qW, c41181vS.A00(), width, viewGroup2.getHeight(), true);
            InterfaceC144756fv interfaceC144756fv = this.A03;
            ImageView imageView2 = c144196f1.A01;
            C14360o3.A0A(imageView2);
            interfaceC144756fv.Dok(imageView2, c41181vS, c84823qW);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
