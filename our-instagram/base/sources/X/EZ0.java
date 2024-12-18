package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EZ0 extends AbstractC66422zJ {
    public final Fragment A00;
    public final UserSession A01;
    public final C7IH A02;
    public final C34543FKd A03;
    public final C31831Dyp A04;

    public EZ0(Fragment fragment, UserSession userSession, C7IH c7ih, C34543FKd c34543FKd, C31831Dyp c31831Dyp) {
        AbstractC167007dF.A1F(userSession, 1, c31831Dyp);
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = c7ih;
        this.A04 = c31831Dyp;
        this.A03 = c34543FKd;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new E43(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.daily_prompts_response_card, false), this.A01, this.A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7.A03, 36328070340426904L) == false) goto L11;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r19, X.C3OO r20) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EZ0.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        E43 e43 = (E43) c3oo;
        C14360o3.A0B(e43, 0);
        InterfaceC56392iX interfaceC56392iX = e43.A0A;
        if (interfaceC56392iX.CWW()) {
            AbstractC31172DnG.A1T(interfaceC56392iX, 8);
        }
        AbstractC31178DnM.A1P(e43.A0B);
        AbstractC31178DnM.A1P(e43.A08);
        AbstractC31178DnM.A1P(e43.A06);
        AbstractC31178DnM.A1P(e43.A07);
        InterfaceC56392iX interfaceC56392iX2 = e43.A0C;
        if (interfaceC56392iX2.CWW()) {
            interfaceC56392iX2.getView().setOnClickListener(null);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36211FyP.class;
    }
}
