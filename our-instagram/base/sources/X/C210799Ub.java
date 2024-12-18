package X;

import android.text.method.LinkMovementMethod;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.9Ub, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210799Ub extends C3OO {
    public final IgTextView A00;

    public C210799Ub(View view) {
        super(view);
        IgTextView igTextView = (IgTextView) AbstractC166987dD.A0c(view, R.id.gallery_grid_meta_gallery_footer_message_text);
        this.A00 = igTextView;
        igTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
