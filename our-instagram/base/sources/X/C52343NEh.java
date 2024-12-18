package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.NEh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52343NEh extends AbstractC66412zI {
    public final UserSession A00;
    public final O66 A01;
    public final boolean A02 = true;

    public C52343NEh(UserSession userSession, O66 o66) {
        this.A00 = userSession;
        this.A01 = o66;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56089Ov6 c56089Ov6 = (C56089Ov6) interfaceC66482zP;
        C51324Mll c51324Mll = (C51324Mll) c3oo;
        AbstractC167017dG.A1N(c56089Ov6, c51324Mll);
        UserSession userSession = this.A00;
        boolean z = this.A02;
        O66 o66 = this.A01;
        AbstractC167007dF.A1F(userSession, 0, o66);
        IgTextView igTextView = c51324Mll.A03;
        UpcomingEvent upcomingEvent = c56089Ov6.A00;
        igTextView.setText(upcomingEvent.getTitle());
        IgTextView igTextView2 = c51324Mll.A02;
        Context context = c51324Mll.A00;
        C14360o3.A07(context);
        igTextView2.setText(MX0.A02(context, userSession, AbstractC41774Ieq.A02(upcomingEvent)));
        ViewOnClickListenerC55468OkN.A00(c51324Mll.A01, 29, o66, c56089Ov6);
        View view = c51324Mll.itemView;
        if (z) {
            ViewOnClickListenerC55468OkN.A00(view, 30, o66, c56089Ov6);
        } else {
            view.setOnClickListener(null);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56089Ov6.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C51324Mll(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.live_scheduling_management_row, false));
    }
}
