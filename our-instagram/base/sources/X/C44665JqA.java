package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.JqA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44665JqA extends C3OO {
    public final ConstrainedImageView A00;
    public final RoundedCornerFrameLayout A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44665JqA(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = (RoundedCornerFrameLayout) AbstractC166997dE.A0R(view, R.id.store_sticker_parent);
        this.A00 = (ConstrainedImageView) AbstractC166997dE.A0R(view, R.id.store_sticker_image);
    }
}
