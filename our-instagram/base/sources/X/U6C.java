package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes11.dex */
public final class U6C implements InterfaceC72001XEp, InterfaceC72039XGh, InterfaceC71944XBt {
    public final C0eR A00;
    public final C131565ws A01;
    public final Context A02;
    public final U6L A03;
    public final WTT A04;
    public final /* synthetic */ U6M A05;

    public U6C(Context context, WTT wtt, InterfaceC62872tQ interfaceC62872tQ) {
        C14360o3.A0B(wtt, 2);
        this.A05 = U6M.A00;
        this.A02 = context;
        this.A04 = wtt;
        this.A00 = new C0eR(this);
        this.A01 = new C131565ws(context);
        this.A03 = W3Q.A00(context, wtt, this, interfaceC62872tQ, C05F.A00);
        this.A00.A0C(C07S.CREATED);
    }

    @Override // X.InterfaceC71944XBt
    public final C2W5 Cgy(C78473fD c78473fD, C2WC c2wc, C102884kP c102884kP, C102884kP c102884kP2, int i, int i2) {
        C14360o3.A0B(c102884kP2, 5);
        return this.A05.Cgy(c78473fD, c2wc, c102884kP, c102884kP2, i, i2);
    }

    @Override // X.InterfaceC72001XEp
    public final void ECn() {
    }

    @Override // X.InterfaceC72001XEp
    public final void EKd() {
    }

    @Override // X.InterfaceC71944XBt
    public final boolean Ek1(C102884kP c102884kP, C102884kP c102884kP2, Object obj, Object obj2) {
        return this.A05.Ek1(c102884kP, c102884kP2, obj, obj2);
    }

    @Override // X.InterfaceC72001XEp
    public final void pause() {
    }

    @Override // X.InterfaceC72001XEp
    public final String Abe() {
        return this.A04.A04;
    }

    @Override // X.InterfaceC72001XEp
    public final String Aga() {
        return this.A04.A06;
    }

    @Override // X.InterfaceC72001XEp
    public final View ArB(Context context) {
        U6L u6l = this.A03;
        Context context2 = u6l.A02;
        C6T7 c6t7 = u6l.A04;
        C14360o3.A0B(c6t7, 1);
        U3u u3u = new U3u(context2);
        MSZ.A13(u3u);
        c6t7.A07(u3u);
        return u3u;
    }

    @Override // X.InterfaceC72001XEp
    public final View BDI() {
        return this.A01;
    }

    @Override // X.InterfaceC72001XEp
    public final EnumC68125VCj Bdl() {
        return EnumC68125VCj.A02;
    }

    @Override // X.InterfaceC72039XGh
    public final /* bridge */ /* synthetic */ void D6r(InterfaceC65469Tkm interfaceC65469Tkm) {
        U6I u6i = (U6I) interfaceC65469Tkm;
        C14360o3.A0B(u6i, 0);
        C79243gV c79243gV = (C79243gV) u6i.A00;
        if (c79243gV != null) {
            this.A01.setRenderTree(c79243gV);
        }
    }

    @Override // X.InterfaceC72001XEp
    public final void E0O() {
        this.A00.A0C(C07S.RESUMED);
    }

    @Override // X.InterfaceC72039XGh
    public final void EZZ(U7A u7a) {
        U6L u6l = this.A03;
        if (u6l != null) {
            u6l.A00 = u7a;
            if (u7a != null) {
                u6l.A00();
            }
        }
    }

    @Override // X.InterfaceC72001XEp
    public final void destroy() {
        this.A00.A0C(C07S.DESTROYED);
    }

    @Override // X.InterfaceC72001XEp
    public final Context getContext() {
        return this.A02;
    }

    @Override // X.C07X
    public final /* bridge */ /* synthetic */ C07T getLifecycle() {
        return this.A00;
    }

    @Override // X.InterfaceC72001XEp
    public final void stop() {
        this.A00.A0C(C07S.CREATED);
    }

    @Override // X.InterfaceC72001XEp
    public final void AP7() {
        stop();
        this.A03.A04.A04();
    }
}
