package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.9Uu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210979Uu extends C3OO {
    public A9P A00;
    public final View A01;
    public final IgTextView A02;
    public final C3PF A03;
    public final ConstrainedImageView A04;

    public C210979Uu(View view) {
        super(view);
        this.A01 = view;
        this.A04 = (ConstrainedImageView) AbstractC166997dE.A0R(view, R.id.sticker_sheet_redesign_item_drawable);
        this.A02 = (IgTextView) AbstractC166997dE.A0R(view, R.id.new_badge);
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A0D = true;
        A0s.A07 = true;
        this.A03 = C216559iC.A00(A0s, this, 2);
    }
}
