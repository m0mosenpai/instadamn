package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56358P0t implements InterfaceC58169PqZ {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public final AbstractC59962oe A04;
    public final UserSession A05;
    public final NK7 A06;
    public final C81X A07;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        String str;
        int i;
        AbstractC59962oe abstractC59962oe = this.A04;
        View A0C = AbstractC25227BEk.A0C(AbstractC31175DnJ.A06(abstractC59962oe), R.layout.layout_share_to_reels_informational);
        this.A01 = AbstractC31173DnH.A0I(A0C, R.id.share_to_reels_icon);
        this.A03 = AbstractC166997dE.A0T(A0C, R.id.share_to_reels_text);
        this.A02 = AbstractC166997dE.A0T(A0C, R.id.share_to_reels_subtext);
        this.A00 = A0C.requireViewById(R.id.share_to_reels_title);
        UserSession userSession = this.A05;
        Integer num = AbstractC58592mI.A00(userSession).A00;
        Integer num2 = C05F.A01;
        if (num == num2) {
            ImageView imageView = this.A01;
            if (imageView == null) {
                str = "shareToReelsIcon";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            imageView.setImageResource(R.drawable.instagram_circle_play_pano_outline_24);
        }
        if (MSZ.A0i(userSession) != num2 || this.A06.A04) {
            View view = this.A00;
            if (view == null) {
                str = "shareToReelsTitle";
            } else {
                OOv.A01(view, false);
                int dimensionPixelSize = AbstractC166997dE.A0N(abstractC59962oe).getDimensionPixelSize(R.dimen.share_option_horizontal_padding);
                int A0E = AbstractC167017dG.A0E(abstractC59962oe.requireContext());
                TextView textView = this.A02;
                if (textView == null) {
                    str = "shareToReelsSubtext";
                } else {
                    AbstractC13880nE.A0k(textView, dimensionPixelSize, A0E, dimensionPixelSize, A0E);
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        TextView textView2 = this.A03;
        if (textView2 == null) {
            str = "shareToReelsText";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        int intValue = AbstractC58592mI.A00(userSession).A00.intValue();
        if (intValue != 1) {
            i = 2131973866;
            if (intValue != 2) {
                i = 2131973865;
            }
        } else {
            i = 2131973867;
        }
        textView2.setText(i);
        return A0C;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A07;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A04;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 44), C07Y.A00(viewLifecycleOwner));
    }

    public C56358P0t(AbstractC59962oe abstractC59962oe, UserSession userSession, NK7 nk7) {
        AbstractC167017dG.A1P(abstractC59962oe, userSession);
        this.A04 = abstractC59962oe;
        this.A05 = userSession;
        this.A06 = nk7;
        this.A07 = C81X.A2i;
    }
}
