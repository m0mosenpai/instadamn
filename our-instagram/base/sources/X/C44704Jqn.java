package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Jqn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44704Jqn extends C3OO {
    public final IgSimpleImageView A00;
    public final IgSimpleImageView A01;
    public final IgSimpleImageView A02;

    public C44704Jqn(View view) {
        super(view);
        this.A00 = AbstractC31176DnK.A0T(view, R.id.prompt_image_view);
        this.A01 = AbstractC31176DnK.A0T(view, R.id.prompt_secondary_card_view);
        this.A02 = AbstractC31176DnK.A0T(view, R.id.prompt_tertiary_card_view);
    }
}
