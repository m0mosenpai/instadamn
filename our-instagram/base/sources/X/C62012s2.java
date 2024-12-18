package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.2s2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62012s2 extends AbstractC62022s3 {
    public long A00;
    public final C0JO A01;
    public final UserSession A02;
    public final AtomicLong A03 = new AtomicLong(-1);

    @Override // X.AbstractC62022s3, X.InterfaceC62002s1
    public final void DgH(C1I1 c1i1) {
        C14360o3.A0B(c1i1, 0);
        this.A00 = this.A01.now();
        UserSession userSession = this.A02;
        C9CB A00 = C74493Wh.A00(c1i1.A00);
        C14360o3.A0B(userSession, 0);
        C18920wW A01 = C74493Wh.A01(userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "instagram_feed_request_sent");
        if (A002.isSampled()) {
            A002.AAP(TraceFieldType.RequestID, A00.A02);
            A002.AAP(AbstractC31182DnR.A05(374, 10, 34), A00.A03);
            A002.AAP("request_type", A00.A01.toString());
            A002.Cht();
        }
        C61852rm.A00(userSession).A08(c1i1, "request_observer", false);
    }

    @Override // X.AbstractC62022s3, X.InterfaceC62002s1
    public final void DgP(C1I1 c1i1, C74283Vj c74283Vj) {
        C14360o3.A0B(c1i1, 0);
        UserSession userSession = this.A02;
        C9CB A00 = C74493Wh.A00(c1i1.A00);
        C14360o3.A0B(userSession, 0);
        C18920wW A01 = C74493Wh.A01(userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "instagram_feed_request_completed");
        if (A002.isSampled()) {
            A002.AAP(TraceFieldType.RequestID, A00.A02);
            A002.AAP(AbstractC31182DnR.A05(374, 10, 34), A00.A03);
            A002.AAP("request_type", A00.A01.toString());
            A002.Cht();
        }
    }

    @Override // X.AbstractC62022s3, X.InterfaceC62002s1
    public final void DgV(C1I1 c1i1, C74283Vj c74283Vj) {
        this.A03.set(this.A01.now() - this.A00);
    }

    public C62012s2(C0JO c0jo, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = c0jo;
    }
}
