package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.Jqz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44716Jqz extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final RoundedCornerImageView A02;
    public final RoundedCornerImageView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44716Jqz(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.media_duration_text);
        this.A03 = (RoundedCornerImageView) view.findViewById(R.id.media_transparent_overlay);
        this.A00 = AbstractC166987dD.A0e(view, R.id.media_additional_count);
        this.A02 = (RoundedCornerImageView) AbstractC166987dD.A0c(view, R.id.feed_media_preview_item);
    }
}
