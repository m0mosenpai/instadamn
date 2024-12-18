package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes11.dex */
public final class UJ5 extends C3OO {
    public final IgSimpleImageView A00;
    public final IgdsButton A01;
    public final View A02;

    public UJ5(View view) {
        super(view);
        this.A02 = view;
        this.A01 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.megaphone_cta_button);
        this.A00 = AbstractC31176DnK.A0T(view, R.id.megaphone_dismiss_button);
    }
}
