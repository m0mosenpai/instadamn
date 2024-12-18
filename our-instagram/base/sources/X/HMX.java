package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HMX extends AbstractC38513GwY implements JGL {
    public C3PE A00;
    public final TextView A01;
    public final TextView A02;
    public final C38348Gtk A03;
    public final JPf A04;
    public final LinearLayoutManager A05;
    public final RecyclerView A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMX(View view, C07X c07x, MusicProduct musicProduct, UserSession userSession, C9PK c9pk, JPf jPf, C50664MYh c50664MYh, C50669MYn c50669MYn, C23031Ai c23031Ai, boolean z) {
        super(view);
        boolean A1V = AbstractC167007dF.A1V(userSession);
        AbstractC25234BEr.A0k(3, jPf, musicProduct, c23031Ai, c50669MYn);
        C14360o3.A0B(c50664MYh, 8);
        AbstractC25229BEm.A1J(c9pk, 9, c07x);
        this.A04 = jPf;
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.title);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.see_all);
        this.A02 = A0N;
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.preview_items);
        this.A06 = A0G;
        Context context = A0G.getContext();
        AbstractC166997dE.A18(context, A0N, 2131968040);
        C38348Gtk c38348Gtk = new C38348Gtk(c07x, musicProduct, userSession, c9pk, jPf, c50664MYh, c50669MYn, c23031Ai, z);
        this.A03 = c38348Gtk;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.A05 = linearLayoutManager;
        A0G.setLayoutManager(linearLayoutManager);
        A0G.setAdapter(c38348Gtk);
        C3P9 A0s = AbstractC166987dD.A0s(A0N);
        A0s.A07 = A1V;
        C37846Gl0.A00(A0s, this, 3);
    }

    @Override // X.JGL
    public final void FCh(JIN jin, float f) {
        this.A03.A00(jin);
    }
}
