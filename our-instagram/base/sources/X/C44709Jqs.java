package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Jqs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44709Jqs extends C3OO {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;

    public C44709Jqs(View view) {
        super(view);
        this.A00 = view;
        this.A03 = AbstractC167007dF.A0T(view, R.id.reels_item_image);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.reels_item_earnings);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.reels_item_date);
    }
}
