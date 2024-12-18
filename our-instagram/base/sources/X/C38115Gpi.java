package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Gpi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38115Gpi extends AbstractC66412zI {
    public final JPS A00;
    public final InterfaceC43406JFw A01;
    public final InterfaceC16660sJ A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        HKS hks = (HKS) interfaceC66482zP;
        C38452GvZ c38452GvZ = (C38452GvZ) c3oo;
        AbstractC167007dF.A1K(hks, c38452GvZ);
        this.A01.EE0(AbstractC31171DnF.A06(c38452GvZ), this.A00.BAM(hks), hks.A02, hks, false);
        ViewOnClickListenerC42034Ik3.A00(c38452GvZ.itemView, 10, hks, this);
        c38452GvZ.A00.setText(hks.A00.A00().A04);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C38452GvZ(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.keyword_header, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return HKS.class;
    }

    public C38115Gpi(JPS jps, InterfaceC43406JFw interfaceC43406JFw, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC43406JFw;
        this.A00 = jps;
        this.A02 = interfaceC16660sJ;
    }
}
