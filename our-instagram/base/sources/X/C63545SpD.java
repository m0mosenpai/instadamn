package X;

import androidx.fragment.app.Fragment;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.logging.LoggingPolicy;
import com.facebookpay.paymentmethod.model.PayPalCredential;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.facebookpay.paypal.model.LinkableTextParams;
import com.facebookpay.paypal.model.PaypalConsentLaunchParams;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

/* renamed from: X.SpD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63545SpD implements C1N8 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C63545SpD(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C62731SNv c62731SNv;
        C62643SKa c62643SKa;
        C62731SNv c62731SNv2;
        FBPayIGGraphQLQueryExecutor A00;
        PandoGraphQLRequest build;
        C2n2 c2n2;
        C63019Saj c63019Saj;
        SLG A002;
        Object obj2;
        C2JS c2js;
        R0Z r0z;
        String A0h;
        C2JS A04;
        Enum r3;
        switch (this.A00) {
            case 0:
                C2GT c2gt = (C2GT) this.A01;
                C63406Sjd.A0D(c2gt, null);
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
                C14360o3.A0A(obj);
                interfaceC16660sJ.invoke(obj);
                return c2gt;
            case 1:
                c62731SNv = (C62731SNv) obj;
                C14360o3.A0B(c62731SNv, 0);
                c62643SKa = ((C62432SBh) this.A02).A00;
                c63019Saj = (C63019Saj) this.A01;
                A002 = new SLG(0L, 0L);
                return c62643SKa.A00(c62731SNv, A002, c63019Saj);
            case 2:
                c62731SNv2 = (C62731SNv) obj;
                C14360o3.A0B(c62731SNv2, 0);
                GraphQlCallInput graphQlCallInput = (GraphQlCallInput) this.A01;
                C14360o3.A0B(graphQlCallInput, 1);
                A00 = C58443PvM.A00();
                C14360o3.A07(A00);
                try {
                    C64046SyI c64046SyI = (C64046SyI) AbstractC50523MSb.A0R("create", SRG.class);
                    AbstractC58318PtA.A1K(graphQlCallInput, c64046SyI.A00);
                    c64046SyI.A01 = true;
                    build = c64046SyI.build();
                    c2n2 = T7Z.A00;
                    return C60622REh.A00(c62731SNv2, A00, build, c2n2);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw AbstractC58318PtA.A0f(e);
                }
            case 3:
                c62731SNv = (C62731SNv) obj;
                C14360o3.A0B(c62731SNv, 0);
                c62643SKa = ((ECPRepositoryImpl) this.A02).A05;
                c63019Saj = (C63019Saj) this.A01;
                A002 = AbstractC62185S1g.A00("PRODUCT_SDK_DEFAULT_COMPONENT");
                return c62643SKa.A00(c62731SNv, A002, c63019Saj);
            case 4:
                ImmutableList requiredCompactedTreeListField = ((C2JS) obj).getRequiredCompactedTreeListField(0, "step_up_requirements", QRF.class, -1385379362);
                PaymentMethod paymentMethod = null;
                if (requiredCompactedTreeListField == null) {
                    return null;
                }
                Iterator<E> it = requiredCompactedTreeListField.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        C2JS reinterpretIfFulfillsType = ((C2JS) obj2).reinterpretIfFulfillsType(0, "PAYFBPayMIBToCIBStepUp", QTQ.class, -1229562524);
                        if (reinterpretIfFulfillsType != null) {
                            r3 = reinterpretIfFulfillsType.getOptionalEnumField(0, "step_up_type", EnumC61205Rh5.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                        } else {
                            r3 = null;
                        }
                        if (r3 == EnumC61205Rh5.MIB_TO_CIB_PAYPAL) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                C2JS c2js2 = (C2JS) obj2;
                if (c2js2 == null) {
                    return null;
                }
                C2FP.A01();
                AbstractC10360h2 childFragmentManager = ((Fragment) this.A01).getChildFragmentManager();
                if (childFragmentManager == null) {
                    throw AbstractC166987dD.A12("Input fragment or fragmentActivity cannot be null");
                }
                C2JS reinterpretIfFulfillsType2 = c2js2.reinterpretIfFulfillsType(0, "PAYFBPayMIBToCIBStepUp", QTQ.class, -1229562524);
                if (reinterpretIfFulfillsType2 != null && (A04 = reinterpretIfFulfillsType2.A04(QTP.class, "paypal_consent_bottom_sheet", -953997546)) != null) {
                    c2js = A04.reinterpretRequired(0, QRU.class, -249277202);
                } else {
                    c2js = null;
                }
                if (c2js != null) {
                    UFX ufx = (UFX) this.A02;
                    C2GS c2gs = ufx.A11;
                    Object A02 = c2gs.A02();
                    if (A02 != null) {
                        String str = ((ECPPaymentRequest) A02).A0A;
                        Object A022 = c2gs.A02();
                        if (A022 != null) {
                            String str2 = ((ECPPaymentRequest) A022).A08;
                            PuxPaymentMethodItem puxPaymentMethodItem = (PuxPaymentMethodItem) ufx.A0N.A01;
                            if (puxPaymentMethodItem != null) {
                                paymentMethod = puxPaymentMethodItem.A01;
                            }
                            C14360o3.A0C(paymentMethod, "null cannot be cast to non-null type com.facebookpay.paymentmethod.model.PayPalCredential");
                            String AtA = ((PayPalCredential) paymentMethod).AtA();
                            C2GT c2gt2 = ufx.A00;
                            if (c2gt2 == null) {
                                C14360o3.A0F("_loggingPolicy");
                                throw C00O.createAndThrow();
                            }
                            LoggingPolicy loggingPolicy = (LoggingPolicy) c2gt2.A02();
                            Object A023 = c2gs.A02();
                            if (A023 != null) {
                                boolean z = ((ECPPaymentRequest) A023).A0B;
                                C14360o3.A0B(AtA, 3);
                                C2JS optionalTreeField = c2js.getOptionalTreeField(3, "paypal_policy", QRT.class, 53725783);
                                String str3 = "";
                                LinkableTextParams linkableTextParams = null;
                                if (optionalTreeField != null && (r0z = (R0Z) optionalTreeField.reinterpretRequired(0, R0Z.class, 1825808236)) != null && (A0h = AbstractC58318PtA.A0h(r0z)) != null) {
                                    Object[] objArr = {c2js.getOptionalStringField(0, DevServerEntity.COLUMN_DESCRIPTION), ""};
                                    StringBuilder A1C = AbstractC166987dD.A1C();
                                    AbstractC126965oa.A01(null, "\n\n", A1C, objArr);
                                    str3 = A1C.toString();
                                    int coercedIntField = MSW.A0N(r0z.A0E(), 0).getCoercedIntField(1, "length");
                                    int coercedIntField2 = MSW.A0N(r0z.A0E(), 0).getCoercedIntField(2, "offset");
                                    ImmutableList A0E = r0z.A0E();
                                    C14360o3.A07(A0E);
                                    linkableTextParams = new LinkableTextParams(A0h, coercedIntField, coercedIntField2, AbstractC25226BEj.A1I(W6V.A00(A0E), 0));
                                }
                                return AbstractC62193S1o.A00(childFragmentManager, new PaypalConsentLaunchParams(loggingPolicy, linkableTextParams, str, str2, AtA, str3, c2js.getOptionalStringField(1, "header"), c2js.getOptionalStringField(6, "sub_header"), c2js.getOptionalStringField(2, "navigation_title"), c2js.A0B("primary_button_label"), c2js.A0C("secondary_button_label"), z));
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 5:
                c62731SNv = (C62731SNv) obj;
                C14360o3.A0B(c62731SNv, 0);
                c62643SKa = ((C62433SBj) this.A02).A00;
                c63019Saj = (C63019Saj) this.A01;
                A002 = new SLG(0L, 0L);
                return c62643SKa.A00(c62731SNv, A002, c63019Saj);
            case 6:
                c62731SNv2 = (C62731SNv) obj;
                C14360o3.A0B(c62731SNv2, 0);
                GraphQlCallInput graphQlCallInput2 = (GraphQlCallInput) this.A01;
                C14360o3.A0B(graphQlCallInput2, 1);
                A00 = C58443PvM.A00();
                C14360o3.A07(A00);
                try {
                    C64035Sy7 c64035Sy7 = (C64035Sy7) AbstractC50523MSb.A0R("create", SR2.class);
                    AbstractC58318PtA.A1K(graphQlCallInput2, c64035Sy7.A00);
                    c64035Sy7.A01 = true;
                    build = c64035Sy7.build();
                    c2n2 = C64274T7d.A00;
                    return C60622REh.A00(c62731SNv2, A00, build, c2n2);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                    throw AbstractC58318PtA.A0f(e2);
                }
            case 7:
                c62731SNv2 = (C62731SNv) obj;
                C14360o3.A0B(c62731SNv2, 0);
                GraphQlCallInput graphQlCallInput3 = (GraphQlCallInput) this.A01;
                C14360o3.A0B(graphQlCallInput3, 1);
                A00 = C58443PvM.A00();
                C14360o3.A07(A00);
                try {
                    C64060SyW c64060SyW = (C64060SyW) AbstractC50523MSb.A0R("create", SRX.class);
                    AbstractC58318PtA.A1K(graphQlCallInput3, c64060SyW.A00);
                    c64060SyW.A01 = true;
                    build = c64060SyW.build();
                    c2n2 = C64276T7f.A00;
                    return C60622REh.A00(c62731SNv2, A00, build, c2n2);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                    throw AbstractC58318PtA.A0f(e3);
                }
            case 8:
                c62731SNv2 = (C62731SNv) obj;
                C14360o3.A0B(c62731SNv2, 0);
                GraphQlCallInput graphQlCallInput4 = (GraphQlCallInput) this.A01;
                C14360o3.A0B(graphQlCallInput4, 1);
                A00 = C58443PvM.A00();
                C14360o3.A07(A00);
                try {
                    C64056SyS c64056SyS = (C64056SyS) AbstractC50523MSb.A0R("create", SRS.class);
                    AbstractC58318PtA.A1K(graphQlCallInput4, c64056SyS.A00);
                    c64056SyS.A01 = true;
                    build = c64056SyS.build();
                    c2n2 = C64277T7g.A00;
                    return C60622REh.A00(c62731SNv2, A00, build, c2n2);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
                    throw AbstractC58318PtA.A0f(e4);
                }
            case 9:
                c62731SNv2 = (C62731SNv) obj;
                C14360o3.A0B(c62731SNv2, 0);
                GraphQlCallInput graphQlCallInput5 = (GraphQlCallInput) this.A01;
                C14360o3.A0B(graphQlCallInput5, 1);
                A00 = C58443PvM.A00();
                C14360o3.A07(A00);
                try {
                    C64055SyR c64055SyR = (C64055SyR) AbstractC50523MSb.A0R("create", SRQ.class);
                    AbstractC58318PtA.A1K(graphQlCallInput5, c64055SyR.A00);
                    c64055SyR.A01 = true;
                    build = c64055SyR.build();
                    c2n2 = C64275T7e.A00;
                    return C60622REh.A00(c62731SNv2, A00, build, c2n2);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e5) {
                    throw AbstractC58318PtA.A0f(e5);
                }
            default:
                IGPaymentMethodsAPI iGPaymentMethodsAPI = ((SMF) this.A01).A01;
                java.util.Set set = (java.util.Set) this.A02;
                C14360o3.A0B(set, 1);
                C1GJ.A03(new C60941Rbv((C62731SNv) obj, iGPaymentMethodsAPI, null, null, set));
                return iGPaymentMethodsAPI.A01;
        }
    }
}
