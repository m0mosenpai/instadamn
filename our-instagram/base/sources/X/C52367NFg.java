package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.NFg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52367NFg extends IgLinearLayout {
    public C684436h A00;
    public C189478aR A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final IgdsListCell A04;
    public final IgdsListCell A05;
    public final IgdsListCell A06;
    public final IgdsListCell A07;
    public final IgdsListCell A08;
    public final InterfaceC09390do A09;
    public final View A0A;
    public final IgTextView A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52367NFg(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        super(abstractC59962oe.requireContext());
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = abstractC59962oe;
        View inflate = AbstractC25228BEl.A0P(this).inflate(R.layout.layout_audience_radio_button_list, this);
        C14360o3.A07(inflate);
        this.A0A = inflate;
        this.A05 = (IgdsListCell) AbstractC166997dE.A0R(inflate, R.id.everyone_toggle);
        this.A04 = (IgdsListCell) AbstractC166997dE.A0R(inflate, R.id.close_friends_toggle);
        this.A06 = (IgdsListCell) AbstractC166997dE.A0R(inflate, R.id.followers_toggle);
        this.A07 = (IgdsListCell) AbstractC166997dE.A0R(inflate, R.id.public_account_followers_only_toggle);
        this.A08 = (IgdsListCell) AbstractC166997dE.A0R(inflate, R.id.subscribers_only_toggle);
        this.A0B = AbstractC25231BEo.A0d(inflate, R.id.footer_text);
        this.A09 = AbstractC25225BEi.A0a(C57525Pfz.A00(abstractC59962oe, 24), C57525Pfz.A00(this, 25), MSW.A1G(abstractC59962oe, null, 27), AbstractC25225BEi.A1D(C50991Mfy.class));
    }

    private final String getShareSheetLoggingModule() {
        return "clips_share_sheet";
    }

    private final C50991Mfy getViewModel() {
        return MSW.A0X(this.A09);
    }

    public static /* synthetic */ void setEnabledStateOfAllRadioButtons$default(C52367NFg c52367NFg, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c52367NFg.setEnabledStateOfAllRadioButtons(z);
    }

    public final void A00() {
        AbstractC59962oe abstractC59962oe = this.A02;
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        UserSession userSession = this.A03;
        this.A00 = new C684436h(requireActivity, userSession);
        IgdsListCell igdsListCell = this.A05;
        EnumC53237Nga enumC53237Nga = EnumC53237Nga.A07;
        igdsListCell.setTextCellType(enumC53237Nga);
        IgdsListCell igdsListCell2 = this.A04;
        igdsListCell2.setTextCellType(enumC53237Nga);
        IgdsListCell igdsListCell3 = this.A06;
        igdsListCell3.setTextCellType(enumC53237Nga);
        IgdsListCell igdsListCell4 = this.A07;
        igdsListCell4.setTextCellType(enumC53237Nga);
        IgdsListCell igdsListCell5 = this.A08;
        igdsListCell5.setTextCellType(enumC53237Nga);
        InterfaceC09390do interfaceC09390do = this.A09;
        if (MSW.A0X(interfaceC09390do).A01.A01) {
            Context context = getContext();
            Drawable drawable = context.getDrawable(R.drawable.instagram_circle_star_pano_filled_24);
            if (drawable != null) {
                igdsListCell2.A0A(drawable, AbstractC31174DnI.A0q(context, R.color.igds_active_badge));
            } else {
                throw AbstractC166987dD.A12("Required value was null.");
            }
        }
        if (MSW.A0X(interfaceC09390do).A01.A00) {
            Drawable drawable2 = AbstractC166997dE.A0L(this).getDrawable(R.drawable.exclusive_content_audience_selector_crown);
            if (drawable2 != null) {
                igdsListCell5.A0A(drawable2, null);
            } else {
                throw AbstractC166987dD.A12("Required value was null.");
            }
        }
        C55519OlD.A02(igdsListCell, this, 5);
        C55519OlD.A02(igdsListCell2, this, 6);
        C55519OlD.A02(igdsListCell3, this, 7);
        C55519OlD.A02(igdsListCell4, this, 8);
        C55519OlD.A02(igdsListCell5, this, 9);
        boolean A1X = AbstractC167007dF.A1X(MSZ.A0i(userSession), C05F.A01);
        IgTextView igTextView = this.A0B;
        Context context2 = getContext();
        int i = 2131955265;
        if (A1X) {
            i = 2131955266;
        }
        AbstractC166987dD.A1P(context2, igTextView, i);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        C57173PZr A02 = C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 14);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        C07X A0K = AbstractC31173DnH.A0K(abstractC59962oe, anonymousClass191, A02, A00);
        AbstractC23641Du.A05(anonymousClass191, C57173PZr.A02(A0K, c07s, this, null, 15), C07Y.A00(A0K));
    }

    public final C189478aR getBottomSheet() {
        return this.A01;
    }

    public final void setEnabledStateOfAllRadioButtons(boolean z) {
        IgdsListCell igdsListCell = this.A04;
        igdsListCell.setEnabled(z);
        IgdsListCell igdsListCell2 = this.A05;
        igdsListCell2.setEnabled(z);
        IgdsListCell igdsListCell3 = this.A06;
        igdsListCell3.setEnabled(z);
        IgdsListCell igdsListCell4 = this.A07;
        igdsListCell4.setEnabled(z);
        IgdsListCell igdsListCell5 = this.A08;
        igdsListCell5.setEnabled(z);
        float f = 0.3f;
        if (z) {
            f = 1.0f;
        }
        igdsListCell2.setAlpha(f);
        igdsListCell.setAlpha(f);
        igdsListCell3.setAlpha(f);
        igdsListCell4.setAlpha(f);
        igdsListCell5.setAlpha(f);
    }

    public final void setBottomSheet(C189478aR c189478aR) {
        this.A01 = c189478aR;
    }
}
