package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EQf extends AbstractC65632xz {
    public final UserSession A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public EQf(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1506755289);
        AbstractC167017dG.A1P(view, obj);
        if (i == 0) {
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.shippingandreturns.PurchaseProtectionFooterBinderGroup.Holder");
            C34525FJl c34525FJl = (C34525FJl) obj;
            TextView textView = ((C34463FHb) tag).A00;
            textView.setText(c34525FJl.A00);
            ViewOnClickListenerC35687FpM.A00(textView, 61, c34525FJl, this);
            C0f9.A0A(-1165076593, A03);
            return;
        }
        IllegalStateException A0U = AbstractC31175DnJ.A0U(MSV.A00(78), i);
        C0f9.A0A(-441202265, A03);
        throw A0U;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 555101240);
        if (i == 0) {
            View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.purchase_protection_footer_row);
            C14360o3.A0C(A0A, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) A0A;
            textView.setTag(new C34463FHb(textView));
            C0f9.A0A(-1371351841, A0G);
            return textView;
        }
        IllegalStateException A0U = AbstractC31175DnJ.A0U(MSV.A00(78), i);
        C0f9.A0A(-1306705052, A0G);
        throw A0U;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
