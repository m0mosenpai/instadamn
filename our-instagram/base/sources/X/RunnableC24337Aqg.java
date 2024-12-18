package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.facebook.R;

/* renamed from: X.Aqg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24337Aqg implements Runnable {
    public final /* synthetic */ View A00;

    public RunnableC24337Aqg(View view) {
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        float width = view.getWidth();
        float height = view.getHeight();
        float f = width / height;
        float f2 = width / 0.5625f;
        if (f < 0.5625f) {
            View A0S = AbstractC166997dE.A0S(view, R.id.direct_visual_message_viewer_composer_container);
            View A0S2 = AbstractC166997dE.A0S(view, R.id.direct_visual_message_viewer_self_view_footer_container);
            Context context = view.getContext();
            C14360o3.A0C(context, AbstractC43591JPw.A00(4));
            View findViewById = ((Activity) context).findViewById(R.id.visual_timeline_container);
            int i = (int) (height - f2);
            if (findViewById != null && findViewById.getHeight() > 0) {
                C1812982h.A00(view, i, findViewById);
            } else if (A0S2.getHeight() != 0) {
                C1812982h.A00(view, i, A0S2);
            } else {
                C1812982h.A00(view, i, A0S);
            }
        }
    }
}
