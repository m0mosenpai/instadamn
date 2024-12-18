package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.music.common.config.MusicAttributionConfig;
import java.util.List;

/* renamed from: X.Iem, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41770Iem {
    public static final EffectPreviewIntf A02(C38321qM c38321qM) {
        CreativeConfigIntf Asm;
        List B0S;
        if (c38321qM == null || (Asm = c38321qM.A0C.Asm()) == null || (B0S = Asm.B0S()) == null || B0S.size() != 1) {
            return null;
        }
        return (EffectPreviewIntf) AbstractC001800i.A0O(B0S, 0);
    }

    public static final MusicAttributionConfig A03(C38321qM c38321qM) {
        C3x9 A0u;
        C3x9 A0u2;
        if (c38321qM == null) {
            return null;
        }
        C3x9 A0u3 = AbstractC25226BEj.A0u(c38321qM);
        if (((A0u3 == null || A0u3.BVc() == null) && ((A0u = AbstractC25226BEj.A0u(c38321qM)) == null || A0u.BZw() == null)) || (A0u2 = AbstractC25226BEj.A0u(c38321qM)) == null) {
            return null;
        }
        return AbstractC117245Sj.A03(A0u2);
    }

    public static final Boolean A05(C120985dq c120985dq) {
        C38321qM c38321qM;
        if (c120985dq != null) {
            c38321qM = c120985dq.A02;
        } else {
            c38321qM = null;
        }
        EffectPreviewIntf A02 = A02(c38321qM);
        if (A02 != null) {
            return Boolean.valueOf(AbstractC167007dF.A1W(A02.getFailureReason()));
        }
        return null;
    }

    public static final EnumC185548Kw A00(UserSession userSession, String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return EnumC185548Kw.A03;
            }
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36316637137277492L)) {
                return EnumC185548Kw.A08;
            }
            if (C18U.A06(c06090Tz, userSession, 36316637137211955L)) {
                return EnumC185548Kw.A07;
            }
            return EnumC185548Kw.A02;
        }
        if (str2 != null) {
            return EnumC185548Kw.A04;
        }
        return EnumC185548Kw.A05;
    }

    public static final String A0A(UserSession userSession, C38321qM c38321qM) {
        C3x9 A0u;
        InterfaceC88553xD A01;
        if (c38321qM != null && (A0u = AbstractC25226BEj.A0u(c38321qM)) != null && (A01 = AbstractC117245Sj.A01(A0u)) != null && A01.Cat(userSession.userId)) {
            return A01.getAssetId();
        }
        return null;
    }

    public static final ImageUrl A01(C120985dq c120985dq) {
        C38321qM c38321qM;
        if (AbstractC31177DnL.A1b(A05(c120985dq))) {
            return null;
        }
        if (c120985dq != null) {
            c38321qM = c120985dq.A02;
        } else {
            c38321qM = null;
        }
        EffectPreviewIntf A02 = A02(c38321qM);
        if (A02 == null) {
            return null;
        }
        return AbstractC41732Ie4.A00(A02);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.INH A04(X.C22P r7, X.C120985dq r8, com.instagram.common.session.UserSession r9) {
        /*
            X.AbstractC167017dG.A1O(r9, r7)
            if (r8 == 0) goto L15
            X.1qM r0 = r8.A02
        L7:
            java.lang.String r4 = A0A(r9, r0)
            java.lang.String r3 = A08(r8)
            r1 = 0
            if (r4 != 0) goto L17
            if (r3 != 0) goto L6a
            return r1
        L15:
            r0 = 0
            goto L7
        L17:
            if (r3 != 0) goto L6a
            r3 = r1
            r6 = r1
            r5 = r1
            r0 = r1
        L1d:
            X.INH r2 = X.AbstractC86593tX.A0C(r7)
            r2.A0G = r4
            r2.A0Q = r3
            r2.A0R = r6
            r2.A0P = r5
            r2.A02 = r0
            if (r8 == 0) goto L68
            X.1qM r0 = r8.A02
        L2f:
            com.instagram.music.common.config.MusicAttributionConfig r0 = A03(r0)
            r2.A08 = r0
            if (r8 == 0) goto L66
            com.instagram.user.model.User r0 = r8.A09(r9)
            if (r0 == 0) goto L66
            java.lang.String r0 = r0.getUsername()
        L41:
            r2.A0e = r0
            if (r8 == 0) goto L4d
            X.1qM r0 = r8.A02
            if (r0 == 0) goto L4d
            java.lang.String r1 = r0.getId()
        L4d:
            r2.A0d = r1
            X.8Kw r1 = A00(r9, r4, r3)
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r2.A01 = r1
            java.lang.Boolean r0 = A06(r8)
            r2.A0E = r0
            java.lang.String r0 = A07(r8)
            r2.A0O = r0
            return r2
        L66:
            r0 = 0
            goto L41
        L68:
            r0 = 0
            goto L2f
        L6a:
            java.lang.String r6 = A09(r8)
            java.lang.Boolean r0 = A05(r8)
            boolean r0 = X.AbstractC31177DnL.A1b(r0)
            r5 = 0
            if (r0 != 0) goto L8d
            if (r8 == 0) goto L92
            X.1qM r0 = r8.A02
        L7d:
            com.instagram.feed.media.EffectPreviewIntf r0 = A02(r0)
            if (r0 == 0) goto L8d
            com.instagram.api.schemas.AttributionUser r0 = r0.AdP()
            if (r0 == 0) goto L8d
            java.lang.String r5 = r0.getUsername()
        L8d:
            com.instagram.common.typedurl.ImageUrl r0 = A01(r8)
            goto L1d
        L92:
            r0 = r1
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41770Iem.A04(X.22P, X.5dq, com.instagram.common.session.UserSession):X.INH");
    }

    public static final Boolean A06(C120985dq c120985dq) {
        C38321qM c38321qM;
        if (AbstractC31177DnL.A1b(A05(c120985dq))) {
            return null;
        }
        if (c120985dq != null) {
            c38321qM = c120985dq.A02;
        } else {
            c38321qM = null;
        }
        if (A02(c38321qM) == null) {
            return null;
        }
        return Boolean.valueOf(!MessageAvailabilityResponseId$Companion.NOT_SUPPORTED.equals(r0.getSaveStatus()));
    }

    public static final String A07(C120985dq c120985dq) {
        C38321qM c38321qM;
        if (AbstractC31177DnL.A1b(A05(c120985dq))) {
            return null;
        }
        if (c120985dq != null) {
            c38321qM = c120985dq.A02;
        } else {
            c38321qM = null;
        }
        EffectPreviewIntf A02 = A02(c38321qM);
        if (A02 == null) {
            return null;
        }
        return AbstractC41732Ie4.A02(A02);
    }

    public static final String A08(C120985dq c120985dq) {
        C38321qM c38321qM;
        if (AbstractC31177DnL.A1b(A05(c120985dq))) {
            return null;
        }
        if (c120985dq != null) {
            c38321qM = c120985dq.A02;
        } else {
            c38321qM = null;
        }
        EffectPreviewIntf A02 = A02(c38321qM);
        if (A02 == null) {
            return null;
        }
        return A02.getId();
    }

    public static final String A09(C120985dq c120985dq) {
        C38321qM c38321qM;
        if (AbstractC31177DnL.A1b(A05(c120985dq))) {
            return null;
        }
        if (c120985dq != null) {
            c38321qM = c120985dq.A02;
        } else {
            c38321qM = null;
        }
        EffectPreviewIntf A02 = A02(c38321qM);
        if (A02 == null) {
            return null;
        }
        return A02.getName();
    }
}
