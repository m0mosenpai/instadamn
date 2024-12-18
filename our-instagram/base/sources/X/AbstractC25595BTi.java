package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.BTi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25595BTi extends AbstractC59962oe implements InterfaceC60072op, InterfaceC189488aT, C51E, C51D, InterfaceC11480j6, InterfaceC60122ou, InterfaceC60152ox {
    public static final String __redex_internal_original_name = "CommentListBottomsheetBaseFragment";
    public InterfaceC43399JFo A01;
    public InterfaceC16820sZ A02;
    public C3MT A03;
    public boolean A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC16660sJ A0B;
    public final int A0C;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A0D = C1XM.A00(new C29906DGu(this, 45));
    public final InterfaceC09390do A09 = A00(this, 0);
    public C51737MtK A00 = new C51737MtK(0, 0, 8);

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        C14360o3.A0B(context, 0);
        return ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0196, code lost:
    
        if (r4 != null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r25) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC25595BTi.configureActionBar(X.2iU):void");
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        C07S c07s = C07S.RESUMED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MC8(c07s, this, viewLifecycleOwner, null, 26), C07Y.A00(viewLifecycleOwner));
        ((C3I9) AbstractC166987dD.A17(this.A06)).A9e(this);
        InterfaceC09390do interfaceC09390do = this.A09;
        C166747cm c166747cm = new C166747cm(this, AbstractC166987dD.A0r(this.A0A), C28185CbY.A00(interfaceC09390do));
        C1M0 c1m0 = ((C28185CbY) interfaceC09390do.getValue()).A01;
        C14360o3.A0B(c1m0, 0);
        c166747cm.A00 = c1m0;
        registerLifecycleListener(c166747cm);
        super.onViewCreated(view, bundle);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new D89(obj, i));
    }

    public final C26025BfE A03() {
        return (C26025BfE) this.A0D.getValue();
    }

    public final C25814BbV A04() {
        return (C25814BbV) this.A0E.getValue();
    }

    public final UserSession A05() {
        return AbstractC166987dD.A0r(this.A0A);
    }

    public final void A06(C51737MtK c51737MtK) {
        int i;
        boolean z = this instanceof C26953Buu;
        C14360o3.A0B(c51737MtK, 0);
        View view = this.mView;
        if (z) {
            if (view != null) {
                i = c51737MtK.A01 + c51737MtK.A00;
            } else {
                return;
            }
        } else if (view == null) {
            return;
        } else {
            i = c51737MtK.A00;
        }
        AbstractC13880nE.A0Y(view, i);
        view.requestLayout();
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        C3DN A01;
        boolean z2 = this.A04;
        boolean A1S = AbstractC25230BEn.A1S(i, C30D.A01);
        this.A04 = A1S;
        if (!A1S && z2 && A03().A0O) {
            Context context = getContext();
            if (context != null && (A01 = C3DN.A00.A01(context)) != null) {
                A01.A0B();
                return;
            }
            return;
        }
        if (!z) {
            return;
        }
        C51737MtK A0d = AbstractC25225BEi.A0d(i, this.A00.A00, 8);
        this.A00 = A0d;
        A06(A0d);
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        C11520jB c11520jB = new C11520jB();
        c11520jB.A04(new C11500j9(C05F.A0u, "media_id"), A03().A0F);
        return c11520jB;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return C28185CbY.A00(this.A09).getModuleName();
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A0A);
    }

    @Override // X.C51E
    public final boolean isScrolledToBottom() {
        if (this.mView != null) {
            return A04().A00.A01;
        }
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        if (this.mView != null) {
            return A04().A00.A02;
        }
        return true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C166867cy c166867cy = (C166867cy) this.A05.getValue();
        if (c166867cy.A01 == null) {
            return false;
        }
        C166867cy.A02(c166867cy, false);
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        C51737MtK A0d = AbstractC25225BEi.A0d(this.A00.A01, i, 8);
        this.A00 = A0d;
        A06(A0d);
    }

    public AbstractC25595BTi() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new C29906DGu(this, 48));
        this.A06 = C1XM.A00(new C29906DGu(this, 47));
        this.A05 = C1XM.A00(new C29906DGu(this, 46));
        this.A08 = C1XM.A00(new C29906DGu(this, 49));
        D89 d89 = new D89(this, 4);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new D89(new D89(this, 1), 2));
        this.A0E = AbstractC25225BEi.A0a(new D89(A00, 3), d89, new D8L(31, null, A00), AbstractC25225BEi.A1D(C25814BbV.class));
        this.A0B = new C50368MLv(this, 32);
        this.A0C = 1000;
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return this.A0C;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return requireView();
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 1.0f;
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final int getExtraDragSpace() {
        C3DN c3dn;
        int i;
        View view;
        TextView A0L;
        FragmentActivity activity = getActivity();
        C3DN c3dn2 = null;
        if (activity != null) {
            c3dn = C3DN.A00.A00(activity);
        } else {
            c3dn = null;
        }
        C189478aR A00 = F86.A00(c3dn);
        int i2 = 0;
        if (A00 != null && (A0L = A00.A03.A0L()) != null) {
            i = A0L.getHeight();
        } else {
            i = 0;
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            c3dn2 = C3DN.A00.A00(activity2);
        }
        C189478aR A002 = F86.A00(c3dn2);
        if (A002 != null) {
            BottomSheetFragment bottomSheetFragment = A002.A03;
            InterfaceC56392iX interfaceC56392iX = bottomSheetFragment.elementAboveTitleView;
            if (bottomSheetFragment.isAdded() && interfaceC56392iX != null && (view = interfaceC56392iX.getView()) != null) {
                i2 = view.getHeight();
            }
        }
        return i + i2;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC25595BTi.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-2041895805);
        C166867cy c166867cy = (C166867cy) this.A05.getValue();
        if (c166867cy.A01 != null) {
            C166867cy.A02(c166867cy, false);
        }
        ((C3I9) AbstractC166987dD.A17(this.A06)).EFx(this);
        super.onDestroyView();
        C0f9.A09(17200009, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-393920373);
        super.onPause();
        C25814BbV A04 = A04();
        A04.A0B.A01(C30185DRq.A02(A04, 9));
        InterfaceC09390do interfaceC09390do = this.A08;
        ((C3MJ) interfaceC09390do.getValue()).A06(this.A03);
        ((C3MJ) interfaceC09390do.getValue()).A04();
        this.A03 = null;
        C0f9.A09(1842539665, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1734491212);
        super.onResume();
        C51737MtK c51737MtK = this.A00;
        this.A00 = c51737MtK;
        A06(c51737MtK);
        InterfaceC09390do interfaceC09390do = this.A08;
        ((C3MJ) interfaceC09390do.getValue()).A03();
        interfaceC09390do.getValue();
        this.A03 = C3MJ.A00(new C3MR() { // from class: X.7eT
            /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
            
                if (r1.A5N() != false) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
            
                if (r0 == false) goto L27;
             */
            @Override // X.C3MR
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void Dih(long r10) {
                /*
                    r9 = this;
                    X.BTi r6 = X.AbstractC25595BTi.this
                    com.instagram.common.session.UserSession r2 = r6.A05()
                    com.instagram.common.session.UserSession r0 = r6.A05()
                    X.1DX r1 = X.C1DW.A00(r0)
                    X.BfE r0 = r6.A03()
                    java.lang.String r0 = r0.A0F
                    X.1qM r0 = r1.A02(r0)
                    if (r0 == 0) goto Lfb
                    X.1rF r0 = r0.A0C
                    com.instagram.user.model.User r0 = r0.CDj()
                    if (r0 == 0) goto Lfb
                    java.lang.String r1 = r0.getId()
                L26:
                    X.GTS r0 = X.GTS.A00
                    X.FDG.A00(r2, r1, r0)
                    androidx.fragment.app.FragmentActivity r4 = r6.getActivity()
                    if (r4 == 0) goto Lfa
                    X.BbV r0 = r6.A04()
                    X.7bU r0 = r0.A0B
                    X.1qR r0 = r0.A00
                    if (r0 == 0) goto Lfa
                    com.instagram.common.session.UserSession r2 = r6.A05()
                    X.1qM r1 = r0.BQN()
                    r0 = 0
                    X.C14360o3.A0B(r2, r0)
                    r0 = 1
                    X.C14360o3.A0B(r1, r0)
                    int r0 = r1.A0s()
                    r8 = 0
                    if (r0 <= 0) goto L53
                    r8 = 1
                L53:
                    boolean r0 = r1.A5b()
                    if (r0 != 0) goto L6c
                    boolean r0 = r1.A5P()
                    if (r0 != 0) goto L6c
                    boolean r0 = r1.A5O()
                    if (r0 != 0) goto L6c
                    boolean r0 = r1.A5N()
                    r7 = 0
                    if (r0 == 0) goto L6d
                L6c:
                    r7 = 1
                L6d:
                    X.1rF r0 = r1.A0C
                    com.instagram.user.model.User r0 = r0.CDj()
                    boolean r1 = X.C2TN.A06(r0)
                    X.0sy r0 = X.C08730cb.A00(r2)
                    com.instagram.user.model.User r0 = r0.A00()
                    boolean r0 = X.C2TN.A06(r0)
                    if (r1 == 0) goto L88
                    r5 = 1
                    if (r0 != 0) goto L89
                L88:
                    r5 = 0
                L89:
                    X.1Ai r3 = X.AbstractC23021Ah.A00(r2)
                    X.0ry r2 = r3.A7S
                    X.0YR[] r1 = X.C23031Ai.A8c
                    r0 = 279(0x117, float:3.91E-43)
                    r0 = r1[r0]
                    java.lang.Object r0 = r2.CES(r3, r0)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r8 == 0) goto Lfa
                    if (r7 == 0) goto Lfa
                    if (r5 == 0) goto Lfa
                    if (r0 != 0) goto Lfa
                    com.instagram.common.session.UserSession r3 = r6.A05()
                    r0 = 2
                    X.C14360o3.A0B(r3, r0)
                    X.8hC r2 = new X.8hC
                    r2.<init>(r4)
                    r0 = 2131237681(0x7f081b31, float:1.809162E38)
                    android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)
                    r2.A0k(r0)
                    android.content.res.Resources r1 = r4.getResources()
                    r0 = 2131956482(0x7f131302, float:1.954952E38)
                    java.lang.String r0 = r1.getString(r0)
                    r2.A05 = r0
                    android.content.res.Resources r1 = r4.getResources()
                    r0 = 2131956481(0x7f131301, float:1.9549519E38)
                    java.lang.String r0 = r1.getString(r0)
                    r2.A0r(r0)
                    android.content.res.Resources r1 = r4.getResources()
                    r0 = 2131968948(0x7f1343b4, float:1.9574805E38)
                    java.lang.String r1 = r1.getString(r0)
                    X.C14360o3.A07(r1)
                    r0 = 0
                    r2.A0d(r0, r1)
                    X.AP7 r0 = new X.AP7
                    r0.<init>(r3)
                    r2.A0h(r0)
                    android.app.Dialog r0 = r2.A02()
                    X.C0fJ.A00(r0)
                Lfa:
                    return
                Lfb:
                    r1 = 0
                    goto L26
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C167737eT.Dih(long):void");
            }
        });
        C3MJ c3mj = (C3MJ) interfaceC09390do.getValue();
        C3MT c3mt = this.A03;
        C14360o3.A0C(c3mt, "null cannot be cast to non-null type com.instagram.common.screenshot.ScreenshotSession");
        c3mj.A05(c3mt);
        C0f9.A09(-14797507, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1281232495);
        super.onStart();
        ((C3I9) AbstractC166987dD.A17(this.A06)).Dnr(requireActivity());
        C0f9.A09(1895113042, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1232633196);
        super.onStop();
        ((C3I9) AbstractC166987dD.A17(this.A06)).onStop();
        C0f9.A09(-1306877510, A02);
    }
}
