package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NFB extends AbstractC66422zJ {
    public final C65921TwS A00;
    public final InterfaceC72020XFi A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        View A0R = AbstractC25226BEj.A0R(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.meta_ai_pill_keyword, false);
        A0R.setTag(new C54618OAt(A0R));
        C3OO c3oo = new C3OO(A0R);
        if (A0R.getTag() instanceof C54618OAt) {
            return c3oo;
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        NUY nuy = (NUY) interfaceC66482zP;
        boolean A1R = AbstractC167007dF.A1R(0, nuy, c3oo);
        Object tag = c3oo.itemView.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.MetaAiPillViewBinder.Holder");
        C54618OAt c54618OAt = (C54618OAt) tag;
        C65921TwS c65921TwS = this.A00;
        InterfaceC72020XFi interfaceC72020XFi = this.A01;
        AbstractC25233BEq.A0v(0, c54618OAt, c65921TwS, interfaceC72020XFi);
        View view = c54618OAt.A01;
        NUO nuo = nuy.A00;
        interfaceC72020XFi.EDz(view, nuo, ((AbstractC50621MWi) nuy).A00);
        TextView textView = c54618OAt.A02;
        C51794Muy c51794Muy = (C51794Muy) nuo.A00;
        textView.setText(c51794Muy.A01);
        c54618OAt.A00.setText(c51794Muy.A02);
        AbstractC13350mL.A00(view, new C57750Pjd(45, nuy, c65921TwS), C36H.A03(C36G.A09, A1R ? 1 : 0));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return NUY.class;
    }

    public NFB(C65921TwS c65921TwS, InterfaceC72020XFi interfaceC72020XFi) {
        this.A00 = c65921TwS;
        this.A01 = interfaceC72020XFi;
    }
}
