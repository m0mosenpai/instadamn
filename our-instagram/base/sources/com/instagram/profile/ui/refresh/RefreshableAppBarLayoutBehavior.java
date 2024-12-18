package com.instagram.profile.ui.refresh;

import X.AbstractC13560mi;
import X.AnonymousClass711;
import X.AnonymousClass713;
import X.C05F;
import X.C14360o3;
import X.C53P;
import X.C55942hf;
import X.C55982hj;
import X.C70543Eq;
import X.C71094Wnq;
import X.InterfaceC021908q;
import X.InterfaceC155836zD;
import X.InterfaceC55932he;
import X.InterfaceC70513Em;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class RefreshableAppBarLayoutBehavior extends AppBarLayout.Behavior implements InterfaceC021908q, InterfaceC55932he, InterfaceC155836zD {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public AnonymousClass713 A04;
    public InterfaceC70513Em A05;
    public Integer A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public View A0D;
    public boolean A0E;
    public final C70543Eq A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final C55982hj A0J;

    @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final /* bridge */ /* synthetic */ boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        C14360o3.A0B(coordinatorLayout, 0);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(motionEvent, 2);
        if (this.A0B) {
            this.A0C = true;
        }
        return super.A0L(motionEvent, view, coordinatorLayout);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r1 != 3) goto L9;
     */
    @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean A0M(android.view.MotionEvent r6, android.view.View r7, androidx.coordinatorlayout.widget.CoordinatorLayout r8) {
        /*
            r5 = this;
            r4 = 0
            r2 = 1
            X.C14360o3.A0B(r7, r2)
            r0 = 2
            X.C14360o3.A0B(r6, r0)
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L60
            r3 = 0
            if (r1 == r2) goto L42
            if (r1 == r0) goto L1c
            r0 = 3
            if (r1 == r0) goto L42
        L17:
            boolean r0 = super.A0M(r6, r7, r8)
            return r0
        L1c:
            r5.A00()
            float r2 = r6.getRawY()
            float r1 = r5.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L2c
            r5.A01 = r2
            goto L17
        L2c:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L17
            boolean r0 = r5.A0A
            if (r0 == 0) goto L17
            float r1 = r2 - r1
            boolean r0 = r5.A09
            if (r0 != 0) goto L3e
            int r0 = (int) r1
            A03(r5, r0)
        L3e:
            r5.A01 = r2
            r0 = 1
            return r0
        L42:
            A02(r5)
            r5.A01 = r3
            java.util.List r0 = r5.A0G
            java.util.Iterator r1 = r0.iterator()
        L4d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r1.next()
            X.53P r0 = (X.C53P) r0
            r0.Doz()
            goto L4d
        L5d:
            r5.A07 = r4
            goto L17
        L60:
            r5.A00()
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.ui.refresh.RefreshableAppBarLayoutBehavior.A0M(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    public final void A0W(View view, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
        C14360o3.A0B(appBarLayout, 1);
        C14360o3.A0B(view, 2);
        A02(this);
        this.A0B = false;
        this.A0C = false;
        if (this.A08) {
            this.A08 = false;
        }
        super.A0W(view, coordinatorLayout, appBarLayout, i);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: A0X */
    public final void A0P(View view, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int[] iArr, int i, int i2, int i3) {
        C14360o3.A0B(coordinatorLayout, 0);
        C14360o3.A0B(appBarLayout, 1);
        C14360o3.A0B(view, 2);
        if (i3 == 1) {
            this.A0B = true;
        }
        super.A0P(view, coordinatorLayout, appBarLayout, iArr, i, i2, i3);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    public final boolean A0Y(View view, View view2, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2) {
        C14360o3.A0B(appBarLayout, 1);
        C14360o3.A0B(view, 2);
        C14360o3.A0B(view2, 3);
        this.A08 = false;
        if (!super.A0Y(view, view2, coordinatorLayout, appBarLayout, i, i2) && !this.A0A) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: A0Z */
    public final boolean A0Q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
        C14360o3.A0B(coordinatorLayout, 0);
        C14360o3.A0B(appBarLayout, 1);
        appBarLayout.A02(this);
        this.A0D = appBarLayout;
        this.A04.A00 = appBarLayout;
        return super.A0Q(coordinatorLayout, appBarLayout, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r4.CcV() != false) goto L13;
     */
    @Override // X.InterfaceC155846zE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DWT(com.google.android.material.appbar.AppBarLayout r8, int r9) {
        /*
            r7 = this;
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            boolean r1 = r7.A0E
            X.3Em r0 = r7.A05
            if (r1 == 0) goto L7c
            if (r0 == 0) goto Lf
            r0.APU()
        Lf:
            java.util.List r0 = r7.A0H
            java.util.Iterator r6 = r0.iterator()
        L15:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r4 = r6.next()
            com.instagram.profile.fragment.UserDetailFragment r4 = (com.instagram.profile.fragment.UserDetailFragment) r4
            boolean r5 = r7.A0A
            if (r5 != 0) goto L2c
            boolean r1 = r4.CcV()
            r0 = 1
            if (r1 == 0) goto L2d
        L2c:
            r0 = 0
        L2d:
            r4.A1e = r0
            X.2iT r0 = com.instagram.profile.fragment.UserDetailFragment.A00(r4)
            if (r0 == 0) goto L6c
            X.2iT r1 = com.instagram.profile.fragment.UserDetailFragment.A00(r4)
            boolean r0 = r4.A1e
            r1.A0Y(r0)
            boolean r0 = r4.A1f
            if (r5 == r0) goto L6c
            com.instagram.common.session.UserSession r3 = r4.A0I
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326614346315772(0x810edd000137fc, double:3.03643541592062E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L6c
            boolean r0 = r4.isResumed()
            if (r0 == 0) goto L6c
            X.2iT r0 = com.instagram.profile.fragment.UserDetailFragment.A00(r4)
            if (r0 == 0) goto L6c
            X.2iT r0 = com.instagram.profile.fragment.UserDetailFragment.A00(r4)
            r0.A0T()
        L6c:
            r4.A1f = r5
            boolean r0 = r4.CcV()
            if (r0 == 0) goto L15
            X.V8L r0 = r4.A1O
            if (r0 == 0) goto L15
            r0.A01()
            goto L15
        L7c:
            if (r9 != 0) goto La1
            if (r0 == 0) goto L83
            r0.ARj()
        L83:
            r2 = 0
            int r1 = r8.getTotalScrollRange()
            if (r9 != 0) goto L95
            java.lang.Integer r1 = X.C05F.A01
        L8c:
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L91
            r2 = 1
        L91:
            r7.A0A = r2
            goto Lf
        L95:
            int r0 = java.lang.Math.abs(r9)
            if (r0 < r1) goto L9e
            java.lang.Integer r1 = X.C05F.A00
            goto L8c
        L9e:
            java.lang.Integer r1 = X.C05F.A0C
            goto L8c
        La1:
            if (r0 == 0) goto L83
            r0.APU()
            goto L83
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.ui.refresh.RefreshableAppBarLayoutBehavior.DWT(com.google.android.material.appbar.AppBarLayout, int):void");
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        this.A03 = (int) c55982hj.A01;
        this.A09 = false;
        A01();
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        View view = this.A0D;
        if (view != null) {
            view.setTranslationY((int) c55982hj.A09.A00);
        }
        int i = (int) c55982hj.A09.A00;
        Iterator it = this.A0I.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setTranslationY(i);
        }
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC021908q
    public final void onPageSelected(int i) {
    }

    private final void A00() {
        if (!this.A07) {
            Iterator it = this.A0G.iterator();
            while (it.hasNext()) {
                ((C53P) it.next()).Do9();
            }
            this.A07 = true;
        }
    }

    private final void A01() {
        float min = Math.min(1.0f, this.A03 / this.A02);
        this.A0F.A00(min, false);
        Iterator it = this.A0G.iterator();
        while (it.hasNext()) {
            ((C53P) it.next()).Div(min, this.A03);
        }
    }

    public static final void A02(RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior) {
        Number number;
        if (refreshableAppBarLayoutBehavior.A03 > 0) {
            refreshableAppBarLayoutBehavior.A09 = true;
            C55982hj c55982hj = refreshableAppBarLayoutBehavior.A0J;
            c55982hj.A0A(refreshableAppBarLayoutBehavior);
            c55982hj.A09(C55942hf.A04(70.0d, 11.0d));
            c55982hj.A02 = 1.0d;
            c55982hj.A00 = 0.5d;
            if (refreshableAppBarLayoutBehavior.A06 == C05F.A00) {
                number = Float.valueOf(refreshableAppBarLayoutBehavior.A02);
            } else {
                number = 0;
            }
            c55982hj.A06(number.doubleValue());
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
        if (this.A06 == C05F.A00) {
            this.A0F.A00(1.0d, true);
            InterfaceC70513Em interfaceC70513Em = this.A05;
            if (interfaceC70513Em != null) {
                interfaceC70513Em.setIsLoading(true);
            }
            Iterator it = this.A0G.iterator();
            while (it.hasNext()) {
                ((C53P) it.next()).DeM();
            }
        }
    }

    public RefreshableAppBarLayoutBehavior(View view, AnonymousClass711 anonymousClass711, boolean z) {
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A06 = true;
        this.A0J = A02;
        this.A0G = new CopyOnWriteArrayList();
        this.A0H = new CopyOnWriteArrayList();
        this.A0I = new ArrayList();
        this.A0F = new C70543Eq(String.valueOf(hashCode()));
        this.A06 = C05F.A01;
        this.A04 = new AnonymousClass713(view, anonymousClass711, this);
        this.A0E = z;
    }

    public static final void A03(RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior, int i) {
        View view;
        int abs = Math.abs(i);
        int i2 = refreshableAppBarLayoutBehavior.A03;
        if (i2 < refreshableAppBarLayoutBehavior.A00) {
            i2 += abs;
            refreshableAppBarLayoutBehavior.A03 = i2;
        }
        if (!(refreshableAppBarLayoutBehavior.A05 instanceof C71094Wnq) && (view = refreshableAppBarLayoutBehavior.A0D) != null) {
            view.setTranslationY(i2);
            int i3 = refreshableAppBarLayoutBehavior.A03;
            Iterator it = refreshableAppBarLayoutBehavior.A0I.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setTranslationY(i3);
            }
            refreshableAppBarLayoutBehavior.A0J.A05(refreshableAppBarLayoutBehavior.A03);
            refreshableAppBarLayoutBehavior.A01();
            if (refreshableAppBarLayoutBehavior.A03 >= refreshableAppBarLayoutBehavior.A00) {
                A02(refreshableAppBarLayoutBehavior);
            }
        }
        if (refreshableAppBarLayoutBehavior.A03 >= refreshableAppBarLayoutBehavior.A02) {
            refreshableAppBarLayoutBehavior.A06 = C05F.A00;
            InterfaceC70513Em interfaceC70513Em = refreshableAppBarLayoutBehavior.A05;
            if (interfaceC70513Em != null) {
                interfaceC70513Em.setIsLoading(true);
            }
        }
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public final boolean A0R(int i) {
        return super.A0R(i);
    }

    public final void A0a(int i) {
        super.A0R(i);
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrolled(int i, float f, int i2) {
    }
}
