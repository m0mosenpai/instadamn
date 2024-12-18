package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.api.schemas.MediaControlSurfaceEnum;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.38n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C690138n implements InterfaceC690238o {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC65282xQ A03;
    public final C1M1 A04;
    public final InterfaceC09390do A05;
    public final InterfaceC690038m A06;

    public C690138n(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC65282xQ interfaceC65282xQ, InterfaceC690038m interfaceC690038m, C1M1 c1m1) {
        C14360o3.A0B(c1m1, 4);
        C14360o3.A0B(interfaceC690038m, 5);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A04 = c1m1;
        this.A06 = interfaceC690038m;
        this.A03 = interfaceC65282xQ;
        this.A05 = AbstractC09440dt.A01(new C9EG(this, 7));
    }

    @Override // X.InterfaceC690238o
    public final void DAp(C38321qM c38321qM, C75113Zb c75113Zb) {
        int i;
        Long valueOf;
        Long valueOf2;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A02;
        if (c75113Zb.A0p()) {
            i = c75113Zb.getPosition();
        } else {
            i = -1;
        }
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_top_of_funnel_control_dismiss_click");
        if (A00.isSampled()) {
            A00.AAP("m_pk", c38321qM.getId());
            A00.AAP("module", interfaceC60442pS.getModuleName());
            if (i == -1) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(i);
            }
            A00.A9K("m_ix", valueOf);
            int i2 = c75113Zb.A0W;
            if (i2 == -1) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(i2);
            }
            A00.A9K("recs_ix", valueOf2);
            A00.AAP("event_source", "on_impression");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
        ((C37891Glm) this.A05.getValue()).A00(c38321qM, C05F.A0C);
        this.A03.AVK();
    }

    @Override // X.InterfaceC690238o
    public final void DVC(C38321qM c38321qM, C75113Zb c75113Zb) {
        Activity activity;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        c75113Zb.A1U = "on_impression";
        UserSession userSession = this.A01;
        Context context = this.A00;
        C19260xA c19260xA = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        C130175uN c130175uN = C130175uN.A00;
        Long A00 = C130175uN.A00(c38321qM);
        List A01 = c130175uN.A01(activity, userSession, c38321qM);
        InterfaceC60442pS interfaceC60442pS = this.A02;
        String sessionId = this.A04.getSessionId();
        if (interfaceC60442pS instanceof AnonymousClass309) {
            c19260xA = ((AnonymousClass309) interfaceC60442pS).E6Q(c38321qM).A00();
        }
        C41771Ien.A04(interfaceC60442pS, c19260xA, userSession, c38321qM, c75113Zb, A00, "on_impression", sessionId, null, null, c38321qM.A0C.getLoggingInfoToken(), A01, c75113Zb.getPosition(), c75113Zb.A2a);
        this.A06.DKd(MediaControlEventSourceEnum.A05, c38321qM, EnumC75193Zm.A0J, c75113Zb);
        ((C37891Glm) this.A05.getValue()).A00(c38321qM, C05F.A00);
    }

    @Override // X.InterfaceC690238o
    public final void DZp(MediaControlEventSourceEnum mediaControlEventSourceEnum, C38321qM c38321qM) {
        InterfaceC104934o6 B5q;
        String Bej;
        String Beh;
        C14360o3.A0B(c38321qM, 0);
        int ordinal = mediaControlEventSourceEnum.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                Beh = this.A00.getString(2131957632);
                B5q = null;
                Bej = AbstractC111324zv.A00(2044);
            } else {
                return;
            }
        } else {
            B5q = c38321qM.A0C.B5q();
            if (B5q == null) {
                return;
            }
            Bej = B5q.Bej();
            Beh = B5q.Beh();
        }
        UserSession userSession = this.A01;
        AbstractC40625Hzj.A00(mediaControlEventSourceEnum, MediaControlSurfaceEnum.A07, this.A02, userSession, c38321qM, this.A04.getSessionId(), false);
        if (Bej != null && Beh != null) {
            IQc.A01(this.A00, new C42698Iut(mediaControlEventSourceEnum, B5q, this, c38321qM), null, Beh, Bej);
        }
        ((C37891Glm) this.A05.getValue()).A00(c38321qM, C05F.A01);
        if (B5q != null) {
            this.A03.AVK();
        }
    }
}
