package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class EYG extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        E91 e91 = (E91) interfaceC66482zP;
        E1X e1x = (E1X) c3oo;
        AbstractC167017dG.A1N(e91, e1x);
        C38311Gsx c38311Gsx = e1x.A00;
        c38311Gsx.A00();
        c38311Gsx.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Context A0L = AbstractC166997dE.A0L(c38311Gsx);
        c38311Gsx.A01(BHX.A00(A0L, e91.A02));
        IgTextView igTextView = c38311Gsx.A03;
        if (igTextView == null) {
            C14360o3.A0F("headerText");
            throw C00O.createAndThrow();
        }
        igTextView.setMaxLines(2);
        C5QE c5qe = e91.A01;
        if (c5qe != null) {
            c38311Gsx.A03(BHX.A00(A0L, c5qe).toString(), ViewOnClickListenerC35685FpK.A00(e91, 8));
        }
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new E1X(new C38311Gsx(AbstractC31176DnK.A04(viewGroup)));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return E91.class;
    }
}
