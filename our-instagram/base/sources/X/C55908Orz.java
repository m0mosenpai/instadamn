package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.List;

/* renamed from: X.Orz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55908Orz implements InterfaceC11380iw {
    public static final DialogInterface A0P = new DialogInterfaceC55329Ogr();
    public static final String __redex_internal_original_name = "ReelSelfMenuOptionsOverflowHelper";
    public DialogInterface.OnDismissListener A00;
    public final Activity A01;
    public final Context A02;
    public final Fragment A03;
    public final AbstractC10360h2 A04;
    public final AbstractC018607g A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final C38321qM A08;
    public final InterfaceC60442pS A09;
    public final C41181vS A0A;
    public final C41551w4 A0B;
    public final ReelViewerConfig A0C;
    public final C3G2 A0D;
    public final ODG A0E;
    public final C145186gd A0F;
    public final String A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final InterfaceC16820sZ A0L;
    public final Resources A0M;
    public final InterfaceC69973Cg A0N;
    public final C54802OJw A0O;

    public C55908Orz(Activity activity, Context context, Resources resources, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC69973Cg interfaceC69973Cg, InterfaceC60442pS interfaceC60442pS, C41181vS c41181vS, C41551w4 c41551w4, ReelViewerConfig reelViewerConfig, C3G2 c3g2, C145186gd c145186gd, InterfaceC16820sZ interfaceC16820sZ) {
        EnumC53247Ngl[] enumC53247NglArr;
        List A1Q;
        C14360o3.A0B(c145186gd, 11);
        this.A01 = activity;
        this.A03 = fragment;
        this.A06 = interfaceC11380iw;
        this.A02 = context;
        this.A0M = resources;
        this.A0B = c41551w4;
        this.A0A = c41181vS;
        this.A09 = interfaceC60442pS;
        this.A0D = c3g2;
        this.A07 = userSession;
        this.A0F = c145186gd;
        this.A0N = interfaceC69973Cg;
        this.A0C = reelViewerConfig;
        this.A0L = interfaceC16820sZ;
        this.A04 = fragment.getParentFragmentManager();
        this.A05 = AbstractC018607g.A00(fragment);
        this.A0E = new ODG(fragment, userSession, c41181vS);
        this.A0O = new C54802OJw(fragment, interfaceC11380iw, userSession, c41181vS, c145186gd);
        C38321qM c38321qM = c41181vS.A0b;
        this.A08 = c38321qM;
        this.A0G = AbstractC25231BEo.A0t(c41181vS.A0i);
        if (c41181vS.A1f()) {
            A1Q = AbstractC166987dD.A1J(EnumC53247Ngl.A07);
        } else {
            if (reelViewerConfig.A0L) {
                enumC53247NglArr = new EnumC53247Ngl[]{EnumC53247Ngl.A07, EnumC53247Ngl.A05, EnumC53247Ngl.A0I, EnumC53247Ngl.A0H, EnumC53247Ngl.A06, EnumC53247Ngl.A0N, EnumC53247Ngl.A0K, EnumC53247Ngl.A04};
            } else if (c38321qM != null && c38321qM.A2O() == C05F.A0C && reelViewerConfig.A0B) {
                enumC53247NglArr = new EnumC53247Ngl[]{EnumC53247Ngl.A08, EnumC53247Ngl.A0G};
            } else {
                enumC53247NglArr = new EnumC53247Ngl[]{EnumC53247Ngl.A07, EnumC53247Ngl.A05, EnumC53247Ngl.A03, EnumC53247Ngl.A0I, EnumC53247Ngl.A0H, EnumC53247Ngl.A0J, EnumC53247Ngl.A0E, EnumC53247Ngl.A0M, EnumC53247Ngl.A0L, EnumC53247Ngl.A0F, EnumC53247Ngl.A0D, EnumC53247Ngl.A06, EnumC53247Ngl.A0N, EnumC53247Ngl.A0K, EnumC53247Ngl.A04, EnumC53247Ngl.A0Q};
            }
            A1Q = AbstractC16960so.A1Q(enumC53247NglArr);
        }
        this.A0H = A1Q;
        this.A0J = AbstractC16960so.A1Q(EnumC53247Ngl.A0P, EnumC53247Ngl.A0O);
        this.A0K = AbstractC16960so.A1Q(EnumC53247Ngl.A0R, EnumC53247Ngl.A0S);
        this.A0I = AbstractC16960so.A1Q(EnumC53247Ngl.A0A, EnumC53247Ngl.A0B, EnumC53247Ngl.A09, EnumC53247Ngl.A0C);
    }

    public static final void A02(C55908Orz c55908Orz) {
        DialogInterface.OnDismissListener onDismissListener = c55908Orz.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(A0P);
        }
        C11T.A03(new PNX(c55908Orz));
    }

    private final boolean A03() {
        C41551w4 c41551w4 = this.A0B;
        C41181vS c41181vS = this.A0A;
        if (AbstractC54250NyV.A00(this.A07, c41181vS, c41551w4) && c41181vS.A0B() != EnumC76383bi.A0A && !c41181vS.A1v(EnumC75383a5.A1B)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x025d, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36316701562114676L) == false) goto L128;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0044. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:215:0x0237. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0022 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A00(X.C55908Orz r17) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55908Orz.A00(X.Orz):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02fd, code lost:
    
        r2.A0P(new X.DialogInterfaceOnClickListenerC35358FiZ(2, r3, r24, r29, r10, false), r13, 2131957671);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0316, code lost:
    
        if (r9.A1Z() == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0318, code lost:
    
        r14 = r9.A0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x031a, code lost:
    
        if (r14 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x031c, code lost:
    
        r13 = r14.A00;
        X.C14360o3.A07(r13);
        r12 = r13.A3k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0323, code lost:
    
        if (r12 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0325, code lost:
    
        r2.A0H(new X.DialogInterfaceOnClickListenerC55291OgC(r21, r14, r29, r10, r13, r12, 1), 2131972701);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0340, code lost:
    
        X.AbstractC166987dD.A1W(r2);
        X.AbstractC54123NwL.A00(r3, "view", "dialog", null, r5);
        X.AbstractC54126NwO.A00(r7).A02("delete_story_confirmation_dialog");
        X.AbstractC54126NwO.A00(r7).A03(com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r21.getModuleName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0360, code lost:
    
        if (r15 == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0362, code lost:
    
        if (r6 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0364, code lost:
    
        r3 = X.AbstractC54126NwO.A00(r7);
        r2 = r6.getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x036c, code lost:
    
        if (r2 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x036e, code lost:
    
        r3.A03("media_id", r2);
        X.AbstractC54126NwO.A00(r7).A03("media_type", r6.BRp().name());
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0426, code lost:
    
        throw X.AbstractC166987dD.A14("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x042b, code lost:
    
        throw X.AbstractC166987dD.A14("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x038a, code lost:
    
        if (r9.A1Z() == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x038c, code lost:
    
        r12 = 2131957691;
        r14 = X.C18U.A06(X.C06090Tz.A05, r7, 36318913470143248L);
        r2 = r29.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x039f, code lost:
    
        if (r14 == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03a1, code lost:
    
        X.AbstractC31172DnG.A1D(r2, r13, 2131957690);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03a9, code lost:
    
        X.AbstractC31172DnG.A1D(r2, r13, 2131957689);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03b4, code lost:
    
        if (r9.A1o() == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03b6, code lost:
    
        if (r5 == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03b8, code lost:
    
        r12 = 2131957615;
        r2 = r29.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03bd, code lost:
    
        if (r23 == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03bf, code lost:
    
        X.AbstractC31172DnG.A1D(r2, r13, 2131957612);
        r13.append("\n\n");
        X.AbstractC31172DnG.A1D(r2, r13, 2131957613);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03d0, code lost:
    
        r13.append(r2.getText(2131957614));
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03dc, code lost:
    
        r12 = 2131957725;
        r2 = r29.A01;
        X.AbstractC31172DnG.A1D(r2, r13, 2131957683);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03e9, code lost:
    
        if (r5 == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03eb, code lost:
    
        r12 = 2131957615;
        r2 = r29.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03f0, code lost:
    
        if (r23 == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03f2, code lost:
    
        X.AbstractC31172DnG.A1D(r2, r13, 2131957612);
        r13.append("\n\n");
        X.AbstractC31172DnG.A1D(r2, r13, 2131957613);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0403, code lost:
    
        r13.append(r2.getText(2131957614));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x040f, code lost:
    
        r12 = 2131957693;
        r2 = r29.A01;
        X.AbstractC31172DnG.A1D(r2, r13, 2131957683);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0290, code lost:
    
        if (r6 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0264, code lost:
    
        if (r6.A56() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x028b, code lost:
    
        if (r22 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0292, code lost:
    
        r21 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0294, code lost:
    
        r3 = new X.C54696ODy(r21, r7, r20, r21, r22, r23);
        r13 = X.AbstractC166987dD.A1C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02a7, code lost:
    
        if (r9.A1f() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02a9, code lost:
    
        r12 = 2131957706;
        r2 = r29.A01;
        X.AbstractC31172DnG.A1D(r2, r13, 2131957684);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02b4, code lost:
    
        r2 = X.AbstractC31171DnF.A0H(r2);
        r1 = r13.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02bc, code lost:
    
        if (r1 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02be, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02c0, code lost:
    
        r2.A0r(android.text.Html.fromHtml(r1));
        r2.A0A(r12);
        r12 = 2131957640;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02cd, code lost:
    
        if (r5 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02cf, code lost:
    
        r12 = 2131957644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02d2, code lost:
    
        r1 = new X.DialogInterfaceOnClickListenerC35358FiZ(2, r3, r24, r29, r10, r5);
        r13 = X.EnumC193348hE.A06;
        r2.A0R(r1, r13, r12);
        r2.A0D(new X.DialogInterfaceOnClickListenerC55285Og0(3, r29, r3, r5));
        r2.A0C(new X.DialogInterfaceOnCancelListenerC55249OfN(1, r29, r3, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02fb, code lost:
    
        if (r5 == false) goto L102;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.content.DialogInterface.OnDismissListener r20, X.InterfaceC11380iw r21, X.InterfaceC57975PnL r22, X.InterfaceC57976PnM r23, X.InterfaceC145276gm r24, X.InterfaceC146916jT r25, X.InterfaceC57977PnN r26, X.InterfaceC57980PnQ r27, X.EnumC53247Ngl r28, X.C55908Orz r29, X.C145326gr r30, X.C145256gk r31, X.C145246gj r32) {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55908Orz.A01(android.content.DialogInterface$OnDismissListener, X.0iw, X.PnL, X.PnM, X.6gm, X.6jT, X.PnN, X.PnQ, X.Ngl, X.Orz, X.6gr, X.6gk, X.6gj):void");
    }
}
