package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.Map;

/* renamed from: X.Lp7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49190Lp7 implements InterfaceC50469MPx {
    public final UserSession A00;
    public final AnonymousClass988 A01;
    public final C7IM A02;
    public final C47762L7i A03;
    public final C47763L7j A04;
    public final Context A05;
    public final C98K A06;

    @Override // X.InterfaceC50469MPx
    public final boolean AFd(C99E c99e, InterfaceC50520MRx interfaceC50520MRx, int i) {
        Integer BnH;
        C14360o3.A0B(interfaceC50520MRx, 0);
        if (interfaceC50520MRx.BnJ(i) != null && (BnH = interfaceC50520MRx.BnH(i)) != null && BnH.intValue() == 7) {
            UserSession userSession = this.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 2342157571881962179L)) {
                if (LIQ.A00(c99e, interfaceC50520MRx, i) != C2EY.A1i && LIQ.A00(c99e, interfaceC50520MRx, i) != C2EY.A19) {
                    if (LIQ.A00(c99e, interfaceC50520MRx, i) == C2EY.A1d && C18U.A06(c06090Tz, userSession, 2342157571882420937L)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC50469MPx
    public final C47908LEc AWs(Context context, C51760Mtj c51760Mtj, C99E c99e, MessagingUser messagingUser, L8R l8r, InterfaceC50520MRx interfaceC50520MRx, Map map, java.util.Set set, int i, boolean z) {
        Object kv9;
        AbstractC158787Ap abstractC158787Ap;
        String A02;
        C14360o3.A0B(context, 0);
        AbstractC25234BEr.A1P(l8r, interfaceC50520MRx, messagingUser);
        AbstractC167017dG.A1T(set, map);
        boolean A022 = InterfaceC50520MRx.A02(messagingUser, interfaceC50520MRx, i);
        C7IM c7im = this.A02;
        AbstractC162737Qk.A04(c7im, A022);
        UserSession userSession = this.A00;
        AnonymousClass988 anonymousClass988 = this.A01;
        C7QL A023 = LLL.A02(c99e, anonymousClass988, c7im, messagingUser, interfaceC50520MRx, AbstractC09440dt.A01(MGJ.A00), i);
        boolean A04 = LKZ.A04(userSession, l8r, map);
        AnonymousClass781 anonymousClass781 = (AnonymousClass781) new C49183Lp0(this.A06).ALW(context, c99e, userSession, A023, anonymousClass988, c7im, messagingUser, interfaceC50520MRx, l8r.A00(), null, null, i, A04, LCG.A01(l8r), false, false);
        C7QL A00 = Ko8.A00(c99e, anonymousClass988, c7im, messagingUser, interfaceC50520MRx, Boolean.valueOf(LJT.A00(c99e, interfaceC50520MRx, i)), Boolean.valueOf(LJT.A01(c99e, interfaceC50520MRx, i)), AbstractC09440dt.A01(MGM.A00), i);
        C1585879t A03 = LLL.A03(context, c99e, userSession, anonymousClass988, c7im, messagingUser, l8r, interfaceC50520MRx, interfaceC50520MRx.Bni(i), set, i);
        if (interfaceC50520MRx.Bnd(i)) {
            boolean A01 = LCG.A01(l8r);
            l8r.A00();
            String Bnk = interfaceC50520MRx.Bnk(i);
            if (Bnk != null) {
                int i2 = c7im.A00;
                C2EY c2ey = C2EY.A0p;
                MGK mgk = MGK.A00;
                C7QX A002 = LLL.A00(context, anonymousClass988, messagingUser, interfaceC50520MRx, c2ey, mgk, i, A04, A01);
                SpannableStringBuilder A0B = JQ0.A0B(userSession, Bnk);
                C14360o3.A07(A0B);
                JVH jvh = new JVH(A002, A00, null, A0B, i2);
                if (anonymousClass781 != null) {
                    kv9 = new C45229K0j(A03, jvh, anonymousClass781, interfaceC50520MRx.BSx(i));
                } else {
                    Long Ad4 = interfaceC50520MRx.Ad4(i);
                    String Ad1 = interfaceC50520MRx.Ad1(i);
                    if (Ad4 != null && Ad1 != null && (A02 = LHB.A02(Ad1, null, Ad4.longValue())) != null) {
                        kv9 = new C45228K0i(A03, jvh, new KT5(AbstractC25225BEi.A0t(A02), LLL.A00(context, anonymousClass988, messagingUser, interfaceC50520MRx, C2EY.A0O, mgk, i, A04, A01)), interfaceC50520MRx.BSx(i));
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            Integer BnW = interfaceC50520MRx.BnW(i);
            if (BnW != null && BnW.intValue() == 1008) {
                l8r.A00();
                C7BR A003 = this.A04.A00(context, c99e, messagingUser, interfaceC50520MRx, i);
                EnumC1583878y A012 = LIR.A00.A01(interfaceC50520MRx, i, true);
                String BSx = interfaceC50520MRx.BSx(i);
                C158727Ai c158727Ai = C158727Ai.A00;
                C158817At c158817At = new C158817At(null, null);
                DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier(null, interfaceC50520MRx.BSx(i), null);
                AbstractC1583778x A024 = LLJ.A02(null, interfaceC50520MRx.Bn5(i), interfaceC50520MRx.Bn4(i), null, interfaceC50520MRx.Bn3(i), interfaceC50520MRx.BnN(i));
                String BnY = interfaceC50520MRx.BnY(i);
                if (BnY == null) {
                    BnY = "";
                }
                C9C9 A09 = JQ1.A09(messagingUser, BnY);
                EnumC910243u enumC910243u = EnumC910243u.SINGLE;
                C2EY c2ey2 = C2EY.A0s;
                C7QY c7qy = new C7QY(null, null, null, A09, null, null, null, null, LLL.A01(context, anonymousClass988, messagingUser, interfaceC50520MRx, c2ey2, MGK.A00, i, false, false, A04, false, false, A04, LCG.A01(l8r), true), A00, null, null, A024, null, null, null, enumC910243u, null, directMessageIdentifier, null, null, null, null, null, null, null, null, null, null, null, Ko9.A00(A012).A00, null, null, null, null, null, null, null, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
                Long Ad42 = interfaceC50520MRx.Ad4(i);
                String Ad12 = interfaceC50520MRx.Ad1(i);
                String C5u = interfaceC50520MRx.C5u(i);
                if (Ad42 != null && Ad12 != null) {
                    abstractC158787Ap = new C7B4(AbstractC25225BEi.A0t(AbstractC166987dD.A19(LHB.A00(Ad12, null, Ad42.longValue()))));
                } else if (C5u != null) {
                    abstractC158787Ap = new C7B5(C148336m3.A04.A04(C5u), C5u);
                } else {
                    abstractC158787Ap = null;
                }
                kv9 = new K0U(this.A03.A00(c99e, A003, LLJ.A03(context, c7im, interfaceC50520MRx.Bni(i), A022), messagingUser, l8r, interfaceC50520MRx, c2ey2, set, i), c158727Ai.A0A(context, c7qy, c158817At, abstractC158787Ap), BSx);
            } else {
                if (anonymousClass781 == null) {
                    return null;
                }
                boolean A013 = LCG.A01(l8r);
                l8r.A00();
                EnumC1583878y A014 = LIR.A00.A01(interfaceC50520MRx, i, true);
                String BSx2 = interfaceC50520MRx.BSx(i);
                C158727Ai c158727Ai2 = C158727Ai.A00;
                C158817At c158817At2 = new C158817At(null, null);
                DirectMessageIdentifier directMessageIdentifier2 = new DirectMessageIdentifier(null, interfaceC50520MRx.BSx(i), null);
                AbstractC1583778x A025 = LLJ.A02(null, interfaceC50520MRx.Bn5(i), interfaceC50520MRx.Bn4(i), null, interfaceC50520MRx.Bn3(i), interfaceC50520MRx.BnN(i));
                String BnY2 = interfaceC50520MRx.BnY(i);
                if (BnY2 == null) {
                    BnY2 = "";
                }
                kv9 = new KV9(A03, c158727Ai2.A0A(context, new C7QY(null, null, null, JQ1.A09(messagingUser, BnY2), null, null, null, null, LLL.A00(context, anonymousClass988, messagingUser, interfaceC50520MRx, C2EY.A0s, MGK.A00, i, A04, A013), A00, null, null, A025, null, null, null, EnumC910243u.SINGLE, null, directMessageIdentifier2, null, null, null, null, null, null, null, null, null, null, null, Ko9.A00(A014).A00, null, null, null, null, null, null, null, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false), c158817At2, null), anonymousClass781, BSx2);
            }
        }
        return new C47908LEc(C05F.A00, LKZ.A02(interfaceC50520MRx, i), kv9, null);
    }

    public C49190Lp7(Context context, UserSession userSession, C98K c98k, AnonymousClass988 anonymousClass988, C7IM c7im, C47763L7j c47763L7j) {
        this.A05 = context;
        this.A02 = c7im;
        this.A00 = userSession;
        this.A01 = anonymousClass988;
        this.A04 = c47763L7j;
        this.A06 = c98k;
        this.A03 = Ko2.A00(context, userSession, anonymousClass988, c7im);
    }
}
