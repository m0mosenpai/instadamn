package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class LBk {
    public static final String A01(UserSession userSession, LGP lgp, C2EY c2ey, Object obj, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(lgp, 0);
        return A00(userSession, lgp, new C47308KvJ(true), c2ey, obj, interfaceC16820sZ);
    }

    public static final String A00(UserSession userSession, LGP lgp, C47308KvJ c47308KvJ, C2EY c2ey, Object obj, InterfaceC16820sZ interfaceC16820sZ) {
        int i;
        InterfaceC16820sZ mhl;
        Object l1f;
        AbstractC46724Klh abstractC46724Klh = AbstractC46724Klh.$redex_init_class;
        int ordinal = c2ey.ordinal();
        if (ordinal != 22 && ordinal != 28) {
            if (ordinal == 32) {
                if (obj instanceof String) {
                    MHL mhl2 = new MHL(interfaceC16820sZ, 2);
                    c2ey = C2EY.A1B;
                    l1f = new C47551KzL((String) obj, mhl2);
                } else if (!(obj instanceof IKN)) {
                    throw AbstractC43594JPz.A0o(obj, "Expected String or DirectLiveViewerInvite: ", AbstractC166987dD.A1C());
                }
            }
            return lgp.A01(c2ey, obj);
        }
        if (obj instanceof C38321qM) {
            i = 44;
        } else if (obj instanceof C47813L9v) {
            mhl = new MHL(obj, 3);
            l1f = new L1F(obj, mhl);
        } else if (obj instanceof C7QR) {
            i = 45;
        } else if (obj instanceof C7QP) {
            i = 46;
        } else {
            throw AbstractC43594JPz.A0o(obj, "Expected Media, DirectReelMedia, or DirectStoryShareMedia: ", AbstractC166987dD.A1C());
        }
        mhl = new C50169MDw(i, userSession, obj);
        l1f = new L1F(obj, mhl);
        return lgp.A00(c47308KvJ, c2ey, l1f);
    }
}
