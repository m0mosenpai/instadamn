package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.notifications.badging.ui.component.ToastingBadge;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.2wP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64662wP implements InterfaceC60602pj {
    public C65192xH A00;
    public boolean A01;
    public boolean A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C64842wi A05;
    public final C64752wZ A06;
    public final C64742wY A07;
    public final C60862qA A08;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
    }

    @Override // X.InterfaceC60602pj
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
    }

    @Override // X.InterfaceC60602pj
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
    }

    @Override // X.InterfaceC60602pj
    public final void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.2wZ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.2fr, java.lang.Object] */
    public C64662wP(C62862tP c62862tP, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C60862qA c60862qA, final C60662pp c60662pp) {
        this.A08 = c60862qA;
        this.A03 = interfaceC11380iw;
        this.A04 = userSession;
        C64742wY A05 = AbstractC54912fq.A00().A05(userSession, AbstractC06930Yk.A02(new C09530e4(QPTooltipAnchor.A0L, new InterfaceC64682wS() { // from class: X.2wR
            public final Integer A00 = C05F.A00;

            @Override // X.InterfaceC64682wS
            public final int CI5(Context context, UserSession userSession2) {
                return 0;
            }

            @Override // X.InterfaceC64682wS
            public final int CIc(Context context) {
                C14360o3.A0B(context, 0);
                return context.getResources().getDimensionPixelOffset(R.dimen.action_bar_item_spacing_right);
            }

            @Override // X.InterfaceC64682wS
            public final long EM4() {
                return 2000L;
            }

            @Override // X.InterfaceC64682wS
            public final Integer AwQ() {
                return this.A00;
            }

            @Override // X.InterfaceC64682wS
            public final boolean CV9() {
                return true;
            }
        }), new C09530e4(QPTooltipAnchor.A0J, new InterfaceC64682wS() { // from class: X.2wT
            public final Integer A00 = C05F.A00;

            @Override // X.InterfaceC64682wS
            public final int CI5(Context context, UserSession userSession2) {
                return 0;
            }

            @Override // X.InterfaceC64682wS
            public final int CIc(Context context) {
                C14360o3.A0B(context, 0);
                return context.getResources().getDimensionPixelOffset(R.dimen.action_bar_item_spacing_right);
            }

            @Override // X.InterfaceC64682wS
            public final long EM4() {
                return 2000L;
            }

            @Override // X.InterfaceC64682wS
            public final Integer AwQ() {
                return this.A00;
            }

            @Override // X.InterfaceC64682wS
            public final boolean CV9() {
                return true;
            }
        }), new C09530e4(QPTooltipAnchor.A0H, new InterfaceC64682wS() { // from class: X.2wU
            public final Integer A00 = C05F.A01;

            @Override // X.InterfaceC64682wS
            public final int CI5(Context context, UserSession userSession2) {
                return 0;
            }

            @Override // X.InterfaceC64682wS
            public final int CIc(Context context) {
                C14360o3.A0B(context, 0);
                return context.getResources().getDimensionPixelOffset(R.dimen.action_bar_item_spacing_right);
            }

            @Override // X.InterfaceC64682wS
            public final long EM4() {
                return 2000L;
            }

            @Override // X.InterfaceC64682wS
            public final Integer AwQ() {
                return this.A00;
            }

            @Override // X.InterfaceC64682wS
            public final boolean CV9() {
                return true;
            }
        }), new C09530e4(QPTooltipAnchor.A10, new C64712wV()), new C09530e4(QPTooltipAnchor.A0R, new C64712wV()), new C09530e4(QPTooltipAnchor.A0K, new C64712wV()), new C09530e4(QPTooltipAnchor.A0r, new C64712wV()), new C09530e4(QPTooltipAnchor.A1C, new C64712wV()), new C09530e4(QPTooltipAnchor.A0p, new C64712wV()), new C09530e4(QPTooltipAnchor.A0U, new C64712wV()), new C09530e4(QPTooltipAnchor.A0V, new C64712wV()), new C09530e4(QPTooltipAnchor.A12, new C64722wW()), new C09530e4(QPTooltipAnchor.A0D, new InterfaceC64682wS() { // from class: X.2wX
            public final Integer A00 = C05F.A01;

            @Override // X.InterfaceC64682wS
            public final int CI5(Context context, UserSession userSession2) {
                return 0;
            }

            @Override // X.InterfaceC64682wS
            public final int CIc(Context context) {
                C14360o3.A0B(context, 0);
                return context.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
            }

            @Override // X.InterfaceC64682wS
            public final long EM4() {
                return 0L;
            }

            @Override // X.InterfaceC64682wS
            public final Integer AwQ() {
                return this.A00;
            }

            @Override // X.InterfaceC64682wS
            public final boolean CV9() {
                return true;
            }
        })));
        this.A07 = A05;
        AbstractC54912fq.A00();
        this.A06 = new Object();
        AbstractC54912fq.A00();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0e;
        AbstractC54912fq.A00();
        ?? obj = new Object();
        obj.A04 = new InterfaceC55012g0() { // from class: X.2wa
            @Override // X.InterfaceC55012g0
            public final void DSU(C4NL c4nl) {
                C14360o3.A0B(c4nl, 0);
                C60662pp.this.A0E();
                C65192xH c65192xH = this.A00;
                if (c65192xH != null && c4nl != c65192xH.A09) {
                    c65192xH.A09 = c4nl;
                    c65192xH.A0A(-1);
                }
            }
        };
        obj.A02 = new InterfaceC55112gB() { // from class: X.2wb
            @Override // X.InterfaceC55112gB
            public final void DMz(Context context, C4NL c4nl, InterfaceC55362gb interfaceC55362gb, String str) {
                C14360o3.A0B(c4nl, 1);
                C64662wP c64662wP = C64662wP.this;
                C60862qA c60862qA2 = c64662wP.A08;
                C60662pp c60662pp2 = c60862qA2.A00;
                Context context2 = c60662pp2.getContext();
                if (context2 != null && c60662pp2.A0K && !c60862qA2.A00()) {
                    C33J.A00(c64662wP.A04).A02 = true;
                    if (c60662pp2.mView != null) {
                        ((C3FR) c60662pp2.getScrollingViewProxy()).APU();
                    }
                    AbstractC54912fq.A00().A07(context2, c64662wP.A03, c4nl, c64662wP.A05);
                }
                Context context3 = c60662pp2.getContext();
                if (context3 != null && c60662pp2.A0K && !c60862qA2.A00()) {
                    AbstractC54912fq.A00();
                    UserSession userSession2 = c64662wP.A04;
                    QuickPromotionSlot quickPromotionSlot2 = QuickPromotionSlot.A0e;
                    C14360o3.A0B(quickPromotionSlot2, 2);
                    AbstractC69976Vys.A01(context3, userSession2, c4nl, quickPromotionSlot2, null);
                }
                if (c60662pp2.A0K && !c60862qA2.A00()) {
                    AbstractC54912fq.A00();
                    C64842wi c64842wi = c64662wP.A05;
                    C14360o3.A0B(c64842wi, 1);
                    if (C14360o3.A0K(((C4NJ) c4nl).A09.A00, "instagram_direct_launcher")) {
                        c64842wi.Dcq(c4nl);
                        c64842wi.Dco(c4nl, C05F.A01, null);
                    }
                }
            }
        };
        obj.A01(new InterfaceC55022g1() { // from class: X.2wc
            @Override // X.InterfaceC55022g1
            public final void Dtj(C125715mI c125715mI) {
                C14360o3.A0B(c125715mI, 0);
                C64662wP c64662wP = C64662wP.this;
                if (!c64662wP.A08.A00.A0Z()) {
                    c64662wP.A02 = true;
                    c64662wP.A07.A01(c64662wP.A05, c125715mI);
                    if (c125715mI.A00 == QPTooltipAnchor.A12) {
                        C23031Ai A00 = AbstractC23021Ah.A00(c64662wP.A04);
                        A00.A4d.Egi(A00, true, C23031Ai.A8c[110]);
                        return;
                    }
                    return;
                }
                c64662wP.A07.A02(c125715mI, null);
            }

            @Override // X.InterfaceC55022g1
            public final void DXC(C125715mI c125715mI) {
                C64662wP.this.A07.A02 = c125715mI;
            }
        }, A05);
        obj.A00 = new InterfaceC55172gH() { // from class: X.2wd
            @Override // X.InterfaceC55172gH
            public final void D0F(C4NL c4nl) {
                C14360o3.A0B(c4nl, 0);
                C64662wP c64662wP = this;
                C64752wZ c64752wZ = c64662wP.A06;
                QuickPromotionSlot quickPromotionSlot2 = QuickPromotionSlot.A0e;
                D8I d8i = new D8I(33, c4nl, c64662wP);
                UserSession userSession2 = c64662wP.A04;
                FragmentActivity activity = c60662pp.getActivity();
                C14360o3.A0C(activity, "null cannot be cast to non-null type android.app.Activity");
                c64752wZ.A00(activity, userSession2, c4nl, quickPromotionSlot2, d8i);
            }
        };
        obj.A08 = new InterfaceC54962fv() { // from class: X.2we
            @Override // X.InterfaceC54962fv
            public final void AHP() {
                C64662wP c64662wP = C64662wP.this;
                C65192xH c65192xH = c64662wP.A00;
                if (c65192xH != null && null != c65192xH.A09) {
                    c65192xH.A09 = null;
                    c65192xH.A0A(-1);
                }
                C33J.A00(c64662wP.A04).A02 = false;
                C60662pp c60662pp2 = c64662wP.A08.A00;
                if (c60662pp2.mView != null) {
                    ((C3FR) c60662pp2.getScrollingViewProxy()).ARj();
                }
            }
        };
        obj.A06 = new InterfaceC55122gC() { // from class: X.2wf
            @Override // X.InterfaceC55122gC
            public final void DVt() {
                C64662wP c64662wP = C64662wP.this;
                c64662wP.A01 = true;
                C64662wP.A00(c64662wP);
            }
        };
        obj.A07 = new InterfaceC54982fx() { // from class: X.2wg
            @Override // X.InterfaceC54982fx
            public final void DVu() {
                C64662wP c64662wP = C64662wP.this;
                c64662wP.A01 = true;
                C64662wP.A00(c64662wP);
            }
        };
        C54992fy A00 = obj.A00();
        C64832wh c64832wh = new C64832wh(c60662pp, interfaceC11380iw, userSession);
        SparseIntArray sparseIntArray = C55312gW.A02;
        this.A05 = new C64842wi(c60662pp, c62862tP, interfaceC11380iw, userSession, A00, new C55312gW(C1QS.A00(userSession)), quickPromotionSlot, c64832wh);
    }

    public static final void A00(C64662wP c64662wP) {
        View A01 = C60662pp.A01(C1QO.A0E, c64662wP.A08.A00);
        if (c64662wP.A02 && (A01 instanceof ToastingBadge)) {
            ((AbstractC58112lT) A01).getViewModel().A0J.Egh(false);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A07.onDestroyView();
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        this.A07.onPause();
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
