package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsWatchAndBrowseData;
import com.instagram.common.session.UserSession;

/* renamed from: X.GhV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37636GhV {
    public int A00 = -1;
    public final int A01;
    public final int A02;
    public final ClipsViewerConfig A03;
    public final Activity A04;
    public final Context A05;
    public final View A06;
    public final UserSession A07;

    public static final void A00(C37636GhV c37636GhV, int i) {
        ViewGroup viewGroup;
        View view = c37636GhV.A06;
        AbstractC13880nE.A0W(view, i);
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = c37636GhV.A03.A0K;
        if (clipsWatchAndBrowseData != null && clipsWatchAndBrowseData.A0J) {
            View findViewById = view.getRootView().findViewById(R.id.clips_video_container);
            if ((findViewById instanceof ViewGroup) && (viewGroup = (ViewGroup) findViewById) != null) {
                View[] A11 = AbstractC13880nE.A11(viewGroup);
                if (A11.length != 0 && i < A11[0].getHeight()) {
                    A11[0].setY((i - r2.getHeight()) / 2.0f);
                }
            }
        }
    }

    public C37636GhV(Activity activity, Context context, View view, ClipsViewerConfig clipsViewerConfig, UserSession userSession) {
        this.A06 = view;
        this.A05 = context;
        this.A03 = clipsViewerConfig;
        this.A04 = activity;
        this.A07 = userSession;
        this.A01 = AbstractC53242c7.A0G(context, R.attr.bottomSheetTopCornerRadius);
        this.A02 = ((AbstractC13880nE.A06(context) - AbstractC57322k7.A00(activity)) - AbstractC13880nE.A0B(context)) - AbstractC13880nE.A08(context);
    }
}
