package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.MlG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51293MlG extends C3OO {
    public final IgSimpleImageView A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;

    public C51293MlG(View view) {
        super(view);
        this.A00 = AbstractC31176DnK.A0T(view, R.id.left_action_imageview);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.title_textview);
        this.A01 = AbstractC31176DnK.A0T(view, R.id.right_action_imageview);
    }
}
