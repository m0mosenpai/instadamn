package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class U1Q extends AbstractC66422zJ {
    public final Fragment A00;
    public final C65921TwS A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        UJ5 uj5 = (UJ5) c3oo;
        AbstractC167017dG.A1N(interfaceC66482zP, uj5);
        Fragment fragment = this.A00;
        C65921TwS c65921TwS = this.A01;
        AbstractC167017dG.A1R(fragment, c65921TwS);
        C19270xB c19270xB = new C19270xB("search_typeahead_large");
        c65921TwS.A07(c19270xB);
        C0fQ.A00(new WNR(16, c19270xB, interfaceC66482zP, c65921TwS, fragment), uj5.A01);
        C0fQ.A00(new WNR(17, c19270xB, interfaceC66482zP, c65921TwS, fragment), uj5.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return VA0.class;
    }

    public U1Q(Fragment fragment, C65921TwS c65921TwS) {
        this.A01 = c65921TwS;
        this.A00 = fragment;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new UJ5(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.megaphone_search_upsell, false));
    }
}
