package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.7KH, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7KH {
    public static final int A00(E70 e70) {
        String str;
        if (e70 == null || (str = e70.A0N) == null) {
            return -1;
        }
        Locale locale = Locale.US;
        C14360o3.A08(locale);
        String upperCase = str.toUpperCase(locale);
        C14360o3.A07(upperCase);
        if (upperCase.equals("general")) {
            return 1;
        }
        return upperCase.equals("primary") ? 0 : -1;
    }

    public static final InterfaceC37169GZg A01(Context context, UserSession userSession, Capabilities capabilities, InterfaceC83733oI interfaceC83733oI) {
        InterfaceC50513MRq interfaceC50513MRq;
        InterfaceC37169GZg c36355G2h;
        C14360o3.A0B(userSession, 1);
        boolean z = interfaceC83733oI instanceof MsysThreadId;
        if (C18U.A06(C06090Tz.A05, userSession, 36313265587947370L)) {
            interfaceC50513MRq = C9ME.A00(userSession);
        } else {
            interfaceC50513MRq = null;
        }
        if (z) {
            c36355G2h = new C36356G2i(new G5I(userSession), new C36462G6m(context, userSession, capabilities, AbstractC1345466e.A03(interfaceC83733oI)), interfaceC50513MRq);
        } else {
            C83693oE A01 = AbstractC1345466e.A01(interfaceC83733oI);
            G5L g5l = new G5L(A01);
            c36355G2h = new C36355G2h(new C7TP(userSession, g5l, AbstractC28761aE.A00(userSession)), new C36461G6l(context, userSession, capabilities, A01), interfaceC50513MRq);
        }
        return c36355G2h;
    }

    public static final String A02(Context context, UserSession userSession, E70 e70, boolean z) {
        if (z) {
            return e70.A0P;
        }
        String str = e70.A0P;
        if (str == null) {
            str = "";
        }
        List A09 = e70.A09();
        if (A09 == null) {
            A09 = new ArrayList();
        }
        return C4GQ.A08(context, userSession, str, A09, false);
    }

    public static final String A03(C3o9 c3o9) {
        C14360o3.A0B(c3o9, 0);
        if (JRE.A0A(c3o9)) {
            return JRE.A01(c3o9).A01;
        }
        return "-1";
    }

    public static final ArrayList A05(List list) {
        C14360o3.A0B(list, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new PendingRecipient(((C32107E9f) it.next()).A00));
        }
        return arrayList;
    }

    public static final void A06(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Capabilities capabilities, MessagingUser messagingUser, Long l) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(messagingUser, 3);
        if (capabilities.A00(EnumC2054697t.A1B)) {
            if (l != null) {
                FA0.A00(fragmentActivity, interfaceC11380iw, userSession, messagingUser, l.longValue());
            } else {
                F3L.A00(fragmentActivity, interfaceC11380iw, userSession, messagingUser, "direct_thread_user_row", null, true, false);
            }
        }
    }

    public static final boolean A07(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36313265587947370L);
    }

    public static final ArrayList A04(UserSession userSession, E70 e70, EnumC31337Dq2 enumC31337Dq2, boolean z) {
        List<C32107E9f> A0a;
        C32107E9f A07;
        C14360o3.A0B(enumC31337Dq2, 3);
        GRL grl = GRL.A00;
        ArrayList arrayList = new ArrayList();
        if (e70.A09 == 29) {
            A0a = e70.A09();
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll((Collection) e70.A0a.getValue());
            if (!C18U.A06(C06090Tz.A06, userSession, 36313209753700166L)) {
                arrayList2.addAll((Collection) e70.A0Y.getValue());
                arrayList2.addAll((Collection) e70.A0Z.getValue());
            }
            A0a = AbstractC001800i.A0a(arrayList2);
        }
        int size = A0a.size();
        boolean A00 = LCG.A00(e70.A0A);
        if ((size == 0 || (A00 && z)) && (A07 = e70.A07()) != null && !A07.A0D && A08(A07, enumC31337Dq2)) {
            arrayList.add(A07);
        }
        if (size > 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            boolean z2 = true;
            for (C32107E9f c32107E9f : A0a) {
                if (A08(c32107E9f, enumC31337Dq2)) {
                    if (c32107E9f.A07 && C18U.A06(C06090Tz.A05, userSession, 36328770419834648L)) {
                        arrayList11.add(c32107E9f);
                    } else {
                        User user = c32107E9f.A00;
                        if (user.BJ8() == 1) {
                            arrayList6.add(c32107E9f);
                        } else if (c32107E9f.A0C) {
                            arrayList9.add(c32107E9f);
                        } else if (c32107E9f.A0B) {
                            arrayList10.add(c32107E9f);
                        } else if (c32107E9f.A08) {
                            arrayList8.add(c32107E9f);
                        } else if (c32107E9f.A0A) {
                            arrayList7.add(c32107E9f);
                        } else if (user.B7L() == FollowStatus.A05) {
                            arrayList3.add(c32107E9f);
                        } else if (user.B7L() == FollowStatus.A07) {
                            arrayList4.add(c32107E9f);
                        } else if (user.B7L() == FollowStatus.A06) {
                            arrayList5.add(c32107E9f);
                        } else {
                            if (user.B7L() == FollowStatus.A08 && !(e70.A08() instanceof MsysThreadId)) {
                                AbstractC129875tr.A00(userSession).A0G(user, false);
                            }
                            z2 = false;
                        }
                    }
                }
            }
            if (z2) {
                C01T.A1D(arrayList11, grl);
                Collections.sort(arrayList3, grl);
                Collections.sort(arrayList4, grl);
                Collections.sort(arrayList6, grl);
                Collections.sort(arrayList9, grl);
                Collections.sort(arrayList10, grl);
                Collections.sort(arrayList8, grl);
                Collections.sort(arrayList7, grl);
                arrayList.addAll(arrayList11);
                arrayList.addAll(arrayList3);
                arrayList.addAll(arrayList4);
                arrayList.addAll(arrayList5);
                arrayList.addAll(arrayList6);
                arrayList.addAll(arrayList9);
                arrayList.addAll(arrayList10);
                arrayList.addAll(arrayList8);
                arrayList.addAll(arrayList7);
            } else {
                arrayList.addAll(A0a);
                return arrayList;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A08(X.C32107E9f r3, X.EnumC31337Dq2 r4) {
        /*
            int r2 = r4.ordinal()
            r1 = 0
            r0 = 1
            if (r2 == r0) goto L15
            r0 = 2
            if (r2 != r0) goto L13
            boolean r0 = r3.A08
            if (r0 != 0) goto L13
            boolean r0 = r3.A0A
        L11:
            if (r0 == 0) goto L14
        L13:
            r1 = 1
        L14:
            return r1
        L15:
            boolean r0 = r3.A07
            if (r0 != 0) goto L13
            boolean r0 = r3.A0C
            if (r0 != 0) goto L13
            boolean r0 = r3.A0B
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7KH.A08(X.E9f, X.Dq2):boolean");
    }
}
