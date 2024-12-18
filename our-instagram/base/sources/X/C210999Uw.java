package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.9Uw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210999Uw extends C3OO {
    public final U8W A00;
    public final IgImageView A01;
    public final IgImageView A02;
    public final RoundedCornerFrameLayout A03;
    public final Context A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C210999Uw(View view, Context context) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A04 = context;
        this.A03 = (RoundedCornerFrameLayout) AbstractC166987dD.A0c(view, R.id.canvas_templates_item_container);
        this.A02 = (IgImageView) AbstractC166987dD.A0c(view, R.id.canvas_template_image);
        IgImageView A0T = AbstractC167007dF.A0T(view, R.id.canvas_templates_item_dim);
        this.A01 = A0T;
        int A0E = AbstractC167017dG.A0E(context);
        U8W u8w = new U8W();
        this.A00 = u8w;
        u8w.A01 = A0E;
        u8w.A02 = 77;
        A0T.setImageDrawable(u8w);
    }
}
