package X;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.Map;

/* renamed from: X.SzJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64102SzJ implements InterfaceC65615To6 {
    public String A00;
    public String A01;
    public final int A02;
    public final SBF A03;
    public final OSN A04;
    public final String A05;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0Zx, X.QC9] */
    private final QC9 A00(String str) {
        ?? c0Zx = new C0Zx();
        c0Zx.A01(RiU.A02, "dcp_flow");
        c0Zx.A00.put("dcp_platform", 71);
        Boolean A0a = AbstractC166997dE.A0a();
        c0Zx.A03("is_retry", A0a);
        c0Zx.A01(RiW.QUOTE, "dcp_sub_flow");
        c0Zx.A06("app", this.A05);
        c0Zx.A03("is_retry", A0a);
        c0Zx.A06("external_product_id", str);
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.QCA] */
    private final QCA A01(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        Long A0j;
        ?? c0Zx = new C0Zx();
        c0Zx.A01(RiU.A03, "dcp_flow");
        c0Zx.A01(RiW.FULFILLMENT, "dcp_sub_flow");
        c0Zx.A06("app", this.A05);
        c0Zx.A06("external_transaction_id", str);
        if (bool != null) {
            c0Zx.A03("is_retry", Boolean.valueOf(bool.booleanValue()));
        }
        A06(c0Zx, str2, str4);
        if (str5 != null && (A0j = AbstractC166997dE.A0j(str5)) != null) {
            c0Zx.A05("product_id", A0j);
        }
        if (str6 != null) {
            c0Zx.A05("quote_id", AbstractC25228BEl.A13(str6));
        }
        if (str3 != null && str3.length() != 0) {
            c0Zx.A05("internal_transaction_id", AbstractC25228BEl.A13(str3));
        }
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.QCB, X.0Zx] */
    private final QCB A02(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        Long A0j;
        ?? c0Zx = new C0Zx();
        c0Zx.A01(RiU.A03, "dcp_flow");
        c0Zx.A03("is_retry", Boolean.valueOf(z));
        c0Zx.A01(RiW.QUOTE, "dcp_sub_flow");
        c0Zx.A06("app", this.A05);
        A06(c0Zx, str, str2);
        if (str3 != null && (A0j = AbstractC166997dE.A0j(str3)) != null) {
            c0Zx.A05("product_id", A0j);
        }
        if (str4 != null) {
            c0Zx.A05("quote_id", AbstractC25228BEl.A13(str4));
        }
        if (str5 != null) {
            c0Zx.A06("external_transaction_id", str5);
        }
        if (str6 != null) {
            c0Zx.A05("internal_transaction_id", AbstractC25228BEl.A13(str6));
        }
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.QCC] */
    private final QCC A03(RiW riW, EnumC33460Eqv enumC33460Eqv, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6) {
        Long A0j;
        ?? c0Zx = new C0Zx();
        c0Zx.A01(RiU.A03, "dcp_flow");
        c0Zx.A01(riW, "dcp_sub_flow");
        c0Zx.A06("app", this.A05);
        c0Zx.A06("external_transaction_id", str);
        if (bool != null) {
            c0Zx.A03("is_retry", Boolean.valueOf(bool.booleanValue()));
        }
        A06(c0Zx, str2, str4);
        if (str5 != null && (A0j = AbstractC166997dE.A0j(str5)) != null) {
            c0Zx.A05("product_id", A0j);
        }
        if (str6 != null) {
            c0Zx.A05("quote_id", AbstractC25228BEl.A13(str6));
        }
        if (enumC33460Eqv != null) {
            c0Zx.A01(enumC33460Eqv, "target_name");
        }
        if (str3 != null && str3.length() != 0) {
            c0Zx.A05("internal_transaction_id", AbstractC25228BEl.A13(str3));
        }
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.QCD, X.0Zx] */
    private final QCD A04(String str, String str2, String str3, String str4) {
        Long A0j;
        ?? c0Zx = new C0Zx();
        c0Zx.A01(RiU.A03, "dcp_flow");
        Boolean A0a = AbstractC166997dE.A0a();
        c0Zx.A03("is_retry", A0a);
        c0Zx.A06("app", this.A05);
        c0Zx.A01(RiW.QUOTE, "dcp_sub_flow");
        c0Zx.A03("is_retry", A0a);
        A06(c0Zx, str, str2);
        if (str3 != null && (A0j = AbstractC166997dE.A0j(str3)) != null) {
            c0Zx.A05("product_id", A0j);
        }
        if (str4 != null) {
            c0Zx.A05("quote_id", AbstractC25228BEl.A13(str4));
        }
        return c0Zx;
    }

    public static void A06(C0Zx c0Zx, String str, String str2) {
        Long A0k;
        c0Zx.A06("external_product_id", str);
        if (str2 != null && (A0k = AbstractC003100w.A0k(10, str2)) != null) {
            c0Zx.A05("payee_id", A0k);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03d7, code lost:
    
        if (r1 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0582, code lost:
    
        if (r4.equals("afs") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0586, code lost:
    
        r1 = X.C2O5.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0590, code lost:
    
        if (r4.equals("nme") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0594, code lost:
    
        r1 = X.C2O5.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x059e, code lost:
    
        if (r4.equals("mv4b") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x05a2, code lost:
    
        r1 = X.C2O5.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x05ac, code lost:
    
        if (r4.equals("fan_subs") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x05b0, code lost:
    
        r1 = X.C2O5.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x05ba, code lost:
    
        if (r4.equals("avatar_content") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0574, code lost:
    
        if (r4.equals(r1) != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x05be, code lost:
    
        r1 = X.C2O5.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x05c8, code lost:
    
        if (r4.equals("content_appreciation") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x05cc, code lost:
    
        r1 = X.C2O5.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x05d6, code lost:
    
        if (r4.equals("digital_collectibles") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x05da, code lost:
    
        r1 = X.C2O5.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0578, code lost:
    
        r1 = X.C2O5.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0514, code lost:
    
        if (r3.equals("AVATAR_CONTENT") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x051e, code lost:
    
        if (r3.equals("NME_SUBSCRIPTION") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x052c, code lost:
    
        if (r3.equals(X.AbstractC43591JPw.A00(258)) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x053a, code lost:
    
        if (r3.equals(X.MSV.A00(344)) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0544, code lost:
    
        if (r3.equals("NFT") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x054e, code lost:
    
        if (r3.equals("MV4B") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0558, code lost:
    
        if (r3.equals("AFS_SUBSCRIPTION") == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0566, code lost:
    
        if (r3.equals(X.AbstractC43591JPw.A00(641)) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0235, code lost:
    
        if (r1 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x03db, code lost:
    
        r3.AAP("error_message", r1);
        r3.Cht();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x03e3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x03d9, code lost:
    
        r1 = "FIX no error message provided";
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x00d6. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0253  */
    @Override // X.InterfaceC65615To6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ci3(java.util.Map r25, java.util.Map r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 1804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64102SzJ.Ci3(java.util.Map, java.util.Map, java.lang.String):void");
    }

    public C64102SzJ(Context context, InterfaceC02550Ad interfaceC02550Ad, OSN osn) {
        AbstractC167017dG.A1R(osn, context);
        this.A04 = osn;
        this.A00 = AbstractC58442PvL.A02();
        this.A02 = AbstractC58318PtA.A05(context, GoogleApiAvailability.A00);
        this.A05 = context.getPackageName();
        this.A03 = new SBF(interfaceC02550Ad);
        this.A01 = "all_products";
    }

    public static void A05(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx, String str, Map map) {
        if (interfaceC02590Ai.isSampled()) {
            interfaceC02590Ai.AAP(AbstractC58361Pu1.A00(), str);
            interfaceC02590Ai.A8R(interfaceC02530Ab, "product_type");
            interfaceC02590Ai.A8R(EnumC31203Dnm.ANDROID, "platform");
            interfaceC02590Ai.A9K("actual_event_time", Long.valueOf(System.currentTimeMillis()));
            interfaceC02590Ai.AAQ(c0Zx, "event_payload");
            interfaceC02590Ai.A9M("extra_data", map);
            interfaceC02590Ai.Cht();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r0 != null) goto L8;
     */
    @Override // X.InterfaceC65615To6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap BjC(X.SYG r7, com.android.billingclient.api.Purchase r8, boolean r9) {
        /*
            r6 = this;
            java.util.LinkedHashMap r2 = X.AbstractC166987dD.A1I()
            if (r8 == 0) goto L79
            org.json.JSONObject r5 = r8.A02
            java.lang.String r0 = "obfuscatedAccountId"
            java.lang.String r1 = r5.optString(r0)
            java.lang.String r0 = "obfuscatedProfileId"
            java.lang.String r0 = r5.optString(r0)
            if (r1 != 0) goto L19
            r3 = 0
            if (r0 == 0) goto L1a
        L19:
            r3 = r0
        L1a:
            java.lang.String r1 = r8.A01()
            java.lang.String r0 = "external_transaction_id"
            r2.put(r0, r1)
            java.lang.String r1 = X.AbstractC61812Ru6.A00(r8)
            java.lang.String r0 = "external_product_id"
            r2.put(r0, r1)
            java.lang.String r4 = ""
            java.lang.String r0 = "purchaseTime"
            long r0 = r5.optLong(r0)
            java.lang.String r1 = X.AnonymousClass001.A0Q(r4, r0)
            java.lang.String r0 = "external_purchase_time"
            r2.put(r0, r1)
            java.lang.String r1 = r8.A01
            java.lang.String r0 = "external_purchase_signature"
            r2.put(r0, r1)
            java.lang.String r0 = "developerPayload"
            java.lang.String r1 = r5.optString(r0)
            java.lang.String r0 = "developer_payload"
            r2.put(r0, r1)
            java.lang.String r1 = r8.A02()
            java.lang.String r0 = "external_purchase_token"
            r2.put(r0, r1)
            X.RhW r0 = X.RhW.A0d
            java.lang.String r1 = r0.A00
            java.lang.String r0 = java.lang.String.valueOf(r9)
            r2.put(r1, r0)
            X.RhW r0 = X.RhW.A0t
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r6.A00
            r2.put(r1, r0)
            if (r3 == 0) goto L79
            boolean r0 = X.AbstractC001900j.A0T(r3)
            if (r0 != 0) goto L79
            X.RhW r0 = X.RhW.A0r
            X.AbstractC58318PtA.A1M(r0, r3, r2)
        L79:
            if (r7 == 0) goto L85
            int r1 = r7.A00
            java.lang.String r0 = r7.A01
            X.C14360o3.A07(r0)
            X.AbstractC63051SbX.A01(r0, r1, r2)
        L85:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64102SzJ.BjC(X.SYG, com.android.billingclient.api.Purchase, boolean):java.util.LinkedHashMap");
    }
}
