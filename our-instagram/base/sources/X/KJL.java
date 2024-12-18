package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes8.dex */
public final class KJL extends AbstractC66422zJ {
    public final UserSession A00;

    public KJL(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44718Jr1(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.daily_prompts_empty_state, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45650KIn c45650KIn = (C45650KIn) interfaceC66482zP;
        C44718Jr1 c44718Jr1 = (C44718Jr1) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c45650KIn, c44718Jr1);
        UserSession userSession = this.A00;
        String str = c45650KIn.A02;
        String str2 = c45650KIn.A01;
        long j = c45650KIn.A00;
        C14360o3.A0B(userSession, 0);
        AbstractC167007dF.A1D(str, A1a ? 1 : 0, str2);
        c44718Jr1.A03.setText(str);
        c44718Jr1.A01.setText(str2);
        if (C7HD.A03(userSession) && j > System.currentTimeMillis()) {
            IgTextView igTextView = c44718Jr1.A02;
            C14360o3.A06(igTextView);
            igTextView.setVisibility(0);
            igTextView.setText(AbstractC46898Kof.A00(AbstractC166997dE.A0L(c44718Jr1.A00), j));
            return;
        }
        IgTextView igTextView2 = c44718Jr1.A02;
        C14360o3.A06(igTextView2);
        igTextView2.setVisibility(8);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45650KIn.class;
    }
}
