package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebook.R;

/* renamed from: X.EQl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32433EQl extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32433EQl(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-244916462);
        AbstractC34329FBx.A00((C50676MYu) obj, (C31903E0j) AbstractC31172DnG.A0x(view));
        C0f9.A0A(1892271918, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.3OO, X.E0j, java.lang.Object] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1515959592);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.row_button_item);
        ?? c3oo = new C3OO(A0A);
        c3oo.A00 = (Button) A0A.requireViewById(R.id.button_item);
        A0A.setTag(c3oo);
        View view = c3oo.itemView;
        C0f9.A0A(-2131962832, A03);
        return view;
    }
}
