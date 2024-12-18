package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import java.util.List;

/* renamed from: X.8iU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194098iU extends AbstractC66422zJ {
    public final C194008iL A00;

    public C194098iU(C194008iL c194008iL) {
        C14360o3.A0B(c194008iL, 1);
        this.A00 = c194008iL;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C8YY.A01(this.A00.A00.A0A).A0A(2);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.redesigned_layout_tool_destination_item, viewGroup, false);
        C14360o3.A07(inflate);
        AbstractC226559zD.A00(inflate);
        return new C210909Un(inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C194068iR c194068iR = (C194068iR) interfaceC66482zP;
        C210909Un c210909Un = (C210909Un) c3oo;
        C14360o3.A0B(c194068iR, 0);
        C14360o3.A0B(c210909Un, 1);
        C3P9 c3p9 = new C3P9(c210909Un.A00);
        c3p9.A04 = new C3PD() { // from class: X.9hn
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view) {
                C194098iU.this.A00.A00.A0A.A0G(C81W.A0T);
                return true;
            }
        };
        c3p9.A07 = true;
        c3p9.A05 = C05F.A01;
        c3p9.A00();
        List list = c194068iR.A00;
        if (list != null) {
            Medium medium = (Medium) AbstractC001800i.A0O(list, 0);
            if (medium != null) {
                c210909Un.A02.setImageURI(medium.A02());
            }
            Medium medium2 = (Medium) AbstractC001800i.A0O(list, 1);
            if (medium2 != null) {
                c210909Un.A01.setImageURI(medium2.A02());
            }
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C194068iR.class;
    }
}
