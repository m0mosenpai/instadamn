package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.NyK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54239NyK {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Maw] */
    public static void A00(NXU nxu, OFM ofm) {
        View view = nxu.A00;
        Context context = view.getContext();
        Resources resources = context.getResources();
        boolean z = ofm.A07;
        int i = R.attr.igds_color_primary_icon;
        if (z) {
            i = R.attr.igds_color_error_or_destructive;
        }
        int A09 = AbstractC167007dF.A09(context, i);
        Drawable drawable = ofm.A02;
        if (drawable != null) {
            ImageView imageView = nxu.A01;
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int i2 = R.drawable.action_button_ring;
            if (z) {
                i2 = R.drawable.negative_action_button_ring;
            }
            AbstractC31173DnH.A0z(context, imageView, i2);
            imageView.setColorFilter(A09, PorterDuff.Mode.SRC_IN);
            imageView.setImageDrawable(drawable);
        } else {
            ImageUrl imageUrl = ofm.A03;
            if (imageUrl != null) {
                C89533yt c89533yt = new C89533yt(imageUrl, ofm.A06, AbstractC25235BEs.A04(context), context.getResources().getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top), AbstractC31174DnI.A03(context), 0);
                ImageView imageView2 = nxu.A01;
                Drawable drawable2 = ofm.A01;
                if (drawable2 != null) {
                    c89533yt = new C50742Maw(drawable2, c89533yt, AbstractC166997dE.A05(resources));
                }
                imageView2.setImageDrawable(c89533yt);
            }
        }
        ImageView imageView3 = nxu.A01;
        float f = ofm.A00;
        imageView3.setAlpha(f);
        TextView textView = nxu.A02;
        textView.setTextColor(A09);
        textView.setAlpha(f);
        String str = ofm.A05;
        if (str != null) {
            textView.setText(str);
        }
        AbstractC56952jT.A01(textView);
        boolean z2 = ofm.A08;
        if (!z2) {
            imageView3.setEnabled(z2);
            AbstractC31177DnL.A0p(context, imageView3, AbstractC53242c7.A09(context));
            AbstractC31177DnL.A0y(textView, context);
        } else {
            C3P9 A0s = AbstractC166987dD.A0s(view);
            A0s.A04 = new C52374NFq(ofm, 35);
            A0s.A07 = true;
            A0s.A00();
        }
    }
}
