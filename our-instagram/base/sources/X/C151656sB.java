package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.ui.refresh.RefreshableAppBarLayoutBehavior;
import java.util.List;

/* renamed from: X.6sB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151656sB extends C1I2 {
    public float A00;
    public float A01;
    public int A02;
    public final int A03;
    public final ViewOnTouchListenerC60632pm A04;
    public final UserSession A05;
    public final UserDetailTabController A06;
    public final C151676sD A07;
    public final C151686sE A08;
    public final C151666sC A09;
    public final UserDetailFragment A0A;
    public final boolean A0B;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.6sE] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.6sC] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.6sD] */
    public C151656sB(ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, UserSession userSession, UserDetailFragment userDetailFragment, UserDetailTabController userDetailTabController) {
        C14360o3.A0B(userSession, 1);
        this.A05 = userSession;
        this.A0A = userDetailFragment;
        this.A04 = viewOnTouchListenerC60632pm;
        this.A06 = userDetailTabController;
        this.A03 = C3HB.A00(userDetailFragment.requireContext());
        userDetailFragment.requireContext().getResources().getDimensionPixelOffset(AbstractC53242c7.A0H(userDetailFragment.requireContext(), AbstractC57322k7.A01(userSession)));
        this.A02 = -1;
        this.A0B = userDetailFragment.A12();
        this.A09 = new InterfaceC72173Lq() { // from class: X.6sC
            @Override // X.InterfaceC72173Lq
            public final void DvV(float f) {
            }

            @Override // X.InterfaceC72173Lq
            public final boolean E5B() {
                return true;
            }

            @Override // X.InterfaceC72173Lq
            public final boolean Eif() {
                return true;
            }

            @Override // X.InterfaceC72173Lq
            public final boolean Eig(C3FQ c3fq) {
                return false;
            }

            @Override // X.InterfaceC72173Lq
            public final boolean Eih(C3FQ c3fq) {
                return true;
            }

            @Override // X.InterfaceC72173Lq
            public final float Awi(C3FQ c3fq, float f) {
                C151656sB c151656sB = C151656sB.this;
                AnonymousClass715 anonymousClass715 = c151656sB.A06.mViewHolder;
                if (anonymousClass715 == null || anonymousClass715.A0G.A03 <= 0) {
                    float f2 = c151656sB.A01;
                    if (f2 == 0.0f) {
                        if (c151656sB.A00 != 0.0f) {
                            return f;
                        }
                        if (f == 0.0f) {
                            return f;
                        }
                    } else {
                        return f2;
                    }
                }
                return 0.0f;
            }

            @Override // X.InterfaceC72173Lq
            public final boolean EiW() {
                return !AbstractC82073lT.A03(C151656sB.this.A05);
            }
        };
        this.A07 = new InterfaceC155836zD() { // from class: X.6sD
            @Override // X.InterfaceC155846zE
            public final void DWT(AppBarLayout appBarLayout, int i) {
                C151656sB c151656sB = C151656sB.this;
                float f = c151656sB.A00;
                float f2 = i;
                c151656sB.A00 = f2;
                c151656sB.A01 = f - f2;
                C3FQ A0A = c151656sB.A06.A0A();
                if (A0A != null) {
                    c151656sB.A04.A08(A0A);
                }
                c151656sB.A01 = 0.0f;
            }
        };
        this.A08 = new C53P() { // from class: X.6sE
            @Override // X.C53P
            public final void DeM() {
            }

            @Override // X.C53P
            public final void Div(float f, int i) {
            }

            @Override // X.C53P
            public final void Doy() {
            }

            @Override // X.C53P
            public final void Do9() {
                C151656sB.this.A06.A0A();
            }

            @Override // X.C53P
            public final void Doz() {
                C151656sB c151656sB = C151656sB.this;
                C3FQ A0A = c151656sB.A06.A0A();
                if (A0A != null) {
                    if (c151656sB.A00 * (-1.0f) < c151656sB.A03) {
                        c151656sB.A04.A0D = true;
                    }
                    c151656sB.A04.A0A(A0A, true);
                }
            }
        };
    }

    public static final void A00(C151656sB c151656sB) {
        AppBarLayout appBarLayout;
        UserDetailTabController userDetailTabController = c151656sB.A06;
        AnonymousClass715 anonymousClass715 = userDetailTabController.mViewHolder;
        if (anonymousClass715 != null && (appBarLayout = anonymousClass715.A0B) != null) {
            appBarLayout.A03(c151656sB.A07);
        }
        AnonymousClass715 anonymousClass7152 = userDetailTabController.mViewHolder;
        if (anonymousClass7152 != null) {
            RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior = anonymousClass7152.A0G;
            C151686sE c151686sE = c151656sB.A08;
            C14360o3.A0B(c151686sE, 0);
            refreshableAppBarLayoutBehavior.A0G.remove(c151686sE);
        }
        AnonymousClass715 anonymousClass7153 = userDetailTabController.mViewHolder;
        if (anonymousClass7153 != null) {
            AbstractC13880nE.A0f(anonymousClass7153.A03, 0);
            AbstractC13880nE.A0f(userDetailTabController.mViewHolder.A02, 0);
            AbstractC13880nE.A0f(userDetailTabController.mViewHolder.A06, 0);
        }
        UserDetailFragment userDetailFragment = c151656sB.A0A;
        if (userDetailFragment.getContext() != null) {
            boolean z = !AbstractC52812bN.A01(userDetailFragment.requireContext().getResources().getConfiguration().screenWidthDp);
            InterfaceC53722dB A00 = AbstractC54852fj.A00();
            if (A00 != null) {
                A00.EkV(z);
            }
        }
        c151656sB.A04.A02();
    }

    public static final void A01(final C151656sB c151656sB) {
        AppBarLayout appBarLayout;
        AnonymousClass715 anonymousClass715;
        final TabLayout tabLayout;
        ViewTreeObserver viewTreeObserver;
        ViewGroup viewGroup;
        Object parent;
        View view;
        UserDetailFragment userDetailFragment = c151656sB.A0A;
        View view2 = userDetailFragment.mView;
        if (view2 != null) {
            UserDetailTabController userDetailTabController = c151656sB.A06;
            AnonymousClass715 anonymousClass7152 = userDetailTabController.mViewHolder;
            if (anonymousClass7152 != null && (view = anonymousClass7152.A00) != null) {
                AbstractC13880nE.A0d(view, c151656sB.A03);
            }
            boolean z = c151656sB.A0B;
            boolean z2 = false;
            if (z && (parent = view2.getParent()) != null) {
                AbstractC13880nE.A0d((View) parent, 0);
            }
            C56352iT A04 = C56352iT.A0t.A04(userDetailFragment);
            C16930sl c16930sl = C16930sl.A00;
            List list = c16930sl;
            UserSession userSession = c151656sB.A05;
            C14360o3.A0B(userSession, 0);
            if (AbstractC82073lT.A03(userSession)) {
                if (AbstractC82073lT.A04(userSession)) {
                    viewGroup = A04.A0O;
                } else {
                    viewGroup = A04.A0P;
                }
                list = AbstractC16960so.A1O(viewGroup);
            }
            boolean A01 = AbstractC52812bN.A01(userDetailFragment.requireContext().getResources().getConfiguration().screenWidthDp);
            ViewGroup viewGroup2 = null;
            ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = c151656sB.A04;
            int i = c151656sB.A03;
            viewOnTouchListenerC60632pm.A05(c151656sB.A09, c16930sl, list, i, true);
            boolean A03 = AbstractC82073lT.A03(userSession);
            if (A03 && (anonymousClass715 = userDetailTabController.mViewHolder) != null && (tabLayout = anonymousClass715.A0C) != null && (viewTreeObserver = tabLayout.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.6sM
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        TabLayout tabLayout2 = TabLayout.this;
                        if (tabLayout2.getMeasuredHeight() > 0) {
                            c151656sB.A04.A03(r0.A03 + tabLayout2.getMeasuredHeight());
                            ViewTreeObserver viewTreeObserver2 = tabLayout2.getViewTreeObserver();
                            if (viewTreeObserver2 != null) {
                                viewTreeObserver2.removeOnGlobalLayoutListener(this);
                            }
                        }
                    }
                });
            }
            AnonymousClass715 anonymousClass7153 = userDetailTabController.mViewHolder;
            if (anonymousClass7153 != null && (appBarLayout = anonymousClass7153.A0B) != null) {
                appBarLayout.A02(c151656sB.A07);
            }
            AnonymousClass715 anonymousClass7154 = userDetailTabController.mViewHolder;
            if (anonymousClass7154 != null) {
                RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior = anonymousClass7154.A0G;
                C151686sE c151686sE = c151656sB.A08;
                C14360o3.A0B(c151686sE, 0);
                List list2 = refreshableAppBarLayoutBehavior.A0G;
                if (!list2.contains(c151686sE)) {
                    list2.add(c151686sE);
                }
            }
            C01L A1I = C0eM.A1I();
            if (AbstractC82073lT.A03(userSession) && !A03) {
                AnonymousClass016.A18(A1I, AbstractC13880nE.A11(A04.A0O));
                A1I.add(A04.A0P);
            }
            InterfaceC53722dB A00 = AbstractC54852fj.A00();
            if (A00 != null) {
                viewGroup2 = A00.C4t();
            }
            if (A01 && viewGroup2 != null) {
                A00.EfK(viewGroup2);
            }
            C01L A1J = C0eM.A1J(A1I);
            if (!A1J.isEmpty()) {
                viewOnTouchListenerC60632pm.A0A = A1J;
            }
            AnonymousClass715 anonymousClass7155 = userDetailTabController.mViewHolder;
            if (anonymousClass7155 != null) {
                AbstractC13880nE.A0f(anonymousClass7155.A03, i);
                AbstractC13880nE.A0f(userDetailTabController.mViewHolder.A02, i);
                AbstractC13880nE.A0f(userDetailTabController.mViewHolder.A06, i);
            }
            if (!z) {
                z2 = true;
            }
            InterfaceC53722dB A002 = AbstractC54852fj.A00();
            if (A002 != null) {
                A002.EkV(z2);
            }
        }
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int A03 = C0f9.A03(-1335299175);
        C14360o3.A0B(c3fq, 0);
        if (this.A02 == -1) {
            i6 = 511817369;
        } else {
            this.A04.onScroll(c3fq, i, i2, i3, i4, i5);
            i6 = -146679594;
        }
        C0f9.A0A(i6, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A03 = C0f9.A03(122312237);
        C14360o3.A0B(c3fq, 0);
        this.A02 = i;
        if (i == 0 && this.A00 * (-1.0f) < this.A03) {
            this.A04.A0D = true;
        }
        this.A04.onScrollStateChanged(c3fq, i);
        C0f9.A0A(-1038351283, A03);
    }
}
