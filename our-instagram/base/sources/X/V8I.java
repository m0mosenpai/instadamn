package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes11.dex */
public final class V8I extends AbstractC117215Sg {
    public final TextView A00;
    public final IgSimpleImageView A01;

    public V8I(View view) {
        super(view);
        this.A00 = AbstractC25230BEn.A0Q(view, R.id.clips_tooltip_title_text);
        this.A01 = (IgSimpleImageView) view.findViewById(R.id.clips_tooltip_chevron_icon);
    }
}
