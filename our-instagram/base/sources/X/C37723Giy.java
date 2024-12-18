package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;

/* renamed from: X.Giy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37723Giy {
    public static final C37723Giy A00 = new Object();

    public final boolean A00(ClipsViewerSource clipsViewerSource, UserSession userSession, String str, boolean z) {
        InterfaceC131055vt BfV;
        AbstractC167007dF.A1D(userSession, 1, clipsViewerSource);
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        if ((A0h == null || (BfV = A0h.A0C.BfV()) == null || !AbstractC166997dE.A1Z(BfV.BvK(), true)) && clipsViewerSource.ordinal() == 11) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36318479682312405L)) {
                z = C18U.A06(c06090Tz, userSession, 36318479682377942L);
            }
            if (!z) {
                return true;
            }
            return false;
        }
        return false;
    }
}
