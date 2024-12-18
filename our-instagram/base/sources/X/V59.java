package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class V59 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        View A0R = AbstractC25226BEj.A0R(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.card_search_placeholder, false);
        A0R.setTag(new VgD(A0R));
        return new UI8(A0R);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        WhC whC = (WhC) interfaceC66482zP;
        UI8 ui8 = (UI8) c3oo;
        boolean A1a = AbstractC167017dG.A1a(whC, ui8);
        VgD vgD = ui8.A00;
        C14360o3.A0B(vgD, A1a ? 1 : 0);
        vgD.A00.getLayoutParams().width = (int) (r0.getLayoutParams().height * whC.A00);
        vgD.A01.A02();
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return WhC.class;
    }
}
