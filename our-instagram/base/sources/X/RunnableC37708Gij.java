package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Gij, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37708Gij implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C120985dq A02;
    public final /* synthetic */ C37644Ghd A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ InterfaceC74623Ww A05;
    public final /* synthetic */ C4S7 A06;
    public final /* synthetic */ C4QW A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;

    public RunnableC37708Gij(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC74623Ww interfaceC74623Ww, C4S7 c4s7, C4QW c4qw, String str, String str2, float f, int i, boolean z) {
        this.A07 = c4qw;
        this.A05 = interfaceC74623Ww;
        this.A06 = c4s7;
        this.A00 = f;
        this.A0A = z;
        this.A09 = str;
        this.A08 = str2;
        this.A01 = i;
        this.A03 = c37644Ghd;
        this.A02 = c120985dq;
        this.A04 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C75363a3 A0A;
        C38321qM A0x;
        C4QW c4qw = this.A07;
        C37644Ghd c37644Ghd = this.A03;
        C120985dq c120985dq = this.A02;
        UserSession userSession = this.A04;
        Integer num = c37644Ghd.A0H;
        if (num != null) {
            int intValue = num.intValue();
            List list = c120985dq.A0R;
            if (list != null && (A0x = AbstractC25225BEi.A0x(list, intValue)) != null) {
                A0A = A0x.CFR();
                InterfaceC74623Ww interfaceC74623Ww = this.A05;
                C4S7 c4s7 = this.A06;
                float f = this.A00;
                boolean z = this.A0A;
                String str = this.A09;
                C14360o3.A0B(str, 6);
                c4qw.E5v(new C4SC(interfaceC74623Ww, new C4QP(false, false, false, false), A0A, c4s7, this.A08, str, f, -1, this.A01, z));
            }
        }
        A0A = c120985dq.A0A(userSession, num);
        InterfaceC74623Ww interfaceC74623Ww2 = this.A05;
        C4S7 c4s72 = this.A06;
        float f2 = this.A00;
        boolean z2 = this.A0A;
        String str2 = this.A09;
        C14360o3.A0B(str2, 6);
        c4qw.E5v(new C4SC(interfaceC74623Ww2, new C4QP(false, false, false, false), A0A, c4s72, this.A08, str2, f2, -1, this.A01, z2));
    }
}
