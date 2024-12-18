package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public abstract class LLL {
    public static final C7QX A00(Context context, AnonymousClass988 anonymousClass988, MessagingUser messagingUser, InterfaceC50520MRx interfaceC50520MRx, C2EY c2ey, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z, boolean z2) {
        return A01(context, anonymousClass988, messagingUser, interfaceC50520MRx, c2ey, interfaceC16820sZ, i, false, false, false, false, false, z, z2, true);
    }

    public static final C7QL A02(C99E c99e, AnonymousClass988 anonymousClass988, C7IM c7im, MessagingUser messagingUser, InterfaceC50520MRx interfaceC50520MRx, InterfaceC09390do interfaceC09390do, int i) {
        C14360o3.A0B(interfaceC09390do, 7);
        return Ko8.A00(c99e, anonymousClass988, c7im, messagingUser, interfaceC50520MRx, Boolean.valueOf(LJT.A00(c99e, interfaceC50520MRx, i)), Boolean.valueOf(LJT.A01(c99e, interfaceC50520MRx, i)), interfaceC09390do, i);
    }

    public static final AbstractC162707Qh A04(C99E c99e, MessagingUser messagingUser, InterfaceC50520MRx interfaceC50520MRx, int i) {
        C45273K2b A00;
        C45273K2b A002 = Ko7.A00(c99e, interfaceC50520MRx, i);
        int i2 = i + 1;
        if (i2 == interfaceC50520MRx.getCount()) {
            A00 = null;
        } else {
            A00 = Ko7.A00(c99e, interfaceC50520MRx, i2);
        }
        int A003 = AbstractC162557Ps.A00(messagingUser, A002, A00, C7P5.A00().A01(LIQ.A00(c99e, interfaceC50520MRx, i)), false, true);
        if (A003 != 0) {
            if (A003 != 4) {
                return C163247Sj.A00;
            }
            return C162697Qg.A00;
        }
        return new C7SW(new MessagingUser(null, Long.valueOf(interfaceC50520MRx.BtD(i)), interfaceC50520MRx.BtG(i), 0, true), interfaceC50520MRx.BtI(i));
    }

    public static final C09530e4 A07(MessagingUser messagingUser, C47384KwZ c47384KwZ, boolean[] zArr) {
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        if (c47384KwZ != null) {
            List list = c47384KwZ.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((L4F) list.get(i)).A02;
                List list2 = (List) A1G.get(str);
                if (list2 == null) {
                    list2 = AbstractC166987dD.A1E();
                }
                String valueOf = String.valueOf(((L4F) list.get(i)).A03);
                list2.add(valueOf);
                A1G.put(str, list2);
                String str2 = ((L4F) list.get(i)).A04;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                A1G2.put(valueOf, AbstractC25225BEi.A0t(str2));
                String str4 = ((L4F) list.get(i)).A03;
                if (str4 != null) {
                    str3 = str4;
                }
                if (messagingUser.A03(str3)) {
                    zArr[0] = true;
                }
            }
        }
        return AbstractC166987dD.A1L(A1G, A1G2);
    }

    public static final C1585879t A03(Context context, C99E c99e, UserSession userSession, AnonymousClass988 anonymousClass988, C7IM c7im, MessagingUser messagingUser, L8R l8r, InterfaceC50520MRx interfaceC50520MRx, String str, java.util.Set set, int i) {
        String str2 = str;
        boolean A03 = messagingUser.A03(String.valueOf(interfaceC50520MRx.BtD(i)));
        C09530e4 A07 = A07(messagingUser, interfaceC50520MRx.Bkg(i), new boolean[]{false});
        Map map = (Map) A07.A00;
        Map map2 = (Map) A07.A01;
        KVX A00 = ((L7C) userSession.A01(L7C.class, new C50165MDs(userSession, 21))).A00(interfaceC50520MRx, i);
        C7D7 c7d7 = C7D7.A00;
        ArrayList A032 = LKZ.A03(interfaceC50520MRx.Bkg(i), interfaceC50520MRx.BtD(i));
        MessageIdentifier messageIdentifier = new MessageIdentifier(interfaceC50520MRx.BSx(i), String.valueOf(interfaceC50520MRx.BOG(i)));
        String A06 = A06(messagingUser, interfaceC50520MRx, i);
        String valueOf = String.valueOf(l8r.A00.mResultSet.getLong(0, 0));
        String str3 = messagingUser.A03;
        C14360o3.A07(str3);
        boolean A01 = LCG.A01(l8r);
        C7IH c7ih = c7im.A04;
        C2EY c2ey = A00.A10;
        C14360o3.A07(c2ey);
        C7DA A033 = c7d7.A03(null, userSession, anonymousClass988, c7ih, c2ey, messageIdentifier, Long.valueOf(TimeUnit.MICROSECONDS.toMillis(A00.C8i())), A06, valueOf, str3, A032, map, map2, A01, A03, false);
        C162717Qi c162717Qi = new C162717Qi(AbstractC25225BEi.A0t(interfaceC50520MRx.BtK(i)), A04(c99e, messagingUser, interfaceC50520MRx, i), LCG.A01(l8r));
        C7IJ A04 = AbstractC162737Qk.A04(c7im, A03);
        C7T7 A002 = new L6N(context).A00(c99e, anonymousClass988, messagingUser, interfaceC50520MRx, set, i, LCG.A01(l8r));
        if (interfaceC50520MRx.B0J(i) > 0) {
            str2 = AbstractC31174DnI.A0t(context, str2, context.getString(2131959873), 2131964621);
        }
        int i2 = c7im.A00;
        boolean z = false;
        boolean z2 = false;
        C1585679r c1585679r = new C1585679r(userSession, null, str2, null, null, i2, i2, false, false);
        if (A00.A0Q != null && A00.A10 == C2EY.A1C && AbstractC167007dF.A1Z(anonymousClass988.A0r)) {
            z2 = true;
        }
        String BSx = interfaceC50520MRx.BSx(i);
        if (LIQ.A00(c99e, interfaceC50520MRx, i) == C2EY.A1u) {
            z = true;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(c7im.A09);
        A1C.append('_');
        A1C.append(false);
        A1C.append('_');
        A1C.append(false);
        A1C.append('_');
        A1C.append(false);
        return new C1585879t(null, null, userSession, null, null, new C1585779s(A1C.toString(), MHU.A00(c7im, l8r, 24)), c1585679r, null, null, null, null, A002, null, c162717Qi, null, null, null, A033, null, BSx, null, A04.A00, z, z2, A03, false, true);
    }

    public static final String A05(Context context, MessagingUser messagingUser, L8R l8r, InterfaceC50520MRx interfaceC50520MRx, int i) {
        int i2;
        if (LCG.A01(l8r)) {
            return interfaceC50520MRx.BnQ(i);
        }
        Long BnP = interfaceC50520MRx.BnP(i);
        if (BnP != null) {
            boolean A01 = messagingUser.A01(BnP.longValue());
            if (InterfaceC50520MRx.A02(messagingUser, interfaceC50520MRx, i)) {
                i2 = 2131959900;
                if (A01) {
                    i2 = 2131959902;
                }
            } else {
                i2 = 2131959899;
                if (A01) {
                    i2 = 2131959901;
                }
            }
            return context.getString(i2);
        }
        throw AbstractC25227BEk.A0n();
    }

    public static final String A06(MessagingUser messagingUser, InterfaceC50520MRx interfaceC50520MRx, int i) {
        C47384KwZ Bkg = interfaceC50520MRx.Bkg(i);
        if (Bkg != null) {
            List list = Bkg.A00;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (C14360o3.A0K(((L4F) list.get(i2)).A03, messagingUser.A03)) {
                    return String.valueOf(((L4F) list.get(i2)).A01);
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d6, code lost:
    
        if (r79.BnV(r82) != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0103, code lost:
    
        if (r2.A00(X.EnumC2054697t.A0F) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0113, code lost:
    
        if (r2.A00(X.EnumC2054697t.A0H) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0139, code lost:
    
        if (r8 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0125, code lost:
    
        if (r9 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f3, code lost:
    
        if (r85 != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C7QX A01(android.content.Context r76, X.AnonymousClass988 r77, com.instagram.direct.model.messaginguser.MessagingUser r78, X.InterfaceC50520MRx r79, X.C2EY r80, X.InterfaceC16820sZ r81, int r82, boolean r83, boolean r84, boolean r85, boolean r86, boolean r87, boolean r88, boolean r89, boolean r90) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LLL.A01(android.content.Context, X.988, com.instagram.direct.model.messaginguser.MessagingUser, X.MRx, X.2EY, X.0sZ, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):X.7QX");
    }
}
