package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.V4q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnKeyListenerC67975V4q extends AbstractC60592pi implements InterfaceC60442pS, InterfaceC55932he, C30B, View.OnKeyListener {
    public static final C55942hf A0N = C55942hf.A03(3.0d, 5.0d);
    public static final String __redex_internal_original_name = "FixedMediaHeaderController";
    public long A00;
    public long A01;
    public View A02;
    public View A03;
    public RecyclerView A04;
    public C70916WkK A05;
    public C30E A06;
    public boolean A07;
    public boolean A08;
    public Drawable A09;
    public TouchInterceptorFrameLayout A0A;
    public final int A0B;
    public final View.OnTouchListener A0C;
    public final C1I4 A0D;
    public final C55982hj A0E;
    public final C70065W1b A0F;
    public final UserSession A0G;
    public final C38321qM A0H;
    public final C75113Zb A0I;
    public final String A0J;
    public final int[] A0K;
    public final int[] A0L;
    public final boolean A0M;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 == X.C3Q0.PAUSED) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03() {
        /*
            r15 = this;
            r7 = r15
            X.1qM r6 = r15.A0H
            boolean r0 = r6.Cff()
            if (r0 == 0) goto L3a
            X.30E r5 = r15.A06
            java.lang.String r3 = "Required value was null."
            if (r5 == 0) goto L81
            X.3Q0 r2 = r5.A0J()
            X.3Q0 r4 = X.C3Q0.IDLE
            if (r2 == r4) goto L1c
            X.3Q0 r0 = X.C3Q0.PAUSED
            r1 = 0
            if (r2 != r0) goto L1d
        L1c:
            r1 = 1
        L1d:
            boolean r0 = r15.A08
            if (r0 == 0) goto L3b
            if (r1 == 0) goto L3b
            boolean r0 = r5.A0Z()
            if (r0 != 0) goto L3b
            boolean r0 = A02(r15)
            if (r0 == 0) goto L3a
            X.3Q0 r1 = r5.A0J()
            X.3Q0 r0 = X.C3Q0.PAUSED
            if (r1 != r0) goto L5e
            r5.A0M()
        L3a:
            return
        L3b:
            X.WkK r2 = r15.A05
            if (r2 == 0) goto L7b
            X.30E r0 = r15.A06
            r1 = 0
            if (r0 == 0) goto L4a
            X.3Q0 r1 = r0.A0J()
            if (r1 == r4) goto L4e
        L4a:
            X.3Q0 r0 = X.C3Q0.PAUSED
            if (r1 != r0) goto L3a
        L4e:
            X.3Y8 r0 = r2.A03
            X.2jc r0 = r0.A01
            android.view.View r1 = r0.A01()
            X.C14360o3.A07(r1)
            r0 = 0
            r1.setVisibility(r0)
            return
        L5e:
            X.WkK r8 = r15.A05
            if (r8 == 0) goto L75
            r10 = 0
            r11 = -1
            X.3Zb r0 = r15.A0I
            int r12 = r0.A01()
            r13 = 1
            X.4QP r9 = new X.4QP
            r9.<init>(r10, r10, r10, r10)
            r14 = r10
            r5.A0S(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L75:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L7b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L81:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnKeyListenerC67975V4q.A03():void");
    }

    public final void A04(C70916WkK c70916WkK) {
        C38321qM c38321qM = this.A0H;
        if (c38321qM.Cff()) {
            C30E c30e = this.A06;
            if (c30e != null) {
                c30e.A0R(c38321qM, this, c70916WkK, this.A0I, null, 0);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        Drawable drawable;
        C14360o3.A0B(view, 0);
        this.A0A = (TouchInterceptorFrameLayout) view.requireViewById(R.id.layout_container_main);
        this.A02 = view.requireViewById(R.id.canvas_container);
        this.A03 = AbstractC167017dG.A0U(view, R.id.fixed_header_stub);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A0A;
        if (touchInterceptorFrameLayout != null) {
            touchInterceptorFrameLayout.setBackgroundColor(-1);
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = this.A0A;
        if (touchInterceptorFrameLayout2 != null) {
            drawable = touchInterceptorFrameLayout2.getBackground();
        } else {
            drawable = null;
        }
        this.A09 = drawable;
    }

    @Override // X.C30B
    public final void DaS(C38321qM c38321qM, int i) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        View view = this.A03;
        if (view == null) {
            C0w9.A01.EmN("onSpringUpdatedFailed", "fixedMediaHeaderView is null");
            return;
        }
        float f = (float) c55982hj.A09.A00;
        double d = f;
        view.setTranslationY(((float) AbstractC70163Da.A01(d, -r8)) + this.A0K[1]);
        view.setTranslationX((float) AbstractC70163Da.A02(d, r10[0]));
        if (this.A0L != null) {
            view.setScaleX(f);
            view.setScaleY(f);
        }
        Drawable drawable = this.A09;
        if (drawable == null) {
            return;
        }
        drawable.setAlpha(C1H4.A01(f * 255.0f));
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

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A06 = null;
        this.A04 = null;
        this.A09 = null;
        this.A0A = null;
        this.A02 = null;
        this.A03 = null;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        this.A08 = false;
        C30E c30e = this.A06;
        if (c30e != null) {
            if (this.A0H.Cff() && c30e.A0J() == C3Q0.PLAYING) {
                c30e.A0L();
            }
            RecyclerView recyclerView = this.A04;
            if (recyclerView != null) {
                recyclerView.A15(this.A0D);
                recyclerView.setOnTouchListener(null);
            }
            if (!this.A07) {
                this.A07 = true;
                long currentTimeMillis = System.currentTimeMillis();
                this.A01 += currentTimeMillis - this.A00;
                this.A00 = currentTimeMillis;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        this.A08 = true;
        A03();
        RecyclerView recyclerView = this.A04;
        if (recyclerView != null) {
            recyclerView.A14(this.A0D);
            recyclerView.setOnTouchListener(this.A0C);
        }
        A01(this);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        if (bundle == null) {
            View view2 = this.A03;
            if (view2 != null) {
                view2.getViewTreeObserver().addOnPreDrawListener(new WOM(2, view2, this));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.W1b] */
    public ViewOnKeyListenerC67975V4q(Fragment fragment, UserSession userSession, C38321qM c38321qM, String str, String str2, int[] iArr, int[] iArr2, int i, int i2, boolean z) {
        String str3;
        String str4 = str2;
        C14360o3.A0B(userSession, 5);
        this.A0M = z;
        this.A0G = userSession;
        this.A0B = i;
        this.A0K = iArr;
        this.A0L = iArr2;
        if (str != null && str.length() != 0) {
            str3 = AnonymousClass001.A0R("canvas_", str);
        } else {
            str3 = "canvas";
        }
        this.A0J = str3;
        this.A0F = new Object();
        c38321qM = c38321qM.A5Q() ? c38321qM.A1d() : c38321qM;
        this.A0H = c38321qM;
        C75113Zb A0E = AbstractC37303Gc4.A0E(c38321qM);
        this.A0I = A0E;
        this.A07 = true;
        this.A0C = new WO5(this, 6);
        this.A0D = new C65986Txf(this, 6);
        A0E.A0E(i2, A0E.A03);
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A09(A0N);
        A0R.A06 = true;
        this.A0E = A0R;
        C30E c30e = new C30E(fragment.requireContext(), fragment, userSession, this, null, str2 == null ? "" : str4, false, true, true, true, false);
        this.A06 = c30e;
        c30e.A0P.add(this);
    }

    public static final int A00(ViewOnKeyListenerC67975V4q viewOnKeyListenerC67975V4q) {
        View view;
        RecyclerView recyclerView = viewOnKeyListenerC67975V4q.A04;
        if (recyclerView != null) {
            C3OO A0V = recyclerView.A0V(0);
            if (A0V == null || (view = A0V.itemView) == null) {
                return 0;
            }
            return view.getTop();
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A01(ViewOnKeyListenerC67975V4q viewOnKeyListenerC67975V4q) {
        if (viewOnKeyListenerC67975V4q.A07) {
            RecyclerView recyclerView = viewOnKeyListenerC67975V4q.A04;
            if (recyclerView != null && recyclerView.isLaidOut()) {
                if (A00(viewOnKeyListenerC67975V4q) <= 0) {
                    return;
                }
            } else if (!viewOnKeyListenerC67975V4q.A08) {
                return;
            }
            viewOnKeyListenerC67975V4q.A00 = System.currentTimeMillis();
            viewOnKeyListenerC67975V4q.A07 = false;
        }
    }

    public static final boolean A02(ViewOnKeyListenerC67975V4q viewOnKeyListenerC67975V4q) {
        RecyclerView recyclerView = viewOnKeyListenerC67975V4q.A04;
        if (recyclerView != null && recyclerView.isLaidOut()) {
            return AbstractC167007dF.A1O((A00(viewOnKeyListenerC67975V4q) > (viewOnKeyListenerC67975V4q.A0B * 0.5f) ? 1 : (A00(viewOnKeyListenerC67975V4q) == (viewOnKeyListenerC67975V4q.A0B * 0.5f) ? 0 : -1)));
        }
        return viewOnKeyListenerC67975V4q.A08;
    }

    @Override // X.C30B
    public final void Dp2(C38321qM c38321qM, int i, int i2, int i3) {
        C75113Zb c75113Zb = this.A0I;
        c75113Zb.A0E(i, c75113Zb.A03);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0J;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return this.A0M;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        AbstractC167017dG.A1O(view, keyEvent);
        if (this.A0H.Cff()) {
            C30E c30e = this.A06;
            if (c30e != null) {
                if (c30e.onKey(view, i, keyEvent)) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return false;
    }
}
