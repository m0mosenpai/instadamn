package X;

import android.animation.Animator;
import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.facebook.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreel.IgShowreelComposition;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public class BFR implements InterfaceC31147Dmq {
    public float A00;
    public int A01;
    public C138746Qe A02;
    public C138756Qf A03;
    public IgShowreelComposition A04;
    public String A05;
    public boolean A06;
    public final BFS A07;
    public final InterfaceC127355pE A08;
    public final Context A09;
    public final C126545np A0A;
    public final C130015u6 A0B;

    @Override // X.InterfaceC31147Dmq
    public final void EeL(UserSession userSession, IgShowreelComposition igShowreelComposition, InterfaceC138736Qd interfaceC138736Qd, InterfaceC62872tQ interfaceC62872tQ, InterfaceC139386St interfaceC139386St, AbstractC27447C9p abstractC27447C9p, C6FG c6fg) {
        IgShowreelComposition igShowreelComposition2;
        if (CXh() && (igShowreelComposition2 = this.A04) != null && igShowreelComposition2.equals(igShowreelComposition)) {
            interfaceC139386St.onSuccess();
            return;
        }
        ListenableFuture listenableFuture = this.A07.A00;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
        this.A04 = igShowreelComposition;
        InterfaceC127355pE interfaceC127355pE = this.A08;
        interfaceC127355pE.DQ8(1);
        C139406Sv A00 = AbstractC139396Su.A00(interfaceC138736Qd, igShowreelComposition);
        C138746Qe A002 = A00(A00, userSession, this);
        A02(new SparseArray(), A002, interfaceC139386St, interfaceC62872tQ, userSession, igShowreelComposition, AbstractC06930Yk.A0E());
        interfaceC127355pE.CJk(A00);
        this.A02 = A002;
        this.A05 = A00.A02;
    }

    public static C138746Qe A00(C139406Sv c139406Sv, UserSession userSession, BFR bfr) {
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        C138746Qe c138746Qe = new C138746Qe(c006802i, c139406Sv, new C139416Sw(userSession));
        c138746Qe.A08();
        C06090Tz c06090Tz = C06090Tz.A05;
        bfr.A06 = C18U.A06(c06090Tz, userSession, 36312720127755490L);
        bfr.A01 = (int) C18U.A01(c06090Tz, userSession, 36594195104532115L);
        if (bfr.A06) {
            C006802i c006802i2 = C006802i.A0p;
            C14360o3.A07(c006802i2);
            bfr.A03 = new C138756Qf(c006802i2, c139406Sv);
        }
        return c138746Qe;
    }

    private final java.util.Set A01() {
        C6FG A02;
        C6T7 c6t7 = this.A07.A01;
        if (c6t7 != null && (A02 = c6t7.A02()) != null) {
            HashSet hashSet = new HashSet(((AbstractMap) A02.A00(R.id.bk_context_key_animations)).values());
            C14360o3.A0A(hashSet);
            return hashSet;
        }
        return C16910sj.A00;
    }

    public final void A02(final SparseArray sparseArray, final C138746Qe c138746Qe, final InterfaceC139386St interfaceC139386St, final InterfaceC62872tQ interfaceC62872tQ, UserSession userSession, IgShowreelComposition igShowreelComposition, final Map map) {
        ListenableFuture A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 2342155729340794078L);
        final BFS bfs = this.A07;
        final Context context = this.A09;
        final String Aqq = igShowreelComposition.Aqq();
        final InterfaceC139386St interfaceC139386St2 = new InterfaceC139386St() { // from class: X.6Sy
            @Override // X.InterfaceC139386St
            public final void onFailure(Throwable th) {
                if (th instanceof CancellationException) {
                    c138746Qe.A07();
                    return;
                }
                this.A08.DQ8(3);
                C138746Qe c138746Qe2 = c138746Qe;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                c138746Qe2.A0F(message);
                interfaceC139386St.onFailure(th);
            }

            @Override // X.InterfaceC139386St
            public final void onSuccess() {
                this.A08.DQ8(2);
                interfaceC139386St.onSuccess();
            }
        };
        C14360o3.A0B(Aqq, 5);
        c138746Qe.A0H("prepare_render_start", null);
        final C6V5 A00 = C6V4.A00(userSession);
        final C139416Sw c139416Sw = new C139416Sw(userSession);
        final boolean A062 = C18U.A06(c06090Tz, c139416Sw.A00, 36312720127558881L);
        Object obj = A00.A01.get(Aqq);
        final boolean A1W = AbstractC167007dF.A1W(obj);
        c138746Qe.A03();
        if (obj != null) {
            A01 = new C25191Kx(obj);
        } else {
            A01 = C6V8.A01(Aqq, A06);
        }
        bfs.A00 = A01;
        C2OD.A03(new C2JL() { // from class: X.6T1
            @Override // X.C2JL
            public final void onFailure(Throwable th) {
                C14360o3.A0B(th, 0);
                C6V5 c6v5 = A00;
                c6v5.A01.remove(Aqq);
                C138746Qe c138746Qe2 = c138746Qe;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                c138746Qe2.A0C(message);
                String message2 = th.getMessage();
                if (message2 == null) {
                    message2 = "";
                }
                c138746Qe2.A0E(message2);
                String message3 = th.getMessage();
                if (message3 == null) {
                    message3 = "";
                }
                c138746Qe2.A0B(message3);
                interfaceC139386St2.onFailure(th);
            }

            @Override // X.C2JL
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj2) {
                C1338462s c1338462s = (C1338462s) obj2;
                final C138746Qe c138746Qe2 = c138746Qe;
                if (c1338462s == null) {
                    c138746Qe2.A0B("result is null");
                    c138746Qe2.A0C("result is null");
                } else {
                    c138746Qe2.A0J(A1W);
                }
                if (!A062) {
                    C6V5 c6v5 = A00;
                    c6v5.A01.remove(Aqq);
                }
                c138746Qe2.A04();
                try {
                    final BFS bfs2 = bfs;
                    C1338462s c1338462s2 = bfs2.A02;
                    if (c1338462s != c1338462s2) {
                        C6T7 c6t7 = bfs2.A01;
                        if (c6t7 != null) {
                            c6t7.A05();
                        }
                        bfs2.A01 = null;
                        bfs2.A02 = c1338462s;
                        c1338462s2 = c1338462s;
                    }
                    if (bfs2.A01 == null && c1338462s2 != null) {
                        SparseArray clone = sparseArray.clone();
                        clone.put(R.id.showreel_config_provider, c139416Sw);
                        clone.put(R.id.showreel_logger, c138746Qe2);
                        C6T8 c6t8 = new C6T8(context, c1338462s2, interfaceC62872tQ);
                        c6t8.A01 = map;
                        c6t8.A00 = clone;
                        C6T7 A002 = c6t8.A00();
                        bfs2.A01 = A002;
                        A002.A07(bfs2.A03);
                    }
                    c138746Qe2.A05();
                    ViewTreeObserver viewTreeObserver = bfs2.A03.getViewTreeObserver();
                    final boolean z = A1W;
                    viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.6T3
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            C126545np c126545np = bfs2.A03;
                            c126545np.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            C28191Cbf c28191Cbf = BFS.A04;
                            LinkedHashSet A012 = c28191Cbf.A01(c126545np, 14);
                            LinkedHashSet A013 = c28191Cbf.A01(c126545np, 15);
                            C138746Qe c138746Qe3 = c138746Qe2;
                            c138746Qe3.A00 = A012.size() + A013.size();
                            C138746Qe.A02(c138746Qe3, "media_amount_determined");
                            c138746Qe3.A0I(z);
                            c138746Qe3.A06();
                        }
                    });
                    interfaceC139386St2.onSuccess();
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    C0w9.A06("IgShowreelCompositionComponentProvider#onBloksLayoutBinding", message, e);
                    c138746Qe2.A0D(message);
                    c138746Qe2.A0E(message);
                    c138746Qe2.A0B(message);
                    interfaceC139386St2.onFailure(e);
                }
            }
        }, A01, C6T2.A01);
    }

    @Override // X.InterfaceC115845Ly
    public final boolean CXh() {
        BFS bfs = this.A07;
        if (bfs.A02 != null && bfs.A01 != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC31147Dmq
    public final void CmZ(C139336So c139336So) {
        this.A0B.A00(c139336So.A00);
    }

    @Override // X.InterfaceC31147Dmq
    public final void Dzk() {
        C138746Qe c138746Qe = this.A02;
        if (c138746Qe != null) {
            c138746Qe.A0A();
        }
    }

    @Override // X.InterfaceC31147Dmq
    public final void Dzl() {
        C138746Qe c138746Qe = this.A02;
        if (c138746Qe != null) {
            c138746Qe.A0H("video_play_request_start", null);
        }
    }

    @Override // X.InterfaceC31147Dmq
    public final void Dzm() {
        C138746Qe c138746Qe = this.A02;
        if (c138746Qe != null) {
            c138746Qe.A0H("video_play_request_success", null);
        }
    }

    @Override // X.InterfaceC115845Ly
    public final void E0c() {
        C138756Qf c138756Qf;
        C138746Qe c138746Qe = this.A02;
        if (c138746Qe != null) {
            c138746Qe.A08();
        }
        String str = this.A05;
        if (str != null) {
            C138746Qe c138746Qe2 = this.A02;
            if (c138746Qe2 != null) {
                c138746Qe2.A0H("fully_enter_viewport", str);
            }
            this.A0B.Chv(C6P9.A01(C05F.A01, str));
        }
        if (this.A06 && (c138756Qf = this.A03) != null) {
            C126545np c126545np = this.A0A;
            int i = this.A01;
            WG4.A01(this.A09, c126545np, c138756Qf, AbstractC166987dD.A1G(), this.A00, i);
        }
    }

    @Override // X.InterfaceC115845Ly
    public final void E0l() {
        C138746Qe c138746Qe = this.A02;
        if (c138746Qe != null) {
            c138746Qe.A09();
        }
        this.A0B.Chv(C6P9.A00(C05F.A01));
    }

    @Override // X.InterfaceC115845Ly
    public final void E0o() {
        C138746Qe c138746Qe = this.A02;
        if (c138746Qe != null) {
            c138746Qe.A08();
        }
        String str = this.A05;
        if (str != null) {
            C138746Qe c138746Qe2 = this.A02;
            if (c138746Qe2 != null) {
                c138746Qe2.A0H("partially_enter_viewport", str);
            }
            this.A0B.Chv(C6P9.A02(C05F.A01, str));
        }
    }

    @Override // X.InterfaceC31147Dmq
    public final C6QC getVideoView() {
        return (C6QC) this.A0A.findViewWithTag("showreel_composition_video_view_tag");
    }

    @Override // X.InterfaceC115845Ly
    public void reset() {
        this.A08.DQ8(0);
        this.A04 = null;
        BFS bfs = this.A07;
        ListenableFuture listenableFuture = bfs.A00;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
        C6T7 c6t7 = bfs.A01;
        if (c6t7 != null) {
            c6t7.A04();
            bfs.A01 = null;
            bfs.A02 = null;
        }
        C138746Qe c138746Qe = this.A02;
        if (c138746Qe != null) {
            c138746Qe.A09();
        }
        this.A02 = null;
        this.A03 = null;
        this.A05 = null;
    }

    public BFR(Context context, ViewGroup viewGroup, InterfaceC127355pE interfaceC127355pE) {
        this.A09 = context;
        this.A08 = interfaceC127355pE;
        C126545np c126545np = new C126545np(context);
        this.A0A = c126545np;
        this.A0B = new C130015u6();
        viewGroup.addView(c126545np, new FrameLayout.LayoutParams(-1, -1, 17));
        this.A07 = new BFS(c126545np);
    }

    @Override // X.InterfaceC115845Ly
    public final void E4S() {
        Iterator it = A01().iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).start();
        }
    }

    @Override // X.InterfaceC115845Ly
    public final void EKd() {
        Iterator it = A01().iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).resume();
        }
    }

    @Override // X.InterfaceC115845Ly
    public final boolean isPlaying() {
        java.util.Set A01 = A01();
        if (!(A01 instanceof Collection) || !A01.isEmpty()) {
            Iterator it = A01.iterator();
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
        Iterator it = A01().iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).pause();
        }
    }

    @Override // X.InterfaceC115845Ly
    public final void stop() {
        Iterator it = A01().iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).end();
        }
    }
}
