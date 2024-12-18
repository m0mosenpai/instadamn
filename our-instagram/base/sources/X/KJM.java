package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes8.dex */
public final class KJM extends AbstractC66422zJ {
    public final UserSession A00;

    public KJM(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44719Jr2(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.daily_prompts_response_list_header, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45651KIo c45651KIo = (C45651KIo) interfaceC66482zP;
        C44719Jr2 c44719Jr2 = (C44719Jr2) c3oo;
        AbstractC167017dG.A1N(c45651KIo, c44719Jr2);
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        c44719Jr2.A03.setText(c45651KIo.A01);
        boolean z = c45651KIo.A02;
        IgTextView igTextView = c44719Jr2.A01;
        if (z) {
            igTextView.setVisibility(0);
            int i = 2131958985;
            if (C18U.A06(C06090Tz.A05, userSession, 36328070340492441L)) {
                i = 2131958986;
            }
            igTextView.setText(i);
        } else {
            igTextView.setVisibility(8);
        }
        if (C7HD.A03(userSession)) {
            long j = c45651KIo.A00;
            if (j > System.currentTimeMillis()) {
                IgTextView igTextView2 = c44719Jr2.A02;
                igTextView2.setVisibility(0);
                igTextView2.setText(AbstractC46898Kof.A00(AbstractC166997dE.A0L(c44719Jr2.A00), j));
                return;
            }
        }
        c44719Jr2.A02.setVisibility(8);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45651KIo.class;
    }
}
