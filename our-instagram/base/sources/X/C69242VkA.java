package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.VkA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69242VkA {
    public final View A00;
    public final TextView A01;
    public final CircularImageView A02;
    public final IgImageView A03;

    public C69242VkA(View view) {
        this.A00 = view;
        this.A02 = (CircularImageView) view.requireViewById(R.id.row_newsfeed_user_imageview);
        this.A01 = (TextView) view.requireViewById(R.id.row_newsfeed_text);
        this.A03 = (IgImageView) view.requireViewById(R.id.row_newsfeed_media_image);
    }
}
