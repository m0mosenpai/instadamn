package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.EQi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32430EQi extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32430EQi(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1415062563);
        C31918E0y c31918E0y = (C31918E0y) view.getTag();
        if (c31918E0y != null) {
            AbstractC34847FXf.A01((C34957Fah) obj2, (GHX) obj, c31918E0y);
        }
        C0f9.A0A(858347414, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-742120879);
        C31918E0y A00 = AbstractC34847FXf.A00(this.A00, viewGroup);
        A00.itemView.setTag(A00);
        View view = A00.itemView;
        C0f9.A0A(1995511646, A03);
        return view;
    }
}
