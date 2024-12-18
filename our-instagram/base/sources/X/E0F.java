package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;

/* loaded from: classes6.dex */
public final class E0F extends C1I4 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C33587Esz A01;

    public E0F(UserSession userSession, C33587Esz c33587Esz) {
        this.A01 = c33587Esz;
        this.A00 = userSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.3HT, java.lang.Object, X.1vN] */
    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        int A0N = AbstractC167017dG.A0N(recyclerView, 581803839);
        super.onScrollStateChanged(recyclerView, i);
        HorizontalRecyclerPager horizontalRecyclerPager = this.A01.A00;
        if (recyclerView == horizontalRecyclerPager) {
            AbstractC70663Fe abstractC70663Fe = horizontalRecyclerPager.A0D;
            if ((abstractC70663Fe instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) abstractC70663Fe) != null) {
                UserSession userSession = this.A00;
                int A1c = linearLayoutManager.A1c();
                if (A1c < 0) {
                    A1c = linearLayoutManager.A1a() + 1;
                }
                C25671My A00 = AbstractC25651Mw.A00(userSession);
                ?? obj = new Object();
                obj.A00 = A1c;
                A00.A05(obj);
            }
        }
        C0f9.A0A(-1998781099, A0N);
    }
}
