package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.locale.Country;
import com.facebook.common.locale.LocaleMember;
import com.facebook.forker.Process;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.models.ErrorDialogContent;
import com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutPuxLink;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.EmailOptInItem;
import com.facebookpay.common.recyclerview.adapteritems.IncentiveItem;
import com.facebookpay.common.recyclerview.adapteritems.IncentiveSummaryItem;
import com.facebookpay.common.recyclerview.adapteritems.InlineBackButtonItem;
import com.facebookpay.common.recyclerview.adapteritems.InvisibleHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.PayButtonItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxBannerItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxOrderSummaryItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxTermsConditionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPickupFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionTextViewItem;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.ItemDetails;
import com.facebookpay.expresscheckout.models.PickupInfo;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.incentives.model.IncentiveCredentialList;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.otc.models.OtcOptionState;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.facebookpay.paymentmethod.model.TokenizedCard;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class UFX extends AbstractC52922bZ {
    public C2GT A00;
    public C2GS A01;
    public VG3 A02;
    public C69524Vqo A03;
    public C69588Vrr A04;
    public ECPHandler A05;
    public W4G A06;
    public C63406Sjd A07;
    public C63406Sjd A08;
    public C63406Sjd A09;
    public C63406Sjd A0A;
    public C63406Sjd A0B;
    public C63406Sjd A0C;
    public C63406Sjd A0D;
    public C63406Sjd A0E;
    public C63406Sjd A0F;
    public C63406Sjd A0G;
    public C63406Sjd A0H;
    public C63406Sjd A0I;
    public C63406Sjd A0J;
    public C63406Sjd A0K;
    public C63406Sjd A0L;
    public C63406Sjd A0M;
    public C63406Sjd A0N;
    public C63406Sjd A0O;
    public C63406Sjd A0P;
    public C63406Sjd A0Q;
    public C63406Sjd A0R;
    public C63406Sjd A0S;
    public Boolean A0T;
    public Boolean A0U;
    public String A0V;
    public String A0W;
    public List A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public C63406Sjd A0f;
    public C63406Sjd A0g;
    public C63406Sjd A0h;
    public C63406Sjd A0i;
    public Boolean A0j;
    public String A0k;
    public Map A0l;
    public boolean A0m;
    public final C2GT A0n;
    public final C2GT A0o;
    public final C2GT A0p;
    public final C58252li A0q;
    public final C58252li A0r;
    public final C2GS A0s;
    public final C2GS A0t;
    public final C2GS A0u;
    public final C2GS A0v;
    public final C2GS A0w;
    public final C2GS A0x;
    public final C2GS A0y;
    public final C2GS A0z;
    public final C2GS A10;
    public final C2GS A11;
    public final InterfaceC58362lv A12;
    public final InterfaceC58362lv A13;
    public final InterfaceC58362lv A14;
    public final InterfaceC58362lv A15;
    public final InterfaceC58362lv A16;
    public final InterfaceC58362lv A17;
    public final InterfaceC58362lv A18;
    public final InterfaceC58362lv A19;
    public final InterfaceC58362lv A1A;
    public final InterfaceC58362lv A1B;
    public final InterfaceC58362lv A1C;
    public final InterfaceC58362lv A1D;
    public final InterfaceC58362lv A1E;
    public final InterfaceC58362lv A1F;
    public final InterfaceC58362lv A1G;
    public final InterfaceC58362lv A1H;
    public final InterfaceC58362lv A1I;
    public final InterfaceC58362lv A1J;
    public final C66393UFe A1K;
    public final UFC A1L;
    public final WDV A1M;
    public final C66390UFb A1N;
    public final UFP A1O;
    public final LoggingContext A1P;
    public final UFS A1Q;
    public final C66392UFd A1R;
    public final Q8g A1S;
    public final C66389UFa A1T;
    public final C66391UFc A1U;
    public final UFG A1V;
    public final C63406Sjd A1W;
    public final LinkedHashMap A1X;
    public final Map A1Y;
    public final InterfaceC58362lv A1Z;
    public final InterfaceC58362lv A1a;
    public final InterfaceC58362lv A1b;
    public final List A1c;

    public static final void A0R(UFX ufx, boolean z) {
        PuxShippingAddressItem puxShippingAddressItem;
        PuxPaymentMethodItem puxPaymentMethodItem;
        PuxContactItem puxContactItem;
        PuxFulfillmentOptionItem puxFulfillmentOptionItem;
        PuxContactItem puxContactItem2;
        AnonCheckoutPuxLink anonCheckoutPuxLink;
        EmailOptInItem emailOptInItem;
        PuxTermsConditionItem puxTermsConditionItem;
        PuxBannerItem puxBannerItem;
        PuxOrderSummaryItem puxOrderSummaryItem;
        C63406Sjd c63406Sjd;
        MSX.A1B(ufx.A0v, z);
        C63406Sjd c63406Sjd2 = ufx.A0Q;
        PuxShippingAddressItem puxShippingAddressItem2 = (PuxShippingAddressItem) c63406Sjd2.A01;
        C63406Sjd c63406Sjd3 = null;
        if (puxShippingAddressItem2 != null) {
            puxShippingAddressItem = new PuxShippingAddressItem(puxShippingAddressItem2.A00, puxShippingAddressItem2.A01, puxShippingAddressItem2.A03, puxShippingAddressItem2.A02, puxShippingAddressItem2.A04, z);
        } else {
            puxShippingAddressItem = null;
        }
        ufx.A0Q = C63406Sjd.A02(c63406Sjd2, puxShippingAddressItem);
        C63406Sjd c63406Sjd4 = ufx.A0N;
        PuxPaymentMethodItem puxPaymentMethodItem2 = (PuxPaymentMethodItem) c63406Sjd4.A01;
        if (puxPaymentMethodItem2 != null) {
            puxPaymentMethodItem = new PuxPaymentMethodItem(puxPaymentMethodItem2.A00, puxPaymentMethodItem2.A01, puxPaymentMethodItem2.A02, z, puxPaymentMethodItem2.A04);
        } else {
            puxPaymentMethodItem = null;
        }
        ufx.A0N = C63406Sjd.A02(c63406Sjd4, puxPaymentMethodItem);
        C63406Sjd c63406Sjd5 = ufx.A0I;
        PuxContactItem puxContactItem3 = (PuxContactItem) c63406Sjd5.A01;
        if (puxContactItem3 != null) {
            puxContactItem = new PuxContactItem(puxContactItem3.A00, puxContactItem3.A01, puxContactItem3.A03, puxContactItem3.A04, puxContactItem3.A05, puxContactItem3.A06, puxContactItem3.A02, z);
        } else {
            puxContactItem = null;
        }
        ufx.A0I = C63406Sjd.A02(c63406Sjd5, puxContactItem);
        C63406Sjd c63406Sjd6 = ufx.A0J;
        PuxFulfillmentOptionItem puxFulfillmentOptionItem2 = (PuxFulfillmentOptionItem) c63406Sjd6.A01;
        if (puxFulfillmentOptionItem2 != null) {
            puxFulfillmentOptionItem = new PuxFulfillmentOptionItem(puxFulfillmentOptionItem2.A00, puxFulfillmentOptionItem2.A01, puxFulfillmentOptionItem2.A03, puxFulfillmentOptionItem2.A02, z, puxFulfillmentOptionItem2.A04);
        } else {
            puxFulfillmentOptionItem = null;
        }
        ufx.A0J = C63406Sjd.A02(c63406Sjd6, puxFulfillmentOptionItem);
        C63406Sjd c63406Sjd7 = ufx.A0O;
        PuxContactItem puxContactItem4 = (PuxContactItem) c63406Sjd7.A01;
        if (puxContactItem4 != null) {
            puxContactItem2 = new PuxContactItem(puxContactItem4.A00, puxContactItem4.A01, puxContactItem4.A03, puxContactItem4.A04, puxContactItem4.A05, puxContactItem4.A06, puxContactItem4.A02, z);
        } else {
            puxContactItem2 = null;
        }
        ufx.A0O = C63406Sjd.A02(c63406Sjd7, puxContactItem2);
        C63406Sjd c63406Sjd8 = ufx.A0G;
        AnonCheckoutPuxLink anonCheckoutPuxLink2 = (AnonCheckoutPuxLink) c63406Sjd8.A01;
        if (anonCheckoutPuxLink2 != null) {
            anonCheckoutPuxLink = new AnonCheckoutPuxLink(anonCheckoutPuxLink2.A00, anonCheckoutPuxLink2.A01, z);
        } else {
            anonCheckoutPuxLink = null;
        }
        ufx.A0G = C63406Sjd.A02(c63406Sjd8, anonCheckoutPuxLink);
        C63406Sjd c63406Sjd9 = ufx.A09;
        EmailOptInItem emailOptInItem2 = (EmailOptInItem) c63406Sjd9.A01;
        if (emailOptInItem2 != null) {
            emailOptInItem = new EmailOptInItem(emailOptInItem2.A01, emailOptInItem2.A02, emailOptInItem2.A03, emailOptInItem2.A00, z);
        } else {
            emailOptInItem = null;
        }
        ufx.A09 = C63406Sjd.A02(c63406Sjd9, emailOptInItem);
        C63406Sjd c63406Sjd10 = ufx.A0R;
        PuxTermsConditionItem puxTermsConditionItem2 = (PuxTermsConditionItem) c63406Sjd10.A01;
        if (puxTermsConditionItem2 != null) {
            VG3 vg3 = puxTermsConditionItem2.A04;
            String str = puxTermsConditionItem2.A05;
            puxTermsConditionItem = new PuxTermsConditionItem(puxTermsConditionItem2.A01, puxTermsConditionItem2.A02, puxTermsConditionItem2.A03, puxTermsConditionItem2.A00, vg3, str, puxTermsConditionItem2.A06, puxTermsConditionItem2.A07, puxTermsConditionItem2.A08, z);
        } else {
            puxTermsConditionItem = null;
        }
        ufx.A0R = C63406Sjd.A02(c63406Sjd10, puxTermsConditionItem);
        C63406Sjd c63406Sjd11 = ufx.A0H;
        PuxBannerItem puxBannerItem2 = (PuxBannerItem) c63406Sjd11.A01;
        if (puxBannerItem2 != null) {
            puxBannerItem = new PuxBannerItem(puxBannerItem2.A00, puxBannerItem2.A01, puxBannerItem2.A02, puxBannerItem2.A03, puxBannerItem2.A04, z);
        } else {
            puxBannerItem = null;
        }
        ufx.A0H = C63406Sjd.A02(c63406Sjd11, puxBannerItem);
        A0K(ufx, EnumC129485tD.A0L, ufx.A0R);
        ufx.A02 = null;
        C63406Sjd c63406Sjd12 = ufx.A0g;
        PuxOrderSummaryItem puxOrderSummaryItem2 = (PuxOrderSummaryItem) c63406Sjd12.A01;
        if (puxOrderSummaryItem2 != null) {
            puxOrderSummaryItem = new PuxOrderSummaryItem(puxOrderSummaryItem2.A02, puxOrderSummaryItem2.A01, puxOrderSummaryItem2.A03, puxOrderSummaryItem2.A04, puxOrderSummaryItem2.A05, puxOrderSummaryItem2.A06, puxOrderSummaryItem2.A07, puxOrderSummaryItem2.A00, puxOrderSummaryItem2.A0A, puxOrderSummaryItem2.A09, z);
        } else {
            puxOrderSummaryItem = null;
        }
        ufx.A0g = C63406Sjd.A02(c63406Sjd12, puxOrderSummaryItem);
        VG3 vg32 = VG3.A0X;
        A0A(vg32, ufx);
        A0B(vg32, ufx);
        if (ufx.A0h().contains(EnumC129485tD.A0J)) {
            VG3 vg33 = VG3.A0a;
            A0A(vg33, ufx);
            A0B(vg33, ufx);
        }
        if (ufx.A0h().contains(EnumC129485tD.A0D)) {
            VG3 vg34 = VG3.A0Y;
            A0A(vg34, ufx);
            A0B(vg34, ufx);
        }
        if (ufx.A0h().contains(EnumC129485tD.A05)) {
            VG3 vg35 = VG3.A0V;
            A0A(vg35, ufx);
            A0B(vg35, ufx);
        }
        if (ufx.A0h().contains(EnumC129485tD.A0K) || ufx.A0h().contains(EnumC129485tD.A07)) {
            VG3 vg36 = VG3.A0W;
            A0A(vg36, ufx);
            A0B(vg36, ufx);
        }
        if (ufx.A0h().contains(EnumC129485tD.A0G)) {
            VG3 vg37 = VG3.A0Z;
            A0A(vg37, ufx);
            A0B(vg37, ufx);
        }
        List A0h = ufx.A0h();
        EnumC129485tD enumC129485tD = EnumC129485tD.A0B;
        if (A0h.contains(enumC129485tD)) {
            if (!AbstractC166997dE.A1Z(A06(ufx).A01, false)) {
                c63406Sjd = ufx.A0G;
            } else {
                c63406Sjd = null;
            }
            A0K(ufx, enumC129485tD, c63406Sjd);
        }
        List A0h2 = ufx.A0h();
        EnumC129485tD enumC129485tD2 = EnumC129485tD.A06;
        if (A0h2.contains(enumC129485tD2)) {
            if (A0W(ufx)) {
                c63406Sjd3 = ufx.A09;
            }
            A0K(ufx, enumC129485tD2, c63406Sjd3);
        }
        List A0h3 = ufx.A0h();
        EnumC129485tD enumC129485tD3 = EnumC129485tD.A04;
        if (A0h3.contains(enumC129485tD3)) {
            A0K(ufx, enumC129485tD3, ufx.A0H);
        }
        List A0h4 = ufx.A0h();
        EnumC129485tD enumC129485tD4 = EnumC129485tD.A08;
        if (A0h4.contains(enumC129485tD4)) {
            A0K(ufx, enumC129485tD4, ufx.A0C);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d5, code lost:
    
        if (r18 != false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C58252li A0g(androidx.fragment.app.Fragment r24, X.C63345Si1 r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UFX.A0g(androidx.fragment.app.Fragment, X.Si1, java.lang.String):X.2li");
    }

    public final void A0k(C07X c07x) {
        this.A0k = null;
        WDV wdv = this.A1M;
        wdv.A09.A08(this.A1J);
        if (C2FP.A0D().A04()) {
            wdv.A0A.A08(this.A19);
            this.A0y.A08(this.A1I);
        }
        C2GS c2gs = this.A11;
        Object A02 = c2gs.A02();
        if (A02 != null) {
            C62735SOb c62735SOb = new C62735SOb(null, ((ECPPaymentRequest) A02).A08);
            ECPRepositoryImpl eCPRepositoryImpl = C2FP.A01().A08;
            eCPRepositoryImpl.A00.A05(c07x);
            eCPRepositoryImpl.A00 = new C2GS();
            C2FP.A01().A0D.A09(c62735SOb);
            C2FP.A01().A0F.A03(c62735SOb);
            C2FP.A01().A01.A0B(c62735SOb);
            C2FP.A01().A0G.A01(c62735SOb);
            C2FP.A01().A0E.A03(c62735SOb);
            C63167SeR.A00(this.A0x, true);
            UFS ufs = this.A1Q;
            if (ufs.A02 || ufs.A04) {
                OtcOptionState A06 = ufs.A06();
                if (A06 != null) {
                    Object A022 = c2gs.A02();
                    if (A022 != null) {
                        C62735SOb c62735SOb2 = new C62735SOb(new OtcInput(A06.A01, A06.A02), ((ECPPaymentRequest) A022).A08);
                        C2FP.A01().A0D.A09(c62735SOb2);
                        C2FP.A01().A0F.A03(c62735SOb2);
                        C2FP.A01().A01.A0B(c62735SOb2);
                        C2FP.A01().A0G.A01(c62735SOb2);
                        C2FP.A01().A0E.A03(c62735SOb2);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            ((C70510WZr) C2FP.A00()).A00.A00.clear();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0l(C07X c07x, LoggingContext loggingContext, Integer num) {
        String str;
        AbstractC167007dF.A1D(num, 1, loggingContext);
        if (num == C05F.A00) {
            C2FP.A01().A04.A0V(loggingContext, "pux_checkout", UFS.A01(this.A1Q));
        }
        ECPHandler eCPHandler = this.A05;
        if (eCPHandler != null) {
            C2GS c2gs = this.A11;
            Object A02 = c2gs.A02();
            if (A02 != null) {
                String str2 = ((ECPPaymentRequest) A02).A0A;
                Object A022 = c2gs.A02();
                if (A022 != null) {
                    String str3 = ((ECPPaymentRequest) A022).A08;
                    C63406Sjd c63406Sjd = (C63406Sjd) this.A01.A02();
                    if (c63406Sjd != null) {
                        str = (String) c63406Sjd.A01;
                    } else {
                        str = null;
                    }
                    eCPHandler.CJa(new SIL(this.A1Q.A04(null, true), str2, str3, str, this.A0V), loggingContext, num);
                    A0k(c07x);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final C69754Vup A01(UFX ufx) {
        C58252li c58252li = ufx.A1K.A0A;
        if (WDu.A03(EnumC129485tD.A05, ufx.A0h()) && C63406Sjd.A0F(c58252li)) {
            return (C69754Vup) ((C69074VhP) C63406Sjd.A07(c58252li)).A01;
        }
        return null;
    }

    public static final ShippingAddress A03(UFX ufx) {
        CheckoutConfiguration checkoutConfiguration;
        C58252li c58252li = ufx.A1U.A06;
        Object A02 = ufx.A11.A02();
        if (A02 != null) {
            ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) A02;
            if (WDu.A03(EnumC129485tD.A0J, ufx.A0h()) && (checkoutConfiguration = eCPPaymentRequest.A01) != null && checkoutConfiguration.A0H.contains(VDD.A0D) && C63406Sjd.A0F(c58252li)) {
                return (ShippingAddress) ((C69074VhP) C63406Sjd.A07(c58252li)).A01;
            }
            return null;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C63406Sjd A04() {
        /*
            r8 = this;
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Integer r3 = X.C05F.A0C
            X.UFb r2 = r8.A1N
            java.lang.Integer r1 = r2.A01
            java.lang.Integer r0 = X.C05F.A01
            r4 = 0
            if (r1 != r0) goto L69
            java.lang.Integer r3 = X.C05F.A0j
            X.2li r0 = r2.A03
            java.lang.Object r0 = r0.A02()
            X.Sjd r0 = (X.C63406Sjd) r0
            if (r0 == 0) goto L69
            java.lang.Object r0 = r0.A01
            X.VhP r0 = (X.C69074VhP) r0
            if (r0 == 0) goto L69
            java.lang.Object r0 = r0.A01
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r0 = (com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent) r0
            if (r0 == 0) goto L69
            java.lang.String r5 = r0.A03()
        L2c:
            r0 = 2131961358(0x7f13260e, float:1.955941E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.VG3 r1 = X.VG3.A0p
            com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem r0 = new com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem
            r0.<init>(r1, r2, r3, r4, r5)
            X.Sjd r0 = X.C63406Sjd.A04(r0)
            X.C14360o3.A0A(r0)
            r6.add(r0)
            java.util.List r1 = r8.A0h()
            X.5tD r0 = X.EnumC129485tD.A09
            boolean r0 = r1.contains(r0)
            java.lang.String r2 = "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>"
            if (r0 == 0) goto L6b
            java.util.Map r0 = r8.A0l
            java.util.Iterator r1 = X.AbstractC166997dE.A15(r0)
        L58:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = X.AbstractC31176DnK.A0j(r1)
            X.C14360o3.A0C(r0, r2)
            r6.add(r0)
            goto L58
        L69:
            r5 = r4
            goto L2c
        L6b:
            X.Sjd r1 = r8.A0S
            X.2GS r0 = r8.A11
            java.lang.Object r0 = r0.A02()
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            if (r0 == 0) goto L7d
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L7d
            java.lang.Integer r4 = r0.A0D
        L7d:
            X.Sjd r0 = X.W6U.A00(r1, r4)
            X.C14360o3.A0C(r0, r2)
            r6.add(r0)
            X.VG3 r3 = X.VG3.A0X
            X.Sjd r5 = r8.A0g
            X.C14360o3.A0C(r5, r2)
            X.VG3 r1 = r8.A02
            boolean r7 = X.AbstractC167007dF.A1X(r1, r3)
            X.Vrr r0 = r8.A04
            X.Vlf r4 = r0.A00(r3, r1)
            com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem r2 = new com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem
            r2.<init>(r3, r4, r5, r6, r7)
            X.Sjd r0 = X.C63406Sjd.A04(r2)
            r8.A0f = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UFX.A04():X.Sjd");
    }

    public static final C63406Sjd A05(C69333Vlf c69333Vlf, UFX ufx, List list, boolean z) {
        Integer num;
        PuxAccordionItem puxAccordionItem;
        Object selectionActionViewItem;
        List list2;
        String str;
        C63406Sjd c63406Sjd;
        C69074VhP c69074VhP;
        PickupInfo pickupInfo;
        C63406Sjd c63406Sjd2 = ufx.A0J;
        PuxFulfillmentOptionItem puxFulfillmentOptionItem = (PuxFulfillmentOptionItem) c63406Sjd2.A01;
        String str2 = null;
        if (puxFulfillmentOptionItem != null) {
            num = puxFulfillmentOptionItem.A02;
        } else {
            num = null;
        }
        if (num == C05F.A01) {
            if (!A0d(ufx) && !A0c(ufx) && !A0e(ufx) && (c63406Sjd = (C63406Sjd) ufx.A1T.A06.A02()) != null && (c69074VhP = (C69074VhP) c63406Sjd.A01) != null && (pickupInfo = (PickupInfo) c69074VhP.A01) != null) {
                str2 = pickupInfo.A02;
            }
            C66390UFb c66390UFb = ufx.A1N;
            ArrayList arrayList = new ArrayList();
            C2GS c2gs = c66390UFb.A05;
            C14360o3.A0C(c2gs, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.collections.List<com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>>>>");
            C63406Sjd c63406Sjd3 = (C63406Sjd) c2gs.A02();
            if (c63406Sjd3 != null && (list2 = (List) c63406Sjd3.A01) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    Object obj2 = ((C63406Sjd) obj).A01;
                    if (obj2 instanceof SelectionPickupFulfillmentOptionItem) {
                        SelectionPickupFulfillmentOptionItem selectionPickupFulfillmentOptionItem = (SelectionPickupFulfillmentOptionItem) obj2;
                        if (selectionPickupFulfillmentOptionItem != null) {
                            str = selectionPickupFulfillmentOptionItem.A07;
                        } else {
                            str = null;
                        }
                        if (C14360o3.A0K(str, C66390UFb.A00(c66390UFb))) {
                            arrayList2.add(obj);
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    AbstractC65702TsY.A1S(new SelectionHeaderItem(VG3.A0p, 2131961386, C05F.A0C, null, null), arrayList);
                    arrayList.addAll(arrayList2);
                    AbstractC65702TsY.A1S(new SelectionActionViewItem(VG3.A0n, null, 2131961339, null, null), arrayList);
                    if (str2 != null) {
                        selectionActionViewItem = new SelectionTextViewItem(VG3.A0u, null, str2, true);
                        AbstractC65702TsY.A1S(selectionActionViewItem, arrayList);
                    }
                    VG3 vg3 = VG3.A0W;
                    C63406Sjd c63406Sjd4 = ufx.A0J;
                    C14360o3.A0C(c63406Sjd4, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
                    puxAccordionItem = new PuxAccordionItem(vg3, c69333Vlf, c63406Sjd4, arrayList, z);
                }
            }
            if (C70153WDa.A00()) {
                AbstractC65702TsY.A1S(new SelectionHeaderItem(VG3.A0p, 2131961386, C05F.A0N, null, null), arrayList);
                selectionActionViewItem = new SelectionActionViewItem(VG3.A0n, null, 2131961398, null, null);
                AbstractC65702TsY.A1S(selectionActionViewItem, arrayList);
            }
            VG3 vg32 = VG3.A0W;
            C63406Sjd c63406Sjd42 = ufx.A0J;
            C14360o3.A0C(c63406Sjd42, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
            puxAccordionItem = new PuxAccordionItem(vg32, c69333Vlf, c63406Sjd42, arrayList, z);
        } else {
            VG3 vg33 = VG3.A0W;
            C14360o3.A0C(c63406Sjd2, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
            puxAccordionItem = new PuxAccordionItem(vg33, c69333Vlf, c63406Sjd2, list, z);
        }
        return C63406Sjd.A04(puxAccordionItem);
    }

    public static final C63406Sjd A06(UFX ufx) {
        boolean z;
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) ufx.A11.A02();
        if (eCPPaymentRequest != null && (checkoutConfiguration = eCPPaymentRequest.A01) != null && AbstractC31177DnL.A1b(checkoutConfiguration.A05)) {
            UFS ufs = ufx.A1Q;
            if ((ufs.A02 || ufs.A04) && !ufs.A0B()) {
                z = ufx.A0j;
                if (z == null) {
                    return C63406Sjd.A03(null);
                }
                return C63406Sjd.A04(z);
            }
        }
        z = false;
        return C63406Sjd.A04(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r15.A1O.A05 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C63406Sjd A07(X.UFX r15) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UFX.A07(X.UFX):X.Sjd");
    }

    private final List A08() {
        EnumC129485tD enumC129485tD;
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) this.A11.A02();
        if (eCPPaymentRequest != null && (checkoutConfiguration = eCPPaymentRequest.A01) != null && checkoutConfiguration.A0D != null) {
            enumC129485tD = EnumC129485tD.A07;
        } else {
            enumC129485tD = EnumC129485tD.A0K;
        }
        return AbstractC16960so.A1Q(enumC129485tD, EnumC129485tD.A0L, EnumC129485tD.A0E, EnumC129485tD.A0H, EnumC129485tD.A09, EnumC129485tD.A0I, EnumC129485tD.A0C);
    }

    private final void A09() {
        List list = this.A04.A00;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass016.A16(((W5L) it.next()).A01.keySet(), arrayList);
        }
        for (VG3 vg3 : AbstractC001800i.A0a(arrayList)) {
            A0A(vg3, this);
            A0B(vg3, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01f4, code lost:
    
        if (r4 != 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x021d, code lost:
    
        if ((r4.A02 instanceof X.X1p) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02af, code lost:
    
        if (r0 == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0336, code lost:
    
        if ((r4.A02 instanceof X.X1p) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r0 == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v39, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0A(X.VG3 r39, X.UFX r40) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UFX.A0A(X.VG3, X.UFX):void");
    }

    public static final void A0C(VG3 vg3, UFX ufx, boolean z) {
        int size;
        if (z) {
            VG3 vg32 = ufx.A02;
            if (vg3 != vg32) {
                LinkedHashMap linkedHashMap = ufx.A1X;
                java.util.Set keySet = linkedHashMap.keySet();
                C14360o3.A07(keySet);
                List A0a = AbstractC001800i.A0a(keySet);
                int indexOf = A0a.indexOf(vg3.A00());
                if (vg32 != null) {
                    size = A0a.indexOf(vg32.A00());
                } else {
                    size = linkedHashMap.size();
                }
                if (indexOf < size) {
                    ufx.A0D(vg3, false);
                    return;
                }
                return;
            }
            return;
        }
        if (vg3 != ufx.A02) {
            return;
        }
        ufx.A0o(false);
    }

    private final void A0D(VG3 vg3, boolean z) {
        String str;
        String str2;
        String str3;
        VG3 vg32 = VG3.A0Y;
        if (vg3 == vg32 && A0s()) {
            ShippingAddress A03 = A03(this);
            ShippingAddress A02 = A02(this);
            boolean z2 = false;
            if (A03 != null && A02 != null && (str2 = A03.A06) != null && (str3 = A02.A06) != null) {
                z2 = str2.equals(str3);
            }
            Boolean A0I = this.A1R.A0I();
            Wap wap = C2FP.A01().A04;
            LoggingContext loggingContext = this.A1P;
            if (z2) {
                str = "checkbox";
            } else {
                str = "inline_billing_form";
            }
            if (A0I != null) {
                z2 = A0I.booleanValue();
            }
            Wap.A03(new C25531Mh(MSY.A0H(wap.A00, "client_load_shippingasbilling_display"), 97), loggingContext, new MIG(loggingContext, null, str, 7, z2));
        }
        VG3 vg33 = this.A02;
        this.A02 = vg3;
        if (vg33 != null) {
            if (z) {
                int ordinal = vg33.ordinal();
                if (ordinal != 13) {
                    if (ordinal != 12) {
                        if (ordinal == 14) {
                            C63406Sjd A00 = AbstractC69843VwT.A00(this.A0I, 2131961363);
                            C14360o3.A0C(A00, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.PuxContactItem>");
                            this.A0I = A00;
                        }
                    } else {
                        C63406Sjd A002 = AbstractC69843VwT.A00(this.A0N, 2131961365);
                        C14360o3.A0C(A002, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem>");
                        this.A0N = A002;
                    }
                } else {
                    C63406Sjd A003 = AbstractC69843VwT.A00(this.A0Q, 2131961367);
                    C14360o3.A0C(A003, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.PuxShippingAddressItem>");
                    this.A0Q = A003;
                }
            }
            if (vg33 == VG3.A0X) {
                A0A(vg33, this);
                A0B(vg33, this);
            } else if (vg33 == vg32) {
                A0j();
            }
        }
        A09();
    }

    public static final void A0F(UFX ufx) {
        C63167SeR.A00(ufx.A0t, new ErrorDialogContent(VEJ.A05, null, null, null, 2131961424, 2131961423, null, null, null, null));
        ufx.A0m = true;
    }

    public static final void A0G(UFX ufx) {
        List list;
        C63406Sjd c63406Sjd = ufx.A0S;
        TransactionInfo transactionInfo = (TransactionInfo) c63406Sjd.A01;
        if (transactionInfo == null || (list = transactionInfo.A09) == null) {
            list = C16930sl.A00;
        }
        C63406Sjd A02 = C63406Sjd.A02(c63406Sjd, new IncentiveCredentialList(list));
        UFP ufp = ufx.A1O;
        C14360o3.A0A(A02);
        ufp.A0B.A0B(A02);
    }

    public static final void A0H(UFX ufx) {
        C63406Sjd c63406Sjd;
        if (!AbstractC31177DnL.A1b(ufx.A0j) && !C63406Sjd.A0H(ufx.A0N) && ((!C63406Sjd.A0H(ufx.A0F) || !A0f(ufx)) && (!C63406Sjd.A0H(ufx.A0I) || (!A0a(ufx) && !A0b(ufx) && !A0Z(ufx))))) {
            Object A02 = ufx.A11.A02();
            if (A02 != null) {
                ufx.A0j = Boolean.valueOf(C14360o3.A0K(WGF.A00((ECPPaymentRequest) A02, ufx, false), "FULL_PUX"));
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        EnumC129485tD enumC129485tD = EnumC129485tD.A03;
        C63406Sjd c63406Sjd2 = null;
        if (ufx.A0S()) {
            c63406Sjd = ufx.A08;
        } else {
            c63406Sjd = null;
        }
        A0K(ufx, enumC129485tD, c63406Sjd);
        EnumC129485tD enumC129485tD2 = EnumC129485tD.A0B;
        if (!AbstractC166997dE.A1Z(A06(ufx).A01, false)) {
            c63406Sjd2 = ufx.A0G;
        }
        A0K(ufx, enumC129485tD2, c63406Sjd2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r5.contains(X.VD7.A03) == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r5 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        r6.A08 = r3;
        r6.A07 = r2;
        r6.A09 = r0;
        r1 = r6.A0B;
        r0 = (X.C63406Sjd) r6.A0D.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r0 = (X.SOu) r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        X.C63406Sjd.A0C(r1, X.C66393UFe.A01(r0, r6));
        r3 = r7.A1T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r5 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r5.contains(X.VD7.A07) == true) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r5.contains(X.VD7.A06) == true) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r5 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        r3.A03 = r2;
        r3.A02 = r1;
        r3.A04 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (r5.contains(X.VD7.A08) != true) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        if (r5 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x002d, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0034, code lost:
    
        if (r5.contains(X.VD7.A05) == true) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x001f, code lost:
    
        if (r5 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r5.contains(X.VD7.A04) != true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0I(X.UFX r7) {
        /*
            X.2GS r0 = r7.A11
            java.lang.Object r0 = r0.A02()
            if (r0 == 0) goto L85
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = (com.facebookpay.expresscheckout.models.ECPPaymentRequest) r0
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L83
            java.util.Set<X.VD7> r5 = r0.A0I
        L10:
            X.UFe r6 = r7.A1K
            r4 = 1
            if (r5 == 0) goto L1e
            X.VD7 r0 = X.VD7.A04
            boolean r0 = r5.contains(r0)
            r3 = 1
            if (r0 == r4) goto L21
        L1e:
            r3 = 0
            if (r5 == 0) goto L2a
        L21:
            X.VD7 r0 = X.VD7.A03
            boolean r0 = r5.contains(r0)
            r2 = 1
            if (r0 == r4) goto L2d
        L2a:
            r2 = 0
            if (r5 == 0) goto L36
        L2d:
            X.VD7 r0 = X.VD7.A05
            boolean r1 = r5.contains(r0)
            r0 = 1
            if (r1 == r4) goto L37
        L36:
            r0 = 0
        L37:
            r6.A08 = r3
            r6.A07 = r2
            r6.A09 = r0
            X.2li r1 = r6.A0B
            X.2GS r0 = r6.A0D
            java.lang.Object r0 = r0.A02()
            X.Sjd r0 = (X.C63406Sjd) r0
            if (r0 == 0) goto L81
            java.lang.Object r0 = r0.A01
            X.SOu r0 = (X.SOu) r0
        L4d:
            java.util.List r0 = X.C66393UFe.A01(r0, r6)
            X.C63406Sjd.A0C(r1, r0)
            X.UFa r3 = r7.A1T
            if (r5 == 0) goto L61
            X.VD7 r0 = X.VD7.A07
            boolean r0 = r5.contains(r0)
            r2 = 1
            if (r0 == r4) goto L64
        L61:
            r2 = 0
            if (r5 == 0) goto L6d
        L64:
            X.VD7 r0 = X.VD7.A06
            boolean r0 = r5.contains(r0)
            r1 = 1
            if (r0 == r4) goto L70
        L6d:
            r1 = 0
            if (r5 == 0) goto L7f
        L70:
            X.VD7 r0 = X.VD7.A08
            boolean r0 = r5.contains(r0)
            if (r0 != r4) goto L7f
        L78:
            r3.A03 = r2
            r3.A02 = r1
            r3.A04 = r4
            return
        L7f:
            r4 = 0
            goto L78
        L81:
            r0 = 0
            goto L4d
        L83:
            r5 = 0
            goto L10
        L85:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UFX.A0I(X.UFX):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
    
        if (X.C63406Sjd.A0J(r17.A0Q) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00df, code lost:
    
        if (X.C14360o3.A0K(r7.A01, r8.A01) == false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0J(X.UFX r17) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UFX.A0J(X.UFX):void");
    }

    public static final void A0L(UFX ufx, String str) {
        Integer num;
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) ufx.A11.A02();
        if (eCPPaymentRequest != null) {
            num = eCPPaymentRequest.A04.A09.A01;
        } else {
            num = null;
        }
        if (num == C05F.A01) {
            str = "Meta";
        }
        ufx.A0W = str;
    }

    public static final void A0M(UFX ufx, String str, String str2) {
        C2GS c2gs;
        ErrorDialogContent errorDialogContent;
        Object c63167SeR;
        UFP ufp = ufx.A1O;
        ECPIncentive eCPIncentive = ufp.A01;
        if (eCPIncentive != null && eCPIncentive.CQZ()) {
            c2gs = ufx.A10;
            c63167SeR = new C70070W1n(null, false);
        } else {
            c2gs = ufx.A0t;
            if (str != null) {
                errorDialogContent = new ErrorDialogContent(VEJ.A04, null, null, null, 2131961488, null, null, null, null, str);
            } else {
                errorDialogContent = new ErrorDialogContent(VEJ.A04, null, null, null, 2131961488, 2131961487, null, null, null, null);
            }
            c63167SeR = new C63167SeR(errorDialogContent);
        }
        c2gs.A0B(c63167SeR);
        ufp.A0A(ufx.A1P, str2);
        if (C18U.A06(C06090Tz.A06, C2FP.A0D().A00, 36317307152241695L)) {
            A0K(ufx, EnumC129485tD.A08, A07(ufx));
        }
    }

    public static final void A0N(UFX ufx, Throwable th) {
        if (!ufx.A0m) {
            if (th instanceof REZ) {
                REZ rez = (REZ) th;
                C14360o3.A0B(rez, 0);
                if (AbstractC167007dF.A1X(rez.A01.A00, EnumC68186VFe.DISMISS_AND_CLOSE)) {
                    ufx.A0m = true;
                }
                ufx.A0t.A0B(AbstractC63238Sfs.A00(rez));
                return;
            }
            A0F(ufx);
        }
    }

    public static final void A0O(UFX ufx, List list) {
        String str;
        LinkedHashMap linkedHashMap = ufx.A1X;
        linkedHashMap.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63406Sjd c63406Sjd = null;
            switch (((EnumC129485tD) it.next()).ordinal()) {
                case 1:
                    if (!A0V(ufx)) {
                        break;
                    } else {
                        c63406Sjd = ufx.A07;
                        str = "ANON_CHECKOUT_BACK_BUTTON";
                        break;
                    }
                case 2:
                    if (ufx.A0S()) {
                        c63406Sjd = ufx.A08;
                    }
                    str = "APM";
                    break;
                case 3:
                    c63406Sjd = ufx.A0H;
                    str = "BANNER";
                    break;
                case 6:
                    c63406Sjd = ufx.A0A;
                    str = "CONTACT_INFORMATION";
                    break;
                case 8:
                    if (A0W(ufx)) {
                        c63406Sjd = ufx.A09;
                    }
                    str = "EMAIL_OPTIN";
                    break;
                case 9:
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    c63406Sjd = ufx.A0B;
                    str = "FULFILLMENT_OPTIONS";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    c63406Sjd = ufx.A0C;
                    str = "INCENTIVES";
                    break;
                case 17:
                    if (!C63406Sjd.A0H(A06(ufx)) && !AbstractC31177DnL.A1b(A06(ufx).A01)) {
                        break;
                    } else {
                        c63406Sjd = ufx.A0G;
                        str = "ONE_TIME_CHECKOUT_OPTION";
                        break;
                    }
                    break;
                case 18:
                    c63406Sjd = ufx.A04();
                    str = "ORDER_SUMMARY";
                    break;
                case Process.SIGSTOP /* 19 */:
                    c63406Sjd = ufx.A0D;
                    str = "PAYMENT_METHOD";
                    break;
                case 21:
                    ufx.A0h = ufx.A0M;
                    continue;
                case 22:
                    c63406Sjd = ufx.A0E;
                    str = "PICKUP_CONTACT_INFO";
                    break;
                case 28:
                    c63406Sjd = ufx.A0F;
                    str = PaymentDetailChangeTypes$Companion.SHIPPING_ADDRESS;
                    break;
                case 33:
                    ufx.A0i = ufx.A0R;
                    continue;
            }
            linkedHashMap.put(str, c63406Sjd);
        }
        List A1J = AbstractC166987dD.A1J(ufx.A1W);
        Collection values = linkedHashMap.values();
        C14360o3.A07(values);
        ufx.A0q.A0B(AbstractC001800i.A0S(AbstractC001800i.A0X(AbstractC001800i.A0a(values)), A1J));
        ufx.A0w.A0B(ufx.A0M);
        ufx.A0z.A0B(ufx.A0R);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01e7, code lost:
    
        if (r5 == null) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e9 A[EDGE_INSN: B:128:0x01e9->B:78:0x01e9 BREAK  A[LOOP:2: B:67:0x01c2->B:126:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0P(X.UFX r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UFX.A0P(X.UFX, boolean):void");
    }

    private final boolean A0S() {
        EnumC72407Xcu enumC72407Xcu;
        PaymentMethod paymentMethod;
        Object A02 = this.A11.A02();
        if (A02 != null) {
            String A00 = WGF.A00((ECPPaymentRequest) A02, this, false);
            if (!C14360o3.A0K(A00, "PARTIAL_PUX_WITHOUT_CREDENTIAL")) {
                if (!C14360o3.A0K(A00, "PARTIAL_PUX_WITH_CREDENTIAL")) {
                    return false;
                }
                PuxPaymentMethodItem puxPaymentMethodItem = (PuxPaymentMethodItem) this.A0N.A01;
                if (puxPaymentMethodItem != null && (paymentMethod = puxPaymentMethodItem.A01) != null) {
                    enumC72407Xcu = paymentMethod.AtB();
                } else {
                    enumC72407Xcu = null;
                }
                if (enumC72407Xcu == EnumC72407Xcu.A07) {
                    return false;
                }
            }
            return true;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final boolean A0U(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, UFX ufx, PaymentMethod paymentMethod) {
        SelectionPaymentMethodItem selectionPaymentMethodItem;
        CreditCard creditCard;
        CreditCard creditCard2;
        String str;
        String str2;
        UWg uWg;
        String optionalStringField;
        C66392UFd c66392UFd = ufx.A1R;
        Integer A0J = c66392UFd.A0J(paymentMethod);
        String str3 = null;
        if (paymentMethod != null) {
            selectionPaymentMethodItem = AbstractC63239Sft.A00(paymentMethod, A0J, false, ufx.A1Q.A0A());
        } else {
            selectionPaymentMethodItem = null;
        }
        C63406Sjd A04 = C63406Sjd.A04(selectionPaymentMethodItem);
        ShippingAddress A03 = A03(ufx);
        ShippingAddress A02 = A02(ufx);
        boolean z = paymentMethod instanceof CreditCard;
        if (z) {
            creditCard = (CreditCard) paymentMethod;
        } else {
            creditCard = null;
        }
        if (creditCard == null || (uWg = creditCard.A01) == null || (optionalStringField = uWg.getOptionalStringField(0, "error_msg")) == null || !(!AbstractC001900j.A0T(optionalStringField))) {
            if (z) {
                creditCard2 = (CreditCard) paymentMethod;
            } else {
                creditCard2 = null;
            }
            if (c66392UFd.A0O(creditCard2, true) && A03 != null && A02 != null && (str = A03.A06) != null && (str2 = A02.A06) != null && str.equals(str2) && (!(paymentMethod instanceof TokenizedCard) || ((TokenizedCard) paymentMethod).A01.getOptionalEnumField(0, "token_status", EnumC61211RhB.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) != EnumC61211RhB.SUSPENDED)) {
                if (ufx.A0Y) {
                    c66392UFd.A0M(paymentMethod);
                    return false;
                }
                WGF.A04(ufx, "user_click_credential_atomic", "edit_selected_credential_from_alert_dialog");
                if (paymentMethod != null) {
                    str3 = paymentMethod.getTitle();
                }
                StringBuilder sb = new StringBuilder();
                String str4 = A03.A08;
                if (str4 != null && str4.length() > 0) {
                    sb.append(str4);
                    sb.append(", ");
                }
                String str5 = A03.A09;
                if (str5 != null && str5.length() > 0) {
                    sb.append(str5);
                    sb.append(", ");
                }
                String str6 = A03.A01;
                if (str6 != null && str6.length() > 0) {
                    sb.append(str6);
                    sb.append(", ");
                }
                String str7 = A03.A07;
                if (str7 != null && str7.length() > 0) {
                    sb.append(str7);
                    sb.append(" ");
                }
                if (str.length() > 0) {
                    sb.append(str);
                }
                String obj = sb.toString();
                C57261Pbj c57261Pbj = new C57261Pbj(26, paymentMethod, A03, ufx);
                MEB meb = new MEB(3, bundle, fragment, ufx, contextThemeWrapper, A04);
                C57549PgN c57549PgN = new C57549PgN(ufx, 49);
                SNQ A0H = C2FP.A0H();
                String A0f = AbstractC167007dF.A0f(contextThemeWrapper, str3, 2131961547);
                WHP whp = new WHP(c57261Pbj, 20);
                WHP whp2 = new WHP(meb, 21);
                WHP whp3 = new WHP(c57549PgN, 22);
                String str8 = null;
                String str9 = null;
                if (A0f != null) {
                    str9 = A0f;
                }
                if (obj != null) {
                    str8 = obj;
                }
                AbstractC65702TsY.A0v(contextThemeWrapper, new C63198Sf0(whp3, whp2, whp, null, str8, null, null, str9, 0, 2131961545, 2131961546, 0, 2, 2131961548, 0, true), A0H);
                return true;
            }
        }
        return false;
    }

    public static final boolean A0V(UFX ufx) {
        Integer num;
        ECPPaymentRequest eCPPaymentRequest;
        CheckoutConfiguration checkoutConfiguration;
        UFS ufs = ufx.A1Q;
        boolean A0T = ufx.A0T();
        boolean A0B = ufs.A0B();
        if (A0T) {
            if (!A0B) {
                num = C05F.A0C;
            } else {
                if (ufs.A0B()) {
                    num = C05F.A01;
                }
                throw new UnsupportedOperationException("OTC State is not known");
            }
            if (num == C05F.A0j || !ufs.A0A() || (eCPPaymentRequest = (ECPPaymentRequest) ufx.A11.A02()) == null || (checkoutConfiguration = eCPPaymentRequest.A01) == null) {
                return false;
            }
            return AbstractC25231BEo.A1Z(checkoutConfiguration.A05, true, false);
        }
        if (!A0B) {
            num = C05F.A0Y;
        } else {
            if (ufs.A0B()) {
                num = C05F.A0j;
            }
            throw new UnsupportedOperationException("OTC State is not known");
        }
        return num == C05F.A0j ? false : false;
    }

    public static final boolean A0X(UFX ufx) {
        C63406Sjd c63406Sjd = ufx.A0Q;
        if (C63406Sjd.A0G(c63406Sjd) && (c63406Sjd.A02 instanceof X1p)) {
            return false;
        }
        C63406Sjd c63406Sjd2 = ufx.A0N;
        if (C63406Sjd.A0G(c63406Sjd2) && (c63406Sjd2.A02 instanceof X1p)) {
            return false;
        }
        C63406Sjd c63406Sjd3 = ufx.A0I;
        if (C63406Sjd.A0G(c63406Sjd3) && (c63406Sjd3.A02 instanceof X1p)) {
            return false;
        }
        C63406Sjd c63406Sjd4 = ufx.A0O;
        if (C63406Sjd.A0G(c63406Sjd4) && (c63406Sjd4.A02 instanceof X1p)) {
            return false;
        }
        return true;
    }

    public static final boolean A0Y(UFX ufx) {
        CheckoutConfiguration checkoutConfiguration;
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) ufx.A11.A02();
        if (eCPPaymentRequest != null && (checkoutConfiguration = eCPPaymentRequest.A01) != null && checkoutConfiguration.A0H.contains(VDD.A08)) {
            return true;
        }
        return false;
    }

    public static final boolean A0Z(UFX ufx) {
        Object A02 = ufx.A11.A02();
        if (A02 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A02).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0I.contains(VD7.A03);
            }
            return false;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final boolean A0a(UFX ufx) {
        Object A02 = ufx.A11.A02();
        if (A02 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A02).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0I.contains(VD7.A04);
            }
            return false;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final boolean A0b(UFX ufx) {
        Object A02 = ufx.A11.A02();
        if (A02 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A02).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0I.contains(VD7.A05);
            }
            return false;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final boolean A0c(UFX ufx) {
        Object A02 = ufx.A11.A02();
        if (A02 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A02).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0I.contains(VD7.A06);
            }
            return false;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final boolean A0d(UFX ufx) {
        Object A02 = ufx.A11.A02();
        if (A02 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A02).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0I.contains(VD7.A07);
            }
            return false;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final boolean A0e(UFX ufx) {
        Object A02 = ufx.A11.A02();
        if (A02 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A02).A01;
            if (checkoutConfiguration != null) {
                return checkoutConfiguration.A0I.contains(VD7.A08);
            }
            return false;
        }
        throw AbstractC166997dE.A0g();
    }

    public final List A0h() {
        List list = this.A0X;
        if (list != null) {
            return list;
        }
        C14360o3.A0F("componentTypeList");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0076, code lost:
    
        if (r1 != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0i() {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UFX.A0i():void");
    }

    public final void A0j() {
        Wac wac;
        String str;
        LocaleMember localeMember;
        String str2;
        String A1A;
        C69074VhP c69074VhP;
        C66392UFd c66392UFd = this.A1R;
        ShippingAddress A03 = A03(this);
        if (A03 != null) {
            wac = AbstractC69848VwZ.A00(A03);
        } else {
            wac = null;
        }
        if (C66392UFd.A0E(c66392UFd)) {
            C63406Sjd c63406Sjd = (C63406Sjd) c66392UFd.A08.A02();
            PaymentMethod paymentMethod = null;
            if (c63406Sjd != null && (c69074VhP = (C69074VhP) c63406Sjd.A01) != null) {
                paymentMethod = (PaymentMethod) c69074VhP.A01;
            }
            if ((paymentMethod instanceof CreditCard) && paymentMethod != null) {
                if (!C14360o3.A0K(c66392UFd.A0I(), true) && c66392UFd.A0H() != null) {
                    if (C14360o3.A0K(c66392UFd.A0H(), true)) {
                        Object obj = c66392UFd.A00.get(2);
                        String str3 = null;
                        if ((obj instanceof String) && (str2 = (String) obj) != null && (A1A = AbstractC25228BEl.A1A(str2)) != null && !AbstractC001900j.A0T(A1A)) {
                            List A0Q = AbstractC001900j.A0Q(A1A, new char[]{' '}, 0);
                            if (!A0Q.isEmpty()) {
                                A0Q.get(0);
                            }
                            if (A0Q.size() > 1) {
                                A0Q.get(1);
                            }
                        }
                        SparseArray sparseArray = c66392UFd.A00;
                        String A0Y = AbstractC65702TsY.A0Y(sparseArray, 5);
                        String A0Y2 = AbstractC65702TsY.A0Y(sparseArray, 6);
                        String A0Y3 = AbstractC65702TsY.A0Y(sparseArray, 7);
                        String A0Y4 = AbstractC65702TsY.A0Y(sparseArray, 8);
                        Object obj2 = sparseArray.get(10);
                        if ((obj2 instanceof Country) && (localeMember = (LocaleMember) obj2) != null) {
                            str = localeMember.A00.getISO3Country();
                        } else {
                            str = null;
                        }
                        Object obj3 = c66392UFd.A00.get(9);
                        if (obj3 instanceof String) {
                            str3 = (String) obj3;
                        }
                        wac = new Wac(A0Y, A0Y2, A0Y3, A0Y4, str, str3);
                    } else {
                        C66392UFd.A08(c66392UFd);
                        return;
                    }
                } else if (!C14360o3.A0K(c66392UFd.A0I(), true) || wac == null) {
                    return;
                }
                c66392UFd.A0L(wac, paymentMethod);
            }
        }
    }

    public final void A0n(ECPHandler eCPHandler) {
        if (eCPHandler != null) {
            ECPHandler eCPHandler2 = this.A05;
            if (eCPHandler2 != null && !eCPHandler2.equals(eCPHandler)) {
                throw new IllegalStateException("Cannot override previous ECP handler with a new handler for the same checkout ViewModel instance");
            }
            if (!C14360o3.A0K(this.A05, eCPHandler)) {
                WDV wdv = this.A1M;
                C2GS F8A = eCPHandler.F8A();
                C14360o3.A0B(F8A, 0);
                wdv.A08.A0E(F8A, wdv.A0B);
            }
            this.A05 = eCPHandler;
            return;
        }
        throw new IllegalStateException("Attempting to set null value for EcpHandler. This will result in lossy event-handling behavior");
    }

    public final void A0o(boolean z) {
        VG3 vg3;
        Object obj;
        VG3 vg32;
        BaseCheckoutItem baseCheckoutItem;
        VG3 vg33;
        VG3 vg34;
        VG3 vg35;
        BaseCheckoutItem baseCheckoutItem2;
        BaseCheckoutItem baseCheckoutItem3;
        BaseCheckoutItem baseCheckoutItem4;
        Iterator A0t = AbstractC167017dG.A0t(this.A1X);
        while (true) {
            vg3 = null;
            if (A0t.hasNext()) {
                obj = A0t.next();
                C63406Sjd c63406Sjd = (C63406Sjd) obj;
                if (c63406Sjd != null && (baseCheckoutItem4 = (BaseCheckoutItem) c63406Sjd.A01) != null) {
                    vg33 = baseCheckoutItem4.BKB();
                } else {
                    vg33 = null;
                }
                if (vg33 != VG3.A0Y || !AbstractC65702TsY.A1X(this.A1R.A08)) {
                    if (c63406Sjd != null && (baseCheckoutItem3 = (BaseCheckoutItem) c63406Sjd.A01) != null) {
                        vg34 = baseCheckoutItem3.BKB();
                    } else {
                        vg34 = null;
                    }
                    if (vg34 != VG3.A0a || !AbstractC65702TsY.A1X(this.A1U.A06)) {
                        if (c63406Sjd != null && (baseCheckoutItem2 = (BaseCheckoutItem) c63406Sjd.A01) != null) {
                            vg35 = baseCheckoutItem2.BKB();
                        } else {
                            vg35 = null;
                        }
                        if (vg35 == VG3.A0V && AbstractC65702TsY.A1X(this.A1K.A0A)) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C63406Sjd c63406Sjd2 = (C63406Sjd) obj;
        if (c63406Sjd2 != null && (baseCheckoutItem = (BaseCheckoutItem) c63406Sjd2.A01) != null) {
            vg3 = baseCheckoutItem.BKB();
        }
        if (vg3 != null) {
            if (z && (vg32 = this.A02) != null) {
                WGF.A01(vg32, vg3, this, null);
            }
            A0D(vg3, false);
            return;
        }
        VG3 vg36 = this.A02;
        if (vg36 == null) {
            return;
        }
        if (vg36 == VG3.A0Y) {
            A0j();
        }
        this.A02 = null;
        A09();
    }

    public final void A0p(boolean z, boolean z2) {
        Object obj = this.A0M.A01;
        if (obj != null) {
            PayButtonItem payButtonItem = (PayButtonItem) obj;
            if (!payButtonItem.A03 && !z2) {
                throw new IllegalStateException("Pay button was in an incorrect processing state");
            }
            C63406Sjd A04 = C63406Sjd.A04(new PayButtonItem(payButtonItem.A00, payButtonItem.A01, payButtonItem.A02, z));
            this.A0M = A04;
            A0K(this, EnumC129485tD.A0F, A04);
            if (!z) {
                A0R(this, false);
            }
            C63406Sjd.A0D(this.A1S.A03, null);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean A0q() {
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) this.A11.A02();
        if (eCPPaymentRequest != null && eCPPaymentRequest.A02 != null) {
            return true;
        }
        return false;
    }

    public final boolean A0r() {
        Integer num;
        ECPPaymentRequest eCPPaymentRequest;
        CheckoutConfiguration checkoutConfiguration;
        UFS ufs = this.A1Q;
        boolean A0T = A0T();
        boolean A0B = ufs.A0B();
        if (A0T) {
            if (!A0B) {
                num = C05F.A0C;
            } else {
                if (ufs.A0B()) {
                    num = C05F.A01;
                }
                throw new UnsupportedOperationException("OTC State is not known");
            }
            if (num == C05F.A01 || !ufs.A0A() || (eCPPaymentRequest = (ECPPaymentRequest) this.A11.A02()) == null || (checkoutConfiguration = eCPPaymentRequest.A01) == null) {
                return false;
            }
            return AbstractC25231BEo.A1Z(checkoutConfiguration.A05, true, false);
        }
        if (!A0B) {
            num = C05F.A0Y;
        } else {
            if (ufs.A0B()) {
                num = C05F.A0j;
            }
            throw new UnsupportedOperationException("OTC State is not known");
        }
        return num == C05F.A01 ? false : false;
    }

    public final boolean A0s() {
        CreditCard creditCard;
        UWg uWg;
        String optionalStringField;
        C69074VhP c69074VhP;
        if (this.A0Y) {
            C66392UFd c66392UFd = this.A1R;
            C63406Sjd c63406Sjd = (C63406Sjd) c66392UFd.A08.A02();
            PaymentMethod paymentMethod = null;
            if (c63406Sjd != null && (c69074VhP = (C69074VhP) c63406Sjd.A01) != null) {
                paymentMethod = (PaymentMethod) c69074VhP.A01;
            }
            if ((paymentMethod instanceof CreditCard) && (creditCard = (CreditCard) paymentMethod) != null && c66392UFd.A0O(creditCard, false) && ((!(creditCard instanceof TokenizedCard) || ((TokenizedCard) creditCard).A01.getOptionalEnumField(0, "token_status", EnumC61211RhB.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) != EnumC61211RhB.SUSPENDED) && ((uWg = creditCard.A01) == null || (optionalStringField = uWg.getOptionalStringField(0, "error_msg")) == null || !(!AbstractC001900j.A0T(optionalStringField))))) {
                return true;
            }
        }
        return false;
    }

    public static final C58252li A00(UFX ufx, ImmutableList immutableList, List list) {
        List A0h = ufx.A0h();
        EnumC129485tD enumC129485tD = EnumC129485tD.A05;
        if (A0h.contains(enumC129485tD)) {
            WDM wdm = (WDM) ufx.A1Y.get(enumC129485tD);
            if (wdm != null) {
                wdm.A02(new X2x(ufx, 8));
            }
            C58252li c58252li = ufx.A0q;
            C66393UFe c66393UFe = ufx.A1K;
            C58252li c58252li2 = c66393UFe.A0A;
            c58252li.A0E(c58252li2, ufx.A1a);
            c58252li.A0E(c66393UFe.A0B, ufx.A1Z);
            if (list != null) {
                C14360o3.A0C(c58252li2, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<out kotlin.Any>>");
                list.add(c58252li2);
            }
            if (immutableList != null && immutableList.contains(enumC129485tD)) {
                ufx.A1M.A02(c58252li2);
            }
            C14360o3.A0C(c58252li2, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<out kotlin.Any>>");
            return c58252li2;
        }
        return null;
    }

    public static final ShippingAddress A02(UFX ufx) {
        if (WDu.A03(EnumC129485tD.A0D, ufx.A0h())) {
            Object A02 = ufx.A11.A02();
            if (A02 != null) {
                CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A02).A01;
                if (checkoutConfiguration != null && checkoutConfiguration.A0I.contains(VD7.A02)) {
                    return ufx.A1R.A0F();
                }
                return null;
            }
            throw AbstractC166997dE.A0g();
        }
        return null;
    }

    public static final void A0B(VG3 vg3, UFX ufx) {
        EnumC129485tD enumC129485tD;
        C63406Sjd c63406Sjd;
        switch (vg3.ordinal()) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                enumC129485tD = EnumC129485tD.A0D;
                c63406Sjd = ufx.A0D;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                enumC129485tD = EnumC129485tD.A0J;
                c63406Sjd = ufx.A0F;
                break;
            case 14:
                enumC129485tD = EnumC129485tD.A05;
                c63406Sjd = ufx.A0A;
                break;
            case Process.SIGTERM /* 15 */:
                enumC129485tD = EnumC129485tD.A07;
                c63406Sjd = ufx.A0B;
                break;
            case 16:
                enumC129485tD = EnumC129485tD.A0C;
                c63406Sjd = ufx.A0f;
                break;
            case 17:
                enumC129485tD = EnumC129485tD.A0G;
                c63406Sjd = ufx.A0E;
                break;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                enumC129485tD = EnumC129485tD.A08;
                c63406Sjd = ufx.A0C;
                break;
            default:
                throw AbstractC37303Gc4.A0M(vg3, "{ECPViewModel} ItemType is not found for identifier => ", new StringBuilder());
        }
        A0K(ufx, enumC129485tD, c63406Sjd);
    }

    public static final void A0E(ECPPaymentResponseParams eCPPaymentResponseParams, UFX ufx, C63406Sjd c63406Sjd, InterfaceC16660sJ interfaceC16660sJ) {
        ECPHandler eCPHandler;
        C63406Sjd A05;
        if (C63406Sjd.A0J(c63406Sjd)) {
            eCPHandler = ufx.A05;
            if (eCPHandler != null) {
                A05 = C63406Sjd.A04(eCPPaymentResponseParams);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            if (C63406Sjd.A0G(c63406Sjd)) {
                Throwable th = c63406Sjd.A02;
                if (th instanceof X1q) {
                    C14360o3.A0C(th, "null cannot be cast to non-null type com.fbpay.util.exceptions.ECPErrorDialogException");
                    C63167SeR.A00(ufx.A0t, ((X1q) th).A00);
                } else {
                    A0N(ufx, th);
                }
                eCPHandler = ufx.A05;
                if (eCPHandler != null) {
                    A05 = C63406Sjd.A05(null, th);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            interfaceC16660sJ.invoke(c63406Sjd);
        }
        eCPHandler.CJP(A05);
        WGF.A02(eCPPaymentResponseParams, ufx, c63406Sjd, "payment_authorization");
        interfaceC16660sJ.invoke(c63406Sjd);
    }

    public static final void A0K(UFX ufx, EnumC129485tD enumC129485tD, C63406Sjd c63406Sjd) {
        LinkedHashMap linkedHashMap;
        String str;
        int ordinal = enumC129485tD.ordinal();
        if (ordinal != 12) {
            if (ordinal != 21) {
                if (ordinal != 33) {
                    linkedHashMap = ufx.A1X;
                    str = enumC129485tD.name();
                    if (AbstractC69843VwT.A01(c63406Sjd, (C63406Sjd) linkedHashMap.get(str))) {
                        return;
                    }
                } else if (AbstractC69843VwT.A01(c63406Sjd, ufx.A0i)) {
                    return;
                } else {
                    ufx.A0i = c63406Sjd;
                }
            } else if (AbstractC69843VwT.A01(c63406Sjd, ufx.A0h)) {
                return;
            } else {
                ufx.A0h = c63406Sjd;
            }
            List A1J = AbstractC166987dD.A1J(ufx.A1W);
            Collection values = ufx.A1X.values();
            C14360o3.A07(values);
            ufx.A0q.A0B(AbstractC001800i.A0S(AbstractC001800i.A0X(AbstractC001800i.A0a(values)), A1J));
            ufx.A0w.A0B(ufx.A0M);
            ufx.A0z.A0B(ufx.A0R);
        }
        linkedHashMap = ufx.A1X;
        str = "INCENTIVES";
        linkedHashMap.put(str, c63406Sjd);
        List A1J2 = AbstractC166987dD.A1J(ufx.A1W);
        Collection values2 = ufx.A1X.values();
        C14360o3.A07(values2);
        ufx.A0q.A0B(AbstractC001800i.A0S(AbstractC001800i.A0X(AbstractC001800i.A0a(values2)), A1J2));
        ufx.A0w.A0B(ufx.A0M);
        ufx.A0z.A0B(ufx.A0R);
    }

    public static final void A0Q(UFX ufx, boolean z) {
        Map A0E;
        WDM wdm;
        TransactionInfo transactionInfo;
        ArrayList<PriceInfo> arrayList;
        List A0h = ufx.A0h();
        EnumC129485tD enumC129485tD = EnumC129485tD.A09;
        if (A0h.contains(enumC129485tD)) {
            ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) ufx.A11.A02();
            if (eCPPaymentRequest == null || (transactionInfo = (TransactionInfo) ufx.A0S.A01) == null || (arrayList = transactionInfo.A07) == null || (A0E = W6U.A02(eCPPaymentRequest, arrayList)) == null) {
                A0E = AbstractC06930Yk.A0E();
            }
            ufx.A0l = A0E;
            if (!A0E.isEmpty()) {
                WDM wdm2 = (WDM) ufx.A1Y.get(enumC129485tD);
                if (wdm2 != null) {
                    wdm2.A03(new X59(ufx, 6));
                }
            } else if (!z && (wdm = (WDM) ufx.A1Y.get(enumC129485tD)) != null) {
                wdm.A01(new C57549PgN(ufx, 48));
            }
            ufx.A0i();
        }
    }

    private final boolean A0T() {
        java.util.Set set;
        java.util.Set set2;
        ECPRepositoryImpl eCPRepositoryImpl = C2FP.A01().A08;
        C2GS c2gs = this.A11;
        Object A02 = c2gs.A02();
        if (A02 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A02).A01;
            if (checkoutConfiguration != null) {
                set = checkoutConfiguration.A0H;
            } else {
                set = C16910sj.A00;
            }
            Object A022 = c2gs.A02();
            if (A022 != null) {
                CheckoutConfiguration checkoutConfiguration2 = ((ECPPaymentRequest) A022).A01;
                if (checkoutConfiguration2 != null) {
                    set2 = checkoutConfiguration2.A0I;
                } else {
                    set2 = C16910sj.A00;
                }
                Object A023 = c2gs.A02();
                if (A023 != null) {
                    return eCPRepositoryImpl.A07(((ECPPaymentRequest) A023).A08, set, set2);
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final boolean A0W(UFX ufx) {
        ECPPaymentRequest eCPPaymentRequest;
        CheckoutConfiguration checkoutConfiguration;
        String str;
        if (A0Z(ufx) && (eCPPaymentRequest = (ECPPaymentRequest) ufx.A11.A02()) != null && (checkoutConfiguration = eCPPaymentRequest.A01) != null && (str = checkoutConfiguration.A0F) != null && str.length() != 0) {
            return true;
        }
        return false;
    }

    public static final boolean A0f(UFX ufx) {
        if (!WDu.A03(EnumC129485tD.A0J, ufx.A0h())) {
            return false;
        }
        Object A02 = ufx.A11.A02();
        if (A02 != null) {
            CheckoutConfiguration checkoutConfiguration = ((ECPPaymentRequest) A02).A01;
            if (checkoutConfiguration == null || !checkoutConfiguration.A0H.contains(VDD.A0D)) {
                return false;
            }
            return true;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A0m(VG3 vg3, boolean z) {
        WGF.A01(vg3, null, this, Boolean.valueOf(z));
        if (z) {
            A0D(vg3, true);
            return;
        }
        if (this.A02 == VG3.A0Y) {
            A0j();
        }
        this.A02 = null;
        A09();
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [X.2GT, X.2GS] */
    public UFX(C66393UFe c66393UFe, UFC ufc, C66390UFb c66390UFb, UFP ufp, LoggingContext loggingContext, UFS ufs, C66392UFd c66392UFd, Q8g q8g, C66389UFa c66389UFa, C66391UFc c66391UFc, UFG ufg) {
        AbstractC167017dG.A1R(q8g, c66391UFc);
        C14360o3.A0B(c66390UFb, 4);
        AbstractC25229BEm.A1I(c66393UFe, 5, c66389UFa);
        AbstractC25233BEq.A0y(7, ufg, c66392UFd, ufp);
        C14360o3.A0B(ufs, 10);
        C14360o3.A0B(ufc, 11);
        this.A1P = loggingContext;
        this.A1S = q8g;
        this.A1U = c66391UFc;
        this.A1N = c66390UFb;
        this.A1K = c66393UFe;
        this.A1T = c66389UFa;
        this.A1V = ufg;
        this.A1R = c66392UFd;
        this.A1O = ufp;
        this.A1Q = ufs;
        this.A1L = ufc;
        this.A11 = new C2GS();
        WDV wdv = new WDV();
        this.A1M = wdv;
        this.A0o = wdv.A08;
        C2GS c2gs = new C2GS();
        this.A0u = c2gs;
        this.A0p = c2gs;
        this.A0q = new C58252li();
        this.A0w = new C2GS();
        this.A0z = new C2GS();
        this.A0t = new C2GS();
        this.A10 = new C2GS();
        this.A0x = new C2GS();
        C2GS c2gs2 = new C2GS();
        this.A0s = c2gs2;
        this.A0n = c2gs2;
        this.A0y = new C2GS();
        C09530e4 A00 = WDM.A00(EnumC129485tD.A09, false);
        C09530e4 A002 = WDM.A00(EnumC129485tD.A0B, false);
        C09530e4 A003 = WDM.A00(EnumC129485tD.A0H, false);
        C09530e4 A004 = WDM.A00(EnumC129485tD.A0E, false);
        C09530e4 A005 = WDM.A00(EnumC129485tD.A0C, false);
        C09530e4 A006 = WDM.A00(EnumC129485tD.A0L, false);
        C09530e4 A007 = WDM.A00(EnumC129485tD.A0K, false);
        C09530e4 A008 = WDM.A00(EnumC129485tD.A07, false);
        C09530e4 A009 = WDM.A00(EnumC129485tD.A0I, false);
        EnumC129485tD enumC129485tD = EnumC129485tD.A0J;
        C09530e4 A0010 = WDM.A00(enumC129485tD, true);
        EnumC129485tD enumC129485tD2 = EnumC129485tD.A0D;
        C09530e4 A0011 = WDM.A00(enumC129485tD2, true);
        EnumC129485tD enumC129485tD3 = EnumC129485tD.A05;
        this.A1Y = AbstractC06930Yk.A06(A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, WDM.A00(enumC129485tD3, true), WDM.A00(EnumC129485tD.A06, false));
        this.A1c = AbstractC16960so.A1Q(enumC129485tD, enumC129485tD2, enumC129485tD3);
        this.A01 = new C2GT(C63406Sjd.A03(null));
        this.A0v = new C2GS();
        this.A0H = C63406Sjd.A03(null);
        this.A0P = C63406Sjd.A03(null);
        CurrencyAmount currencyAmount = new CurrencyAmount("", "");
        CurrencyAmount currencyAmount2 = new CurrencyAmount("", "");
        VG3 vg3 = VG3.A0g;
        C16930sl c16930sl = C16930sl.A00;
        Integer num = C05F.A00;
        this.A0g = C63406Sjd.A03(new PuxOrderSummaryItem(currencyAmount, currencyAmount2, vg3, new ItemDetails(num, null), null, null, c16930sl, 0, false, false, false));
        this.A0N = C63406Sjd.A03(new PuxPaymentMethodItem(VG3.A0h, null, null, false, true));
        VG3 vg32 = VG3.A0c;
        this.A0I = C63406Sjd.A03(new PuxContactItem(vg32, null, null, null, null, null, null, false));
        this.A0Q = C63406Sjd.A03(new PuxShippingAddressItem(VG3.A0l, null, null, null, null, false));
        this.A0J = C63406Sjd.A03(new PuxFulfillmentOptionItem(VG3.A0e, null, num, null, false, false));
        this.A0O = C63406Sjd.A03(new PuxContactItem(vg32, null, null, null, null, null, null, false));
        this.A0M = C63406Sjd.A03(new PayButtonItem(new CurrencyAmount("", ""), VG3.A0T, null, false));
        this.A0R = C63406Sjd.A03(new PuxTermsConditionItem(null, null, null, null, VG3.A0m, null, null, null, null, false));
        this.A0l = AbstractC06930Yk.A0E();
        this.A0K = C63406Sjd.A03(new IncentiveItem(VG3.A0f, c16930sl, 0, true));
        this.A0L = C63406Sjd.A03(new IncentiveSummaryItem(VG3.A0J, c16930sl, 0));
        VG3 vg33 = VG3.A0a;
        C63406Sjd c63406Sjd = this.A0Q;
        C14360o3.A0C(c63406Sjd, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0F = C63406Sjd.A03(new PuxAccordionItem(vg33, null, c63406Sjd, c16930sl, false));
        VG3 vg34 = VG3.A0Y;
        C63406Sjd c63406Sjd2 = this.A0N;
        C14360o3.A0C(c63406Sjd2, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0D = C63406Sjd.A03(new PuxAccordionItem(vg34, null, c63406Sjd2, c16930sl, false));
        VG3 vg35 = VG3.A0V;
        C63406Sjd c63406Sjd3 = this.A0I;
        C14360o3.A0C(c63406Sjd3, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0A = C63406Sjd.A03(new PuxAccordionItem(vg35, null, c63406Sjd3, c16930sl, false));
        VG3 vg36 = VG3.A0W;
        C63406Sjd c63406Sjd4 = this.A0J;
        C14360o3.A0C(c63406Sjd4, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0B = C63406Sjd.A03(new PuxAccordionItem(vg36, null, c63406Sjd4, c16930sl, false));
        VG3 vg37 = VG3.A0Z;
        C63406Sjd c63406Sjd5 = this.A0O;
        C14360o3.A0C(c63406Sjd5, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0E = C63406Sjd.A03(new PuxAccordionItem(vg37, null, c63406Sjd5, c16930sl, false));
        VG3 vg38 = VG3.A0X;
        C63406Sjd c63406Sjd6 = this.A0g;
        C14360o3.A0C(c63406Sjd6, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>");
        this.A0f = C63406Sjd.A03(new PuxAccordionItem(vg38, null, c63406Sjd6, c16930sl, false));
        this.A0G = C63406Sjd.A03(new AnonCheckoutPuxLink(null, VG3.A09, false));
        this.A07 = C63406Sjd.A03(new InlineBackButtonItem(VG3.A0L, null));
        this.A09 = C63406Sjd.A03(new EmailOptInItem(null, VG3.A0H, null, false, false));
        this.A1W = C63406Sjd.A04(new InvisibleHeaderItem(VG3.A0M));
        this.A04 = new C69588Vrr(c16930sl);
        this.A0S = C63406Sjd.A03(null);
        this.A1X = new LinkedHashMap();
        this.A1H = new C70302WQh(this, 29);
        this.A1G = new C70302WQh(this, 28);
        this.A16 = new C70302WQh(this, 17);
        this.A15 = new C70302WQh(this, 16);
        this.A1F = new C70302WQh(this, 27);
        this.A1E = new C70302WQh(this, 26);
        this.A1B = new C70302WQh(this, 22);
        this.A1a = new C70302WQh(this, 14);
        this.A1Z = new C70302WQh(this, 13);
        this.A1D = new C70302WQh(this, 24);
        this.A1C = new C70302WQh(this, 23);
        this.A13 = new C70302WQh(this, 12);
        this.A12 = new C70302WQh(this, 11);
        this.A18 = new C70302WQh(this, 19);
        this.A17 = new C70302WQh(this, 18);
        this.A14 = new C70302WQh(this, 15);
        this.A1A = new C70302WQh(this, 21);
        this.A1b = new C70302WQh(this, 31);
        C58252li c58252li = new C58252li();
        C63406Sjd.A0D(c58252li, new C68928VeS(false, false));
        this.A0r = c58252li;
        this.A19 = new C70302WQh(this, 20);
        this.A1I = new C70302WQh(this, 30);
        this.A1J = new C70302WQh(this, 32);
        C2FP.A01().A08.A00.A09(new C65991Txk(4, new X59(this, 5)));
    }
}
