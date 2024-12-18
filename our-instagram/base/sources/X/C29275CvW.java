package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.CvW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29275CvW implements JH4 {
    public final Fragment A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.JH4
    public final void DLB(C38321qM c38321qM, C75113Zb c75113Zb) {
        InterfaceC43580JMo A0t;
        String iconicHorizonWorldDeeplink;
        Context context = this.A00.getContext();
        if (context != null && (A0t = AbstractC25226BEj.A0t(c38321qM)) != null && (iconicHorizonWorldDeeplink = A0t.getIconicHorizonWorldDeeplink()) != null) {
            C47993LKk.A00.A03(this.A01, this.A02, c38321qM, C05F.A01);
            AbstractC41776Ies.A03(context, iconicHorizonWorldDeeplink);
        }
    }

    @Override // X.JH4
    public final void ED7(View view, C38321qM c38321qM, C75113Zb c75113Zb) {
        C47993LKk.A00.A04(this.A01, this.A02, c38321qM, C05F.A01);
    }

    public C29275CvW(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
    }
}
