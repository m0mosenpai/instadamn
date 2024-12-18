package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;

/* loaded from: classes8.dex */
public abstract class LHD {
    public static void A00(final C19260xA c19260xA, final UserSession userSession, final InterfaceC37261GbE interfaceC37261GbE, final C1OW c1ow, final InterfaceC31091eE interfaceC31091eE, final DirectThreadKey directThreadKey, final PendingMediaStore pendingMediaStore, final PendingMediaStoreSerializer pendingMediaStoreSerializer, final String str) {
        C11T.A02(new Runnable() { // from class: X.M7K
            @Override // java.lang.Runnable
            public final void run() {
                UserSession userSession2 = userSession;
                PendingMediaStore pendingMediaStore2 = pendingMediaStore;
                PendingMediaStoreSerializer pendingMediaStoreSerializer2 = pendingMediaStoreSerializer;
                C1OW c1ow2 = c1ow;
                String str2 = str;
                DirectThreadKey directThreadKey2 = directThreadKey;
                C19260xA c19260xA2 = c19260xA;
                InterfaceC37261GbE interfaceC37261GbE2 = interfaceC37261GbE;
                InterfaceC31091eE interfaceC31091eE2 = interfaceC31091eE;
                LHD.A01(c19260xA2, userSession2, interfaceC37261GbE2, c1ow2, directThreadKey2, C40121td.A00(AbstractC12290kX.A00, userSession2), pendingMediaStore2, str2);
                pendingMediaStoreSerializer2.A06(new RunnableC50022M6l(interfaceC37261GbE2, c1ow2, interfaceC31091eE2, pendingMediaStore2, str2));
            }
        });
    }

    public static void A01(C19260xA c19260xA, UserSession userSession, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, DirectThreadKey directThreadKey, C40121td c40121td, PendingMediaStore pendingMediaStore, String str) {
        if (C18U.A06(C06090Tz.A05, userSession, 2342164439534675380L)) {
            C47Z A03 = pendingMediaStore.A03(str);
            if (A03 == null) {
                C114675Fx c114675Fx = AbstractC47202Ktb.A02;
                C162337Ov.A0Z(interfaceC37261GbE.B4C(), C05F.A0N);
                interfaceC37261GbE.DUq(c114675Fx, null);
                return;
            } else if (A03.A6J != EnumC915447k.A02 && !A02(A03)) {
                if (AbstractC159387Cy.A00(userSession, c1ow, directThreadKey) != EnumC159397Cz.A06) {
                    A03.A5D = true;
                    A03.A6C = false;
                    A03.A53 = true;
                }
                c40121td.A09(A03);
            }
        }
        C162337Ov.A0Y(c19260xA, C05F.A0N);
    }

    public static boolean A02(C47Z c47z) {
        if ((!c47z.A4w || c47z.A5Q) && !c47z.A0m() && !c47z.A12()) {
            return false;
        }
        return true;
    }
}
