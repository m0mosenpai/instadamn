package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes5.dex */
public final class C52 extends H8E {
    public final IgImageView A00;
    public final C27930CSp A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        IgImageView igImageView = (IgImageView) AbstractC166987dD.A0c(view, R.id.image_blur_background);
        this.A00 = igImageView;
        this.A01 = new C27930CSp(AbstractC166997dE.A0S(view, R.id.media_quality_survey_container));
        igImageView.A0I = AbstractC27808CNx.A01;
    }
}
