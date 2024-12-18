package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public final class WjT implements C7QC {
    public final HashMap A00;
    public final InterfaceC09390do A01;

    public WjT(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(abstractC59962oe, 2);
        this.A01 = C1XM.A00(new MHU(6, abstractC59962oe, userSession));
        this.A00 = new HashMap();
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C102824kJ c102824kJ;
        WjU wjU = (WjU) c7qd;
        C66641URf c66641URf = (C66641URf) interfaceC129555tK;
        AbstractC167007dF.A1K(wjU, c66641URf);
        C62519SEv c62519SEv = c66641URf.A00;
        if (c62519SEv != null && (c102824kJ = c62519SEv.A00) != null) {
            C126545np c126545np = wjU.A01;
            Context context = c126545np.getContext();
            C14360o3.A0A(context);
            String str = c66641URf.A01;
            HashMap hashMap = this.A00;
            C6T7 c6t7 = (C6T7) hashMap.get(str);
            if (c6t7 == null) {
                LinkedHashMap A0p = AbstractC25233BEq.A0p("bk_attachment_padding_end", Float.valueOf(AbstractC167017dG.A06(context) / AbstractC65702TsY.A00(context)), new C09530e4("bk_attachment_padding_start", Float.valueOf(0.0f)));
                C1338462s A02 = C1338462s.A02(null, c102824kJ);
                InterfaceC09390do interfaceC09390do = this.A01;
                C6T8 A00 = C6T7.A00(context, A02, (C62862tP) interfaceC09390do.getValue());
                A00.A01 = A0p;
                c6t7 = A00.A00();
                ((C62862tP) interfaceC09390do.getValue()).A05(new C70729Wfv(c6t7, this, str, 0));
                hashMap.put(str, c6t7);
            }
            C6T7 c6t72 = wjU.A00;
            if (c6t72 != c6t7) {
                if (c6t72 != null) {
                    c6t72.A04();
                }
                wjU.A00 = c6t7;
                c6t7.A07(c126545np);
            }
            c126545np.setVisibility(0);
            return;
        }
        AbstractC25241Le.A02("[Bloks] IGD XMA", "Bloks payload is null.");
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        WjU wjU = (WjU) c7qd;
        C14360o3.A0B(wjU, 0);
        C6T7 c6t7 = wjU.A00;
        if (c6t7 != null) {
            c6t7.A04();
        }
        wjU.A00 = null;
        wjU.A01.setVisibility(8);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new WjU(AbstractC65702TsY.A0F(viewGroup));
    }
}
