package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Vk8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69240Vk8 {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final IgImageView A03;

    public C69240Vk8(View view) {
        this.A00 = view;
        this.A03 = (IgImageView) view.requireViewById(R.id.row_newsfeed_media_image);
        this.A02 = AbstractC31180DnO.A06(view);
        this.A01 = (TextView) view.requireViewById(R.id.text);
    }
}