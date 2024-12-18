package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.GpX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38104GpX extends AbstractC66412zI {
    public final JPT A00;
    public final C38093GpM A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C127995qS c127995qS = (C127995qS) interfaceC66482zP;
        C38160GqR c38160GqR = (C38160GqR) c3oo;
        C14360o3.A0B(c127995qS, 0);
        C14360o3.A0B(c38160GqR, 1);
        this.A01.A00(this.A00, c127995qS, c127995qS.A01, c38160GqR.A00, false);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C38160GqR(C50802Vb.A00(layoutInflater, null, viewGroup, R.layout.layout_grid_item_image, 0, false, true));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C127995qS.class;
    }

    public C38104GpX(JPT jpt, C38093GpM c38093GpM) {
        this.A01 = c38093GpM;
        this.A00 = jpt;
    }
}
