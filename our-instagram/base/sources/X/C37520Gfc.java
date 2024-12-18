package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.Gfc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37520Gfc extends C1P1 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C5R3 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    public C37520Gfc(UserSession userSession, C5R3 c5r3, String str, InterfaceC16660sJ interfaceC16660sJ) {
        this.A03 = interfaceC16660sJ;
        this.A01 = c5r3;
        this.A00 = userSession;
        this.A02 = str;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ boolean isValidResponseData(Object obj) {
        InterfaceC124295jj interfaceC124295jj = (InterfaceC124295jj) obj;
        C14360o3.A0B(interfaceC124295jj, 0);
        return C5R3.A05(interfaceC124295jj);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-607233685);
        C14360o3.A0B(abstractC115105If, 0);
        super.onFail(abstractC115105If);
        C37787Gk2.A05(this.A01.A02, EnumC74603Ws.A04, false);
        C0f9.A0A(-1218989888, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(648494013);
        super.onFinish();
        C5R3.A04(this.A00, this.A01);
        C0f9.A0A(673625293, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2;
        C38321qM c38321qM;
        int A03 = C0f9.A03(2038781391);
        InterfaceC124295jj interfaceC124295jj = (InterfaceC124295jj) obj;
        int A0N = AbstractC167017dG.A0N(interfaceC124295jj, -471674944);
        Iterator it = interfaceC124295jj.AoP().iterator();
        while (true) {
            if (it.hasNext()) {
                obj2 = it.next();
                if (((C120985dq) obj2).A02 != null) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        C120985dq c120985dq = (C120985dq) obj2;
        if (c120985dq != null && (c38321qM = c120985dq.A02) != null) {
            C4AG.A00(this.A00).A01(new C4AD(c38321qM.CFR(), this.A02));
        }
        this.A03.invoke(interfaceC124295jj);
        C37787Gk2.A05(this.A01.A02, EnumC74603Ws.A05, true);
        C0f9.A0A(305765398, A0N);
        C0f9.A0A(-1777343174, A03);
    }
}
