package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.EQw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32444EQw extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32444EQw(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(539454865);
        view.getTag().getClass();
        ((C33595Et7) view.getTag()).A00.setText((String) obj);
        C0f9.A0A(1670185522, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.Et7] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1182392564);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.login_history_simple_text_item);
        TextView A0T = AbstractC166997dE.A0T(A0A, R.id.header_text_view);
        ?? obj = new Object();
        obj.A00 = A0T;
        A0A.setTag(obj);
        C0f9.A0A(-1336859932, A03);
        return A0A;
    }
}
