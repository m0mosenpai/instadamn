package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes9.dex */
public final class N7K extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "BlockCommentsFromUpsellFragment";
    public IgdsListCell A00;
    public IgdsListCell A01;
    public boolean A02;
    public boolean A03;
    public View A04;
    public final O6L A06;
    public final String A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0E;
    public final int A05 = -1;
    public final InterfaceC09390do A0D = C57511Pfl.A00(this, 49);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "block_comments_from_upsell_fragment";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        Integer num;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("key_target_user_id")) != null) {
            InterfaceC09390do interfaceC09390do = this.A0E;
            interfaceC09390do.getValue();
            UserSession A0r = AbstractC166987dD.A0r(this.A0A);
            Object value = this.A0C.getValue();
            boolean A1R = AbstractC167007dF.A1R(0, A0r, value);
            if (value == EnumC53178Nfa.A07) {
                num = C05F.A0j;
            } else {
                num = C05F.A0Y;
            }
            OVQ.A00.A00(A0r, num, C05F.A01, null, null, null);
            interfaceC09390do.getValue();
            OLM olm = (OLM) this.A0D.getValue();
            String str = this.A07;
            C14360o3.A0B(olm, 0);
            C14360o3.A0B(str, A1R ? 1 : 0);
            olm.A01("upsell_bottom_sheet", str, "comment_block_comments_from");
            IgdsHeadline igdsHeadline = (IgdsHeadline) view.findViewById(R.id.block_comments_from_upsell_headline);
            ImageUrl imageUrl = (ImageUrl) AbstractC153636vY.A00(requireArguments(), ImageUrl.class, "key_target_user_profile_pic_url");
            InterfaceC09390do interfaceC09390do2 = this.A0B;
            igdsHeadline.setCircularImageUrl(imageUrl, AbstractC25225BEi.A15(interfaceC09390do2), null, null, null);
            igdsHeadline.setHeadline(AbstractC166997dE.A0r(AbstractC166997dE.A0N(this), interfaceC09390do2.getValue(), 2131976326));
            boolean A1Z = AbstractC167007dF.A1Z(this.A08);
            IgdsListCell igdsListCell = (IgdsListCell) AbstractC166987dD.A0c(view, R.id.block_comments_from_upsell_row_one);
            String A15 = AbstractC25225BEi.A15(interfaceC09390do2);
            if (A1Z) {
                A00(igdsListCell, A15, A1R);
                this.A00 = igdsListCell;
                IgdsListCell igdsListCell2 = (IgdsListCell) AbstractC166987dD.A0c(view, R.id.block_comments_from_upsell_row_two);
                A01(igdsListCell2, AbstractC25225BEi.A15(interfaceC09390do2), false);
                this.A01 = igdsListCell2;
            } else {
                A01(igdsListCell, A15, A1R);
                this.A01 = igdsListCell;
                IgdsListCell igdsListCell3 = (IgdsListCell) AbstractC166987dD.A0c(view, R.id.block_comments_from_upsell_row_two);
                A00(igdsListCell3, AbstractC25225BEi.A15(interfaceC09390do2), false);
                this.A00 = igdsListCell3;
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.findViewById(R.id.block_comments_from_upsell_bottom_bar);
            String A0v = AbstractC25227BEk.A0v(this, 2131973348);
            String string2 = getString(2131976323);
            NY0 ny0 = new NY0(this, AbstractC25233BEq.A04(this));
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AnonymousClass001.A0B(string2));
            AnonymousClass773.A04(A0H, ny0, A0v);
            igdsBottomButtonLayout.setFooterText(A0H);
            igdsBottomButtonLayout.setPrimaryActionOnClickListener(new Ok6(string, this, 13));
            View findViewById = view.findViewById(R.id.block_comments_from_upsell_scrollview);
            igdsBottomButtonLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC55474OkT(5, findViewById, igdsBottomButtonLayout));
            this.A04 = findViewById;
        }
    }

    private final void A00(IgdsListCell igdsListCell, String str, boolean z) {
        this.A03 = z;
        igdsListCell.setTextCellType(EnumC53237Nga.A07);
        AbstractC31180DnO.A1D(this, igdsListCell, 2131976325);
        igdsListCell.A0H(MSZ.A0q(this, str, 2131976324));
        igdsListCell.setChecked(z);
        C55519OlD.A02(igdsListCell, this, 29);
    }

    private final void A01(IgdsListCell igdsListCell, String str, boolean z) {
        this.A02 = z;
        igdsListCell.setTextCellType(EnumC53237Nga.A07);
        AbstractC31180DnO.A1D(this, igdsListCell, 2131976319);
        igdsListCell.A0H(MSZ.A0q(this, str, 2131976318));
        igdsListCell.setChecked(z);
        C55519OlD.A02(igdsListCell, this, 30);
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

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
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
    public final boolean isScrolledToTop() {
        View view = this.A04;
        if (view != null && !AbstractC43592JPx.A1X(view)) {
            return true;
        }
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public N7K() {
        C57529Pg3 A00 = C57529Pg3.A00(this, 0);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57511Pfl(new C57511Pfl(this, 44), 45));
        this.A0E = AbstractC25225BEi.A0a(new C57511Pfl(A002, 46), A00, new C29895DGj(5, null, A002), AbstractC25225BEi.A1D(C50886MeH.class));
        this.A08 = C57511Pfl.A00(this, 42);
        this.A0B = C57511Pfl.A00(this, 47);
        this.A09 = C57511Pfl.A00(this, 43);
        this.A0C = C57511Pfl.A00(this, 48);
        this.A07 = AbstractC167017dG.A0j();
        this.A0A = AbstractC60492pY.A02(this);
        this.A06 = new O6L(this);
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(254448289);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.block_comments_from_upsell_bottom_sheet, false);
        C0f9.A09(-941098469, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-2132321312);
        super.onDestroyView();
        this.A04 = null;
        C0f9.A09(1296936715, A02);
    }
}
