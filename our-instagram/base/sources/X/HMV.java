package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.AudioBrowserCollectionType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes7.dex */
public final class HMV extends AbstractC38513GwY {
    public final UserSession A00;
    public final View A01;
    public final TextView A02;
    public final InterfaceC11380iw A03;
    public final IgImageView A04;
    public final InterfaceC56392iX A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMV(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        super(view);
        C14360o3.A0B(userSession, 2);
        this.A01 = view;
        this.A00 = userSession;
        this.A03 = interfaceC11380iw;
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.header_title);
        this.A04 = AbstractC167007dF.A0T(view, R.id.header_image);
        this.A05 = AbstractC56372iV.A00(view.requireViewById(R.id.header_subtitle_stub));
    }

    public final void A03(C39685HjH c39685HjH) {
        TextView textView;
        C14360o3.A0B(c39685HjH, 0);
        this.A02.setText(((H2J) c39685HjH.A00).A03);
        String str = ((H2J) c39685HjH.A00).A02;
        InterfaceC56392iX interfaceC56392iX = this.A05;
        if (str != null) {
            interfaceC56392iX.getView().setVisibility(0);
            View view = interfaceC56392iX.getView();
            if ((view instanceof TextView) && (textView = (TextView) view) != null) {
                textView.setText(str);
            }
        } else if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView().setVisibility(8);
        }
        InterfaceC11380iw interfaceC11380iw = this.A03;
        if (interfaceC11380iw != null) {
            AbstractC25235BEs.A1I(interfaceC11380iw, this.A04, ((H2J) c39685HjH.A00).A01);
        }
        if (((H2J) c39685HjH.A00).A00 == AudioBrowserCollectionType.A04) {
            UserSession userSession = this.A00;
            if (!AbstractC166987dD.A0x(userSession).getBoolean("has_seen_spotify_audio_browser_upsell", false)) {
                Drawable drawable = AbstractC37301Gc2.A03(this).getDrawable(R.drawable.instagram_app_spotify_pano_filled_24);
                if (drawable == null) {
                    drawable = new ColorDrawable(0);
                }
                Context A03 = AbstractC37301Gc2.A03(this);
                AbstractC25231BEo.A0x(A03, drawable, AbstractC53242c7.A0H(A03, R.attr.igds_color_close_friends_gradient_start));
                C54844OMp c54844OMp = new C54844OMp(AbstractC37301Gc2.A03(this));
                c54844OMp.A07 = AbstractC166997dE.A0q(AbstractC37302Gc3.A05(this), 2131967920);
                c54844OMp.A05 = AbstractC166997dE.A0q(AbstractC37302Gc3.A05(this), 2131967921);
                c54844OMp.A04(drawable);
                c54844OMp.A06 = C05F.A0C;
                c54844OMp.A02(null, AbstractC166997dE.A0p(AbstractC37301Gc2.A03(this), 2131968948));
                try {
                    c54844OMp.A01();
                    AbstractC31177DnL.A1N(AbstractC166987dD.A0x(userSession), "has_seen_spotify_audio_browser_upsell", true);
                } catch (WindowManager.BadTokenException unused) {
                }
            }
        }
    }
}
