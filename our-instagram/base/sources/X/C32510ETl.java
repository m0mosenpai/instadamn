package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.ETl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32510ETl extends C1P1 {
    public final UserSession A00;

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1936163459);
        C32202ECx c32202ECx = (C32202ECx) obj;
        int A032 = C0f9.A03(-1605783303);
        C14360o3.A0B(c32202ECx, 0);
        UserSession userSession = this.A00;
        double A00 = AbstractC31174DnI.A00(userSession, 0);
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "additional_phone_number_request_success");
        A0f.A8I("current_time", Double.valueOf(A00));
        A0f.A8I("elapsed_time", Double.valueOf(A00 - A002));
        A0f.A8I(TraceFieldType.StartTime, Double.valueOf(A002));
        A0f.AAP("waterfall_id", C1Q9.A01());
        AbstractC35274Fh9.A04(A0f);
        A0f.AAP("guid", AbstractC35274Fh9.A00());
        C14360o3.A0B(userSession, 0);
        A0f.AAP(CacheBehaviorLogger.SOURCE, AbstractC31179DnN.A0c(userSession));
        AbstractC25225BEi.A1O(A0f, "waterfall_log_in");
        A0f.Cht();
        String str = c32202ECx.A02;
        String str2 = c32202ECx.A01;
        if (str2 != null && str2.length() != 0 && str != null && str.length() != 0) {
            userSession.A04(FJR.class, new FJR(str2, str));
            double A01 = AbstractC31171DnF.A01();
            double A003 = AbstractC31171DnF.A00();
            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "additional_phone_number_present");
            A0f2.A8I("current_time", Double.valueOf(A01));
            A0f2.A8I("elapsed_time", Double.valueOf(A01 - A003));
            AbstractC31171DnF.A1D(A0f2, "waterfall_log_in");
            A0f2.A8I(TraceFieldType.StartTime, Double.valueOf(A003));
            A0f2.AAP("waterfall_id", C1Q9.A01());
            A0f2.AAP("guid", AbstractC35274Fh9.A00());
            A0f2.AAP(CacheBehaviorLogger.SOURCE, AbstractC31179DnN.A0c(userSession));
            A0f2.Cht();
        }
        C0f9.A0A(1225971668, A032);
        C0f9.A0A(45051949, A03);
    }

    public C32510ETl(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(667995376);
        UserSession userSession = this.A00;
        double A00 = AbstractC31177DnL.A00(userSession);
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "additional_phone_number_request_fail");
        AbstractC31179DnN.A16(A0f, A00, A002);
        AbstractC31177DnL.A1G(A0f, "module", "waterfall_log_in", A002);
        AbstractC31175DnJ.A0y(A0f);
        AbstractC35274Fh9.A08(A0f, userSession);
        C0f9.A0A(829905814, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1402138897);
        UserSession userSession = this.A00;
        double A00 = AbstractC31177DnL.A00(userSession);
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "try_fetch_additional_phone_number");
        if (A0f.isSampled()) {
            AbstractC31179DnN.A16(A0f, A00, A002);
            AbstractC31177DnL.A1G(A0f, "containermodule", "waterfall_log_in", A002);
            AbstractC31175DnJ.A0y(A0f);
            AbstractC35274Fh9.A08(A0f, userSession);
        }
        C0f9.A0A(996581839, A03);
    }
}
