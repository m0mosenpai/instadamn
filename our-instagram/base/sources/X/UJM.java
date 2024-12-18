package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UJM extends C3OO {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final RecyclerView A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJM(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A03 = AbstractC167007dF.A0N(view, R.id.ad_tools_highlights_hub_see_all);
        this.A02 = AbstractC167007dF.A0N(view, R.id.ad_tools_highlights_hub_title);
        this.A01 = AbstractC167007dF.A0N(view, R.id.ad_tools_list_description);
        this.A04 = (RecyclerView) AbstractC166997dE.A0R(view, R.id.ad_tools_highlights_hub_recycler_view);
        this.A00 = AbstractC166997dE.A0S(view, R.id.ad_tools_list_divider);
    }
}
