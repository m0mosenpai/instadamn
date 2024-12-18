package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.5jP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC124105jP {
    public static int A00(UserSession userSession, AbstractC81363k6 abstractC81363k6, int i, int i2, int i3, int i4) {
        AbstractC69533An abstractC69533An;
        Reel reel;
        C41181vS A09;
        if (i == -1 || i2 == -1 || (abstractC69533An = (AbstractC69533An) abstractC81363k6.A08.A0A) == null) {
            return -1;
        }
        int i5 = -1;
        while (i <= i2) {
            if (abstractC69533An.Bla(i) != null && (reel = (Reel) abstractC69533An.Bla(i)) != null && (A09 = reel.A09(userSession)) != null && A09.A1o() && !reel.A16(userSession)) {
                if (i < i3) {
                    i5 = i;
                } else if (i <= i4 || i5 == -1) {
                    return i;
                }
            }
            i++;
        }
        return i5;
    }

    public static boolean A01(C61252qn c61252qn, C1121854m c1121854m) {
        InterfaceC124075jM interfaceC124075jM;
        C101274gj c101274gj = c1121854m.A00;
        boolean z = false;
        if (c101274gj.A00.A0B != null) {
            z = true;
        }
        if (z || (((interfaceC124075jM = c1121854m.A01) != null && interfaceC124075jM.CFw() == 1) || c101274gj.A01 == C1XV.A0Q)) {
            return false;
        }
        return c61252qn.CLh();
    }
}
