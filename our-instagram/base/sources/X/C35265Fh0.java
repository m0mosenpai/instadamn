package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.TIFUAppDestinationEnum;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Fh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35265Fh0 {
    public static final C35265Fh0 A00 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(androidx.fragment.app.FragmentActivity r20, com.instagram.common.session.UserSession r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35265Fh0.A03(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r10.equals("story_attribution") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r11 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7, 36326451137755015L) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r0 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        r1 = r5.buildUpon();
        r0 = "non_blocking";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        r1 = r1.appendQueryParameter("ig_reshare_upsell", r0).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        X.C14360o3.A07(r1);
        X.AbstractC41776Ies.A09(r6, r7, X.C2Fb.A1T, r1, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        if (r4 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7, 36326451138017163L) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
    
        r1 = r5.buildUpon();
        r0 = "blocking";
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        if (r11 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7, 36326451137951626L) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
    
        r1 = r5.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7, 36326451137820552L) != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(androidx.fragment.app.FragmentActivity r6, com.instagram.common.session.UserSession r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            r1 = 0
            X.AbstractC167007dF.A1D(r7, r1, r8)
            if (r9 == 0) goto L1e
            int r0 = r9.length()
            if (r0 == 0) goto L1e
            r3 = 0
            java.lang.String r0 = "com.instagram.barcelona"
            boolean r1 = X.AbstractC115215Is.A01(r6, r7, r9, r0, r1)
            boolean r0 = X.AbstractC14490oL.A0A(r6)
            if (r0 == 0) goto L1f
            if (r1 == 0) goto L1f
            X.AbstractC41776Ies.A03(r6, r9)
        L1e:
            return
        L1f:
            if (r11 == 0) goto L32
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326451137689478(0x810eb700033786, double:3.036332202128163E-306)
        L28:
            boolean r0 = X.AbstractC31177DnL.A1U(r2, r7, r0)
            if (r0 == 0) goto L4a
            A03(r6, r7, r10, r3)
            return
        L32:
            java.lang.String r0 = "story_sticker"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L42
            java.lang.String r0 = "story_attribution"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L4a
        L42:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326451137886089(0x810eb700063789, double:3.036332202252501E-306)
            goto L28
        L4a:
            android.net.Uri r5 = android.net.Uri.parse(r9)
            java.lang.String r0 = "story_sticker"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L5f
            java.lang.String r0 = "story_attribution"
            boolean r0 = r10.equals(r0)
            r4 = 0
            if (r0 == 0) goto L6d
        L5f:
            r4 = 1
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326451137820552(0x810eb700053788, double:3.036332202211055E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 != 0) goto L7c
        L6d:
            if (r11 == 0) goto Lc2
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326451137755015(0x810eb700043787, double:3.036332202169609E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto Lc2
        L7c:
            r0 = 1
        L7d:
            java.lang.String r3 = "ig_reshare_upsell"
            if (r0 == 0) goto L98
            android.net.Uri$Builder r1 = r5.buildUpon()
            java.lang.String r0 = "non_blocking"
        L87:
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r3, r0)
            java.lang.String r1 = r0.toString()
        L8f:
            X.C14360o3.A07(r1)
            X.2Fb r0 = X.C2Fb.A1T
            X.AbstractC41776Ies.A09(r6, r7, r0, r1, r8)
            return
        L98:
            if (r4 == 0) goto La7
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326451138017163(0x810eb70008378b, double:3.0363322023353926E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 != 0) goto Lb6
        La7:
            if (r11 == 0) goto Lbd
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326451137951626(0x810eb70007378a, double:3.036332202293947E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto Lbd
        Lb6:
            android.net.Uri$Builder r1 = r5.buildUpon()
            java.lang.String r0 = "blocking"
            goto L87
        Lbd:
            java.lang.String r1 = r5.toString()
            goto L8f
        Lc2:
            r0 = 0
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35265Fh0.A05(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public final void A07(FragmentActivity fragmentActivity, InterfaceC99474dM interfaceC99474dM, UserSession userSession, String str, String str2) {
        int i;
        String url;
        InterfaceC99464dK interfaceC99464dK = null;
        if (AbstractC14490oL.A0A(fragmentActivity)) {
            if (interfaceC99474dM != null) {
                interfaceC99464dK = interfaceC99474dM.BIU();
            }
            i = 2;
        } else {
            if (interfaceC99474dM != null) {
                interfaceC99464dK = interfaceC99474dM.CCc();
            }
            i = 3;
        }
        D8B d8b = new D8B(str, i);
        if (interfaceC99464dK != null && (url = interfaceC99464dK.getUrl()) != null) {
            TIFUAppDestinationEnum BL4 = interfaceC99464dK.BL4();
            if (BL4 != null) {
                int ordinal = BL4.ordinal();
                if (ordinal != 2 && ordinal != 4) {
                    if (ordinal == 1) {
                        A03(fragmentActivity, userSession, str2, url);
                        return;
                    }
                } else {
                    AbstractC41776Ies.A02(fragmentActivity, url);
                    return;
                }
            }
            AbstractC41776Ies.A03(fragmentActivity, url);
            return;
        }
        AbstractC166987dD.A1T(C18950wb.A01, AnonymousClass001.A0R("BarcelonaDeeplinkUtil, No deep link found for TIFU destination ", (String) d8b.invoke()), 817898032);
        A02(fragmentActivity, userSession, "tifu");
    }

    public static final String A00(UserSession userSession, Integer num, String str, String str2) {
        Uri.Builder scheme = new Uri.Builder().scheme("https");
        String str3 = "threads.net";
        if (C98J.A00(userSession).booleanValue()) {
            String A04 = C18U.A04(C06090Tz.A05, userSession, 36881807589376416L);
            if (A04.length() != 0) {
                str3 = A04;
            }
        }
        Uri.Builder appendEncodedPath = scheme.authority(AnonymousClass001.A0R("www.", str3)).path("/").appendEncodedPath(AnonymousClass001.A0D(str, '@'));
        if (str2 != null && str2.length() != 0) {
            appendEncodedPath.appendQueryParameter("source_application", str2);
        }
        if (num != null) {
            appendEncodedPath.appendQueryParameter("glyph_type", AbstractC34344FCm.A00(num));
        }
        return AbstractC166987dD.A19(appendEncodedPath.build());
    }

    private final boolean A06(Context context, UserSession userSession) {
        String A04 = AbstractC14490oL.A04(context);
        if (A04 != null && AbstractC14490oL.A0I(context, A04, 311) && C98J.A00(userSession).booleanValue() && C151366re.A01(userSession) && C18U.A06(C06090Tz.A05, userSession, 36318857637796446L)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (X.C18U.A06(r4, r25, 36318857639565944L) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(androidx.fragment.app.FragmentActivity r23, X.InterfaceC11380iw r24, com.instagram.common.session.UserSession r25, com.instagram.user.model.User r26) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35265Fh0.A08(androidx.fragment.app.FragmentActivity, X.0iw, com.instagram.common.session.UserSession, com.instagram.user.model.User):void");
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, Integer num, String str, String str2, String str3) {
        String str4;
        String A0r;
        AbstractC167027dH.A12(userSession, fragmentActivity, str);
        if (A00.A06(fragmentActivity, userSession)) {
            A0r = A00(userSession, num, str2, "com.instagram.android");
        } else if (AbstractC14490oL.A0A(fragmentActivity)) {
            if (num != null) {
                str4 = AnonymousClass001.A0R("&glyph_type=", AbstractC34344FCm.A00(num));
            } else {
                str4 = "";
            }
            A0r = AbstractC31173DnH.A0r("barcelona://user?id=%s&source_application=%s%s", str, "com.instagram.android", str4);
        } else {
            A03(fragmentActivity, userSession, str3, null);
            return;
        }
        AbstractC41776Ies.A02(fragmentActivity, A0r);
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        if (AbstractC14490oL.A0A(fragmentActivity)) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(AbstractC111324zv.A00(3999));
            ArrayList A1E = AbstractC166987dD.A1E();
            A1E.addAll(AbstractC16960so.A1Q(null, null, null));
            boolean z = false;
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                if (A1B != null) {
                    char c = '&';
                    if (!z) {
                        c = '?';
                    }
                    A1C.append(c);
                    A1C.append(A1B);
                    z = true;
                }
            }
            AbstractC41776Ies.A02(fragmentActivity, AbstractC166987dD.A19(A1C));
            return;
        }
        A03(fragmentActivity, userSession, str, null);
    }

    public static final void A04(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3) {
        AbstractC167027dH.A12(userSession, fragmentActivity, str);
        if (AbstractC14490oL.A0A(fragmentActivity)) {
            AbstractC41776Ies.A02(fragmentActivity, str);
        } else {
            A03(fragmentActivity, userSession, str2, str3);
        }
    }
}
