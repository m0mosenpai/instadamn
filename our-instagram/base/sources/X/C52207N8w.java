package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.N8w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52207N8w extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C52207N8w(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1435793838);
        view.getTag().getClass();
        ((C53612NnJ) view.getTag()).A00.setAdapter((C2UU) obj);
        C0f9.A0A(1445118952, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.NnJ] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-854433616);
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.login_activity_map_row, viewGroup, false);
        RecyclerView A0G = AbstractC31172DnG.A0G(inflate, R.id.login_activity_map_recycler_view);
        ?? obj = new Object();
        obj.A00 = A0G;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        RecyclerView recyclerView = obj.A00;
        recyclerView.setLayoutManager(linearLayoutManager);
        AbstractC37304Gc5.A0z(recyclerView, 0, AbstractC167017dG.A06(context));
        inflate.setTag(obj);
        C0f9.A0A(-1006679674, A03);
        return inflate;
    }
}
