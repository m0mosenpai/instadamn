package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;

/* renamed from: X.EYv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32647EYv extends AbstractC66422zJ {
    public final Context A00;
    public final FragmentActivity A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final FanClubConsiderationViewModel A04;
    public final String A05;
    public final String A06;

    public C32647EYv(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, FanClubConsiderationViewModel fanClubConsiderationViewModel, String str, String str2) {
        AbstractC25229BEm.A1I(userSession, 3, fanClubConsiderationViewModel);
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A03 = userSession;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = fanClubConsiderationViewModel;
        this.A02 = interfaceC11380iw;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new E3N(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.fan_club_consideration_teaser_view, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        View view;
        View.OnClickListener onClickListener;
        C32094E8s c32094E8s = (C32094E8s) interfaceC66482zP;
        E3N e3n = (E3N) c3oo;
        AbstractC167007dF.A1K(c32094E8s, e3n);
        RoundedCornerImageView roundedCornerImageView = e3n.A03;
        roundedCornerImageView.setUrl(c32094E8s.A00, this.A02);
        roundedCornerImageView.A0I = C23706Aef.A00;
        RoundedCornerImageView roundedCornerImageView2 = e3n.A04;
        roundedCornerImageView2.setBackgroundColor(Color.argb(128, 0, 0, 0));
        IgImageView igImageView = e3n.A02;
        Context context = this.A00;
        C14360o3.A0B(context, 0);
        Drawable drawable = context.getDrawable(R.drawable.reels_pano_filled_16);
        if (drawable != null) {
            AbstractC25231BEo.A0x(context, drawable, AbstractC53242c7.A0H(context, R.attr.igds_color_icon_on_media));
            igImageView.setImageDrawable(drawable);
            int i = 8;
            if (AbstractC167007dF.A1X(c32094E8s.A01, VFX.A03)) {
                i = 0;
            }
            igImageView.setVisibility(i);
            String str = c32094E8s.A02;
            if (str != null && str.length() != 0) {
                e3n.A01.setVisibility(8);
                roundedCornerImageView2.setVisibility(8);
                view = e3n.A00;
                onClickListener = new FpQ(68, this, c32094E8s);
            } else {
                roundedCornerImageView2.setVisibility(0);
                IgImageView igImageView2 = e3n.A01;
                Drawable drawable2 = context.getDrawable(R.drawable.instagram_crown_pano_filled_24);
                if (drawable2 != null) {
                    AbstractC25231BEo.A0x(context, drawable2, AbstractC53242c7.A0H(context, R.attr.igds_color_icon_on_media));
                } else {
                    drawable2 = null;
                }
                igImageView2.setImageDrawable(drawable2);
                igImageView2.setVisibility(0);
                view = e3n.A00;
                onClickListener = ViewOnClickListenerC35661Fov.A00;
            }
            C0fQ.A00(onClickListener, view);
            return;
        }
        throw AbstractC25227BEk.A0n();
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32094E8s.class;
    }
}
