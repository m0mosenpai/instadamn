package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3oJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83743oJ {
    public static C83743oJ A02;
    public Map A00 = new HashMap();
    public final C83753oK A01 = new Object();

    public static C83743oJ A00() {
        C83743oJ c83743oJ = A02;
        if (c83743oJ == null) {
            C83743oJ c83743oJ2 = new C83743oJ();
            A02 = c83743oJ2;
            return c83743oJ2;
        }
        return c83743oJ;
    }

    public static C83743oJ A01(AbstractC12990ll abstractC12990ll) {
        if (A02 == null) {
            C83743oJ c83743oJ = new C83743oJ();
            A02 = c83743oJ;
            c83743oJ.A0C(abstractC12990ll);
        }
        return A02;
    }

    public static C83803oP A02(C83743oJ c83743oJ, String str) {
        if (c83743oJ.A00.containsKey(str)) {
            return (C83803oP) c83743oJ.A00.get(str);
        }
        C83803oP c83803oP = new C83803oP();
        c83803oP.A06 = str;
        return c83803oP;
    }

    public static final List A03() {
        ArrayList arrayList = new ArrayList();
        String string = AbstractC19730y1.A00(AbstractC12960li.A00).A00.getString("one_tap_login_user_map", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                return (List) AbstractC83763oL.parseFromJson(C16V.A00(string)).A00;
            } catch (IOException unused) {
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r1.A04.equals("APP_LEVEL_SPI_UNKNOWN") == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean A04(java.lang.String r3) {
        /*
            r2 = this;
            java.util.Map r0 = r2.A00
            java.lang.Object r1 = r0.get(r3)
            X.3oP r1 = (X.C83803oP) r1
            if (r1 == 0) goto L1b
            boolean r0 = r2.A0K(r3)
            if (r0 == 0) goto L1b
            java.lang.String r1 = r1.A04
            java.lang.String r0 = "APP_LEVEL_SPI_UNKNOWN"
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 != 0) goto L1c
        L1b:
            r0 = 0
        L1c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83743oJ.A04(java.lang.String):java.lang.Boolean");
    }

    public final ArrayList A05() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.A00.entrySet()) {
            if (((C83803oP) entry.getValue()).A08) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r18.booleanValue() == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(android.content.Context r15, X.InterfaceC11380iw r16, X.AbstractC12990ll r17, java.lang.Boolean r18, java.lang.Boolean r19, java.lang.Integer r20, java.lang.Iterable r21, boolean r22) {
        /*
            r14 = this;
            r3 = r21
            java.util.Iterator r6 = r3.iterator()
        L6:
            boolean r0 = r6.hasNext()
            r8 = r16
            r7 = r20
            r2 = r22
            r4 = r17
            if (r0 == 0) goto L3f
            java.lang.Object r5 = r6.next()
            java.lang.String r5 = (java.lang.String) r5
            X.3oP r1 = A02(r14, r5)
            boolean r0 = r1.A08
            if (r0 == r2) goto L25
            X.FBF.A00(r8, r4, r7, r5, r2)
        L25:
            r1.A08 = r2
            if (r18 != 0) goto L33
            java.lang.String r0 = "APP_LEVEL_SPI_UNKNOWN"
        L2b:
            r1.A04 = r0
            java.util.Map r0 = r14.A00
            r0.put(r5, r1)
            goto L6
        L33:
            boolean r0 = r18.booleanValue()
            if (r0 == 0) goto L3c
            java.lang.String r0 = "APP_LEVEL_SPI_YES"
            goto L2b
        L3c:
            java.lang.String r0 = "APP_LEVEL_SPI_NO"
            goto L2b
        L3f:
            if (r18 == 0) goto L48
            boolean r0 = r18.booleanValue()
            r11 = 1
            if (r0 != 0) goto L49
        L48:
            r11 = 0
        L49:
            java.lang.Integer r0 = X.C05F.A06
            if (r7 == r0) goto L79
            java.lang.Integer r0 = X.C05F.A02
            if (r7 == r0) goto L79
            r7 = r15
            if (r15 == 0) goto L79
            boolean r0 = r4 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L79
            r9 = r4
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            java.lang.String r0 = r9.userId
            boolean r0 = r14.A0N(r0)
            if (r0 == 0) goto L79
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 18312860081863091(0x410f73000039b3, double:1.8980267744195736E-307)
            boolean r0 = X.C1AD.A06(r5, r0)
            if (r0 == 0) goto L79
            r10 = 0
            boolean r13 = r19.booleanValue()
            r12 = r10
            X.FBG.A00(r7, r8, r9, r10, r11, r12, r13)
        L79:
            if (r16 == 0) goto Lab
            java.lang.String r1 = r8.getModuleName()
            java.lang.String r0 = "caa_login_save_credentials"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La7
            r0 = 179(0xb3, float:2.51E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La7
            r0 = 354(0x162, float:4.96E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto La7
            java.lang.String r0 = "caa_registration_save_credentials"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lab
        La7:
            r14.A0B(r8, r4, r3, r2)
            return
        Lab:
            r1 = 0
            r0 = 0
            r14.A0B(r1, r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83743oJ.A07(android.content.Context, X.0iw, X.0ll, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Iterable, boolean):void");
    }

    public final void A0A(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, Integer num, String str) {
        this.A00.remove(str);
        FBF.A00(interfaceC11380iw, abstractC12990ll, num, str, false);
        A0B(null, null, null, false);
    }

    /* JADX WARN: Failed to calculate best type for var: r8v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r8v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:78:0x019c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.nodes.InsnNode.getResult()" is null
    	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.collectRelatedVars(AbstractTypeConstraint.java:31)
    	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.<init>(AbstractTypeConstraint.java:19)
    	at jadx.core.dex.visitors.typeinference.TypeSearch$1.<init>(TypeSearch.java:376)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.makeMoveConstraint(TypeSearch.java:376)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.makeConstraint(TypeSearch.java:361)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.collectConstraints(TypeSearch.java:341)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:60)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x01af: MOVE (r0 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:431), block:B:81:0x01a8 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x01f6: INVOKE 
      (r8 I:X.0ll)
      (r9 I:java.lang.Integer)
      (r10 I:java.lang.String)
      (r11 I:java.lang.String)
      (r12 I:java.lang.String)
      (r13 I:java.lang.String)
      (r14 I:java.lang.String)
      (r15 I:java.util.HashMap)
     STATIC call: X.3oK.A00(X.0ll, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap):void A[MD:(X.0ll, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap):void (m)] (LINE:502), block:B:87:0x01f6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.0ll] */
    public final void A0B(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, Iterable iterable, boolean z) {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        AbstractC12990ll A00;
        ?? r8;
        Integer num2;
        String str5;
        String str6;
        String str7;
        String str8;
        try {
            ArrayList<C83803oP> arrayList = new ArrayList(this.A00.values());
            HashSet hashSet = new HashSet();
            hashSet.addAll(C17280tP.A00().A09());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C83803oP c83803oP = (C83803oP) it.next();
                hashSet.remove(c83803oP.A06);
                hashSet.remove(c83803oP.A07);
            }
            C17280tP.A00().A0H(hashSet);
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            C16V.A03(A0A, "user_info_list");
            for (C83803oP c83803oP2 : arrayList) {
                if (c83803oP2 != null) {
                    A0A.A0d();
                    A0A.A0T("upsell_seen_before", c83803oP2.A0B);
                    A0A.A0T("allow_non_fb_sso", c83803oP2.A08);
                    A0A.A0T("rejected_sso_upsell", c83803oP2.A0A);
                    String str9 = c83803oP2.A06;
                    if (str9 != null) {
                        A0A.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str9);
                    }
                    String str10 = c83803oP2.A05;
                    if (str10 != null) {
                        A0A.A0S("login_nonce", str10);
                    }
                    String str11 = c83803oP2.A03;
                    if (str11 != null) {
                        A0A.A0S("login_token", str11);
                    }
                    String str12 = c83803oP2.A07;
                    if (str12 != null) {
                        A0A.A0S(AbstractC37314GcG.A01(43, 8, 86), str12);
                    }
                    if (c83803oP2.A02 != null) {
                        A0A.A0r("profile_pic_url");
                        AbstractC222616c.A01(A0A, c83803oP2.A02);
                    }
                    A0A.A0R("last_logout_timestamp", c83803oP2.A01);
                    A0A.A0R("login_token_update_timestamp", c83803oP2.A00);
                    A0A.A0T("is_fx_sso", c83803oP2.A09);
                    String str13 = c83803oP2.A04;
                    if (str13 != null) {
                        A0A.A0S("is_app_level_spi", str13);
                    }
                    A0A.A0a();
                }
            }
            A0A.A0Z();
            A0A.A0a();
            A0A.close();
            String obj = stringWriter.toString();
            InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
            ARD.E7K("one_tap_login_user_map", obj);
            ARD.apply();
            if (z && abstractC12990ll != null && interfaceC11380iw != null) {
                HashMap hashMap = new HashMap();
                if (iterable != null) {
                    hashMap.put("uid", iterable.toString());
                }
                String moduleName = interfaceC11380iw.getModuleName();
                switch (moduleName.hashCode()) {
                    case 200821380:
                        if (moduleName.equals("caa_registration_save_credentials")) {
                            C34973Fay.A00(abstractC12990ll, "ntf", "password_saving", "password_saving_success", null, null);
                            return;
                        }
                        return;
                    case 293415587:
                        if (moduleName.equals(AbstractC111324zv.A00(179))) {
                            C83753oK.A00(abstractC12990ll, C05F.A01, "logout_password_saving_multiaccount_opt_in_successful", "logout_spi", "spi", "logout_interaction", null, hashMap);
                            return;
                        }
                        return;
                    case 1985400354:
                        if (moduleName.equals(AbstractC111324zv.A00(354))) {
                            num2 = C05F.A01;
                            str5 = "logout_password_saving_opt_in_successful";
                            str6 = "logout_spi";
                            str7 = "spi";
                            str8 = "logout_interaction";
                            break;
                        } else {
                            return;
                        }
                    case 2122863948:
                        if (moduleName.equals("caa_login_save_credentials")) {
                            num2 = C05F.A01;
                            str5 = "login_password_saving_opt_in_successful";
                            str6 = "login_spi";
                            str7 = "spi";
                            str8 = "home_page";
                            break;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
                C83753oK.A00(abstractC12990ll, num2, str5, str6, str7, str8, null, null);
            }
        } catch (IOException unused) {
            if (z && abstractC12990ll != null && interfaceC11380iw != null) {
                HashMap hashMap2 = new HashMap();
                if (iterable != null) {
                    hashMap2.put("uid", iterable.toString());
                }
                String moduleName2 = interfaceC11380iw.getModuleName();
                switch (moduleName2.hashCode()) {
                    case 200821380:
                        if (!moduleName2.equals("caa_registration_save_credentials")) {
                            return;
                        }
                        C34973Fay.A00(r8, "ntf", "password_saving", "password_saving_failure", "Couldn't write to disk", null);
                        return;
                    case 293415587:
                        if (!moduleName2.equals(AbstractC111324zv.A00(179))) {
                            return;
                        }
                        num = C05F.A01;
                        str = "logout_password_saving_multiaccount_opt_in_failed";
                        str2 = "logout_spi";
                        str3 = "spi";
                        str4 = "logout_interaction";
                        C83753oK.A00(A00, num, str, str2, str3, str4, "Couldn't write to disk", hashMap2);
                        return;
                    case 1985400354:
                        if (!moduleName2.equals(AbstractC111324zv.A00(354))) {
                            return;
                        }
                        num = C05F.A01;
                        str = "logout_password_saving_opt_in_failed";
                        str2 = "logout_spi";
                        str3 = "spi";
                        str4 = "logout_interaction";
                        hashMap2 = null;
                        C83753oK.A00(A00, num, str, str2, str3, str4, "Couldn't write to disk", hashMap2);
                        return;
                    case 2122863948:
                        if (!moduleName2.equals("caa_login_save_credentials")) {
                            return;
                        }
                        num = C05F.A01;
                        str = "login_password_saving_opt_in_failed";
                        str2 = "login_spi";
                        str3 = "spi";
                        str4 = "home_page";
                        hashMap2 = null;
                        C83753oK.A00(A00, num, str, str2, str3, str4, "Couldn't write to disk", hashMap2);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public final void A0E(C83803oP c83803oP) {
        this.A00.put(c83803oP.A06, c83803oP);
        A0B(null, null, null, false);
    }

    public final void A0G(String str) {
        if (this.A00.containsKey(str)) {
            C83803oP c83803oP = (C83803oP) this.A00.get(str);
            c83803oP.A05 = null;
            c83803oP.A03 = null;
            c83803oP.A00 = -1L;
            A0B(null, null, null, false);
        }
    }

    public final boolean A0I() {
        Iterator it = this.A00.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C83803oP) ((Map.Entry) it.next()).getValue()).A08) {
                i++;
            }
        }
        if (i >= 5) {
            return false;
        }
        return true;
    }

    public final boolean A0J(String str) {
        if (this.A00.containsKey(str) && ((C83803oP) this.A00.get(str)).A08 && ((C83803oP) this.A00.get(str)).A04.equals("APP_LEVEL_SPI_YES")) {
            return true;
        }
        return false;
    }

    public final boolean A0K(String str) {
        if (this.A00.containsKey(str) && ((C83803oP) this.A00.get(str)).A08) {
            return true;
        }
        return false;
    }

    public final boolean A0L(String str) {
        if (this.A00.containsKey(str) && ((C83803oP) this.A00.get(str)).A0B) {
            return true;
        }
        return false;
    }

    public final boolean A0M(String str) {
        if (this.A00.containsKey(str) && ((C83803oP) this.A00.get(str)).A0A) {
            return true;
        }
        return false;
    }

    public final boolean A0N(String str) {
        if (this.A00.containsKey(str) && ((C83803oP) this.A00.get(str)).A08 && ((C83803oP) this.A00.get(str)).A05 == null) {
            return true;
        }
        return false;
    }

    public final ArrayList A06(AbstractC12990ll abstractC12990ll) {
        ArrayList A05 = A05();
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            if (C0BQ.A00(abstractC12990ll).CPH(((C83803oP) it.next()).A06)) {
                it.remove();
            }
        }
        return A05;
    }

    public final void A08(Context context, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, Boolean bool, Boolean bool2, Integer num, String str, boolean z) {
        A07(context, interfaceC11380iw, abstractC12990ll, bool, bool2, num, Collections.singleton(str), z);
    }

    public final void A09(Context context, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, Integer num, String str, boolean z) {
        A07(context, interfaceC11380iw, abstractC12990ll, Boolean.valueOf(A0J(str)), false, num, Collections.singleton(str), z);
    }

    public final void A0C(AbstractC12990ll abstractC12990ll) {
        List<C83803oP> A03 = A03();
        HashMap hashMap = new HashMap();
        if (A03 != null) {
            ArrayList arrayList = new ArrayList();
            for (C83803oP c83803oP : A03) {
                if (c83803oP != null && (c83803oP.A0A || !c83803oP.A08 || C0BQ.A00(abstractC12990ll).CPH(c83803oP.A06) || (!TextUtils.isEmpty(c83803oP.A05) && !TextUtils.isEmpty(c83803oP.A07) && !TextUtils.isEmpty(c83803oP.A06)))) {
                    hashMap.put(c83803oP.A06, c83803oP);
                } else {
                    arrayList.add(c83803oP);
                }
            }
        }
        if (!hashMap.isEmpty()) {
            this.A00 = hashMap;
        }
    }

    public final void A0D(UserSession userSession, String str) {
        if (A04(str).booleanValue()) {
            AnonymousClass253 A00 = AnonymousClass252.A00(userSession);
            CallerContext.A02("OneTapLoginUserHelper");
            if (A00.A01) {
                C83803oP A022 = A02(this, str);
                A022.A04 = "APP_LEVEL_SPI_YES";
                A0E(A022);
            }
        }
    }

    public final void A0F(User user) {
        String str;
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            C83803oP c83803oP = (C83803oP) it.next();
            String str2 = c83803oP.A06;
            str2.getClass();
            if (str2.equals(user.getId()) && (str = c83803oP.A05) != null) {
                A0E(new C83803oP(user, str));
            }
        }
    }

    public final void A0H(String str) {
        C83803oP A022 = A02(this, str);
        A022.A0B = true;
        this.A00.put(str, A022);
        A0B(null, null, null, false);
    }
}
