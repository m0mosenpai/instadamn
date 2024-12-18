package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.VrL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69556VrL {
    public ImageView A00;
    public final C7TH A01;

    public C69556VrL(View view, C7TH c7th) {
        C14360o3.A0B(c7th, 2);
        this.A01 = c7th;
        ImageView imageView = (ImageView) AbstractC56372iV.A01(view.requireViewById(R.id.row_thread_composer_send_silently), false, false).getView();
        this.A00 = imageView;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.A00;
        if (imageView2 != null) {
            WNO.A00(imageView2, 66, this);
        }
    }

    public final void A00() {
        ImageView imageView = this.A00;
        if (imageView != null) {
            boolean BJs = this.A01.BJs();
            int i = R.drawable.instagram_alert_off_pano_outline_24;
            if (BJs) {
                i = R.drawable.instagram_alert_off_pano_filled_24;
            }
            imageView.setImageResource(i);
        }
    }
}
