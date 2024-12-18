package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Gpj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38116Gpj extends AbstractC66412zI {
    public final JPS A00;
    public final InterfaceC43406JFw A01;
    public final InterfaceC16620sF A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C14360o3.A0B(c3oo, 1);
        C14360o3.A06(c3oo.itemView);
        throw AbstractC166987dD.A15("getGridSize");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C38453Gva(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.breather_tombstone, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return HKQ.class;
    }

    public C38116Gpj(JPS jps, InterfaceC43406JFw interfaceC43406JFw, InterfaceC16620sF interfaceC16620sF) {
        this.A01 = interfaceC43406JFw;
        this.A00 = jps;
        this.A02 = interfaceC16620sF;
    }
}
