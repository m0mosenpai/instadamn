package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes8.dex */
public final class LGL {
    public static final LGL A00 = new Object();

    public final void A00(Context context, InterfaceC11380iw interfaceC11380iw, C45093JxN c45093JxN, L7Z l7z) {
        String str;
        String str2;
        String str3;
        String str4;
        ImageUrl imageUrl;
        boolean A1Y = AbstractC25229BEm.A1Y(l7z);
        L4E l4e = c45093JxN.A05;
        if (l4e != null) {
            str = l4e.A01;
        } else {
            str = null;
        }
        if (l4e != null) {
            str2 = l4e.A02;
            str3 = l4e.A05;
            str4 = l4e.A04;
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
        }
        String A19 = AbstractC166987dD.A19(AbstractC86593tX.A03(context, str, str2, str3, str4));
        l7z.A00();
        ViewGroup viewGroup = l7z.A00;
        if (viewGroup != null) {
            IgImageView igImageView = l7z.A02;
            if (igImageView != null) {
                TextView textView = l7z.A01;
                if (textView != null) {
                    viewGroup.setVisibility(A1Y ? 1 : 0);
                    igImageView.setVisibility(A1Y ? 1 : 0);
                    textView.setText(A19);
                    if (l4e != null && (imageUrl = l4e.A00) != null && !AbstractC81033jX.A03(imageUrl)) {
                        igImageView.setUrl(imageUrl, interfaceC11380iw);
                        return;
                    } else {
                        igImageView.setVisibility(8);
                        return;
                    }
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public final void A01(Context context, L7Z l7z) {
        boolean A1Y = AbstractC25229BEm.A1Y(l7z);
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        A01.append((CharSequence) context.getString(2131953239));
        A01.append((CharSequence) "   ");
        AbstractC37302Gc3.A0q(A01, AbstractC47128KsN.A00(context), A01.length() - 1);
        String A19 = AbstractC166987dD.A19(A01);
        l7z.A00();
        ViewGroup viewGroup = l7z.A00;
        if (viewGroup != null) {
            IgImageView igImageView = l7z.A02;
            if (igImageView != null) {
                TextView textView = l7z.A01;
                if (textView != null) {
                    viewGroup.setVisibility(A1Y ? 1 : 0);
                    igImageView.setVisibility(A1Y ? 1 : 0);
                    textView.setText(A19);
                    Drawable drawable = context.getDrawable(R.drawable.instagram_reels_pano_outline_24);
                    if (drawable != null) {
                        Drawable mutate = drawable.mutate();
                        AbstractC166997dE.A1F(mutate, -1);
                        igImageView.setImageDrawable(mutate);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
