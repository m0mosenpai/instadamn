package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.Vi5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69115Vi5 {
    public final TextView A00;
    public final TextView A01;
    public final ReboundViewPager A02;

    public C69115Vi5(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = (TextView) view.requireViewById(R.id.suggested_user_carousel_title);
        this.A00 = (TextView) view.requireViewById(R.id.suggested_user_carousel_subtitle);
        this.A02 = (ReboundViewPager) view.requireViewById(R.id.netego_rebound_view_pager);
    }
}
