package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.Gw7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38486Gw7 extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final RecyclerView A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38486Gw7(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A03 = AbstractC167007dF.A0N(view, R.id.feed_product_pivots_title);
        this.A02 = AbstractC167007dF.A0N(view, R.id.feed_product_pivots_title_divider);
        this.A01 = AbstractC167007dF.A0N(view, R.id.feed_product_pivots_title_action);
        this.A00 = AbstractC167007dF.A0N(view, R.id.feed_product_pivots_button);
        this.A04 = (RecyclerView) AbstractC166997dE.A0R(view, R.id.products_recyclerview);
    }
}
