package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes6.dex */
public abstract class FA9 {
    public static final void A00(FOF fof, String str) {
        fof.A05.setVisibility(0);
        fof.A07.setVisibility(8);
        fof.A04.setVisibility(8);
        TextView textView = fof.A03;
        textView.setTypeface(Typeface.defaultFromStyle(1));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        if (str.length() == 0) {
            fof.A02.setVisibility(8);
        } else {
            TextView textView2 = fof.A02;
            textView2.setText(str);
            textView2.setEllipsize(truncateAt);
            textView2.setMaxLines(1);
        }
        fof.A01.setVisibility(8);
        IgSimpleImageView igSimpleImageView = fof.A06;
        igSimpleImageView.setImageResource(R.drawable.instagram_chevron_right_pano_outline_16);
        igSimpleImageView.setOnClickListener(null);
        ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(igSimpleImageView);
        A0G.setMargins(0, 0, 0, 0);
        igSimpleImageView.setLayoutParams(A0G);
        Drawable drawable = igSimpleImageView.getDrawable();
        Context context = igSimpleImageView.getContext();
        AbstractC31173DnH.A0y(context, drawable, AbstractC53242c7.A0B(context));
        View view = fof.A00;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), 0, view.getPaddingBottom());
    }
}
