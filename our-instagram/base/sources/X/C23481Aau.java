package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.Aau, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23481Aau implements InterfaceC51522Ya {
    public final /* synthetic */ C170197iY A00;

    public C23481Aau(C170197iY c170197iY) {
        this.A00 = c170197iY;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.7hf, androidx.recyclerview.widget.RecyclerView] */
    @Override // X.InterfaceC51522Ya
    public final /* bridge */ /* synthetic */ Object ABB(Context context) {
        C14360o3.A0B(context, 0);
        ?? recyclerView = new RecyclerView(context, null, 0);
        recyclerView.A03 = true;
        recyclerView.A04 = true;
        recyclerView.A05 = true;
        recyclerView.A02 = true;
        C2Z8 c2z8 = new C2Z8(context, recyclerView);
        c2z8.setId(R.id.recycler_view_container_id);
        return c2z8;
    }
}
