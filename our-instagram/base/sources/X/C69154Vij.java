package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.Vij, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69154Vij {
    public final View A00;
    public final RecyclerView A01;
    public final RecyclerView A02;

    public C69154Vij(View view) {
        this.A00 = view;
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.column_headers_row);
        this.A01 = recyclerView;
        this.A02 = (RecyclerView) view.requireViewById(R.id.grid_view);
        AbstractC31174DnI.A17(view.getContext(), recyclerView, false);
    }
}
