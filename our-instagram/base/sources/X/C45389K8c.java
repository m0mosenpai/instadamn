package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.K8c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45389K8c extends AnonymousClass935 {
    public final C1P1 A00;
    public final DirectThreadKey A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45389K8c(C1P1 c1p1, UserSession userSession, DirectThreadKey directThreadKey) {
        super(userSession);
        C14360o3.A0B(userSession, 1);
        this.A01 = directThreadKey;
        this.A00 = c1p1;
        this.A02 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
    
        if (X.C93404Gt.A01.compare(r10, r12) <= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d9, code lost:
    
        if (X.C93404Gt.A01.compare(r6.A0h(), r12) > 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00db, code lost:
    
        r9.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010d, code lost:
    
        if (r1 > r0) goto L63;
     */
    @Override // X.AnonymousClass935
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void A06(com.instagram.common.session.UserSession r16, java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45389K8c.A06(com.instagram.common.session.UserSession, java.lang.Object):void");
    }

    @Override // X.AnonymousClass935
    public final void A01(UserSession userSession) {
        int A03 = C0f9.A03(229740647);
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onFinish();
        }
        C0f9.A0A(2129575136, A03);
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        int A0G = AbstractC25231BEo.A0G(abstractC115105If, -996307223);
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onFail(abstractC115105If);
        }
        C0f9.A0A(-875636640, A0G);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(363075685);
        int A0G = AbstractC25231BEo.A0G(obj, 1789748567);
        C1P1 c1p1 = this.A00;
        if (c1p1 != null) {
            c1p1.onSuccess(obj);
        }
        C0f9.A0A(-1217829019, A0G);
        C0f9.A0A(-1520528461, A03);
    }
}
