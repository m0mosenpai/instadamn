package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ESb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32475ESb extends C1P1 {
    public String A00;
    public boolean A01;
    public final /* synthetic */ C35126FeT A02;

    public C32475ESb(C35126FeT c35126FeT, String str, boolean z) {
        this.A02 = c35126FeT;
        this.A01 = z;
        this.A00 = str;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(1983255947);
        EBB ebb = (EBB) obj;
        int A032 = C0f9.A03(-63940848);
        C35126FeT c35126FeT = this.A02;
        if (c35126FeT.A01 == null) {
            UserSession userSession = c35126FeT.A00;
            if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36327812642323333L)) {
                i = 1121781508;
                C0f9.A0A(i, A032);
                C0f9.A0A(1702632219, A03);
            }
        }
        c35126FeT.A01.getClass();
        boolean z = this.A01;
        C38321qM c38321qM = c35126FeT.A01;
        String str = this.A00;
        if (z) {
            c38321qM.A4N(str);
        } else {
            c38321qM.A4O(str);
        }
        C37771pE c37771pE = ebb.A00;
        UserSession userSession2 = c35126FeT.A00;
        if (c37771pE == null) {
            C1OU.A04(userSession2).A0c(str);
        } else {
            C1OU.A04(userSession2).A0I(ebb.A00, true);
        }
        i = -1802678840;
        C0f9.A0A(i, A032);
        C0f9.A0A(1702632219, A03);
    }
}
