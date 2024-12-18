package X;

import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class OHs {
    public final C51122MiR A00;
    public final InterfaceC58144Pq9 A01;

    public final void A00(View view) {
        C14360o3.A0B(view, 0);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.caption_add_on_recyclerview);
        AbstractC31174DnI.A17(recyclerView.getContext(), recyclerView, false);
        recyclerView.setAdapter(this.A00);
        Resources resources = recyclerView.getResources();
        AbstractC37304Gc5.A0z(recyclerView, AbstractC166997dE.A05(resources), AbstractC166997dE.A08(resources));
    }

    public OHs(InterfaceC58144Pq9 interfaceC58144Pq9) {
        this.A01 = interfaceC58144Pq9;
        this.A00 = new C51122MiR(interfaceC58144Pq9);
    }
}
