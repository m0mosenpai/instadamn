package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Mcr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50817Mcr extends ConstraintLayout {
    public final IgTextView A00;
    public final IgImageView A01;

    public C50817Mcr(Context context) {
        super(context, null, 0);
        View.inflate(context, R.layout.lead_gen_view_profile_content_trust_signal_item, this);
        this.A01 = AbstractC31172DnG.A0Z(this, R.id.trust_signal_item_icon);
        this.A00 = AbstractC31172DnG.A0X(this, R.id.trust_signal_item_text);
    }
}
