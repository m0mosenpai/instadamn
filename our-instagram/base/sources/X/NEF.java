package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* loaded from: classes9.dex */
public final class NEF extends AbstractC66412zI {
    public final O3E A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51249MkY(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.location_suggestions_two_rows, false), this.A00);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56102OvM c56102OvM = (C56102OvM) interfaceC66482zP;
        C51249MkY c51249MkY = (C51249MkY) c3oo;
        AbstractC167017dG.A1N(c56102OvM, c51249MkY);
        OWd oWd = c51249MkY.A00;
        oWd.A02(c56102OvM.A00);
        if (c56102OvM.A02) {
            C51143Mim c51143Mim = oWd.A04;
            c51143Mim.A00.clear();
            c51143Mim.notifyDataSetChanged();
            AbstractC52180N7p abstractC52180N7p = this.A00.A00;
            if (abstractC52180N7p instanceof NMX) {
                ((NMX) abstractC52180N7p).A0P = false;
            } else {
                ((NMW) abstractC52180N7p).A0U = false;
            }
        }
        List list = c56102OvM.A01;
        if (list != null) {
            C51143Mim c51143Mim2 = oWd.A04;
            AbstractC31175DnJ.A0x(c51143Mim2, list, c51143Mim2.A00);
            OWd.A00(oWd, oWd.A02);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56102OvM.class;
    }

    public NEF(O3E o3e) {
        this.A00 = o3e;
    }
}
