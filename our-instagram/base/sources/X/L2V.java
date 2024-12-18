package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes8.dex */
public final class L2V {
    public SearchEditText A00;
    public final RecyclerView A01;
    public final Jnq A02;
    public final C1I4 A03;

    public L2V(Context context, View view, UserSession userSession, C87U c87u) {
        C14360o3.A0B(userSession, 2);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.effect_search_null_state_recycler_view);
        this.A01 = recyclerView;
        Jnq jnq = new Jnq(context, userSession, c87u);
        this.A02 = jnq;
        C44220JgP c44220JgP = new C44220JgP(this, 6);
        this.A03 = c44220JgP;
        AbstractC31174DnI.A15(context, recyclerView);
        recyclerView.setAdapter(jnq);
        recyclerView.A14(c44220JgP);
    }
}
