package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Mcs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50818Mcs extends ConstraintLayout {
    public final IgTextView A00;
    public final IgTextView A01;
    public final CircularImageView A02;

    public C50818Mcs(Context context) {
        super(context, null, 0);
        View.inflate(context, R.layout.lead_gen_view_creatives_social_proof, this);
        this.A01 = AbstractC31172DnG.A0X(this, R.id.header_text_view);
        this.A00 = AbstractC31172DnG.A0X(this, R.id.body_text_view);
        this.A02 = AbstractC31173DnH.A0T(this, R.id.reviewer_image);
    }
}
