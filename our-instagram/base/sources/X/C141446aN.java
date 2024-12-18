package X;

import android.text.TextPaint;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;

/* renamed from: X.6aN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141446aN {
    public static final C141446aN A00 = new Object();

    public static final boolean A01(TextView textView, String str) {
        C14360o3.A0B(textView, 1);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(textView.getTextSize());
        int measureText = (int) textPaint.measureText(str);
        CharSequence text = textView.getText();
        C14360o3.A07(text);
        if (text.length() != 0 && textView.getWidth() != 0 && textView.getWidth() <= measureText) {
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        Boolean CVo;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null && c41181vS.A0i != null && A02(userSession, c41181vS, c41551w4)) {
            Reel reel = c41551w4.A0H;
            if (!reel.A0b() && !reel.A0i() && c38321qM.A1x() == EnumC76383bi.A06 && (((CVo = C17060sy.A01.A01(userSession).A03.CVo()) == null || !CVo.booleanValue()) && !C9H3.A00(userSession, c38321qM.A36()) && !c41181vS.A1f() && !c41181vS.A1v(EnumC75383a5.A1B))) {
                if (c41181vS.A17()) {
                    C105814ps c105814ps = c41181vS.A0d;
                    c105814ps.getClass();
                    if (c105814ps.A00.A0m()) {
                        return false;
                    }
                }
                if (!c41181vS.A1O() && !C18U.A06(C06090Tz.A05, userSession, 36325686633444623L)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r0.A00.A0m() != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(android.content.Context r4, com.instagram.common.session.UserSession r5, X.C41181vS r6, com.instagram.model.reels.ReelViewerConfig r7, boolean r8) {
        /*
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318913470077711(0x8107dc00031b0f, double:3.0315653507787306E-306)
            boolean r3 = X.C18U.A06(r2, r5, r0)
            X.1qM r0 = r6.A0b
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L1c
            boolean r0 = r0.A5C()
            if (r0 != r2) goto L1c
            boolean r0 = X.C6PX.A00(r4)
            return r0
        L1c:
            com.instagram.user.model.User r0 = r6.A0i
            if (r0 == 0) goto L35
            if (r3 != 0) goto L36
            boolean r0 = r6.A17()
            if (r0 == 0) goto L36
            X.4ps r0 = r6.A0d
            r0.getClass()
            X.47Z r0 = r0.A00
            boolean r0 = r0.A0m()
            if (r0 == 0) goto L36
        L35:
            return r1
        L36:
            boolean r0 = r6.A1O()
            if (r0 != 0) goto L35
            if (r8 == 0) goto L43
            boolean r0 = r7.A0D
            if (r0 == 0) goto L43
            return r1
        L43:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C141446aN.A00(android.content.Context, com.instagram.common.session.UserSession, X.1vS, com.instagram.model.reels.ReelViewerConfig, boolean):boolean");
    }

    public static final boolean A02(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        if (C1AD.A06(C06090Tz.A05, 18311812109842166L)) {
            return C14360o3.A0K(C17060sy.A01.A01(userSession), c41181vS.A0i);
        }
        if (!c41551w4.A0H.A1a && !C14360o3.A0K(C17060sy.A01.A01(userSession), c41181vS.A0i)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(C41181vS c41181vS, C41551w4 c41551w4, ReelViewerConfig reelViewerConfig, C3G2 c3g2) {
        Boolean bool;
        C38321qM c38321qM;
        C38321qM c38321qM2;
        AttributedAREffect attributedAREffect = c41181vS.A05;
        if (c41181vS.A13() && attributedAREffect != null) {
            boolean z = false;
            if (attributedAREffect.A04 != null) {
                z = true;
            }
            return !z;
        }
        if (c41181vS.CY4() && (c38321qM2 = c41181vS.A0b) != null) {
            c38321qM2.A5h();
        }
        if (!reelViewerConfig.A0C && !c41181vS.A1f() && !c41181vS.A1v(EnumC75383a5.A1B) && c41181vS.A0g()) {
            if ((c41181vS.A1E() && (c38321qM = c41181vS.A0b) != null && c38321qM.A5h()) || c3g2 == C3G2.A08 || c3g2 == C3G2.A0O) {
                return false;
            }
            C37771pE c37771pE = c41551w4.A0H.A0N;
            if (c37771pE == null || (bool = c37771pE.A0r) == null || !bool.booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl.A01 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A06(android.content.res.Resources r4, com.instagram.common.session.UserSession r5, com.instagram.model.direct.DirectShareTarget r6, X.C41181vS r7, X.C3G2 r8, boolean r9) {
        /*
            r3 = this;
            if (r6 == 0) goto Lf
            X.1Zo r0 = X.C28531Zo.A04
            boolean r0 = r0.A0H(r5, r6)
            if (r0 == 0) goto Lf
            com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl r1 = com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl.A01
            r0 = 1
            if (r1 != 0) goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L23
            com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl r0 = com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl.A01
            if (r0 == 0) goto L68
            r0 = 2131961071(0x7f1324ef, float:1.9558829E38)
        L1b:
            java.lang.String r0 = r4.getString(r0)
            X.C14360o3.A07(r0)
            return r0
        L23:
            if (r7 == 0) goto L4a
            com.instagram.user.model.User r1 = r7.A0i
            if (r1 == 0) goto L4a
            java.lang.String r0 = r1.getUsername()
            int r0 = r0.length()
            if (r0 == 0) goto L4a
            X.3G2 r0 = X.C3G2.A0a
            if (r8 != r0) goto L4a
            java.lang.String r0 = r1.getUsername()
            r1 = 2131971754(0x7f134eaa, float:1.9580496E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r4.getString(r1, r0)
        L46:
            X.C14360o3.A0A(r0)
            return r0
        L4a:
            if (r9 == 0) goto L50
            r0 = 2131971755(0x7f134eab, float:1.9580498E38)
            goto L1b
        L50:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320691586343732(0x81097a00002334, double:3.032689838665262E-306)
            boolean r1 = X.C18U.A06(r2, r5, r0)
            r0 = 2131971751(0x7f134ea7, float:1.958049E38)
            if (r1 == 0) goto L63
            r0 = 2131971753(0x7f134ea9, float:1.9580494E38)
        L63:
            java.lang.String r0 = r4.getString(r0)
            goto L46
        L68:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C141446aN.A06(android.content.res.Resources, com.instagram.common.session.UserSession, com.instagram.model.direct.DirectShareTarget, X.1vS, X.3G2, boolean):java.lang.String");
    }

    public static final boolean A03(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        C38321qM c38321qM;
        if (!AbstractC84863qa.A0F(c41181vS) && !A02(userSession, c41181vS, c41551w4)) {
            if ((!c41181vS.A1j() || ((c38321qM = c41181vS.A0b) != null && c38321qM.A5r())) && !c41181vS.A1F() && c41551w4.A0H.A1B) {
                C38321qM c38321qM2 = c41181vS.A0b;
                if (c38321qM2 != null) {
                    Boolean Aki = c38321qM2.A0C.Aki();
                    if (Aki != null && Aki.booleanValue()) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
