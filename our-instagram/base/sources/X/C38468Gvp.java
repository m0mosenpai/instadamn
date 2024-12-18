package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Gvp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38468Gvp extends C3OO {
    public final View A00;
    public final TextView A01;
    public final IgImageView A02;
    public final IgdsButton A03;

    public C38468Gvp(View view) {
        super(view);
        this.A00 = view;
        this.A02 = AbstractC31172DnG.A0Z(view, R.id.sticker_image);
        this.A01 = AbstractC166997dE.A0T(view, R.id.sticker_name);
        this.A03 = (IgdsButton) view.requireViewById(R.id.button);
    }
}
