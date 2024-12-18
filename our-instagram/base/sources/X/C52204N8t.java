package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.N8t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52204N8t extends AbstractC65632xz {
    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1008057769);
        View findViewById = view.findViewById(R.id.product_cross_tagging_message);
        findViewById.getClass();
        ((TextView) findViewById).setText(AbstractC166987dD.A0H(obj));
        C0f9.A0A(-61840677, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1222199464);
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.recipient_picker_product_cross_tagging);
        C0f9.A0A(422769401, A03);
        return A0A;
    }
}
