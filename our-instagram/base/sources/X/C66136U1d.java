package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.U1d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66136U1d implements InterfaceC72020XFi {
    public final Handler A00;
    public final C57112jm A01;
    public final C66141U1i A02;
    public final C66150U1r A03;
    public final C66147U1o A04;
    public final C66149U1q A05;
    public final C66148U1p A06;
    public final C66146U1n A07;
    public final C66138U1f A08;
    public final C66143U1k A09;
    public final C66144U1l A0A;
    public final C66140U1h A0B;
    public final C66142U1j A0C;
    public final C66137U1e A0D;
    public final C66139U1g A0E;

    public C66136U1d(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, InterfaceC132105xl interfaceC132105xl, C66163U2e c66163U2e, InterfaceC190488c6 interfaceC190488c6, W99 w99, InterfaceC72022XFk interfaceC72022XFk, XB8 xb8, XB9 xb9, XBA xba, String str) {
        AbstractC167007dF.A1G(xb8, 4, interfaceC72022XFk);
        C14360o3.A0B(userSession, 7);
        C14360o3.A0B(xb9, 9);
        C14360o3.A0B(xba, 11);
        this.A01 = c57112jm;
        this.A00 = new HandlerC65967TxK(Looper.getMainLooper(), this, 10);
        C66138U1f c66138U1f = new C66138U1f(xb8);
        this.A08 = c66138U1f;
        C66137U1e c66137U1e = new C66137U1e(interfaceC132105xl, interfaceC190488c6, interfaceC72022XFk, xb8, xb9);
        this.A0D = c66137U1e;
        C66139U1g c66139U1g = new C66139U1g(w99);
        this.A0E = c66139U1g;
        C66146U1n c66146U1n = new C66146U1n(w99);
        this.A07 = c66146U1n;
        this.A0B = new C66140U1h(c66163U2e, xba, c66137U1e, c66138U1f);
        this.A06 = new C66148U1p(interfaceC11380iw, userSession, new C66145U1m(interfaceC72022XFk, xb8, str));
        this.A0A = new C66144U1l(c66137U1e, c66138U1f);
        this.A0C = new C66142U1j(interfaceC11380iw, userSession, c66138U1f);
        this.A02 = new C66141U1i(c66137U1e, c66138U1f, str);
        this.A03 = new C66150U1r(w99, c66146U1n, c66138U1f);
        this.A04 = new C66147U1o(w99, c66139U1g, c66138U1f);
        this.A05 = new C66149U1q(w99, c66138U1f);
        this.A09 = new C66143U1k(c66137U1e, c66138U1f);
    }

    @Override // X.InterfaceC72020XFi
    public final void EDz(View view, AbstractC65924TwV abstractC65924TwV, Tx0 tx0) {
        C14360o3.A0B(view, 0);
        C59072n8 A00 = C59062n7.A00(abstractC65924TwV, tx0, this.A08.A00(abstractC65924TwV.A01()));
        A00.A00(this.A0B);
        this.A01.A05(view, A00.A01());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0095, code lost:
    
        if (r15.A03.ByJ() == null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66136U1d.A00():void");
    }
}
