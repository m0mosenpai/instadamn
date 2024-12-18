package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.BdT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25926BdT extends C3OO {
    public final TextView A00;
    public final RecyclerView A01;

    public C25926BdT(View view) {
        super(view);
        this.A00 = AbstractC25230BEn.A0Q(view, R.id.section_title);
        this.A01 = (RecyclerView) AbstractC166987dD.A0c(view, R.id.value_props_list_recycle_view);
    }
}
