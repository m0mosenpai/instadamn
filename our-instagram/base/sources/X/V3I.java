package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class V3I extends AbstractC168697g3 {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public V3I(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C0f9.A03(-952848986);
        if (view == null) {
            view = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.block_commenters_empty_state);
        }
        C0f9.A0A(-1400348129, A03);
        return view;
    }
}
