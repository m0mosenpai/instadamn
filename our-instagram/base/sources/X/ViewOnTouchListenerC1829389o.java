package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

/* renamed from: X.89o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnTouchListenerC1829389o implements View.OnTouchListener, InterfaceC1829489p, InterfaceC1829589q, InterfaceC1829689r, InterfaceC1821886c, AnonymousClass851 {
    public int A00;
    public C1NJ A01;
    public C210399Se A02;
    public BE6 A03;
    public AbstractC172157lk A04;
    public AbstractC172157lk A05;
    public C202278x7 A06;
    public Integer A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final UserSession A0C;
    public final ImageUrl A0D;
    public final TouchInterceptorFrameLayout A0E;
    public final C1810981l A0F;
    public final C89F A0G;
    public final TargetViewSizeProvider A0H;
    public final A5P A0I;
    public final C1829289n A0J;
    public final AbstractC219819nT A0K;
    public final C1816283r A0L;
    public final EnumC209589Ot A0M;
    public final InteractiveDrawableContainer A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final Deque A0R;
    public final HashSet A0S;
    public final InterfaceC09390do A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final ViewStub A0X;
    public final A8A A0Y;
    public final C1814382v A0Z;
    public final ClipsCreationViewModel A0a;
    public final C23480Aat A0b;
    public final C1828989k A0c;
    public final boolean A0d;
    public volatile boolean A0e;
    public volatile boolean A0f;

    public final void A07(AbstractC172157lk abstractC172157lk) {
        C14360o3.A0B(abstractC172157lk, 0);
        Deque deque = this.A0R;
        if (!deque.contains(abstractC172157lk)) {
            throw new IllegalStateException("Check failed.");
        }
        while (!C14360o3.A0K(deque.peekLast(), abstractC172157lk)) {
            A01(true);
        }
        A03(this, abstractC172157lk);
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cud(Drawable drawable) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cuq() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cur() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cvp(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCJ(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCK(float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCL(Drawable drawable) {
    }

    @Override // X.InterfaceC1829689r
    public final /* synthetic */ void DHW(MotionEvent motionEvent, float f, float f2, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQa(Drawable drawable, int i, float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQk() {
    }

    @Override // X.InterfaceC1829489p
    public final void Din(Drawable drawable, float f, float f2, float f3, float f4) {
        C14360o3.A0B(drawable, 0);
        if (!this.A0d && drawable == this.A03) {
            A8A a8a = this.A0Y;
            C1828889j c1828889j = a8a.A00.A19;
            if (a8a.A02 && c1828889j != null) {
                C9K8 c9k8 = c1828889j.A05;
                c9k8.EQs(false);
                AbstractC125325le.A05(new View[]{c9k8.A0D}, false);
            }
            C47542KzA c47542KzA = a8a.A01;
            if (c47542KzA != null) {
                C150956qv.A08(new View[]{c47542KzA.A00.A0D}, false);
            }
            C1814382v c1814382v = this.A0Z;
            c1814382v.A00().CMN(false);
            c1814382v.A00().CN2();
            c1814382v.A00().CMP();
            c1814382v.A00().CMR();
        }
    }

    @Override // X.InterfaceC1829689r
    public final /* synthetic */ void Dir(float f, float f2, float f3, float f4, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dmm(Drawable drawable, float f, float f2, float f3, float f4, int i) {
    }

    @Override // X.InterfaceC1829589q
    public final void EJm() {
    }

    @Override // X.InterfaceC1821886c
    public final void onResume() {
        this.A0e = false;
        if (this.A09 || this.A0c.A01() == EnumC189548aZ.A06) {
            this.A0N.A0v(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Rect A00(BE6 be6) {
        Context context = this.A0N.getContext();
        C14360o3.A07(context);
        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) this.A0H).A0K;
        Drawable drawable = (Drawable) be6;
        return AbstractC23037ADt.A01(context, this.A07, drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight(), interfaceC1812882f.getWidth(), interfaceC1812882f.getHeight(), this.A0V);
    }

    private final AbstractC172157lk A01(boolean z) {
        AbstractC172157lk abstractC172157lk;
        while (true) {
            Deque deque = this.A0R;
            Object poll = deque.poll();
            C14360o3.A0A(poll);
            abstractC172157lk = (AbstractC172157lk) poll;
            deque.offer(abstractC172157lk);
            if (z) {
                break;
            }
            C1810981l c1810981l = this.A0F;
            if (A0G.A00(abstractC172157lk, (java.util.Set) c1810981l.A09.A00)) {
                C14360o3.A0B(abstractC172157lk, 0);
                if (!(abstractC172157lk instanceof C172147lj) || !c1810981l.A0V(C81W.A0l)) {
                    break;
                }
            }
        }
        return abstractC172157lk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x02a5, code lost:
    
        if (java.lang.Float.valueOf(r15) != null) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.ViewOnTouchListenerC1829389o r20, X.AbstractC172157lk r21) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC1829389o.A03(X.89o, X.7lk):void");
    }

    public static final void A04(ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o, boolean z) {
        EnumC209589Ot enumC209589Ot;
        AbstractC172157lk abstractC172157lk = viewOnTouchListenerC1829389o.A04;
        if (abstractC172157lk instanceof C172147lj) {
            C1816283r c1816283r = viewOnTouchListenerC1829389o.A0L;
            if (c1816283r != null) {
                enumC209589Ot = c1816283r.A02;
            } else {
                enumC209589Ot = null;
            }
            if (enumC209589Ot == EnumC209589Ot.A04 && viewOnTouchListenerC1829389o.A06 == null) {
                C23480Aat c23480Aat = viewOnTouchListenerC1829389o.A0b;
                C14360o3.A0B(abstractC172157lk, 0);
                AbstractC172157lk abstractC172157lk2 = c23480Aat.A04;
                if (abstractC172157lk2 != null && abstractC172157lk.equals(abstractC172157lk2) && !z) {
                    return;
                }
                if (c23480Aat.A02 != null && c23480Aat.A01 != null) {
                    InteractiveDrawableContainer interactiveDrawableContainer = c23480Aat.A0A;
                    C202278x7 A0L = interactiveDrawableContainer.A0L(c23480Aat.A00);
                    C22924A8u A00 = c23480Aat.A09.A00(new Rect(), abstractC172157lk, null, A0L, interactiveDrawableContainer.getWidth(), interactiveDrawableContainer.getHeight());
                    if (A00 == null) {
                        return;
                    }
                    C23480Aat.A01(c23480Aat, A00, abstractC172157lk, A0L);
                    return;
                }
                AbstractC12120kG.A07("ig_remix", "Camera initialization called before setting needed parameters", null);
            }
        }
    }

    public static final boolean A05(ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o) {
        if (!viewOnTouchListenerC1829389o.A0e) {
            if (viewOnTouchListenerC1829389o.A09 || viewOnTouchListenerC1829389o.A0c.A01() == EnumC189548aZ.A06) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void A06() {
        C1816283r c1816283r = this.A0L;
        if (c1816283r != null) {
            boolean A5x = c1816283r.A03.A5x();
            Context context = this.A0B;
            int i = 2131974491;
            if (A5x) {
                i = 2131974489;
            }
            String string = context.getString(i, c1816283r.A05.getUsername());
            C14360o3.A0A(string);
            C9GR.A09(context, string);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0134, code lost:
    
        if (java.lang.Float.valueOf(r12) != null) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(X.EnumC1829089l r27) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC1829389o.A08(X.89l):void");
    }

    @Override // X.InterfaceC1829589q
    public final boolean CLU() {
        if (this.A03 == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1829589q
    public final boolean CLZ(boolean z, boolean z2) {
        if (this.A03 == null) {
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass851
    public final void DJ2(float f, float f2) {
        InteractiveDrawableContainer interactiveDrawableContainer = this.A0N;
        boolean z = false;
        if (f < 0.01d) {
            z = true;
        }
        interactiveDrawableContainer.A0S = z;
    }

    @Override // X.InterfaceC1829489p
    public final void Dep(Drawable drawable, int i, boolean z) {
        if (this.A00 == i) {
            this.A03 = null;
        }
    }

    @Override // X.InterfaceC1829489p
    public final void Dmk(Drawable drawable, int i, float f, float f2) {
        if (i == this.A00 && !this.A0d && !this.A0U) {
            C1810981l c1810981l = this.A0F;
            if (!(c1810981l.A08.A00 instanceof C81V)) {
                AbstractC172157lk abstractC172157lk = this.A04;
                C14360o3.A0B(abstractC172157lk, 0);
                if (!(abstractC172157lk instanceof C172147lj) || !c1810981l.A0V(C81W.A0l)) {
                    if (this.A04 instanceof C171737l3) {
                        InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(this.A0C).A01;
                        if (!interfaceC19630xq.getBoolean("has_tapped_on_visual_reply_thumbnail", false)) {
                            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                            ARD.E77("has_tapped_on_visual_reply_thumbnail", true);
                            ARD.apply();
                        }
                    }
                    A03(this, A01(false));
                }
            }
        }
    }

    @Override // X.InterfaceC1829689r
    public final void Du2(float f, float f2) {
        BE6 be6 = this.A03;
        if (be6 != null) {
            be6.CMo(true);
        }
    }

    @Override // X.InterfaceC1829489p
    public final void DuD() {
        C202278x7 c202278x7;
        if (!this.A0d) {
            A8A a8a = this.A0Y;
            Object obj = this.A03;
            if (obj != null) {
                c202278x7 = this.A0N.A0M((Drawable) obj);
            } else {
                c202278x7 = null;
            }
            C81Z c81z = a8a.A00;
            C1828889j c1828889j = c81z.A19;
            if (a8a.A02 && c1828889j != null) {
                C9K8 c9k8 = c1828889j.A05;
                c9k8.EQs(true);
                AbstractC125325le.A05(new View[]{c9k8.A0D}, false);
            } else {
                C47542KzA c47542KzA = a8a.A01;
                if (c47542KzA != null) {
                    C150956qv.A08(new View[]{c47542KzA.A00.A0D}, false);
                } else if (c202278x7 != null) {
                    c81z.A23.A04.A0B(c202278x7);
                }
            }
            if (this.A09) {
                C1814382v c1814382v = this.A0Z;
                c1814382v.A00().EkU(false);
                c1814382v.A00().EkY();
                c1814382v.A00().Ekc();
                if (!this.A0I.A00.A1q.A00().isVisible()) {
                    c1814382v.A00().Elt();
                }
            }
        }
    }

    @Override // X.InterfaceC1829589q
    public final void EGp(Canvas canvas, int i, boolean z, boolean z2) {
        BE6 be6 = this.A03;
        if (be6 != null) {
            be6.CMo(false);
        }
    }

    @Override // X.InterfaceC1829589q
    public final boolean isVisible() {
        return this.A0W;
    }

    @Override // X.InterfaceC1821886c
    public final void onPause() {
        this.A0N.A0w(this);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        BE6 be6 = this.A03;
        if (be6 != null) {
            be6.CMo(true);
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A02(ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o, BE6 be6, AbstractC172157lk abstractC172157lk) {
        boolean z;
        String str;
        C38321qM c38321qM;
        if (A05(viewOnTouchListenerC1829389o)) {
            viewOnTouchListenerC1829389o.A0f = true;
            float f = 1.0f;
            if (!(viewOnTouchListenerC1829389o.A0F.A08.A00 instanceof C81V)) {
                if (abstractC172157lk instanceof C171737l3) {
                    f = ((C171737l3) abstractC172157lk).A00;
                } else if (!(abstractC172157lk instanceof C172147lj)) {
                    if (abstractC172157lk instanceof C171757l5) {
                        f = 0.0f;
                    } else {
                        AbstractC12120kG.A07("ig_remix", "Display mode when adding thumbnail is not THUMBNAIL", null);
                    }
                }
            }
            C1816283r c1816283r = viewOnTouchListenerC1829389o.A0L;
            if (c1816283r != null && (c38321qM = c1816283r.A03) != null) {
                z = c38321qM.Cff();
            } else {
                z = false;
            }
            C23108AGw c23108AGw = new C23108AGw();
            c23108AGw.A0A = C05F.A01;
            int i = -1;
            if (z) {
                i = -3;
            }
            c23108AGw.A05 = i;
            c23108AGw.A06 = new C221619qQ(viewOnTouchListenerC1829389o.A00(be6));
            c23108AGw.A00 = 1.5f * f;
            c23108AGw.A01 = 0.4f * f;
            c23108AGw.A0F = true;
            c23108AGw.A0Q = true;
            c23108AGw.A04 = f;
            c23108AGw.A0C = "VisualReplyThumbnailController";
            Context context = viewOnTouchListenerC1829389o.A0N.getContext();
            C14360o3.A07(context);
            if (c1816283r != null) {
                str = context.getString(2131974487, c1816283r.A05.getUsername());
            } else {
                str = null;
            }
            c23108AGw.A0D = str;
            c23108AGw.A0Q = false;
            c23108AGw.A0M = false;
            c23108AGw.A0J = false;
            c23108AGw.A0L = false;
            c23108AGw.A0K = false;
            AbstractC219819nT abstractC219819nT = viewOnTouchListenerC1829389o.A0K;
            if (abstractC219819nT instanceof C219809nS) {
                c23108AGw.A08 = (C219809nS) abstractC219819nT;
            }
            C8FC c8fc = new C8FC(c23108AGw);
            A5P a5p = viewOnTouchListenerC1829389o.A0I;
            viewOnTouchListenerC1829389o.A00 = ((C8NW) a5p.A00.A0d.A1h.get()).A0y((Drawable) be6, c8fc, null, abstractC219819nT.A03(viewOnTouchListenerC1829389o.A04, viewOnTouchListenerC1829389o.A0Q));
            if (!viewOnTouchListenerC1829389o.A0d && !viewOnTouchListenerC1829389o.A0U) {
                be6.APv();
            }
            C23480Aat c23480Aat = viewOnTouchListenerC1829389o.A0b;
            int i2 = viewOnTouchListenerC1829389o.A00;
            c23480Aat.A02 = be6;
            c23480Aat.A00 = i2;
            A04(viewOnTouchListenerC1829389o, false);
        }
    }

    @Override // X.InterfaceC1829689r
    public final /* synthetic */ boolean DJG(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        return false;
    }

    public ViewOnTouchListenerC1829389o(Context context, View view, AbstractC59962oe abstractC59962oe, UserSession userSession, ImageUrl imageUrl, TouchInterceptorFrameLayout touchInterceptorFrameLayout, C1810981l c1810981l, C89F c89f, TargetViewSizeProvider targetViewSizeProvider, A8A a8a, A5P a5p, C1814382v c1814382v, C1829289n c1829289n, C23480Aat c23480Aat, AbstractC219819nT abstractC219819nT, C1816283r c1816283r, InteractiveDrawableContainer interactiveDrawableContainer, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        InterfaceC09390do interfaceC09390do;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(abstractC59962oe, 3);
        C14360o3.A0B(c1814382v, 4);
        C14360o3.A0B(touchInterceptorFrameLayout, 5);
        C14360o3.A0B(targetViewSizeProvider, 6);
        C14360o3.A0B(c1810981l, 7);
        C14360o3.A0B(interactiveDrawableContainer, 8);
        C14360o3.A0B(c89f, 15);
        C14360o3.A0B(userSession, 18);
        this.A0B = context;
        this.A0Z = c1814382v;
        this.A0E = touchInterceptorFrameLayout;
        this.A0H = targetViewSizeProvider;
        this.A0F = c1810981l;
        this.A0N = interactiveDrawableContainer;
        this.A0K = abstractC219819nT;
        this.A0b = c23480Aat;
        this.A0J = c1829289n;
        this.A0D = imageUrl;
        this.A0Q = str;
        this.A08 = str2;
        this.A0G = c89f;
        this.A0I = a5p;
        this.A0C = userSession;
        this.A0Y = a8a;
        this.A0L = c1816283r;
        this.A0O = str4;
        this.A0d = z;
        this.A0U = z2;
        this.A0S = new HashSet();
        EnumC209589Ot enumC209589Ot = c1816283r != null ? c1816283r.A02 : null;
        this.A0M = enumC209589Ot;
        View findViewById = view.findViewById(R.id.camera_preview_blur_overlay_stub);
        C14360o3.A07(findViewById);
        this.A0X = (ViewStub) findViewById;
        this.A0T = C1XM.A00(new C206959Ea(this, 0));
        c1810981l.A0I(new C23639AdY(this));
        if (abstractC219819nT instanceof C219809nS) {
            interfaceC09390do = ((C219809nS) abstractC219819nT).A0F;
        } else {
            interfaceC09390do = ((C219799nR) abstractC219819nT).A03;
        }
        this.A0R = new LinkedList(AbstractC009903n.A0J((AbstractC172157lk[]) interfaceC09390do.getValue()));
        this.A04 = A01(false);
        this.A0P = str3;
        this.A0V = AbstractC13620mo.A02(view.getContext());
        touchInterceptorFrameLayout.COs(this);
        interactiveDrawableContainer.A0T = true;
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        C1828989k c1828989k = (C1828989k) new C52942bb(requireActivity).A00(C1828989k.class);
        this.A0c = c1828989k;
        EnumC1829089l enumC1829089l = EnumC1829089l.A02;
        C2GS c2gs = c1828989k.A06;
        c2gs.A0B(enumC1829089l);
        c1828989k.A00 = c1816283r;
        this.A07 = AbstractC22791A3j.A00.A00(enumC209589Ot, this.A04);
        c2gs.A06(abstractC59962oe, new AUL(this));
        AbstractC58232lf.A00(AnonymousClass191.A00, c1828989k.A02).A06(abstractC59962oe, new AUM(this));
        this.A0a = (ClipsCreationViewModel) new C52942bb(new AnonymousClass846(userSession, requireActivity), requireActivity).A00(ClipsCreationViewModel.class);
        this.A0W = true;
    }
}
