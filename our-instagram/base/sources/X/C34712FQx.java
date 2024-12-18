package X;

import android.content.Context;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.FQx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34712FQx {
    public final Context A00;
    public final ImageView A01;

    public C34712FQx(Context context, ImageView imageView) {
        C14360o3.A0B(imageView, 2);
        this.A00 = context;
        this.A01 = imageView;
    }

    public final void A00() {
        this.A01.setVisibility(8);
    }

    public final void A01() {
        ImageView imageView = this.A01;
        imageView.setVisibility(0);
        imageView.setOnClickListener(null);
        imageView.setFocusable(false);
        imageView.setClickable(false);
        imageView.setContentDescription(null);
        imageView.setImageResource(R.drawable.instagram_check_outline_16);
        C35251Fgk.A01(imageView, AbstractC53242c7.A0H(this.A00, R.attr.igds_color_success));
    }
}
