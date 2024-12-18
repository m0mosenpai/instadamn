package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.emptystate.IgdsEmptyState;

/* loaded from: classes8.dex */
public final class KHJ extends AbstractC66412zI {
    public final InterfaceC16820sZ A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new Jp0(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.row_appreciation_gift_feed_empty_state, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45648KIl c45648KIl = (C45648KIl) interfaceC66482zP;
        Jp0 jp0 = (Jp0) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c45648KIl, jp0);
        IgdsEmptyState igdsEmptyState = jp0.A00;
        igdsEmptyState.EW2(R.drawable.instagram_gift_box_outline_96, A1a);
        igdsEmptyState.setBody(c45648KIl.A01);
        String str = c45648KIl.A00;
        if (str != null && !AbstractC001900j.A0T(str)) {
            igdsEmptyState.setAction(str, LQ0.A01(this, 43));
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45648KIl.class;
    }

    public KHJ(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }
}
