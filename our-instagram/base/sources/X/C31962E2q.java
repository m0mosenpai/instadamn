package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.E2q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31962E2q extends C3OO {
    public C5QE A00;
    public final View A01;
    public final IgTextView A02;
    public final CircularImageView A03;

    public C31962E2q(View view) {
        super(view);
        this.A01 = view;
        this.A03 = AbstractC31176DnK.A0U(view, R.id.social_channel_item_avatar);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.social_channel_item_title);
        this.A00 = MVZ.A00("");
    }
}
