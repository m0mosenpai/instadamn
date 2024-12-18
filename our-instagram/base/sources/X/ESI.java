package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class ESI extends AbstractC168697g3 {
    public final CharSequence A00;
    public final Context A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        if (this.A00.length() != 0) {
            anonymousClass306.A7a(0);
        }
    }

    public ESI(Context context, CharSequence charSequence) {
        this.A01 = context;
        this.A00 = charSequence;
    }

    @Override // X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        boolean A1a;
        int A03 = C0f9.A03(458202053);
        if (view == null) {
            if (obj2 == null) {
                A1a = false;
            } else {
                A1a = AbstractC166987dD.A1a(obj2);
            }
            Context context = this.A01;
            CharSequence charSequence = this.A00;
            view = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.row_page_footer);
            AbstractC31176DnK.A1G(AbstractC167007dF.A0N(view, R.id.row_page_footer_text), charSequence);
            if (A1a) {
                AbstractC31176DnK.A1D(view, R.id.footer_divider);
            }
        }
        C0f9.A0A(-612211272, A03);
        return view;
    }
}
