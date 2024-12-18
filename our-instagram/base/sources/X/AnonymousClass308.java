package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.308, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass308 extends AbstractC60592pi implements AnonymousClass309, InterfaceC60072op, View.OnTouchListener, InterfaceC61782rf, InterfaceC11480j6, C30A, C30B, InterfaceC11390ix {
    public static final C55942hf A0j = C55942hf.A04(60.0d, 5.0d);
    public static final String __redex_internal_original_name = "PeekMediaController";
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public InterfaceC56002hn A07;
    public IC2 A08;
    public C140366Wq A09;
    public InterfaceC156276zx A0A;
    public InterfaceC101554hQ A0B;
    public Integer A0C;
    public Runnable A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public C38321qM A0I;
    public String A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final Activity A0O;
    public final Context A0P;
    public final Handler A0Q;
    public final Fragment A0R;
    public final C55982hj A0S;
    public final UserSession A0T;
    public final InterfaceC114705Ga A0U;
    public final C30C A0V;
    public final C668430b A0W;
    public final InterfaceC60442pS A0X;
    public final InterfaceC65232xL A0Y;
    public final C30E A0Z;
    public final C1M1 A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final int[] A0e;
    public final C668630d A0f;
    public final C60752pz A0g;
    public final ViewOnTouchListenerC668930g A0h;
    public final Map A0i;

    public AnonymousClass308(Activity activity, Fragment fragment, AbstractC10360h2 abstractC10360h2, UserSession userSession, InterfaceC114705Ga interfaceC114705Ga, InterfaceC60442pS interfaceC60442pS, InterfaceC65232xL interfaceC65232xL, C1M1 c1m1, boolean z, boolean z2, boolean z3) {
        String str;
        C14360o3.A0B(userSession, 5);
        this.A0O = activity;
        this.A0R = fragment;
        this.A0d = z;
        this.A0T = userSession;
        this.A0X = interfaceC60442pS;
        this.A0a = c1m1;
        this.A0c = z2;
        this.A0U = interfaceC114705Ga;
        this.A0b = z3;
        this.A0V = new C30C(activity);
        Context requireContext = fragment.requireContext();
        this.A0P = requireContext;
        this.A0Y = interfaceC65232xL;
        this.A0Q = new Handler();
        this.A0N = AbstractC56402iY.A01(activity);
        this.A0M = C30D.A00;
        this.A0e = new int[2];
        C60752pz c60752pz = new C60752pz();
        this.A0g = c60752pz;
        if (c60752pz.A00 == null) {
            c60752pz.A00 = "peek_media";
        }
        Resources resources = activity.getResources();
        this.A0K = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A0L = resources.getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
        if (c1m1 != null) {
            str = c1m1.getSessionId();
        } else {
            str = null;
        }
        C30E c30e = new C30E(activity, fragment, userSession, interfaceC60442pS, null, str == null ? "" : str, true, true, false, true, false);
        this.A0Z = c30e;
        c30e.A0P.add(this);
        c30e.A08 = true;
        this.A0W = new C668430b(abstractC10360h2, userSession, new C64352vu(userSession, new C30U(userSession, c1m1), this, false), this, interfaceC60442pS, this, c1m1);
        this.A0C = C05F.A00;
        this.A0i = new HashMap();
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A09(A0j);
        this.A0S = A02;
        this.A0f = new C668630d() { // from class: X.30c
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                C14360o3.A0B(c55982hj, 0);
                float f = (float) c55982hj.A09.A00;
                C140366Wq c140366Wq = AnonymousClass308.this.A09;
                if (c140366Wq != null) {
                    c140366Wq.A00.setScaleX(f);
                    c140366Wq.A00.setScaleY(f);
                    ImageView imageView = c140366Wq.A06;
                    imageView.setScaleX(f);
                    imageView.setScaleY(f);
                }
            }

            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnk(C55982hj c55982hj) {
                AnonymousClass308 anonymousClass308 = AnonymousClass308.this;
                C140366Wq c140366Wq = anonymousClass308.A09;
                if (c140366Wq != null) {
                    View view = c140366Wq.A00;
                    if (anonymousClass308.A0C == C05F.A0Y) {
                        AnonymousClass308.A00(anonymousClass308);
                        return;
                    } else {
                        anonymousClass308.A0Q.postDelayed(new RunnableC24468Asn(view), 1000L);
                        return;
                    }
                }
                throw new IllegalStateException("Required value was null.");
            }
        };
        ViewOnTouchListenerC668930g viewOnTouchListenerC668930g = new ViewOnTouchListenerC668930g(requireContext, userSession, new C668730e(this));
        this.A0h = viewOnTouchListenerC668930g;
        viewOnTouchListenerC668930g.A0D = false;
        viewOnTouchListenerC668930g.A01 = 0L;
        viewOnTouchListenerC668930g.A04.A09(C55942hf.A03(10.0d, 20.0d));
        viewOnTouchListenerC668930g.A05.A09(C55942hf.A03(8.0d, 12.0d));
    }

    public static final void A02(AnonymousClass308 anonymousClass308, EnumC75193Zm enumC75193Zm) {
        int i;
        A03(anonymousClass308, enumC75193Zm, true);
        boolean z = C72213Lu.A00(anonymousClass308.A0T).A01;
        Context context = anonymousClass308.A0P;
        if (z) {
            i = 2131972411;
        } else {
            i = 2131972409;
        }
        C9GR.A01(context, null, i, 1);
    }

    @Override // X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A0i;
        C75113Zb c75113Zb = (C75113Zb) map.get(c38321qM.getId());
        if (c75113Zb == null) {
            c75113Zb = new C75113Zb(c38321qM.A0p(), c38321qM.A4w());
            String id = c38321qM.getId();
            if (id != null) {
                map.put(id, c75113Zb);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return c75113Zb;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        this.A0W.A01.D8S(view);
    }

    @Override // X.C30B
    public final void DaS(C38321qM c38321qM, int i) {
    }

    @Override // X.C30B
    public final /* synthetic */ void DsL(C38321qM c38321qM, C3Y7 c3y7, C75113Zb c75113Zb) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (A07().A5M() == false) goto L11;
     */
    @Override // X.C30A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DuC(android.view.MotionEvent r4, android.view.View r5, X.InterfaceC38411qV r6, int r7) {
        /*
            r3 = this;
            r2 = 0
            X.C14360o3.A0B(r5, r2)
            r0 = 1
            X.C14360o3.A0B(r4, r0)
            r0 = 2
            X.C14360o3.A0B(r6, r0)
            int r0 = r4.getActionMasked()
            if (r0 != 0) goto L3a
            com.instagram.common.session.UserSession r0 = r3.A0T
            X.1DX r1 = X.C1DW.A00(r0)
            java.lang.String r0 = r6.getId()
            X.1qM r0 = r1.A02(r0)
            if (r0 == 0) goto L24
            r3.A0I = r0
        L24:
            X.1qM r0 = r3.A0I
            if (r0 == 0) goto L33
            X.1qM r0 = r3.A07()
            boolean r1 = r0.A5M()
            r0 = 0
            if (r1 != 0) goto L34
        L33:
            r0 = -1
        L34:
            r3.A00 = r0
            r3.A01 = r7
            r3.A05 = r5
        L3a:
            boolean r0 = r3.A0F
            if (r0 == 0) goto L48
            int r1 = r4.getActionMasked()
            r0 = 3
            if (r1 != r0) goto L48
            r3.A0F = r2
            return r2
        L48:
            X.30g r0 = r3.A0h
            r0.onTouch(r5, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass308.DuC(android.view.MotionEvent, android.view.View, X.1qV, int):boolean");
    }

    @Override // X.C30B
    public final void DzI(C38321qM c38321qM, String str) {
    }

    @Override // X.C30B
    public final void DzZ(C38321qM c38321qM, boolean z) {
    }

    @Override // X.C30B
    public final void E01(EnumC92424Bx enumC92424Bx, C38321qM c38321qM) {
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6Q(C38321qM c38321qM) {
        C11520jB c11520jB;
        C14360o3.A0B(c38321qM, 0);
        InterfaceC60442pS interfaceC60442pS = this.A0X;
        if (interfaceC60442pS instanceof AnonymousClass309) {
            c11520jB = ((AnonymousClass309) interfaceC60442pS).E6Q(c38321qM);
        } else {
            c11520jB = new C11520jB();
        }
        C14360o3.A0A(c11520jB);
        return c11520jB;
    }

    @Override // X.C30A
    public final void ETB(InterfaceC101554hQ interfaceC101554hQ) {
        C14360o3.A0B(interfaceC101554hQ, 0);
        this.A0B = interfaceC101554hQ;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1) {
            InterfaceC56002hn interfaceC56002hn = this.A07;
            if (interfaceC56002hn != null) {
                interfaceC56002hn.COs(null);
            }
            this.A07 = null;
        }
        this.A0h.onTouch(this.A05, motionEvent);
        if (this.A0C != C05F.A00) {
            return true;
        }
        return false;
    }

    public static final void A00(AnonymousClass308 anonymousClass308) {
        anonymousClass308.A0h.A01();
        C140366Wq c140366Wq = anonymousClass308.A09;
        if (c140366Wq != null) {
            c140366Wq.A00.setVisibility(4);
            anonymousClass308.A0W.A00(anonymousClass308.A07(), anonymousClass308.A00);
            anonymousClass308.A0C = C05F.A0C;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A01(AnonymousClass308 anonymousClass308) {
        Fragment fragment = anonymousClass308.A0R;
        UserSession userSession = anonymousClass308.A0T;
        String A2u = anonymousClass308.A07().A2u();
        if (A2u != null) {
            C1GJ.A03(AbstractC41331IRb.A00(fragment, userSession, A2u));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A03(AnonymousClass308 anonymousClass308, EnumC75193Zm enumC75193Zm, boolean z) {
        InterfaceC65232xL interfaceC65232xL;
        UserSession userSession = anonymousClass308.A0T;
        C3YS.A00(userSession).A02(anonymousClass308.A07(), true);
        C3YS.A00(userSession).A01(anonymousClass308.A07(), enumC75193Zm.A00);
        AbstractC25651Mw.A00(userSession).E4s(new C42251Inb(anonymousClass308.A07()));
        InterfaceC08430c6 interfaceC08430c6 = anonymousClass308.A0R;
        if (interfaceC08430c6 instanceof C38Q) {
            C14360o3.A0C(interfaceC08430c6, "null cannot be cast to non-null type com.instagram.feed.helper.DismissMediaListener");
            ((C38Q) interfaceC08430c6).DRS(anonymousClass308.A07(), anonymousClass308.BRZ(anonymousClass308.A07()), z);
            return;
        }
        if (interfaceC08430c6 instanceof C38K) {
            ListAdapter listAdapter = ((AbstractC05560Rg) interfaceC08430c6).A03;
            if (!(listAdapter instanceof InterfaceC65232xL)) {
                return;
            } else {
                interfaceC65232xL = (InterfaceC65232xL) listAdapter;
            }
        } else {
            interfaceC65232xL = anonymousClass308.A0Y;
            if (interfaceC65232xL == null) {
                return;
            }
        }
        interfaceC65232xL.CtR(anonymousClass308.A07());
    }

    public static final boolean A04(View view, AnonymousClass308 anonymousClass308, String str, float f, float f2) {
        C140366Wq c140366Wq = anonymousClass308.A09;
        if (c140366Wq != null) {
            if (view.getVisibility() == 0 && AbstractC53976Ntn.A00(view, f, f2)) {
                View view2 = c140366Wq.A01;
                view2.setAlpha(0.0f);
                view2.bringToFront();
                ((TextView) view2).setText(str);
                anonymousClass308.A02 = view;
                view.getLocationInWindow(anonymousClass308.A0e);
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final boolean A05(AnonymousClass308 anonymousClass308) {
        PromptStickerModel A00;
        InterfaceC156276zx interfaceC156276zx = anonymousClass308.A0A;
        if (interfaceC156276zx != null && interfaceC156276zx.CaS()) {
            C08730cb c08730cb = C17060sy.A01;
            UserSession userSession = anonymousClass308.A0T;
            if (C14360o3.A0K(c08730cb.A01(userSession), anonymousClass308.A07().A2E(userSession)) && (A00 = C37759GjY.A00(anonymousClass308.A07())) != null && A00.A0K()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A06(AnonymousClass308 anonymousClass308) {
        InterfaceC156276zx interfaceC156276zx = anonymousClass308.A0A;
        if (interfaceC156276zx != null && interfaceC156276zx.CaT() && !anonymousClass308.A07().A5H() && !anonymousClass308.A07().A60() && C2TN.A02(anonymousClass308.A0T, anonymousClass308.A07())) {
            return true;
        }
        return false;
    }

    public final C38321qM A07() {
        C38321qM c38321qM = this.A0I;
        if (c38321qM != null) {
            return c38321qM;
        }
        C14360o3.A0F("media");
        throw C00O.createAndThrow();
    }

    @Override // X.C30B
    public final void Dp2(C38321qM c38321qM, int i, int i2, int i3) {
        C75113Zb BRZ;
        if (c38321qM != null) {
            InterfaceC65232xL interfaceC65232xL = this.A0Y;
            C38321qM A07 = A07();
            if (interfaceC65232xL == null) {
                BRZ = BRZ(A07);
            } else {
                BRZ = interfaceC65232xL.BRZ(A07);
            }
            if (BRZ == null && interfaceC65232xL != null) {
                C0w9.A03(__redex_internal_original_name, AnonymousClass001.A0R("MediaStateAdapter gave a null MediaState which should not happen. Guilty adapter class: ", interfaceC65232xL.getClass().getSimpleName()));
            } else {
                BRZ.A0E(i, BRZ.A03);
            }
        }
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6P() {
        C11520jB c11520jB;
        InterfaceC60442pS interfaceC60442pS = this.A0X;
        if (interfaceC60442pS instanceof AnonymousClass309) {
            c11520jB = ((AnonymousClass309) interfaceC60442pS).E6P();
        } else {
            c11520jB = new C11520jB();
        }
        C14360o3.A0A(c11520jB);
        return c11520jB;
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        InterfaceC11480j6 interfaceC11480j6;
        InterfaceC08430c6 interfaceC08430c6 = this.A0R;
        if (!(interfaceC08430c6 instanceof InterfaceC11480j6) || (interfaceC11480j6 = (InterfaceC11480j6) interfaceC08430c6) == null) {
            return null;
        }
        return interfaceC11480j6.E6b();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A0J;
        if (str == null) {
            str = AnonymousClass001.A0R(AbstractC111324zv.A00(2861), this.A0X.getModuleName());
            this.A0J = str;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return str;
    }

    @Override // X.InterfaceC11390ix
    public final String getModuleNameV2() {
        return this.A0g.A00;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return this.A0X.isOrganicEligible();
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return this.A0X.isSponsoredEligible();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        Integer num = this.A0C;
        if (num != C05F.A00 && num != C05F.A01) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onCreate() {
        this.A0W.A01.onCreate();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        this.A0W.A01.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r1 != null) goto L13;
     */
    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroyView() {
        /*
            r2 = this;
            X.6Wq r0 = r2.A09
            if (r0 == 0) goto L11
            X.4oV r0 = r0.A0H
            if (r0 == 0) goto L11
            X.BIm r0 = r0.A04
            if (r0 == 0) goto L11
            android.animation.ValueAnimator r0 = r0.A08
            r0.cancel()
        L11:
            android.view.ViewGroup r1 = r2.A06
            if (r1 != 0) goto L26
            android.content.Context r1 = r2.A0P
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            X.C14360o3.A0C(r1, r0)
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.ViewGroup r1 = X.AbstractC669130i.A03(r1)
            r2.A06 = r1
            if (r1 == 0) goto L2b
        L26:
            android.view.View r0 = r2.A04
            r1.removeView(r0)
        L2b:
            r0 = 0
            r2.A04 = r0
            r2.A09 = r0
            X.30b r0 = r2.A0W
            X.2vu r0 = r0.A01
            r0.onDestroyView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass308.onDestroyView():void");
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        View view;
        this.A0C = C05F.A00;
        if (this.A0I != null) {
            C668430b c668430b = this.A0W;
            C38321qM A07 = A07();
            int i = this.A00;
            C64352vu c64352vu = c668430b.A01;
            c64352vu.A03(A07, i);
            c64352vu.A02(A07, i);
            c64352vu.onPause();
            C38321qM A072 = A07();
            C38321qM A1e = A072.A1e(this.A00);
            if (A1e == null) {
                A1e = A072;
            }
            if (A1e.Cff()) {
                this.A0Z.A0V("fragment_paused", false, false);
            }
        }
        View view2 = this.A04;
        if (view2 != null && this.A09 != null) {
            view2.setVisibility(4);
            C140366Wq c140366Wq = this.A09;
            if (c140366Wq != null && (view = c140366Wq.A00) != null) {
                view.setVisibility(4);
            }
        }
        this.A0h.A00();
        C55982hj c55982hj = this.A0S;
        c55982hj.A0B(this.A0f);
        c55982hj.A01();
        this.A05 = null;
        InterfaceC56002hn interfaceC56002hn = this.A07;
        if (interfaceC56002hn != null) {
            interfaceC56002hn.COs(null);
        }
        this.A07 = null;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        this.A0S.A0A(this.A0f);
        this.A0W.A01.onResume();
        UserSession userSession = this.A0T;
        if (C72213Lu.A00(userSession).A00) {
            C72213Lu.A00(userSession);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnonymousClass308(Activity activity, Fragment fragment, AbstractC10360h2 abstractC10360h2, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC65232xL interfaceC65232xL, C1M1 c1m1, boolean z) {
        this(activity, fragment, abstractC10360h2, userSession, null, interfaceC60442pS, interfaceC65232xL, c1m1, z, true, false);
        C14360o3.A0B(abstractC10360h2, 3);
        C14360o3.A0B(userSession, 5);
    }
}
