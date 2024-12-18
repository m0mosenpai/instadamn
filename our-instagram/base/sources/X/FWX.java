package X;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public abstract class FWX {
    public static void A00(Context context, FOQ foq, boolean z) {
        TextView textView = foq.A05;
        C18C.A0F(AbstractC167007dF.A1W(textView));
        if (z) {
            textView.setText(2131962723);
            ImageView imageView = foq.A03;
            imageView.setImageDrawable(AbstractC172497mJ.A02(context, R.drawable.instagram_circle_star_pano_filled_24));
            imageView.setColorFilter(0);
            return;
        }
        textView.setText(2131962721);
        ImageView imageView2 = foq.A03;
        imageView2.setImageResource(R.drawable.instagram_circle_star_pano_outline_24);
        AbstractC31173DnH.A11(context, imageView2, AbstractC53242c7.A08(context));
    }

    public static void A01(Context context, FOQ foq, boolean z) {
        ImageView imageView;
        int color;
        TextView textView = foq.A06;
        if (z) {
            textView.setText(2131972229);
            imageView = foq.A04;
            C14360o3.A0B(context, 0);
            int[] iArr = new int[5];
            C50L.A03(context, null, iArr, R.style.GradientPatternStyle);
            imageView.setImageDrawable(C3LQ.A04(context, iArr, R.drawable.instagram_star_pano_filled_24));
            color = 0;
        } else {
            textView.setText(2131952386);
            imageView = foq.A04;
            imageView.setImageResource(R.drawable.instagram_star_pano_outline_24);
            color = context.getColor(AbstractC53242c7.A08(context));
        }
        imageView.setColorFilter(color);
    }
}
