package X;

import androidx.fragment.app.Fragment;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.ItemDetails;
import com.facebookpay.expresscheckout.models.KnownData;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.logging.LoggingContext;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class UFU extends AbstractC52922bZ {
    public ECPHandler A00;
    public UFM A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public C63406Sjd A06;
    public final C2GT A07;
    public final C2GT A08;
    public final C58252li A09;
    public final C58252li A0A;
    public final C58252li A0B;
    public final C58252li A0C;
    public final C2GS A0D;
    public final C2GS A0E = new C2GS();
    public final C2GS A0F = new C2GS();
    public final C2GS A0G;
    public final C2GS A0H;
    public final C2GS A0I;
    public final C2GS A0J;
    public final InterfaceC58362lv A0K;
    public final InterfaceC58362lv A0L;
    public final InterfaceC58362lv A0M;
    public final InterfaceC58362lv A0N;
    public final InterfaceC58362lv A0O;
    public final WDV A0P;
    public final UFP A0Q;
    public final LoggingContext A0R;
    public final UFS A0S;
    public final Map A0T;

    public final void A08(C07X c07x, LoggingContext loggingContext, Integer num) {
        String str;
        C14360o3.A0B(num, 1);
        if (num == C05F.A00) {
            C2FP.A01().A04.A0V(loggingContext, "nux_checkout", UFS.A01(this.A0S));
        }
        ECPHandler eCPHandler = this.A00;
        if (eCPHandler != null) {
            C2GS c2gs = this.A0H;
            Object A02 = c2gs.A02();
            if (A02 != null) {
                String str2 = ((ECPPaymentRequest) A02).A0A;
                Object A022 = c2gs.A02();
                if (A022 != null) {
                    String str3 = ((ECPPaymentRequest) A022).A08;
                    Object A023 = c2gs.A02();
                    if (A023 != null) {
                        String str4 = ((ECPPaymentRequest) A023).A07;
                        Object A024 = c2gs.A02();
                        if (A024 != null) {
                            PaymentReceiverInfo paymentReceiverInfo = ((ECPPaymentRequest) A024).A05;
                            if (paymentReceiverInfo != null) {
                                str = paymentReceiverInfo.A02;
                            } else {
                                str = null;
                            }
                            eCPHandler.CJa(new SIL(this.A0S.A04(null, true), str2, str3, str4, str), loggingContext, num);
                            ECPRepositoryImpl eCPRepositoryImpl = C2FP.A01().A08;
                            eCPRepositoryImpl.A00.A05(c07x);
                            eCPRepositoryImpl.A00 = new C2GS();
                            this.A0P.A09.A08(this.A0O);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [X.2GT, X.2li] */
    public UFU(UFP ufp, LoggingContext loggingContext, UFS ufs) {
        this.A0R = loggingContext;
        this.A0S = ufs;
        this.A0Q = ufp;
        WDV wdv = new WDV();
        this.A0P = wdv;
        this.A07 = wdv.A08;
        this.A0D = new C2GS();
        this.A0T = AbstractC06930Yk.A06(WDM.A00(EnumC129485tD.A0B, false), WDM.A00(EnumC129485tD.A0L, false), WDM.A00(EnumC129485tD.A0C, false), WDM.A00(EnumC129485tD.A0K, false), WDM.A00(EnumC129485tD.A0J, false), WDM.A00(EnumC129485tD.A0D, false), WDM.A00(EnumC129485tD.A05, false));
        this.A0H = new C2GS();
        C58252li c58252li = new C58252li();
        this.A09 = c58252li;
        C58252li c58252li2 = new C58252li();
        this.A0A = c58252li2;
        this.A0C = new C58252li();
        this.A0I = new C2GS();
        this.A0J = new C2GS();
        this.A0G = new C2GS();
        CurrencyAmount currencyAmount = new CurrencyAmount("", "");
        CurrencyAmount currencyAmount2 = new CurrencyAmount("", "");
        VG3 vg3 = VG3.A0g;
        C16930sl c16930sl = C16930sl.A00;
        C63406Sjd A03 = C63406Sjd.A03(new PuxOrderSummaryItem(currencyAmount, currencyAmount2, vg3, new ItemDetails(C05F.A00, null), null, null, c16930sl, 0, false, false, false));
        this.A06 = A03;
        VG3 vg32 = VG3.A0Q;
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        ?? c2gt = new C2GT(C63406Sjd.A03(new PuxAccordionItem(vg32, null, A03, c16930sl, false)));
        c2gt.A00 = new C58336PtW();
        this.A0B = c2gt;
        this.A08 = wdv.A0A;
        C63406Sjd.A0D(c58252li2, null);
        C63406Sjd.A0C(c58252li, Integer.valueOf(A00(this)));
        C2FP.A01().A08.A00.A09(new C65991Txk(3, new X59(this, 0)));
        this.A0N = new C70302WQh(this, 9);
        this.A0K = new C70302WQh(this, 5);
        this.A0M = new C70302WQh(this, 7);
        this.A0L = new C70302WQh(this, 6);
        this.A0O = new C70302WQh(this, 10);
    }

    public static final int A00(UFU ufu) {
        EnumC72407Xcu enumC72407Xcu;
        R1R r1r = (R1R) ufu.A0F.A02();
        if (r1r != null) {
            enumC72407Xcu = WGr.A0D(r1r);
        } else {
            enumC72407Xcu = null;
        }
        if (enumC72407Xcu != EnumC72407Xcu.A06) {
            return 2131961466;
        }
        return 2131961506;
    }

    public static final C70072W1p A01(UFU ufu, UvM uvM, int i) {
        ECPPaymentConfiguration eCPPaymentConfiguration;
        KnownData knownData;
        String str;
        int indexOf;
        String str2;
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) ufu.A0H.A02();
        if (eCPPaymentRequest == null || (eCPPaymentConfiguration = eCPPaymentRequest.A03) == null || (knownData = eCPPaymentConfiguration.A01) == null) {
            return null;
        }
        List A00 = W6Y.A00();
        boolean z = ufu.A05;
        boolean z2 = ufu.A03;
        boolean z3 = ufu.A02;
        BFI bfi = new BFI(i, 2, ufu, uvM);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        str = VNJ.A00(knownData, null, true, true);
                        str2 = VNJ.A00(knownData, null, false, false);
                        indexOf = A00.indexOf(EnumC129485tD.A0J);
                    } else {
                        throw new IllegalStateException("Incorrectly attempting to autofill a cell that is not supported");
                    }
                } else {
                    str = knownData.A02;
                    str2 = VNJ.A00(knownData, null, true, false);
                    indexOf = A00.indexOf(EnumC129485tD.A0J);
                }
            } else {
                str = knownData.A01;
                if (z) {
                    str2 = knownData.A03;
                } else {
                    str2 = null;
                }
                indexOf = A00.indexOf(EnumC129485tD.A05);
            }
        } else {
            if (z) {
                str = knownData.A03;
            } else {
                str = null;
            }
            indexOf = A00.indexOf(EnumC129485tD.A05);
            str2 = null;
        }
        if (str == null) {
            return null;
        }
        int size = A00.size();
        for (int i2 = indexOf + 1; i2 < size; i2++) {
            int ordinal = ((EnumC129485tD) A00.get(i2)).ordinal();
            if (ordinal != 6) {
                if (ordinal == 28 && z3) {
                    str2 = VNJ.A00(knownData, str2, true, false);
                }
            } else if (z || z2) {
                StringBuilder sb = new StringBuilder();
                if (str2 != null) {
                    sb.append(str2);
                }
                String str3 = knownData.A01;
                String str4 = ",\n";
                str2 = null;
                if (str3 != null && z2) {
                    if (sb.length() > 0) {
                        sb.append(",\n");
                    }
                    sb.append(str3);
                }
                String str5 = knownData.A03;
                if (str5 != null && z) {
                    if (str3 != null) {
                        str4 = " · ";
                    } else if (sb.length() <= 0) {
                        str4 = "";
                    }
                    sb.append(str4);
                    sb.append(str5);
                }
                if (sb.length() > 0) {
                    str2 = sb.toString();
                }
            }
        }
        R8V r8v = new R8V(str, str2, null, null);
        ((SBi) r8v).A00 = bfi;
        return new C70072W1p(new Wai(ufu, i), AbstractC16960so.A1Q(new R8T(), r8v));
    }

    public static final void A02(UFU ufu) {
        String str;
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) ufu.A0H.A02();
        if (eCPPaymentRequest != null) {
            UFP ufp = ufu.A0Q;
            PaymentReceiverInfo paymentReceiverInfo = eCPPaymentRequest.A05;
            if (paymentReceiverInfo != null) {
                str = paymentReceiverInfo.A02;
            } else {
                str = null;
            }
            ufp.A08(WGr.A04(null, eCPPaymentRequest, null, str, eCPPaymentRequest.A09, "REGULAR"), ufu.A0R);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r1 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.UFU r22, X.C63406Sjd r23) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UFU.A03(X.UFU, X.Sjd):void");
    }

    public static final boolean A04(UFU ufu) {
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) ufu.A0H.A02();
        if (eCPPaymentRequest != null && (checkoutConfiguration = eCPPaymentRequest.A01) != null && checkoutConfiguration.A0H.contains(VDD.A08)) {
            return true;
        }
        return false;
    }

    public final C2GS A05(Fragment fragment) {
        String str;
        PaymentReceiverInfo paymentReceiverInfo;
        String str2 = null;
        C63406Sjd.A0D(this.A09, null);
        Be9 be9 = new Be9();
        C0CA.A00(be9.A02(), AbstractC166997dE.A0a(), "is_p2p_receiver");
        be9.A07(this.A0R.A02, "logging_id");
        be9.A07(String.valueOf(AbstractC62320S6q.A00.getAndIncrement()), "login_ref_id");
        be9.A07("ECP", "payment_type");
        C2GS c2gs = this.A0H;
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) c2gs.A02();
        if (eCPPaymentRequest != null && (paymentReceiverInfo = eCPPaymentRequest.A05) != null) {
            str = paymentReceiverInfo.A02;
        } else {
            str = null;
        }
        be9.A07(str, "receiver_id");
        ECPPaymentRequest eCPPaymentRequest2 = (ECPPaymentRequest) c2gs.A02();
        if (eCPPaymentRequest2 != null) {
            str2 = eCPPaymentRequest2.A08;
        }
        be9.A07(str2, "product_id");
        C63406Sjd.A0A(fragment, C2FP.A01().A02().A00(be9), new C70307WQn(1, fragment, this));
        return this.A0I;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(android.util.SparseArray r34, X.C07X r35) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UFU.A07(android.util.SparseArray, X.07X):void");
    }

    public final void A09(ECPHandler eCPHandler) {
        if (eCPHandler != null) {
            ECPHandler eCPHandler2 = this.A00;
            if (eCPHandler2 != null && !eCPHandler2.equals(eCPHandler)) {
                throw new IllegalStateException("Cannot override previous ECP handler with a new handler for the same checkout ViewModel instance");
            }
            if (!C14360o3.A0K(this.A00, eCPHandler)) {
                WDV wdv = this.A0P;
                C2GS F8A = eCPHandler.F8A();
                C14360o3.A0B(F8A, 0);
                wdv.A08.A0E(F8A, wdv.A0B);
            }
            this.A00 = eCPHandler;
            return;
        }
        throw new IllegalStateException("Attempting to set null value for EcpHandler. This will result in lossy event-handling behavior");
    }

    public final boolean A0B() {
        CheckoutConfiguration checkoutConfiguration;
        Integer num;
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) this.A0H.A02();
        if (eCPPaymentRequest != null && (checkoutConfiguration = eCPPaymentRequest.A01) != null && AbstractC166997dE.A1Z(checkoutConfiguration.A05, true)) {
            if (!this.A0S.A02) {
                return false;
            }
            if (A0D()) {
                num = C05F.A00;
            } else {
                num = C05F.A0N;
            }
            if (num != C05F.A00) {
                return false;
            }
            return true;
        }
        return this.A0S.A02;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List A06() {
        /*
            r5 = this;
            java.util.List r0 = X.W6Y.A00()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r0.iterator()
        Ld:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.5tD r0 = (X.EnumC129485tD) r0
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 1: goto L42;
                case 6: goto L60;
                case 17: goto L26;
                case 28: goto L5d;
                case 29: goto L2b;
                case 33: goto L6b;
                default: goto L22;
            }
        L22:
            r3.add(r2)
            goto Ld
        L26:
            boolean r0 = r5.A0B()
            goto L6f
        L2b:
            X.2GS r0 = r5.A0H
            java.lang.Object r0 = r0.A02()
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            if (r0 == 0) goto Ld
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto Ld
            java.util.Set<X.VDD> r1 = r0.A0H
            X.VDD r0 = X.VDD.A06
            boolean r0 = r1.contains(r0)
            goto L6f
        L42:
            boolean r0 = r5.A0A()
            if (r0 == 0) goto Ld
            X.2GS r0 = r5.A0H
            java.lang.Object r0 = r0.A02()
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            if (r0 == 0) goto Ld
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto Ld
            java.lang.Boolean r0 = r0.A05
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r1)
            goto L6f
        L5d:
            boolean r0 = r5.A02
            goto L6f
        L60:
            boolean r0 = r5.A03
            if (r0 != 0) goto L22
            boolean r0 = r5.A05
            if (r0 != 0) goto L22
            boolean r0 = r5.A04
            goto L6f
        L6b:
            boolean r0 = r5.A0C()
        L6f:
            if (r0 == 0) goto Ld
            goto L22
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UFU.A06():java.util.List");
    }

    public final boolean A0A() {
        Integer num;
        if (A0D()) {
            num = C05F.A00;
        } else {
            num = C05F.A0N;
        }
        if (num == C05F.A0N) {
            return true;
        }
        return false;
    }

    public final boolean A0C() {
        Integer num;
        Integer num2;
        if (A0D()) {
            num = C05F.A00;
        } else {
            num = C05F.A0N;
        }
        if (num != C05F.A00) {
            return false;
        }
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) this.A0H.A02();
        if (eCPPaymentRequest != null) {
            num2 = eCPPaymentRequest.A04.A09.A01;
        } else {
            num2 = null;
        }
        if (num2 == C05F.A01) {
            C2FP.A0D();
            return true;
        }
        return !A0B();
    }

    public final boolean A0D() {
        java.util.Set set;
        java.util.Set set2;
        CheckoutConfiguration checkoutConfiguration;
        CheckoutConfiguration checkoutConfiguration2;
        ECPRepositoryImpl eCPRepositoryImpl = C2FP.A01().A08;
        C2GS c2gs = this.A0H;
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) c2gs.A02();
        if (eCPPaymentRequest != null && (checkoutConfiguration2 = eCPPaymentRequest.A01) != null) {
            set = checkoutConfiguration2.A0H;
        } else {
            set = C16910sj.A00;
        }
        ECPPaymentRequest eCPPaymentRequest2 = (ECPPaymentRequest) c2gs.A02();
        if (eCPPaymentRequest2 != null && (checkoutConfiguration = eCPPaymentRequest2.A01) != null) {
            set2 = checkoutConfiguration.A0I;
        } else {
            set2 = C16910sj.A00;
        }
        Object A02 = c2gs.A02();
        if (A02 != null) {
            return eCPRepositoryImpl.A07(((ECPPaymentRequest) A02).A08, set, set2);
        }
        throw AbstractC166997dE.A0g();
    }
}
