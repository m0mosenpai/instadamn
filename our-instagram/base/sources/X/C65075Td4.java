package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import com.facebook.avatar.expresso.webp.WebPEncoderImpl;
import com.facebook.cameracore.ardelivery.xplat.async.XplatAsyncMetadataCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.sparkvision.SparkVisionMetadataCallback;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.commonavatarliveediting.CdlProviderImpl;
import com.facebook.forker.Process;
import com.facebook.pando.TreeJNI;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.fbpay.w3c.Address;
import com.fbpay.w3c.CardDetails;
import com.google.common.collect.ImmutableList;
import com.instagram.modal.ModalActivity;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.json.JSONObject;

/* renamed from: X.Td4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65075Td4 extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;

    public static Object A00(Object obj, C65075Td4 c65075Td4) {
        C14360o3.A0B(obj, 0);
        return c65075Td4.A01;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65075Td4(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, C37838Gks c37838Gks) {
        SZC szc = (SZC) c37838Gks.A07;
        interfaceC02590Ai.AAP("package_name", ((AbstractC61599RqO) c37838Gks.A01).A00());
        interfaceC02590Ai.AAP("utm_source", szc.A05);
        interfaceC02590Ai.AAP("utm_medium", szc.A04);
        interfaceC02590Ai.AAP("utm_campaign", szc.A00);
        interfaceC02590Ai.AAP("utm_content", szc.A01);
        interfaceC02590Ai.AAP("utm_impression_id", szc.A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.SLV, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [X.SLV, java.lang.Object] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        Integer num;
        String str;
        int i;
        C2GS c2gs;
        InterfaceC02590Ai A0f;
        C14240no A0K;
        RiY riY;
        InterfaceC02530Ab interfaceC02530Ab;
        FbAutofillData fbAutofillData;
        ImmutableList coerceList;
        switch (this.A00) {
            case 0:
                String str2 = (String) obj;
                C14360o3.A0C(str2, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = ((JSONObject) this.A01).get(str2);
                C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
                return AbstractC166987dD.A1L(str2, obj2);
            case 1:
                List list = (List) obj;
                ArrayList A1E = AbstractC166987dD.A1E();
                if (list == null) {
                    return A1E;
                }
                java.util.Set set = (java.util.Set) this.A01;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Iterator A1J = AbstractC25226BEj.A1J(it.next());
                    while (A1J.hasNext()) {
                        FbAutofillData AIA = ((FbAutofillData) A1J.next()).AIA(set);
                        C14360o3.A0C(AIA, "null cannot be cast to non-null type T of com.facebook.android.instantexperiences.autofill.model.AutofillDataProvider.Companion.addDataToResultsWithWhitelistedFields");
                        Map map = ((BrowserExtensionsAutofillData) AIA).A00;
                        if (!map.isEmpty()) {
                            Iterator A15 = AbstractC166997dE.A15(map);
                            while (true) {
                                if (!A15.hasNext()) {
                                    break;
                                }
                                String str3 = (String) AbstractC31176DnK.A0j(A15);
                                if (str3 != null && str3.length() != 0) {
                                    Iterator it2 = A1E.iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            fbAutofillData = (FbAutofillData) it2.next();
                                            if (fbAutofillData.Cdx(AIA)) {
                                                A1E.remove(fbAutofillData);
                                            }
                                        }
                                        A1E.add(AIA);
                                    } while (!AIA.Cdx(fbAutofillData));
                                }
                            }
                        }
                    }
                }
                return A1E;
            case 2:
                C55601Omh c55601Omh = (C55601Omh) this.A01;
                if (c55601Omh.A01) {
                    if (obj != null) {
                        c55601Omh.A01 = false;
                    }
                    j = 0;
                } else {
                    j = 200;
                }
                return Long.valueOf(j);
            case 3:
                return new WebPEncoderImpl((C12W) this.A01, (int) (AbstractC166987dD.A09(obj) * 1000.0f));
            case 4:
                ((InterfaceC27201Tu) this.A01).cancel();
                return C0eB.A00;
            case 5:
                C6FW c6fw = (C6FW) obj;
                if (c6fw != null) {
                    Object A10 = MSW.A10(c6fw, 0);
                    C14360o3.A0C(A10, AbstractC43591JPw.A00(48));
                    Map map2 = (Map) A10;
                    SOE soe = (SOE) this.A01;
                    C14360o3.A0B(map2, 0);
                    Address address = new Address(AbstractC166987dD.A1A("care_of", map2), AbstractC166987dD.A1A(ServerW3CShippingAddressConstants.CITY, map2), AbstractC166987dD.A1A("country", map2), AbstractC166987dD.A1A(PublicKeyCredentialControllerUtility.JSON_KEY_ID, map2), AbstractC166987dD.A1A(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, map2), AbstractC166987dD.A1A("street1", map2), AbstractC166987dD.A1A("street2", map2), AbstractC166987dD.A1A(ServerW3CShippingAddressConstants.POSTAL_CODE, map2));
                    String A1A = AbstractC166987dD.A1A("credential_id", map2);
                    String A1A2 = AbstractC166987dD.A1A("card_association_name", map2);
                    String A1A3 = AbstractC166987dD.A1A("expiry_month", map2);
                    Integer num2 = null;
                    if (A1A3 != null) {
                        num = AbstractC003100w.A0j(A1A3, 10);
                    } else {
                        num = null;
                    }
                    String A1A4 = AbstractC166987dD.A1A("expiry_year", map2);
                    if (A1A4 != null) {
                        num2 = AbstractC003100w.A0j(A1A4, 10);
                    }
                    soe.A0B.A0I(new SYH(null, new CardDetails(address, null, (Boolean) map2.get("is_default"), num, num2, A1A2, AbstractC166987dD.A1A("card_image_url", map2), AbstractC166987dD.A1A("card_number", map2), A1A, AbstractC166987dD.A1A("csc", map2), AbstractC166987dD.A1A("last_four_digits", map2))));
                    soe.A08.A00.A0M.A02 = C05F.A0C;
                    soe.A00();
                }
                return C0eB.A00;
            case 6:
                ((InterfaceC65482Tkz) this.A01).onDecline();
                return C0eB.A00;
            case 7:
                QEC qec = (QEC) this.A01;
                CardDetails cardDetails = (CardDetails) qec.A0I().A05.A02();
                if (cardDetails != null) {
                    str = cardDetails.A05;
                } else {
                    str = null;
                }
                EnumC61219RhJ A01 = C63156Se5.A01(str);
                EnumC61219RhJ enumC61219RhJ = EnumC61219RhJ.A0B;
                EditText editText = qec.A05;
                if (A01 == enumC61219RhJ) {
                    if (editText != null) {
                        i = R.string.res_0x7f130034_name_removed;
                    }
                    return C0eB.A00;
                }
                if (editText != null) {
                    i = R.string.res_0x7f130033_name_removed;
                }
                return C0eB.A00;
                editText.setHint(i);
                return C0eB.A00;
            case 8:
                c2gs = ((QEC) A00(obj, this)).A0I().A06;
                c2gs.A0B(obj);
                return C0eB.A00;
            case 9:
                c2gs = ((QEE) A00(obj, this)).A0I().A0B;
                c2gs.A0B(obj);
                return C0eB.A00;
            case 10:
                c2gs = ((QEE) A00(obj, this)).A0I().A0A;
                c2gs.A0B(obj);
                return C0eB.A00;
            case 11:
                if (obj != null) {
                    C58883QEt c58883QEt = ((SOE) this.A01).A0A;
                    if (c58883QEt.A03() != null && ((AbstractC63223SfY) c58883QEt).A00 != null) {
                        C6XJ.A06(((AbstractC63223SfY) c58883QEt).A00, c58883QEt.A03(), ModalActivity.class, "browser_settings");
                    }
                }
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                Throwable th = (Throwable) obj;
                C14360o3.A0B(th, 0);
                ?? obj3 = new Object();
                obj3.A00 = C05F.A08;
                obj3.A02 = th;
                RkH A00 = obj3.A00();
                XplatAsyncMetadataCompletionCallback xplatAsyncMetadataCompletionCallback = ((SKM) this.A01).A00;
                String message = A00.getMessage();
                if (message == null) {
                    message = "Failed to retrieve blockv5 metadata";
                }
                xplatAsyncMetadataCompletionCallback.onFailure(message);
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                Throwable th2 = (Throwable) obj;
                SparkVisionMetadataCallback sparkVisionMetadataCallback = (SparkVisionMetadataCallback) A00(th2, this);
                ?? obj4 = new Object();
                obj4.A00 = C05F.A08;
                obj4.A02 = th2;
                sparkVisionMetadataCallback.onFailure(obj4.A00().toString());
                return C0eB.A00;
            case 14:
                OBR obr = (OBR) obj;
                CdlProviderImpl cdlProviderImpl = (CdlProviderImpl) A00(obr, this);
                cdlProviderImpl.A00 = obr;
                C51737MtK c51737MtK = cdlProviderImpl.A04.A01;
                if (c51737MtK != null) {
                    obr.A00.setQualityOverride(c51737MtK.A00, c51737MtK.A01);
                    cdlProviderImpl.A01 = c51737MtK;
                }
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                AbstractC46356Kfe abstractC46356Kfe = (AbstractC46356Kfe) obj;
                C14360o3.A0B(abstractC46356Kfe, 0);
                if (abstractC46356Kfe instanceof C44908JuM) {
                    LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder = ((C44908JuM) abstractC46356Kfe).A00;
                    C55555Olp c55555Olp = ((C51495Mog) this.A01).A06;
                    C14360o3.A0B(liveEditingRawMemoryPointerHolder, 0);
                    C55143Od2 c55143Od2 = c55555Olp.A00;
                    if (c55143Od2 == null) {
                        C14360o3.A0F("provider");
                        throw C00O.createAndThrow();
                    }
                    c55143Od2.A0E.A00.updateBlendWeightsForPrimitive(liveEditingRawMemoryPointerHolder);
                }
                return C0eB.A00;
            case 16:
                return Integer.valueOf(C2BS.A00(Double.valueOf(((C2BP) obj).A01), (Comparable) this.A01));
            case 17:
                AbstractC28368CfU abstractC28368CfU = (AbstractC28368CfU) obj;
                C14360o3.A0B(abstractC28368CfU, 0);
                if (abstractC28368CfU instanceof InterfaceC31102Dlk) {
                    AbstractC167007dF.A1K(abstractC28368CfU.A04.getValue(), ((InterfaceC31102Dlk) abstractC28368CfU).BMs().A00);
                    throw AbstractC166987dD.A15("counts");
                }
                return C0eB.A00;
            case 18:
                AbstractC28368CfU abstractC28368CfU2 = (AbstractC28368CfU) obj;
                boolean z = false;
                C14360o3.A0B(abstractC28368CfU2, 0);
                View view = (View) abstractC28368CfU2.A02;
                if (view.isShown() && view.isAttachedToWindow()) {
                    AbstractC25225BEi.A1U(this.A01, abstractC28368CfU2);
                    z = true;
                }
                return Boolean.valueOf(z);
            case Process.SIGSTOP /* 19 */:
                Object A002 = ((C2V9) A00(obj, this)).A00(obj);
                C14360o3.A0C(A002, "null cannot be cast to non-null type kotlin.Boolean");
                return A002;
            case 20:
                C27861CPy c27861CPy = (C27861CPy) obj;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) A00(c27861CPy, this);
                Exception exc = c27861CPy.A01;
                C14360o3.A06(exc);
                interfaceC16660sJ.invoke(exc);
                return C0eB.A00;
            case 21:
                CW9 cw9 = (CW9) obj;
                return Boolean.valueOf(((java.util.Set) A00(cw9, this)).contains(cw9.A01));
            case 22:
                ((C51762Yz) this.A01).A01(new CV1(((CV1) obj).A00));
                return C0eB.A00;
            case 23:
                C2YN c2yn = (C2YN) obj;
                C26599Bow c26599Bow = (C26599Bow) A00(c2yn, this);
                c2yn.A03(new C30712DfA(c26599Bow, 14), new Object[]{c26599Bow.A00, c26599Bow.A01});
                return C0eB.A00;
            case 24:
                View view2 = (View) obj;
                C14360o3.A0B(view2, 0);
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                C14360o3.A0C(layoutParams, AbstractC111324zv.A00(17));
                int layoutPosition = ((C3OP) layoutParams).mViewHolder.getLayoutPosition();
                C2Z7 c2z7 = ((C170197iY) this.A01).A0A;
                view2.measure(c2z7.And(layoutPosition), c2z7.And(layoutPosition));
                return C0eB.A00;
            case 25:
                C2XB c2xb = (C2XB) obj;
                C65850TvB c65850TvB = (C65850TvB) A00(c2xb, this);
                MotionEvent motionEvent = c2xb.A00;
                C14360o3.A06(motionEvent);
                return Boolean.valueOf(c65850TvB.A00(motionEvent));
            case 26:
                return Boolean.valueOf(((C65891Tvv) this.A01).A0K);
            case 27:
                boolean A1a = AbstractC166987dD.A1a(obj);
                LJd lJd = (LJd) this.A01;
                lJd.A07 = A1a;
                if (!A1a) {
                    Runnable runnable = lJd.A05;
                    if (runnable != null) {
                        LJd.A01(lJd, runnable, AbstractC43591JPw.A00(706));
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                return C0eB.A00;
            case 28:
                String A1B = AnonymousClass001.A1B("{\"should_continue_checkout\":\"", "\"}", AbstractC166987dD.A1a(obj));
                QJl qJl = (QJl) this.A01;
                AbstractC63399SjU abstractC63399SjU = qJl.A01;
                if (abstractC63399SjU != null) {
                    String str4 = qJl.A0B;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = qJl.A0A;
                    long j2 = qJl.A06;
                    String str6 = qJl.A03;
                    String str7 = qJl.A09;
                    String str8 = qJl.A02;
                    C14360o3.A0B(str4, 0);
                    AbstractC25233BEq.A0w(1, str5, str6, str7);
                    C14360o3.A0B(A1B, 6);
                    A0f = AbstractC166987dD.A0f(abstractC63399SjU.A0C(), "client_load_metacheckoutsdk_warning");
                    if (A0f.isSampled()) {
                        A0f.AAP(AbstractC50531MSk.A01(), str5);
                        AbstractC58321PtD.A1E(AbstractC63399SjU.A01(abstractC63399SjU), A0f);
                        C0Zx c0Zx = new C0Zx();
                        AbstractC63399SjU.A09(c0Zx, abstractC63399SjU, "continue_checkout_callback");
                        AbstractC58322PtE.A1H(A0f, c0Zx, AbstractC25232BEp.A1F("csp_version", "2024-10", AbstractC166987dD.A1L("shopify_sdk_payload", A1B), AbstractC63399SjU.A06(str6)));
                        C0Zx c0Zx2 = new C0Zx();
                        AbstractC63399SjU.A0B(c0Zx2, str8, str4, j2);
                        AbstractC63399SjU.A07(A0f, c0Zx2, abstractC63399SjU, str4, str7);
                        A0f.Cht();
                    }
                }
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                String str9 = (String) obj;
                C47469Kxy c47469Kxy = (C47469Kxy) A00(str9, this);
                String A0E = AnonymousClass001.A0E(str9, ' ', ' ');
                L0X l0x = c47469Kxy.A00.A00;
                if (!A0E.isEmpty()) {
                    C47921LEq c47921LEq = l0x.A00;
                    C47921LEq c47921LEq2 = c47921LEq;
                    for (char c : A0E.toCharArray()) {
                        if (l0x.A01.A00) {
                            c = Character.toLowerCase(c);
                        }
                        Character valueOf = Character.valueOf(c);
                        Map map3 = c47921LEq.A03;
                        c47921LEq = (C47921LEq) map3.get(valueOf);
                        if (c47921LEq == null) {
                            c47921LEq = new C47921LEq(c47921LEq2.A02 + 1);
                            map3.put(valueOf, c47921LEq);
                        }
                        c47921LEq2 = c47921LEq;
                    }
                    C49806LzD c49806LzD = new C49806LzD(A0E);
                    java.util.Set set2 = c47921LEq.A00;
                    if (set2 == null) {
                        set2 = new TreeSet();
                        c47921LEq.A00 = set2;
                    }
                    set2.add(c49806LzD);
                }
                return C0eB.A00;
            case 30:
                ((C15100pQ) this.A01).A00++;
                return C0eB.A00;
            case 31:
                return new Q8Y((C37838Gks) this.A01);
            case 32:
                InterfaceC16660sJ interfaceC16660sJ2 = ((QKE) ((AbstractC60733ROs) this.A01)).A06;
                C14360o3.A0A(obj);
                interfaceC16660sJ2.invoke(obj);
                return C0eB.A00;
            case 33:
                InterfaceC65210Tfy interfaceC65210Tfy = (InterfaceC65210Tfy) obj;
                try {
                    if (interfaceC65210Tfy instanceof InterfaceC65654TqT) {
                        AbstractC60733ROs abstractC60733ROs = (AbstractC60733ROs) this.A01;
                        InterfaceC65654TqT interfaceC65654TqT = (InterfaceC65654TqT) interfaceC65210Tfy;
                        QKE qke = (QKE) abstractC60733ROs;
                        InterfaceC65489TlA interfaceC65489TlA = qke.A05;
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        A1C.append("Error Type = ");
                        EnumC61155RgG B2b = interfaceC65654TqT.B2b();
                        interfaceC65489TlA.EmN("OxygenInstallSDK_ErrorState", AbstractC166997dE.A0v(B2b, A1C));
                        if (B2b != EnumC61155RgG.NETWORK_CONNECTION && ((interfaceC65654TqT instanceof InterfaceC65652TqR) || (interfaceC65654TqT instanceof QKL))) {
                            AbstractC10360h2 childFragmentManager = abstractC60733ROs.getChildFragmentManager();
                            C14360o3.A07(childFragmentManager);
                            int i2 = ((QIw) qke.A02.A02).A01;
                            if (!(childFragmentManager.A0O(i2) instanceof Q7f)) {
                                C14240no A0K2 = AbstractC58323PtF.A0K(abstractC60733ROs);
                                A0K2.A0G(Q7f.class, i2);
                                A0K2.A00();
                            }
                            AbstractC10360h2 childFragmentManager2 = abstractC60733ROs.getChildFragmentManager();
                            C14360o3.A07(childFragmentManager2);
                            new Q7c().A0B(childFragmentManager2, "CancelDialogFragment");
                        } else {
                            abstractC60733ROs.A0G();
                        }
                    } else {
                        if (interfaceC65210Tfy instanceof InterfaceC65652TqR) {
                            AbstractC60733ROs abstractC60733ROs2 = (AbstractC60733ROs) this.A01;
                            AbstractC10360h2 childFragmentManager3 = abstractC60733ROs2.getChildFragmentManager();
                            int A003 = QIw.A00(childFragmentManager3, abstractC60733ROs2);
                            if (!(childFragmentManager3.A0O(A003) instanceof Q7f)) {
                                A0K = AbstractC58323PtF.A0K(abstractC60733ROs2);
                                A0K.A0G(Q7f.class, A003);
                            }
                        } else if (interfaceC65210Tfy instanceof InterfaceC65653TqS) {
                            AbstractC60733ROs abstractC60733ROs3 = (AbstractC60733ROs) this.A01;
                            AbstractC10360h2 childFragmentManager4 = abstractC60733ROs3.getChildFragmentManager();
                            int A004 = QIw.A00(childFragmentManager4, abstractC60733ROs3);
                            if (!(childFragmentManager4.A0O(A004) instanceof C58754Q7g)) {
                                A0K = AbstractC58323PtF.A0K(abstractC60733ROs3);
                                A0K.A0G(C58754Q7g.class, A004);
                            }
                        } else if (interfaceC65210Tfy instanceof QKJ) {
                            AbstractC60733ROs.A01((AbstractC60733ROs) this.A01);
                        } else {
                            AbstractC60733ROs abstractC60733ROs4 = (AbstractC60733ROs) this.A01;
                            InterfaceC65489TlA interfaceC65489TlA2 = ((QKE) abstractC60733ROs4).A05;
                            StringBuilder A1C2 = AbstractC166987dD.A1C();
                            interfaceC65489TlA2.EmN("OxygenInstallSDK_UnknownState", AbstractC166997dE.A0v(AbstractC58318PtA.A0X(interfaceC65210Tfy, "state isn't supported = ", A1C2), A1C2));
                            abstractC60733ROs4.A07();
                        }
                        A0K.A00();
                    }
                } catch (Throwable th3) {
                    AbstractC60733ROs abstractC60733ROs5 = (AbstractC60733ROs) this.A01;
                    ((QKE) abstractC60733ROs5).A05.EmQ("OxygenInstallSDK_UnexpectedException", th3);
                    abstractC60733ROs5.A0G();
                }
                return C0eB.A00;
            case 34:
                C37838Gks c37838Gks = (C37838Gks) obj;
                InterfaceC02550Ad interfaceC02550Ad = ((QKE) A00(c37838Gks, this)).A00;
                if (interfaceC02550Ad != null) {
                    Number number = (Number) c37838Gks.A04;
                    if (number == C05F.A15) {
                        A0f = MSY.A0H(interfaceC02550Ad, "preloads_impression");
                        if (A0f.isSampled()) {
                            switch (AbstractC166987dD.A0H(c37838Gks.A02)) {
                                case 0:
                                    interfaceC02530Ab = Ria.BOTTOMSHEET_INSTALL;
                                    break;
                                case 1:
                                    interfaceC02530Ab = Ria.BOTTOMSHEET_INSTALL_FLOW_STARTED;
                                    break;
                                case 2:
                                    interfaceC02530Ab = Ria.BOTTOMSHEET_CANCEL_DIALOG;
                                    break;
                                case 3:
                                    interfaceC02530Ab = Ria.BOTTOMSHEET_ERROR_DIALOG;
                                    break;
                                case 4:
                                    interfaceC02530Ab = Ria.BOTTOMSHEET_PRODUCT_DETAILS;
                                    break;
                                case 5:
                                    break;
                                default:
                                    throw B4Z.A00();
                            }
                            A01(A0f, c37838Gks);
                        }
                    } else if (c37838Gks.A06 == C05F.A00) {
                        A0f = MSY.A0H(interfaceC02550Ad, "preloads_tap");
                        if (A0f.isSampled()) {
                            switch (number.intValue()) {
                                case 0:
                                    riY = RiY.TAP_INSTALL;
                                    break;
                                case 1:
                                    riY = RiY.TAP_CANCEL;
                                    break;
                                case 2:
                                    riY = RiY.TAP_VIEW_MORE;
                                    break;
                                case 3:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                                    break;
                                case 4:
                                    riY = RiY.TAP_GO_BACK;
                                    break;
                                default:
                                    throw B4Z.A00();
                            }
                            switch (AbstractC166987dD.A0H(c37838Gks.A02)) {
                                case 0:
                                    interfaceC02530Ab = Rib.BOTTOMSHEET_INSTALL;
                                    break;
                                case 1:
                                    interfaceC02530Ab = Rib.BOTTOMSHEET_INSTALL_FLOW_STARTED;
                                    break;
                                case 2:
                                    interfaceC02530Ab = Rib.BOTTOMSHEET_CANCEL_DIALOG;
                                    break;
                                case 3:
                                    interfaceC02530Ab = Rib.BOTTOMSHEET_ERROR_DIALOG;
                                    break;
                                case 4:
                                    interfaceC02530Ab = Rib.BOTTOMSHEET_PRODUCT_DETAILS;
                                    break;
                                case 5:
                                    break;
                                default:
                                    throw B4Z.A00();
                            }
                            A01(A0f, c37838Gks);
                            A0f.A8R(riY, "action");
                        }
                    }
                    A0f.A8R(interfaceC02530Ab, AbstractC43591JPw.A00(32));
                    A0f.Cht();
                }
                return C0eB.A00;
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            default:
                coerceList = ((C2JS) this.A01).coerceList(obj);
                return coerceList;
            case 40:
                return TreeJNI.parseEnum((String) obj, (Enum) this.A01);
            case Seq.NULL_REFNUM /* 41 */:
                InterfaceC65312Tho interfaceC65312Tho = (InterfaceC65312Tho) obj;
                interfaceC65312Tho.CuS((SYG) A00(interfaceC65312Tho, this));
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                InterfaceC65344TiR interfaceC65344TiR = (InterfaceC65344TiR) obj;
                interfaceC65344TiR.DOT((SYG) A00(interfaceC65344TiR, this));
                return C0eB.A00;
            case 43:
            case 44:
                InterfaceC65468Tkk interfaceC65468Tkk = (InterfaceC65468Tkk) obj;
                interfaceC65468Tkk.CzM((SYG) A00(interfaceC65468Tkk, this));
                return C0eB.A00;
            case 45:
                C2YN c2yn2 = (C2YN) obj;
                Object A005 = A00(c2yn2, this);
                c2yn2.A02(new C30193DRy(A005, 30), new Object[]{A005});
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                Matrix matrix = (Matrix) obj;
                ((Path) A00(matrix, this)).transform(matrix);
                return C0eB.A00;
            case 47:
            case 48:
                ((C15370ps) A00(obj, this)).A00 = obj;
                return C0eB.A00;
            case 49:
                View view3 = (View) obj;
                C14360o3.A0B(view3, 0);
                return C47968LIc.A00(view3, "mOnContextClickListener");
        }
    }
}
