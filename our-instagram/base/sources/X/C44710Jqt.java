package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Jqt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44710Jqt extends C3OO {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final IgSimpleImageView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44710Jqt(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A03 = AbstractC31176DnK.A0T(view, R.id.new_release_notification_item_image_view);
        this.A02 = AbstractC167007dF.A0N(view, R.id.new_release_notification_item_track_name);
        this.A01 = AbstractC167007dF.A0N(view, R.id.new_release_notification_item_artist_name);
        this.A00 = AbstractC166997dE.A0S(view, R.id.new_release_notification_item_camera_button);
    }
}
