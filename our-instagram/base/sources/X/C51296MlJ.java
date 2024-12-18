package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.MlJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51296MlJ extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final RecyclerView A02;

    public C51296MlJ(View view) {
        super(view);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.h_scroll_section_title);
        this.A00 = AbstractC25230BEn.A0Q(view, R.id.h_scroll_section_description);
        this.A02 = (RecyclerView) AbstractC166987dD.A0c(view, R.id.h_scroll_recycle_view);
    }
}
