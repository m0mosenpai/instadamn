package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.8iW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194118iW extends AbstractC66422zJ {
    public final C194028iN A00;

    public C194118iW(C194028iN c194028iN) {
        C14360o3.A0B(c194028iN, 1);
        this.A00 = c194028iN;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.redesigned_add_yours_templates_destination_item, viewGroup, false);
        C14360o3.A07(inflate);
        AbstractC226559zD.A00(inflate);
        return new C9Ud(inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C9Ud c9Ud = (C9Ud) c3oo;
        C14360o3.A0B(c9Ud, 1);
        C3P9 c3p9 = new C3P9(c9Ud.A00);
        c3p9.A04 = new C3PD() { // from class: X.9hl
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view) {
                C194118iW.this.A00.A00.A0A.A0C();
                return true;
            }
        };
        c3p9.A07 = true;
        c3p9.A05 = C05F.A01;
        c3p9.A00();
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C194088iT.class;
    }
}
