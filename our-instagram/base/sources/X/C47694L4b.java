package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.L4b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47694L4b {
    public final RecyclerView A00;
    public final C57112jm A01;
    public final C135976Dc A02;
    public final LLR A03;
    public final M9u A04;
    public final HashSet A05;
    public final UserSession A06;

    public C47694L4b(RecyclerView recyclerView, UserSession userSession, C57112jm c57112jm, LLR llr, M9u m9u) {
        AbstractC167007dF.A1G(userSession, 1, llr);
        this.A06 = userSession;
        this.A01 = c57112jm;
        this.A04 = m9u;
        this.A00 = recyclerView;
        this.A03 = llr;
        this.A05 = AbstractC166987dD.A1H();
        this.A02 = AbstractC135966Db.A01(userSession);
    }
}
