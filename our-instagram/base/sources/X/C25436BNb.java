package X;

import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.BNb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25436BNb {
    public static final C25436BNb A00 = new Object();

    public static final C80393iU A00(Drawable drawable, C2Z0 c2z0, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C14360o3.A0B(str, 2);
        AbstractC167007dF.A1G(interfaceC16660sJ, 4, str2);
        if (drawable == null) {
            return null;
        }
        int i = R.dimen.action_bar_item_spacing_right;
        if (z) {
            i = R.dimen.abc_dialog_padding_material;
        }
        long A0D = AbstractC77623dm.A0D(c2z0, i);
        C75933ay c75933ay = C51722Yv.A02;
        return AbstractC25234BEr.A0O(drawable, c2z0.A00, C9CU.A00(C9CU.A00(C9CV.A00(AbstractC25233BEq.A0a(C9CV.A00(AbstractC25231BEo.A0Y(null, interfaceC16660sJ), C05F.A08, str2, 4), C05F.A0C, 0.0f), C05F.A0D, str, 4), C05F.A01, 0, A0D), C05F.A00, 0, AbstractC25229BEm.A0K((int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * AbstractC25228BEl.A08(c2z0, A0D)))));
    }

    public final boolean A02(C25377BKu c25377BKu, C120985dq c120985dq, C25437BNc c25437BNc, C37644Ghd c37644Ghd, UserSession userSession, C38321qM c38321qM, boolean z) {
        List A3j;
        Boolean bool;
        boolean z2;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c120985dq, 2);
        C14360o3.A0B(c37644Ghd, 3);
        SocialContextType socialContextType = c25437BNc.A01;
        switch (socialContextType.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
            case 20:
                if (socialContextType != SocialContextType.A0N && c25377BKu.A0H && (((A3j = c38321qM.A3j()) == null || !(!A3j.isEmpty()) || !C18U.A06(C06090Tz.A05, userSession, 36320618575307513L)) && ((!BLH.A01(socialContextType, userSession) || !c25437BNc.A04) && ((c38321qM.A1M() == null || !z) && socialContextType != SocialContextType.A06)))) {
                    C38321qM c38321qM2 = c120985dq.A02;
                    C75113Zb c75113Zb = c37644Ghd.A0E;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (!C18U.A06(c06090Tz, userSession, 36323105358031855L) || !c25377BKu.A08) {
                        return false;
                    }
                    if (c38321qM2 != null) {
                        bool = Boolean.valueOf(c38321qM2.Cff());
                    } else {
                        bool = null;
                    }
                    boolean A06 = C18U.A06(c06090Tz, userSession, 36323105358228465L);
                    if (C14360o3.A0K(bool, true) && !A06) {
                        if (c75113Zb == null) {
                            return false;
                        }
                        z2 = c75113Zb.A2A;
                    } else {
                        if (c75113Zb == null) {
                            return false;
                        }
                        if (!((Boolean) c75113Zb.A3R.A00).booleanValue() && !c75113Zb.A1p) {
                            z2 = c75113Zb.A28;
                        }
                    }
                    if (!z2) {
                        return false;
                    }
                }
                break;
            default:
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r3 == com.instagram.api.schemas.SocialContextType.A05) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (X.BLH.A01(r4.ByT(), r22) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r4.isEmpty() != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0145 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C25437BNc A01(com.instagram.common.session.UserSession r22, X.C38321qM r23, X.C75113Zb r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25436BNb.A01(com.instagram.common.session.UserSession, X.1qM, X.3Zb, java.lang.String):X.BNc");
    }
}
