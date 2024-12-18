package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.ViV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69140ViV {
    public final ImageView A00;
    public final TextView A01;
    public final ColorFilterAlphaImageView A02;

    public C69140ViV(View view) {
        this.A00 = (ImageView) view.requireViewById(R.id.family_bridges_feed_unit_header_image);
        this.A01 = (TextView) view.requireViewById(R.id.family_bridges_feed_unit_header_title);
        this.A02 = (ColorFilterAlphaImageView) view.requireViewById(R.id.family_bridges_feed_unit_more_button);
    }
}
