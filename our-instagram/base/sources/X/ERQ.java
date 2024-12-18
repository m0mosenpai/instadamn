package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class ERQ extends AbstractC65632xz {
    public final Context A00;
    public final GYT A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERQ(Context context, GYT gyt) {
        this.A00 = context;
        this.A01 = gyt;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-2000654670);
        C31699Dw4 c31699Dw4 = (C31699Dw4) obj;
        FC3.A00(this.A00, this.A01, (FLP) AbstractC31172DnG.A0x(view), c31699Dw4.A01, c31699Dw4.A00, ((C34707FQs) obj2).A00);
        C0f9.A0A(709039759, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1448929568);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.row_search_for_x);
        A0A.setTag(new FLP(A0A));
        C0f9.A0A(-1238985266, A03);
        return A0A;
    }
}
