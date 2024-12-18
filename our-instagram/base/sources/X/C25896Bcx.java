package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Bcx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25896Bcx extends C2UU {
    public List A00;
    public final InterfaceC31005Dk4 A01;
    public final Map A02;

    public final void A00(String str) {
        C14360o3.A0B(str, 0);
        Iterator it = this.A00.iterator();
        int i = 0;
        while (it.hasNext()) {
            String requiredStringField = ((GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.Sections) it.next()).getRequiredStringField(2, "section_id");
            AbstractC25225BEi.A1S(requiredStringField);
            if (C14360o3.A0K(requiredStringField, str)) {
                if (i != -1) {
                    List list = this.A00;
                    ArrayList A1E = AbstractC166987dD.A1E();
                    for (Object obj : list) {
                        String requiredStringField2 = ((GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.Sections) obj).getRequiredStringField(2, "section_id");
                        AbstractC25225BEi.A1S(requiredStringField2);
                        AbstractC25232BEp.A1Q(requiredStringField2, str, obj, A1E);
                    }
                    this.A00 = A1E;
                    this.A02.remove(str);
                    notifyItemRemoved(i);
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        return new C25943Bdk(AbstractC25227BEk.A0D(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.creator_inspiration_hub_reels_vscroll_item, false), this.A01);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C66422UGr c66422UGr;
        C25943Bdk c25943Bdk = (C25943Bdk) c3oo;
        C14360o3.A0B(c25943Bdk, 0);
        C2JS c2js = (C2JS) this.A00.get(i);
        Map map = this.A02;
        String requiredStringField = ((GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.Sections) this.A00.get(i)).getRequiredStringField(2, "section_id");
        AbstractC25225BEi.A1S(requiredStringField);
        PagingDataAdapter pagingDataAdapter = (PagingDataAdapter) map.get(requiredStringField);
        C14360o3.A0B(c2js, 0);
        IgTextView igTextView = c25943Bdk.A02;
        String requiredStringField2 = c2js.getRequiredStringField(4, AbstractC111324zv.A00(1342));
        AbstractC25225BEi.A1S(requiredStringField2);
        igTextView.setText(requiredStringField2);
        RecyclerView recyclerView = c25943Bdk.A01;
        recyclerView.setLayoutManager((AbstractC70663Fe) c25943Bdk.A06.getValue());
        if (pagingDataAdapter != null) {
            Context context = c25943Bdk.A00.getContext();
            C25889Bcp c25889Bcp = new C25889Bcp(Integer.valueOf(AbstractC167017dG.A03(context)), Integer.valueOf(AbstractC167007dF.A09(context, R.attr.igds_color_loading_shimmer_dark)));
            pagingDataAdapter.A06(new C57560PgY(c25889Bcp, 10));
            c66422UGr = new C66422UGr(pagingDataAdapter, c25889Bcp);
        } else {
            c66422UGr = null;
        }
        recyclerView.setAdapter(c66422UGr);
        recyclerView.A10((AbstractC70653Fc) c25943Bdk.A05.getValue());
        recyclerView.A14((C1I4) c25943Bdk.A04.getValue());
    }

    public C25896Bcx(InterfaceC31005Dk4 interfaceC31005Dk4, List list, Map map) {
        AbstractC167017dG.A1R(map, interfaceC31005Dk4);
        this.A00 = list;
        this.A02 = map;
        this.A01 = interfaceC31005Dk4;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-345181934);
        int size = this.A00.size();
        C0f9.A0A(-446635048, A03);
        return size;
    }
}
