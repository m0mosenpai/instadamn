package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.EQn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32435EQn extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32435EQn(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1975038184);
        ((C35246Fgf) obj).A03(((C31904E0k) AbstractC31172DnG.A0x(view)).A00);
        C0f9.A0A(-2072076733, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.3OO, X.E0k, java.lang.Object] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1278066319);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.row_center_text);
        ?? c3oo = new C3OO(A0A);
        c3oo.A00 = AbstractC166997dE.A0T(A0A, R.id.row_textview);
        A0A.setTag(c3oo);
        C0f9.A0A(1147551615, A03);
        return A0A;
    }
}
