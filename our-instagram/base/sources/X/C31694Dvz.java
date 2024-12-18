package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Dvz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31694Dvz extends AbstractC66412zI {
    public final XLN A00;
    public final XLN A01;
    public final XAq A02;

    public C31694Dvz(XLN xln, XAq xAq) {
        C14360o3.A0B(xln, 1);
        this.A01 = xln;
        this.A02 = xAq;
        this.A00 = new C70889Wji(this, 1);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        NUT nut = (NUT) interfaceC66482zP;
        AbstractC167017dG.A1N(nut, c3oo);
        View A06 = AbstractC31171DnF.A06(c3oo);
        Object tag = c3oo.itemView.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.discovery.inform.ui.InformMessageViewBinder.Holder");
        AbstractC68487VSs.A00(A06, nut.A00, this.A00, (C69226Vju) tag, this.A02);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.inform_header, false);
        A0C.setTag(new C69226Vju(A0C));
        C3OO c3oo = new C3OO(A0C);
        if (A0C.getTag() instanceof C69226Vju) {
            return c3oo;
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return NUT.class;
    }
}
