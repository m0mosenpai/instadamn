package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class AMM {
    public static final AMM A00 = new Object();

    public static final C1125256f A00(C47Z c47z) {
        HashMap hashMap;
        C1125256f c1125256f;
        List list;
        List list2;
        C1125256f c1125256f2 = c47z.A1K;
        if (c1125256f2 != null && (hashMap = c1125256f2.A0P) != null && (c1125256f = (C1125256f) hashMap.get(String.valueOf(8))) != null) {
            String str = c1125256f.A0L;
            if (str != null) {
                if (str.equals("gradient_transform") && (list = c1125256f.A0V) != null && list.size() == 4 && (list2 = c1125256f.A0Q) != null && list2.size() == 4) {
                    return c1125256f;
                }
            } else {
                C14360o3.A0F("filterModelClass");
                throw C00O.createAndThrow();
            }
        }
        return null;
    }

    public static final C84823qW A01(C47Z c47z) {
        Object obj;
        Iterator it = c47z.A4b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C84823qW c84823qW = (C84823qW) obj;
                if (c84823qW.A12 == EnumC75383a5.A0o && c84823qW.A1b != null && C14360o3.A0K(c84823qW.A1l, "reel_mention_post_fullscreen_photo")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C84823qW) obj;
    }

    public static final C84823qW A02(C47Z c47z) {
        Object obj;
        Iterator it = c47z.A4b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C84823qW c84823qW = (C84823qW) obj;
                if (c84823qW.A12 == EnumC75383a5.A0o && c84823qW.A1b != null && C14360o3.A0K(c84823qW.A1l, "reel_mention_post")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C84823qW) obj;
    }

    public final boolean A03(UserSession userSession, C47Z c47z) {
        if (c47z.A1G == EnumC40111tc.A0a && c47z.A0D().A00 && c47z.A14(ShareType.A02) && A01(c47z) != null) {
            boolean A03 = AbstractC25351Lp.A03(userSession);
            if (c47z.A10 == null && ((!c47z.A57 || A03) && c47z.A4P == null && c47z.A1i.A01 == 0)) {
                List list = c47z.A4g;
                if (list == null) {
                    list = C16930sl.A00;
                }
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str = ((C84823qW) it.next()).A1i;
                        if (str != null && str.length() != 0) {
                            break;
                        }
                    }
                }
                if (AbstractC166987dD.A1b(c47z.A4Y) || !C18U.A06(C06090Tz.A05, userSession, 36327636548467443L)) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (X.AbstractC25351Lp.A03(r6) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04(com.instagram.common.session.UserSession r6, X.C47Z r7) {
        /*
            r5 = this;
            X.56f r4 = A00(r7)
            r3 = 1
            if (r4 == 0) goto L15
            float r1 = r4.A02
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L15
            boolean r0 = X.AbstractC25351Lp.A03(r6)
            r2 = 1
            if (r0 != 0) goto L16
        L15:
            r2 = 0
        L16:
            X.1tc r1 = r7.A1G
            X.1tc r0 = X.EnumC40111tc.A0a
            if (r1 != r0) goto L3e
            com.instagram.pendingmedia.model.constants.ShareType r0 = r7.A0D()
            boolean r0 = r0.A00
            if (r0 == 0) goto L3e
            java.util.EnumSet r0 = com.instagram.pendingmedia.model.constants.ShareType.A02
            boolean r0 = r7.A14(r0)
            if (r0 == 0) goto L3e
            X.3qW r0 = A02(r7)
            if (r0 == 0) goto L3e
            if (r4 == 0) goto L3e
            com.instagram.camera.effect.models.CameraAREffect r0 = r7.A10
            if (r0 != 0) goto L3e
            boolean r0 = r7.A57
            if (r0 == 0) goto L40
            if (r2 != 0) goto L40
        L3e:
            r3 = 0
        L3f:
            return r3
        L40:
            java.util.List r0 = r7.A4P
            if (r0 != 0) goto L3e
            X.47m r0 = r7.A1i
            int r0 = r0.A01
            if (r0 != 0) goto L3e
            java.util.List r1 = r7.A4g
            if (r1 != 0) goto L50
            X.0sl r1 = X.C16930sl.A00
        L50:
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L70
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L70
        L5a:
            java.util.List r0 = r7.A4Y
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            if (r0 != 0) goto L3e
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36327636548598517(0x810fcb00023af5, double:3.037081860760306E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 != 0) goto L3f
            goto L3e
        L70:
            java.util.Iterator r1 = r1.iterator()
        L74:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r1.next()
            X.3qW r0 = (X.C84823qW) r0
            java.lang.String r0 = r0.A1i
            if (r0 == 0) goto L74
            int r0 = r0.length()
            if (r0 != 0) goto L3e
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AMM.A04(com.instagram.common.session.UserSession, X.47Z):boolean");
    }
}
