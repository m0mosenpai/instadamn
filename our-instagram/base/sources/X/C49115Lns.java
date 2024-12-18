package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.Lns, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49115Lns implements C7QC {
    public final UserSession A00;
    public final InterfaceC164977Zm A01;
    public final C47969LId A02;
    public final C162907Rb A03;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        UserSession userSession = this.A00;
        boolean A01 = LC3.A01(userSession);
        int i = R.layout.direct_prompt_xma_legacy;
        if (A01) {
            i = R.layout.direct_prompt_xma_message;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        inflate.getLayoutParams().width = -2;
        C44785Js6 c44785Js6 = new C44785Js6(inflate, userSession);
        C47969LId c47969LId = this.A02;
        UserSession userSession2 = c47969LId.A01;
        if (LC3.A00(userSession2)) {
            C45043JwY c45043JwY = c47969LId.A04;
            C47969LId.A01(c47969LId, c44785Js6, c45043JwY);
            int min = Math.min(4, c45043JwY.A00);
            for (int i2 = !c45043JwY.A03 ? 1 : 0; i2 < min; i2++) {
                C47969LId.A00((LGr) c44785Js6.A04.get(i2), c45043JwY, i2);
            }
            if (LC3.A00(userSession2)) {
                View view = c44785Js6.A01;
                Object tag = view.getTag();
                if (!(tag instanceof C45043JwY)) {
                    tag = null;
                }
                if (!C14360o3.A0K(tag, c45043JwY)) {
                    view.setTag(c45043JwY);
                }
            }
        }
        this.A03.A00(c44785Js6);
        return c44785Js6;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C44785Js6 c44785Js6 = (C44785Js6) c7qd;
        C7SZ c7sz = (C7SZ) interfaceC129555tK;
        AbstractC167017dG.A1N(c44785Js6, c7sz);
        C7W5 c7w5 = (C7W5) this.A01;
        String str = c7sz.A02.A00;
        if (str == null) {
            str = "";
        }
        c7w5.CkQ(str, c7sz.CVC());
        this.A02.A02(c44785Js6, c7sz);
        this.A03.A02(c44785Js6, c7sz);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C44785Js6 c44785Js6 = (C44785Js6) c7qd;
        C14360o3.A0B(c44785Js6, 0);
        Iterator it = c44785Js6.A04.iterator();
        while (it.hasNext()) {
            ((LGr) it.next()).A02();
        }
        this.A03.A01(c44785Js6);
    }

    public C49115Lns(UserSession userSession, InterfaceC164977Zm interfaceC164977Zm, C47969LId c47969LId, C162907Rb c162907Rb) {
        this.A01 = interfaceC164977Zm;
        this.A02 = c47969LId;
        this.A03 = c162907Rb;
        this.A00 = userSession;
    }
}
