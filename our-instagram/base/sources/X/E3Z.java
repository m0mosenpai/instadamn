package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.textview.UpdatableButton;

/* loaded from: classes6.dex */
public final class E3Z extends C3OO {
    public final ImageView A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final CircularImageView A04;
    public final UpdatableButton A05;

    public E3Z(View view) {
        super(view);
        this.A04 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.suggested_channel_image);
        this.A03 = AbstractC31175DnJ.A0L(view, R.id.suggested_channels_title);
        this.A02 = AbstractC31175DnJ.A0L(view, R.id.suggested_channels_subtitle);
        this.A01 = AbstractC31175DnJ.A0L(view, R.id.suggested_channels_member_count);
        this.A05 = (UpdatableButton) AbstractC166987dD.A0c(view, R.id.suggested_channels_join_button);
        this.A00 = (ImageView) AbstractC166987dD.A0c(view, R.id.suggested_channels_dismiss_button);
    }
}
