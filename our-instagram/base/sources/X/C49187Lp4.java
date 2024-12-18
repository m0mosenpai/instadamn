package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Map;

/* renamed from: X.Lp4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49187Lp4 implements InterfaceC50469MPx {
    public final C7IM A00;
    public final BJF A01;
    public final UserSession A02;
    public final AnonymousClass988 A03;
    public final C47762L7i A04;

    @Override // X.InterfaceC50469MPx
    public final boolean AFd(C99E c99e, InterfaceC50520MRx interfaceC50520MRx, int i) {
        String C5u;
        C14360o3.A0B(interfaceC50520MRx, 0);
        MutedWordsFilterManager A00 = AbstractC2042992d.A00(this.A02);
        if (!this.A01.A03 || LIQ.A00(c99e, interfaceC50520MRx, i) != C2EY.A1i || !AbstractC167007dF.A1Z(this.A03.A0J) || (C5u = interfaceC50520MRx.C5u(i)) == null || A00 == null || !A00.A05(C5u, true).A00) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC50469MPx
    public final C47908LEc AWs(Context context, C51760Mtj c51760Mtj, C99E c99e, MessagingUser messagingUser, L8R l8r, InterfaceC50520MRx interfaceC50520MRx, Map map, java.util.Set set, int i, boolean z) {
        C7BR c7br;
        String C5u;
        boolean A1R = AbstractC167007dF.A1R(0, context, l8r);
        AbstractC25233BEq.A0x(2, interfaceC50520MRx, messagingUser, set);
        C14360o3.A0B(map, 6);
        boolean A0g = AbstractC002300n.A0g(interfaceC50520MRx.BSx(i), this.A01.A02, A1R);
        int A05 = AbstractC25227BEk.A05(AbstractC44015Jd2.A02(AbstractC43593JPy.A0q(l8r.A00.mResultSet, 0, 6)), 0);
        boolean z2 = true;
        if (A05 != A1R && A05 != 3) {
            z2 = false;
        } else if (!A0g) {
            c7br = new C7BR(null, null, null, new MessageIdentifier(interfaceC50520MRx.BSx(i), AbstractC31180DnO.A0k(interfaceC50520MRx.BOG(i))), context.getString(2131959885), null, C05F.A0j, null, null, null, null, null, null, AbstractC31174DnI.A03(context), this.A00.A04.A04, 8388611, 5, false, false, false);
            C47762L7i c47762L7i = this.A04;
            C2EY c2ey = C2EY.A1i;
            C7IM c7im = this.A00;
            C162777Qo A00 = c47762L7i.A00(c99e, c7br, Ko5.A00(context, c7im, messagingUser, l8r, interfaceC50520MRx, i), messagingUser, l8r, interfaceC50520MRx, c2ey, set, i);
            AnonymousClass988 anonymousClass988 = this.A03;
            C7QL A002 = Ko8.A00(c99e, anonymousClass988, c7im, messagingUser, interfaceC50520MRx, null, null, AbstractC09440dt.A01(new MHH(this, 43)), i);
            if (!z2 && !A0g) {
                C5u = AbstractC25227BEk.A0u(context, 2131959886);
            } else {
                C5u = interfaceC50520MRx.C5u(i);
                C14360o3.A0C(C5u, AbstractC111324zv.A00(1149));
            }
            KTJ ktj = new KTJ(Ko6.A00(anonymousClass988, new C7QV(null, null, "", "", null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false), messagingUser, interfaceC50520MRx, c2ey, i, false, false), A002, C5u, C05F.A01);
            String A02 = LKZ.A02(interfaceC50520MRx, i);
            return new C47908LEc(C05F.A00, A02, new K0T(A00, ktj, A02), null);
        }
        c7br = null;
        C47762L7i c47762L7i2 = this.A04;
        C2EY c2ey2 = C2EY.A1i;
        C7IM c7im2 = this.A00;
        C162777Qo A003 = c47762L7i2.A00(c99e, c7br, Ko5.A00(context, c7im2, messagingUser, l8r, interfaceC50520MRx, i), messagingUser, l8r, interfaceC50520MRx, c2ey2, set, i);
        AnonymousClass988 anonymousClass9882 = this.A03;
        C7QL A0022 = Ko8.A00(c99e, anonymousClass9882, c7im2, messagingUser, interfaceC50520MRx, null, null, AbstractC09440dt.A01(new MHH(this, 43)), i);
        if (!z2) {
        }
        C5u = interfaceC50520MRx.C5u(i);
        C14360o3.A0C(C5u, AbstractC111324zv.A00(1149));
        KTJ ktj2 = new KTJ(Ko6.A00(anonymousClass9882, new C7QV(null, null, "", "", null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false), messagingUser, interfaceC50520MRx, c2ey2, i, false, false), A0022, C5u, C05F.A01);
        String A022 = LKZ.A02(interfaceC50520MRx, i);
        return new C47908LEc(C05F.A00, A022, new K0T(A003, ktj2, A022), null);
    }

    public C49187Lp4(Context context, BJF bjf, UserSession userSession, AnonymousClass988 anonymousClass988, C7IM c7im) {
        this.A02 = userSession;
        this.A01 = bjf;
        this.A00 = c7im;
        this.A03 = anonymousClass988;
        this.A04 = Ko2.A00(context, userSession, anonymousClass988, c7im);
    }
}
