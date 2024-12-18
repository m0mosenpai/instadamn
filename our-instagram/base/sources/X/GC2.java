package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GC2 implements C5OV {
    public final UserSession A00;
    public final C55732hE A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        String A00;
        Integer A0i;
        Boolean A0A;
        Boolean A0A2;
        C55732hE c55732hE = this.A01;
        if (c55732hE == null || (A00 = c55732hE.A00("thread_subtype")) == null || (A0i = AbstractC003100w.A0i(A00)) == null) {
            return false;
        }
        int intValue = A0i.intValue();
        String A002 = c55732hE.A00(AbstractC111324zv.A00(5485));
        if (A002 == null || (A0A = AbstractC001900j.A0A(A002)) == null) {
            return false;
        }
        boolean booleanValue = A0A.booleanValue();
        String A003 = c55732hE.A00(AbstractC111324zv.A00(5486));
        if (A003 == null || (A0A2 = AbstractC001900j.A0A(A003)) == null) {
            return false;
        }
        boolean booleanValue2 = A0A2.booleanValue();
        UserSession userSession = this.A00;
        if (!booleanValue || !(!booleanValue2)) {
            return false;
        }
        if ((intValue != 0 && intValue != 1003 && intValue != 1 && intValue != 47) || !AbstractC31268Doq.A04(userSession) || !AbstractC31268Doq.A08(userSession) || AbstractC162267Oo.A02(userSession)) {
            return false;
        }
        return true;
    }

    public GC2(UserSession userSession, C55732hE c55732hE) {
        this.A00 = userSession;
        this.A01 = c55732hE;
    }
}
