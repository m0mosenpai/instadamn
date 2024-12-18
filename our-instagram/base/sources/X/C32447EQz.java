package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.EQz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32447EQz extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32447EQz(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1792274475);
        FI7 fi7 = (FI7) AbstractC31172DnG.A0x(view);
        C14360o3.A0B(fi7, 0);
        fi7.A00.setText((String) obj);
        C0f9.A0A(332493866, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(752891698);
        View A0C = AbstractC25227BEk.A0C(AbstractC31172DnG.A09(this.A00), R.layout.support_inbox_report_status_row);
        C14360o3.A07(A0C);
        A0C.setTag(new FI7(A0C));
        C0f9.A0A(2024547897, A03);
        return A0C;
    }
}
