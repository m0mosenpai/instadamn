package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgView;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vnc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69453Vnc {
    public C3YB A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final LinearLayout A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final IgView A09;
    public final HorizontalRecyclerPager A0A;
    public final List A0B = new ArrayList();

    public C69453Vnc(View view) {
        this.A02 = view;
        this.A01 = view.requireViewById(R.id.header);
        this.A08 = (TextView) view.requireViewById(R.id.netego_title);
        this.A05 = (TextView) view.requireViewById(R.id.header_dot);
        this.A06 = (TextView) view.requireViewById(R.id.netego_cta);
        this.A03 = (ImageView) view.requireViewById(R.id.netego_overflow);
        this.A07 = (TextView) view.requireViewById(R.id.netego_cta_wrapped);
        this.A0A = (HorizontalRecyclerPager) view.requireViewById(R.id.netego_carousel_view);
        this.A09 = (IgView) view.requireViewById(R.id.footer_space);
        this.A04 = (LinearLayout) view.requireViewById(R.id.follow_requests_container);
    }
}
