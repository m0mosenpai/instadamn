package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class V58 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C66476UJa(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.fan_club_earnings_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C70794Wh7 c70794Wh7 = (C70794Wh7) interfaceC66482zP;
        C66476UJa c66476UJa = (C66476UJa) c3oo;
        AbstractC167007dF.A1K(c70794Wh7, c66476UJa);
        Context context = c66476UJa.itemView.getContext();
        c66476UJa.A04.setText(c70794Wh7.A04);
        c66476UJa.A03.setText(c70794Wh7.A03);
        AbstractC166987dD.A1P(context, c66476UJa.A02, 2131976502);
        c66476UJa.A01.setText(c70794Wh7.A05);
        AbstractC166987dD.A1P(context, c66476UJa.A00, 2131962195);
        c66476UJa.A07.setText(AbstractC65702TsY.A0h(String.valueOf(c70794Wh7.A00), C1Q2.A02(), new Object[0], 0));
        AbstractC166987dD.A1P(context, c66476UJa.A05, 2131962097);
        c66476UJa.A08.setText(AbstractC65702TsY.A0h(String.valueOf(c70794Wh7.A01), C1Q2.A02(), new Object[0], 0));
        AbstractC166987dD.A1P(context, c66476UJa.A06, 2131962171);
        c66476UJa.A09.setText(AbstractC65702TsY.A0h(String.valueOf(c70794Wh7.A02), C1Q2.A02(), new Object[0], 0));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C70794Wh7.class;
    }
}
