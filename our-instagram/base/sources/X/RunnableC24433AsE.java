package X;

import android.view.ViewGroup;

/* renamed from: X.AsE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24433AsE implements Runnable {
    public final /* synthetic */ C214719f9 A00;

    public RunnableC24433AsE(C214719f9 c214719f9) {
        this.A00 = c214719f9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C214719f9 c214719f9 = this.A00;
        if (c214719f9.mView != null) {
            C81J A01 = C81J.A01();
            InterfaceC25214BDm interfaceC25214BDm = c214719f9.A02;
            interfaceC25214BDm.getClass();
            A01.A0l = interfaceC25214BDm;
            C81J.A0L(A01, c214719f9.A04);
            C81J.A03(c214719f9.requireActivity(), c214719f9, A01);
            C16910sj c16910sj = C16910sj.A00;
            C81Q c81q = C81Q.A00;
            C81J.A0K(A01, c81q, c16910sj);
            A01.A3h = true;
            A01.A0R = c214719f9.volumeKeyPressController;
            C81I c81i = c214719f9.A01;
            c81i.getClass();
            A01.A0t = c81i;
            ViewGroup viewGroup = (ViewGroup) c214719f9.A03.getValue();
            viewGroup.getClass();
            A01.A09 = viewGroup;
            A01.A0B = C22P.A0c;
            A01.A0O = c214719f9;
            A01.A3H = true;
            A01.A3t = false;
            A01.A3s = false;
            A01.A28 = C05F.A1I;
            A01.A44 = false;
            A01.A3L = false;
            A01.A3Q = false;
            A01.A3P = true;
            A01.A3i = false;
            A01.A35 = false;
            A01.A3G = false;
            A01.A3j = true;
            A01.A3Z = true;
            A01.A36 = false;
            A01.A26 = 1;
            A01.A0V = C82R.A00(c81q, new C81W[0]);
            A01.A0g = new C23739AfC();
            c214719f9.A00 = new C81Y(A01);
        }
    }
}
