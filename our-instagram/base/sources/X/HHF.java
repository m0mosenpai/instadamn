package X;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.SellerBadgeDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HHF extends AbstractC60592pi {
    public View A00;
    public IgTextView A01;
    public IgTextView A02;
    public IgTextView A03;
    public CircularImageView A04;
    public User A05;
    public User A06;
    public final View.OnClickListener A07;
    public final InterfaceC11380iw A08;
    public final UserSession A09;
    public final C41729Ie0 A0A;

    public final void A00(InterfaceC56362iU interfaceC56362iU, SellerBadgeDictIntf sellerBadgeDictIntf, User user) {
        ViewGroup viewGroup = ((C56352iT) interfaceC56362iU).A0O;
        View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.pdp_action_bar_title, viewGroup, false);
        this.A00 = inflate;
        if (inflate != null) {
            this.A04 = (CircularImageView) inflate.findViewById(R.id.merchant_avatar);
            IgTextView igTextView = (IgTextView) inflate.findViewById(R.id.action_bar_title);
            this.A01 = igTextView;
            if (igTextView != null) {
                AbstractC56932jR.A03(igTextView);
            }
            IgTextView igTextView2 = (IgTextView) inflate.findViewById(R.id.merchant_title);
            this.A02 = igTextView2;
            if (igTextView2 != null) {
                AbstractC56952jT.A01(igTextView2);
            }
            IgTextView igTextView3 = this.A02;
            if (igTextView3 != null) {
                C0fQ.A00(this.A07, igTextView3);
            }
            CircularImageView circularImageView = this.A04;
            if (circularImageView != null) {
                C0fQ.A00(this.A07, circularImageView);
            }
            interfaceC56362iU.ESn(inflate);
        }
        A01(sellerBadgeDictIntf, user);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A00 = null;
        this.A04 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
    }

    public final void A01(SellerBadgeDictIntf sellerBadgeDictIntf, User user) {
        String str;
        boolean z;
        String name;
        this.A06 = user;
        this.A05 = user;
        ImageUrl imageUrl = null;
        if (user != null) {
            str = user.getUsername();
            z = user.isVerified();
            imageUrl = user.Bhu();
        } else {
            str = null;
            z = false;
        }
        IgTextView igTextView = this.A02;
        if (igTextView != null) {
            igTextView.setVisibility(0);
            AbstractC167007dF.A0x(this.A01);
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str);
            if (z) {
                C85963sQ.A08(AbstractC166997dE.A0L(igTextView), A0H, true);
            }
            igTextView.setText(A0H);
            igTextView.setContentDescription(str);
        }
        CircularImageView circularImageView = this.A04;
        if (circularImageView != null) {
            if (imageUrl == null) {
                circularImageView.setVisibility(8);
            } else {
                circularImageView.setVisibility(0);
                circularImageView.setUrl(imageUrl, this.A08);
                AbstractC37302Gc3.A0o(circularImageView.getContext(), circularImageView, str, 2131970237);
            }
        }
        IgTextView igTextView2 = null;
        if (sellerBadgeDictIntf != null && (name = sellerBadgeDictIntf.getName()) != null) {
            if (C18U.A06(C06090Tz.A05, this.A09, 36313802458794245L)) {
                View view = this.A00;
                if (view != null) {
                    igTextView2 = (IgTextView) view.findViewById(R.id.seller_badge);
                }
                this.A03 = igTextView2;
                if (igTextView2 != null) {
                    igTextView2.setVisibility(0);
                    igTextView2.setText(name);
                    return;
                }
                return;
            }
        }
        AbstractC167007dF.A0x(this.A03);
    }

    public HHF(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41729Ie0 c41729Ie0) {
        AbstractC167017dG.A1Q(userSession, c41729Ie0);
        this.A09 = userSession;
        this.A08 = interfaceC11380iw;
        this.A0A = c41729Ie0;
        this.A07 = new ViewOnClickListenerC42033Ik2(this, 46);
    }
}
