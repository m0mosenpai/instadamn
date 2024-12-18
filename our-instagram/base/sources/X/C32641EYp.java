package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.List;

/* renamed from: X.EYp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32641EYp extends AbstractC66422zJ {
    public final Context A00;
    public final FG3 A01;
    public final InterfaceC132405yL A02;
    public final boolean A03;

    public C32641EYp(Context context, FG3 fg3, InterfaceC132405yL interfaceC132405yL, boolean z) {
        AbstractC167007dF.A1F(context, 1, interfaceC132405yL);
        this.A00 = context;
        this.A03 = z;
        this.A01 = fg3;
        this.A02 = interfaceC132405yL;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32619EXt c32619EXt = (C32619EXt) interfaceC66482zP;
        C31932E1m c31932E1m = (C31932E1m) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c32619EXt, c31932E1m);
        List list = c32619EXt.A00;
        C14360o3.A0B(list, A1a ? 1 : 0);
        C2UU c2uu = c31932E1m.A00.A0A;
        C14360o3.A0C(c2uu, "null cannot be cast to non-null type com.instagram.ui.search.recyclerview.DirectInboxSearchPromptAdapter");
        ((C31882Dzo) c2uu).A00 = list;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        Context context = this.A00;
        boolean z = this.A03;
        FG3 fg3 = this.A01;
        InterfaceC132405yL interfaceC132405yL = this.A02;
        AbstractC25233BEq.A0x(0, context, fg3, interfaceC132405yL);
        View A0D = AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.search_header, false);
        RecyclerView recyclerView = new C31932E1m(A0D).A00;
        AbstractC31174DnI.A17(A0D.getContext(), recyclerView, false);
        recyclerView.setAdapter(new C31882Dzo(context, fg3, interfaceC132405yL, z));
        recyclerView.setVisibility(0);
        AbstractC13880nE.A0d(recyclerView, AbstractC167017dG.A06(context));
        return new C31932E1m(A0D);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32619EXt.class;
    }
}
