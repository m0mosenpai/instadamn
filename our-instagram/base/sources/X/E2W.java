package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class E2W extends C3OO {
    public final IgLinearLayout A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2W(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.prompt_container);
        this.A01 = AbstractC31176DnK.A0T(view, R.id.emoji);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.prompt_text_view);
    }
}
