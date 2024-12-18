package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KXD extends AbstractC44190Jft implements InterfaceC13050lr {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final UserSession A03;

    public KXD(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        super.A01 = C1QS.A00(userSession);
        this.A03 = userSession;
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        this.A02 = false;
    }

    public static final void A01(EnumC31648DvE enumC31648DvE, KXD kxd, boolean z, boolean z2) {
        String str;
        String str2;
        if ("pending".equals(enumC31648DvE.A00)) {
            if (z) {
                str = "fetch_threads_finish_pending";
            } else {
                str = "fetch_threads_more_finish_pending";
            }
        } else if (z) {
            str = "fetch_threads_finish_other";
        } else {
            str = "fetch_threads_more_finish_other";
        }
        if (z2) {
            str2 = "server";
        } else {
            str2 = "cache";
        }
        kxd.A04(str, str2);
    }

    public static final boolean A02(KXD kxd, Integer num) {
        String str;
        if (((AbstractC44190Jft) kxd).A00 == 0) {
            UserSession userSession = kxd.A03;
            if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36314154646112739L)) {
                C1QT c1qt = ((AbstractC44190Jft) kxd).A01;
                switch (num.intValue()) {
                    case 0:
                        str = "DIRECT_TAB";
                        break;
                    case 1:
                        str = "REQUEST_THREAD_VIEW";
                        break;
                    default:
                        str = "MANUAL_RETRY";
                        break;
                }
                ((AbstractC44190Jft) kxd).A00 = c1qt.flowStartForMarker(70785807, AbstractC167007dF.A0h(str), false);
                return true;
            }
        }
        return false;
    }
}
