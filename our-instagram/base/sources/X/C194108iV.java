package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.8iV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194108iV extends AbstractC66422zJ {
    public final C194018iM A00;

    public C194108iV(C194018iM c194018iM) {
        C14360o3.A0B(c194018iM, 1);
        this.A00 = c194018iM;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.redesigned_music_story_destination_item, viewGroup, false);
        C14360o3.A07(inflate);
        AbstractC226559zD.A00(inflate);
        return new C210819Ue(inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C210819Ue c210819Ue = (C210819Ue) c3oo;
        C14360o3.A0B(c210819Ue, 1);
        C3P9 c3p9 = new C3P9(c210819Ue.A00);
        c3p9.A04 = new C3PD() { // from class: X.9ho
            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view) {
                C194108iV.this.A00.A00.A0A.A0B();
                return true;
            }
        };
        c3p9.A07 = true;
        c3p9.A05 = C05F.A01;
        c3p9.A00();
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C194078iS.class;
    }
}
