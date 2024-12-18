package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Lp2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49185Lp2 implements InterfaceC50469MPx {
    public final UserSession A00;

    @Override // X.InterfaceC50469MPx
    public final boolean AFd(C99E c99e, InterfaceC50520MRx interfaceC50520MRx, int i) {
        C14360o3.A0B(interfaceC50520MRx, 0);
        return AbstractC167007dF.A1P(interfaceC50520MRx.BSl(i), 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List, java.lang.Object] */
    @Override // X.InterfaceC50469MPx
    public final C47908LEc AWs(Context context, C51760Mtj c51760Mtj, C99E c99e, MessagingUser messagingUser, L8R l8r, InterfaceC50520MRx interfaceC50520MRx, Map map, java.util.Set set, int i, boolean z) {
        ?? A0q;
        String str;
        Object obj;
        C7M0 c7m0;
        C09530e4 A01;
        C14360o3.A0B(context, 0);
        AbstractC25234BEr.A1P(l8r, interfaceC50520MRx, messagingUser);
        AbstractC167017dG.A1T(set, map);
        List A0a = AbstractC001800i.A0a(map.values());
        UserSession userSession = this.A00;
        if (AbstractC31177DnL.A1Z(AbstractC47132Ef.A00(userSession).A0Q)) {
            A0q = interfaceC50520MRx.BXY(i);
        } else {
            C17u c17u = new C17u(0, 4);
            A0q = AbstractC167017dG.A0q(c17u);
            Iterator it = c17u.iterator();
            while (it.hasNext()) {
                ((AbstractC16880sg) it).A00();
                A0q.add(null);
            }
        }
        C14360o3.A0B(A0q, 4);
        if (LCG.A01(l8r)) {
            String A012 = l8r.A01();
            C16930sl c16930sl = C16930sl.A00;
            String A08 = C4GQ.A08(context, userSession, A012, c16930sl, false);
            C14360o3.A07(A08);
            C45313K3q c45313K3q = l8r.A00;
            String A0v = AbstractC43592JPx.A0v(c45313K3q, 0, 4);
            if (A0v != null) {
                A01 = AbstractC166987dD.A1L(new ExtendedImageUrl(A0v, -1, -1), null);
            } else {
                A01 = AnonymousClass763.A01(userSession, A0a);
            }
            ArrayList A05 = AbstractC81683kd.A05(AbstractC166987dD.A10(userSession), A0a, false);
            int i2 = 2131976858;
            if (C18U.A05(C06090Tz.A05, userSession)) {
                i2 = 2131976834;
            }
            String string = context.getString(i2);
            String A0s = AbstractC31173DnH.A0s(A0q, 0);
            String A0s2 = AbstractC31173DnH.A0s(A0q, 1);
            String A0s3 = AbstractC31173DnH.A0s(A0q, 2);
            String A0s4 = AbstractC31173DnH.A0s(A0q, 3);
            String A0s5 = AbstractC31173DnH.A0s(A0q, 4);
            long j = c45313K3q.mResultSet.getLong(0, 0);
            Long valueOf = Long.valueOf(c45313K3q.mResultSet.getLong(0, 1));
            EnumC92794Ds enumC92794Ds = EnumC92794Ds.A04;
            c7m0 = new C7M0(null, null, enumC92794Ds, new MsysThreadId(enumC92794Ds, valueOf, j), false, null, null, C05F.A00, null, null, A08, string, A0s, A0s2, A0s3, A0s4, A0s5, null, A05, c16930sl, A01, 0, true, false, false, false, false, true, false, false, AbstractC25229BEm.A1Z(AbstractC43592JPx.A0v(c45313K3q, 0, 4)), false, c45313K3q.mResultSet.getBoolean(0, 12), false, false, false);
        } else {
            int size = A0a.size();
            C18A A00 = AnonymousClass189.A00(userSession);
            if (size == 1) {
                User A02 = A00.A02(userSession.userId);
                if (A02 != null) {
                    String A07 = AbstractC101904i3.A07(A02);
                    C14360o3.A07(A07);
                    boolean A1T = AbstractC167007dF.A1T(A02.A03.CTJ());
                    boolean isVerified = A02.isVerified();
                    C09530e4 A1L = AbstractC166987dD.A1L(A02.Bhu(), null);
                    String A06 = AbstractC101904i3.A06(A02);
                    if (A06 == null || A07.equals(A06)) {
                        A06 = null;
                    }
                    String string2 = context.getString(2131976876);
                    MessagingUser A002 = MessagingUser.A00(A02);
                    String A0s6 = AbstractC31173DnH.A0s(A0q, 0);
                    String A0s7 = AbstractC31173DnH.A0s(A0q, 1);
                    String A0s8 = AbstractC31173DnH.A0s(A0q, 2);
                    String A0s9 = AbstractC31173DnH.A0s(A0q, 3);
                    String A0s10 = AbstractC31173DnH.A0s(A0q, 4);
                    C45313K3q c45313K3q2 = l8r.A00;
                    long j2 = c45313K3q2.mResultSet.getLong(0, 0);
                    Long A0g = JQ0.A0g(c45313K3q2, 0, 1);
                    EnumC92794Ds enumC92794Ds2 = EnumC92794Ds.A04;
                    c7m0 = new C7M0(null, A002, enumC92794Ds2, new MsysThreadId(enumC92794Ds2, A0g, j2), false, null, A06, C05F.A00, null, null, A07, string2, A0s6, A0s7, A0s8, A0s9, A0s10, null, null, C16930sl.A00, A1L, 0, true, A1T, isVerified, false, false, false, false, false, false, false, c45313K3q2.mResultSet.getBoolean(0, 12), false, false, false);
                }
                c7m0 = AbstractC47164Ksz.A00;
            } else {
                Iterator it2 = A0a.iterator();
                while (true) {
                    str = null;
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (!AbstractC31171DnF.A1W(userSession, AbstractC31171DnF.A0g(obj))) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                User user = (User) obj;
                if (user != null) {
                    str = user.getId();
                }
                User A022 = A00.A02(str);
                if (A022 != null) {
                    String A072 = AbstractC101904i3.A07(A022);
                    C14360o3.A07(A072);
                    boolean A052 = AbstractC207689Gy.A05(userSession, A0a);
                    boolean A1T2 = AbstractC167007dF.A1T(A022.A03.CTJ());
                    boolean isVerified2 = A022.isVerified();
                    C09530e4 A013 = AnonymousClass763.A01(userSession, A0a);
                    String A062 = AbstractC101904i3.A06(A022);
                    if (A062 == null || A072.equals(A062)) {
                        A062 = null;
                    }
                    String A0p = AbstractC166997dE.A0p(context, 2131976876);
                    MessagingUser A003 = MessagingUser.A00(A022);
                    String A0s11 = AbstractC31173DnH.A0s(A0q, 0);
                    String A0s12 = AbstractC31173DnH.A0s(A0q, 1);
                    String A0s13 = AbstractC31173DnH.A0s(A0q, 2);
                    String A0s14 = AbstractC31173DnH.A0s(A0q, 3);
                    String A0s15 = AbstractC31173DnH.A0s(A0q, 4);
                    C45313K3q c45313K3q3 = l8r.A00;
                    long j3 = c45313K3q3.mResultSet.getLong(0, 0);
                    Long A0g2 = JQ0.A0g(c45313K3q3, 0, 1);
                    EnumC92794Ds enumC92794Ds3 = EnumC92794Ds.A04;
                    c7m0 = new C7M0(null, A003, enumC92794Ds3, new MsysThreadId(enumC92794Ds3, A0g2, j3), false, null, A062, C05F.A00, null, null, A072, A0p, A0s11, A0s12, A0s13, A0s14, A0s15, null, null, C16930sl.A00, A013, 26, true, A1T2, isVerified2, false, A052, false, false, false, false, false, c45313K3q3.mResultSet.getBoolean(0, 12), false, false, false);
                }
                c7m0 = AbstractC47164Ksz.A00;
            }
        }
        return new C47908LEc(C05F.A00, LKZ.A02(interfaceC50520MRx, i), c7m0, null);
    }

    public C49185Lp2(UserSession userSession) {
        this.A00 = userSession;
    }
}
