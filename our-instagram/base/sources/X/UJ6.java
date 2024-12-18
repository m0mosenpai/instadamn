package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* loaded from: classes11.dex */
public final class UJ6 extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final C70996WmC A02;

    public UJ6(View view) {
        super(view);
        this.A02 = new C70996WmC((IgImageView) view.requireViewById(R.id.attribution_icon_image), (GradientSpinner) view.requireViewById(R.id.attribution_icon_reel_ring));
        this.A01 = (TextView) view.requireViewById(R.id.attribution_title);
        this.A00 = (TextView) view.requireViewById(R.id.attribution_subtitle);
    }
}
