package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class HFQ extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final ReelDashboardFragment A02;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return ((C41086IHd) obj).A01.A0j.hashCode();
    }

    public HFQ(Context context, InterfaceC11380iw interfaceC11380iw, ReelDashboardFragment reelDashboardFragment) {
        this.A00 = context;
        this.A01 = interfaceC11380iw;
        this.A02 = reelDashboardFragment;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(467354014);
        view.getTag().getClass();
        C18C.A0E(view.getTag() instanceof IE5);
        IE5 ie5 = (IE5) view.getTag();
        Context context = this.A00;
        C66362zD A0R = AbstractC31173DnH.A0R(C66362zD.A00(context), new HIV(context, this.A01, this.A02));
        ie5.A00.setAdapter(A0R);
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        C41086IHd c41086IHd = (C41086IHd) obj;
        Iterator it = c41086IHd.A02.iterator();
        while (it.hasNext()) {
            A0E.A00(new C42331Iot((JL7) it.next(), c41086IHd.A01, c41086IHd.A00));
        }
        A0R.A05(A0E);
        C0f9.A0A(749148930, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(985713694);
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.reel_reaction_count_list, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.reel_reaction_count_list_recyclerview);
        recyclerView.A10(new C51184MjS(AbstractC167017dG.A06(context), 8));
        recyclerView.A0S = true;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.A12(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        inflate.setTag(new IE5(inflate));
        C0f9.A0A(-1440943964, A03);
        return inflate;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }
}
