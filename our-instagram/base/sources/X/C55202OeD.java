package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.OeD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55202OeD {
    public static InterfaceC41501vz A00;
    public static final C55202OeD A02 = new Object();
    public static final CallerContext A01 = CallerContext.A01("ReelsShareToFbRowViewBinder");

    public static final void A00(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, C211849aB c211849aB, C54472O5a c54472O5a, C54722OEz c54722OEz, ENZ enz) {
        boolean z;
        Integer num = c211849aB.A00;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        IgdsButton igdsButton = c54722OEz.A06;
                        igdsButton.setLoading(false);
                        igdsButton.setEnabled(true);
                        C196068lw.A00(userSession).A01(A01, null, "reels_row_share");
                        A01(context, abstractC59962oe, userSession, new C54563O8p(c54472O5a.A00, false), c54722OEz, enz);
                        return;
                    }
                    return;
                }
                z = false;
            } else {
                C200108tF.A01.A0C(userSession, "reels_row_share", true, true);
                z = true;
            }
            C79923hh.A00.A0C(context, C79923hh.A00(C82G.A0b, new C55880OrU(context, abstractC59962oe, userSession, c54472O5a, c54722OEz, enz, z), userSession, c54472O5a.A00, C05F.A15), userSession, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f3, code lost:
    
        if (r0.length() != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0158, code lost:
    
        if (r10.length() == 0) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.content.Context r11, X.AbstractC59962oe r12, com.instagram.common.session.UserSession r13, X.C54563O8p r14, X.C54722OEz r15, X.ENZ r16) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55202OeD.A01(android.content.Context, X.2oe, com.instagram.common.session.UserSession, X.O8p, X.OEz, X.ENZ):void");
    }

    public static final void A02(EnumC201098ur enumC201098ur, UserSession userSession, String str) {
        C82G c82g = C82G.A0b;
        C82H c82h = C82H.A0v;
        C82I A0H = MSW.A0H();
        A0H.A06("ig_media_id", str);
        AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H, userSession);
        A03(enumC201098ur, userSession, str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Zx, X.MnJ] */
    public static final void A03(EnumC201098ur enumC201098ur, UserSession userSession, String str) {
        C82G c82g;
        MU0 mu0;
        if (enumC201098ur == EnumC201098ur.VIEW) {
            c82g = C82G.A0b;
            mu0 = MU0.VIEW;
        } else {
            if (enumC201098ur != EnumC201098ur.ACCEPT) {
                return;
            }
            c82g = C82G.A0b;
            mu0 = MU0.SHARE_CLICK;
        }
        MU1 mu1 = MU1.REELS;
        ?? c0Zx = new C0Zx();
        c0Zx.A06("media_id", str);
        AbstractC50568MTz.A00(mu0, mu1, c82g, c0Zx, userSession);
    }

    public static final void A04(EnumC201098ur enumC201098ur, UserSession userSession, String str, String str2) {
        C82G c82g = C82G.A0b;
        C82H c82h = C82H.A0s;
        C82I A0H = MSW.A0H();
        AbstractC50523MSb.A19(A0H, "ig_media_id", str, str2);
        AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H, userSession);
        A03(enumC201098ur, userSession, str);
    }
}
