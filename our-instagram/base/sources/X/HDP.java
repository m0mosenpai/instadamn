package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class HDP extends C53Z implements InterfaceC60442pS, C51D {
    public static final String __redex_internal_original_name = "MiniPDPFragment";
    public C41199ILn A00;
    public final InterfaceC09390do A06 = C43206J8d.A00(this, 34);
    public final InterfaceC09390do A05 = C43206J8d.A00(this, 33);
    public final InterfaceC09390do A04 = C43206J8d.A00(this, 32);
    public long A02 = System.currentTimeMillis();
    public final C41072IGp A03 = new C41072IGp(new C43206J8d(this, 30), new C43206J8d(this, 31), C43361JEc.A01(this, 4));
    public C38359Gtv A01 = new C38359Gtv(this);
    public final InterfaceC41501vz A07 = C37816GkW.A00(this, 39);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "shops_mini_pdp";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = new C41199ILn(view, this);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57166PZk(c07s, this, viewLifecycleOwner, null, 19), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
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
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (r3.A29() == X.EnumC39572Hdi.A07) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        if (r11 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        if (r5 != null) goto L28;
     */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0oO, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r0 = -1422075071(0xffffffffab3cdb41, float:-6.7095293E-13)
            int r0 = X.C0f9.A02(r0)
            super.onCreate(r13)
            X.0do r1 = r12.A04
            X.1qM r1 = X.AbstractC25226BEj.A0z(r1)
            if (r1 == 0) goto Lba
            java.util.ArrayList r1 = r1.A3J()
            java.lang.Object r5 = X.AbstractC001800i.A0J(r1)
            com.instagram.user.model.Product r5 = (com.instagram.user.model.Product) r5
            if (r5 == 0) goto L5b
            X.0do r1 = r12.A06
            java.lang.Object r6 = r1.getValue()
            X.GtA r6 = (X.C38315GtA) r6
            X.0oO r4 = new X.0oO
            r4.<init>()
            X.1qM r3 = r6.A00
            if (r3 == 0) goto L43
            X.Hdi r2 = r3.A29()
            X.Hdi r1 = X.EnumC39572Hdi.A04
            if (r2 == r1) goto L40
            X.Hdi r3 = r3.A29()
            X.Hdi r2 = X.EnumC39572Hdi.A07
            r1 = 1
            if (r3 != r2) goto L41
        L40:
            r1 = 0
        L41:
            r4.A00 = r1
        L43:
            X.3d7 r2 = r5.BqJ()
            X.3d7 r1 = X.EnumC77213d7.A04
            boolean r9 = X.AbstractC167007dF.A1X(r2, r1)
            X.6aw r1 = X.AbstractC141776au.A00(r6)
            r7 = 0
            r8 = 4
            X.PZ2 r3 = new X.PZ2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.AbstractC166987dD.A1Z(r3, r1)
        L5b:
            androidx.fragment.app.FragmentActivity r4 = r12.getActivity()
            if (r4 == 0) goto La4
            android.content.Context r6 = r12.getContext()
            if (r6 == 0) goto La4
            X.ILn r1 = r12.A00
            if (r1 == 0) goto L7d
            X.IKU r3 = r1.A01
            com.facebook.shimmer.ShimmerFrameLayout r2 = r3.A03
            r1 = 0
            r2.setVisibility(r1)
            r2.A02()
            androidx.constraintlayout.widget.ConstraintLayout r2 = r3.A01
            r1 = 8
            r2.setVisibility(r1)
        L7d:
            X.0ch r7 = X.AbstractC018607g.A00(r4)
            com.instagram.common.session.UserSession r8 = r12.getSession()
            java.lang.String r2 = ""
            if (r5 == 0) goto L8d
            java.lang.String r10 = r5.A0H
            if (r10 != 0) goto L90
        L8d:
            r10 = r2
            if (r5 == 0) goto L9a
        L90:
            com.instagram.user.model.User r1 = r5.A0B
            if (r1 == 0) goto L9a
            java.lang.String r11 = X.AbstractC76433bn.A00(r1)
            if (r11 != 0) goto L9b
        L9a:
            r11 = r2
        L9b:
            r1 = 0
            X.Ixf r9 = new X.Ixf
            r9.<init>(r1, r12, r5)
            X.ISX.A01(r6, r7, r8, r9, r10, r11)
        La4:
            com.instagram.common.session.UserSession r1 = r12.getSession()
            X.1My r3 = X.AbstractC25651Mw.A00(r1)
            java.lang.Class<X.3HW> r2 = X.C3HW.class
            X.1vz r1 = r12.A07
            r3.A01(r1, r2)
            r1 = -1145443606(0xffffffffbbb9eaea, float:-0.005673756)
            X.C0f9.A09(r1, r0)
            return
        Lba:
            r5 = 0
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HDP.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1388900122);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_mini_pdp_fragment, false);
        C0f9.A09(1040539611, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1882716654);
        super.onDestroy();
        AbstractC25651Mw.A00(getSession()).A02(this.A07, C3HW.class);
        C0f9.A09(1488311028, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        ArrayList arrayList;
        int A02 = C0f9.A02(-1215206822);
        super.onPause();
        InterfaceC09390do interfaceC09390do = this.A04;
        C38321qM A0z = AbstractC25226BEj.A0z(interfaceC09390do);
        long currentTimeMillis = System.currentTimeMillis() - this.A02;
        UserSession session = getSession();
        C38321qM A0z2 = AbstractC25226BEj.A0z(interfaceC09390do);
        if (A0z2 != null) {
            arrayList = A0z2.A3J();
        } else {
            arrayList = null;
        }
        AbstractC41665Ibx.A02(session, A0z, this, arrayList, currentTimeMillis);
        C0f9.A09(1875300650, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1914672776);
        super.onResume();
        this.A02 = System.currentTimeMillis();
        C0f9.A09(-532913934, A02);
    }
}
