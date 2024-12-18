package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class FO8 {
    public final ImageView A00;
    public final ImageView A01;
    public final ImageView A02;
    public final LinearLayout A03;
    public final LinearLayout A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;

    public FO8(View view) {
        this.A04 = AbstractC31172DnG.A0B(view, R.id.video_settings_auto_play_enabled_option);
        this.A03 = AbstractC31172DnG.A0B(view, R.id.video_settings_auto_play_disabled_option);
        this.A06 = AbstractC166997dE.A0T(view, R.id.subtitle_photos_free);
        this.A05 = AbstractC166997dE.A0T(view, R.id.video_settings_confirm_button);
        this.A02 = AbstractC31173DnH.A0I(view, R.id.auto_play_enabled_image);
        this.A01 = AbstractC31173DnH.A0I(view, R.id.auto_play_disabled_image);
        this.A07 = AbstractC166997dE.A0T(view, R.id.subtitle_video_settings);
        this.A00 = AbstractC31173DnH.A0I(view, R.id.animated_cloud_set);
    }
}
