package com.facebookpay.expresscheckout.repositoryimpl;

import X.AbstractC09440dt;
import X.C2GS;
import X.C2GT;
import X.C58252li;
import X.C62643SKa;
import X.C62735SOb;
import X.C63406Sjd;
import X.C67523UnN;
import X.C68700Vac;
import X.C69278Vkm;
import X.C69743Vud;
import X.C69744Vue;
import X.EnumC129485tD;
import X.InterfaceC09390do;
import X.T2M;
import X.T2N;
import X.T2O;
import X.W4C;
import X.X3h;
import X.X3i;
import X.X3j;
import android.util.LruCache;
import com.facebookpay.expresscheckout.api.executor.ECPCheckoutSetupMutationAPI;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class ECPRepositoryImpl {
    public C69278Vkm A01;
    public final C2GT A03;
    public final C58252li A04;
    public final C62643SKa A05 = new C62643SKa();
    public final ECPCheckoutSetupMutationAPI A0A = new ECPCheckoutSetupMutationAPI();
    public final InterfaceC09390do A09 = AbstractC09440dt.A01(X3j.A00);
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(X3h.A00);
    public final InterfaceC09390do A08 = AbstractC09440dt.A01(X3i.A00);
    public final C68700Vac A0B = new C68700Vac();
    public final W4C A06 = new W4C();
    public ArrayList A02 = new ArrayList();
    public C2GS A00 = new C2GS();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(com.facebookpay.expresscheckout.models.CheckoutConfiguration r18, com.facebookpay.logging.LoggingPolicy r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.util.List r24, X.InterfaceC23621Ds r25) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl.A04(com.facebookpay.expresscheckout.models.CheckoutConfiguration, com.facebookpay.logging.LoggingPolicy, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.1Ds):java.lang.Object");
    }

    public final boolean A06(String str) {
        C62735SOb c62735SOb = new C62735SOb(null, str);
        if (C63406Sjd.A0F(((T2M) this.A09.getValue()).A01(c62735SOb)) && C63406Sjd.A0F(((T2O) this.A07.getValue()).A07(c62735SOb)) && C63406Sjd.A0F(((T2N) this.A08.getValue()).A05(new C62735SOb(null, str)))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r21, com.facebookpay.logging.LoggingPolicy r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.List r28, X.InterfaceC23621Ds r29) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl.A01(com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl, com.facebookpay.logging.LoggingPolicy, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.1Ds):java.lang.Object");
    }

    public final boolean A05() {
        C67523UnN c67523UnN;
        ImmutableList A0E;
        C69278Vkm c69278Vkm = this.A01;
        if (c69278Vkm != null && (c67523UnN = c69278Vkm.A00) != null && (A0E = c67523UnN.A0E()) != null && A0E.contains(EnumC129485tD.A0A)) {
            return true;
        }
        return false;
    }

    public ECPRepositoryImpl() {
        C58252li c58252li = new C58252li();
        this.A04 = c58252li;
        this.A03 = c58252li;
    }

    public final C69278Vkm A02(String str, String str2) {
        if (str2.length() == 0) {
            return null;
        }
        C68700Vac c68700Vac = this.A0B;
        C69743Vud c69743Vud = new C69743Vud(str, str2);
        LruCache lruCache = c68700Vac.A00;
        C69744Vue c69744Vue = (C69744Vue) lruCache.get(c69743Vud);
        if (c69744Vue == null) {
            return null;
        }
        if (c69744Vue.A00 < System.currentTimeMillis() - 14400000) {
            lruCache.remove(c69743Vud);
            return null;
        }
        return c69744Vue.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (((X.T2N) r3.A08.getValue()).A0C(r1, null) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A07(java.lang.String r4, java.util.Set r5, java.util.Set r6) {
        /*
            r3 = this;
            X.AbstractC167017dG.A1N(r5, r6)
            r2 = 0
            X.SOb r1 = new X.SOb
            r1.<init>(r2, r4)
            X.VDD r0 = X.VDD.A0D
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L1f
            X.0do r0 = r3.A09
            java.lang.Object r0 = r0.getValue()
            X.T2M r0 = (X.T2M) r0
            boolean r0 = r0.A06(r1)
            if (r0 != 0) goto L70
        L1f:
            X.VD7 r0 = X.VD7.A04
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L35
            X.0do r0 = r3.A07
            java.lang.Object r0 = r0.getValue()
            X.T2O r0 = (X.T2O) r0
            boolean r0 = r0.A0G(r1)
            if (r0 != 0) goto L70
        L35:
            X.VD7 r0 = X.VD7.A03
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L4b
            X.0do r0 = r3.A07
            java.lang.Object r0 = r0.getValue()
            X.T2O r0 = (X.T2O) r0
            boolean r0 = r0.A0F(r1)
            if (r0 != 0) goto L70
        L4b:
            X.VD7 r0 = X.VD7.A05
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L61
            X.0do r0 = r3.A07
            java.lang.Object r0 = r0.getValue()
            X.T2O r0 = (X.T2O) r0
            boolean r0 = r0.A0H(r1)
            if (r0 != 0) goto L70
        L61:
            X.0do r0 = r3.A08
            java.lang.Object r0 = r0.getValue()
            X.T2N r0 = (X.T2N) r0
            boolean r1 = r0.A0C(r1, r2)
            r0 = 0
            if (r1 == 0) goto L71
        L70:
            r0 = 1
        L71:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl.A07(java.lang.String, java.util.Set, java.util.Set):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0462, code lost:
    
        if (r1.getCoercedBooleanField(0, "is_ecp_available") != true) goto L236;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010d A[Catch: Exception -> 0x0400, TryCatch #0 {Exception -> 0x0400, blocks: (B:17:0x00cc, B:19:0x00d2, B:21:0x00d8, B:23:0x00de, B:24:0x00e2, B:26:0x00e8, B:29:0x00fd, B:31:0x0101, B:32:0x0107, B:34:0x010d, B:36:0x0113, B:38:0x0125, B:76:0x0134, B:79:0x013b, B:82:0x0141), top: B:16:0x00cc }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x046e  */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.0ps] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [X.UnL] */
    /* JADX WARN: Type inference failed for: r4v18, types: [X.UWr, X.2JS] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(com.facebookpay.expresscheckout.handler.ECPHandler r44, com.facebookpay.expresscheckout.models.ECPPaymentRequest r45, com.facebookpay.expresscheckout.models.TransactionInfo r46, java.lang.String r47, java.util.List r48, X.InterfaceC23621Ds r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl.A03(com.facebookpay.expresscheckout.handler.ECPHandler, com.facebookpay.expresscheckout.models.ECPPaymentRequest, com.facebookpay.expresscheckout.models.TransactionInfo, java.lang.String, java.util.List, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0258, code lost:
    
        if (r11 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0253, code lost:
    
        if (r11 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x024e, code lost:
    
        if (r11 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0249, code lost:
    
        if (r11 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0244, code lost:
    
        if (r11 != null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028b A[Catch: Exception -> 0x0291, TRY_ENTER, TryCatch #0 {Exception -> 0x0291, blocks: (B:119:0x013d, B:121:0x0143, B:66:0x014d, B:68:0x015d, B:69:0x0162, B:116:0x028b, B:117:0x0290), top: B:118:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d A[Catch: Exception -> 0x0291, TRY_ENTER, TryCatch #0 {Exception -> 0x0291, blocks: (B:119:0x013d, B:121:0x0143, B:66:0x014d, B:68:0x015d, B:69:0x0162, B:116:0x028b, B:117:0x0290), top: B:118:0x013d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.facebookpay.expresscheckout.models.CheckoutConfiguration r19, com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r20, com.facebookpay.logging.LoggingPolicy r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.util.List r27, X.InterfaceC23621Ds r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl.A00(com.facebookpay.expresscheckout.models.CheckoutConfiguration, com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl, com.facebookpay.logging.LoggingPolicy, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.1Ds, boolean, boolean):java.lang.Object");
    }
}
