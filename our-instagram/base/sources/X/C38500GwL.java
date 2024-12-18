package X;

import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.GwL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38500GwL extends C3OO {
    public final View A00;
    public final FrameLayout A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgImageView A05;
    public final IgImageView A06;
    public final View A07;

    public C38500GwL(View view) {
        super(view);
        this.A07 = view;
        this.A00 = view;
        this.A06 = AbstractC37302Gc3.A0K(view, R.id.image_view);
        this.A04 = AbstractC31175DnJ.A0L(view, R.id.song_title);
        this.A02 = AbstractC31175DnJ.A0L(view, R.id.artist_name);
        this.A05 = AbstractC37302Gc3.A0K(view, R.id.explicit_icon);
        this.A03 = AbstractC31175DnJ.A0L(view, R.id.display_label);
        this.A01 = (FrameLayout) AbstractC166987dD.A0c(view, R.id.spotlight_banner_frame_layout);
    }
}
