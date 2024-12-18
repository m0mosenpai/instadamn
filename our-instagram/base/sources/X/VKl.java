package X;

import androidx.window.extensions.layout.WindowLayoutComponent;

/* loaded from: classes11.dex */
public abstract class VKl {
    public static final InterfaceC94694Nw A00(C94664Nt c94664Nt, WindowLayoutComponent windowLayoutComponent) {
        Object obj;
        int A00 = C116195Ny.A00();
        if (A00 >= 2) {
            obj = new WTG(windowLayoutComponent);
        } else if (A00 == 1) {
            obj = new WTH(c94664Nt, windowLayoutComponent);
        } else {
            obj = new Object();
        }
        return (InterfaceC94694Nw) obj;
    }
}
