package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3bg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76363bg {
    public final UserSession A00;

    public C76363bg(UserSession userSession) {
        this.A00 = userSession;
    }

    public final C206189Bb A00(C38321qM c38321qM) {
        Integer num;
        if (c38321qM.A20() == EnumC75663aX.A05) {
            num = C05F.A01;
        } else if (c38321qM.A20() == EnumC75663aX.A06) {
            if (C18U.A06(C06090Tz.A05, this.A00, 36315872633032347L)) {
                num = C05F.A0C;
            }
            num = C05F.A00;
        } else if (c38321qM.A1x() == EnumC76383bi.A04) {
            num = C05F.A0N;
        } else {
            if (c38321qM.A1x() == EnumC76383bi.A0C && AbstractC151756sL.A01() && AbstractC151756sL.A00().A04(this.A00)) {
                num = C05F.A0j;
            }
            num = C05F.A00;
        }
        return new C206189Bb(c38321qM.A0C.CDj(), num, c38321qM.A5P());
    }
}
