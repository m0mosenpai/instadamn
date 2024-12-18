package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.OdT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55165OdT {
    public static final void A00(Activity activity, DialogInterface.OnDismissListener onDismissListener, C82G c82g, C82H c82h, UserSession userSession, C41181vS c41181vS, InterfaceC146936jV interfaceC146936jV, InterfaceC146916jT interfaceC146916jT, boolean z) {
        EnumC76383bi enumC76383bi;
        AbstractC167017dG.A1R(activity, c82g);
        C14360o3.A0B(interfaceC146916jT, 6);
        EnumC201098ur enumC201098ur = EnumC201098ur.VIEW;
        C82I A0H = MSW.A0H();
        A0H.A0A(Boolean.valueOf(z));
        AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H, userSession);
        if (c41181vS != null) {
            enumC76383bi = c41181vS.A0B();
        } else {
            enumC76383bi = null;
        }
        boolean A1X = AbstractC167007dF.A1X(enumC76383bi, EnumC76383bi.A04);
        C50674MYs c50674MYs = new C50674MYs(activity, userSession);
        int i = 2131973760;
        if (A1X) {
            i = 2131973759;
        }
        c50674MYs.A02(new ViewOnClickListenerC55430Ojf(c82g, c82h, userSession, c41181vS, interfaceC146936jV, interfaceC146916jT, A1X, z), i);
        c50674MYs.A03 = new C56406P2t(2, onDismissListener, interfaceC146936jV);
        c50674MYs.A08(activity.getString(2131973761));
        C3DN A0r = AbstractC31172DnG.A0r(activity);
        if (A0r != null && ((C3DP) A0r).A0h) {
            new C31727DwY(c50674MYs).A06(activity);
        } else {
            C31727DwY.A00(activity, c50674MYs);
        }
    }

    public static final void A01(Context context, DialogInterface.OnDismissListener onDismissListener, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, UserSession userSession, C41181vS c41181vS) {
        C14360o3.A0B(abstractC018607g, 3);
        AbstractC35084Fcv.A01(context, AbstractC101614hW.A04(c41181vS), new P95(context, onDismissListener, abstractC10360h2, abstractC018607g, userSession, c41181vS), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r5.A56() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r5.A1m() == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        java.lang.String.valueOf(r5.A1m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (X.AbstractC25230BEn.A1P(((r5.A1B() + com.instagram.debug.devoptions.sandboxselector.SandboxRepository.CACHE_TTL) > X.AbstractC31177DnL.A06() ? 1 : ((r5.A1B() + com.instagram.debug.devoptions.sandboxselector.SandboxRepository.CACHE_TTL) == X.AbstractC31177DnL.A06() ? 0 : -1))) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
    
        if (r5.A5W() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        if (r28 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        r27 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        r2 = new X.C54696ODy(r37, r38, r26, r27, r28, r29);
        r10 = X.AbstractC166987dD.A1C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        if (r40.A1f() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        r9 = 2131957706;
        r1 = 2131957684;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        X.AbstractC31172DnG.A1D(r32, r10, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
    
        r11 = X.AbstractC31171DnF.A0H(r32);
        r0 = r10.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        if (r0 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
    
        r11.A0r(android.text.Html.fromHtml(r0));
        r11.A0A(r9);
        r0 = 2131957640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
    
        if (r3 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ce, code lost:
    
        r0 = 2131957644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d1, code lost:
    
        r13 = new X.DialogInterfaceOnClickListenerC35381Fiw(r32, r33, r35, r36, r38, r39, r40, r2, r41, r3);
        r1 = X.EnumC193348hE.A06;
        r11.A0R(r13, r1, r0);
        r11.A0D(new X.DialogInterfaceOnClickListenerC35353FiU(3, r33, r38, r2, r3));
        r11.A0C(new X.DialogInterfaceOnCancelListenerC55249OfN(0, r38, r2, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0109, code lost:
    
        if (r3 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010b, code lost:
    
        r11.A0P(new X.DialogInterfaceOnClickListenerC35381Fiw(r32, r33, r35, r36, r38, r39, r40, r2, r41, false), r1, 2131957671);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011c, code lost:
    
        if (r40.A1Z() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011e, code lost:
    
        r9 = r40.A0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0120, code lost:
    
        if (r9 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0122, code lost:
    
        r8 = r9.A00;
        X.C14360o3.A07(r8);
        r6 = r8.A3k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0129, code lost:
    
        if (r6 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012b, code lost:
    
        r11.A0H(new X.DialogInterfaceOnClickListenerC55292OgD(r32, r34, r36, r37, r38, r9, r39, r8, r6), 2131972701);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0148, code lost:
    
        X.AbstractC166987dD.A1W(r11);
        X.AbstractC54123NwL.A00(r2, "view", "dialog", null, r3);
        X.AbstractC54126NwO.A00(r38).A02("delete_story_confirmation_dialog");
        X.AbstractC54126NwO.A00(r38).A03(com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r37.getModuleName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0168, code lost:
    
        if (r12 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016c, code lost:
    
        if (r5 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016e, code lost:
    
        r2 = X.AbstractC54126NwO.A00(r38);
        r1 = r5.getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0176, code lost:
    
        if (r1 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0178, code lost:
    
        r2.A03("media_id", r1);
        X.AbstractC54126NwO.A00(r38).A03("media_type", r5.BRp().name());
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01e6, code lost:
    
        throw X.AbstractC166987dD.A14("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01eb, code lost:
    
        throw X.AbstractC166987dD.A14("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0193, code lost:
    
        if (r40.A1Z() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0195, code lost:
    
        r9 = 2131957691;
        r1 = 2131957689;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a6, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r38, 36318913470143248L) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a8, code lost:
    
        r1 = 2131957690;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b3, code lost:
    
        if (r40.A1o() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b5, code lost:
    
        r9 = 2131957725;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b8, code lost:
    
        if (r3 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ba, code lost:
    
        r9 = 2131957615;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01bd, code lost:
    
        if (r29 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01bf, code lost:
    
        X.AbstractC31172DnG.A1D(r32, r10, 2131957612);
        r10.append("\n\n");
        r1 = 2131957613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d1, code lost:
    
        r10.append(r32.getText(2131957614));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01dd, code lost:
    
        r1 = 2131957683;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01cd, code lost:
    
        r9 = 2131957693;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x008e, code lost:
    
        r3 = false;
        r27 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0091, code lost:
    
        if (r5 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0062, code lost:
    
        if (r5 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(android.app.Activity r32, android.content.DialogInterface.OnDismissListener r33, androidx.fragment.app.Fragment r34, X.AbstractC10360h2 r35, X.InterfaceC11380iw r36, X.InterfaceC11380iw r37, com.instagram.common.session.UserSession r38, com.instagram.model.reels.Reel r39, X.C41181vS r40, X.InterfaceC145276gm r41) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55165OdT.A04(android.app.Activity, android.content.DialogInterface$OnDismissListener, androidx.fragment.app.Fragment, X.0h2, X.0iw, X.0iw, com.instagram.common.session.UserSession, com.instagram.model.reels.Reel, X.1vS, X.6gm):void");
    }

    public static final void A02(DialogInterface.OnDismissListener onDismissListener, AbstractC10360h2 abstractC10360h2) {
        if (onDismissListener != null) {
            onDismissListener.onDismiss(C55909Os0.A0X);
        }
        C11T.A03(new PNW(abstractC10360h2));
    }

    public static void A03(InterfaceC11380iw interfaceC11380iw, C41181vS c41181vS, InterfaceC145276gm interfaceC145276gm, C55909Os0 c55909Os0) {
        C55165OdT c55165OdT = C55909Os0.A0Y;
        Reel reel = c55909Os0.A0G.A0H;
        c55165OdT.A04(c55909Os0.A04, c55909Os0.A01, c55909Os0.A06, c55909Os0.A07, c55909Os0.A09, interfaceC11380iw, c55909Os0.A0B, reel, c41181vS, interfaceC145276gm);
    }
}
