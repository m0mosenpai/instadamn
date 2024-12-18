package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebookpay.confirmation.model.ECPConfirmationParams;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.FulfillmentOptions;
import com.facebookpay.expresscheckout.models.ShippingOptions;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.fbpay.theme.FBPayIcon;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public final class X2x extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X2x(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context;
        int i;
        String str;
        Bundle bundle;
        Fragment fragment;
        boolean z;
        String str2;
        C67729Uwv c67729Uwv;
        C67727Uwt c67727Uwt;
        Integer num;
        C2JS c2js;
        ECPConfirmationConfiguration eCPConfirmationConfiguration;
        C63406Sjd c63406Sjd;
        FormCellLoggingEvents formCellLoggingEvents;
        String str3;
        LoggingContext loggingContext;
        LinkedHashMap A01;
        C25531Mh c25531Mh;
        int i2;
        FormCellLoggingEvents formCellLoggingEvents2;
        LinkedHashMap A012;
        String str4;
        int i3;
        InterfaceC16660sJ c65022Tc8;
        String str5;
        ShippingOptions shippingOptions;
        String str6;
        FulfillmentOptions fulfillmentOptions;
        switch (this.A00) {
            case 0:
                Wap wap = C2FP.A01().A04;
                UFX ufx = (UFX) this.A01;
                loggingContext = ufx.A1P;
                A012 = UFS.A01(ufx.A1Q);
                str4 = "pux_checkout";
                c25531Mh = new C25531Mh(MSY.A0H(wap.A00, "client_load_pricetable_init"), 92);
                i3 = 44;
                c65022Tc8 = new C65022Tc8(A012, loggingContext, str4, i3);
                Wap.A03(c25531Mh, loggingContext, c65022Tc8);
                return C0eB.A00;
            case 1:
                Wap wap2 = C2FP.A01().A04;
                UFX ufx2 = (UFX) this.A01;
                Wap.A02(new C25531Mh(MSY.A0H(wap2.A00, "client_load_shippingaddress_init"), 95), ufx2.A1P, UFS.A01(ufx2.A1Q), "selected_shipping_address", 47);
                return C0eB.A00;
            case 2:
                Wap wap3 = C2FP.A01().A04;
                UFX ufx3 = (UFX) this.A01;
                loggingContext = ufx3.A1P;
                TransactionInfo transactionInfo = (TransactionInfo) ufx3.A0S.A01;
                if (transactionInfo == null || (fulfillmentOptions = transactionInfo.A00) == null || (str6 = fulfillmentOptions.A00) == null) {
                    str6 = "";
                }
                LinkedHashMap A013 = UFS.A01(ufx3.A1Q);
                String A00 = AbstractC43591JPw.A00(1312);
                c25531Mh = new C25531Mh(MSY.A0H(wap3.A00, "client_load_fulfillmentoption_init"), 77);
                c65022Tc8 = new C50371MLy(loggingContext, A013, str6, A00, 7);
                Wap.A03(c25531Mh, loggingContext, c65022Tc8);
                return C0eB.A00;
            case 3:
                Wap wap4 = C2FP.A01().A04;
                UFX ufx4 = (UFX) this.A01;
                LoggingContext loggingContext2 = ufx4.A1P;
                TransactionInfo transactionInfo2 = (TransactionInfo) ufx4.A0S.A01;
                if (transactionInfo2 == null || (shippingOptions = transactionInfo2.A03) == null || (str5 = shippingOptions.A00) == null) {
                    str5 = "";
                }
                Wap.A03(new C25531Mh(MSY.A0H(wap4.A00, "client_load_shippingoption_init"), 99), loggingContext2, new C50371MLy(loggingContext2, UFS.A01(ufx4.A1Q), str5, "selected_shipping_option", 10));
                return C0eB.A00;
            case 4:
                Wap wap5 = C2FP.A01().A04;
                UFX ufx5 = (UFX) this.A01;
                Wap.A02(new C25531Mh(MSY.A0H(wap5.A00, "client_load_credential_init"), 46), ufx5.A1P, UFS.A01(ufx5.A1Q), AbstractC58317Pt9.A00(51), 18);
                return C0eB.A00;
            case 5:
                Wap.A02(new C25531Mh(MSY.A0H(C2FP.A01().A04.A00, "client_load_entityitems_init"), 74), ((UFX) this.A01).A1P, null, "pux_checkout", 33);
                return C0eB.A00;
            case 6:
                Wap wap6 = C2FP.A01().A04;
                UFX ufx6 = (UFX) this.A01;
                Wap.A02(new C25531Mh(MSY.A0H(wap6.A00, "client_load_ordersummary_init"), 84), ufx6.A1P, UFS.A01(ufx6.A1Q), "pux_checkout", 39);
                return C0eB.A00;
            case 7:
                Wap wap7 = C2FP.A01().A04;
                loggingContext = ((UFX) this.A01).A1P;
                str3 = MSV.A00(200);
                A01 = null;
                c25531Mh = new C25531Mh(MSY.A0H(wap7.A00, "client_load_ecpemailoptin_init"), 67);
                i2 = 29;
                c65022Tc8 = new C65022Tc8(A01, loggingContext, str3, i2);
                Wap.A03(c25531Mh, loggingContext, c65022Tc8);
                return C0eB.A00;
            case 8:
                Wap wap8 = C2FP.A01().A04;
                UFX ufx7 = (UFX) this.A01;
                Wap.A02(new C25531Mh(MSY.A0H(wap8.A00, "client_load_contact_init"), 43), ufx7.A1P, UFS.A01(ufx7.A1Q), "selected_contact", 16);
                return C0eB.A00;
            case 9:
                Wap wap9 = C2FP.A01().A04;
                UFX ufx8 = (UFX) this.A01;
                loggingContext = ufx8.A1P;
                A012 = UFS.A01(ufx8.A1Q);
                str4 = "pux_checkout";
                c25531Mh = new C25531Mh(MSY.A0H(wap9.A00, "client_load_merchantheader_init"), 81);
                i3 = 36;
                c65022Tc8 = new C65022Tc8(A012, loggingContext, str4, i3);
                Wap.A03(c25531Mh, loggingContext, c65022Tc8);
                return C0eB.A00;
            case 10:
                Wap wap10 = C2FP.A01().A04;
                UFX ufx9 = (UFX) this.A01;
                wap10.A0c(ufx9.A1P, "choose_another_way", UFS.A01(ufx9.A1Q));
                return C0eB.A00;
            case 11:
                UvP uvP = (UvP) this.A01;
                UvM uvM = uvP.A01;
                if (uvM != null) {
                    uvM.A08.A0B(new ArrayList());
                    UvM uvM2 = uvP.A01;
                    if (uvM2 != null) {
                        uvM2.A0L();
                        UvM uvM3 = uvP.A01;
                        if (uvM3 != null) {
                            C58252li c58252li = uvM3.A07;
                            C70071W1o c70071W1o = (C70071W1o) c58252li.A02();
                            if (c70071W1o != null && FBPayIcon.A05 == c70071W1o.A00) {
                                c58252li.A0B(null);
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                UvM uvM4 = ((C67677Uvp) this.A01).A04;
                if (uvM4 != null) {
                    W4G w4g = ((AbstractC129435t5) uvM4).A00;
                    if (w4g != null && (formCellLoggingEvents2 = ((AbstractC129435t5) uvM4).A01) != null) {
                        str3 = formCellLoggingEvents2.A00.A03;
                        Wap wap11 = C2FP.A01().A04;
                        loggingContext = w4g.A00;
                        A01 = UFS.A01(w4g.A01);
                        C14360o3.A0B(loggingContext, 0);
                        c25531Mh = new C25531Mh(MSY.A0H(wap11.A00, "client_load_platformautofill_success"), 90);
                        i2 = 42;
                        c65022Tc8 = new C65022Tc8(A01, loggingContext, str3, i2);
                        Wap.A03(c25531Mh, loggingContext, c65022Tc8);
                    }
                    return C0eB.A00;
                }
                str = "viewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                UvM uvM5 = ((C67677Uvp) this.A01).A04;
                if (uvM5 != null) {
                    W4G w4g2 = ((AbstractC129435t5) uvM5).A00;
                    if (w4g2 != null && (formCellLoggingEvents = ((AbstractC129435t5) uvM5).A01) != null) {
                        str3 = formCellLoggingEvents.A00.A03;
                        Wap wap12 = C2FP.A01().A04;
                        loggingContext = w4g2.A00;
                        A01 = UFS.A01(w4g2.A01);
                        C14360o3.A0B(loggingContext, 0);
                        c25531Mh = new C25531Mh(MSY.A0H(wap12.A00, "client_load_platformautofill_init"), 89);
                        i2 = 41;
                        c65022Tc8 = new C65022Tc8(A01, loggingContext, str3, i2);
                        Wap.A03(c25531Mh, loggingContext, c65022Tc8);
                    }
                    return C0eB.A00;
                }
                str = "viewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 14:
                return new Waq();
            case Process.SIGTERM /* 15 */:
                return new War();
            case 16:
                return new Wau();
            case 17:
                return new Was();
            case 18:
                return new Wat();
            case Process.SIGSTOP /* 19 */:
                return new Wav();
            case 20:
                return new Wax();
            case 21:
                return new Way();
            case 22:
            case 26:
                return this.A01;
            case 23:
            case 27:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 24:
            case 28:
                return AbstractC167027dH.A0B(this.A01);
            case 25:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) ((C63167SeR) this.A01).A02();
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                }
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return ((CheckoutHandler) ((T2U) this.A01).A07.getValue()).A0S;
            case 30:
                ((View) this.A01).setVisibility(0);
                return C0eB.A00;
            case 31:
                c67727Uwt = (C67727Uwt) this.A01;
                num = C05F.A0Y;
                C67727Uwt.A06(c67727Uwt, num);
                return C0eB.A00;
            case 32:
                C67727Uwt c67727Uwt2 = (C67727Uwt) this.A01;
                UFX ufx10 = c67727Uwt2.A0B;
                str = "ecpViewModel";
                if (ufx10 != null) {
                    if (ufx10.A0q()) {
                        UFX ufx11 = c67727Uwt2.A0B;
                        if (ufx11 != null) {
                            ECPHandler eCPHandler = ufx11.A05;
                            if (eCPHandler != null && (c63406Sjd = (C63406Sjd) eCPHandler.E3o().A02()) != null) {
                                c2js = (C2JS) c63406Sjd.A01;
                            } else {
                                c2js = null;
                            }
                            Wap wap13 = C2FP.A01().A04;
                            LoggingContext loggingContext3 = ufx11.A1P;
                            C70073W1q A05 = ufx11.A1Q.A05();
                            ECPConfirmationParams eCPConfirmationParams = null;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            C70199WGm.A08(A05, linkedHashMap);
                            Wap.A03(new C25531Mh(MSY.A0H(wap13.A00, "client_load_ecpconfirmation_init"), 64), loggingContext3, new C65076Td9(46, loggingContext3, linkedHashMap));
                            C2GS c2gs = ufx11.A0s;
                            ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) ufx11.A11.A02();
                            R0Z r0z = null;
                            if (eCPPaymentRequest != null && (eCPConfirmationConfiguration = eCPPaymentRequest.A02) != null && c2js != null) {
                                C2JS A04 = c2js.A04(C59072QWe.class, "receipt_text", 1838321239);
                                if (A04 != null) {
                                    r0z = (R0Z) A04.reinterpretRequired(0, R0Z.class, 1825808236);
                                }
                                if (r0z != null) {
                                    String A08 = c2js.A08("confirmation_title");
                                    if (A08 != null) {
                                        String optionalStringField = c2js.getOptionalStringField(0, "confirmation_email_text");
                                        String optionalStringField2 = r0z.getOptionalStringField(0, "text");
                                        if (optionalStringField2 != null) {
                                            ImmutableList A0E = r0z.A0E();
                                            C14360o3.A07(A0E);
                                            eCPConfirmationParams = new ECPConfirmationParams(eCPConfirmationConfiguration.A00, A08, optionalStringField, optionalStringField2, (String) W6V.A00(A0E).get(0), c2js.A0A("upsell_pin_text"), eCPConfirmationConfiguration.A01);
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            c2gs.A0B(eCPConfirmationParams);
                        }
                    } else {
                        WGJ.A01(c67727Uwt2);
                        C2FP.A01().A04.A01.markerEnd(223884226, (short) 2);
                    }
                    return C0eB.A00;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 33:
                C67727Uwt c67727Uwt3 = (C67727Uwt) this.A01;
                if (c67727Uwt3.mView != null) {
                    UFX ufx12 = c67727Uwt3.A0B;
                    if (ufx12 != null) {
                        C07X viewLifecycleOwner = c67727Uwt3.getViewLifecycleOwner();
                        new X2x(c67727Uwt3, 32).invoke();
                        ufx12.A0k(viewLifecycleOwner);
                        ECPHandler eCPHandler2 = ufx12.A05;
                        if (eCPHandler2 != null) {
                            eCPHandler2.CJf(ufx12.A0q());
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    C14360o3.A0F("ecpViewModel");
                    throw C00O.createAndThrow();
                }
                return C0eB.A00;
            case 34:
                C67727Uwt c67727Uwt4 = (C67727Uwt) this.A01;
                if (!c67727Uwt4.A0D) {
                    c67727Uwt4.A0D = true;
                    c67727Uwt4.A00 = 0;
                    c67727Uwt4.A0F.postDelayed(c67727Uwt4.A0W, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                    UFX ufx13 = c67727Uwt4.A0B;
                    if (ufx13 != null) {
                        if (C18U.A06(C06090Tz.A06, C2FP.A0D().A00, 36313501812918322L)) {
                            AbstractC167007dF.A0J().postDelayed(new RunnableC71281WrB(ufx13), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                        }
                    }
                    str = "ecpViewModel";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return C0eB.A00;
            case 35:
            case 37:
                C67727Uwt c67727Uwt5 = (C67727Uwt) this.A01;
                UFX ufx14 = c67727Uwt5.A0B;
                if (ufx14 != null) {
                    ufx14.A1Q.A08(false);
                    bundle = new Bundle(c67727Uwt5.requireArguments());
                    fragment = c67727Uwt5.mParentFragment;
                    if (fragment != null) {
                        z = true;
                        str2 = "content_bottom_sheet_fragment";
                        WCw.A00(bundle, fragment, str2, z, z);
                        return C0eB.A00;
                    }
                    throw AbstractC166997dE.A0g();
                }
                C14360o3.A0F("ecpViewModel");
                throw C00O.createAndThrow();
            case 36:
                UFX ufx15 = ((C67727Uwt) this.A01).A0B;
                if (ufx15 != null) {
                    ufx15.A0o(true);
                    return C0eB.A00;
                }
                str = "ecpViewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 38:
                C67727Uwt c67727Uwt6 = (C67727Uwt) this.A01;
                ContextThemeWrapper contextThemeWrapper = c67727Uwt6.A01;
                if (contextThemeWrapper != null) {
                    AbstractC65702TsY.A0v(contextThemeWrapper, AbstractC69850Vwb.A00(new WHP(new X2x(c67727Uwt6, 37), 5), DialogInterfaceOnClickListenerC70212WHt.A00, 2131961319, 2131961318, 2131961317, 2131961439, 2131961303, 2), C2FP.A0H());
                    return C0eB.A00;
                }
                str = "viewContext";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 39:
                c67727Uwt = (C67727Uwt) this.A01;
                num = C05F.A00;
                C67727Uwt.A06(c67727Uwt, num);
                return C0eB.A00;
            case 40:
                C67727Uwt c67727Uwt7 = (C67727Uwt) this.A01;
                context = c67727Uwt7.A01;
                if (context != null) {
                    i = 39;
                    c67729Uwv = c67727Uwt7;
                    WF6.A02(context, new X2x(c67729Uwv, i), X4G.A00);
                    return C0eB.A00;
                }
                str = "viewContext";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case Seq.NULL_REFNUM /* 41 */:
                C67727Uwt c67727Uwt8 = (C67727Uwt) this.A01;
                UFX ufx16 = c67727Uwt8.A0B;
                if (ufx16 != null) {
                    ufx16.A1Q.A08(false);
                    bundle = new Bundle(c67727Uwt8.requireArguments());
                    fragment = c67727Uwt8.mParentFragment;
                    if (fragment != null) {
                        z = true;
                        str2 = "content_nux_fragment";
                        WCw.A00(bundle, fragment, str2, z, z);
                        return C0eB.A00;
                    }
                    throw AbstractC166997dE.A0g();
                }
                C14360o3.A0F("ecpViewModel");
                throw C00O.createAndThrow();
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C67727Uwt.A05((C67727Uwt) this.A01);
                return C0eB.A00;
            case 43:
                C67729Uwv c67729Uwv2 = (C67729Uwv) this.A01;
                return AbstractC69842VwS.A01(c67729Uwv2, C67729Uwv.A01(c67729Uwv2), (LoggingContext) c67729Uwv2.A06.getValue());
            case 44:
                C67729Uwv c67729Uwv3 = (C67729Uwv) this.A01;
                Dialog dialog = ((C0SG) c67729Uwv3).A01;
                if (dialog instanceof Q5b) {
                    ((Q5b) dialog).A07().A0W(3);
                }
                c67729Uwv3.A03 = false;
                return C0eB.A00;
            case 45:
                Parcelable parcelable = ((Fragment) this.A01).requireArguments().getParcelable("logging_context");
                C14360o3.A0C(parcelable, "null cannot be cast to non-null type com.facebookpay.logging.LoggingContext");
                return parcelable;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C67729Uwv c67729Uwv4 = (C67729Uwv) this.A01;
                return AbstractC69842VwS.A00(c67729Uwv4, C67729Uwv.A01(c67729Uwv4), (LoggingContext) c67729Uwv4.A06.getValue());
            case 47:
            default:
                ((C67729Uwv) this.A01).A0L(C05F.A00);
                return C0eB.A00;
            case 48:
                C67729Uwv c67729Uwv5 = (C67729Uwv) this.A01;
                if (C67729Uwv.A03(c67729Uwv5)) {
                    context = c67729Uwv5.A02;
                    if (context == null) {
                        str = "contextResourcesWrapper";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    i = 47;
                    c67729Uwv = c67729Uwv5;
                    WF6.A02(context, new X2x(c67729Uwv, i), X4G.A00);
                    return C0eB.A00;
                }
                c67729Uwv5.A07();
                return C0eB.A00;
        }
    }
}
