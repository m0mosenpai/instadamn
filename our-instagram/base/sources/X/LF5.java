package X;

import android.content.Context;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class LF5 {
    public C51761Mtk A00;
    public final int A01;
    public final Context A02;
    public final UserSession A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public LF5(Context context, UserSession userSession, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A03 = userSession;
        this.A02 = context;
        this.A06 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A08 = z4;
        this.A0A = z5;
        this.A0B = z6;
        this.A0D = z7;
        this.A0C = z8;
        this.A01 = z9 ? 4 : 3;
        this.A00 = new C51761Mtk(12);
        this.A04 = AbstractC166987dD.A1E();
        this.A05 = AbstractC166987dD.A1E();
    }

    public static final void A00(ViewModelListUpdate viewModelListUpdate, LF5 lf5, InterfaceC50514MRr interfaceC50514MRr, C45104JxY c45104JxY) {
        C51753Mtc BEM;
        if (interfaceC50514MRr.Ei7(c45104JxY)) {
            if (C18U.A06(C06090Tz.A05, lf5.A03, 36329612233556400L) && (BEM = interfaceC50514MRr.BEM(viewModelListUpdate.A00.size())) != null) {
                lf5.A04.add(BEM);
            }
            C09530e4 Brh = interfaceC50514MRr.Brh(c45104JxY);
            InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) Brh.A00;
            if (interfaceC66482zP != null) {
                viewModelListUpdate.A00(interfaceC66482zP);
            }
            viewModelListUpdate.A01((List) Brh.A01);
        }
    }
}
