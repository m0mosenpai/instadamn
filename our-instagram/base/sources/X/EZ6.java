package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EZ6 extends C2AH {
    public final C1P1 A00;
    public final C1Ee A01;
    public final UserSession A02;
    public final String A03;

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        String str;
        C14360o3.A0B(exc, 0);
        UserSession userSession = this.A02;
        C155506yf A00 = AbstractC155496ye.A00(userSession);
        long j = A00.A01;
        if (j != 0) {
            UserFlowLoggerImpl userFlowLoggerImpl = A00.A0A;
            String message = exc.getMessage();
            if (message == null) {
                message = "Null upload error message";
            }
            userFlowLoggerImpl.flowAnnotate(j, TraceFieldType.FailureReason, message);
            A00.A05 = true;
            userFlowLoggerImpl.flowMarkPoint(A00.A01, "profile_picture_upload_error");
        }
        if (exc.getMessage() != null) {
            str = exc.getMessage();
        } else {
            str = "";
        }
        FRl A002 = FA7.A00(userSession);
        EnumC33422Ept enumC33422Ept = EnumC33422Ept.A07;
        if (str != null) {
            A002.A04(enumC33422Ept, str);
            this.A00.onFail(new C115095Ie(exc));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        UserSession userSession = this.A02;
        FRl A00 = FA7.A00(userSession);
        EnumC33422Ept enumC33422Ept = EnumC33422Ept.A07;
        A00.A00(enumC33422Ept, C05F.A1I);
        FA7.A00(userSession).A00(enumC33422Ept, C05F.A02);
        AbstractC155496ye.A00(userSession).A05("profile_picture_upload_successful");
        String str = this.A03;
        C1Ee c1Ee = this.A01;
        AbstractC167027dH.A12(userSession, str, c1Ee);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("accounts/change_profile_picture/");
        ((AbstractC23721Ec) A0c).A04 = new Ft4(c1Ee, userSession, str);
        C1ON A0e = AbstractC25227BEk.A0e(A0c, EBC.class, C34757FSw.class);
        A0e.A00 = this.A00;
        C1GJ.A03(A0e);
    }

    public EZ6(C1P1 c1p1, C1Ee c1Ee, UserSession userSession, String str) {
        this.A02 = userSession;
        this.A03 = str;
        this.A00 = c1p1;
        this.A01 = c1Ee;
    }
}
