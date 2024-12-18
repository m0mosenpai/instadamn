package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.EQm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32434EQm extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32434EQm(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1837643889);
        AbstractC34330FBy.A00((FMQ) obj, (E2A) AbstractC31172DnG.A0x(view));
        C0f9.A0A(-1288750612, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(504125480);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.row_button_with_description_item);
        E2A e2a = new E2A(A0A);
        A0A.setTag(e2a);
        View view = e2a.itemView;
        C0f9.A0A(2133185819, A03);
        return view;
    }
}
