package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* loaded from: classes11.dex */
public final class U1N extends AbstractC66412zI {
    public final XAq A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        VA5 va5 = (VA5) interfaceC66482zP;
        boolean A1a = AbstractC167017dG.A1a(va5, c3oo);
        Object tag = c3oo.itemView.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.ui.search.NoResultsRowViewBinder.Holder");
        C33603EtF c33603EtF = (C33603EtF) tag;
        C69749Vuj c69749Vuj = va5.A00;
        XAq xAq = this.A00;
        AbstractC25230BEn.A15(A1a ? 1 : 0, c33603EtF, c69749Vuj);
        TextView textView = c33603EtF.A01;
        View view = c33603EtF.A00;
        Resources resources = view.getResources();
        C14360o3.A07(resources);
        textView.setText(VSL.A00(resources, c69749Vuj));
        if (xAq != null) {
            xAq.ECz(view, c69749Vuj);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return VA5.class;
    }

    public U1N(XAq xAq) {
        this.A00 = xAq;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A00 = FC2.A00(layoutInflater, viewGroup);
        C3OO c3oo = new C3OO(A00);
        if (A00.getTag() instanceof C33603EtF) {
            return c3oo;
        }
        throw AbstractC31172DnG.A0u();
    }

    public U1N() {
        this(null);
    }
}
