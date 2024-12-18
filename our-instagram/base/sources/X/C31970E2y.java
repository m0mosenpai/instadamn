package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.E2y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31970E2y extends C3OO {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;

    public C31970E2y(View view) {
        super(view);
        this.A00 = view;
        this.A01 = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.campfire_create_row_photo);
        this.A03 = AbstractC31175DnJ.A0L(view, R.id.campfire_create_row_title);
        this.A02 = AbstractC31175DnJ.A0L(view, R.id.campfire_create_row_subtitle);
    }
}
