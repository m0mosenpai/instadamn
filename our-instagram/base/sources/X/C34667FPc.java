package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FPc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34667FPc {
    public final RecyclerView A00;
    public final C66362zD A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.3Fc, java.lang.Object] */
    public C34667FPc(View view, GZF gzf) {
        C14360o3.A0B(view, 1);
        RecyclerView recyclerView = (RecyclerView) AbstractC166987dD.A0c(view, R.id.meta_ai_prompt_pills_rv);
        this.A00 = recyclerView;
        Context context = view.getContext();
        AbstractC31174DnI.A17(context, recyclerView, false);
        C66362zD A0R = AbstractC31173DnH.A0R(C66362zD.A00(context), new EYT(gzf));
        this.A01 = A0R;
        recyclerView.setAdapter(A0R);
        if (recyclerView.A12.size() < 1) {
            recyclerView.A10(new Object());
        }
    }

    public final void A00(List list) {
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0E.A00((C32098E8w) it.next());
        }
        C2UU c2uu = this.A00.A0A;
        C14360o3.A0C(c2uu, MSV.A00(60));
        ((C66362zD) c2uu).A05(A0E);
    }
}
