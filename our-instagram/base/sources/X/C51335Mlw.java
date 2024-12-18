package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.base.AspectRatioFrameLayout;

/* renamed from: X.Mlw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51335Mlw extends C3OO {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final AspectRatioFrameLayout A04;

    public C51335Mlw(View view) {
        super(view);
        this.A04 = (AspectRatioFrameLayout) AbstractC166987dD.A0c(view, R.id.suggested_live_container);
        this.A02 = AbstractC31175DnJ.A0L(view, R.id.live_viewer_count);
        this.A01 = AbstractC31175DnJ.A0L(view, R.id.live_username);
        this.A00 = AbstractC31175DnJ.A0L(view, R.id.live_title);
        this.A03 = AbstractC37302Gc3.A0K(view, R.id.suggested_live_cover);
    }
}
