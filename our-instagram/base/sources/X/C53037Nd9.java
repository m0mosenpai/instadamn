package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Nd9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53037Nd9 extends AbstractC52334NDy {
    public final C38093GpM A00;
    public final AbstractC52113N4l A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C30 c30 = (C30) interfaceC66482zP;
        HKN hkn = (HKN) c3oo;
        AbstractC167007dF.A1K(c30, hkn);
        this.A00.A00(new P2G(c30, this), c30, c30.A00.A00, ((C38160GqR) hkn).A00, false);
        AbstractC40615HzZ.A00(hkn, c30, super.A01, this.A02, super.A00);
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
        return C30.class;
    }

    public C53037Nd9(C38093GpM c38093GpM, InterfaceC153826vr interfaceC153826vr, AbstractC52113N4l abstractC52113N4l) {
        super(interfaceC153826vr);
        this.A00 = c38093GpM;
        this.A01 = abstractC52113N4l;
    }
}
