package X;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.ui.mediaactions.VideoScrubberSeekBar;

/* loaded from: classes5.dex */
public final class CTW {
    public final VideoScrubberSeekBar A00(Activity activity, C120985dq c120985dq) {
        View childAt;
        View findViewWithTag;
        AbstractC167007dF.A1K(activity, c120985dq);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        if (viewGroup == null || (childAt = viewGroup.getChildAt(0)) == null || (findViewWithTag = childAt.findViewWithTag(AnonymousClass001.A0R("clips_scrubber_", c120985dq.getId()))) == null) {
            return null;
        }
        return (VideoScrubberSeekBar) findViewWithTag.findViewById(com.facebook.R.id.scrubber);
    }
}
