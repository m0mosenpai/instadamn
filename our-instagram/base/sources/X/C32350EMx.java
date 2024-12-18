package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.EMx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32350EMx extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "HighlightsShareSheetFragment";
    public RecyclerView A00;
    public C66362zD A01;
    public C214959fX A02;
    public IgdsButton A03;
    public Reel A04;
    public List A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A07;
    public final FF5 A08;
    public final String A09;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
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
    public final /* synthetic */ int getExtraDragSpace() {
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

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
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
        RecyclerView A0F = AbstractC31176DnK.A0F(view);
        this.A00 = A0F;
        String str = "recyclerView";
        if (A0F != null) {
            A0F.setBackgroundColor(0);
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                C66362zD c66362zD = this.A01;
                if (c66362zD == null) {
                    str = "adapter";
                } else {
                    recyclerView.setAdapter(c66362zD);
                    RecyclerView recyclerView2 = this.A00;
                    if (recyclerView2 != null) {
                        AbstractC31178DnM.A0z(this, recyclerView2);
                        RecyclerView recyclerView3 = this.A00;
                        if (recyclerView3 != null) {
                            recyclerView3.setItemAnimator(null);
                            IgdsButton A0W = AbstractC31173DnH.A0W(view, R.id.share_story_button);
                            A0W.setEnabled(true);
                            ViewOnClickListenerC35679FpE.A01(A0W, 44, this);
                            this.A03 = A0W;
                            C50965MfY c50965MfY = (C50965MfY) this.A07.getValue();
                            if (c50965MfY != null) {
                                AbstractC31180DnO.A1F(getViewLifecycleOwner(), c50965MfY.A00, new B8U(this, 45), 53);
                            }
                            A00(this);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static final void A00(C32350EMx c32350EMx) {
        C50965MfY c50965MfY = (C50965MfY) c32350EMx.A07.getValue();
        if (c50965MfY != null) {
            c50965MfY.A00(c32350EMx.requireContext(), AbstractC31173DnH.A0t(c32350EMx.A06));
        }
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        Context requireContext = c32350EMx.requireContext();
        C1571273r c1571273r = new C1571273r();
        c1571273r.A00 = AbstractC167007dF.A09(requireContext, R.attr.elevatedBackgroundColor);
        A0E.A00(new C39094HIs(c1571273r, EnumC153216up.A06));
        C66362zD c66362zD = c32350EMx.A01;
        if (c66362zD == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        c66362zD.A05(A0E);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        if (this.A00 == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        return !r1.canScrollVertically(-1);
    }

    public C32350EMx() {
        B8S b8s = new B8S(this, 45);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new B8S(new B8S(this, 42), 43));
        this.A07 = AbstractC25225BEi.A0a(new B8S(A00, 44), b8s, new B61(45, null, A00), AbstractC25225BEi.A1D(C50965MfY.class));
        this.A08 = new FF5(this);
        this.A09 = "highlights_share_sheet";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C32350EMx r7, boolean r8) {
        /*
            com.instagram.common.recyclerview.ViewModelListUpdate r5 = X.AbstractC31171DnF.A0E()
            r6 = 0
            if (r8 == 0) goto L6a
            android.content.Context r1 = r7.requireContext()
            X.73r r2 = new X.73r
            r2.<init>()
            r0 = 2130969337(0x7f0402f9, float:1.7547353E38)
            int r0 = X.AbstractC167007dF.A09(r1, r0)
            r2.A00 = r0
            r0 = 2131239217(0x7f082131, float:1.8094735E38)
            r2.A02 = r0
            r0 = 45
            X.FpE r0 = X.ViewOnClickListenerC35679FpE.A00(r7, r0)
            r2.A05 = r0
            X.6up r1 = X.EnumC153216up.A04
        L28:
            X.HIs r0 = new X.HIs
            r0.<init>(r2, r1)
            r5.A00(r0)
        L30:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A00
            java.lang.String r3 = "recyclerView"
            if (r0 == 0) goto L4a
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView r0 = r7.A00
            if (r0 == 0) goto L4a
            int r0 = r0.getHeight()
            r1.height = r0
            X.2zD r0 = r7.A01
            if (r0 != 0) goto L52
            java.lang.String r3 = "adapter"
        L4a:
            X.C14360o3.A0F(r3)
        L4d:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L52:
            r0.A05(r5)
            androidx.recyclerview.widget.RecyclerView r0 = r7.A00
            if (r0 == 0) goto L4a
            int r2 = r0.getHeight()
            androidx.recyclerview.widget.RecyclerView r1 = r7.A00
            if (r1 == 0) goto L4a
            X.GNd r0 = new X.GNd
            r0.<init>(r7, r2)
            r1.post(r0)
            return
        L6a:
            java.util.List r0 = r7.A05
            java.lang.String r1 = "highlightReels"
            if (r0 == 0) goto Lef
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9d
            android.content.Context r1 = r7.requireContext()
            X.73r r2 = new X.73r
            r2.<init>()
            r0 = 2130969337(0x7f0402f9, float:1.7547353E38)
            int r0 = X.AbstractC167007dF.A09(r1, r0)
            r2.A00 = r0
            r0 = 2131968571(0x7f13423b, float:1.957404E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0B = r0
            r0 = 2131968570(0x7f13423a, float:1.9574038E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0A = r0
            X.6up r1 = X.EnumC153216up.A02
            goto L28
        L9d:
            com.instagram.model.reels.Reel r0 = r7.A04
            if (r0 != 0) goto Lb7
            java.util.List r0 = r7.A05
            if (r0 == 0) goto Lef
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            if (r0 == 0) goto Lb7
            java.util.List r0 = r7.A05
            if (r0 == 0) goto Lef
            java.lang.Object r0 = X.AbstractC166987dD.A16(r0)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            r7.A04 = r0
        Lb7:
            java.util.List r0 = r7.A05
            if (r0 == 0) goto Lef
            java.util.ArrayList r4 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r3 = r0.iterator()
        Lc3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lea
            java.lang.Object r2 = r3.next()
            com.instagram.model.reels.Reel r2 = (com.instagram.model.reels.Reel) r2
            java.lang.String r1 = r2.getId()
            com.instagram.model.reels.Reel r0 = r7.A04
            if (r0 == 0) goto Le8
            java.lang.String r0 = r0.getId()
        Ldb:
            boolean r1 = X.C14360o3.A0K(r1, r0)
            X.Fy8 r0 = new X.Fy8
            r0.<init>(r2, r1)
            r4.add(r0)
            goto Lc3
        Le8:
            r0 = r6
            goto Ldb
        Lea:
            r5.A01(r4)
            goto L30
        Lef:
            X.C14360o3.A0F(r1)
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32350EMx.A01(X.EMx, boolean):void");
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A09;
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

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2zJ, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-769277472);
        super.onCreate(bundle);
        C66392zG A0R = AbstractC31174DnI.A0R(this);
        A0R.A01(new EYY(this, this.A08));
        this.A01 = AbstractC31173DnH.A0R(A0R, new Object());
        C0f9.A09(-1353039234, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1324742524);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_private_story_share_sheet, viewGroup, false);
        C0f9.A09(444274187, A02);
        return inflate;
    }
}
