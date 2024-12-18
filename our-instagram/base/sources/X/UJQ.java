package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

/* loaded from: classes11.dex */
public final class UJQ extends C3OO {
    public C69218Vjl A00;
    public final View A01;
    public final ImageView A02;
    public final ReboundViewPager A03;
    public final CirclePageIndicator A04;

    public UJQ(View view) {
        super(view);
        this.A01 = view;
        this.A03 = (ReboundViewPager) AbstractC166997dE.A0R(view, R.id.view_pager);
        this.A04 = (CirclePageIndicator) AbstractC166997dE.A0R(view, R.id.carousel_page_indicator);
        this.A02 = AbstractC31176DnK.A0D(view, R.id.canvas_right);
    }
}
