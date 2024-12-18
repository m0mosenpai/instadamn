package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EXU extends AbstractC66412zI {
    public final Activity A00;
    public final UserSession A01;
    public final InterfaceC1569372x A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new E30(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.subinterest_round_pill, false), null);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        C32101E8z c32101E8z = (C32101E8z) interfaceC66482zP;
        E30 e30 = (E30) c3oo;
        AbstractC167017dG.A1N(c32101E8z, e30);
        InterfaceC1569372x interfaceC1569372x = this.A02;
        UserSession userSession = this.A01;
        Activity activity = this.A00;
        AbstractC25233BEq.A0w(2, interfaceC1569372x, userSession, activity);
        TextView textView = e30.A01;
        if (c32101E8z.A00) {
            str = AbstractC25228BEl.A0M(textView).getString(2131970175);
        } else {
            str = "";
        }
        textView.setText(str);
        textView.setTextAppearance(R.style.igds_button_label_destination);
        AbstractC31177DnL.A0y(textView, textView.getContext());
        InterfaceC56392iX interfaceC56392iX = e30.A02;
        interfaceC56392iX.setVisibility(0);
        ((ImageView) interfaceC56392iX.getView()).setImageResource(R.drawable.instagram_add_pano_outline_24);
        AbstractC31173DnH.A11(interfaceC56392iX.getView().getContext(), (ImageView) interfaceC56392iX.getView(), AbstractC53242c7.A0B(interfaceC56392iX.getView().getContext()));
        View view = e30.A00;
        ViewOnClickListenerC35677FpC.A00(view, 12, interfaceC1569372x);
        if (C18U.A06(C06090Tz.A05, userSession, 36316327899762928L)) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            if (AbstractC167017dG.A1b(A00, A00.A7s, C23031Ai.A8c, 213)) {
                view.postDelayed(new GQM(activity, view, userSession, interfaceC1569372x), 100L);
            }
        }
    }

    public EXU(Activity activity, UserSession userSession, InterfaceC1569372x interfaceC1569372x) {
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = interfaceC1569372x;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32101E8z.class;
    }
}
