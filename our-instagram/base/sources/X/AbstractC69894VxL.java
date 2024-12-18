package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.VxL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69894VxL {
    public static final void A01(Context context, UJO ujo, WeH weH, InterfaceC11380iw interfaceC11380iw) {
        int i;
        C14360o3.A0B(context, 0);
        AbstractC167027dH.A13(ujo, weH, interfaceC11380iw);
        ujo.A02.setText(weH.A05);
        ujo.A01.setText(weH.A04);
        ImageUrl imageUrl = weH.A03;
        if (imageUrl != null) {
            ujo.A04.setUrl(imageUrl, interfaceC11380iw);
        } else {
            VG5 vg5 = weH.A02;
            Drawable drawable = context.getDrawable(vg5.A00);
            RoundedCornerImageView roundedCornerImageView = ujo.A04;
            roundedCornerImageView.setImageDrawable(drawable);
            roundedCornerImageView.setScaleType(ImageView.ScaleType.CENTER);
            if (vg5 == VG5.A04) {
                i = R.attr.igds_color_error_or_destructive;
            } else {
                boolean A03 = C1H6.A03();
                i = R.attr.igds_color_icon_on_white;
                if (A03) {
                    i = R.attr.igds_color_icon_on_color;
                }
            }
            AbstractC31177DnL.A0p(context, roundedCornerImageView, AbstractC53242c7.A0H(context, i));
        }
        C0fQ.A00(weH.A01, ujo.A00);
        ujo.A03.setVisibility(AbstractC167007dF.A05(weH.A06 ? 1 : 0));
    }

    public static final ViewGroup A00(Context context, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(LayoutInflater.from(context), viewGroup, R.layout.image_text_arrow_view, false);
        viewGroup2.setTag(new UJO(viewGroup2, AbstractC65702TsY.A0H(viewGroup2, R.id.row_section_title), AbstractC65702TsY.A0H(viewGroup2, R.id.row_section_subtitle), (IgFrameLayout) AbstractC166997dE.A0S(viewGroup2, R.id.highlight_hub_new_tag_section), (RoundedCornerImageView) AbstractC166997dE.A0S(viewGroup2, R.id.row_section_thumbnail)));
        return viewGroup2;
    }
}
