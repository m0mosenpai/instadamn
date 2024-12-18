package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OU4 {
    public int A00;
    public Long A01;
    public final java.util.Set A02;
    public final java.util.Set A03;
    public final InterfaceC09390do A04;

    public OU4(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = AbstractC31171DnF.A0l();
        this.A02 = AbstractC31171DnF.A0l();
        this.A04 = AbstractC09440dt.A01(new MHO(userSession, 38));
    }

    public static UserFlowLoggerImpl A00(OU4 ou4) {
        return (UserFlowLoggerImpl) ou4.A04.getValue();
    }
}
