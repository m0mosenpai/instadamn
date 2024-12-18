package X;

import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.List;
import java.util.Map;

/* renamed from: X.Bcy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25897Bcy extends C2UU {
    public List A00;
    public final UserSession A01;
    public final InterfaceC31005Dk4 A02;
    public final Map A03;

    public C25897Bcy(UserSession userSession, InterfaceC31005Dk4 interfaceC31005Dk4, List list, Map map) {
        AbstractC25233BEq.A0w(2, map, interfaceC31005Dk4, userSession);
        this.A00 = list;
        this.A03 = map;
        this.A02 = interfaceC31005Dk4;
        this.A01 = userSession;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        return new C27343C4y(AbstractC25227BEk.A0D(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.clips_template_browser_hscroll_section_view, false), this.A01, this.A02);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        AbstractC25916BdJ abstractC25916BdJ = (AbstractC25916BdJ) c3oo;
        C14360o3.A0B(abstractC25916BdJ, 0);
        PagingDataAdapter pagingDataAdapter = (PagingDataAdapter) this.A03.get(((MUW) this.A00.get(i)).A02);
        if (pagingDataAdapter != null) {
            MUW muw = (MUW) this.A00.get(i);
            C27343C4y c27343C4y = (C27343C4y) abstractC25916BdJ;
            if (muw != null) {
                c27343C4y.A00 = muw.A02;
                c27343C4y.A05.setText(muw.A03);
                boolean A0K = C14360o3.A0K(c27343C4y.A00, "creator_partnership");
                IgSimpleImageView igSimpleImageView = c27343C4y.A04;
                if (A0K) {
                    igSimpleImageView.setVisibility(0);
                    ViewOnClickListenerC28666ClE.A01(igSimpleImageView, 60, c27343C4y);
                } else {
                    igSimpleImageView.setVisibility(8);
                }
                RecyclerView recyclerView = c27343C4y.A02;
                recyclerView.setLayoutManager((AbstractC70663Fe) c27343C4y.A09.getValue());
                C25889Bcp c25889Bcp = new C25889Bcp(null, null);
                pagingDataAdapter.A06(new C57560PgY(c25889Bcp, 10));
                recyclerView.setAdapter(new C66422UGr(pagingDataAdapter, c25889Bcp));
                recyclerView.A14((C1I4) c27343C4y.A08.getValue());
                recyclerView.A10((AbstractC70653Fc) c27343C4y.A07.getValue());
            }
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewRecycled(C3OO c3oo) {
        AbstractC25916BdJ abstractC25916BdJ = (AbstractC25916BdJ) c3oo;
        C14360o3.A0B(abstractC25916BdJ, 0);
        C27343C4y c27343C4y = (C27343C4y) abstractC25916BdJ;
        RecyclerView recyclerView = c27343C4y.A02;
        recyclerView.A11((AbstractC70653Fc) c27343C4y.A07.getValue());
        recyclerView.A15((C1I4) c27343C4y.A08.getValue());
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1644774811);
        int size = this.A00.size();
        C0f9.A0A(-1533582611, A03);
        return size;
    }
}
