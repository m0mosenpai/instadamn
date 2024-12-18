package X;

import android.view.ViewGroup;
import com.instagram.model.shopping.ProductItemWithAR;

/* renamed from: X.Awm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24705Awm implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C214839fL A01;

    public RunnableC24705Awm(ViewGroup viewGroup, C214839fL c214839fL) {
        this.A01 = c214839fL;
        this.A00 = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        C81Y c81y;
        String str;
        C214839fL c214839fL = this.A01;
        if (c214839fL.mView != null && (viewGroup = this.A00) != null) {
            C81J A01 = C81J.A01();
            InterfaceC25214BDm interfaceC25214BDm = c214839fL.A0F;
            interfaceC25214BDm.getClass();
            A01.A0l = interfaceC25214BDm;
            InterfaceC09390do interfaceC09390do = c214839fL.A0G;
            C81J.A0L(A01, interfaceC09390do);
            C81J.A03(c214839fL.getRootActivity(), c214839fL, A01);
            C81J.A0C(AbstractC166987dD.A0r(interfaceC09390do), C81O.A02, C208509Kk.A00, A01);
            A01.A3h = true;
            A01.A0R = c214839fL.volumeKeyPressController;
            C81I c81i = c214839fL.A02;
            c81i.getClass();
            A01.A0t = c81i;
            A01.A09 = viewGroup;
            C22P c22p = c214839fL.A00;
            if (c22p == null) {
                str = "entryPoint";
            } else {
                A01.A0B = c22p;
                A01.A0O = c214839fL;
                A01.A3H = true;
                ProductItemWithAR productItemWithAR = c214839fL.A03;
                if (productItemWithAR == null) {
                    str = "productItemWithAR";
                } else {
                    A01.A2G = productItemWithAR.A00.A03;
                    A01.A3k = true;
                    A01.A3d = true;
                    C81J.A0E(A01);
                    A01.A3Q = false;
                    C1821585z c1821585z = c214839fL.A05;
                    A01.A1p = c1821585z;
                    A01.A1q = c1821585z;
                    A01.A2N = c214839fL.A06;
                    A01.A2f = null;
                    A01.A3H = true;
                    A01.A3G = false;
                    c214839fL.A01 = new C81Y(A01);
                    if (c214839fL.mLifecycleRegistry.A07().A00(C07S.RESUMED) && (c81y = c214839fL.A01) != null) {
                        c81y.A01();
                        return;
                    }
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }
}
