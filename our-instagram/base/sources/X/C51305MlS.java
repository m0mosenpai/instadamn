package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.MlS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51305MlS extends C3OO {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51305MlS(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = AbstractC31176DnK.A0T(view, R.id.button_icon);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.button_name);
        this.A00 = AbstractC166997dE.A0S(view, R.id.control_bar_item);
    }
}
