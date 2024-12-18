package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.FLo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34579FLo {
    public final View A00;
    public final IgTextView A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;

    public C34579FLo(Context context, View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A01 = AbstractC31175DnJ.A0L(view, R.id.number_of_lists);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.icon);
        this.A02 = igSimpleImageView;
        IgTextView A0L = AbstractC31175DnJ.A0L(view, R.id.label);
        this.A03 = A0L;
        igSimpleImageView.setImageDrawable(AbstractC172497mJ.A00(context));
        A0L.setText(2131953286);
    }
}
