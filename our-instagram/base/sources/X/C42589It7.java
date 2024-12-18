package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.It7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42589It7 implements C53T {
    public final /* synthetic */ C166887d0 A00;

    @Override // X.C53T
    public final void D3g(IgImageView igImageView, InterfaceC38371qR interfaceC38371qR, int i, int i2, boolean z, boolean z2) {
        C40971v4 c40971v4;
        EnumC906041v enumC906041v;
        AbstractC167007dF.A1E(interfaceC38371qR, 0, igImageView);
        C166887d0 c166887d0 = this.A00;
        UserSession userSession = c166887d0.A03;
        C5SE c5se = new C5SE(userSession, interfaceC38371qR);
        c5se.A00 = i2;
        c5se.A01 = i;
        C37952Gmu c37952Gmu = new C37952Gmu(c166887d0.A01, userSession, c5se, c166887d0.A04, C2Fb.A1G);
        c37952Gmu.A01(interfaceC38371qR.BQN());
        c37952Gmu.A09 = i2;
        c37952Gmu.A0B = i;
        c37952Gmu.A00(igImageView, c5se, interfaceC38371qR.BQN());
        EnumC906041v enumC906041v2 = null;
        if (interfaceC38371qR instanceof C40971v4) {
            c40971v4 = (C40971v4) interfaceC38371qR;
            c37952Gmu.A0O = c40971v4;
        } else {
            c40971v4 = null;
        }
        C37953Gmv.A02(c37952Gmu);
        if (c40971v4 != null && c40971v4.A0l != null) {
            c166887d0.A06.invoke();
        }
        AndroidLink A02 = AbstractC905941u.A02(c37952Gmu.A10, userSession, interfaceC38371qR.BQN(), i2, false);
        if (A02 != null) {
            enumC906041v = AbstractC114965Hm.A01(A02);
        } else {
            enumC906041v = null;
        }
        if (enumC906041v != EnumC906041v.AD_DESTINATION_CANVAS) {
            if (A02 != null) {
                enumC906041v2 = AbstractC114965Hm.A01(A02);
            }
            if (enumC906041v2 != EnumC906041v.AD_DESTINATION_CLIPS_VIEWER) {
                return;
            }
        }
        Activity activity = (Activity) c166887d0.A05.invoke();
        if (activity != null) {
            AbstractC167017dG.A0y(activity, C3DN.A00);
        }
    }

    public C42589It7(C166887d0 c166887d0) {
        this.A00 = c166887d0;
    }
}
