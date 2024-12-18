package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Build;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.ArrayList;

/* renamed from: X.Fh4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35269Fh4 {
    public static final C35269Fh4 A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r19 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A01(android.content.Context r18, X.InterfaceC11380iw r19, X.AbstractC12990ll r20, X.GX6 r21, java.lang.String r22) {
        /*
            r13 = 0
            r2 = 1
            r11 = r20
            X.C14360o3.A0B(r11, r2)
            r5 = r18
            r12 = r22
            java.util.ArrayList r4 = A03(r5, r11, r12)
            if (r21 == 0) goto L23
            r1 = r21
            X.GAX r1 = (X.GAX) r1
            int r0 = r1.A00
            if (r0 != 0) goto L23
            java.lang.Object r1 = r1.A01
            X.ELH r1 = (X.ELH) r1
            int r0 = r4.size()
            r1.A00 = r0
        L23:
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            android.accounts.AccountManager r9 = android.accounts.AccountManager.get(r5)
            r10 = r19
            if (r22 == 0) goto L32
            r7 = 1
            if (r19 != 0) goto L33
        L32:
            r7 = 0
        L33:
            java.util.Iterator r6 = r4.iterator()
        L37:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lbb
            java.lang.Object r8 = r6.next()
            android.accounts.Account r8 = (android.accounts.Account) r8
            if (r7 == 0) goto La1
            X.C14360o3.A0A(r9)
            r14 = r13
            java.lang.String r0 = A00(r8, r9, r10, r11, r12, r13, r14)
        L4d:
            if (r0 == 0) goto L37
            int r1 = r0.length()
            if (r1 == 0) goto L37
            r3.add(r0)
            if (r21 == 0) goto L37
            r5 = r21
            X.GAX r5 = (X.GAX) r5
            int r1 = r5.A00
            if (r1 != 0) goto L37
            java.lang.Object r4 = r5.A01
            X.ELH r4 = (X.ELH) r4
            monitor-enter(r4)
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb8
            if (r1 != 0) goto L72
            java.util.List r1 = r4.A0O     // Catch: java.lang.Throwable -> Lb8
            r1.add(r0)     // Catch: java.lang.Throwable -> Lb8
        L72:
            int r0 = r4.A01     // Catch: java.lang.Throwable -> Lb8
            int r1 = r0 + 1
            r4.A01 = r1     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r4.A0L     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L9f
            int r0 = r4.A00     // Catch: java.lang.Throwable -> Lb8
            if (r1 != r0) goto L9f
            X.0a1 r1 = r4.A07     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = "token_ready_later"
            X.FD2.A00(r1, r0)     // Catch: java.lang.Throwable -> Lb8
            android.os.Handler r1 = r4.A0M     // Catch: java.lang.Throwable -> Lb8
            r0 = 0
            r1.removeCallbacksAndMessages(r0)     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r4.A06()     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto L9f
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()     // Catch: java.lang.Throwable -> Lb8
            X.GLh r0 = new X.GLh     // Catch: java.lang.Throwable -> Lb8
            r0.<init>()     // Catch: java.lang.Throwable -> Lb8
            r1.runOnUiThread(r0)     // Catch: java.lang.Throwable -> Lb8
        L9f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb8
            goto L37
        La1:
            X.C14360o3.A0A(r9)
            X.AbstractC167007dF.A1D(r9, r2, r8)
            r16 = 0
            r14 = r8
            r15 = r9
            r17 = r11
            r18 = r16
            r19 = r13
            r20 = r13
            java.lang.String r0 = A00(r14, r15, r16, r17, r18, r19, r20)
            goto L4d
        Lb8:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb8
            throw r0
        Lbb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35269Fh4.A01(android.content.Context, X.0iw, X.0ll, X.GX6, java.lang.String):java.util.ArrayList");
    }

    public static final ArrayList A02(Context context, AbstractC12990ll abstractC12990ll) {
        AbstractC167017dG.A1N(context, abstractC12990ll);
        return A01(context, null, abstractC12990ll, null, null);
    }

    public static final ArrayList A03(Context context, AbstractC12990ll abstractC12990ll, String str) {
        ArrayList A12 = AbstractC166997dE.A12(abstractC12990ll, 1);
        if (str != null) {
            A05(abstractC12990ll, str);
        }
        if (AbstractC23451Ch.A07(context, "android.permission.GET_ACCOUNTS")) {
            Account[] accounts = AccountManager.get(context).getAccounts();
            C14360o3.A07(accounts);
            int length = accounts.length;
            for (Account account : accounts) {
                if (account != null && "com.google".equalsIgnoreCase(account.type)) {
                    A12.add(account);
                }
            }
            if (str != null) {
                A06(abstractC12990ll, str, length);
            }
        } else if (str != null) {
            A07(abstractC12990ll, str, "no_permission");
            return A12;
        }
        return A12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r15 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(android.accounts.Account r13, android.accounts.AccountManager r14, X.InterfaceC11380iw r15, X.AbstractC12990ll r16, java.lang.String r17, boolean r18, boolean r19) {
        /*
            java.lang.String r4 = "audience:server:client_id:894032761246-7f5ii0dscmtvqu9lcs7bquii0vb6ddc8.apps.googleusercontent.com"
            r3 = 0
            r11 = r16
            X.C14360o3.A0B(r11, r3)
            X.AbstractC167017dG.A1P(r14, r13)
            java.lang.String r8 = ""
            r6 = 1
            r10 = r15
            r12 = r17
            if (r17 == 0) goto L16
            r9 = 1
            if (r15 != 0) goto L17
        L16:
            r9 = 0
        L17:
            java.lang.String r5 = "Required value was null."
            if (r9 == 0) goto L35
            if (r17 == 0) goto Lc9
            if (r15 == 0) goto Lc4
            X.0wW r1 = X.AbstractC12220kQ.A02(r11)
            java.lang.String r0 = "get_google_token_attempt"
            X.0Ai r0 = X.AbstractC166987dD.A0f(r1, r0)
            X.AbstractC31171DnF.A19(r0, r12)
            X.AbstractC31175DnJ.A0y(r0)
            X.AbstractC25229BEm.A1A(r0, r15)
            r0.Cht()
        L35:
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r8 = r14.blockingGetAuthToken(r13, r4, r3)     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            if (r19 != 0) goto L44
            java.lang.String r2 = "com.google"
            r14.invalidateAuthToken(r2, r8)     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
        L44:
            if (r18 != 0) goto L4a
            java.lang.String r8 = r14.blockingGetAuthToken(r13, r4, r3)     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
        L4a:
            if (r9 == 0) goto Lc3
            if (r17 == 0) goto L90
            if (r15 == 0) goto L95
            if (r8 == 0) goto L59
            int r2 = r8.length()     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            if (r2 == 0) goto L59
            r6 = 0
        L59:
            if (r6 != 0) goto L7e
            double r6 = (double) r0     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            double r2 = (double) r4     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            X.0wW r5 = X.AbstractC12220kQ.A02(r11)     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            java.lang.String r4 = "get_google_token_success"
            X.0Ai r4 = X.AbstractC166987dD.A0f(r5, r4)     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            X.AbstractC31171DnF.A19(r4, r12)     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            X.AbstractC31175DnJ.A0y(r4)     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            X.AbstractC25229BEm.A1A(r4, r15)     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            X.AbstractC31179DnN.A17(r4, r2, r6)     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            X.AbstractC31176DnK.A1K(r4, r2)     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            r4.Cht()     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            return r8
        L7e:
            r2 = 355(0x163, float:4.97E-43)
            java.lang.String r13 = X.AbstractC43591JPw.A00(r2)     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            double r14 = (double) r0     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            double r4 = (double) r2     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            r16 = r4
            A04(r10, r11, r12, r13, r14, r16)     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            return r8
        L90:
            java.lang.IllegalStateException r2 = X.AbstractC166987dD.A14(r5)     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
            goto L99
        L95:
            java.lang.IllegalStateException r2 = X.AbstractC166987dD.A14(r5)     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
        L99:
            throw r2     // Catch: java.io.IOException -> L9a android.accounts.AuthenticatorException -> La9 android.accounts.OperationCanceledException -> Lb4
        L9a:
            if (r9 == 0) goto Lc3
            double r14 = (double) r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            double r0 = (double) r2
            r2 = 41
            java.lang.String r13 = X.MSV.A00(r2)
            goto Lbe
        La9:
            if (r9 == 0) goto Lc3
            double r14 = (double) r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            double r0 = (double) r2
            java.lang.String r13 = "AuthenticatorException"
            goto Lbe
        Lb4:
            if (r9 == 0) goto Lc3
            double r14 = (double) r0
            long r2 = android.os.SystemClock.elapsedRealtime()
            double r0 = (double) r2
            java.lang.String r13 = "OperationCanceledException"
        Lbe:
            r16 = r0
            A04(r10, r11, r12, r13, r14, r16)
        Lc3:
            return r8
        Lc4:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r5)
            throw r0
        Lc9:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35269Fh4.A00(android.accounts.Account, android.accounts.AccountManager, X.0iw, X.0ll, java.lang.String, boolean, boolean):java.lang.String");
    }

    public static final void A04(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str, String str2, double d, double d2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "get_google_token_fail");
        A0f.AAP("error_type", str2);
        String str3 = "";
        if (str == null) {
            str = "";
        }
        AbstractC31171DnF.A19(A0f, str);
        AbstractC31175DnJ.A0y(A0f);
        AbstractC31179DnN.A16(A0f, d2, d);
        AbstractC35274Fh9.A05(A0f);
        if (interfaceC11380iw != null) {
            str3 = interfaceC11380iw.getModuleName();
        }
        AbstractC31171DnF.A1D(A0f, str3);
        C14360o3.A0B(abstractC12990ll, 0);
        AbstractC31177DnL.A1G(A0f, CacheBehaviorLogger.SOURCE, AbstractC31179DnN.A0c(abstractC12990ll), d);
        A0f.Cht();
    }

    public static final void A05(AbstractC12990ll abstractC12990ll, String str) {
        double A01 = AbstractC31171DnF.A01();
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "get_google_account_attempt");
        AbstractC31179DnN.A16(A0f, A01, A002);
        AbstractC31177DnL.A1G(A0f, "flow", str, A002);
        AbstractC31179DnN.A15(A0f);
        A0f.A9K("api_level", AbstractC31171DnF.A0V(Build.VERSION.SDK_INT));
        AbstractC35274Fh9.A08(A0f, abstractC12990ll);
    }

    public static final void A06(AbstractC12990ll abstractC12990ll, String str, int i) {
        double A01 = AbstractC31171DnF.A01();
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "get_google_account_success");
        AbstractC31179DnN.A15(A0f);
        AbstractC31179DnN.A17(A0f, A01, A002);
        AbstractC31176DnK.A1K(A0f, A01);
        AbstractC35274Fh9.A0D(A0f, "flow", str);
        AbstractC31178DnM.A14(A0f);
        A0f.A9K("num_of_google_account", AbstractC31171DnF.A0V(i));
        AbstractC35274Fh9.A0C(A0f, abstractC12990ll, "fb_family_device_id", AbstractC35274Fh9.A02(abstractC12990ll));
        A0f.Cht();
    }

    public static final void A07(AbstractC12990ll abstractC12990ll, String str, String str2) {
        double A01 = AbstractC31171DnF.A01();
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "get_google_account_failure");
        AbstractC31179DnN.A16(A0f, A01, A002);
        A0f.AAP("error_type", str2);
        AbstractC31171DnF.A19(A0f, str);
        AbstractC31177DnL.A1G(A0f, "containermodule", "waterfall_log_in", A002);
        AbstractC31175DnJ.A0y(A0f);
        AbstractC35274Fh9.A08(A0f, abstractC12990ll);
    }
}
