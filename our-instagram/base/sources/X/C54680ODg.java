package X;

import android.content.Context;
import com.facebook.R;

/* renamed from: X.ODg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54680ODg {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public C54680ODg(Context context) {
        int dimensionPixelSize;
        this.A02 = AbstractC167017dG.A09(context);
        this.A03 = AbstractC167017dG.A06(context);
        Integer A0J = AbstractC53242c7.A0J(context, R.attr.stackedTimelineVideoTrackHeight);
        if (A0J != null) {
            dimensionPixelSize = A0J.intValue();
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.audition_flow_picker_subtitle_margin_bottom);
        }
        this.A05 = dimensionPixelSize;
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.clips_editor_stacked_timeline_reorder_mode_thumbnail_height_enlarged);
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.avatar_likes_container_width);
    }
}
