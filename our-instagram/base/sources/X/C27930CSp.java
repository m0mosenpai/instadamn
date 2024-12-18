package X;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.CSp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27930CSp {
    public final CardView A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgImageView A04;
    public final IgdsBottomButtonLayout A05;

    public C27930CSp(View view) {
        this.A01 = (IgSimpleImageView) AbstractC166997dE.A0R(view, R.id.checkmark_icon);
        this.A00 = (CardView) AbstractC166997dE.A0R(view, R.id.image_card);
        this.A04 = AbstractC167007dF.A0T(view, R.id.image_preview);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.quality_survey_headline_text);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.quality_survey_body_text);
        this.A05 = (IgdsBottomButtonLayout) AbstractC166997dE.A0R(view, R.id.start_survey_button);
    }
}
