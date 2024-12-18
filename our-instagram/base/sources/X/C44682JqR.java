package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.JqR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44682JqR extends C3OO {
    public final ConstraintLayout A00;
    public final IgTextView A01;
    public final IgImageView A02;

    public C44682JqR(View view) {
        super(view);
        this.A00 = (ConstraintLayout) AbstractC166997dE.A0R(view, R.id.gift_container);
        this.A02 = AbstractC167007dF.A0T(view, R.id.gift_image);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.star_price);
    }
}
