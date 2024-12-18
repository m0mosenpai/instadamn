package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes8.dex */
public final class KIM extends AbstractC66412zI {
    public final UserSession A00;
    public final LAG A01;
    public final InterfaceC159877Ez A02;

    public KIM(UserSession userSession, LAG lag, InterfaceC159877Ez interfaceC159877Ez) {
        C14360o3.A0B(lag, 3);
        this.A00 = userSession;
        this.A02 = interfaceC159877Ez;
        this.A01 = lag;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44613JpJ(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_star_tab_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        Context context;
        Drawable drawable;
        K01 k01 = (K01) interfaceC66482zP;
        C44613JpJ c44613JpJ = (C44613JpJ) c3oo;
        AbstractC167007dF.A1K(k01, c44613JpJ);
        IgImageView igImageView = c44613JpJ.A00;
        C148286ly c148286ly = k01.A00;
        Integer A04 = c148286ly.A04();
        Integer num = C05F.A0N;
        if (A04 == num) {
            context = igImageView.getContext();
            C14360o3.A07(context);
            UserSession userSession = this.A00;
            drawable = C74N.A00(context, userSession, c148286ly, false, AbstractC47041Kqy.A00(userSession));
        } else {
            UserSession userSession2 = this.A00;
            context = igImageView.getContext();
            C202588xc c202588xc = new C202588xc(context, null, userSession2, c148286ly, k01.A01, null, c148286ly.A0S);
            c202588xc.A04();
            drawable = c202588xc;
        }
        igImageView.setImageDrawable(drawable);
        String str = c148286ly.A0M;
        if (str == null) {
            str = AbstractC166997dE.A0p(context, 2131953534);
        }
        igImageView.setContentDescription(str);
        KKo.A00(AbstractC166987dD.A0s(igImageView), k01, this, 4);
        LAG lag = this.A01;
        View A06 = AbstractC31171DnF.A06(c44613JpJ);
        if (lag.A06 == num) {
            C59072n8 A00 = C59062n7.A00(c148286ly, C0eB.A00, c148286ly.A0a);
            A00.A00(lag.A03);
            lag.A04.A05(A06, A00.A01());
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return K01.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        JQ1.A0b(c3oo);
        LAG lag = this.A01;
        View A06 = AbstractC31171DnF.A06(c3oo);
        if (lag.A06 == C05F.A0N) {
            lag.A04.A04(A06);
        }
    }
}
