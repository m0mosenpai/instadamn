package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.9Uy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211019Uy extends C3OO {
    public final View A00;
    public final View A01;
    public final View A02;
    public final FrameLayout A03;
    public final ImageView A04;
    public final ImageView A05;
    public final TextView A06;
    public final TextView A07;
    public final /* synthetic */ C200488tr A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C211019Uy(View view, C200488tr c200488tr) {
        super(view);
        C14360o3.A0B(view, 2);
        this.A08 = c200488tr;
        this.A00 = AbstractC166987dD.A0c(view, R.id.context_menu_item);
        this.A07 = (TextView) AbstractC166987dD.A0c(view, R.id.context_menu_item_label);
        this.A05 = (ImageView) AbstractC166987dD.A0c(view, R.id.context_menu_item_start_icon);
        this.A04 = (ImageView) AbstractC166987dD.A0c(view, R.id.context_menu_item_end_icon);
        this.A03 = (FrameLayout) AbstractC166987dD.A0c(view, R.id.context_menu_item_end_custom_layout);
        this.A01 = AbstractC166987dD.A0c(view, R.id.context_menu_item_divider);
        this.A02 = AbstractC166987dD.A0c(view, R.id.context_menu_item_top_divider);
        this.A06 = (TextView) AbstractC166987dD.A0c(view, R.id.context_menu_item_new_badge);
    }
}
