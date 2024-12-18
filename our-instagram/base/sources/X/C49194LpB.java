package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.List;

/* renamed from: X.LpB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49194LpB implements InterfaceC50469MPx {
    public static final List A05 = AbstractC16960so.A1Q(C2EY.A1i, C2EY.A19);
    public final Context A00;
    public final UserSession A01;
    public final C98K A02;
    public final AnonymousClass988 A03;
    public final C7IM A04;

    @Override // X.InterfaceC50469MPx
    public final boolean AFd(C99E c99e, InterfaceC50520MRx interfaceC50520MRx, int i) {
        Integer BnH;
        Integer Bn6;
        Integer BnW;
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        boolean z;
        C14360o3.A0B(interfaceC50520MRx, 0);
        if (interfaceC50520MRx.BnJ(i) != null && (BnH = interfaceC50520MRx.BnH(i)) != null && BnH.intValue() == 3 && (Bn6 = interfaceC50520MRx.Bn6(i)) != null && Bn6.intValue() == 7 && (BnW = interfaceC50520MRx.BnW(i)) != null) {
            int intValue = BnW.intValue();
            if (intValue != 1000 && intValue != 1006 && intValue != 1001) {
                if (intValue != 1003 && intValue != 1007) {
                    if (intValue != 1004 && intValue != 1014) {
                        if (intValue == 1005) {
                            userSession = this.A01;
                            c06090Tz = C06090Tz.A05;
                            j = 2342157571882027716L;
                        } else if (intValue == 1009) {
                            userSession = this.A01;
                            c06090Tz = C06090Tz.A05;
                            j = 2342157571882093253L;
                        } else if (intValue == 5000) {
                            z = LLJ.A00.A07(interfaceC50520MRx, i, true);
                            if (!z && A05.contains(LIQ.A00(c99e, interfaceC50520MRx, i))) {
                                return true;
                            }
                        }
                    } else {
                        userSession = this.A01;
                        c06090Tz = C06090Tz.A05;
                        j = 2342157571882289863L;
                    }
                } else {
                    userSession = this.A01;
                    c06090Tz = C06090Tz.A05;
                    j = 36314562668202690L;
                }
            } else {
                userSession = this.A01;
                c06090Tz = C06090Tz.A05;
                j = 2342157571881831105L;
            }
            z = C18U.A06(c06090Tz, userSession, j);
            if (!z) {
            }
        }
        return false;
    }

    private final C7QX A00(MessagingUser messagingUser, InterfaceC50520MRx interfaceC50520MRx, int i, boolean z, boolean z2) {
        return LLL.A01(this.A00, this.A03, messagingUser, interfaceC50520MRx, C2EY.A0s, MGK.A00, i, false, false, false, false, true, z, z2, true);
    }

    private final C7QY A01(C7QL c7ql, MessagingUser messagingUser, InterfaceC50520MRx interfaceC50520MRx, int i, boolean z, boolean z2) {
        DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier(null, interfaceC50520MRx.BSx(i), null);
        LLJ llj = LLJ.A00;
        C1583678w A01 = LLJ.A01(interfaceC50520MRx.Bn3(i), interfaceC50520MRx.Bnc(i), interfaceC50520MRx.BnE(i));
        Long Bn3 = interfaceC50520MRx.Bn3(i);
        AbstractC1583778x A02 = LLJ.A02(interfaceC50520MRx.Bnb(i), interfaceC50520MRx.Bn5(i), interfaceC50520MRx.Bn4(i), interfaceC50520MRx.BnU(i), Bn3, interfaceC50520MRx.BnN(i));
        C206409Bx A052 = llj.A05(interfaceC50520MRx.Bnb(i), interfaceC50520MRx.Bna(i), interfaceC50520MRx.BnZ(i));
        C1579877i A00 = LLJ.A00(interfaceC50520MRx.Bnf(i), interfaceC50520MRx.Bnj(i), interfaceC50520MRx.Bnc(i), interfaceC50520MRx.Bnh(i));
        String BnY = interfaceC50520MRx.BnY(i);
        if (BnY == null) {
            BnY = "";
        }
        C9C9 A09 = JQ1.A09(messagingUser, BnY);
        EnumC1583878y A002 = LIR.A00(interfaceC50520MRx.BnW(i));
        return new C7QY(A052, null, null, A09, null, null, null, null, A00(messagingUser, interfaceC50520MRx, i, z, z2), c7ql, A00, A01, A02, null, null, null, EnumC910243u.SINGLE, A002, directMessageIdentifier, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a1  */
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
    @Override // X.InterfaceC50469MPx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47908LEc AWs(android.content.Context r69, X.C51760Mtj r70, X.C99E r71, com.instagram.direct.model.messaginguser.MessagingUser r72, X.L8R r73, X.InterfaceC50520MRx r74, java.util.Map r75, java.util.Set r76, int r77, boolean r78) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49194LpB.AWs(android.content.Context, X.Mtj, X.99E, com.instagram.direct.model.messaginguser.MessagingUser, X.L8R, X.MRx, java.util.Map, java.util.Set, int, boolean):X.LEc");
    }

    public C49194LpB(Context context, UserSession userSession, C98K c98k, AnonymousClass988 anonymousClass988, C7IM c7im) {
        this.A00 = context;
        this.A04 = c7im;
        this.A01 = userSession;
        this.A03 = anonymousClass988;
        this.A02 = c98k;
    }
}
