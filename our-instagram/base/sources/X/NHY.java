package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes9.dex */
public final class NHY extends AbstractC51358MmJ {
    public final UserSession A00;
    public final IgTextView A01;
    public final IgImageView A02;

    public NHY(View view, UserSession userSession) {
        super(view);
        this.A00 = userSession;
        IgImageView A0K = AbstractC37302Gc3.A0K(view, R.id.color_filter_image_view);
        this.A02 = A0K;
        this.A01 = AbstractC31175DnJ.A0L(view, R.id.color_filter_name_text);
        A0K.setScaleType(ImageView.ScaleType.CENTER_CROP);
        A0K.setForeground(view.getContext().getDrawable(R.drawable.color_filter_image_forground));
    }
}
