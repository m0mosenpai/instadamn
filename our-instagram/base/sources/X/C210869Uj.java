package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.9Uj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210869Uj extends C3OO {
    public final IgTextView A00;
    public final View A01;

    public C210869Uj(View view) {
        super(view);
        this.A01 = view;
        this.A00 = (IgTextView) AbstractC166987dD.A0c(view, R.id.segment_time);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) view.findViewById(R.id.thumbnail_image);
        AbstractC166997dE.A19(view.getContext(), roundedCornerImageView, R.drawable.item_template_placeholder);
        roundedCornerImageView.setStrokeEnabled(false);
    }
}
