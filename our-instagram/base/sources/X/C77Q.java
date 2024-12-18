package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.77Q, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C77Q extends C77K {
    public final UserSession A00;
    public final C7U0 A01;
    public final C7XW A02;
    public final C77P A03;
    public final C72620XiV A04;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.XiV, java.lang.Object] */
    public C77Q(Context context, RecyclerView recyclerView, UserSession userSession, C7U0 c7u0, C77I c77i, C7XW c7xw, RefreshableNestedScrollingParent refreshableNestedScrollingParent) {
        super(context, recyclerView, c77i, refreshableNestedScrollingParent);
        this.A00 = userSession;
        this.A01 = c7u0;
        this.A02 = c7xw;
        this.A03 = new G59(userSession, c7u0);
        this.A04 = new Object();
    }
}
