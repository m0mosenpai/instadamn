package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes7.dex */
public final class HIT extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final C154716xM A01;
    public final InterfaceC16660sJ A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new Gv6(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.shop_entrypoint_row, false), this);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C42288IoC c42288IoC = (C42288IoC) interfaceC66482zP;
        if (c3oo != null && c42288IoC != null) {
            C38652Gyt c38652Gyt = c42288IoC.A00;
            View A06 = AbstractC31171DnF.A06(c3oo);
            InterfaceC11380iw interfaceC11380iw = this.A00;
            String str = c38652Gyt.A03;
            int i = c38652Gyt.A01;
            boolean z = c38652Gyt.A0B;
            ImageUrl imageUrl = c38652Gyt.A02;
            boolean z2 = false;
            if (i != -1) {
                z2 = true;
            }
            AbstractC54222Ny0.A00(A06, interfaceC11380iw, null, imageUrl, str, new C57252Pba(42, c38652Gyt, this), i, z, z2);
            C154716xM c154716xM = this.A01;
            View A062 = AbstractC31171DnF.A06(c3oo);
            String str2 = c38652Gyt.A06;
            String str3 = c38652Gyt.A0A;
            String str4 = c38652Gyt.A04;
            String str5 = c38652Gyt.A05;
            if (str5 == null) {
                str5 = "mini_shops";
            }
            String str6 = c38652Gyt.A07;
            String str7 = c38652Gyt.A08;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = c38652Gyt.A09;
            if (str8 == null) {
                str8 = "";
            }
            c154716xM.A00(A062, c38652Gyt.A00, str2, str3, str4, AbstractC111324zv.A00(4930), str5, str6, str7, str8);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42288IoC.class;
    }

    public HIT(InterfaceC11380iw interfaceC11380iw, C154716xM c154716xM, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC167017dG.A1P(interfaceC11380iw, c154716xM);
        this.A00 = interfaceC11380iw;
        this.A01 = c154716xM;
        this.A02 = interfaceC16660sJ;
    }
}
