package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.V5j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67994V5j extends C2AH {
    public final AnonymousClass935 A00;
    public final C41761wQ A01;
    public final UserSession A02;
    public final C7TQ A03;
    public final C68972VfA A04;
    public final C3o9 A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C67994V5j(AnonymousClass935 anonymousClass935, C41761wQ c41761wQ, UserSession userSession, C7TQ c7tq, C68972VfA c68972VfA, C3o9 c3o9, String str, String str2) {
        C14360o3.A0B(str2, 4);
        this.A02 = userSession;
        this.A07 = str;
        this.A00 = anonymousClass935;
        this.A06 = str2;
        this.A08 = true;
        this.A03 = c7tq;
        this.A05 = c3o9;
        this.A01 = c41761wQ;
        this.A04 = c68972VfA;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C14360o3.A0B(exc, 0);
        this.A00.onFail(new C115095Ie(exc));
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str = (String) obj;
        C3o9 c3o9 = this.A05;
        if (c3o9 instanceof MsysThreadId) {
            if (C18U.A06(C06090Tz.A05, this.A02, 36317113878582059L)) {
                if (str == null) {
                    str = this.A07;
                }
                C41761wQ c41761wQ = this.A01;
                C7TQ c7tq = this.A03;
                if (c7tq != null && c41761wQ != null) {
                    if (c3o9 != null) {
                        c41761wQ.A02(c7tq.AGy(c3o9, str), new C71179WpQ(this, 0));
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
                return;
            }
        }
        C1ON A0B = DirectThreadApi.A0B(this.A02, this.A06, this.A07, str, this.A08);
        A0B.A00 = this.A00;
        C1GJ.A03(A0B);
    }
}
