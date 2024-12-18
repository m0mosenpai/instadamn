package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes11.dex */
public final class U25 extends AbstractC66412zI {
    public final C65921TwS A00;
    public final InterfaceC72020XFi A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0R = AbstractC25226BEj.A0R(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.pill_search_keyword, false);
        A0R.setTag(new C69152Vih(A0R));
        C3OO c3oo = new C3OO(A0R);
        if (A0R.getTag() instanceof C69152Vih) {
            return c3oo;
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        IgSimpleImageView igSimpleImageView;
        int A0E;
        MZR mzr = (MZR) interfaceC66482zP;
        AbstractC167017dG.A1N(mzr, c3oo);
        Tx0 tx0 = ((AbstractC50621MWi) mzr).A00;
        Context A03 = AbstractC37301Gc2.A03(c3oo);
        C66130U0o c66130U0o = mzr.A00;
        C65921TwS c65921TwS = this.A00;
        InterfaceC72020XFi interfaceC72020XFi = this.A01;
        Object tag = c3oo.itemView.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.KeywordPillViewBinder.Holder");
        C69152Vih c69152Vih = (C69152Vih) tag;
        AbstractC25233BEq.A0x(3, c65921TwS, interfaceC72020XFi, c69152Vih);
        interfaceC72020XFi.EDz(c69152Vih.A01, c66130U0o, tx0);
        if (C14360o3.A0K(c66130U0o.A01.A07, "meta_ai_suggestion")) {
            igSimpleImageView = c69152Vih.A02;
            A0E = AbstractC167017dG.A03(igSimpleImageView.getContext());
            igSimpleImageView.setImageResource(R.drawable.instagram_icons_exceptions_genai_agent_profile_filled_24);
            igSimpleImageView.setColorFilter((ColorFilter) null);
        } else {
            igSimpleImageView = c69152Vih.A02;
            A0E = AbstractC167017dG.A0E(igSimpleImageView.getContext());
            igSimpleImageView.setImageResource(R.drawable.instagram_arrow_up_right_pano_filled_24);
            AbstractC31177DnL.A0p(A03, igSimpleImageView, AbstractC53242c7.A0H(A03, R.attr.glyphColorPrimary));
        }
        AbstractC43592JPx.A1F(igSimpleImageView, A0E);
        igSimpleImageView.getLayoutParams().width = A0E;
        TextView textView = c69152Vih.A00;
        textView.setText(c66130U0o.A01.A04);
        WNX.A00(textView, c65921TwS, tx0, c66130U0o, 51);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return MZR.class;
    }

    public U25(C65921TwS c65921TwS, InterfaceC72020XFi interfaceC72020XFi) {
        this.A00 = c65921TwS;
        this.A01 = interfaceC72020XFi;
    }
}
