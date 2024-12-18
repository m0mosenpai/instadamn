package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.meta.foa.session.FoaUserSession;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Cot, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28885Cot implements C07X, InterfaceC018407e, InterfaceC72001XEp, XBX {
    public static final AtomicInteger A07 = new AtomicInteger();
    public final C018307d A00 = new C018307d();
    public final Context A01;
    public final FrameLayout A02;
    public final C0eR A03;
    public final C27987CVk A04;
    public final CVA A05;
    public final CTL A06;

    public C28885Cot(Context context, CWZ cwz, InterfaceC30961DjI interfaceC30961DjI, C27987CVk c27987CVk, FoaUserSession foaUserSession, Object obj) {
        this.A01 = context;
        this.A04 = c27987CVk;
        this.A02 = new FrameLayout(context);
        CVA cva = new CVA(String.valueOf(A07.incrementAndGet()));
        this.A05 = cva;
        C0eR c0eR = new C0eR(this);
        c0eR.A0C(C07S.CREATED);
        this.A03 = c0eR;
        this.A06 = new CTL(this, this, cwz, interfaceC30961DjI, c27987CVk, cva, foaUserSession, obj);
    }

    @Override // X.InterfaceC72001XEp
    public final void ECn() {
    }

    @Override // X.InterfaceC72001XEp
    public final void AP7() {
        this.A03.A0C(C07S.CREATED);
        CTL ctl = this.A06;
        ctl.A09.clear();
        ctl.A0A.clear();
        ctl.A0B.clear();
        ctl.A0C.clear();
    }

    @Override // X.InterfaceC72001XEp
    public final String Abe() {
        return this.A04.A00;
    }

    @Override // X.InterfaceC72001XEp
    public final String Aga() {
        return this.A05.A00;
    }

    @Override // X.InterfaceC72001XEp
    public final View ArB(Context context) {
        CTL ctl = this.A06;
        InterfaceC16610sE interfaceC16610sE = ctl.A05.A02;
        CUo cUo = new CUo(context, ctl.A02, ctl.A06, ctl.A07);
        cUo.A00 = ctl;
        View view = (View) interfaceC16610sE.invoke(cUo, ctl.A08, ctl.A04);
        cUo.A00 = null;
        return view;
    }

    @Override // X.XBX
    public final boolean Cyt() {
        InterfaceC16820sZ interfaceC16820sZ = this.A06.A00;
        if (interfaceC16820sZ != null) {
            return AbstractC25231BEo.A1b(interfaceC16820sZ);
        }
        return false;
    }

    @Override // X.InterfaceC72001XEp
    public final void E0O() {
        this.A03.A0C(C07S.RESUMED);
    }

    @Override // X.InterfaceC72001XEp
    public final void EKd() {
        this.A03.A0C(C07S.RESUMED);
    }

    @Override // X.InterfaceC72001XEp
    public final void destroy() {
        this.A03.A0C(C07S.DESTROYED);
        Activity A00 = C66224U4u.A00(this.A01);
        if (A00 != null && !A00.isChangingConfigurations()) {
            this.A00.A00();
        }
    }

    @Override // X.InterfaceC72001XEp
    public final void pause() {
        this.A03.A0C(C07S.STARTED);
    }

    @Override // X.InterfaceC72001XEp
    public final void stop() {
        this.A03.A0C(C07S.CREATED);
    }

    @Override // X.InterfaceC72001XEp
    public final View BDI() {
        return this.A02;
    }

    @Override // X.InterfaceC72001XEp
    public final EnumC68125VCj Bdl() {
        return EnumC68125VCj.A03;
    }

    @Override // X.InterfaceC72001XEp
    public final Context getContext() {
        return this.A01;
    }

    @Override // X.C07X
    public final C07T getLifecycle() {
        return this.A03;
    }

    @Override // X.InterfaceC018407e
    public final C018307d getViewModelStore() {
        return this.A00;
    }
}
