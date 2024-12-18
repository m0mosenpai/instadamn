package com.facebook.messaging.encryptedbackups.gdrive.flow;

import X.AbstractC09810fe;
import X.AbstractC38581qm;
import X.AbstractC46349KfX;
import X.AbstractC58318PtA;
import X.AbstractC61649RrL;
import X.AbstractC63384Siz;
import X.AbstractC64922TZx;
import X.AnonymousClass001;
import X.B4Z;
import X.C00O;
import X.C14360o3;
import X.C15W;
import X.C20I;
import X.C24721Ip;
import X.C44808Jsf;
import X.C44809Jsg;
import X.C46559Kiy;
import X.C47228Ku1;
import X.C47312KvN;
import X.C47980LIv;
import X.C48151LTa;
import X.InterfaceC24731Iq;
import X.L9M;
import X.LRY;
import X.LTY;
import X.LTZ;
import X.MSW;
import X.RGV;
import X.RrM;
import X.SNE;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.CancellationException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class GoogleAuthController {
    public LRY A00;
    public C47312KvN A01;
    public RGV A02;
    public final InterfaceC24731Iq A03;
    public final C46559Kiy A04;

    public GoogleAuthController(C46559Kiy c46559Kiy) {
        C14360o3.A0B(c46559Kiy, 1);
        this.A04 = c46559Kiy;
        this.A03 = new C24721Ip(0);
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.Closeable, int] */
    private final AbstractC46349KfX A01(Context context, AuthorizationResult authorizationResult) {
        AbstractC46349KfX A00;
        AbstractC46349KfX c44808Jsf;
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        SNE sne = new SNE();
        try {
            String str = authorizationResult.A03;
            if (str != null) {
                if (authorizationResult.A04.contains("https://www.googleapis.com/auth/drive.appdata")) {
                    C14360o3.A0B(context, 0);
                    AbstractC63384Siz.A06(context, str);
                    C14360o3.A0B(str, 0);
                    L9M l9m = new L9M(new C47980LIv(str));
                    boolean z = false;
                    SNE sne2 = new SNE();
                    try {
                        try {
                            URLConnection openConnection = new URL("https://www.googleapis.com/oauth2/v1/userinfo").openConnection();
                            C14360o3.A0C(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                            httpURLConnection = (HttpURLConnection) openConnection;
                            httpURLConnection.setRequestMethod("GET");
                            httpURLConnection.setUseCaches(false);
                            httpURLConnection.setDoInput(true);
                            httpURLConnection.setDoOutput(false);
                            httpURLConnection.setRequestProperty("Authorization", C47980LIv.A00(l9m));
                            httpURLConnection.getResponseCode();
                            ?? responseCode = httpURLConnection.getResponseCode();
                            if (responseCode == 200) {
                                z = true;
                            }
                            try {
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    C20I.A00(responseCode, th);
                                    throw th2;
                                }
                            }
                        } catch (IOException | JSONException e) {
                            sne2.A01(e);
                            throw C00O.createAndThrow();
                        }
                    } catch (AbstractC64922TZx e2) {
                        A00 = A00(sne2, e2);
                    } catch (Throwable th3) {
                        sne2.A00();
                        AbstractC61649RrL.A00(th3);
                        throw th3;
                    }
                    if (!z) {
                        int responseCode2 = httpURLConnection.getResponseCode();
                        InputStream errorStream = httpURLConnection.getErrorStream();
                        C14360o3.A07(errorStream);
                        Reader inputStreamReader = new InputStreamReader(errorStream, C15W.A05);
                        if (inputStreamReader instanceof BufferedReader) {
                            bufferedReader2 = (BufferedReader) inputStreamReader;
                        } else {
                            bufferedReader2 = new BufferedReader(inputStreamReader, 8192);
                        }
                        String A002 = AbstractC38581qm.A00(bufferedReader2);
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        sne2.A01(MSW.A0y(AnonymousClass001.A0H(A002, ':', responseCode2)));
                        throw C00O.createAndThrow();
                    }
                    Reader inputStreamReader2 = new InputStreamReader(AbstractC09810fe.A00(httpURLConnection, -2108319039), C15W.A05);
                    if (inputStreamReader2 instanceof BufferedReader) {
                        bufferedReader = (BufferedReader) inputStreamReader2;
                    } else {
                        bufferedReader = new BufferedReader(inputStreamReader2, 8192);
                    }
                    String A003 = AbstractC38581qm.A00(bufferedReader);
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    JSONObject A17 = AbstractC58318PtA.A17(A003);
                    A17.getString("email");
                    A17.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    httpURLConnection.disconnect();
                    C47228Ku1 c47228Ku1 = new C47228Ku1(l9m);
                    sne2.A00();
                    A00 = new C44809Jsg(c47228Ku1);
                    if (A00 instanceof C44809Jsg) {
                        c44808Jsf = new C44809Jsg(((C44809Jsg) A00).A00);
                    } else if (A00 instanceof C44808Jsf) {
                        c44808Jsf = new C44808Jsf(LTZ.A00);
                    } else {
                        throw B4Z.A00();
                    }
                    C47228Ku1 c47228Ku12 = (C47228Ku1) RrM.A00(c44808Jsf, sne);
                    sne.A00();
                    return new C44809Jsg(c47228Ku12);
                }
                sne.A01(LTY.A00);
            } else {
                sne.A01(C48151LTa.A00);
            }
            throw C00O.createAndThrow();
        } catch (AbstractC64922TZx e3) {
            return A00(sne, e3);
        } catch (Throwable th4) {
            sne.A00();
            AbstractC61649RrL.A00(th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0125, code lost:
    
        if (r1 == null) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8 A[Catch: all -> 0x00f2, TryCatch #1 {all -> 0x00f2, blocks: (B:14:0x009d, B:16:0x00a8, B:18:0x00b7, B:19:0x00ba), top: B:13:0x009d, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(androidx.activity.result.ActivityResult r7, androidx.fragment.app.FragmentActivity r8, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r9, X.InterfaceC23621Ds r10) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A02(androidx.activity.result.ActivityResult, androidx.fragment.app.FragmentActivity, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[Catch: TZx -> 0x010c, all -> 0x014c, TryCatch #2 {TZx -> 0x010c, all -> 0x014c, blocks: (B:12:0x0044, B:14:0x0060, B:17:0x0071, B:19:0x0075, B:21:0x0079, B:24:0x0089, B:26:0x008d, B:28:0x0099, B:29:0x00a2, B:56:0x00b1, B:58:0x00b5, B:59:0x00e4, B:60:0x00e8, B:62:0x00c6, B:64:0x0085, B:65:0x00ce, B:67:0x00d4, B:69:0x006d, B:70:0x00dc), top: B:11:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dc A[Catch: TZx -> 0x010c, all -> 0x014c, TryCatch #2 {TZx -> 0x010c, all -> 0x014c, blocks: (B:12:0x0044, B:14:0x0060, B:17:0x0071, B:19:0x0075, B:21:0x0079, B:24:0x0089, B:26:0x008d, B:28:0x0099, B:29:0x00a2, B:56:0x00b1, B:58:0x00b5, B:59:0x00e4, B:60:0x00e8, B:62:0x00c6, B:64:0x0085, B:65:0x00ce, B:67:0x00d4, B:69:0x006d, B:70:0x00dc), top: B:11:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0109 -> B:10:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(androidx.fragment.app.FragmentActivity r12, X.SNE r13, X.InterfaceC65207Tfu r14, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r15, X.InterfaceC23621Ds r16) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A03(androidx.fragment.app.FragmentActivity, X.SNE, X.Tfu, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a7 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(androidx.fragment.app.FragmentActivity r7, X.SNE r8, X.InterfaceC65207Tfu r9, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r10, X.InterfaceC23621Ds r11) {
        /*
            r3 = 9
            boolean r0 = X.MAP.A02(r11, r3)
            if (r0 == 0) goto Laa
            r4 = r11
            X.MAP r4 = (X.MAP) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laa
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A05
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L66
            if (r0 == r2) goto L7d
            if (r0 != r3) goto Lc8
            java.lang.Object r10 = r4.A03
            com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r10 = (com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController) r10
            java.lang.Object r7 = r4.A02
            androidx.fragment.app.FragmentActivity r7 = (androidx.fragment.app.FragmentActivity) r7
            java.lang.Object r6 = r4.A01
            X.SNE r6 = (X.SNE) r6
            X.AbstractC09560e7.A00(r1)
        L33:
            r8 = r6
            X.KfX r1 = (X.AbstractC46349KfX) r1
            boolean r0 = r1 instanceof X.C44809Jsg
            if (r0 == 0) goto L3f
            X.Jsg r1 = (X.C44809Jsg) r1
            java.lang.Object r5 = r1.A00
        L3e:
            return r5
        L3f:
            boolean r0 = r1 instanceof X.C44808Jsf
            if (r0 == 0) goto Lc3
            X.Jsf r1 = (X.C44808Jsf) r1
            java.lang.Object r1 = r1.A00
            X.QIu r1 = (X.QIu) r1
            r0 = 0
            boolean r0 = X.QIu.A00(r1, r0)
            if (r0 != 0) goto Lb9
            boolean r0 = X.QIu.A00(r1, r2)
            if (r0 == 0) goto Lb4
            java.lang.Object r0 = r1.A01
            com.google.android.gms.auth.UserRecoverableAuthException r0 = (com.google.android.gms.auth.UserRecoverableAuthException) r0
            android.content.Intent r0 = r0.A00()
            if (r0 == 0) goto Lb1
            X.QJU r9 = new X.QJU
            r9.<init>(r0, r2)
            goto L69
        L66:
            X.AbstractC09560e7.A00(r1)
        L69:
            X.12W r0 = r4.getContext()
            X.C2QZ.A01(r0)
            r4.A01 = r8
            X.MAP.A00(r7, r10, r8, r4, r2)
            java.lang.Object r1 = A06(r7, r9, r10, r4)
            if (r1 == r5) goto L3e
            r6 = r8
            goto L90
        L7d:
            java.lang.Object r8 = r4.A04
            X.SNE r8 = (X.SNE) r8
            java.lang.Object r10 = r4.A03
            com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r10 = (com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController) r10
            java.lang.Object r7 = r4.A02
            androidx.fragment.app.FragmentActivity r7 = (androidx.fragment.app.FragmentActivity) r7
            java.lang.Object r6 = r4.A01
            X.SNE r6 = (X.SNE) r6
            X.AbstractC09560e7.A00(r1)
        L90:
            X.KfX r1 = (X.AbstractC46349KfX) r1
            java.lang.Object r1 = X.RrM.A00(r1, r8)
            androidx.activity.result.ActivityResult r1 = (androidx.activity.result.ActivityResult) r1
            r4.A01 = r6
            r4.A02 = r7
            r4.A03 = r10
            r0 = 0
            r4.A04 = r0
            r4.A00 = r3
            java.lang.Object r1 = A02(r1, r7, r10, r4)
            if (r1 != r5) goto L33
            return r5
        Laa:
            X.MAP r4 = new X.MAP
            r4.<init>(r10, r11, r3)
            goto L16
        Lb1:
            X.LTZ r0 = X.LTZ.A00
            goto Lbb
        Lb4:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lb9:
            java.lang.Object r0 = r1.A01
        Lbb:
            r6.A01(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lc3:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lc8:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A04(androidx.fragment.app.FragmentActivity, X.SNE, X.Tfu, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[PHI: r1
      0x002a: PHI (r1v6 java.lang.Object) = (r1v4 java.lang.Object), (r1v0 java.lang.Object) binds: [B:27:0x00c7, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.RGV, X.61Q] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.61b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(androidx.fragment.app.FragmentActivity r11, X.SNE r12, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r13, X.InterfaceC23621Ds r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A05(androidx.fragment.app.FragmentActivity, X.SNE, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00df: INVOKE (r5 I:X.SNE) VIRTUAL call: X.SNE.A00():void A[MD:():void (m)] (LINE:223), block:B:50:0x00df */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00e7: INVOKE (r8 I:X.Jsf) = (r5 I:X.SNE), (r0 I:java.util.concurrent.CancellationException) STATIC call: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A00(X.SNE, java.util.concurrent.CancellationException):X.Jsf A[MD:(X.SNE, java.util.concurrent.CancellationException):X.Jsf (m)] (LINE:231), block:B:47:0x00e7 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.SNE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A06(androidx.fragment.app.FragmentActivity r10, X.InterfaceC65207Tfu r11, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r12, X.InterfaceC23621Ds r13) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A06(androidx.fragment.app.FragmentActivity, X.Tfu, com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063 A[LOOP:0: B:26:0x005d->B:28:0x0063, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.RGU, X.61Q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A07(com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r20, X.InterfaceC23621Ds r21) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A07(com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ea, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5 A[Catch: all -> 0x00f9, TZx -> 0x0101, TryCatch #4 {TZx -> 0x0101, all -> 0x00f9, blocks: (B:14:0x0096, B:19:0x00a3, B:21:0x00b5, B:23:0x00b9, B:25:0x00bd, B:31:0x00e6, B:32:0x00e8, B:34:0x00f1, B:35:0x00f8, B:36:0x00ec, B:37:0x00d0, B:38:0x00d3, B:40:0x00d7, B:41:0x00da, B:42:0x00db, B:43:0x00de), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de A[Catch: all -> 0x00f9, TZx -> 0x0101, TryCatch #4 {TZx -> 0x0101, all -> 0x00f9, blocks: (B:14:0x0096, B:19:0x00a3, B:21:0x00b5, B:23:0x00b9, B:25:0x00bd, B:31:0x00e6, B:32:0x00e8, B:34:0x00f1, B:35:0x00f8, B:36:0x00ec, B:37:0x00d0, B:38:0x00d3, B:40:0x00d7, B:41:0x00da, B:42:0x00db, B:43:0x00de), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A08(androidx.fragment.app.FragmentActivity r11, X.InterfaceC23621Ds r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController.A08(androidx.fragment.app.FragmentActivity, X.1Ds, boolean):java.lang.Object");
    }

    public static C44808Jsf A00(SNE sne, CancellationException cancellationException) {
        sne.A00();
        if (cancellationException instanceof AbstractC64922TZx) {
            AbstractC64922TZx abstractC64922TZx = (AbstractC64922TZx) cancellationException;
            if (abstractC64922TZx.A00 == sne) {
                return new C44808Jsf(abstractC64922TZx.A01);
            }
            throw cancellationException;
        }
        throw cancellationException;
    }
}
