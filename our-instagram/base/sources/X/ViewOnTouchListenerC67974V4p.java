package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.V4p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnTouchListenerC67974V4p extends AbstractC60592pi implements AnonymousClass309, InterfaceC60072op, View.OnTouchListener, InterfaceC61782rf, InterfaceC11480j6, C30A, C30B {
    public static final String __redex_internal_original_name = "GridQuickPreviewController";
    public int A00;
    public int A01;
    public View A02;
    public InterfaceC56002hn A03;
    public C38321qM A04;
    public InterfaceC101554hQ A05;
    public C69656Vsx A06;
    public C71068WnQ A07;
    public GestureDetectorOnGestureListenerC148016lX A08;
    public Boolean A09;
    public Integer A0A;
    public boolean A0B;
    public String A0C;
    public final Context A0D;
    public final Fragment A0E;
    public final C55982hj A0F;
    public final UserSession A0G;
    public final C684636j A0H;
    public final C668430b A0I;
    public final C69297Vl5 A0J;
    public final InterfaceC60442pS A0K;
    public final InterfaceC86223st A0L = new C70915WkJ(this);
    public final C30E A0M;
    public final C668630d A0N;
    public final C68763Vbg A0O;
    public final C68764Vbh A0P;
    public final C42630Itn A0Q;
    public final WKs A0R;
    public final InterfaceC65232xL A0S;
    public final Map A0T;

    public ViewOnTouchListenerC67974V4p(Context context, Fragment fragment, AbstractC10360h2 abstractC10360h2, UserSession userSession, C684636j c684636j, InterfaceC60442pS interfaceC60442pS, InterfaceC65232xL interfaceC65232xL, C57332k8 c57332k8) {
        C68763Vbg c68763Vbg = new C68763Vbg(this);
        this.A0O = c68763Vbg;
        this.A0P = new C68764Vbh(this);
        Ut2 ut2 = new Ut2(this, 6);
        this.A0N = ut2;
        this.A0D = context;
        this.A0G = userSession;
        this.A0E = fragment;
        this.A0S = interfaceC65232xL;
        this.A0K = interfaceC60442pS;
        this.A0A = C05F.A00;
        this.A0T = new HashMap();
        this.A0R = new WKs(context, c68763Vbg);
        this.A0I = new C668430b(abstractC10360h2, userSession, new C64352vu(userSession, new C30U(userSession, null), this, false), this, interfaceC60442pS, this, null);
        C42630Itn c42630Itn = new C42630Itn(fragment, abstractC10360h2, userSession, this);
        this.A0Q = c42630Itn;
        this.A0J = new C69297Vl5(context, fragment.requireActivity(), userSession, c42630Itn, c57332k8);
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A06 = true;
        A0R.A00 = 0.019999999552965164d;
        A0R.A09(C55942hf.A03(8.0d, 12.0d));
        A0R.A0A(ut2);
        this.A0F = A0R;
        C14360o3.A0B(userSession, 3);
        C30E c30e = new C30E(context, fragment, userSession, interfaceC60442pS, null, "", true, true, false, true, false);
        this.A0M = c30e;
        c30e.A08 = true;
        c30e.A0P.add(this);
        this.A0H = c684636j;
    }

    public static void A04(ViewOnTouchListenerC67974V4p viewOnTouchListenerC67974V4p, EnumC77173d3 enumC77173d3, C37905Gm2 c37905Gm2) {
        Context context = viewOnTouchListenerC67974V4p.A0D;
        C38321qM c38321qM = viewOnTouchListenerC67974V4p.A04;
        int i = viewOnTouchListenerC67974V4p.A01;
        int i2 = viewOnTouchListenerC67974V4p.A00;
        int i3 = viewOnTouchListenerC67974V4p.A06.A09.A0N.getCurrentScans().get();
        Integer num = C05F.A0C;
        FragmentActivity activity = viewOnTouchListenerC67974V4p.A0E.getActivity();
        UserSession userSession = viewOnTouchListenerC67974V4p.A0G;
        boolean z = viewOnTouchListenerC67974V4p.BRZ(viewOnTouchListenerC67974V4p.A04).A2U;
        AbstractC167017dG.A1N(context, c38321qM);
        C14360o3.A0B(enumC77173d3, 7);
        C14360o3.A0B(userSession, 11);
        AbstractC41706Idc.A01(activity, context, null, userSession, null, enumC77173d3, c38321qM, c37905Gm2, viewOnTouchListenerC67974V4p, AnonymousClass729.A00(userSession).A00, null, num, null, null, null, null, i, -1, i2, i3, z);
    }

    @Override // X.C30B
    public final void DaS(C38321qM c38321qM, int i) {
    }

    @Override // X.C30B
    public final /* synthetic */ void DsL(C38321qM c38321qM, C3Y7 c3y7, C75113Zb c75113Zb) {
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

    public static void A01(C55982hj c55982hj, ViewOnTouchListenerC67974V4p viewOnTouchListenerC67974V4p) {
        if (c55982hj.A09.A00 != 1.0d) {
            Integer num = viewOnTouchListenerC67974V4p.A0A;
            Integer num2 = C05F.A00;
            if (num != num2) {
                viewOnTouchListenerC67974V4p.A0A = num2;
                viewOnTouchListenerC67974V4p.A02.setVisibility(8);
                InterfaceC101554hQ interfaceC101554hQ = viewOnTouchListenerC67974V4p.A05;
                if (interfaceC101554hQ != null) {
                    interfaceC101554hQ.DY1();
                }
                AbstractC26351Pq.A00.A00();
            }
        }
    }

    public static void A02(ViewOnTouchListenerC67974V4p viewOnTouchListenerC67974V4p) {
        C55982hj c55982hj = viewOnTouchListenerC67974V4p.A0F;
        c55982hj.A06(0.0d);
        if (c55982hj.A09.A00 == 0.0d) {
            A01(c55982hj, viewOnTouchListenerC67974V4p);
        }
        if (A00(viewOnTouchListenerC67974V4p.A04, viewOnTouchListenerC67974V4p.A00).Cff()) {
            viewOnTouchListenerC67974V4p.A0M.A0V(AbstractC43591JPw.A00(357), true, false);
        }
        C71068WnQ c71068WnQ = viewOnTouchListenerC67974V4p.A07;
        if (c71068WnQ.A09 != null) {
            TouchInterceptorFrameLayout touchInterceptorFrameLayout = c71068WnQ.A0H;
            touchInterceptorFrameLayout.getViewTreeObserver().removeOnGlobalLayoutListener(c71068WnQ.A09);
            c71068WnQ.A09 = null;
            StringBuilder sb = new StringBuilder();
            C71068WnQ.A00(c71068WnQ, sb);
            sb.append(touchInterceptorFrameLayout.getHeight());
            sb.append(" mMediaContainer.getHeight(): ");
            sb.append(c71068WnQ.A0I.getHeight());
            C0w9.A03("GridQuickPreviewDragHelper#tearDown", sb.toString());
        }
        viewOnTouchListenerC67974V4p.A0I.A00(viewOnTouchListenerC67974V4p.A04, viewOnTouchListenerC67974V4p.A00);
        viewOnTouchListenerC67974V4p.A0A = C05F.A0C;
    }

    public static void A03(ViewOnTouchListenerC67974V4p viewOnTouchListenerC67974V4p) {
        EnumC77173d3 enumC77173d3;
        C68764Vbh c68764Vbh = viewOnTouchListenerC67974V4p.A0P;
        if (C57532kS.A00(viewOnTouchListenerC67974V4p.A0G).A0N(viewOnTouchListenerC67974V4p.A04)) {
            enumC77173d3 = EnumC77173d3.A03;
        } else {
            enumC77173d3 = EnumC77173d3.A02;
        }
        C14360o3.A0B(c68764Vbh, 0);
        int i = 2131965099;
        if (enumC77173d3 == EnumC77173d3.A03) {
            i = 2131976160;
        }
        List A1Q = AbstractC16960so.A1Q(new C38679GzK((View.OnClickListener) new WNU(c68764Vbh, 32), R.drawable.ufi_heart_icon, i, false), new C38679GzK((View.OnClickListener) new WNU(c68764Vbh, 31), R.drawable.instagram_direct_pano_outline_24, 2131973639, false), new C38679GzK((View.OnClickListener) new WNU(c68764Vbh, 34), R.drawable.instagram_eye_pano_outline_24, 2131968678, true), new C38679GzK((View.OnClickListener) new WNU(c68764Vbh, 33), R.drawable.instagram_report_pano_outline_24, 2131972368, true));
        for (int i2 = 0; i2 < viewOnTouchListenerC67974V4p.A06.A0B.length; i2++) {
            int size = A1Q.size();
            UCG ucg = viewOnTouchListenerC67974V4p.A06.A0B[i2];
            if (i2 < size) {
                C38679GzK c38679GzK = (C38679GzK) A1Q.get(i2);
                C14360o3.A0B(c38679GzK, 0);
                ucg.setOnClickListener((View.OnClickListener) c38679GzK.A02);
                IgTextView igTextView = ucg.A00;
                if (igTextView == null) {
                    C14360o3.A0F("igTextView");
                    throw C00O.createAndThrow();
                }
                Context context = ucg.getContext();
                boolean z = c38679GzK.A03;
                int i3 = R.attr.igds_color_primary_text;
                if (z) {
                    i3 = R.attr.igds_color_error_or_destructive;
                }
                AbstractC166987dD.A1O(context, igTextView, AbstractC53242c7.A0H(context, i3));
                igTextView.setText(c38679GzK.A01);
            } else {
                ucg.setVisibility(8);
            }
        }
    }

    public static void A05(ViewOnTouchListenerC67974V4p viewOnTouchListenerC67974V4p, boolean z) {
        InterfaceC65232xL interfaceC65232xL;
        C3YS.A00(viewOnTouchListenerC67974V4p.A0G).A02(viewOnTouchListenerC67974V4p.A04, true);
        InterfaceC08430c6 interfaceC08430c6 = viewOnTouchListenerC67974V4p.A0E;
        if (interfaceC08430c6 instanceof C38Q) {
            C38321qM c38321qM = viewOnTouchListenerC67974V4p.A04;
            ((C38Q) interfaceC08430c6).DRS(c38321qM, viewOnTouchListenerC67974V4p.BRZ(c38321qM), z);
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
            interfaceC65232xL = viewOnTouchListenerC67974V4p.A0S;
        }
        interfaceC65232xL.CtR(viewOnTouchListenerC67974V4p.A04);
    }

    public final void A06(boolean z) {
        this.A06.A04.setVisibility(8);
        this.A06.A06.setVisibility(8);
        if (!z) {
            ViewGroup viewGroup = this.A06.A08.A0E;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = 0;
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    @Override // X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        Map map = this.A0T;
        C75113Zb c75113Zb = (C75113Zb) map.get(c38321qM.getId());
        if (c75113Zb == null) {
            C75113Zb A0E = AbstractC37303Gc4.A0E(c38321qM);
            map.put(c38321qM.getId(), A0E);
            return A0E;
        }
        return c75113Zb;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        C69297Vl5 c69297Vl5 = this.A0J;
        Context context = this.A0D;
        View inflate = LayoutInflater.from(context).inflate(R.layout.grid_quick_preview, (ViewGroup) null, false);
        inflate.setTag(new C69656Vsx(context, inflate, c69297Vl5.A02));
        this.A02 = inflate;
        C69656Vsx c69656Vsx = (C69656Vsx) AbstractC31172DnG.A0x(inflate);
        this.A06 = c69656Vsx;
        this.A0Q.A00 = c69656Vsx;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = c69656Vsx.A07;
        RoundedCornerConstraintLayout roundedCornerConstraintLayout = c69656Vsx.A0A;
        C71068WnQ c71068WnQ = new C71068WnQ(context, c69656Vsx.A05, c69656Vsx.A04, this.A06.A06, touchInterceptorFrameLayout, new C68762Vbf(this), roundedCornerConstraintLayout, c69656Vsx.A00());
        this.A07 = c71068WnQ;
        GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX = new GestureDetectorOnGestureListenerC148016lX(context, c71068WnQ);
        this.A08 = gestureDetectorOnGestureListenerC148016lX;
        AbstractC148046la.A00(this.A06.A07, gestureDetectorOnGestureListenerC148016lX);
        this.A02.setVisibility(8);
        C668430b c668430b = this.A0I;
        C14360o3.A0B(view, 0);
        c668430b.A01.D8S(view);
    }

    @Override // X.C30B
    public final void Dp2(C38321qM c38321qM, int i, int i2, int i3) {
        if (c38321qM != null) {
            C75113Zb BRZ = BRZ(c38321qM);
            BRZ.A0E(i, BRZ.A03);
        }
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6P() {
        InterfaceC60442pS interfaceC60442pS = this.A0K;
        if (interfaceC60442pS instanceof AnonymousClass309) {
            return ((AnonymousClass309) interfaceC60442pS).E6P();
        }
        return new C11520jB();
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6Q(C38321qM c38321qM) {
        InterfaceC60442pS interfaceC60442pS = this.A0K;
        if (interfaceC60442pS instanceof AnonymousClass309) {
            return ((AnonymousClass309) interfaceC60442pS).E6Q(c38321qM);
        }
        return new C11520jB();
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        InterfaceC08430c6 interfaceC08430c6 = this.A0E;
        if (interfaceC08430c6 instanceof InterfaceC11480j6) {
            return ((InterfaceC11480j6) interfaceC08430c6).E6b();
        }
        return null;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A0C;
        if (str == null) {
            String A0R = AnonymousClass001.A0R(AbstractC111324zv.A00(2861), this.A0K.getModuleName());
            this.A0C = A0R;
            return A0R;
        }
        return str;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return this.A0K.isOrganicEligible();
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return this.A0K.isSponsoredEligible();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        int intValue = this.A0A.intValue();
        if (intValue == 0 || intValue == 1) {
            return false;
        }
        if (intValue == 3) {
            A02(this);
        }
        return true;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onCreate() {
        this.A0I.A01.onCreate();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        this.A0I.A01.onDestroy();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        InterfaceC56002hn interfaceC56002hn = this.A03;
        if (interfaceC56002hn != null) {
            interfaceC56002hn.ACp().removeView(this.A02);
            this.A03 = null;
        }
        this.A0Q.A00 = null;
        this.A02 = null;
        this.A06 = null;
        this.A04 = null;
        this.A0I.A01.onDestroyView();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        this.A0A = C05F.A00;
        C668430b c668430b = this.A0I;
        C38321qM c38321qM = this.A04;
        int i = this.A00;
        if (c38321qM != null) {
            C64352vu c64352vu = c668430b.A01;
            c64352vu.A03(c38321qM, i);
            c64352vu.A02(c38321qM, i);
        }
        c668430b.A01.onPause();
        C38321qM c38321qM2 = this.A04;
        if (c38321qM2 != null && A00(c38321qM2, this.A00).Cff()) {
            this.A0M.A0V("fragment_paused", false, false);
        }
        this.A02.setVisibility(8);
        WKs wKs = this.A0R;
        wKs.A03.removeCallbacksAndMessages(null);
        wKs.A01 = false;
        C55982hj c55982hj = this.A0F;
        c55982hj.A06(0.0d);
        c55982hj.A08(0.0d, true);
        InterfaceC56002hn interfaceC56002hn = this.A03;
        if (interfaceC56002hn != null) {
            interfaceC56002hn.COs(null);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        UserSession userSession = this.A0G;
        if (C72213Lu.A00(userSession).A00) {
            C72213Lu.A00(userSession);
        }
        this.A0I.A01.onResume();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC56002hn interfaceC56002hn = this.A03;
        if ((motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1) && interfaceC56002hn != null) {
            interfaceC56002hn.COs(null);
        }
        this.A0R.A00(motionEvent);
        if (this.A0A != C05F.A00) {
            return true;
        }
        return false;
    }

    public static C38321qM A00(C38321qM c38321qM, int i) {
        if (c38321qM.A5M()) {
            return c38321qM.A1e(i);
        }
        if (!c38321qM.A5Q()) {
            return c38321qM;
        }
        return c38321qM.A1d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r1 == false) goto L8;
     */
    @Override // X.C30A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DuC(android.view.MotionEvent r4, android.view.View r5, X.InterfaceC38411qV r6, int r7) {
        /*
            r3 = this;
            int r0 = r4.getActionMasked()
            r2 = 0
            if (r0 != 0) goto L25
            com.instagram.common.session.UserSession r0 = r3.A0G
            X.1DX r1 = X.C1DW.A00(r0)
            java.lang.String r0 = r6.getId()
            X.1qM r0 = r1.A02(r0)
            r3.A04 = r0
            if (r0 == 0) goto L20
            boolean r1 = r0.A5M()
            r0 = 0
            if (r1 != 0) goto L21
        L20:
            r0 = -1
        L21:
            r3.A00 = r0
            r3.A01 = r7
        L25:
            boolean r0 = r3.A0B
            if (r0 == 0) goto L33
            int r1 = r4.getActionMasked()
            r0 = 3
            if (r1 != r0) goto L33
            r3.A0B = r2
            return r2
        L33:
            X.WKs r0 = r3.A0R
            r0.A00(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC67974V4p.DuC(android.view.MotionEvent, android.view.View, X.1qV, int):boolean");
    }

    @Override // X.C30A
    public final void ETB(InterfaceC101554hQ interfaceC101554hQ) {
        this.A05 = interfaceC101554hQ;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC56002hn A00 = C71Q.A00(view);
        this.A03 = A00;
        if (A00 != null) {
            A00.ACp().addView(this.A02, new ViewGroup.LayoutParams(-1, -1));
        }
    }
}
