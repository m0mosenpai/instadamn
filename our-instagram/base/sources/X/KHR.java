package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KHR extends AbstractC66412zI {
    public final C47334Kvj A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View A0D = AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_unified_imagine_entrypoint_item, false);
        C44619JpP c44619JpP = new C44619JpP(A0D);
        KKp.A01(AbstractC166987dD.A0s(A0D), this, 22);
        return c44619JpP;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C44619JpP c44619JpP = (C44619JpP) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC66482zP, c44619JpP);
        C48733Lh1 c48733Lh1 = this.A00.A00.A03;
        C7IK c7ik = c48733Lh1.A0A;
        if (c7ik != null) {
            JQ1.A0W(c44619JpP.A00, c7ik);
        }
        String A0p = AbstractC25231BEo.A0p();
        C47933LFf c47933LFf = c48733Lh1.A0J.A00.A00;
        if (c47933LFf != null) {
            C47326Kvb c47326Kvb = c47933LFf.A00.A07;
            c47326Kvb.getClass();
            MRR mrr = c47326Kvb.A00.A02;
            if (mrr != null) {
                mrr.DwN(A0p);
            }
        }
        if (!KJ2.A00) {
            KJ2.A00 = A1R;
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return KJ2.class;
    }

    public KHR(C47334Kvj c47334Kvj) {
        this.A00 = c47334Kvj;
    }
}
