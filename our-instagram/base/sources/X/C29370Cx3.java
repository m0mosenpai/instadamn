package X;

import android.animation.Animator;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.facebook.litho.LithoView;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreel.IgShowreelComposition;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* renamed from: X.Cx3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29370Cx3 implements InterfaceC31147Dmq {
    public LithoView A00;
    public ListenableFuture A01;
    public C6FG A02;
    public int A03;
    public C138746Qe A04;
    public C138756Qf A05;
    public String A06;
    public String A07;
    public boolean A08;
    public final InterfaceC127355pE A09;
    public final Context A0A;
    public final ViewGroup A0B;
    public final C130015u6 A0C = new C130015u6();

    private final java.util.Set A00() {
        C6FG c6fg = this.A02;
        if (c6fg != null) {
            return new HashSet(((AbstractMap) c6fg.A00(R.id.bk_context_key_animations)).values());
        }
        return C16910sj.A00;
    }

    public static final void A01(C29370Cx3 c29370Cx3, Throwable th) {
        if (th instanceof CancellationException) {
            C138746Qe c138746Qe = c29370Cx3.A04;
            if (c138746Qe != null) {
                c138746Qe.A07();
                return;
            }
            return;
        }
        c29370Cx3.A09.DQ8(3);
        C138746Qe c138746Qe2 = c29370Cx3.A04;
        if (c138746Qe2 == null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        c138746Qe2.A0F(message);
    }

    @Override // X.InterfaceC115845Ly
    public final boolean CXh() {
        LithoView lithoView = this.A00;
        if (lithoView != null && lithoView.A00 != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC31147Dmq
    public final void CmZ(C139336So c139336So) {
        this.A0C.A00(c139336So.A00);
    }

    @Override // X.InterfaceC31147Dmq
    public final void Dzk() {
        C138746Qe c138746Qe = this.A04;
        if (c138746Qe != null) {
            c138746Qe.A0A();
        }
    }

    @Override // X.InterfaceC31147Dmq
    public final void Dzl() {
        C138746Qe c138746Qe = this.A04;
        if (c138746Qe != null) {
            c138746Qe.A0H("video_play_request_start", null);
        }
    }

    @Override // X.InterfaceC31147Dmq
    public final void Dzm() {
        C138746Qe c138746Qe = this.A04;
        if (c138746Qe != null) {
            c138746Qe.A0H("video_play_request_success", null);
        }
    }

    @Override // X.InterfaceC115845Ly
    public final void E0c() {
        LithoView lithoView;
        C138756Qf c138756Qf;
        String str = this.A06;
        if (str != null) {
            C138746Qe c138746Qe = this.A04;
            if (c138746Qe != null) {
                c138746Qe.A08();
            }
            C138746Qe c138746Qe2 = this.A04;
            if (c138746Qe2 != null) {
                c138746Qe2.A0H("fully_enter_viewport", str);
            }
            this.A0C.Chv(C6P9.A01(C05F.A01, str));
        }
        if (this.A08 && (lithoView = this.A00) != null && (c138756Qf = this.A05) != null) {
            WG4.A01(this.A0A, lithoView, c138756Qf, AbstractC06930Yk.A0E(), 0.0f, this.A03);
        }
    }

    @Override // X.InterfaceC115845Ly
    public final void E0l() {
        C138746Qe c138746Qe = this.A04;
        if (c138746Qe != null) {
            c138746Qe.A09();
        }
        this.A0C.Chv(C6P9.A00(C05F.A01));
    }

    @Override // X.InterfaceC115845Ly
    public final void E0o() {
        String str = this.A06;
        if (str != null) {
            C138746Qe c138746Qe = this.A04;
            if (c138746Qe != null) {
                c138746Qe.A08();
            }
            C138746Qe c138746Qe2 = this.A04;
            if (c138746Qe2 != null) {
                c138746Qe2.A0H("partially_enter_viewport", str);
            }
            this.A0C.Chv(C6P9.A02(C05F.A01, str));
        }
    }

    @Override // X.InterfaceC31147Dmq
    public final void EeL(UserSession userSession, IgShowreelComposition igShowreelComposition, InterfaceC138736Qd interfaceC138736Qd, InterfaceC62872tQ interfaceC62872tQ, InterfaceC139386St interfaceC139386St, AbstractC27447C9p abstractC27447C9p, C6FG c6fg) {
        ListenableFuture A01;
        String str;
        if (CXh() && (str = this.A07) != null && str.equals(igShowreelComposition.Aqq())) {
            interfaceC139386St.onSuccess();
            return;
        }
        C138746Qe c138746Qe = this.A04;
        if (c138746Qe != null) {
            c138746Qe.A07();
        }
        if (this.A00 == null) {
            LithoView lithoView = new LithoView(this.A0A);
            this.A00 = lithoView;
            this.A0B.addView(lithoView, new FrameLayout.LayoutParams(-1, -1, 17));
        }
        this.A02 = c6fg;
        this.A07 = igShowreelComposition.Aqq();
        ListenableFuture listenableFuture = this.A01;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
        InterfaceC127355pE interfaceC127355pE = this.A09;
        interfaceC127355pE.DQ8(1);
        String EqO = ((C138956Rc) interfaceC138736Qd).A04.EqO();
        String A0j = AbstractC167017dG.A0j();
        String Anz = igShowreelComposition.Anz();
        String C5i = igShowreelComposition.C5i();
        if (EqO == null) {
            EqO = "";
        }
        C139406Sv c139406Sv = new C139406Sv(A0j, Anz, C5i, EqO, igShowreelComposition.Aqq().length());
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        C138746Qe c138746Qe2 = new C138746Qe(c006802i, c139406Sv, new C139416Sw(userSession));
        c138746Qe2.A08();
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A08 = C18U.A06(c06090Tz, userSession, 36312720127755490L);
        this.A03 = AbstractC25225BEi.A07(c06090Tz, userSession, 36594195104532115L);
        if (this.A08) {
            C006802i c006802i2 = C006802i.A0p;
            C14360o3.A07(c006802i2);
            this.A05 = new C138756Qf(c006802i2, c139406Sv);
        }
        c138746Qe2.A0H("prepare_render_start", null);
        String Aqq = igShowreelComposition.Aqq();
        C6V5 A00 = C6V4.A00(userSession);
        C139416Sw c139416Sw = new C139416Sw(userSession);
        boolean A06 = C18U.A06(c06090Tz, c139416Sw.A00, 36312720127558881L);
        C14360o3.A0B(Aqq, 0);
        Object obj = A00.A01.get(Aqq);
        boolean A1W = AbstractC167007dF.A1W(obj);
        c138746Qe2.A03();
        boolean A062 = C18U.A06(c06090Tz, userSession, 2342155729340794078L);
        if (obj != null) {
            A01 = new C25191Kx(obj);
        } else {
            A01 = C6V8.A01(Aqq, A062);
        }
        this.A01 = A01;
        if (A01 != null) {
            C2OD.A03(new C29078Cs5(c138746Qe2, interfaceC139386St, A00, c139416Sw, interfaceC62872tQ, this, Aqq, A1W, A06), A01, C6T2.A01);
        }
        interfaceC127355pE.CJk(c139406Sv);
        this.A04 = c138746Qe2;
        this.A06 = c139406Sv.A02;
    }

    @Override // X.InterfaceC31147Dmq
    public final C6QC getVideoView() {
        LithoView lithoView = this.A00;
        if (lithoView != null) {
            return (C6QC) lithoView.findViewWithTag("showreel_composition_video_view_tag");
        }
        return null;
    }

    @Override // X.InterfaceC115845Ly
    public final void reset() {
        this.A09.DQ8(0);
        ListenableFuture listenableFuture = this.A01;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
        this.A01 = null;
        LithoView lithoView = this.A00;
        if (lithoView != null) {
            lithoView.A0l(null, true);
        }
        this.A0B.removeView(this.A00);
        C138746Qe c138746Qe = this.A04;
        if (c138746Qe != null) {
            c138746Qe.A09();
        }
        this.A00 = null;
        this.A02 = null;
        this.A07 = null;
        this.A04 = null;
        this.A05 = null;
        this.A06 = null;
    }

    public C29370Cx3(Context context, ViewGroup viewGroup, InterfaceC127355pE interfaceC127355pE) {
        this.A0A = context;
        this.A0B = viewGroup;
        this.A09 = interfaceC127355pE;
    }

    @Override // X.InterfaceC115845Ly
    public final void E4S() {
        Iterator it = A00().iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).start();
        }
    }

    @Override // X.InterfaceC115845Ly
    public final void EKd() {
        Iterator it = A00().iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).resume();
        }
    }

    @Override // X.InterfaceC115845Ly
    public final boolean isPlaying() {
        java.util.Set A00 = A00();
        if (!(A00 instanceof Collection) || !A00.isEmpty()) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                if (((Animator) it.next()).isRunning()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC115845Ly
    public final void pause() {
        Iterator it = A00().iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).pause();
        }
    }

    @Override // X.InterfaceC115845Ly
    public final void stop() {
        Iterator it = A00().iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).end();
        }
    }
}
