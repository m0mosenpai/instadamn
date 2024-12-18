package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes6.dex */
public final class FML {
    public View A00;
    public RecyclerView A01;
    public java.util.Set A02;
    public final SearchEditText A03;

    public FML(View view, SearchEditText searchEditText) {
        this.A00 = view.findViewById(R.id.username_suggestions_container_vscroll);
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.username_suggestions_vscroll);
        this.A01 = A0G;
        Context context = view.getContext();
        AbstractC31174DnI.A16(context, A0G, 1, false);
        C50H c50h = new C50H(context, 1);
        c50h.A01(context.getDrawable(R.drawable.horizontal_divider_1px));
        this.A01.A10(c50h);
        this.A03 = searchEditText;
        this.A02 = AbstractC166987dD.A1H();
    }
}
