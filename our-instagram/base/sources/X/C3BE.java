package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.actionbar.ActionBarTitleViewSwitcher;
import com.instagram.common.session.UserSession;
import com.instagram.mainactivity.InstagramMainActivity;
import java.util.List;

/* renamed from: X.3BE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BE implements InterfaceC65626Tpm {
    public static final C3BF A06 = new Object();
    public boolean A00;
    public final ViewOnTouchListenerC60632pm A01;
    public final UserSession A02;
    public final C3BC A03;
    public final C69453Af A04;
    public final C60862qA A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3Lp] */
    public final void A01(final Activity activity, boolean z, final int i) {
        View view;
        ViewGroup viewGroup;
        List list;
        InterfaceC53732dC interfaceC53732dC;
        final ?? obj = new Object();
        InterfaceC72173Lq interfaceC72173Lq = new InterfaceC72173Lq() { // from class: X.3Lr
            @Override // X.InterfaceC72173Lq
            public final float Awi(C3FQ c3fq, float f) {
                return f;
            }

            @Override // X.InterfaceC72173Lq
            public final boolean Eif() {
                return false;
            }

            @Override // X.InterfaceC72173Lq
            public final boolean Eig(C3FQ c3fq) {
                C14360o3.A0B(c3fq, 0);
                C3BE c3be = this;
                UserSession userSession = c3be.A02;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (!C18U.A06(c06090Tz, userSession, 36317534785377621L) && !C18U.A06(c06090Tz, userSession, 36322980804963124L)) {
                    C3BF c3bf = C3BE.A06;
                    C69453Af c69453Af = c3be.A04;
                    C60862qA c60862qA = c3be.A05;
                    int A00 = C3BF.A00(c69453Af, c60862qA);
                    if (A00 != 0) {
                        if (c3fq.B6q() < A00 || (c3fq.B6q() == A00 && c3fq.AnU(0).getHeight() + c3fq.AnU(0).getTop() > c3bf.A01(activity, c60862qA, i))) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
            
                if (X.C18U.A06(r2, r3, 36322980804963124L) != false) goto L6;
             */
            @Override // X.InterfaceC72173Lq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean Eih(X.C3FQ r6) {
                /*
                    r5 = this;
                    r0 = 0
                    X.C14360o3.A0B(r6, r0)
                    X.3BE r4 = r3
                    com.instagram.common.session.UserSession r3 = r4.A02
                    X.0Tz r2 = X.C06090Tz.A05
                    r0 = 36317534785377621(0x81069b00001555, double:3.030693465022876E-306)
                    boolean r0 = X.C18U.A06(r2, r3, r0)
                    if (r0 != 0) goto L21
                    r0 = 36322980804963124(0x810b8f00102b34, double:3.034137549738109E-306)
                    boolean r1 = X.C18U.A06(r2, r3, r0)
                    r0 = 0
                    if (r1 == 0) goto L22
                L21:
                    r0 = 1
                L22:
                    r2 = 1
                    if (r0 != 0) goto L44
                    X.3Af r1 = r4.A04
                    X.2qA r0 = r4.A05
                    int r1 = X.C3BF.A00(r1, r0)
                    int r0 = r6.AnZ()
                    if (r0 == 0) goto L45
                    if (r1 == 0) goto L45
                    X.3Lp r0 = r2
                    boolean r0 = r0.Eih(r6)
                    if (r0 != 0) goto L44
                    int r0 = r6.B6q()
                    if (r0 == r1) goto L44
                    r2 = 0
                L44:
                    return r2
                L45:
                    X.3Lp r0 = r2
                    boolean r2 = r0.Eih(r6)
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C72183Lr.Eih(X.3FQ):boolean");
            }

            @Override // X.InterfaceC72173Lq
            public final void DvV(float f) {
                obj.DvV(f);
                C3BE c3be = this;
                if (c3be.A00) {
                    C3BE.A00(c3be, false);
                }
                C60662pp c60662pp = c3be.A05.A00;
                C3FY c3fy = c60662pp.A0B;
                if (c3fy != null) {
                    c3fy.A09();
                }
                c3be.A03.A00();
                C3HC c3hc = c60662pp.A0E;
                if (c3hc != null) {
                    C3FQ scrollingViewProxy = c60662pp.getScrollingViewProxy();
                    int B6q = c60662pp.getScrollingViewProxy().B6q();
                    c3hc.A01 = B6q;
                    c3hc.A00 = C3BE.A06.A01(activity, r8, i) - f;
                    C3HC.A00(scrollingViewProxy, c3hc, B6q);
                }
                ActionBarTitleViewSwitcher actionBarTitleViewSwitcher = c60662pp.A0A().A0H().A08;
                if (actionBarTitleViewSwitcher != null) {
                    Activity activity2 = activity;
                    ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = c3be.A01;
                    if (viewOnTouchListenerC60632pm.A01 < 2.0f) {
                        AbstractC123315i6.A00(activity2, actionBarTitleViewSwitcher, viewOnTouchListenerC60632pm, c3be.A02);
                    }
                }
            }

            @Override // X.InterfaceC72173Lq
            public final /* synthetic */ boolean E5B() {
                return false;
            }

            @Override // X.InterfaceC72173Lq
            public final /* synthetic */ boolean EiW() {
                return true;
            }
        };
        ViewGroup viewGroup2 = null;
        if ((activity instanceof InterfaceC53722dB) && (interfaceC53732dC = (InterfaceC53732dC) activity) != null) {
            view = ((C57922l5) ((InstagramMainActivity) interfaceC53732dC).A0k.getValue()).A02;
            viewGroup = interfaceC53732dC.C4t();
        } else {
            view = null;
            viewGroup = null;
        }
        UserSession userSession = this.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36317534785377621L)) {
            viewGroup2 = C56352iT.A0t.A03(activity).A0P;
        }
        if (C18U.A06(c06090Tz, userSession, 36322980804963124L)) {
            View[] viewArr = {view, viewGroup};
            C14360o3.A0B(viewArr, 0);
            list = AbstractC009903n.A0I(viewArr);
        } else {
            list = C16930sl.A00;
        }
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A01;
        viewOnTouchListenerC60632pm.A05(interfaceC72173Lq, list, AbstractC16960so.A1O(viewGroup2), A06.A01(activity, this.A05, i), true);
        if (AbstractC72123Ll.A00(userSession) && z) {
            ViewOnTouchListenerC60632pm.A00(viewOnTouchListenerC60632pm, viewOnTouchListenerC60632pm.A00);
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final void onPause(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        A00(this, true);
        this.A00 = false;
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        this.A00 = true;
        A00(this, false);
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    public static final void A00(C3BE c3be, boolean z) {
        InterfaceC53722dB A00;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C54802fd c54802fd;
        if (C18U.A06(C06090Tz.A05, c3be.A02, 36322980804963124L) && (A00 = AbstractC54852fj.A00()) != null) {
            InstagramMainActivity instagramMainActivity = (InstagramMainActivity) A00;
            C54762fZ c54762fZ = instagramMainActivity.A09;
            if (c54762fZ != null && (c54802fd = c54762fZ.A02) != null) {
                layoutParams = c54802fd.A08.getLayoutParams();
            } else {
                layoutParams = null;
            }
            boolean z2 = false;
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) instagramMainActivity.A0i.getValue()) != null && ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin == marginLayoutParams.bottomMargin) {
                z2 = true;
            }
            if (z != z2) {
                A00.EkV(z);
            }
        }
    }

    public C3BE(ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, UserSession userSession, C3BC c3bc, C69453Af c69453Af, C60862qA c60862qA) {
        this.A03 = c3bc;
        this.A05 = c60862qA;
        this.A04 = c69453Af;
        this.A01 = viewOnTouchListenerC60632pm;
        this.A02 = userSession;
    }
}
