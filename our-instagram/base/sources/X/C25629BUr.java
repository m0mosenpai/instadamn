package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;

/* renamed from: X.BUr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25629BUr extends AbstractC146246iN {
    public final /* synthetic */ C25634BUw A00;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public C25629BUr(C25634BUw c25634BUw) {
        this.A00 = c25634BUw;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A00.A05.size();
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return ((C25633BUv) this.A00.A05.get(i)).A00;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return ((C25633BUv) this.A00.A05.get(i)).A03;
    }

    @Override // X.AbstractC146246iN, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        LithoView lithoView;
        if (view != null) {
            lithoView = (LithoView) view;
        } else {
            lithoView = new LithoView(viewGroup.getContext());
        }
        lithoView.A0l(((C25633BUv) this.A00.A05.get(i)).A00(), true);
        return lithoView;
    }
}
