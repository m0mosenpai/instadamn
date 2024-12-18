package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.text.ExpandableTextView;

/* renamed from: X.E3v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31993E3v extends C3OO {
    public InterfaceC41501vz A00;
    public InterfaceC41501vz A01;
    public IgLinearLayout A02;
    public boolean A03;
    public final RecyclerView A04;
    public final ShimmerFrameLayout A05;
    public final C25671My A06;
    public final UserSession A07;
    public final ExpandableTextView A08;
    public final FG0 A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31993E3v(View view, UserSession userSession, FG0 fg0) {
        super(view);
        AbstractC167017dG.A1R(userSession, fg0);
        this.A07 = userSession;
        this.A09 = fg0;
        this.A08 = (ExpandableTextView) AbstractC166987dD.A0c(view, R.id.snippet_body);
        this.A05 = (ShimmerFrameLayout) AbstractC166987dD.A0c(view, R.id.meta_ai_snippet_shimmer);
        this.A04 = (RecyclerView) AbstractC166987dD.A0c(view, R.id.meta_ai_snippet_prompt_pills);
        this.A06 = AbstractC25651Mw.A00(userSession);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(AbstractC31172DnG.A05(this), 0, false);
        RecyclerView recyclerView = this.A04;
        recyclerView.setLayoutManager(linearLayoutManager);
        if (recyclerView.A12.size() == 0) {
            recyclerView.A10(new C51179MjN(4));
        }
    }
}
