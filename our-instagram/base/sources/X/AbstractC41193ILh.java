package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.ILh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41193ILh {
    public ImageView A00;
    public TextView A01;
    public C57012jc A02;

    public AbstractC41193ILh(View view) {
        Context context = view.getContext();
        C57012jc A0V = AbstractC31177DnL.A0V(view, R.id.media_tag_indicator_stub);
        this.A02 = A0V;
        A0V.A02 = new C42366IpT(1, context, this);
    }

    public final void A00(Integer num) {
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 0) {
                if (intValue == 2) {
                    this.A02.A03(8);
                    return;
                }
                return;
            }
            this.A02.A03(0);
            ImageView imageView = this.A00;
            imageView.getClass();
            imageView.setImageResource(R.drawable.instagram_shopping_bag_pano_filled_24);
            this.A00.setVisibility(0);
            TextView textView = this.A01;
            textView.getClass();
            textView.setText(2131976875);
            this.A01.setVisibility(0);
            return;
        }
        this.A02.A03(0);
        ImageView imageView2 = this.A00;
        imageView2.getClass();
        imageView2.setImageResource(R.drawable.instagram_user_circle_pano_filled_24);
        this.A00.setVisibility(0);
        TextView textView2 = this.A01;
        textView2.getClass();
        textView2.setVisibility(8);
    }
}
