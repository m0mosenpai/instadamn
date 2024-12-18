package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class EYO extends AbstractC66422zJ {
    public final GZF A00;

    public EYO(GZF gzf) {
        C14360o3.A0B(gzf, 1);
        this.A00 = gzf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.3Fc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        ?? A1R = AbstractC167007dF.A1R(0, viewGroup, layoutInflater);
        C31941E1v c31941E1v = new C31941E1v(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.layout_meta_ai_suggested_prompts, false), this.A00);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(viewGroup.getContext(), 0, false);
        RecyclerView recyclerView = c31941E1v.A00;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(c31941E1v.A01);
        if (recyclerView.A12.size() < A1R) {
            recyclerView.A10(new Object());
        }
        recyclerView.setClipToPadding(false);
        return c31941E1v;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int dimensionPixelSize;
        NUP nup = (NUP) interfaceC66482zP;
        C31941E1v c31941E1v = (C31941E1v) c3oo;
        AbstractC167007dF.A1K(nup, c31941E1v);
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        String A0q = AbstractC166997dE.A0q(c31941E1v.itemView.getResources(), 2131973025);
        Integer valueOf = Integer.valueOf(R.drawable.instagram_icons_exceptions_genai_agent_profile_filled_24);
        C26173Bhy c26173Bhy = nup.A00;
        A0E.A00(new C32098E8w(null, c26173Bhy.A01, valueOf, A0q, "", "", null, 0, false));
        Iterator it = c26173Bhy.A03.iterator();
        while (it.hasNext()) {
            A0E.A00((C32098E8w) it.next());
        }
        if (c26173Bhy.A04) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = c31941E1v.A00.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        }
        AbstractC13880nE.A0Y(c31941E1v.A00, dimensionPixelSize);
        c31941E1v.A01.A05(A0E);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return NUP.class;
    }
}
