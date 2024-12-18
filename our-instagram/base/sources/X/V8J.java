package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes11.dex */
public final class V8J extends AbstractC117215Sg {
    public final TextView A00;
    public final TextView A01;
    public final IgSimpleImageView A02;

    public V8J(View view, Integer num, int i, int i2) {
        super(view);
        IgSimpleImageView igSimpleImageView;
        this.A01 = AbstractC25230BEn.A0Q(view, i);
        this.A00 = AbstractC25230BEn.A0Q(view, i2);
        if (num != null) {
            igSimpleImageView = (IgSimpleImageView) view.findViewById(num.intValue());
        } else {
            igSimpleImageView = null;
        }
        this.A02 = igSimpleImageView;
    }
}
