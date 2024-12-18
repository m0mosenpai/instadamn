package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.VkB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69243VkB {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final IgImageView A03;

    public C69243VkB(View view) {
        this.A00 = view;
        this.A01 = (ImageView) view.requireViewById(R.id.row_newsfeed_icon);
        this.A02 = (TextView) view.requireViewById(R.id.row_newsfeed_text);
        this.A03 = (IgImageView) view.requireViewById(R.id.row_newsfeed_media_image);
    }
}
