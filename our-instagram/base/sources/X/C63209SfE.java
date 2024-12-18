package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.SfE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63209SfE {
    public int A00;
    public LoginClient$Request A01;
    public Q7e A02;
    public String A03;
    public InterfaceC65487Tl7[] A04;
    public AbstractC12990ll A05;
    public final Fragment A06;
    public final String A07;

    public final void A03(LoginClient$Result loginClient$Result) {
        AccessToken accessToken;
        this.A01 = null;
        Q7e q7e = this.A02;
        if (q7e != null) {
            Integer num = loginClient$Result.A02;
            if (num == C05F.A00 && (accessToken = loginClient$Result.A00) != null) {
                LoginClient$Request loginClient$Request = q7e.A00;
                if (loginClient$Request != null && loginClient$Request.A00 == EnumC61140Rfu.A08) {
                    String str = q7e.A01;
                    C14360o3.A0B(str, 0);
                    long currentTimeMillis = System.currentTimeMillis() + AbstractC62348S7t.A00;
                    Date date = AccessToken.A0A;
                    AccessToken accessToken2 = new AccessToken(accessToken.A00, accessToken.A02, accessToken.A01, accessToken.A03, accessToken.A07, accessToken.A06, new Date(currentTimeMillis), accessToken.A05);
                    UserSession A0G = AbstractC31171DnF.A0G(AbstractC31178DnM.A06("IgSessionManager.SESSION_TOKEN_KEY", str));
                    C14360o3.A0B(A0G, 0);
                    try {
                        C23031Ai A00 = AbstractC23021Ah.A00(A0G);
                        String obj = AbstractC62765SQc.A01(accessToken2).toString();
                        C14360o3.A0B(obj, 0);
                        InterfaceC19610xo ARD = A00.A01.ARD();
                        ARD.E7K("promote_pro2pro_client_token", obj);
                        ARD.apply();
                    } catch (JSONException unused) {
                    }
                } else {
                    AbstractC63252Sg8 A002 = AbstractC63252Sg8.A00(q7e.A01);
                    if (!(A002 instanceof C58823QBg)) {
                        C58824QBh c58824QBh = (C58824QBh) A002;
                        AccessToken accessToken3 = c58824QBh.A00;
                        c58824QBh.A00 = accessToken;
                        c58824QBh.A01 = new Date(0L);
                        C62405SAe c62405SAe = c58824QBh.A03;
                        try {
                            JSONObject A01 = AbstractC62765SQc.A01(accessToken);
                            String str2 = c62405SAe.A00;
                            String obj2 = A01.toString();
                            C14360o3.A0B(str2, 0);
                            InterfaceC19610xo ARD2 = C1AT.A00(C1AV.A1K, str2).ARD();
                            ARD2.E7K("com.facebook.AccessTokenManager.CachedAccessToken", obj2);
                            ARD2.apply();
                        } catch (JSONException unused2) {
                        }
                        if (accessToken3 == null || !accessToken3.equals(accessToken)) {
                            Intent A0E = AbstractC58318PtA.A0E("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                            A0E.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken3);
                            A0E.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken);
                            c58824QBh.A02.A02(A0E);
                        }
                    }
                }
            }
            int i = -1;
            if (num == C05F.A01) {
                i = 0;
            }
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putParcelable(MSV.A00(189), loginClient$Result);
            Intent A04 = AbstractC31171DnF.A04();
            A04.putExtras(A0b);
            q7e.requireActivity().setResult(i, A04);
            AbstractC25227BEk.A1B(q7e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.AccessToken A00(android.os.Bundle r14, java.lang.Integer r15, java.lang.String r16, java.util.Collection r17) {
        /*
            r11 = r17
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            java.util.Date r0 = com.facebook.AccessToken.A0A
            r6 = 0
            java.lang.String r0 = "expires_in"
            java.lang.Object r1 = r14.get(r0)
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L83
            long r4 = X.AbstractC166987dD.A0N(r1)
        L18:
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L7a
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L23:
            java.util.Date r13 = new java.util.Date
            r13.<init>(r0)
        L28:
            java.lang.String r0 = "access_token"
            java.lang.String r8 = r14.getString(r0)
            java.lang.String r0 = "granted_scopes"
            java.lang.String r1 = r14.getString(r0)
            boolean r0 = X.AbstractC63349Si6.A05(r1)
            java.lang.String r2 = ","
            if (r0 != 0) goto L44
            java.lang.String[] r0 = r1.split(r2)
            java.util.ArrayList r11 = X.AbstractC58319PtB.A12(r0)
        L44:
            java.lang.String r0 = "denied_scopes"
            java.lang.String r1 = r14.getString(r0)
            boolean r0 = X.AbstractC63349Si6.A05(r1)
            if (r0 != 0) goto L78
            java.lang.String[] r0 = r1.split(r2)
            java.util.ArrayList r12 = X.AbstractC58319PtB.A12(r0)
        L58:
            boolean r0 = X.AbstractC63349Si6.A05(r8)
            if (r0 != 0) goto Lc6
            java.lang.String r0 = "userid"
            java.lang.String r10 = r14.getString(r0)
            if (r10 != 0) goto Lb9
            java.lang.String r0 = "signed_request"
            java.lang.String r1 = r14.getString(r0)
            r10 = 0
            if (r1 == 0) goto Lb9
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lb9
            goto L90
        L78:
            r12 = r6
            goto L58
        L7a:
            long r0 = r3.getTime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r2
            long r0 = r0 + r4
            goto L23
        L83:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L8e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L8e
            long r4 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L8e
            goto L18
        L8e:
            r13 = r6
            goto L28
        L90:
            java.lang.String r0 = "\\."
            java.lang.String[] r2 = r1.split(r0)     // Catch: java.lang.Exception -> Lb5
            int r1 = r2.length     // Catch: java.lang.Exception -> Lb5
            r0 = 2
            if (r1 != r0) goto Lb9
            r0 = 1
            r1 = r2[r0]     // Catch: java.lang.Exception -> Lb5
            r0 = 0
            byte[] r2 = android.util.Base64.decode(r1, r0)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> Lb5
            r0.<init>(r2, r1)     // Catch: java.lang.Exception -> Lb5
            org.json.JSONObject r1 = X.AbstractC58318PtA.A17(r0)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r0 = "user_id"
            java.lang.String r10 = r1.getString(r0)     // Catch: java.lang.Exception -> Lb5
            goto Lb9
        Lb5:
            r0 = move-exception
            r0.toString()
        Lb9:
            java.util.Date r14 = new java.util.Date
            r14.<init>()
            com.facebook.AccessToken r6 = new com.facebook.AccessToken
            r7 = r15
            r9 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
        Lc6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63209SfE.A00(android.os.Bundle, java.lang.Integer, java.lang.String, java.util.Collection):com.facebook.AccessToken");
    }

    public final void A02() {
        InterfaceC65487Tl7 interfaceC65487Tl7;
        int i = this.A00 + 1;
        this.A00 = i;
        InterfaceC65487Tl7[] interfaceC65487Tl7Arr = this.A04;
        if (i < interfaceC65487Tl7Arr.length && (interfaceC65487Tl7 = interfaceC65487Tl7Arr[i]) != null) {
            interfaceC65487Tl7.F8i(this.A01);
        } else {
            A03(LoginClient$Result.A02(this.A01, "Login attempt failed.", null, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(com.facebook.login.LoginClient$Result r7) {
        /*
            r6 = this;
            com.facebook.AccessToken r4 = r7.A00
            if (r4 == 0) goto L40
            java.lang.String r2 = r6.A03
            X.Sg8 r1 = X.AbstractC63252Sg8.A00(r2)
            boolean r0 = r1 instanceof X.C58823QBg
            if (r0 != 0) goto L40
            X.QBh r1 = (X.C58824QBh) r1
            com.facebook.AccessToken r0 = r1.A00
            if (r0 == 0) goto L40
            X.Sg8 r1 = X.AbstractC63252Sg8.A00(r2)
            boolean r0 = r1 instanceof X.C58823QBg
            if (r0 != 0) goto L33
            X.QBh r1 = (X.C58824QBh) r1
            com.facebook.AccessToken r0 = r1.A00
            if (r0 == 0) goto L33
            java.lang.String r1 = r0.A03     // Catch: java.lang.Exception -> L44
            java.lang.String r0 = r4.A03     // Catch: java.lang.Exception -> L44
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L44
            if (r0 == 0) goto L33
            com.facebook.login.LoginClient$Request r0 = r6.A01     // Catch: java.lang.Exception -> L44
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A00(r4, r0)     // Catch: java.lang.Exception -> L44
            goto L3c
        L33:
            com.facebook.login.LoginClient$Request r2 = r6.A01     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = "User logged in as different Facebook user."
            r0 = 0
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A02(r2, r1, r0, r0)     // Catch: java.lang.Exception -> L44
        L3c:
            r6.A03(r0)     // Catch: java.lang.Exception -> L44
            goto L55
        L40:
            r6.A03(r7)
            goto L55
        L44:
            r0 = move-exception
            com.facebook.login.LoginClient$Request r3 = r6.A01
            java.lang.String r2 = r0.getMessage()
            java.lang.String r1 = "Caught exception"
            r0 = 0
            com.facebook.login.LoginClient$Result r0 = com.facebook.login.LoginClient$Result.A02(r3, r1, r2, r0)
            r6.A03(r0)
        L55:
            r5 = 0
            if (r4 == 0) goto L6b
            java.lang.Integer r1 = r4.A00
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L6c
            X.0ll r3 = r6.A05
            com.facebook.login.LoginClient$Request r0 = r7.A01
            java.lang.String r2 = r0.A01
            boolean r1 = r0.A02
            java.lang.String r0 = "native_auth_verification_success"
        L68:
            X.AbstractC62273S4s.A00(r3, r0, r2, r5, r1)
        L6b:
            return
        L6c:
            java.lang.Integer r0 = X.C05F.A0j
            if (r1 != r0) goto L6b
            X.0ll r3 = r6.A05
            com.facebook.login.LoginClient$Request r0 = r7.A01
            java.lang.String r2 = r0.A01
            boolean r1 = r0.A02
            java.lang.String r0 = "web_auth_verification_success"
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63209SfE.A04(com.facebook.login.LoginClient$Result):void");
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.Syt, X.Tl7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.Tl7, java.lang.Object, X.Syq] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.Tl7, X.Sys, java.lang.Object] */
    public C63209SfE(Fragment fragment, LoginClient$Request loginClient$Request, String str, int i) {
        InterfaceC65487Tl7[] interfaceC65487Tl7Arr;
        this.A06 = fragment;
        Bundle bundle = fragment.mArguments;
        C09Y c09y = C023409i.A0A;
        AbstractC18680vv A04 = c09y.A04(bundle);
        this.A05 = A04;
        this.A03 = loginClient$Request.A05;
        this.A02 = (Q7e) fragment;
        this.A01 = loginClient$Request;
        this.A00 = i;
        this.A07 = str;
        EnumC61140Rfu enumC61140Rfu = loginClient$Request.A00;
        CallerContext callerContext = C31238DoL.A00;
        C14360o3.A0B(A04, 0);
        if ((A04 instanceof UserSession) && !Collections.unmodifiableSet(EnumSet.of(EnumC61140Rfu.A03, EnumC61140Rfu.A09, EnumC61140Rfu.A04, EnumC61140Rfu.A05, EnumC61140Rfu.A06, EnumC61140Rfu.A07, EnumC61140Rfu.A08, EnumC61140Rfu.A02)).contains(enumC61140Rfu)) {
            ?? obj = new Object();
            obj.A01 = this;
            obj.A00 = this;
            obj.A02 = A04;
            interfaceC65487Tl7Arr = new InterfaceC65487Tl7[]{obj};
        } else {
            ?? obj2 = new Object();
            obj2.A01 = this;
            obj2.A00 = this;
            obj2.A02 = A04;
            C64075Syr c64075Syr = new C64075Syr(this, this.A07);
            String str2 = this.A03;
            ?? obj3 = new Object();
            obj3.A01 = this;
            obj3.A04 = str2;
            obj3.A00 = this;
            obj3.A02 = c09y.A04(this.A06.mArguments);
            interfaceC65487Tl7Arr = new InterfaceC65487Tl7[]{obj2, c64075Syr, obj3};
        }
        this.A04 = interfaceC65487Tl7Arr;
    }

    public static String A01() {
        JSONObject A0q = AbstractC31171DnF.A0q();
        try {
            A0q.put("init", System.currentTimeMillis());
        } catch (JSONException e) {
            e.toString();
        }
        return A0q.toString();
    }
}
