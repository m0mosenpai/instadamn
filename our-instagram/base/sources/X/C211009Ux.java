package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.9Ux, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211009Ux extends C3OO {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final /* synthetic */ C199208rN A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C211009Ux(Context context, View view, C199208rN c199208rN) {
        super(view);
        C14360o3.A0B(view, 3);
        this.A06 = c199208rN;
        this.A00 = AbstractC166987dD.A0c(view, R.id.context_menu_item);
        this.A03 = (TextView) AbstractC166987dD.A0c(view, R.id.context_menu_item_label);
        this.A05 = (TextView) AbstractC166987dD.A0c(view, R.id.context_menu_item_sub_label);
        this.A02 = (ImageView) AbstractC166987dD.A0c(view, R.id.context_menu_item_start_icon);
        ImageView imageView = (ImageView) AbstractC166987dD.A0c(view, R.id.context_menu_item_end_icon);
        this.A01 = imageView;
        this.A04 = (TextView) AbstractC166987dD.A0c(view, R.id.context_menu_item_new_badge);
        imageView.setColorFilter(AbstractC167007dF.A09(context, R.attr.igds_color_primary_icon));
    }
}
