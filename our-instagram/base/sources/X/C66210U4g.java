package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.U4g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66210U4g implements InterfaceC72001XEp {
    public C66201U3x A00;
    public final Context A01;
    public final C131565ws A02;
    public final String A03;

    @Override // X.InterfaceC72001XEp
    public final void E0O() {
    }

    @Override // X.InterfaceC72001XEp
    public final void EKd() {
    }

    @Override // X.InterfaceC72001XEp
    public final void pause() {
    }

    @Override // X.InterfaceC72001XEp
    public final void AP7() {
        C66201U3x c66201U3x = this.A00;
        if (c66201U3x == null) {
            C14360o3.A0F("bloksSurfaceController");
            throw C00O.createAndThrow();
        }
        c66201U3x.A07();
    }

    @Override // X.InterfaceC72001XEp
    public final String Abe() {
        C66201U3x c66201U3x = this.A00;
        if (c66201U3x == null) {
            C14360o3.A0F("bloksSurfaceController");
            throw C00O.createAndThrow();
        }
        C66273U6s c66273U6s = c66201U3x.A05;
        String str = c66273U6s.A08;
        if (str == null) {
            str = c66273U6s.A09;
        }
        if (str == null) {
            return c66273U6s.A09;
        }
        return str;
    }

    @Override // X.InterfaceC72001XEp
    public final String Aga() {
        return this.A03;
    }

    @Override // X.InterfaceC72001XEp
    public final View ArB(Context context) {
        C66201U3x c66201U3x = this.A00;
        if (c66201U3x == null) {
            C14360o3.A0F("bloksSurfaceController");
            throw C00O.createAndThrow();
        }
        Object obj = c66201U3x.A04(context).first;
        if (obj != null) {
            return (View) obj;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC72001XEp
    public final View BDI() {
        return this.A02;
    }

    @Override // X.InterfaceC72001XEp
    public final EnumC68125VCj Bdl() {
        return EnumC68125VCj.A02;
    }

    @Override // X.InterfaceC72001XEp
    public final void ECn() {
        C66201U3x c66201U3x = this.A00;
        if (c66201U3x == null) {
            C14360o3.A0F("bloksSurfaceController");
            throw C00O.createAndThrow();
        }
        InterfaceC192098fA interfaceC192098fA = c66201U3x.A01;
        if (interfaceC192098fA != null) {
            interfaceC192098fA.ECn();
        }
    }

    @Override // X.InterfaceC72001XEp
    public final void destroy() {
        C66201U3x c66201U3x = this.A00;
        if (c66201U3x == null) {
            C14360o3.A0F("bloksSurfaceController");
            throw C00O.createAndThrow();
        }
        c66201U3x.A06();
    }

    @Override // X.InterfaceC72001XEp
    public final Context getContext() {
        return this.A01;
    }

    @Override // X.InterfaceC72001XEp
    public final void stop() {
        C66201U3x c66201U3x = this.A00;
        if (c66201U3x == null) {
            C14360o3.A0F("bloksSurfaceController");
            throw C00O.createAndThrow();
        }
        InterfaceC72008XEw interfaceC72008XEw = c66201U3x.A00;
        if (interfaceC72008XEw != null) {
            interfaceC72008XEw.Ch8("BloksSurfaceController_onPause");
        }
    }

    public C66210U4g(C131565ws c131565ws, String str) {
        this.A02 = c131565ws;
        this.A03 = str;
        this.A01 = AbstractC166997dE.A0L(c131565ws);
    }
}
