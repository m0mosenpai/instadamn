package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Mlb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51314Mlb extends C3OO {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final IgImageView A03;

    public C51314Mlb(View view) {
        super(view);
        this.A00 = view;
        this.A01 = AbstractC31176DnK.A0D(view, R.id.suggestion_icon);
        this.A03 = AbstractC167007dF.A0T(view, R.id.circular_suggestion_icon);
        this.A02 = AbstractC167007dF.A0N(view, R.id.suggestion_text);
    }
}
