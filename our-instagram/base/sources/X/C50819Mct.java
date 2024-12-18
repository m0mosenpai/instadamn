package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.Mct, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50819Mct extends ConstraintLayout {
    public final int A00;
    public final IgLinearLayout A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final RoundedCornerImageView A04;

    public C50819Mct(Context context) {
        super(context, null, 0);
        View.inflate(context, R.layout.lead_gen_view_creatives_service, this);
        this.A03 = AbstractC31172DnG.A0X(this, R.id.header_text_view);
        this.A02 = AbstractC31172DnG.A0X(this, R.id.body_text_view);
        this.A04 = (RoundedCornerImageView) requireViewById(R.id.service_image);
        this.A01 = (IgLinearLayout) requireViewById(R.id.description_container);
        this.A00 = MSX.A01(context);
    }
}
