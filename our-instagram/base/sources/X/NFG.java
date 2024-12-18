package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes9.dex */
public final class NFG extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final C38321qM A01;
    public final C148426mC A02;
    public final C52170N6z A03;
    public final Class A04 = C56118Ovd.class;

    public NFG(InterfaceC11380iw interfaceC11380iw, C38321qM c38321qM, C148426mC c148426mC, C52170N6z c52170N6z) {
        this.A03 = c52170N6z;
        this.A00 = interfaceC11380iw;
        this.A02 = c148426mC;
        this.A01 = c38321qM;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56118Ovd c56118Ovd = (C56118Ovd) interfaceC66482zP;
        C31991E3t c31991E3t = (C31991E3t) c3oo;
        AbstractC167017dG.A1N(c56118Ovd, c31991E3t);
        C84923qg c84923qg = c56118Ovd.A02;
        if (c84923qg != null) {
            c84923qg.A01(this.A01);
        }
        ImageUrl imageUrl = c56118Ovd.A01;
        String str = c56118Ovd.A06;
        String str2 = c56118Ovd.A05;
        Long l = c56118Ovd.A03;
        boolean z = c56118Ovd.A07;
        boolean z2 = c56118Ovd.A08;
        FAW.A00(this.A00, imageUrl, c31991E3t, l, str, str2, new C57257Pbf(40, c56118Ovd, this), new C57257Pbf(41, c56118Ovd, this), new C57257Pbf(42, c56118Ovd, this), new C57257Pbf(43, c56118Ovd, this), c56118Ovd.A00, z, z2, c56118Ovd.A09);
        if (c84923qg != null) {
            this.A02.A00(c31991E3t.A00, c84923qg);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return this.A04;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C31991E3t(AbstractC31176DnK.A0A(layoutInflater, viewGroup, R.layout.row_story_dashboard_comment));
    }
}
