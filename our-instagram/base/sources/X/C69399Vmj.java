package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgButton;

/* renamed from: X.Vmj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69399Vmj {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final IgButton A06;

    public C69399Vmj(View view) {
        this.A05 = AbstractC31180DnO.A06(view);
        this.A02 = (TextView) view.requireViewById(R.id.description);
        this.A03 = (TextView) view.requireViewById(R.id.learn_more);
        this.A06 = (IgButton) view.requireViewById(R.id.learn_more_button);
        this.A04 = (TextView) view.requireViewById(R.id.secondary_cta);
        this.A01 = (TextView) view.requireViewById(R.id.bottom_notice);
        this.A00 = view.requireViewById(R.id.dismiss_button);
    }
}
