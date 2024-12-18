package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes11.dex */
public final class UJJ extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final IgImageView A02;
    public final IgImageView A03;

    public UJJ(View view) {
        super(view);
        this.A01 = AbstractC167007dF.A0N(view, R.id.title);
        this.A00 = AbstractC167007dF.A0N(view, R.id.subtitle);
        this.A03 = AbstractC167007dF.A0T(view, R.id.image_icon);
        this.A02 = AbstractC167007dF.A0T(view, R.id.circular_image_icon);
    }
}
