package X;

import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.Iro, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42509Iro implements InterfaceC62612t0 {
    public final Activity A00;
    public final AbstractC018607g A01;
    public final UserSession A02;
    public final InterfaceC186128Ng A03;
    public final J1G A04;
    public final C38368Gu4 A05;

    public final void A00(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        recyclerView.setAdapter(this.A05);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.A00);
        recyclerView.setLayoutManager(linearLayoutManager);
        AbstractC37304Gc5.A0y(linearLayoutManager, recyclerView, this, C153146ui.A04);
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        J1G j1g = this.A04;
        if (j1g.A00.A06()) {
            j1g.A00(false);
        }
    }

    public C42509Iro(Activity activity, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC186128Ng interfaceC186128Ng, String str) {
        AbstractC167017dG.A1R(userSession, abstractC018607g);
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = abstractC018607g;
        this.A03 = interfaceC186128Ng;
        J1G j1g = new J1G(activity, abstractC018607g, userSession, this);
        this.A04 = j1g;
        this.A05 = new C38368Gu4(userSession, this, j1g, str);
    }
}
