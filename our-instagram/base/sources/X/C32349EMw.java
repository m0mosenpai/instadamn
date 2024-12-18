package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.EMw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32349EMw extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "PublicCollectionsAudienceSelectorBottomSheetFragment";
    public IgdsListCell A00;
    public IgdsListCell A01;
    public GYG A02;
    public SavedCollection A03;
    public String A04;
    public boolean A05;
    public IgdsBottomButtonLayout A06;
    public boolean A07;
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);

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

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "public_collections_audience_selector_bottom_sheet";
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
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context requireContext;
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC31173DnH.A0Y(view, R.id.private_audience);
        this.A01 = AbstractC31173DnH.A0Y(view, R.id.public_audience);
        IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(view, R.id.done_button);
        this.A06 = A0j;
        String str = "finishedButton";
        if (A0j != null) {
            AbstractC31173DnH.A1H(this, A0j, 2131972699);
            IgdsListCell igdsListCell = this.A00;
            if (igdsListCell == null) {
                str = "privateListCell";
            } else {
                boolean z = !this.A05;
                EnumC53237Nga enumC53237Nga = EnumC53237Nga.A07;
                igdsListCell.A0G(enumC53237Nga, true);
                igdsListCell.setChecked(z);
                C08730cb c08730cb = C17060sy.A01;
                InterfaceC09390do interfaceC09390do = this.A08;
                AbstractC31176DnK.A0g(c08730cb, interfaceC09390do).A0M();
                Integer num = C05F.A01;
                igdsListCell.A0C(new ViewOnClickListenerC35672Fp7(13, (Object) igdsListCell, (Object) this, false));
                igdsListCell.setCompoundButtonClickListener(new ViewOnClickListenerC35672Fp7(14, (Object) igdsListCell, (Object) this, false));
                IgdsListCell igdsListCell2 = this.A01;
                if (igdsListCell2 == null) {
                    str = "publicListCell";
                } else {
                    boolean z2 = this.A05;
                    igdsListCell2.A0G(enumC53237Nga, true);
                    igdsListCell2.setChecked(z2);
                    Integer A0M = AbstractC31176DnK.A0g(c08730cb, interfaceC09390do).A0M();
                    Context requireContext2 = requireContext();
                    if (A0M == num) {
                        igdsListCell2.A0I(AbstractC166997dE.A0p(requireContext2, 2131972826));
                        AbstractC31180DnO.A12(requireContext(), igdsListCell2, 2131972825);
                        requireContext = requireContext();
                        i = R.drawable.instagram_globe_pano_outline_24;
                    } else {
                        igdsListCell2.A0I(AbstractC166997dE.A0p(requireContext2, 2131972815));
                        AbstractC31180DnO.A12(requireContext(), igdsListCell2, 2131972814);
                        requireContext = requireContext();
                        i = R.drawable.instagram_users_pano_outline_24;
                    }
                    Drawable drawable = requireContext.getDrawable(i);
                    if (drawable != null) {
                        igdsListCell2.A09(drawable);
                    }
                    igdsListCell2.A0C(new ViewOnClickListenerC35672Fp7(13, (Object) igdsListCell2, (Object) this, true));
                    igdsListCell2.setCompoundButtonClickListener(new ViewOnClickListenerC35672Fp7(14, (Object) igdsListCell2, (Object) this, true));
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A06;
                    if (igdsBottomButtonLayout != null) {
                        ViewOnClickListenerC35686FpL.A00(igdsBottomButtonLayout, 19, this);
                        A00();
                        return;
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

    private final void A00() {
        View view = this.mView;
        if (view != null) {
            TextView A0N = AbstractC167007dF.A0N(view, R.id.privacy_warning);
            if (this.A07 && this.A05) {
                A0N.setVisibility(0);
                AbstractC25227BEk.A12(A0N, this, 2131972819);
            } else {
                A0N.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.igds.components.textcell.IgdsListCell r4, X.C32349EMw r5, boolean r6) {
        /*
            boolean r0 = r4.A0H
            if (r0 != 0) goto L61
            r0 = 1
            r4.setChecked(r0)
            if (r6 == 0) goto L18
            com.instagram.igds.components.textcell.IgdsListCell r0 = r5.A00
            if (r0 != 0) goto L1f
            java.lang.String r0 = "privateListCell"
        L10:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L18:
            com.instagram.igds.components.textcell.IgdsListCell r0 = r5.A01
            if (r0 != 0) goto L1f
            java.lang.String r0 = "publicListCell"
            goto L10
        L1f:
            r1 = 0
            r0.setChecked(r1)
            r5.A05 = r6
            if (r6 == 0) goto L5e
            java.lang.String r4 = "public"
        L29:
            X.0do r0 = r5.A08
            X.0ll r0 = X.AbstractC166987dD.A0o(r0)
            java.lang.String r3 = r5.A04
            X.0wW r1 = X.AbstractC31172DnG.A0Q(r5, r0, r1)
            java.lang.String r0 = "ig_collections"
            X.0Ai r2 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L5a
            java.lang.String r1 = "public_collections_audience_selector_bottom_sheet"
            java.lang.String r0 = "module_name"
            r2.AAP(r0, r1)
            java.lang.String r0 = "audience_selector_tap"
            X.AbstractC31171DnF.A1B(r2, r0)
            java.lang.String r0 = "collection_id"
            r2.AAP(r0, r3)
            java.lang.String r0 = "collection_type"
            X.AbstractC25233BEq.A17(r2, r0, r4)
            r2.Cht()
        L5a:
            r5.A00()
            return
        L5e:
            java.lang.String r4 = "private"
            goto L29
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32349EMw.A01(com.instagram.igds.components.textcell.IgdsListCell, X.EMw, boolean):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
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

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(867640426);
        super.onCreate(bundle);
        this.A05 = requireArguments().getBoolean("is_public_collection", false);
        this.A07 = requireArguments().getBoolean("arg_has_private_media", false);
        this.A04 = requireArguments().getString("audience_selector_collection_id", null);
        this.A03 = (SavedCollection) requireArguments().getParcelable("audience_selector_collection");
        C0f9.A09(-1344171375, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1011147572);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.public_collections_audience_selector_sheet, viewGroup, false);
        C0f9.A09(399532206, A02);
        return inflate;
    }
}
