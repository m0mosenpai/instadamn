package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class EQV extends AbstractC65632xz {
    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C34526FJm c34526FJm = (C34526FJm) obj;
        boolean A1R = AbstractC167007dF.A1R(0, anonymousClass306, c34526FJm);
        anonymousClass306.A7b(0, c34526FJm.A00, 0);
        Iterator A0i = AbstractC31177DnL.A0i(c34526FJm.A01);
        while (A0i.hasNext()) {
            anonymousClass306.A7b(A1R ? 1 : 0, ((C31200Dnj) A0i.next()).A00, 0);
        }
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        TextView textView;
        String str;
        StringBuilder A1C;
        int A03 = C0f9.A03(346894163);
        AbstractC167007dF.A1D(view, 1, obj);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.shippingandreturns.PurchaseProtectionSectionBinderGroup.Holder");
        C34464FHc c34464FHc = (C34464FHc) tag;
        if (i != 0) {
            if (i == 1) {
                boolean A02 = AbstractC13620mo.A02(view.getContext());
                textView = c34464FHc.A00;
                if (A02) {
                    A1C = AbstractC31174DnI.A0y(obj);
                    A1C.append(" •");
                } else {
                    A1C = AbstractC166987dD.A1C();
                    A1C.append("• ");
                    A1C.append(obj);
                }
                str = A1C.toString();
            } else {
                IllegalStateException A0U = AbstractC31175DnJ.A0U("Unknown view type while binding view: ", i);
                C0f9.A0A(181376055, A03);
                throw A0U;
            }
        } else {
            textView = c34464FHc.A00;
            str = (String) obj;
        }
        textView.setText(str);
        C0f9.A0A(-990553354, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        TextView textView;
        int i2;
        int A03 = C0f9.A03(-1565344087);
        LayoutInflater A0E = AbstractC31177DnL.A0E(viewGroup, 1);
        if (i != 0) {
            if (i == 1) {
                View inflate = A0E.inflate(R.layout.purchase_protection_bullet_row, viewGroup, false);
                C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
                textView = (TextView) inflate;
                textView.setTag(new C34464FHc(textView));
                i2 = -574333187;
            } else {
                IllegalStateException A0U = AbstractC31175DnJ.A0U("Unknown view type while creating view: ", i);
                C0f9.A0A(-1161626842, A03);
                throw A0U;
            }
        } else {
            View inflate2 = A0E.inflate(R.layout.purchase_protection_header_row, viewGroup, false);
            C14360o3.A0C(inflate2, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) inflate2;
            textView.setTag(new C34464FHc(textView));
            i2 = -43692701;
        }
        C0f9.A0A(i2, A03);
        return textView;
    }
}
