package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes4.dex */
public final class A7I {
    public final TextView A00;
    public final IgImageView A01;

    public A7I(View view) {
        this.A01 = (IgImageView) view.requireViewById(R.id.world_info_icon);
        this.A00 = AbstractC166997dE.A0T(view, R.id.world_info);
    }
}
