package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.DzV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31863DzV extends LinearLayoutManager {
    public final /* synthetic */ EJK A00;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final void A1S(C3F5 c3f5) {
        String str;
        C14360o3.A0B(c3f5, 0);
        super.A1S(c3f5);
        int A1a = A1a();
        EJK ejk = this.A00;
        C32416EPr c32416EPr = ejk.A02;
        if (c32416EPr == null) {
            str = "adapter";
        } else if (c32416EPr.getCount() > 0 && A1a != -1) {
            RecyclerView recyclerView = ejk.A00;
            if (recyclerView == null) {
                str = "recyclerView";
            } else {
                View childAt = recyclerView.getChildAt(A1a);
                if (childAt != null) {
                    InterfaceC09390do interfaceC09390do = ejk.A05;
                    if (!AbstractC25230BEn.A0l(interfaceC09390do).A01.getBoolean("reorder_links_tooltip", false)) {
                        AbstractC31177DnL.A1N(AbstractC25230BEn.A0l(interfaceC09390do).A01, "reorder_links_tooltip", true);
                        childAt.postDelayed(new RunnableC36912GOh(childAt, ejk), 500L);
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31863DzV(Context context, EJK ejk) {
        super(context, 1, false);
        this.A00 = ejk;
    }
}
