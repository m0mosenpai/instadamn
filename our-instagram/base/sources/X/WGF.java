package X;

import com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public abstract class WGF {
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0113, code lost:
    
        if (r3 != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r1.A0J == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00bb, code lost:
    
        if (r0 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0099, code lost:
    
        if (r0 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0077, code lost:
    
        if (r0 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0057, code lost:
    
        if (r0 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r0 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r0 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (r9.contains(X.VD7.A03) != true) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        if (r0 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        if (r9.contains(X.VD7.A05) != true) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
    
        if (r0 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
    
        if (((X.T2N) r3.A08.getValue()).A0C(r6, null) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011b, code lost:
    
        if (r0 != null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0142, code lost:
    
        if (r0 != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014e, code lost:
    
        if (r8 != false) goto L111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(com.facebookpay.expresscheckout.models.ECPPaymentRequest r16, X.UFX r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGF.A00(com.facebookpay.expresscheckout.models.ECPPaymentRequest, X.UFX, boolean):java.lang.String");
    }

    public static final void A02(ECPPaymentResponseParams eCPPaymentResponseParams, UFX ufx, C63406Sjd c63406Sjd, String str) {
        PaymentMethod paymentMethod;
        C14360o3.A0B(eCPPaymentResponseParams, 3);
        PuxPaymentMethodItem puxPaymentMethodItem = (PuxPaymentMethodItem) ufx.A0N.A01;
        if (puxPaymentMethodItem != null && (paymentMethod = puxPaymentMethodItem.A01) != null) {
            C70199WGm.A09(c63406Sjd, new ME8(eCPPaymentResponseParams, ufx, paymentMethod, str, 2), new MIO(eCPPaymentResponseParams, ufx, c63406Sjd, paymentMethod, str, 7));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A04(UFX ufx, String str, String str2) {
        Long l;
        C69074VhP c69074VhP;
        PaymentMethod paymentMethod;
        String AtA;
        C14360o3.A0B(ufx, 0);
        Wap wap = C2FP.A01().A03;
        LoggingContext loggingContext = ufx.A1P;
        EnumC72407Xcu enumC72407Xcu = EnumC72407Xcu.A02;
        C63406Sjd c63406Sjd = (C63406Sjd) ufx.A1R.A08.A02();
        if (c63406Sjd != null && (c69074VhP = (C69074VhP) c63406Sjd.A01) != null && (paymentMethod = (PaymentMethod) c69074VhP.A01) != null && (AtA = paymentMethod.AtA()) != null) {
            l = AbstractC25228BEl.A13(AtA);
        } else {
            l = null;
        }
        LinkedHashMap A0o = AbstractC65702TsY.A0o(loggingContext);
        AbstractC65703TsZ.A1N(l, "TARGET_NAME", str2, A0o);
        Wap.A09(wap, "CREDENTIAL_TYPE", enumC72407Xcu, str, A0o);
    }

    public static final void A05(UFX ufx, Throwable th, boolean z) {
        WDM wdm = (WDM) ufx.A1Y.get(EnumC129485tD.A0B);
        if (z) {
            if (wdm != null) {
                wdm.A03(new X59(ufx, 11));
            }
        } else {
            if (wdm == null) {
                return;
            }
            wdm.A01(new C57533Pg7(32, th, ufx));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (X.C14360o3.A0K(r0, true) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.UFX r3, java.lang.Throwable r4, boolean r5) {
        /*
            java.lang.Boolean r0 = r3.A0U
            r2 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            if (r0 != 0) goto L3e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r3.A0U = r0
            boolean r0 = X.C14360o3.A0K(r0, r1)
            if (r0 == 0) goto L2d
        L15:
            java.util.Map r1 = r3.A1Y
            X.5tD r0 = X.EnumC129485tD.A0C
            java.lang.Object r2 = r1.get(r0)
            X.WDM r2 = (X.WDM) r2
            if (r5 == 0) goto L31
            if (r2 == 0) goto L2d
            r1 = 13
            X.X59 r0 = new X.X59
            r0.<init>(r3, r1)
            r2.A03(r0)
        L2d:
            r3.A0i()
            return
        L31:
            if (r2 == 0) goto L2d
            r1 = 34
            X.Pg7 r0 = new X.Pg7
            r0.<init>(r1, r4, r3)
            r2.A01(r0)
            goto L2d
        L3e:
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L47
            if (r5 != 0) goto L47
            r2 = 0
        L47:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r3.A0U = r0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGF.A06(X.UFX, java.lang.Throwable, boolean):void");
    }

    public static final void A07(UFX ufx, Throwable th, boolean z, boolean z2) {
        Wap wap = C2FP.A01().A04;
        LoggingContext loggingContext = ufx.A1P;
        C70073W1q A05 = ufx.A1Q.A05();
        Boolean valueOf = Boolean.valueOf(z2);
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C70199WGm.A08(A05, linkedHashMap);
            if (valueOf != null) {
                linkedHashMap.put("is_partial_pux", String.valueOf(valueOf.booleanValue()));
            }
            Wap.A02(new C25531Mh(MSY.A0H(wap.A00, "client_load_ecpcheckout_success"), 57), loggingContext, linkedHashMap, "pux_checkout", 26);
            return;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C70199WGm.A08(A05, linkedHashMap2);
        if (th != null) {
            linkedHashMap2.put("error_message", C2Ql.A00(th));
        }
        if (valueOf != null) {
            linkedHashMap2.put("is_partial_pux", String.valueOf(valueOf.booleanValue()));
        }
        wap.A0Z(loggingContext, "pux_checkout", linkedHashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.VG3 r7, X.VG3 r8, X.UFX r9, java.lang.Boolean r10) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGF.A01(X.VG3, X.VG3, X.UFX, java.lang.Boolean):void");
    }

    public static final void A03(UFX ufx, String str) {
        Long l;
        C69074VhP c69074VhP;
        ShippingAddress shippingAddress;
        String str2;
        Wap wap = C2FP.A01().A04;
        LoggingContext loggingContext = ufx.A1P;
        C63406Sjd c63406Sjd = (C63406Sjd) ufx.A1U.A06.A02();
        if (c63406Sjd != null && (c69074VhP = (C69074VhP) c63406Sjd.A01) != null && (shippingAddress = (ShippingAddress) c69074VhP.A01) != null && (str2 = shippingAddress.A04) != null) {
            l = AbstractC25228BEl.A13(str2);
        } else {
            l = null;
        }
        wap.A0I(loggingContext, l, str, UFS.A01(ufx.A1Q));
    }
}
