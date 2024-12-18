package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.SHu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62591SHu {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;

    public C62591SHu(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A03 = (IgTextView) AbstractC166997dE.A0R(view, R.id.title_text);
        this.A02 = (IgTextView) AbstractC166997dE.A0R(view, R.id.edit_button);
        this.A01 = (IgSimpleImageView) AbstractC166997dE.A0R(view, R.id.chevron_icon);
    }
}
