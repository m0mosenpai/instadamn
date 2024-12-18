package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes6.dex */
public final class E3M extends C3OO {
    public final Context A00;
    public final View A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgImageView A04;

    public E3M(View view) {
        super(view);
        this.A01 = view;
        this.A00 = AbstractC166997dE.A0L(view);
        this.A04 = AbstractC167007dF.A0T(view, R.id.thumbnail);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.title);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.subtitle);
    }
}
