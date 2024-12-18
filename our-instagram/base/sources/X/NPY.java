package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NPY extends AbstractC52333NDx {
    public final C38093GpM A00;
    public final N73 A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C52607NPc c52607NPc = (C52607NPc) interfaceC66482zP;
        HKN hkn = (HKN) c3oo;
        AbstractC167007dF.A1K(c52607NPc, hkn);
        this.A00.A00(new P2F(c52607NPc, this), c52607NPc, c52607NPc.A00.A00, ((C38160GqR) hkn).A00, false);
        AbstractC40615HzZ.A00(hkn, c52607NPc, super.A01, this.A02, super.A00);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.selectable_grid_item, viewGroup, false);
        AbstractC43593JPy.A1B(inflate, -2);
        return new HKN(inflate);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C52607NPc.class;
    }

    public NPY(C38093GpM c38093GpM, N73 n73, InterfaceC153826vr interfaceC153826vr) {
        super(interfaceC153826vr);
        this.A00 = c38093GpM;
        this.A01 = n73;
    }
}
