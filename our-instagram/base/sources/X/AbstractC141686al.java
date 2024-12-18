package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6al, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC141686al {
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C19280xC r3, com.instagram.common.session.UserSession r4, X.C38321qM r5) {
        /*
            boolean r0 = r5.CdW()
            java.lang.String r2 = "tracking_token"
            java.lang.String r1 = "a_i"
            if (r0 == 0) goto L3c
            java.lang.String r0 = "ad"
            r3.A0C(r1, r0)
            java.lang.String r0 = X.AbstractC41071vF.A0F(r4, r5)
        L13:
            r3.A0C(r2, r0)
        L16:
            com.instagram.user.model.User r0 = r5.A2E(r4)
            if (r0 == 0) goto L25
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "a_pk"
            r3.A0C(r0, r1)
        L25:
            java.lang.String r1 = r5.getId()
            java.lang.String r0 = "m_pk"
            r3.A0C(r0, r1)
            long r0 = r5.A1B()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "m_ts"
            r3.A0B(r0, r1)
            return
        L3c:
            boolean r0 = r5.CZq()
            if (r0 == 0) goto L4e
            java.lang.String r0 = "organic"
            r3.A0C(r1, r0)
            X.1rF r0 = r5.A0C
            java.lang.String r0 = r0.getOrganicTrackingToken()
            goto L13
        L4e:
            java.lang.String r0 = "none"
            r3.A0C(r1, r0)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC141686al.A00(X.0xC, com.instagram.common.session.UserSession, X.1qM):void");
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM) {
        if (c38321qM.Cff() && !c38321qM.A4w()) {
            String moduleName = interfaceC11380iw.getModuleName();
            if (!C18U.A06(C06090Tz.A05, userSession, 36312758781805821L)) {
                C19280xC A01 = C19280xC.A01("video_cover_photo_failed", moduleName);
                C14360o3.A0A(A01);
                A00(A01, userSession, c38321qM);
                boolean CdW = c38321qM.CdW();
                AbstractC19330xH A00 = AbstractC11060iN.A00(userSession);
                if (CdW) {
                    A00.EIu(A01);
                } else {
                    A00.EHW(A01);
                }
            }
        }
    }

    public static final void A02(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM) {
        if (c38321qM.Cff() && !c38321qM.A4w()) {
            String moduleName = interfaceC11380iw.getModuleName();
            if (!C18U.A06(C06090Tz.A05, userSession, 36312758781805821L)) {
                C19280xC A01 = C19280xC.A01("video_cover_photo_finished", moduleName);
                C14360o3.A0A(A01);
                A00(A01, userSession, c38321qM);
                boolean CdW = c38321qM.CdW();
                AbstractC19330xH A00 = AbstractC11060iN.A00(userSession);
                if (CdW) {
                    A00.EIu(A01);
                } else {
                    A00.EHW(A01);
                }
            }
        }
    }

    public static final void A03(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM) {
        if (c38321qM.Cff() && !c38321qM.A4w()) {
            String moduleName = interfaceC11380iw.getModuleName();
            if (!C18U.A06(C06090Tz.A05, userSession, 36312758781805821L)) {
                C19280xC A01 = C19280xC.A01("video_cover_photo_started", moduleName);
                C14360o3.A0A(A01);
                A00(A01, userSession, c38321qM);
                boolean CdW = c38321qM.CdW();
                AbstractC19330xH A00 = AbstractC11060iN.A00(userSession);
                if (CdW) {
                    A00.EIu(A01);
                } else {
                    A00.EHW(A01);
                }
            }
        }
    }
}
