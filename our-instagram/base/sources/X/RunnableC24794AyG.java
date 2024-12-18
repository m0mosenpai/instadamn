package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.AyG, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24794AyG implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C214799fH A02;

    public RunnableC24794AyG(View view, ViewGroup viewGroup, C214799fH c214799fH) {
        this.A02 = c214799fH;
        this.A01 = viewGroup;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C81Y c81y;
        C81Y c81y2;
        C214799fH c214799fH = this.A02;
        if (c214799fH.mView != null) {
            C81J A01 = C81J.A01();
            InterfaceC25214BDm interfaceC25214BDm = c214799fH.A02;
            interfaceC25214BDm.getClass();
            A01.A0l = interfaceC25214BDm;
            InterfaceC09390do interfaceC09390do = c214799fH.A04;
            C81J.A0L(A01, interfaceC09390do);
            C81J.A03(c214799fH.getRootActivity(), c214799fH, A01);
            C16910sj c16910sj = C16910sj.A00;
            C1811481q c1811481q = C1811481q.A00;
            C81J.A0K(A01, c1811481q, c16910sj);
            A01.A3h = true;
            A01.A0R = c214799fH.volumeKeyPressController;
            C81I c81i = c214799fH.A01;
            c81i.getClass();
            A01.A0t = c81i;
            ViewGroup viewGroup = this.A01;
            viewGroup.getClass();
            A01.A09 = viewGroup;
            A01.A0B = C22P.A3g;
            A01.A0O = c214799fH;
            A01.A3H = true;
            A01.A3t = false;
            A01.A3m = true;
            A01.A3s = false;
            A01.A44 = false;
            A01.A3L = false;
            A01.A3Q = false;
            A01.A3P = false;
            A01.A3i = true;
            A01.A3G = false;
            A01.A3j = false;
            A01.A36 = false;
            A01.A26 = 1;
            A01.A28 = C05F.A0u;
            A01.A0V = C82R.A00(c1811481q, new C81W[0]);
            A01.A3T = AbstractC167007dF.A1Z(c214799fH.A03);
            c214799fH.A00 = new C81Y(A01);
            AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
            C14360o3.A0B(A0o, 0);
            if (C18U.A06(C06090Tz.A05, A0o, 36320468248306196L) && (c81y2 = c214799fH.A00) != null) {
                Context context = this.A00.getContext();
                int color = context.getColor(AbstractC53242c7.A08(context));
                C1814382v c1814382v = c81y2.A00.A1Z;
                c1814382v.A00().C4g().ERh(color);
                C184708Hl Csh = c1814382v.A00().C4g().Csh();
                Csh.A02 = false;
                Csh.A00 = new C23741AfE(c81y2, 0);
                Csh.A00();
                c1814382v.A00().Elj();
            }
            C81Y c81y3 = c214799fH.A00;
            if (c81y3 != null) {
                C8HI c8hi = c81y3.A00.A0k;
                if (C8HI.A02(c8hi).booleanValue()) {
                    c8hi.A1F.A00().A01(c8hi.A0T, c8hi.A1I, EnumC199188rL.A0S);
                }
            }
            if (c214799fH.isResumed() && (c81y = c214799fH.A00) != null) {
                c81y.A01();
            }
        }
    }
}
