package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.V4r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnKeyListenerC67976V4r extends AbstractC60592pi implements InterfaceC60442pS, XDJ, View.OnKeyListener {
    public static final C55942hf A0a = C55942hf.A04(40.0d, 10.0d);
    public static final String __redex_internal_original_name = "CanvasController";
    public View A00;
    public RecyclerView A01;
    public UHS A02;
    public C67970V4j A03;
    public Wk6 A04;
    public UHI A05;
    public ViewOnKeyListenerC67971V4l A06;
    public TouchInterceptorFrameLayout A07;
    public C1NI A08;
    public Integer A09;
    public boolean A0A;
    public boolean A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final Context A0F;
    public final C60462pV A0G;
    public final C70419WUx A0H;
    public final C67882V0n A0I;
    public final C67882V0n A0J;
    public final C145936hq A0K;
    public final C69217Vjk A0L;
    public final C66425UGy A0M;
    public final C68730Vb9 A0N;
    public final UserSession A0O;
    public final C5H9 A0P;
    public final C38321qM A0Q;
    public final InterfaceC125355lh A0R;
    public final List A0S;
    public final InterfaceC09390do A0T;
    public final boolean A0U;
    public final ViewOnKeyListenerC67975V4q A0V;
    public final InterfaceC150976qx A0W;
    public final InterfaceC143526dr A0X;
    public final String A0Y;
    public final boolean A0Z;

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        this.A07 = (TouchInterceptorFrameLayout) view.requireViewById(R.id.layout_container_main);
        this.A00 = view.requireViewById(R.id.canvas_container);
        C70419WUx c70419WUx = this.A0H;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A07;
        if (touchInterceptorFrameLayout == null) {
            C14360o3.A0F("rootView");
            throw C00O.createAndThrow();
        }
        touchInterceptorFrameLayout.A00(new WO5(c70419WUx, 4), new WO5(c70419WUx, 5));
        if (this.A0A) {
            this.A0G.A0C((View) this.A0T.getValue());
        }
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    public static final void A00(ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r) {
        String str;
        if (viewOnKeyListenerC67976V4r.A0A && viewOnKeyListenerC67976V4r.A0B && viewOnKeyListenerC67976V4r.A09 == C05F.A00) {
            ViewOnKeyListenerC67971V4l viewOnKeyListenerC67971V4l = viewOnKeyListenerC67976V4r.A06;
            if (viewOnKeyListenerC67971V4l == null) {
                str = "videoModule";
            } else {
                viewOnKeyListenerC67971V4l.A03.sendEmptyMessage(0);
                RecyclerView recyclerView = viewOnKeyListenerC67976V4r.A01;
                if (recyclerView != null) {
                    UHI uhi = viewOnKeyListenerC67976V4r.A05;
                    if (uhi == null) {
                        str = "viewableHelper";
                    } else {
                        uhi.onScrolled(recyclerView, 0, 0);
                        return;
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public static final void A01(ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r, float f, float f2) {
        viewOnKeyListenerC67976V4r.A09 = C05F.A0C;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = viewOnKeyListenerC67976V4r.A07;
        if (touchInterceptorFrameLayout == null) {
            C14360o3.A0F("rootView");
            throw C00O.createAndThrow();
        }
        AbstractC125325le A0E = AbstractC125325le.A00(touchInterceptorFrameLayout).A0A().A0E(A0a);
        A0E.A05 = viewOnKeyListenerC67976V4r.A0R;
        A0E.A06 = viewOnKeyListenerC67976V4r.A0W;
        A0E.A07 = viewOnKeyListenerC67976V4r.A0X;
        float f3 = viewOnKeyListenerC67976V4r.A0E;
        A0E.A0T(0.0f, f3);
        A0E.A00 = f / f3;
        A0E.A0B(f2 / f3).A0H();
    }

    public static final void A02(ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r, float f, float f2) {
        viewOnKeyListenerC67976V4r.A09 = C05F.A01;
        View view = viewOnKeyListenerC67976V4r.A00;
        if (view == null) {
            C14360o3.A0F("canvasContainer");
            throw C00O.createAndThrow();
        }
        AbstractC125325le A0E = AbstractC125325le.A00(view).A0A().A0E(A0a);
        A0E.A05 = viewOnKeyListenerC67976V4r.A0R;
        A0E.A06 = viewOnKeyListenerC67976V4r.A0W;
        A0E.A07 = viewOnKeyListenerC67976V4r.A0X;
        float f3 = viewOnKeyListenerC67976V4r.A0E;
        A0E.A0T(f3, 0.0f);
        A0E.A00 = (f3 - f) / f3;
        A0E.A0B(f2 / f3).A0H();
    }

    public final void A03() {
        Wk6 wk6;
        double d;
        String str;
        if (this.A0A) {
            View view = this.A00;
            if (view == null) {
                str = "canvasContainer";
            } else {
                view.setVisibility(8);
                InterfaceC09390do interfaceC09390do = this.A0T;
                if (((View) interfaceC09390do.getValue()).getParent() != null) {
                    AbstractC124845kp.A01((View) interfaceC09390do.getValue()).removeView((View) interfaceC09390do.getValue());
                }
                ViewOnKeyListenerC67971V4l viewOnKeyListenerC67971V4l = this.A06;
                if (viewOnKeyListenerC67971V4l != null) {
                    viewOnKeyListenerC67971V4l.onPause();
                    this.A0A = false;
                    Iterator A16 = AbstractC166997dE.A16(this.A0K.A03);
                    while (A16.hasNext()) {
                        InterfaceC59502nt interfaceC59502nt = (InterfaceC59502nt) A16.next();
                        DLog.d(DLogTag.CANVAS.INSTANCE, AnonymousClass001.A0R("Cancel ", VS4.A00(interfaceC59502nt.Ba1())), new Object[0]);
                        interfaceC59502nt.AGO();
                    }
                    long j = 0;
                    if (this.A0U) {
                        ViewOnKeyListenerC67975V4q viewOnKeyListenerC67975V4q = this.A0V;
                        if (viewOnKeyListenerC67975V4q != null) {
                            viewOnKeyListenerC67975V4q.onPause();
                            j = viewOnKeyListenerC67975V4q.A01;
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    if (this.A08 != null && (wk6 = this.A04) != null) {
                        C67970V4j c67970V4j = this.A03;
                        if (c67970V4j == null) {
                            str = "analyticsHelper";
                        } else {
                            C38321qM c38321qM = this.A0Q;
                            ViewOnKeyListenerC67971V4l viewOnKeyListenerC67971V4l2 = this.A06;
                            if (viewOnKeyListenerC67971V4l2 != null) {
                                boolean z = viewOnKeyListenerC67971V4l2.A06.A04;
                                C67970V4j.A00(c67970V4j);
                                String str2 = wk6.A00;
                                Map map = c67970V4j.A07;
                                InterfaceC60442pS interfaceC60442pS = c67970V4j.A04;
                                long j2 = c67970V4j.A01;
                                int i = c67970V4j.A00;
                                Map map2 = c67970V4j.A06;
                                boolean z2 = c67970V4j.A08;
                                UserSession userSession = c67970V4j.A03;
                                AbstractC37302Gc3.A1U(map, interfaceC60442pS);
                                AbstractC25229BEm.A1J(map2, 7, userSession);
                                if (c38321qM != null) {
                                    C12210kP c12210kP = new C12210kP(userSession);
                                    c12210kP.A00 = interfaceC60442pS;
                                    C18920wW A00 = c12210kP.A00();
                                    InterfaceC02590Ai A002 = A00.A00(A00.A00, "instagram_ad_canvas_exit");
                                    if (A002.isSampled()) {
                                        A002.A9K("a_pk", Long.valueOf(AbstractC128985sJ.A00(userSession, c38321qM)));
                                        A002.A7v("audio_enabled", Boolean.valueOf(z));
                                        A002.AAP("document_id", str2);
                                        A002.AAP("follow_status", AbstractC128985sJ.A06(userSession, c38321qM));
                                        A002.AAP("m_pk", AbstractC128985sJ.A09(c38321qM));
                                        A002.A9K("m_t", Long.valueOf(c38321qM.BRp().A00));
                                        A002.AAP(AbstractC111324zv.A00(5390), interfaceC60442pS.getModuleName());
                                        A002.A8I(AbstractC111324zv.A00(3243), Double.valueOf(j2));
                                        if (z2) {
                                            d = 1.0d;
                                        } else {
                                            d = 0.0d;
                                        }
                                        Collection values = map.values();
                                        C14360o3.A0B(values, 0);
                                        Iterator it = values.iterator();
                                        float f = 0.0f;
                                        while (it.hasNext()) {
                                            f += ((Number) it.next()).floatValue();
                                        }
                                        A002.A8I(AbstractC111324zv.A00(838), Double.valueOf((d + f) / i));
                                        A002.AAP("tracking_token", AbstractC128985sJ.A07(userSession, c38321qM, interfaceC60442pS));
                                        ArrayList A0k = MSY.A0k(map2);
                                        Iterator A15 = AbstractC166997dE.A15(map2);
                                        while (A15.hasNext()) {
                                            AbstractC166997dE.A1R(((Map.Entry) A15.next()).getKey(), Double.valueOf(AbstractC43593JPy.A04(r0)), A0k);
                                        }
                                        A002.A9M("element_timespent", AbstractC06930Yk.A08(A0k));
                                        A002.A9K("ad_id", AbstractC128985sJ.A01(userSession, c38321qM));
                                        A002.A8I("cover_media_timespent", Double.valueOf(j));
                                        A002.A9K("m_ts", Long.valueOf(c38321qM.A1B()));
                                        A002.A9K(AbstractC111324zv.A00(1345), AbstractC128985sJ.A02(userSession, c38321qM));
                                        A002.AAP("action", AbstractC128985sJ.A08(c38321qM));
                                        A002.AAP("inventory_source", c38321qM.A0C.BJN());
                                        A002.A7v(AbstractC111324zv.A00(1042), c38321qM.A0C.CTu());
                                        A002.A8I(AbstractC111324zv.A00(401), Double.valueOf(-1.0d));
                                        A002.A7v(AbstractC111324zv.A00(451), false);
                                        A002.AAP(AbstractC111324zv.A00(411), c38321qM.A0R);
                                        AbstractC25233BEq.A17(A002, AbstractC111324zv.A00(204), AbstractC77343dK.A00(c38321qM.A0e));
                                        A002.Cht();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                C14360o3.A0F("videoModule");
                throw C00O.createAndThrow();
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.XDJ
    public final void DBu(C70419WUx c70419WUx, float f) {
        View view = this.A00;
        if (view != null) {
            view.setTranslationY(f);
            InterfaceC150976qx interfaceC150976qx = this.A0W;
            View view2 = this.A00;
            if (view2 != null) {
                interfaceC150976qx.Dbl(AbstractC125325le.A00(view2), f / this.A0E);
                return;
            }
        }
        C14360o3.A0F("canvasContainer");
        throw C00O.createAndThrow();
    }

    @Override // X.XDJ
    public final void DC1(C70419WUx c70419WUx, float f, float f2) {
        C67882V0n c67882V0n;
        float f3 = this.A0E / 2.0f;
        if ((f2 > 0.0f || f3 < f) && (c67882V0n = this.A0J) != null) {
            if (this.A0I.A08) {
                c67882V0n.A02();
                return;
            } else {
                A01(this, f, f2);
                return;
            }
        }
        A02(this, f, f2);
    }

    @Override // X.XDJ
    public final boolean DC8(C70419WUx c70419WUx, float f, int i) {
        View view;
        if (this.A0A) {
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0D;
                if (i == 2 && linearLayoutManager != null && linearLayoutManager.A1a() == 0) {
                    RecyclerView recyclerView2 = this.A01;
                    if (recyclerView2 != null) {
                        int top = recyclerView2.getChildAt(0).getTop();
                        RecyclerView recyclerView3 = this.A01;
                        if (recyclerView3 != null) {
                            if (top - recyclerView3.getPaddingTop() == 0 && (view = this.A00) != null) {
                                C55942hf c55942hf = C150956qv.A02;
                                if (!AbstractC125325le.A01(view, 0).A0W()) {
                                    this.A09 = C05F.A0C;
                                    View view2 = this.A00;
                                    if (view2 == null) {
                                        C14360o3.A0F("canvasContainer");
                                        throw C00O.createAndThrow();
                                    }
                                    AbstractC125325le.A01(view2, 0).A0T(0.0f, this.A0E);
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0Y;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return this.A0Z;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onCreate() {
        if (this.A0A) {
            this.A0G.A01();
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        if (this.A0A) {
            this.A0G.A02();
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        if (this.A0A) {
            this.A0H.A03 = true;
            this.A0G.A03();
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        if (this.A0A) {
            if (this.A09 != C05F.A00) {
                View view = this.A00;
                if (view == null) {
                    C14360o3.A0F("canvasContainer");
                    throw C00O.createAndThrow();
                }
                AbstractC125325le.A00(view).A0G();
            }
            this.A0G.A04();
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        if (this.A0A) {
            this.A0G.A05();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.Vb9, java.lang.Object] */
    public ViewOnKeyListenerC67976V4r(C67882V0n c67882V0n, C67882V0n c67882V0n2, C145936hq c145936hq, ViewOnKeyListenerC67975V4q viewOnKeyListenerC67975V4q, C5H9 c5h9, C38321qM c38321qM, String str, List list, int i, int i2, boolean z, boolean z2) {
        String str2;
        this.A0I = c67882V0n;
        this.A0Z = z;
        this.A0J = c67882V0n2;
        this.A0P = c5h9;
        this.A0S = list;
        this.A0U = z2;
        this.A0V = viewOnKeyListenerC67975V4q;
        this.A0C = i;
        this.A0Q = c38321qM;
        this.A0D = i2;
        Context requireContext = c67882V0n.requireContext();
        this.A0F = requireContext;
        this.A0G = new C60462pV();
        C66425UGy c66425UGy = new C66425UGy(requireContext, this, new C68962Vf0(), this);
        this.A0M = c66425UGy;
        this.A0K = c145936hq;
        this.A0R = new C71037Wms(this, 3);
        this.A0W = new C71041Wmw(this, 1);
        this.A0X = new C71048Wn3(this, 0);
        if (str != null && str.length() != 0) {
            str2 = AnonymousClass001.A0R("canvas_", str);
        } else {
            str2 = "canvas";
        }
        this.A0Y = str2;
        this.A0E = AbstractC13880nE.A09(requireContext);
        ?? obj = new Object();
        this.A0N = obj;
        this.A0L = new C69217Vjk(requireContext, this, c66425UGy, obj);
        this.A09 = C05F.A00;
        this.A0H = new C70419WUx(requireContext);
        this.A0O = C023409i.A0A.A06(c67882V0n.requireArguments());
        this.A0T = AbstractC09440dt.A01(new X32(this, 29));
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        AbstractC167017dG.A1O(view, keyEvent);
        if (this.A0A) {
            ViewOnKeyListenerC67971V4l viewOnKeyListenerC67971V4l = this.A06;
            if (viewOnKeyListenerC67971V4l == null) {
                C14360o3.A0F("videoModule");
                throw C00O.createAndThrow();
            }
            if (viewOnKeyListenerC67971V4l.onKey(view, i, keyEvent)) {
                return true;
            }
        }
        return false;
    }
}
