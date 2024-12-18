package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Mlv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51334Mlv extends C3OO {
    public final View A00;
    public final IgTextView A01;
    public final CircularImageView A02;
    public final InterfaceC56392iX A03;
    public final ImageView A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51334Mlv(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC166987dD.A0c(view, R.id.row_container);
        this.A01 = AbstractC31175DnJ.A0L(view, R.id.row_title);
        this.A02 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.row_primary_image);
        this.A03 = AbstractC31179DnN.A0M(view, R.id.row_user_stacked_avatar);
        this.A04 = (ImageView) AbstractC166987dD.A0c(view, R.id.row_end_image);
    }
}
