package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

/* loaded from: classes9.dex */
public final class OL8 {
    public View A00;
    public IgAutoCompleteTextView A01;
    public final View A02;
    public final AbstractC59962oe A03;
    public final UserSession A04;
    public final C56064Ouh A05;
    public final C56065Oui A06;
    public final C47Z A07;
    public final InterfaceC190488c6 A08;
    public final String A09;

    public OL8(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, C56064Ouh c56064Ouh, C56065Oui c56065Oui, C47Z c47z, String str) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A03 = abstractC59962oe;
        this.A02 = view;
        this.A07 = c47z;
        this.A09 = str;
        this.A06 = c56065Oui;
        this.A05 = c56064Ouh;
        this.A08 = AbstractC190468c4.A01(abstractC59962oe, userSession, AbstractC167017dG.A0j(), C18U.A06(C06090Tz.A05, userSession, 36311165349069257L));
    }

    public final void A00() {
        View view = this.A02;
        FrameLayout frameLayout = (FrameLayout) AbstractC166997dE.A0R(view, R.id.metadata_thumbnail_container);
        AbstractC59962oe abstractC59962oe = this.A03;
        int dimensionPixelSize = AbstractC166997dE.A0N(abstractC59962oe).getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
        int i = (int) ((dimensionPixelSize * 1.7777778f) + 0.5f);
        ImageView imageView = (ImageView) AbstractC166997dE.A0S(view, R.id.metadata_imageview);
        ImageView imageView2 = (ImageView) AbstractC166997dE.A0S(view, R.id.metadata_loading_spinner);
        ViewGroup viewGroup = (ViewGroup) AbstractC166997dE.A0S(view, R.id.metadata_cta_view);
        TextView textView = (TextView) AbstractC166997dE.A0S(view, R.id.cta_text);
        String str = this.A09;
        if (str != null && MSY.A1Z(str)) {
            C55943Osb c55943Osb = new C55943Osb(viewGroup, frameLayout, imageView, imageView2, textView, this, i, dimensionPixelSize);
            boolean z = C1NC.A02;
            C14120nc.A00().ATO(new C52385NGg(c55943Osb, str, i, dimensionPixelSize));
            return;
        }
        imageView.setVisibility(4);
        imageView2.setVisibility(0);
        Drawable drawable = imageView2.getDrawable();
        if (drawable != null) {
            AbstractC25231BEo.A0x(abstractC59962oe.requireContext(), drawable.mutate(), R.color.grey_5);
            viewGroup.setVisibility(8);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A01(int i) {
        UserSession userSession = this.A04;
        AnonymousClass229.A01(userSession).A1Y(C81X.A1o);
        C6WI.A01().A0T = true;
        MX1.A00(userSession).A04("MEDIA_PREVIEW_TAPPED");
        C50695MZq.A00(userSession, new C52506NKz(i));
    }
}
