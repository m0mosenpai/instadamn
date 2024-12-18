package X;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.BwPIconOverlayType;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Za, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC75103Za {
    public static final EnumSet A00 = EnumSet.of(AnonymousClass341.A0H, AnonymousClass341.A0O, AnonymousClass341.A0R, AnonymousClass341.A05, AnonymousClass341.A0J, AnonymousClass341.A03, AnonymousClass341.A0N, AnonymousClass341.A0A, AnonymousClass341.A0B, AnonymousClass341.A0V, AnonymousClass341.A0W, AnonymousClass341.A0Q, AnonymousClass341.A04, AnonymousClass341.A0E, AnonymousClass341.A0I, AnonymousClass341.A0S, AnonymousClass341.A02);

    public static final SpannableStringBuilder A01(Object obj, String str, String str2) {
        C14360o3.A0B(str, 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        A0C(spannableStringBuilder, obj, "{username}", str);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder A02(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
        A0C(spannableStringBuilder, new CharacterStyle(), "{username}", str);
        A0C(spannableStringBuilder, new CharacterStyle(), "{sponsorname}", str2);
        return spannableStringBuilder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r3 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r3 == 1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C5QE A03(com.instagram.common.session.UserSession r7, X.C38321qM r8, boolean r9) {
        /*
            r2 = 0
            X.C14360o3.A0B(r7, r2)
            r0 = 1
            X.C14360o3.A0B(r8, r0)
            X.1rF r0 = r8.A0C
            X.1sb r0 = r0.getInjected()
            r6 = 0
            if (r0 == 0) goto L6d
            X.1sB r0 = r0.Aty()
            if (r0 == 0) goto L6d
            java.lang.String r1 = r0.An3()
            if (r1 == 0) goto L6d
            X.1rF r0 = r8.A0C
            X.1sb r0 = r0.getInjected()
            if (r0 == 0) goto L35
            X.1sB r0 = r0.Aty()
            if (r0 == 0) goto L35
            java.lang.Boolean r0 = r0.Bvo()
            if (r0 == 0) goto L35
            boolean r6 = r0.booleanValue()
        L35:
            java.lang.String r5 = A0B(r1, r6)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36608707798243096(0x820f6d00001718, double:3.214832450818617E-306)
            long r3 = X.C18U.A01(r2, r7, r0)
            if (r6 == 0) goto L5e
            if (r9 != 0) goto L51
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 2131954236(0x7f130a3c, float:1.9544966E38)
            if (r0 != 0) goto L54
        L51:
            r1 = 2131954244(0x7f130a44, float:1.9544982E38)
        L54:
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            X.BHS r2 = new X.BHS
            r2.<init>(r0, r1)
            return r2
        L5e:
            if (r9 != 0) goto L69
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 2131955204(0x7f130e04, float:1.9546929E38)
            if (r0 != 0) goto L54
        L69:
            r1 = 2131955205(0x7f130e05, float:1.954693E38)
            goto L54
        L6d:
            X.1rF r0 = r8.A0C
            java.lang.String r0 = r0.BNT()
            if (r0 == 0) goto L7b
            X.BQO r2 = new X.BQO
            r2.<init>(r0)
            return r2
        L7b:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0 = 2131957627(0x7f13177b, float:1.9551843E38)
            X.BHS r2 = new X.BHS
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC75103Za.A03(com.instagram.common.session.UserSession, X.1qM, boolean):X.5QE");
    }

    public static final String A05(Context context, UserSession userSession, C38321qM c38321qM, InterfaceC38371qR interfaceC38371qR, int i) {
        OnFeedMessagesIntf onFeedMessagesIntf;
        InterfaceC38831rF interfaceC38831rF;
        ImmutableList A01;
        C38321qM c38321qM2;
        String Baa;
        OnFeedMessagesIntf BUJ;
        String BDG;
        IGCTMessagingAdsInfoDictIntf A002;
        OnFeedMessagesIntf onFeedMessagesIntf2;
        int i2;
        C14360o3.A0B(c38321qM, 2);
        C14360o3.A0B(interfaceC38371qR, 4);
        if (C87153uY.A04(userSession, c38321qM)) {
            IGCTMessagingAdsInfoDictIntf A1I = c38321qM.A1I();
            if (A1I != null) {
                onFeedMessagesIntf2 = A1I.BUJ();
            } else {
                onFeedMessagesIntf2 = null;
            }
            int A003 = AbstractC76673cF.A00(onFeedMessagesIntf2);
            if (A003 == 1) {
                i2 = 2131957325;
            } else {
                if (A003 != 2) {
                    return null;
                }
                i2 = 2131957328;
            }
            return context.getString(i2);
        }
        IGCTMessagingAdsInfoDictIntf A004 = AbstractC41071vF.A00(userSession, c38321qM);
        if (A004 != null) {
            onFeedMessagesIntf = A004.BUJ();
        } else {
            onFeedMessagesIntf = null;
        }
        if ((AbstractC76673cF.A00(onFeedMessagesIntf) == 2 && !c38321qM.A5v() && (A002 = AbstractC41071vF.A00(userSession, c38321qM)) != null && A002.BrS() != null && ((int) C18U.A01(C06090Tz.A05, userSession, 36605581062116651L)) >= 1) || C87153uY.A06(userSession, c38321qM) || (C87153uY.A09(userSession, c38321qM) && C87153uY.A05(userSession, c38321qM) && ((int) C18U.A01(C06090Tz.A05, userSession, 36605581062051114L)) == 3)) {
            IGCTMessagingAdsInfoDictIntf A005 = AbstractC41071vF.A00(userSession, c38321qM);
            if (A005 != null) {
                BDG = A005.BrS();
            } else {
                return "";
            }
        } else if (C87153uY.A07(userSession, c38321qM)) {
            IGCTMessagingAdsInfoDictIntf A006 = AbstractC41071vF.A00(userSession, c38321qM);
            if (A006 == null || (BUJ = A006.BUJ()) == null) {
                return "";
            }
            BDG = BUJ.BDG();
        } else {
            if (interfaceC38371qR instanceof C40971v4) {
                C40971v4 c40971v4 = (C40971v4) interfaceC38371qR;
                if (!c40971v4.A05()) {
                    interfaceC38371qR = null;
                }
                C40971v4 c40971v42 = (C40971v4) interfaceC38371qR;
                if (c40971v42 != null && (A01 = c40971v42.A01()) != null && (c38321qM2 = (C38321qM) AbstractC001800i.A0O(A01, i)) != null && (Baa = c38321qM2.A0C.Baa()) != null) {
                    return Baa;
                }
                return c40971v4.A0T;
            }
            C38321qM BQN = interfaceC38371qR.BQN();
            if (BQN.A5M()) {
                C38321qM A1e = BQN.A1e(i);
                if (A1e == null) {
                    return null;
                }
                interfaceC38831rF = A1e.A0C;
            } else {
                if (A0J(BQN)) {
                    return A08(context, BQN);
                }
                interfaceC38831rF = BQN.A0C;
            }
            return interfaceC38831rF.Baa();
        }
        if (BDG != null) {
            return BDG;
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r3 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r3 == 1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A06(android.content.Context r7, com.instagram.common.session.UserSession r8, X.C38321qM r9, boolean r10) {
        /*
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            r0 = 2
            X.C14360o3.A0B(r9, r0)
            X.1rF r0 = r9.A0C
            X.1sb r0 = r0.getInjected()
            if (r0 == 0) goto L70
            X.1sB r0 = r0.Aty()
            if (r0 == 0) goto L70
            java.lang.String r1 = r0.An3()
            if (r1 == 0) goto L70
            X.1rF r0 = r9.A0C
            X.1sb r0 = r0.getInjected()
            if (r0 == 0) goto L6e
            X.1sB r0 = r0.Aty()
            if (r0 == 0) goto L6e
            java.lang.Boolean r0 = r0.Bvo()
            if (r0 == 0) goto L6e
            boolean r6 = r0.booleanValue()
        L34:
            java.lang.String r5 = A0B(r1, r6)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36608707798243096(0x820f6d00001718, double:3.214832450818617E-306)
            long r3 = X.C18U.A01(r2, r8, r0)
            if (r6 == 0) goto L5f
            if (r10 != 0) goto L50
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 2131954236(0x7f130a3c, float:1.9544966E38)
            if (r0 != 0) goto L53
        L50:
            r1 = 2131954244(0x7f130a44, float:1.9544982E38)
        L53:
            java.lang.Object[] r0 = new java.lang.Object[]{r5}
            java.lang.String r0 = r7.getString(r1, r0)
        L5b:
            X.C14360o3.A07(r0)
        L5e:
            return r0
        L5f:
            if (r10 != 0) goto L6a
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 2131955204(0x7f130e04, float:1.9546929E38)
            if (r0 != 0) goto L53
        L6a:
            r1 = 2131955205(0x7f130e05, float:1.954693E38)
            goto L53
        L6e:
            r6 = 0
            goto L34
        L70:
            X.1rF r0 = r9.A0C
            java.lang.String r0 = r0.BNT()
            if (r0 != 0) goto L5e
            r0 = 2131957627(0x7f13177b, float:1.9551843E38)
            java.lang.String r0 = r7.getString(r0)
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC75103Za.A06(android.content.Context, com.instagram.common.session.UserSession, X.1qM, boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A07(android.content.Context r3, com.instagram.common.session.UserSession r4, X.InterfaceC38371qR r5, int r6) {
        /*
            r2 = 0
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            X.1qM r1 = r5.BQN()
            boolean r0 = X.C5LX.A02(r4, r1)
            if (r0 == 0) goto L26
            java.lang.String r1 = X.C5LX.A01(r4, r1)
        L13:
            if (r1 == 0) goto L1b
        L15:
            int r0 = r1.length()
            if (r0 != 0) goto L25
        L1b:
            r0 = 2131957627(0x7f13177b, float:1.9551843E38)
            java.lang.String r1 = r3.getString(r0)
            X.C14360o3.A0A(r1)
        L25:
            return r1
        L26:
            boolean r0 = X.C87153uY.A0B(r1)
            if (r0 == 0) goto L37
            r0 = 2131962444(0x7f132a4c, float:1.9561613E38)
            java.lang.String r1 = r3.getString(r0)
            X.C14360o3.A07(r1)
            return r1
        L37:
            boolean r0 = X.C87153uY.A04(r4, r1)
            if (r0 == 0) goto L4f
            X.BHS r0 = X.C87153uY.A00(r4, r1, r2)
            if (r0 == 0) goto L1b
            java.lang.CharSequence r1 = X.BHX.A00(r3, r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.C14360o3.A0C(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            goto L13
        L4f:
            boolean r0 = r5 instanceof X.C40971v4
            if (r0 == 0) goto L74
            X.1v4 r5 = (X.C40971v4) r5
            boolean r0 = r5.A05()
            if (r0 == 0) goto L71
            com.google.common.collect.ImmutableList r0 = r5.A01()
            if (r0 == 0) goto L71
            java.lang.Object r0 = X.AbstractC001800i.A0O(r0, r6)
            X.1qM r0 = (X.C38321qM) r0
            if (r0 == 0) goto L71
            X.1rF r0 = r0.A0C
            java.lang.String r1 = r0.BNT()
            if (r1 != 0) goto L15
        L71:
            java.lang.String r1 = r5.A0d
            goto L13
        L74:
            boolean r0 = r1.A5M()
            if (r0 == 0) goto L87
            X.1qM r0 = r1.A1e(r6)
            if (r0 == 0) goto L1b
            X.1rF r0 = r0.A0C
        L82:
            java.lang.String r1 = r0.BNT()
            goto L13
        L87:
            X.1rF r0 = r1.A0C
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC75103Za.A07(android.content.Context, com.instagram.common.session.UserSession, X.1qR, int):java.lang.String");
    }

    public static final String A08(Context context, C38321qM c38321qM) {
        int i;
        InterfaceC39301sB Aty;
        Integer BYF;
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected != null && (Aty = injected.Aty()) != null && (BYF = Aty.BYF()) != null) {
            i = BYF.intValue();
        } else {
            i = 0;
        }
        String A01 = AbstractC43744JWe.A01(context.getResources(), Integer.valueOf(i), false);
        C14360o3.A07(A01);
        String quantityString = context.getResources().getQuantityString(R.plurals.broadcast_channel_number_of_members, i, A01);
        C14360o3.A07(quantityString);
        return quantityString;
    }

    public static final void A0C(SpannableStringBuilder spannableStringBuilder, Object obj, String str, String str2) {
        int A08 = AbstractC001900j.A08(spannableStringBuilder, str, 0, false);
        if (A08 != -1) {
            spannableStringBuilder.replace(A08, str.length() + A08, (CharSequence) str2);
            if (obj != null) {
                spannableStringBuilder.setSpan(obj, A08, str2.length() + A08, 33);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r2 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        r14.add("INSTAGRAM_MEDIA_WAS_HIDDEN");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        r7 = new X.C5SE(r11, r12);
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r12.A5M() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        r7.A00 = r0;
        X.C32U.A0O(r11, r7, r12, r13, java.lang.Integer.valueOf(r12.A0n()), r11, r12.A2w(), null, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (A0K(r12) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r1 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r14.add("already_installed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r11, 36329573578785180L) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        r14.add("low_value");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        r11 = "already_installed";
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (A0E(r11, r12) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r1 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        r14.add("app_not_installed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r11, 36329573578719643L) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        r14.add("low_value");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        r11 = "app_not_installed";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0019, code lost:
    
        if (r14 == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (X.AbstractC61652rS.A04(r11) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (X.AbstractC61652rS.A06(r11) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        r14 = new java.util.ArrayList();
        r0 = X.C3YS.A00(r11).A05(r12);
        r11 = "INSTAGRAM_MEDIA_WAS_HIDDEN";
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r0 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0D(com.instagram.common.session.UserSession r11, X.C38321qM r12, X.InterfaceC60442pS r13, boolean r14) {
        /*
            r0 = 0
            r6 = r11
            X.C14360o3.A0B(r11, r0)
            r0 = 1
            r8 = r12
            X.C14360o3.A0B(r12, r0)
            r0 = 2
            r9 = r13
            X.C14360o3.A0B(r13, r0)
            if (r14 != 0) goto L18
            boolean r0 = X.AbstractC61652rS.A04(r11)
            r2 = 0
            if (r0 == 0) goto L1b
        L18:
            r2 = 1
            if (r14 != 0) goto L22
        L1b:
            boolean r0 = X.AbstractC61652rS.A06(r11)
            r1 = 0
            if (r0 == 0) goto L23
        L22:
            r1 = 1
        L23:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            X.3YT r0 = X.C3YS.A00(r11)
            boolean r0 = r0.A05(r12)
            java.lang.String r5 = "app_not_installed"
            java.lang.String r4 = "already_installed"
            java.lang.String r11 = "INSTAGRAM_MEDIA_WAS_HIDDEN"
            if (r0 == 0) goto L5d
            if (r2 != 0) goto L5d
            r14.add(r11)
        L3d:
            r13 = 0
            X.5SE r7 = new X.5SE
            r7.<init>(r6, r12)
            boolean r1 = r12.A5M()
            r0 = -1
            if (r1 == 0) goto L4b
            r0 = 0
        L4b:
            r7.A00 = r0
            int r0 = r12.A0n()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.String r12 = r12.A2w()
            X.C32U.A0O(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L5c:
            return
        L5d:
            boolean r0 = A0K(r12)
            java.lang.String r3 = "low_value"
            if (r0 == 0) goto L7c
            if (r1 != 0) goto L7c
            r14.add(r4)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36329573578785180(0x81118e0001419c, double:3.0383068464501463E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 == 0) goto L7a
            r14.add(r3)
        L7a:
            r11 = r4
            goto L3d
        L7c:
            boolean r0 = A0E(r6, r12)
            if (r0 == 0) goto L5c
            if (r1 != 0) goto L5c
            r14.add(r5)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36329573578719643(0x81118e0000419b, double:3.0383068464087005E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 == 0) goto L97
            r14.add(r3)
        L97:
            r11 = r5
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC75103Za.A0D(com.instagram.common.session.UserSession, X.1qM, X.2pS, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0F(com.instagram.common.session.UserSession r5, X.C38321qM r6, X.C75113Zb r7) {
        /*
            r0 = 1
            X.C14360o3.A0B(r7, r0)
            int r0 = r7.A03
            X.1qM r4 = r6.A1e(r0)
            if (r4 != 0) goto Ld
            r4 = r6
        Ld:
            boolean r0 = r6.CdW()
            if (r0 != 0) goto L20
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36327975851146261(0x81101a00043c15, double:3.037296437057761E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L38
        L20:
            boolean r0 = r6.A5M()
            if (r0 == 0) goto L3a
            X.1rF r0 = r6.A0C
            java.util.List r1 = r0.AmB()
            if (r1 == 0) goto L38
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L72
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L72
        L38:
            r1 = 0
        L39:
            return r1
        L3a:
            boolean r0 = r6.A5Q()
            if (r0 == 0) goto L5b
            X.1tc r1 = X.EnumC40111tc.A0Q
            X.1tc r0 = X.EnumC40111tc.A0U
            X.1tc[] r0 = new X.EnumC40111tc[]{r1, r0}
            java.util.List r1 = X.AbstractC16960so.A1Q(r0)
            X.1qM r0 = r6.A1d()
            X.1tc r0 = r0.BRp()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L38
            goto L92
        L5b:
            X.1tc r1 = r6.BRp()
            X.1tc r0 = X.EnumC40111tc.A0Q
            if (r1 == r0) goto L6b
            X.1tc r1 = r6.BRp()
            X.1tc r0 = X.EnumC40111tc.A0V
            if (r1 != r0) goto L38
        L6b:
            boolean r0 = r6.A5p()
            if (r0 != 0) goto L38
            goto L92
        L72:
            java.util.Iterator r3 = r1.iterator()
        L76:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r2 = r3.next()
            X.1qM r2 = (X.C38321qM) r2
            X.1tc r1 = r2.BRp()
            X.1tc r0 = X.EnumC40111tc.A0Q
            if (r1 == r0) goto L92
            X.1tc r1 = r2.BRp()
            X.1tc r0 = X.EnumC40111tc.A0U
            if (r1 != r0) goto L76
        L92:
            int r0 = r7.A03
            boolean r0 = A0Q(r6, r0)
            if (r0 == 0) goto L38
            java.util.List r0 = r4.A3Y()
            java.lang.Object r1 = X.AbstractC001800i.A0I(r0)
            com.instagram.model.androidlink.AndroidLink r1 = (com.instagram.model.androidlink.AndroidLink) r1
            java.lang.String r0 = r1.CHN()
            if (r0 == 0) goto Lda
            int r0 = r0.length()
            if (r0 == 0) goto Lda
            X.41v r1 = X.AbstractC114965Hm.A01(r1)
            X.41v r0 = X.EnumC906041v.AD_DESTINATION_WEB
            if (r1 != r0) goto Lda
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342170985064709139(0x2081101a00023c13, double:4.072348725325805E-152)
        Lbf:
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L38
            boolean r0 = r6.A5m()
            if (r0 != 0) goto L38
            boolean r0 = r6.A67()
            if (r0 != 0) goto L38
            boolean r0 = r6.A53()
            r1 = 1
            if (r0 == 0) goto L39
            goto L38
        Lda:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342170985064774676(0x2081101a00033c14, double:4.072348725381375E-152)
            goto Lbf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC75103Za.A0F(com.instagram.common.session.UserSession, X.1qM, X.3Zb):boolean");
    }

    public static final boolean A0G(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        JM2 AjO;
        List BEq;
        C14360o3.A0B(userSession, 2);
        if (A0N(c38321qM, c75113Zb) && c38321qM != null && (AjO = c38321qM.A0C.AjO()) != null && (BEq = AjO.BEq()) != null && BEq.contains(BwPIconOverlayType.A04) && C18U.A06(C06090Tz.A05, userSession, 2342169503300859813L)) {
            return true;
        }
        return false;
    }

    public static final boolean A0H(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        return ((C5LZ) userSession.A01(C5LZ.class, new J7S(userSession, 28))).A00(str);
    }

    public static final boolean A0I(C84923qg c84923qg, int i) {
        C38321qM c38321qM;
        C38321qM A1e;
        C14360o3.A0B(c84923qg, 0);
        if (c84923qg.A02() && (c38321qM = c84923qg.A07) != null && c38321qM.A5M() && (A1e = c38321qM.A1e(0)) != null && A1e.A5a() && !A0L(c84923qg.A07, i)) {
            return true;
        }
        return false;
    }

    public static final boolean A0J(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        if (!(!c38321qM.A3Y().isEmpty()) || ((AndroidLink) c38321qM.A3Y().get(0)).BNX() == null) {
            return false;
        }
        Integer BNX = ((AndroidLink) c38321qM.A3Y().get(0)).BNX();
        int i = EnumC906041v.AD_DESTINATION_JOIN_CHANNEL.A00;
        if (BNX != null && BNX.intValue() == i) {
            return true;
        }
        return false;
    }

    public static final boolean A0K(C38321qM c38321qM) {
        Object obj;
        if (c38321qM.A5M() && (c38321qM = c38321qM.A1e(0)) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        List<AndroidLink> A3Y = c38321qM.A3Y();
        if (!(A3Y instanceof Collection) || !A3Y.isEmpty()) {
            for (AndroidLink androidLink : A3Y) {
                String CIt = androidLink.CIt();
                if (AbstractC114965Hm.A01(androidLink) == EnumC906041v.AD_DESTINATION_APP_STORE) {
                    Integer AcK = androidLink.AcK();
                    if (AcK == null || (obj = EnumC115235Iu.A01.get(AcK)) == null) {
                        obj = EnumC115235Iu.A05;
                    }
                    if (obj == EnumC115235Iu.A04 && CIt != null && AbstractC13180m4.A03(CIt)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean A0N(C38321qM c38321qM, C75113Zb c75113Zb) {
        List AmB;
        if (c38321qM == null || c75113Zb == null) {
            return false;
        }
        return ((c38321qM.A5M() && c38321qM.A0C.AmB() != null && ((AmB = c38321qM.A0C.AmB()) == null || (c38321qM = (C38321qM) AmB.get(c75113Zb.A02)) == null)) || c38321qM.A0C.AjO() == null) ? false : true;
    }

    public static final boolean A0Q(InterfaceC38371qR interfaceC38371qR, int i) {
        C38321qM BQN;
        if (interfaceC38371qR == null) {
            return false;
        }
        if (interfaceC38371qR instanceof C40971v4) {
            C40971v4 c40971v4 = (C40971v4) interfaceC38371qR;
            if (c40971v4.A05()) {
                ImmutableList A01 = c40971v4.A01();
                if (A01 == null) {
                    return false;
                }
                BQN = (C38321qM) AbstractC001800i.A0O(A01, i);
            } else {
                List A04 = c40971v4.A04();
                return !(A04 == null || A04.isEmpty());
            }
        } else {
            boolean A5M = interfaceC38371qR.BQN().A5M();
            BQN = interfaceC38371qR.BQN();
            if (A5M) {
                BQN = BQN.A1e(i);
            }
        }
        return BQN != null && (BQN.A3Y().isEmpty() ^ true);
    }

    public static final boolean A0R(InterfaceC38371qR interfaceC38371qR, int i) {
        C38321qM BQN;
        return (interfaceC38371qR == null || (BQN = interfaceC38371qR.BQN()) == null || BQN.A6B() || !A0Q(interfaceC38371qR, i)) ? false : true;
    }

    public static final boolean A0U(AndroidLink androidLink) {
        String Aw8;
        if (androidLink == null || (Aw8 = androidLink.Aw8()) == null) {
            return false;
        }
        return AbstractC002300n.A0h(Aw8, "https://api.whatsapp.com/send", false) || AbstractC002300n.A0h(Aw8, "whatsapp://send", false);
    }

    public static final int A00(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f) + (Color.alpha(i2) * f2)), (int) ((Color.red(i) * f) + (Color.red(i2) * f2)), (int) ((Color.green(i) * f) + (Color.green(i2) * f2)), (int) ((Color.blue(i) * f) + (Color.blue(i2) * f2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer A04(X.InterfaceC38371qR r4, int r5) {
        /*
            boolean r0 = r4 instanceof X.C40971v4
            r3 = 0
            if (r0 == 0) goto L38
            r2 = r4
            X.1v4 r2 = (X.C40971v4) r2
            boolean r0 = r2.A05()
            if (r0 != 0) goto Lf
            r4 = r3
        Lf:
            X.1v4 r4 = (X.C40971v4) r4
            if (r4 == 0) goto L54
            com.google.common.collect.ImmutableList r0 = r4.A01()
            if (r0 == 0) goto L54
            java.lang.Object r0 = X.AbstractC001800i.A0O(r0, r5)
            X.1qM r0 = (X.C38321qM) r0
            if (r0 == 0) goto L54
            X.1rF r0 = r0.A0C
            java.lang.String r1 = r0.getDominantColor()
            if (r1 == 0) goto L54
        L29:
            int r0 = r1.length()
            if (r0 == 0) goto L37
            int r0 = android.graphics.Color.parseColor(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L37:
            return r3
        L38:
            X.1qM r1 = r4.BQN()
            if (r1 == 0) goto L37
            boolean r0 = r1.A5M()
            if (r0 == 0) goto L51
            X.1qM r0 = r1.A1e(r5)
            if (r0 == 0) goto L51
            X.1rF r0 = r0.A0C
        L4c:
            java.lang.String r1 = r0.getDominantColor()
            goto L56
        L51:
            X.1rF r0 = r1.A0C
            goto L4c
        L54:
            java.lang.String r1 = r2.A0b
        L56:
            if (r1 == 0) goto L37
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC75103Za.A04(X.1qR, int):java.lang.Integer");
    }

    public static final String A09(C38321qM c38321qM, C75113Zb c75113Zb) {
        EnumC906041v A01;
        C38321qM A1e = c38321qM.A1e(c75113Zb.A03);
        if (A1e == null) {
            A1e = c38321qM;
        }
        AndroidLink androidLink = (AndroidLink) AbstractC001800i.A0J(A1e.A3Y());
        if (androidLink != null && (A01 = AbstractC114965Hm.A01(androidLink)) != null) {
            return A01.name();
        }
        return null;
    }

    public static final String A0A(C75113Zb c75113Zb) {
        int i = c75113Zb.A0E;
        EnumC65592xv enumC65592xv = EnumC65592xv.A06;
        if (i != enumC65592xv.ordinal()) {
            enumC65592xv = EnumC65592xv.A07;
            if (i != enumC65592xv.ordinal()) {
                enumC65592xv = EnumC65592xv.A0F;
                if (i != enumC65592xv.ordinal()) {
                    enumC65592xv = EnumC65592xv.A0Y;
                    if (i != enumC65592xv.ordinal()) {
                        enumC65592xv = EnumC65592xv.A1Q;
                        if (i != enumC65592xv.ordinal()) {
                            if (i == EnumC65592xv.A1T.ordinal()) {
                                return "SHOPPING_CTA";
                            }
                            enumC65592xv = EnumC65592xv.A10;
                            if (i != enumC65592xv.ordinal()) {
                                enumC65592xv = EnumC65592xv.A11;
                                if (i != enumC65592xv.ordinal()) {
                                    enumC65592xv = EnumC65592xv.A1b;
                                    if (i != enumC65592xv.ordinal()) {
                                        enumC65592xv = EnumC65592xv.A1c;
                                        if (i != enumC65592xv.ordinal()) {
                                            enumC65592xv = EnumC65592xv.A1G;
                                            if (i != enumC65592xv.ordinal()) {
                                                enumC65592xv = EnumC65592xv.A1H;
                                                if (i != enumC65592xv.ordinal()) {
                                                    enumC65592xv = EnumC65592xv.A0W;
                                                    if (i != enumC65592xv.ordinal()) {
                                                        enumC65592xv = EnumC65592xv.A08;
                                                        if (i != enumC65592xv.ordinal()) {
                                                            enumC65592xv = EnumC65592xv.A0D;
                                                            if (i != enumC65592xv.ordinal()) {
                                                                enumC65592xv = EnumC65592xv.A0M;
                                                                if (i != enumC65592xv.ordinal()) {
                                                                    enumC65592xv = EnumC65592xv.A0L;
                                                                    if (i != enumC65592xv.ordinal()) {
                                                                        return null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return enumC65592xv.A00;
    }

    public static final boolean A0E(UserSession userSession, C38321qM c38321qM) {
        InterfaceC39541sb injected;
        List A3Y;
        if (C18U.A06(C06090Tz.A05, userSession, 36330630140675008L) && (injected = c38321qM.A0C.getInjected()) != null && C14360o3.A0K(injected.CPy(), true)) {
            if (c38321qM.A5M()) {
                C38321qM A1e = c38321qM.A1e(0);
                if (A1e != null) {
                    A3Y = A1e.A3Y();
                }
            } else {
                A3Y = c38321qM.A3Y();
            }
            if (!(A3Y instanceof Collection) || !A3Y.isEmpty()) {
                Iterator it = A3Y.iterator();
                while (it.hasNext()) {
                    String CIt = ((AndroidLink) it.next()).CIt();
                    if (CIt == null) {
                        CIt = "";
                    }
                    if (!AbstractC13180m4.A03(CIt)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean A0L(C38321qM c38321qM, int i) {
        C38321qM A1e;
        if (c38321qM == null) {
            return false;
        }
        if (c38321qM.A5M() && (A1e = c38321qM.A1e(i)) != null) {
            return A1e.A4s();
        }
        return c38321qM.A4s();
    }

    public static final boolean A0P(InterfaceC38371qR interfaceC38371qR) {
        if (interfaceC38371qR != null) {
            if ((interfaceC38371qR instanceof C40971v4) || interfaceC38371qR.BQN().CdW()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A0S(C75113Zb c75113Zb) {
        Integer valueOf = Integer.valueOf(c75113Zb.A0E);
        int ordinal = EnumC65592xv.A07.ordinal();
        if (valueOf == null || valueOf.intValue() != ordinal) {
            int ordinal2 = EnumC65592xv.A0F.ordinal();
            if (valueOf == null || valueOf.intValue() != ordinal2) {
                int ordinal3 = EnumC65592xv.A0Y.ordinal();
                if (valueOf == null || valueOf.intValue() != ordinal3) {
                    int ordinal4 = EnumC65592xv.A1Q.ordinal();
                    if (valueOf == null || valueOf.intValue() != ordinal4) {
                        int ordinal5 = EnumC65592xv.A1T.ordinal();
                        if (valueOf == null || valueOf.intValue() != ordinal5) {
                            int ordinal6 = EnumC65592xv.A10.ordinal();
                            if (valueOf == null || valueOf.intValue() != ordinal6) {
                                int ordinal7 = EnumC65592xv.A11.ordinal();
                                if (valueOf == null || valueOf.intValue() != ordinal7) {
                                    int ordinal8 = EnumC65592xv.A1b.ordinal();
                                    if (valueOf == null || valueOf.intValue() != ordinal8) {
                                        int ordinal9 = EnumC65592xv.A1c.ordinal();
                                        if (valueOf == null || valueOf.intValue() != ordinal9) {
                                            int ordinal10 = EnumC65592xv.A1G.ordinal();
                                            if (valueOf == null || valueOf.intValue() != ordinal10) {
                                                int ordinal11 = EnumC65592xv.A1H.ordinal();
                                                if (valueOf == null || valueOf.intValue() != ordinal11) {
                                                    int ordinal12 = EnumC65592xv.A0W.ordinal();
                                                    if (valueOf == null || valueOf.intValue() != ordinal12) {
                                                        int ordinal13 = EnumC65592xv.A08.ordinal();
                                                        if (valueOf == null || valueOf.intValue() != ordinal13) {
                                                            int ordinal14 = EnumC65592xv.A0D.ordinal();
                                                            if (valueOf == null || valueOf.intValue() != ordinal14) {
                                                                int ordinal15 = EnumC65592xv.A0M.ordinal();
                                                                if (valueOf == null || valueOf.intValue() != ordinal15) {
                                                                    int ordinal16 = EnumC65592xv.A0L.ordinal();
                                                                    if (valueOf != null && valueOf.intValue() == ordinal16) {
                                                                        return true;
                                                                    }
                                                                    return false;
                                                                }
                                                                return true;
                                                            }
                                                            return true;
                                                        }
                                                        return true;
                                                    }
                                                    return true;
                                                }
                                                return true;
                                            }
                                            return true;
                                        }
                                        return true;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static final boolean A0T(AndroidLink androidLink) {
        EnumC906041v enumC906041v;
        if (androidLink != null) {
            enumC906041v = AbstractC114965Hm.A01(androidLink);
        } else {
            enumC906041v = null;
        }
        if (enumC906041v != EnumC906041v.AD_DESTINATION_LEAD_AD) {
            return false;
        }
        return true;
    }

    public static final String A0B(String str, boolean z) {
        StringBuilder sb;
        String substring;
        int length = str.length();
        if ((length < 25 && z) || length < 20) {
            return str;
        }
        if (z) {
            sb = new StringBuilder();
            substring = str.substring(0, 25);
        } else {
            sb = new StringBuilder();
            substring = str.substring(0, 20);
        }
        C14360o3.A07(substring);
        sb.append(substring);
        sb.append((char) 8230);
        return sb.toString();
    }

    public static final boolean A0M(C38321qM c38321qM, C38321qM c38321qM2) {
        if (!c38321qM.A5M() && !c38321qM.A5Q()) {
            if ((c38321qM.BRp() != EnumC40111tc.A0Q && c38321qM.BRp() != EnumC40111tc.A0V) || c38321qM.A5p()) {
                return false;
            }
        } else if (c38321qM2.BRp() != EnumC40111tc.A0Q && c38321qM2.BRp() != EnumC40111tc.A0U) {
            return false;
        }
        return true;
    }

    public static final boolean A0O(C38321qM c38321qM, AnonymousClass341 anonymousClass341) {
        if (c38321qM.CdW() && A00.contains(anonymousClass341)) {
            return true;
        }
        return false;
    }
}
