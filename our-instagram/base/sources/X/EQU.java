package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EQU extends AbstractC65632xz {
    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC167007dF.A1K(anonymousClass306, obj);
        anonymousClass306.A7b(0, obj, 0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-120826509);
        AbstractC167017dG.A1P(view, obj);
        CharSequence charSequence = (CharSequence) obj;
        C34462FHa c34462FHa = (C34462FHa) view.getTag();
        if (c34462FHa != null) {
            AbstractC31176DnK.A1G(c34462FHa.A00, charSequence);
        }
        C0f9.A0A(313963364, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -1333272598);
        View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.product_source_footer_layout, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        textView.setTag(new C34462FHa(textView));
        C0f9.A0A(-846410805, A0G);
        return textView;
    }
}
