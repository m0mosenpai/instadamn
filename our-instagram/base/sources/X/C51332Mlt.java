package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Mlt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51332Mlt extends C3OO {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final IgImageView A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51332Mlt(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A03 = AbstractC167007dF.A0T(view, R.id.background_content);
        this.A04 = AbstractC167007dF.A0T(view, R.id.end_card_image);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.end_card_description);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.watch_more_label);
    }
}
