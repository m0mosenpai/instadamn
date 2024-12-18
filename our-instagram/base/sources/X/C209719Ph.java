package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.9Ph, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209719Ph {
    public IgImageView A00;
    public final ImageView A01;
    public final ImageView A02;
    public final IgTextView A03;
    public final IgTextView A04;

    public C209719Ph(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC167007dF.A0T(view, R.id.toast_circular_thumbnail_image);
        this.A04 = (IgTextView) AbstractC166997dE.A0R(view, R.id.toast_message_title);
        this.A03 = (IgTextView) AbstractC166997dE.A0R(view, R.id.toast_message_subtitle);
        this.A01 = (ImageView) AbstractC166997dE.A0R(view, R.id.toast_action_icon);
        this.A02 = (ImageView) AbstractC166997dE.A0R(view, R.id.album_art_preview_button_icon);
    }
}
