package com.facebook.caa.shared.passkey;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC24771Iv;
import X.AbstractC31171DnF;
import X.AbstractC53409Njy;
import X.AbstractC53410Njz;
import X.AbstractC58317Pt9;
import X.C05F;
import X.C0K8;
import X.C14360o3;
import X.C15W;
import X.C49352Or;
import X.C50829MdM;
import X.C50830MdN;
import X.C50831MdO;
import X.C51656Mrn;
import X.C53387Njc;
import X.C55544Ole;
import X.C6FQ;
import X.C6FW;
import X.C6FX;
import X.InterfaceC103384lE;
import X.InterfaceC31115Dlx;
import X.MC7;
import X.Q6U;
import X.Q6W;
import X.Q6c;
import android.content.Context;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.caa.shared.passkey.igconfig.IGContextProvider;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class PasskeyService {
    public static final C51656Mrn A08;
    public final Context A00;
    public final InterfaceC31115Dlx A01;
    public final C6FQ A02;
    public final InterfaceC103384lE A03;
    public final InterfaceC103384lE A04;
    public final InterfaceC103384lE A05;
    public final Map A06;
    public final InterfaceC103384lE A07;

    public PasskeyService(Context context, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, InterfaceC103384lE interfaceC103384lE3, InterfaceC103384lE interfaceC103384lE4, Map map) {
        C14360o3.A0B(map, 7);
        this.A00 = context;
        this.A02 = c6fq;
        this.A05 = interfaceC103384lE;
        this.A07 = interfaceC103384lE2;
        this.A03 = interfaceC103384lE3;
        this.A04 = interfaceC103384lE4;
        this.A06 = map;
        this.A01 = new C55544Ole(context);
    }

    public static final void A02(PasskeyService passkeyService, C6FW c6fw, InterfaceC103384lE interfaceC103384lE) {
        if (interfaceC103384lE != null) {
            AbstractC166987dD.A1Z(new MC7(interfaceC103384lE, c6fw, passkeyService, null, 5), AbstractC24771Iv.A00());
        }
    }

    static {
        byte[] bytes = "do_not_use_for_real_derivation".getBytes(C15W.A05);
        C14360o3.A07(bytes);
        String encodeToString = Base64.encodeToString(bytes, 0);
        C14360o3.A07(encodeToString);
        try {
            byte[] decode = Base64.decode(encodeToString, 11);
            C14360o3.A07(decode);
            A08 = new C51656Mrn(decode);
        } catch (IllegalArgumentException unused) {
            throw AbstractC166997dE.A0g();
        }
    }

    public static final C6FW A00(PasskeyService passkeyService, String str) {
        String str2;
        try {
            str2 = new JSONObject(str).getString(PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID);
        } catch (JSONException e) {
            C0K8.A0G("PasskeyService", "extractCredentialId: Failed to parse json", e);
            str2 = null;
        }
        if (str2 != null) {
            C14360o3.A0B(str, 0);
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject(AbstractC58317Pt9.A00(717));
                if (optJSONObject != null) {
                    optJSONObject.remove("prf");
                }
                String obj = jSONObject.toString();
                if (obj != null) {
                    Charset charset = C15W.A05;
                    byte[] bytes = obj.getBytes(charset);
                    C14360o3.A07(bytes);
                    String encodeToString = Base64.encodeToString(bytes, 11);
                    C14360o3.A07(encodeToString);
                    C6FX c6fx = new C6FX();
                    c6fx.A03(str2, 0);
                    c6fx.A02(encodeToString);
                    c6fx.A03("noop", 2);
                    JSONObject A0q = AbstractC31171DnF.A0q();
                    Iterator A15 = AbstractC166997dE.A15(passkeyService.A06);
                    while (A15.hasNext()) {
                        Map.Entry A1K = AbstractC166987dD.A1K(A15);
                        Object key = A1K.getKey();
                        boolean A1a = AbstractC166987dD.A1a(A1K.getValue());
                        if (C14360o3.A0K(key, "device_key_signature") && A1a) {
                            C49352Or c49352Or = new C49352Or(AbstractC58317Pt9.A00(84));
                            JSONArray A0p = AbstractC31171DnF.A0p();
                            JSONObject A0q2 = AbstractC31171DnF.A0q();
                            A0q2.put("pub", c49352Or.A00());
                            byte[] bytes2 = obj.getBytes(charset);
                            C14360o3.A07(bytes2);
                            A0q2.put("sig", c49352Or.A02(bytes2));
                            A0p.put(A0q2);
                            String A01 = IGContextProvider.A01(passkeyService.A00);
                            if (A01 != null) {
                                C49352Or c49352Or2 = new C49352Or(A01);
                                JSONObject A0q3 = AbstractC31171DnF.A0q();
                                A0q3.put("pub", c49352Or2.A00());
                                byte[] bytes3 = obj.getBytes(charset);
                                C14360o3.A07(bytes3);
                                A0q3.put("sig", c49352Or2.A02(bytes3));
                                A0p.put(A0q3);
                            }
                            A0q.put("device_key_signature_ext", A0p);
                        }
                    }
                    byte[] bytes4 = AbstractC166987dD.A19(A0q).getBytes(charset);
                    C14360o3.A07(bytes4);
                    String encodeToString2 = Base64.encodeToString(bytes4, 11);
                    C14360o3.A07(encodeToString2);
                    c6fx.A03(encodeToString2, 3);
                    return c6fx.A00();
                }
            } catch (JSONException e2) {
                C0K8.A0G("PasskeyUtil", "toJSONObject: Failed to parse json", e2);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        if (X.AbstractC166997dE.A1Z(r0, true) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.facebook.caa.shared.passkey.PasskeyService r5, X.InterfaceC23621Ds r6, X.InterfaceC16660sJ r7) {
        /*
            r4 = 25
            boolean r0 = X.MAN.A02(r6, r4)
            if (r0 == 0) goto L26
            r3 = r6
            X.MAN r3 = (X.MAN) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r2 = r3.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L35
            if (r0 != r4) goto L30
            java.lang.Object r5 = r3.A01
            com.facebook.caa.shared.passkey.PasskeyService r5 = (com.facebook.caa.shared.passkey.PasskeyService) r5
            goto L2c
        L26:
            X.MAN r3 = new X.MAN
            r3.<init>(r5, r6, r4)
            goto L16
        L2c:
            X.AbstractC09560e7.A00(r2)     // Catch: java.lang.Exception -> L43
            return r2
        L30:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L35:
            X.AbstractC09560e7.A00(r2)
            r3.A01 = r5     // Catch: java.lang.Exception -> L43
            r3.A00 = r4     // Catch: java.lang.Exception -> L43
            java.lang.Object r2 = r7.invoke(r3)     // Catch: java.lang.Exception -> L43
            if (r2 != r1) goto L60
            return r1
        L43:
            r3 = move-exception
            java.lang.String r1 = "PasskeyService"
            java.lang.String r0 = "handleCredentialException"
            X.C0K8.A0G(r1, r0, r3)
            boolean r0 = r3 instanceof X.Q6c
            if (r0 == 0) goto L61
            X.4lE r1 = r5.A04
        L51:
            if (r1 == 0) goto L5f
            X.6FX r0 = new X.6FX
            r0.<init>()
            X.6FW r0 = r0.A00()
            A02(r5, r0, r1)
        L5f:
            r2 = 0
        L60:
            return r2
        L61:
            boolean r0 = r3 instanceof X.Q6W
            if (r0 != 0) goto L69
            boolean r0 = r3 instanceof X.AbstractC53410Njz
            if (r0 == 0) goto L85
        L69:
            java.lang.String r2 = "prefer_immediately_available_credentials"
            java.util.Map r1 = r5.A06
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L83
            java.lang.Object r0 = r1.get(r2)
            r1 = 1
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r4)
            if (r0 == 0) goto L83
        L7e:
            if (r1 == 0) goto L85
            X.4lE r1 = r5.A03
            goto L51
        L83:
            r1 = 0
            goto L7e
        L85:
            A03(r5, r3)
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.caa.shared.passkey.PasskeyService.A01(com.facebook.caa.shared.passkey.PasskeyService, X.1Ds, X.0sJ):java.lang.Object");
    }

    public static final void A03(PasskeyService passkeyService, Exception exc) {
        Integer num;
        long j;
        C6FX c6fx = new C6FX();
        if (exc instanceof Q6W) {
            num = C05F.A01;
        } else if (exc instanceof C50829MdM) {
            num = C05F.A0C;
        } else if (exc instanceof Q6U) {
            num = C05F.A1I;
        } else if (exc instanceof AbstractC53409Njy) {
            num = C05F.A0N;
        } else if (exc instanceof C50830MdN) {
            num = C05F.A0Y;
        } else if (exc instanceof C50831MdO) {
            num = C05F.A0j;
        } else if (exc instanceof Q6c) {
            num = C05F.A0u;
        } else if (exc instanceof AbstractC53410Njz) {
            num = C05F.A15;
        } else if (exc instanceof C53387Njc) {
            num = C05F.A1F;
        } else {
            num = C05F.A00;
        }
        switch (num.intValue()) {
            case 0:
                j = 0;
                break;
            case 1:
                j = 1;
                break;
            case 2:
                j = 2;
                break;
            case 3:
                j = 3;
                break;
            case 4:
                j = 4;
                break;
            case 5:
                j = 5;
                break;
            case 6:
                j = 6;
                break;
            case 7:
                j = 7;
                break;
            case 8:
                j = 8;
                break;
            default:
                j = 9;
                break;
        }
        c6fx.A01(Long.valueOf(j));
        c6fx.A02(AbstractC166997dE.A0y("Passkey Service Exception: ", exc));
        A02(passkeyService, c6fx.A00(), passkeyService.A07);
    }

    public static final void A04(PasskeyService passkeyService, String str) {
        if (IGContextProvider.A01(passkeyService.A00) != null) {
            try {
                new JSONObject(str).getString(PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID);
            } catch (JSONException e) {
                C0K8.A0G("PasskeyService", "extractCredentialId: Failed to parse json", e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (X.AbstractC166997dE.A1Z(r1.get("device_key_signature"), r8) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A05(android.content.Context r14, java.lang.String r15, java.lang.String r16, boolean r17) {
        /*
            r13 = this;
            boolean r8 = X.AbstractC167017dG.A1a(r14, r15)
            java.lang.String r2 = "device_key_signature"
            java.util.Map r1 = r13.A06
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto Lc8
            java.lang.Object r0 = r1.get(r2)
            r2 = 1
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r8)
            if (r0 == 0) goto Lc8
        L19:
            org.json.JSONObject r5 = X.AbstractC31171DnF.A0q()
            java.lang.String r1 = "challenge"
            java.nio.charset.Charset r4 = X.C15W.A05
            byte[] r0 = r15.getBytes(r4)
            X.C14360o3.A07(r0)
            r3 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r3)
            X.C14360o3.A07(r0)
            r5.put(r1, r0)
            org.json.JSONObject r6 = X.AbstractC31171DnF.A0q()
            if (r2 == 0) goto La7
            java.lang.String r9 = "device_key_pubs"
            org.json.JSONArray r7 = X.AbstractC31171DnF.A0p()
            org.json.JSONObject r2 = X.AbstractC31171DnF.A0q()
            r0 = 84
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            X.2Or r0 = new X.2Or
            r0.<init>(r1)
            java.lang.String r0 = r0.A00()
            java.lang.String r1 = "pub"
            r2.put(r1, r0)
            java.lang.String r11 = "ig4a"
            java.lang.String r10 = "type"
            r2.put(r10, r11)
            r7.put(r2)
            java.lang.String r12 = com.facebook.caa.shared.passkey.igconfig.IGContextProvider.A01(r14)
            if (r12 == 0) goto L84
            org.json.JSONObject r2 = X.AbstractC31171DnF.A0q()
            X.2Or r0 = new X.2Or
            r0.<init>(r12)
            java.lang.String r0 = r0.A00()
            r2.put(r1, r0)
            java.lang.String r0 = "_legacy"
            java.lang.String r0 = X.AnonymousClass001.A0R(r11, r0)
            r2.put(r10, r0)
            r7.put(r2)
        L84:
            r0 = r16
            if (r16 == 0) goto La4
            org.json.JSONObject r2 = X.AbstractC31171DnF.A0q()
            r2.put(r1, r0)
            r1 = 0
            X.2GP r0 = new X.2GP
            r0.<init>(r14, r1)
            java.lang.String r0 = r0.A03()
            r2.put(r10, r0)
            java.lang.String r0 = "cross_app"
            r2.put(r0, r8)
            r7.put(r2)
        La4:
            r6.put(r9, r7)
        La7:
            if (r17 == 0) goto Lb0
            java.lang.String r1 = "payments_cc_e2ee_pub"
            java.lang.String r0 = X.AbstractC53594Nn1.A00
            r6.put(r1, r0)
        Lb0:
            java.lang.String r0 = "additional_data"
            r5.put(r0, r6)
            java.lang.String r0 = X.AbstractC166987dD.A19(r5)
            byte[] r0 = r0.getBytes(r4)
            X.C14360o3.A07(r0)
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r3)
            X.C14360o3.A07(r0)
            return r0
        Lc8:
            r2 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.caa.shared.passkey.PasskeyService.A05(android.content.Context, java.lang.String, java.lang.String, boolean):java.lang.String");
    }
}
