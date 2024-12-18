package com.instagram.inappbrowser.service;

import X.AbstractC08820cl;
import X.AbstractC111324zv;
import X.AbstractC12220kQ;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC25233BEq;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.AbstractC40691uc;
import X.AbstractC41071vF;
import X.AbstractC43592JPx;
import X.AbstractC43594JPz;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58323PtF;
import X.AbstractC61704RsL;
import X.AbstractC61732Rsn;
import X.AbstractC61814Ru8;
import X.AbstractC62279S4y;
import X.AbstractC62280S4z;
import X.AbstractC62773SQp;
import X.AbstractC63317ShP;
import X.AnonymousClass960;
import X.C04060Jx;
import X.C05F;
import X.C06090Tz;
import X.C0CA;
import X.C0K8;
import X.C0Zx;
import X.C0f9;
import X.C0w9;
import X.C106904rr;
import X.C11T;
import X.C12180kM;
import X.C12260kU;
import X.C14120nc;
import X.C14360o3;
import X.C18920wW;
import X.C18C;
import X.C18U;
import X.C1DW;
import X.C1LC;
import X.C1ON;
import X.C20J;
import X.C2JG;
import X.C2JM;
import X.C2JO;
import X.C32531EUh;
import X.C38321qM;
import X.C3R9;
import X.C58877QEn;
import X.C58896QHg;
import X.C59755Qlv;
import X.C59758Qly;
import X.C60497R0x;
import X.C60902RbH;
import X.C63953Swc;
import X.C64002SxZ;
import X.C64024Sxv;
import X.C64518THl;
import X.C64519THm;
import X.C64521THo;
import X.C6QM;
import X.C71679WyX;
import X.C907442n;
import X.C907542o;
import X.HandlerC50754MbK;
import X.InterfaceC02590Ai;
import X.InterfaceC08100bW;
import X.InterfaceC16660sJ;
import X.InterfaceC65349TiW;
import X.MSV;
import X.MSW;
import X.MSZ;
import X.OJR;
import X.OPK;
import X.OWg;
import X.QEK;
import X.Qm9;
import X.QmC;
import X.RcE;
import X.Rl2;
import X.S3A;
import X.SJ9;
import X.SJZ;
import X.SQg;
import X.SQj;
import X.SVS;
import X.SYZ;
import X.SZ2;
import X.TGD;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import com.facebook.R;
import com.facebook.browser.lite.ipc.AutofillContactDataCallback;
import com.facebook.browser.lite.ipc.AutofillOptOutCallback;
import com.facebook.browser.lite.ipc.AutofillScriptCallback;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.browser.lite.ipc.IABBloksGraphQLCallback;
import com.facebook.browser.lite.ipc.IABExpandableFooterCallback;
import com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback;
import com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback;
import com.facebook.browser.lite.ipc.MoreInfoCallback;
import com.facebook.browser.lite.ipc.OnShopsLiteCallback;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.BugReporterActivity;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.inappbrowser.service.BrowserLiteCallbackService;
import com.instagram.modal.TransparentBackgroundModalActivity;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaType;
import go.Seq;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public class BrowserLiteCallbackService extends Service {
    public static final InterfaceC08100bW A06 = AbstractC31175DnJ.A0B();
    public final HandlerC50754MbK A04 = new HandlerC50754MbK(this);
    public final AtomicBoolean A05 = AbstractC166997dE.A17();
    public Handler A00 = null;
    public C2JG A01 = null;
    public final C63953Swc A03 = C63953Swc.A0A;
    public final QEK A02 = QEK.A01;

    /* loaded from: classes10.dex */
    public final class BrowserLiteCallbackImpl extends Binder implements BrowserLiteCallback {
        public boolean A00;
        public OnShopsLiteCallback A01;
        public final UserSession A02;
        public final SYZ A03;

        public static C0CA A01(BaseBundle baseBundle, C04060Jx c04060Jx) {
            Boolean valueOf = Boolean.valueOf(baseBundle.getBoolean("is_fm_splitscreen", false));
            C0CA A02 = c04060Jx.A02();
            C0CA.A00(A02, valueOf, "is_fm_splitscreen");
            C0CA.A00(A02, Boolean.valueOf(baseBundle.getBoolean("is_wa_installed", false)), "is_wa_installed");
            C0CA.A00(A02, Boolean.valueOf(baseBundle.getBoolean("is_watch_and_browse_v2", false)), "is_watch_and_browse_v2");
            C0CA.A00(A02, baseBundle.getString("landing_page_domain", null), "landing_page_domain");
            C0CA.A00(A02, baseBundle.getString("offer_id", null), "offer_id");
            C0CA.A00(A02, Boolean.valueOf(baseBundle.getBoolean("should_show_browser_history_tooltip", false)), "should_show_browser_history_tooltip");
            C0CA.A00(A02, Boolean.valueOf(baseBundle.getBoolean("should_show_search_tooltip", false)), "should_show_search_tooltip");
            C0CA.A00(A02, baseBundle.getString("target_url", null), "target_url");
            return A02;
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void DL2(Bundle bundle, IABBloksGraphQLCallback iABBloksGraphQLCallback, String str, String str2, String str3) {
            C04060Jx c04060Jx = null;
            C0CA c0ca = null;
            int A03 = C0f9.A03(96599960);
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            C04060Jx c04060Jx2 = GraphQlCallInput.A02;
            C0CA A0T = AbstractC25227BEk.A0T(c04060Jx2, str2, "iab_extension_type");
            C0CA.A00(A0T, str3, "tracking_token");
            C0CA.A00(A0T, str, "iab_session_id");
            C2JO c2jo = A0b.A00;
            AbstractC31173DnH.A1M(A0T, c2jo, "params");
            AbstractC31173DnH.A1M(AbstractC25227BEk.A0T(c04060Jx2, "d0d0df20f1f4fcc942cd21b5181a6a9f0f554364b0e20671791f50beb40b97bf", "bloks_versioning_id"), c2jo, "bloks_params");
            boolean z = false;
            if (bundle != null) {
                c04060Jx = c04060Jx2;
                c0ca = A01(bundle, c04060Jx2);
                z = true;
            }
            if (z) {
                C0CA A02 = c2jo.A02();
                if (c0ca == null) {
                    c0ca = c04060Jx.A02();
                }
                A02.A0E(c0ca, "extra_params");
            }
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGIABBloksFooterQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C60497R0x.class, false, null, 0, null, "iab_extension_footer_template_root", AbstractC166987dD.A1E());
            AbstractC40691uc.A01(this.A02).ATV(new C64002SxZ(str, 3), new C64024Sxv(str, iABBloksGraphQLCallback, 3), pandoGraphQLRequest);
            C0f9.A0A(-398122828, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void DL4(Bundle bundle, IABExpandableFooterCallback iABExpandableFooterCallback, String str, String str2, String str3, String str4, boolean z) {
            C04060Jx c04060Jx = null;
            C0CA c0ca = null;
            int A03 = C0f9.A03(-748783043);
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            A0b.A04("url", str);
            boolean A1W = AbstractC167007dF.A1W(str);
            Boolean valueOf = Boolean.valueOf(z);
            A0b.A02("is_launch_url", valueOf);
            boolean A1W2 = AbstractC167007dF.A1W(valueOf);
            A0b.A04("ad_id", str3);
            A0b.A04(MSV.A00(375), str4);
            A0b.A04("iab_session_id", str2);
            boolean z2 = false;
            if (bundle != null) {
                c04060Jx = GraphQlCallInput.A02;
                c0ca = A01(bundle, c04060Jx);
                z2 = true;
            }
            if (z2) {
                C0CA A02 = A0b.A00.A02();
                if (c0ca == null) {
                    c0ca = c04060Jx.A02();
                }
                A02.A0E(c0ca, "extra_params");
            }
            C18C.A0E(A1W);
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25227BEk.A0U(A1W2), "IGIABExpandableFooterQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59755Qlv.class, false, null, 0, null, "xfb_iab_ig_expandable_sheet_content", AbstractC166987dD.A1E());
            AbstractC40691uc.A01(this.A02).ATV(new C64002SxZ(str2, 2), new C64024Sxv(str2, iABExpandableFooterCallback, 2), pandoGraphQLRequest);
            C0f9.A0A(2054145088, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void DL5(Bundle bundle, IABExtensionEventHandlerCallback iABExtensionEventHandlerCallback, String str, String str2, String str3) {
            C04060Jx c04060Jx = null;
            C0CA c0ca = null;
            int A03 = C0f9.A03(-1903388117);
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            C04060Jx c04060Jx2 = GraphQlCallInput.A02;
            C0CA A0T = AbstractC25227BEk.A0T(c04060Jx2, str2, "ad_id");
            C0CA.A00(A0T, str3, "tracking_token");
            C0CA.A00(A0T, str, "iab_session_id");
            C2JO c2jo = A0b.A00;
            AbstractC31173DnH.A1M(A0T, c2jo, "params");
            boolean z = false;
            if (bundle != null) {
                c04060Jx = c04060Jx2;
                c0ca = A01(bundle, c04060Jx2);
                z = true;
            }
            if (z) {
                C0CA A02 = c2jo.A02();
                if (c0ca == null) {
                    c0ca = c04060Jx.A02();
                }
                A02.A0E(c0ca, "extra_params");
            }
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGIABExtensionPixelEventHandlerQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59758Qly.class, false, null, 0, null, "iab_extension_pixel_event_handler", AbstractC166987dD.A1E());
            AbstractC40691uc.A01(this.A02).ATV(new C64002SxZ(str, 4), new C64024Sxv(iABExtensionEventHandlerCallback, str, 4), pandoGraphQLRequest);
            C0f9.A0A(-451182648, A03);
        }

        public /* synthetic */ BrowserLiteCallbackImpl() {
            this();
            int A03 = C0f9.A03(220814266);
            UserSession A0Q = MSW.A0Q(BrowserLiteCallbackService.this);
            this.A02 = A0Q;
            this.A03 = new SYZ(A0Q);
            C0f9.A0A(-371672025, A03);
            C0f9.A0A(1359642406, C0f9.A03(-936980901));
        }

        public static Bundle A00(Parcel parcel) {
            return (Bundle) AbstractC62773SQp.A00(parcel, Bundle.CREATOR);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x03bc  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0234  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x03b1  */
        /* JADX WARN: Type inference failed for: r11v1, types: [android.os.Handler, X.MbK] */
        /* JADX WARN: Type inference failed for: r11v12 */
        /* JADX WARN: Type inference failed for: r11v13 */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v3 */
        /* JADX WARN: Type inference failed for: r11v4, types: [X.Py1] */
        /* JADX WARN: Type inference failed for: r11v5 */
        /* JADX WARN: Type inference failed for: r11v6, types: [X.Shk] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void A04(android.os.Bundle r56, final com.facebook.iabeventlogging.model.IABEvent r57, final com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl r58) {
            /*
                Method dump skipped, instructions count: 1290
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl.A04(android.os.Bundle, com.facebook.iabeventlogging.model.IABEvent, com.instagram.inappbrowser.service.BrowserLiteCallbackService$BrowserLiteCallbackImpl):void");
        }

        private String A02(IABLandingPageInteractiveEvent iABLandingPageInteractiveEvent) {
            int A03 = C0f9.A03(-618006564);
            String str = iABLandingPageInteractiveEvent.A06;
            if (str == null) {
                C0f9.A0A(987050199, A03);
                return null;
            }
            try {
                String host = new URI(str).getHost();
                C0f9.A0A(68008810, A03);
                return host;
            } catch (URISyntaxException e) {
                C0K8.A0Q("IgBrowserLiteCallbackService", "Couldn't parse %s as URI", str, e);
                C0f9.A0A(106978769, A03);
                return null;
            }
        }

        private String A03(C58877QEn c58877QEn) {
            int i;
            int A03 = C0f9.A03(388804878);
            String string = c58877QEn.A00.getString("TrackingInfo.ARG_TRACKING_TOKEN");
            if (string != null) {
                i = -1130447203;
            } else {
                C38321qM A02 = C1DW.A00(this.A02).A02(SVS.A00(c58877QEn));
                if (A02 != null) {
                    string = A02.CAR();
                } else {
                    string = null;
                }
                i = -449139813;
            }
            C0f9.A0A(i, A03);
            return string;
        }

        public static void A05(final IABEvent iABEvent, final BrowserLiteCallbackImpl browserLiteCallbackImpl, final String str, final boolean z, final boolean z2) {
            int A03 = C0f9.A03(-1087068544);
            BrowserLiteCallbackService browserLiteCallbackService = BrowserLiteCallbackService.this;
            browserLiteCallbackService.A05.set(true);
            int A032 = C0f9.A03(-927867038);
            UserSession userSession = browserLiteCallbackImpl.A02;
            String str2 = iABEvent.A03;
            AbstractC62279S4y.A00(new SZ2(userSession, str2, str, z), new InterfaceC16660sJ() { // from class: X.TWC
                @Override // X.InterfaceC16660sJ
                public final Object invoke(Object obj) {
                    BrowserLiteCallbackService.BrowserLiteCallbackImpl browserLiteCallbackImpl2 = browserLiteCallbackImpl;
                    IABEvent iABEvent2 = iABEvent;
                    boolean z3 = z;
                    String str3 = str;
                    boolean z4 = z2;
                    int A033 = C0f9.A03(1647608247);
                    int A034 = C0f9.A03(-563466697);
                    if (z4 && obj == null) {
                        String str4 = iABEvent2.A03;
                        int A035 = C0f9.A03(425552981);
                        Bundle A0b = AbstractC166987dD.A0b();
                        A0b.putString(MSV.A00(4), "link_history_opt_in_nux");
                        A0b.putString("iab_session_id", str4);
                        SZ2.A00(new SZ2(browserLiteCallbackImpl2.A02, str4, str3, z3), "opt_in_ui_show", null);
                        C6XJ.A06(BrowserLiteCallbackService.this.getApplicationContext(), A0b, TransparentBackgroundModalActivity.class, "bottom_sheet");
                        C0f9.A0A(889703654, A035);
                    }
                    C0f9.A0A(-217449032, A034);
                    C0eB c0eB = C0eB.A00;
                    C0f9.A0A(-1536868364, A033);
                    return c0eB;
                }
            }, new C71679WyX(4), true);
            C0f9.A0A(1309761585, A032);
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36316826116231863L)) {
                OPK.A01(userSession, browserLiteCallbackService.getApplicationContext(), str2);
            }
            C0f9.A0A(-1178443903, A03);
        }

        /* JADX WARN: Code restructure failed: missing block: B:125:0x019b, code lost:
        
            if (r4 > r16) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x011a, code lost:
        
            if (r14 <= 1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x02c4, code lost:
        
            if (r0 != false) goto L124;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x02bd, code lost:
        
            if (r0.containsValue(r5) == true) goto L124;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x025b, code lost:
        
            if (r1 < 18) goto L124;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x02d5  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x02d0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static boolean A06(com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl r33, X.C58877QEn r34, java.lang.String r35, java.lang.String r36, java.lang.String r37) {
            /*
                Method dump skipped, instructions count: 888
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl.A06(com.instagram.inappbrowser.service.BrowserLiteCallbackService$BrowserLiteCallbackImpl, X.QEn, java.lang.String, java.lang.String, java.lang.String):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void AEI(Bundle bundle, ZonePolicy zonePolicy, String str, Map map) {
            C58877QEn c58877QEn;
            String str2;
            C64521THo c64521THo;
            Map unmodifiableMap;
            Map unmodifiableMap2;
            Map unmodifiableMap3;
            int A03 = C0f9.A03(-1712530432);
            if (bundle != null) {
                c58877QEn = new C58877QEn(bundle);
            } else {
                c58877QEn = new SVS();
            }
            boolean z = true;
            if (bundle != null && !bundle.getBoolean("Tracking.ENABLED", true)) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (str.equals("INTEGRITY_LOGGER")) {
                UserSession userSession = this.A02;
                C38321qM A02 = C1DW.A00(userSession).A02(SVS.A00(c58877QEn));
                if (A02 != null) {
                    str2 = AbstractC41071vF.A07(userSession, A02);
                } else {
                    str2 = null;
                }
                boolean booleanValue = valueOf.booleanValue();
                MSZ.A1O(userSession, map);
                if (booleanValue) {
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(new TGD(c58877QEn.A00(), null), userSession), "si_native_webview_redirect");
                    if (A0f.isSampled() && (c64521THo = (C64521THo) map.get("INTEGRITY_LOGGER")) != null) {
                        A0f.AAP("original_url", c64521THo.A02);
                        List<C64519THm> unmodifiableList = Collections.unmodifiableList(c64521THo.A06);
                        ArrayList A10 = AbstractC31174DnI.A10(unmodifiableList);
                        for (C64519THm c64519THm : unmodifiableList) {
                            C0Zx c0Zx = new C0Zx();
                            c0Zx.A06("domain", c64519THm.A03);
                            c0Zx.A06("md5Domain", c64519THm.A01);
                            c0Zx.A06("url", c64519THm.A04);
                            c0Zx.A06("md5Path", c64519THm.A02);
                            Boolean bool = c64519THm.A00;
                            if (bool != null) {
                                c0Zx.A03("httpRedirect", bool);
                            }
                            A10.add(c0Zx);
                        }
                        A0f.AAk("redirect_chain", A10);
                        List unmodifiableList2 = Collections.unmodifiableList(c64521THo.A07);
                        ArrayList A102 = AbstractC31174DnI.A10(unmodifiableList2);
                        Iterator it = unmodifiableList2.iterator();
                        if (it.hasNext()) {
                            it.next();
                            throw AbstractC166987dD.A15("getEvent");
                        }
                        A0f.AAk("safe_browsing", A102);
                        Set unmodifiableSet = Collections.unmodifiableSet(c64521THo.A0D);
                        C14360o3.A07(unmodifiableSet);
                        A0f.AAk("request_domains", AbstractC166987dD.A1F(unmodifiableSet));
                        A0f.A9M("resources_mime_type_count", AbstractC58318PtA.A12(c64521THo.A0A));
                        Set unmodifiableSet2 = Collections.unmodifiableSet(c64521THo.A0C);
                        C14360o3.A07(unmodifiableSet2);
                        A0f.AAk("images_url", AbstractC166987dD.A1F(unmodifiableSet2));
                        A0f.A7v("is_page_loaded", c64521THo.A00);
                        A0f.AAP("sim_hash", c64521THo.A03);
                        A0f.AAP("sim_hash_text", c64521THo.A05);
                        A0f.AAP("sim_hash_dom", c64521THo.A04);
                        A0f.A9K(AbstractC111324zv.A00(494), c64521THo.A01);
                        A0f.AAP("ad_id", str2);
                        A0f.A9M("html_tag_counts", AbstractC58318PtA.A12(c64521THo.A0B));
                        Map A12 = AbstractC58318PtA.A12(c64521THo.A08);
                        HashMap A1G = AbstractC166987dD.A1G();
                        Iterator A15 = AbstractC166997dE.A15(A12);
                        while (A15.hasNext()) {
                            Map.Entry A1K = AbstractC166987dD.A1K(A15);
                            Object key = A1K.getKey();
                            C0Zx c0Zx2 = new C0Zx();
                            c0Zx2.A05(IgReactMediaPickerNativeModule.WIDTH, Long.valueOf(((C64518THl) A1K.getValue()).A01));
                            c0Zx2.A05(IgReactMediaPickerNativeModule.HEIGHT, Long.valueOf(((C64518THl) A1K.getValue()).A00));
                            A1G.put(key, c0Zx2);
                        }
                        A0f.A9M("images_sizes", A1G);
                        Map map2 = c64521THo.A09;
                        if (map2 == null) {
                            unmodifiableMap = null;
                        } else {
                            unmodifiableMap = Collections.unmodifiableMap(map2);
                        }
                        A0f.A9M("origin_to_sim_hash", unmodifiableMap);
                        if (map2 == null) {
                            unmodifiableMap2 = null;
                        } else {
                            unmodifiableMap2 = Collections.unmodifiableMap(map2);
                        }
                        A0f.A9M("origin_to_sim_hash_text", unmodifiableMap2);
                        if (map2 == null) {
                            unmodifiableMap3 = null;
                        } else {
                            unmodifiableMap3 = Collections.unmodifiableMap(map2);
                        }
                        A0f.A9M("origin_to_sim_hash_dom", unmodifiableMap3);
                        A0f.Cht();
                    }
                }
            }
            C0f9.A0A(-843779496, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void AV0(AutofillContactDataCallback autofillContactDataCallback) {
            ArrayList A02;
            int A03 = C0f9.A03(-2117300524);
            boolean A06 = C18U.A06(C06090Tz.A06, this.A02, 36310426616332362L);
            BrowserLiteCallbackService.this.getApplicationContext();
            if (A06) {
                ArrayList A1F = AbstractC166987dD.A1F(C20J.A02());
                A02 = AbstractC166987dD.A1E();
                if (!A1F.isEmpty()) {
                    A02.add(A1F.get(0));
                }
            } else {
                A02 = C20J.A02();
            }
            autofillContactDataCallback.D1F(A02);
            C0f9.A0A(2020763051, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void AV1(AutofillScriptCallback autofillScriptCallback) {
            int A03 = C0f9.A03(14631190);
            String string = AnonymousClass960.A00(BrowserLiteCallbackService.this, this.A02).A00.getString("autofill_js", "");
            if (string != null) {
                autofillScriptCallback.D1B(string);
                C0f9.A0A(-670200692, A03);
                return;
            }
            throw AbstractC166997dE.A0g();
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final PrefetchCacheEntry BfX(String str) {
            C0f9.A0A(-2143678621, C0f9.A03(652565983));
            return null;
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final ArrayList BfY() {
            int A03 = C0f9.A03(-2116518670);
            ArrayList A1E = AbstractC166987dD.A1E();
            C0f9.A0A(1634670910, A03);
            return A1E;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't wrap try/catch for region: R(7:49|(6:53|(1:(1:56))(1:64)|57|58|59|60)|65|57|58|59|60) */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        
            if (r17.equals("BWI_REFRESH_TOKEN") == false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x010a, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x010b, code lost:
        
            X.C0K8.A0J("BwIEventHandler", "Parsing iabSessionId or adId or entryPoint into JSON object threw exception: ", r2);
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0029. Please report as an issue. */
        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void CJW(java.lang.String r17) {
            /*
                Method dump skipped, instructions count: 370
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl.CJW(java.lang.String):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void CJX(java.lang.String r18, java.lang.String r19) {
            /*
                Method dump skipped, instructions count: 622
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl.CJX(java.lang.String, java.lang.String):void");
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final int CJt(String str) {
            int i;
            int A03 = C0f9.A03(-1751463733);
            if (str == null) {
                i = -699488041;
            } else {
                try {
                    Uri A01 = AbstractC08820cl.A01(BrowserLiteCallbackService.A06, str);
                    if (A01 == null) {
                        i = -1003852109;
                    } else {
                        Intent parseUri = Intent.parseUri(str, 1);
                        if (A01.getHost() != null && parseUri.getScheme() != null && parseUri.getPackage() != null && A01.getHost().equalsIgnoreCase("instagram.com") && parseUri.getScheme().equalsIgnoreCase("https") && parseUri.getPackage().equalsIgnoreCase("com.instagram.android")) {
                            parseUri.addFlags(268435456);
                            parseUri.addCategory("android.intent.category.BROWSABLE");
                            parseUri.setComponent(null);
                            parseUri.setSelector(null);
                            C12260kU.A0A(BrowserLiteCallbackService.this, parseUri);
                            C0f9.A0A(1341469555, A03);
                            return 1;
                        }
                        i = -1151432773;
                    }
                } catch (URISyntaxException e) {
                    C0K8.A0F("IgBrowserLiteCallbackService", "URISyntaxException on handleInvalidProtocol", e);
                    C0f9.A0A(-796324464, A03);
                    return 0;
                }
            }
            C0f9.A0A(i, A03);
            return 0;
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final boolean CJz(Bundle bundle, ZonePolicy zonePolicy, String str) {
            int A03 = C0f9.A03(1636917829);
            Intent A0C = AbstractC58318PtA.A0C();
            A0C.setData(AbstractC08820cl.A03(str));
            A0C.setFlags(268435456);
            C12260kU.A00(BrowserLiteCallbackService.this.getApplicationContext(), A0C);
            C0f9.A0A(-566368639, A03);
            return true;
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final boolean CKB(String str) {
            C0f9.A0A(891571372, C0f9.A03(-1208131281));
            return false;
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final boolean CKK(String str, String str2) {
            C0f9.A0A(-801746046, C0f9.A03(-1686733816));
            return false;
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void CKL(Bundle bundle) {
            int i;
            int A03 = C0f9.A03(-51633031);
            OnShopsLiteCallback onShopsLiteCallback = this.A01;
            if (onShopsLiteCallback == null) {
                i = 1506189201;
            } else {
                onShopsLiteCallback.DTV(bundle);
                i = 381783705;
            }
            C0f9.A0A(i, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void Cgs(String str) {
            C0f9.A0A(1108537867, C0f9.A03(-897528866));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void CiX(long j, String str, String str2, Map map) {
            int A03 = C0f9.A03(2006692305);
            AbstractC61704RsL.A00(AbstractC12220kQ.A02(this.A02), str, str2, map, j);
            C0f9.A0A(-1394515182, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void CiY(long j, String str, String str2, Map map) {
            int A03 = C0f9.A03(24928694);
            SQj.A01(AbstractC12220kQ.A02(this.A02), str, str2, map, j);
            C0f9.A0A(-1517752784, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void Cjh(Bundle bundle, String str, String str2, boolean z) {
            String str3;
            int A03 = C0f9.A03(-1490249977);
            boolean z2 = bundle.getBoolean("Tracking.ENABLED", true);
            String A032 = A03(new C58877QEn(bundle));
            UserSession userSession = this.A02;
            AbstractC25233BEq.A0v(0, str, str2, userSession);
            if (z2) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "iab_open_app_store_surface");
                if (z) {
                    str3 = "sheet";
                } else {
                    str3 = "app";
                }
                if (A0f.isSampled()) {
                    A0f.AAP("iab_session_id", str2);
                    A0f.A8I("event_ts", Double.valueOf(System.currentTimeMillis()));
                    AbstractC37300Gc1.A0o(A0f, A032);
                    A0f.AAP("surface", str3);
                    A0f.AAP("target_url", str);
                    A0f.AAP("click_id", null);
                    A0f.Cht();
                }
            }
            C0f9.A0A(1390335288, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void CkG(Bundle bundle, ZonePolicy zonePolicy, String str, String str2, Map map, Map map2, int i, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4) {
            int A03 = C0f9.A03(106605151);
            if (bundle != null) {
                bundle.getBoolean("Tracking.ENABLED", true);
            }
            C0f9.A0A(1112252519, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void CkU(Bundle bundle, String str, String str2, long j, boolean z) {
            String str3;
            int A03 = C0f9.A03(-2009044372);
            boolean z2 = bundle.getBoolean("Tracking.ENABLED", true);
            String A032 = A03(new C58877QEn(bundle));
            UserSession userSession = this.A02;
            AbstractC167007dF.A1F(str, 0, userSession);
            if (z2) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "mai_play_store_events");
                if (z) {
                    str3 = "sheet";
                } else {
                    str3 = "app";
                }
                if (A0f.isSampled()) {
                    A0f.AAP("mai_event_name", str);
                    A0f.A7v("is_preloading_enabled", null);
                    A0f.A9K("itunes_id", null);
                    AbstractC37300Gc1.A0o(A0f, A032);
                    A0f.A8I("load_duration", null);
                    A0f.A7v("did_load_successfully", null);
                    A0f.A8I("time_spent", Double.valueOf(j));
                    A0f.A8I("tti", null);
                    A0f.A8I("background_time", null);
                    A0f.AAP("error", null);
                    A0f.AAP(TraceFieldType.ErrorDomain, null);
                    A0f.A9K(TraceFieldType.ErrorCode, null);
                    A0f.A9K("load_attempt_count", null);
                    A0f.A9M("load_params", null);
                    A0f.AAP("mai_session_id", null);
                    A0f.AAP("presenting_surface", AbstractC111324zv.A00(2529));
                    A0f.AAP("store_type", str3);
                    A0f.Cht();
                }
            }
            C0f9.A0A(1052987946, A03);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v40, types: [X.SVS] */
        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void Clr(Bundle bundle, Map map) {
            C58877QEn c58877QEn;
            SJ9 A00;
            Long l;
            int A03 = C0f9.A03(-1882277489);
            if (bundle == null) {
                c58877QEn = new SVS();
            } else {
                c58877QEn = new C58877QEn(bundle);
            }
            TGD tgd = new TGD(c58877QEn.A00(), null);
            boolean z = true;
            if (bundle != null && !bundle.getBoolean("Tracking.ENABLED", true)) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            UserSession userSession = this.A02;
            boolean booleanValue = valueOf.booleanValue();
            AbstractC167007dF.A1E(userSession, 1, map);
            if (booleanValue && bundle != null && map.get("action") != null && "BrowserLiteIntent.IAB_AUTOFILL_CROWDSOURCING_PREDICTIONS".equals(map.get("action")) && (A00 = AbstractC61732Rsn.A00(bundle)) != null) {
                C18920wW A002 = AbstractC12220kQ.A00(tgd, C12180kM.A05, userSession);
                String str = A00.A04;
                String str2 = A00.A00;
                String str3 = A00.A02;
                String str4 = A00.A06;
                String str5 = A00.A03;
                String str6 = A00.A05;
                String str7 = A00.A01;
                ImmutableList copyOf = ImmutableList.copyOf((Collection) A00.A07);
                C14360o3.A07(copyOf);
                C1LC A0I = AbstractC43592JPx.A0I(copyOf);
                while (A0I.hasNext()) {
                    SJZ sjz = (SJZ) A0I.next();
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A002, "iab_autofill_crowdsourcing_predictions");
                    if (A0f.isSampled()) {
                        A0f.AAP("autofill_iab_session_id", str);
                        A0f.AAP("current_url", str3);
                        A0f.AAP("origin_host", str4);
                        A0f.AAP("autofill_form_id", str5);
                        A0f.AAP("autofill_mobile_app_id", str6);
                        A0f.AAP("detection_result", sjz.A02);
                        A0f.AAP("autofill_type", str7);
                        A0f.AAP("input_name", sjz.A06);
                        A0f.AAP("input_id", sjz.A05);
                        A0f.AAP("input_type", sjz.A07);
                        A0f.AAP("input_autocomplete", sjz.A04);
                        A0f.AAP("placeholder", sjz.A0A);
                        A0f.AAP("label", sjz.A08);
                        A0f.A9K("text_length", AbstractC31171DnF.A0V(sjz.A00));
                        A0f.A7v("is_digit", Boolean.valueOf(sjz.A0B));
                        A0f.A7v("is_valid_credit_card", Boolean.valueOf(sjz.A0D));
                        A0f.A7v("is_luhn_compliant", Boolean.valueOf(sjz.A0C));
                        if (str2 != null) {
                            l = S3A.A00(str2);
                        } else {
                            l = null;
                        }
                        A0f.A9K("ad_id", l);
                        A0f.Cht();
                    }
                }
            }
            C0f9.A0A(-106716798, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final String CoI(String str) {
            String str2;
            int A03 = C0f9.A03(-1873604304);
            if (str != null) {
                try {
                    Uri A032 = AbstractC08820cl.A03(str);
                    if (A032 != null) {
                        String host = A032.getHost();
                        String path = A032.getPath();
                        if (host != null && path != null && host.endsWith(".instagram.com") && path.startsWith("/browser/closeWindow")) {
                            SQg.A00(BrowserLiteCallbackService.this.getApplicationContext(), "ACTION_CLOSE_BROWSER");
                        }
                    }
                } catch (IllegalArgumentException unused) {
                } catch (SecurityException e) {
                    if (e.getMessage() != null) {
                        str2 = e.getMessage();
                    } else {
                        str2 = "SecurityException–the message is null";
                    }
                    C0w9.A03("IAB Logging", str2);
                }
            }
            C0f9.A0A(-553905829, A03);
            return null;
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void CyU(AutofillOptOutCallback autofillOptOutCallback, String str) {
            int i;
            int A03 = C0f9.A03(600523107);
            UserSession userSession = this.A02;
            if (C18U.A06(C06090Tz.A06, userSession, 36310426616135752L)) {
                autofillOptOutCallback.D1E(str, false);
                i = 851638773;
            } else {
                if (userSession != null && !this.A00) {
                    this.A00 = true;
                    C2JM A0b = AbstractC25225BEi.A0b();
                    A0b.A04("key", str);
                    C18C.A0E(AbstractC167007dF.A1W(str));
                    C907442n c907442n = new C907442n(A0b, C58896QHg.class, "IabAutofillOptOutQuery", false);
                    C907542o c907542o = new C907542o(userSession);
                    c907542o.A08(c907442n);
                    c907542o.A08 = AbstractC111324zv.A00(58);
                    C1ON A05 = c907542o.A05();
                    A05.A00 = new C32531EUh(this, autofillOptOutCallback, str, 8);
                    C14120nc.A00().ATO(new RcE(A05, this));
                }
                i = -1970832312;
            }
            C0f9.A0A(i, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void D80(String str, Bundle bundle) {
            C0f9.A0A(1943583170, C0f9.A03(298492839));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void DEm(Bundle bundle, ZonePolicy zonePolicy, String str, String str2, Map map) {
            C0f9.A0A(-1393129909, C0f9.A03(-1120837566));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void DHR() {
            C0f9.A0A(-983310826, C0f9.A03(1063276521));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void DL0(String str, List list) {
            C0f9.A0A(1147059999, C0f9.A03(824087382));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void DL3(final Bundle bundle, final IABEvent iABEvent, ZonePolicy zonePolicy) {
            int A03 = C0f9.A03(1809167423);
            UserSession userSession = this.A02;
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36313566236248173L);
            if (zonePolicy != null) {
                zonePolicy.A00();
            }
            if (bundle != null) {
                bundle.getBoolean("Tracking.ENABLED", true);
            }
            if (zonePolicy != null && A06) {
                Rl2 ELD = AbstractC58320PtC.A0Y().ELD(new InterfaceC65349TiW() { // from class: X.SzV
                    @Override // X.InterfaceC65349TiW
                    public final Object get() {
                        final BrowserLiteCallbackService.BrowserLiteCallbackImpl browserLiteCallbackImpl = this;
                        final IABEvent iABEvent2 = iABEvent;
                        final Bundle bundle2 = bundle;
                        int A032 = C0f9.A03(1459988051);
                        try {
                            ZonePolicy zonePolicy2 = ZonePolicy.A06;
                            Rl2 ELD2 = AbstractC58320PtC.A0Y().ELD(new InterfaceC65349TiW() { // from class: X.SzW
                                @Override // X.InterfaceC65349TiW
                                public final Object get() {
                                    BrowserLiteCallbackService.BrowserLiteCallbackImpl browserLiteCallbackImpl2 = browserLiteCallbackImpl;
                                    IABEvent iABEvent3 = iABEvent2;
                                    Bundle bundle3 = bundle2;
                                    int A033 = C0f9.A03(-12069381);
                                    BrowserLiteCallbackService.BrowserLiteCallbackImpl.A04(bundle3, iABEvent3, browserLiteCallbackImpl2);
                                    C0eB c0eB = C0eB.A00;
                                    C0f9.A0A(-282329842, A033);
                                    return c0eB;
                                }
                            }, zonePolicy2, "UNKNOWN");
                            C14360o3.A07(ELD2);
                            C14360o3.A07(AbstractC61814Ru8.A00(ELD2));
                        } catch (TXB unused) {
                        }
                        C0eB c0eB = C0eB.A00;
                        C0f9.A0A(1268872687, A032);
                        return c0eB;
                    }
                }, zonePolicy, "UNKNOWN");
                C14360o3.A07(ELD);
                C14360o3.A07(AbstractC61814Ru8.A00(ELD));
            } else {
                A04(bundle, iABEvent, this);
            }
            AbstractC12220kQ.A02(userSession);
            C0f9.A0A(944079702, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void DL6(Bundle bundle, IABExtensionPreExitHandlerBloksCallback iABExtensionPreExitHandlerBloksCallback, String str, String str2, String str3, String str4, List list) {
            int A03 = C0f9.A03(169625898);
            UserSession userSession = this.A02;
            C04060Jx c04060Jx = null;
            C0CA c0ca = null;
            AbstractC167007dF.A1K(str, str2);
            AbstractC25229BEm.A1I(iABExtensionPreExitHandlerBloksCallback, 5, userSession);
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            C04060Jx c04060Jx2 = GraphQlCallInput.A02;
            C0CA A0T = AbstractC25227BEk.A0T(c04060Jx2, str3, "ad_id");
            C0CA.A00(A0T, str2, "iab_extension_type");
            C0CA.A00(A0T, str4, "tracking_token");
            C0CA.A00(A0T, str, "iab_session_id");
            C2JO c2jo = A0b.A00;
            AbstractC31173DnH.A1M(A0T, c2jo, "params");
            AbstractC31173DnH.A1M(AbstractC25227BEk.A0T(c04060Jx2, "d0d0df20f1f4fcc942cd21b5181a6a9f0f554364b0e20671791f50beb40b97bf", "bloks_versioning_id"), c2jo, "bloks_params");
            boolean z = false;
            if (bundle != null) {
                c04060Jx = c04060Jx2;
                c0ca = A01(bundle, c04060Jx2);
                z = true;
            }
            if (z) {
                C0CA A02 = c2jo.A02();
                if (c0ca == null) {
                    c0ca = c04060Jx.A02();
                }
                A02.A0E(c0ca, "extra_params");
            }
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGIABExtensionPreExitBloksHandlerTemplateQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), Qm9.class, false, null, 0, null, "iab_extension_pre_exit_bloks_handler_template", AbstractC166987dD.A1E());
            AbstractC40691uc.A01(userSession).ATV(new C64002SxZ(str, 0), new C64024Sxv(str, iABExtensionPreExitHandlerBloksCallback, 0), pandoGraphQLRequest);
            C0f9.A0A(-116457528, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void DL7(Bundle bundle, IABExtensionEventHandlerCallback iABExtensionEventHandlerCallback, String str, String str2, String str3) {
            int A03 = C0f9.A03(1493213961);
            UserSession userSession = this.A02;
            C04060Jx c04060Jx = null;
            C0CA c0ca = null;
            AbstractC25233BEq.A0x(0, str, iABExtensionEventHandlerCallback, userSession);
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            C04060Jx c04060Jx2 = GraphQlCallInput.A02;
            C0CA A0T = AbstractC25227BEk.A0T(c04060Jx2, str2, "ad_id");
            C0CA.A00(A0T, str3, "tracking_token");
            C0CA.A00(A0T, str, "iab_session_id");
            C2JO c2jo = A0b.A00;
            AbstractC31173DnH.A1M(A0T, c2jo, "params");
            boolean z = false;
            if (bundle != null) {
                c04060Jx = c04060Jx2;
                c0ca = A01(bundle, c04060Jx2);
                z = true;
            }
            if (z) {
                C0CA A02 = c2jo.A02();
                if (c0ca == null) {
                    c0ca = c04060Jx.A02();
                }
                A02.A0E(c0ca, "extra_params");
            }
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGIABExtensionPreExitHandlerQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), QmC.class, false, null, 0, null, "iab_extension_pre_exit_handler", AbstractC166987dD.A1E());
            AbstractC40691uc.A01(userSession).ATV(new C64002SxZ(str, 1), new C64024Sxv(iABExtensionEventHandlerCallback, str, 1), pandoGraphQLRequest);
            C0f9.A0A(-1166143130, A03);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00e1, code lost:
        
            if ("hideAutoFillBar".equals(r1) != false) goto L34;
         */
        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void DO3(com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall r9, com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback r10) {
            /*
                r8 = this;
                r0 = 1682378903(0x64471097, float:1.468839E22)
                int r3 = X.C0f9.A03(r0)
                com.instagram.inappbrowser.service.BrowserLiteCallbackService r0 = com.instagram.inappbrowser.service.BrowserLiteCallbackService.this
                android.content.Context r6 = r0.getApplicationContext()
                java.lang.String r1 = r9.A04
                java.lang.String r0 = "saveAutofillData"
                boolean r0 = r0.equals(r1)
                r4 = 0
                if (r0 == 0) goto L94
                android.os.Bundle r1 = r9.A02
                java.lang.String r0 = "saveAutofillDataData"
                android.os.Parcelable r0 = r1.getParcelable(r0)
                r0.getClass()
                com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCallData r0 = (com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCallData) r0
                com.google.common.collect.ImmutableMap r0 = r0.A00
                if (r0 == 0) goto Ld0
                java.util.HashMap r7 = X.AbstractC166987dD.A1G()
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r5 = r0.iterator()
            L35:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L5d
                java.util.Map$Entry r2 = X.AbstractC166987dD.A1K(r5)
                java.lang.Object r0 = r2.getValue()
                java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L35
                java.lang.Object r1 = r2.getKey()
                java.lang.Object r0 = r2.getValue()
                java.util.AbstractList r0 = (java.util.AbstractList) r0
                java.lang.Object r0 = r0.get(r4)
                r7.put(r1, r0)
                goto L35
            L5d:
                com.instagram.common.session.UserSession r5 = r8.A02
                X.0Tz r2 = X.C06090Tz.A06
                r0 = 36322800420399738(0x810b65004e2a7a, double:3.034023473813873E-306)
                boolean r0 = X.C18U.A06(r2, r5, r0)
                if (r0 == 0) goto L89
                com.facebook.browser.lite.extensions.autofill.model.AutofillData r2 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
                r2.<init>(r7)
                r1 = 0
                r0 = 2
                X.C14360o3.A0B(r6, r0)
                com.instagram.common.session.UserSession r0 = X.C20J.A03
                if (r0 == 0) goto L7e
                X.Sg3.A01(r6, r2, r1, r0, r4)
                goto Le3
            L7e:
                java.lang.String r0 = "userSession"
                X.C14360o3.A0F(r0)
                X.00O r0 = X.C00O.createAndThrow()
                throw r0
            L89:
                X.20J r1 = X.C20J.A04
                com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
                r0.<init>(r7)
                r1.A04(r0)
                goto Le3
            L94:
                java.lang.String r0 = "requestAutoFill"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto Ldb
                android.os.Bundle r6 = X.AbstractC166987dD.A0b()
                com.instagram.common.session.UserSession r7 = r8.A02
                java.util.ArrayList r0 = X.C20J.A02()
                java.util.ArrayList r5 = X.AbstractC166987dD.A1F(r0)
                X.0Tz r2 = X.C06090Tz.A06
                r0 = 36310426616332362(0x810024001c004a, double:3.026198230296355E-306)
                boolean r0 = X.C18U.A06(r2, r7, r0)
                java.lang.String r2 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"
                if (r0 == 0) goto Ld7
                java.util.ArrayList r1 = X.AbstractC166987dD.A1E()
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto Lca
                java.lang.Object r0 = r5.get(r4)
                r1.add(r0)
            Lca:
                r6.putStringArrayList(r2, r1)
            Lcd:
                r10.D1G(r6, r9, r4)
            Ld0:
                r0 = -452306381(0xffffffffe50a5a33, float:-4.0834404E22)
                X.C0f9.A0A(r0, r3)
                return
            Ld7:
                r6.putStringArrayList(r2, r5)
                goto Lcd
            Ldb:
                java.lang.String r0 = "hideAutoFillBar"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto Ld0
            Le3:
                android.os.Bundle r6 = X.AbstractC166987dD.A0b()
                goto Lcd
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl.DO3(com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall, com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback):void");
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void DXU(int i, String str, Bundle bundle) {
            C0f9.A0A(-1088773530, C0f9.A03(-478963845));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void DXX(Bundle bundle, String str, int i, long j) {
            C0f9.A0A(2094223085, C0f9.A03(-544469479));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void DXe(Bundle bundle, String str, String str2) {
            C0f9.A0A(1651273422, C0f9.A03(696749261));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void DXr(Bundle bundle, ZonePolicy zonePolicy, String str, boolean z) {
            Handler handler;
            int A03 = C0f9.A03(-381825327);
            if (AbstractC62280S4z.A00(this.A02) && (handler = BrowserLiteCallbackService.this.A00) != null) {
                handler.removeCallbacksAndMessages(null);
            }
            AbstractC58318PtA.A1F(BrowserLiteCallbackService.this.A04, Boolean.valueOf(z), 3);
            C0f9.A0A(-1392271649, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void Dcx(Map map) {
            int A03 = C0f9.A03(1745688191);
            Uri uri = (Uri) map.get("screenshot_uri");
            Map map2 = (Map) map.get("debug_info_map");
            if (uri != null && map2 != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                String encodedPath = uri.getEncodedPath();
                if (encodedPath != null) {
                    C3R9[] c3r9Arr = BugReportAttachment.A05;
                    A1E.add(new BugReportAttachment(BugReportAttachmentMediaSource.A04, BugReportAttachmentMediaType.A04, encodedPath, "IgBrowserLiteCallbackService", true));
                }
                HashMap A1G = AbstractC166987dD.A1G();
                Iterator A15 = AbstractC166997dE.A15(map2);
                while (A15.hasNext()) {
                    AbstractC43594JPz.A1S(A1G, AbstractC166987dD.A1K(A15));
                }
                OWg oWg = new OWg();
                BugReportSource bugReportSource = BugReportSource.A0H;
                C14360o3.A0B(bugReportSource, 0);
                oWg.A00 = bugReportSource;
                oWg.A0K = AbstractC166987dD.A1F(A1E);
                UserSession userSession = this.A02;
                String str = userSession.userId;
                C14360o3.A0B(str, 0);
                oWg.A0I = str;
                oWg.A0N = A1G;
                BugReport A01 = oWg.A01();
                BrowserLiteCallbackService browserLiteCallbackService = BrowserLiteCallbackService.this;
                OJR ojr = new OJR(browserLiteCallbackService.getApplicationContext());
                ojr.A02 = "";
                BugReportComposerViewModel A00 = ojr.A00();
                Intent A08 = MSW.A08(browserLiteCallbackService, BugReporterActivity.class);
                A08.setFlags(268435456);
                A08.putExtra(MSV.A00(689), A01);
                A08.putExtra(MSV.A00(317), A00);
                A08.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
                C12260kU.A0C(browserLiteCallbackService, A08);
            } else {
                C11T.A02(new Runnable() { // from class: X.TLi
                    @Override // java.lang.Runnable
                    public final void run() {
                        BrowserLiteCallbackService.BrowserLiteCallbackImpl browserLiteCallbackImpl = BrowserLiteCallbackService.BrowserLiteCallbackImpl.this;
                        int A032 = C0f9.A03(-1856538915);
                        C9GR.A07(BrowserLiteCallbackService.this, R.string.res_0x7f130018_name_removed);
                        C0f9.A0A(-33241694, A032);
                    }
                });
            }
            C0f9.A0A(120088671, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void DhA(Bundle bundle, ZonePolicy zonePolicy, String str) {
            int A03 = C0f9.A03(884676845);
            new C58877QEn(bundle);
            boolean z = true;
            if (bundle != null && !bundle.getBoolean("Tracking.ENABLED", true)) {
                z = false;
            }
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString("moduleName", "in_app_browser_v2");
            A0b.putBoolean("logging_enabled", z);
            A0b.putString("url", str);
            Message obtainMessage = BrowserLiteCallbackService.this.A04.obtainMessage(2);
            obtainMessage.setData(A0b);
            obtainMessage.sendToTarget();
            C0f9.A0A(1187674253, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void Dkq() {
            C0f9.A0A(-1273892345, C0f9.A03(563091827));
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void DxW(String str, Bundle bundle) {
            C0f9.A0A(1780130566, C0f9.A03(-959712689));
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            if (r81.getBoolean("Tracking.ENABLED", true) != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:172:0x02dc, code lost:
        
            if (X.AbstractC001800i.A0u(X.S8W.A01, r1) == false) goto L87;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:127:0x01ee. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v20, types: [X.SVS] */
        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void Dxb(android.os.Bundle r81, java.util.Map r82) {
            /*
                Method dump skipped, instructions count: 2400
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.inappbrowser.service.BrowserLiteCallbackService.BrowserLiteCallbackImpl.Dxb(android.os.Bundle, java.util.Map):void");
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void E2w(Bundle bundle, OnShopsLiteCallback onShopsLiteCallback) {
            int A03 = C0f9.A03(1496112265);
            this.A01 = onShopsLiteCallback;
            C0f9.A0A(648564367, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void EIW(Bundle bundle, long[] jArr) {
            int A03 = C0f9.A03(-2098192223);
            boolean z = true;
            if (bundle != null && !bundle.getBoolean("Tracking.ENABLED", true)) {
                z = false;
            }
            boolean A1b = AbstractC31174DnI.A1b(z);
            UserSession userSession = this.A02;
            AbstractC167017dG.A1P(userSession, jArr);
            if (A1b) {
                for (long j : jArr) {
                    C106904rr.A01(C106904rr.A00(userSession), C05F.A01, j);
                }
            }
            C0f9.A0A(1030580796, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void EUK() {
            int A03 = C0f9.A03(1069763163);
            UserSession userSession = this.A02;
            AbstractC63317ShP.A01(new C60902RbH(userSession, 2), userSession, null, "CONTACT_AUTOFILL", "FBPAY_DISCLOSURE_SHOWN");
            C0f9.A0A(1505049537, A03);
        }

        @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
        public final void Epk() {
            C0f9.A0A(539297683, C0f9.A03(-1697873440));
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            C0f9.A0A(1416617752, C0f9.A03(1175971799));
            return this;
        }

        /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, com.facebook.browser.lite.ipc.IABExpandableFooterCallback$Stub$Proxy] */
        /* JADX WARN: Type inference failed for: r10v5, types: [com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback$Stub$Proxy, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, com.facebook.browser.lite.ipc.AutofillContactDataCallback$Stub$Proxy] */
        /* JADX WARN: Type inference failed for: r5v19, types: [com.facebook.browser.lite.ipc.AutofillScriptCallback$Stub$Proxy, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v24, types: [com.facebook.browser.lite.ipc.AutofillOptOutCallback$Stub$Proxy, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v3, types: [com.facebook.browser.lite.ipc.OnShopsLiteCallback$Stub$Proxy, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v30, types: [com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback$Stub$Proxy, java.lang.Object] */
        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03;
            int i4;
            OnShopsLiteCallback onShopsLiteCallback;
            IABExtensionPreExitHandlerBloksCallback iABExtensionPreExitHandlerBloksCallback;
            IABExpandableFooterCallback iABExpandableFooterCallback;
            AutofillContactDataCallback autofillContactDataCallback;
            AutofillScriptCallback autofillScriptCallback;
            AutofillOptOutCallback autofillOptOutCallback;
            BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback;
            int A032 = C0f9.A03(-818611076);
            boolean z = true;
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    r14 = 0;
                    int i5 = 0;
                    switch (i) {
                        case 1:
                            i5 = CJt(parcel.readString());
                            parcel2.writeNoException();
                            parcel2.writeInt(i5);
                            i3 = -399314222;
                            break;
                        case 2:
                            i5 = CKK(parcel.readString(), parcel.readString());
                            parcel2.writeNoException();
                            parcel2.writeInt(i5);
                            i3 = -399314222;
                            break;
                        case 3:
                            parcel.readString();
                            parcel.readString();
                            parcel.readString();
                            parcel.readString();
                            parcel.readString();
                            C0f9.A0A(49723364, C0f9.A03(-319905470));
                            parcel2.writeNoException();
                            parcel2.writeInt(i5);
                            i3 = -399314222;
                            break;
                        case 4:
                            DL3(A00(parcel), (IABEvent) AbstractC58323PtF.A0j(parcel, IABEvent.CREATOR), (ZonePolicy) AbstractC58323PtF.A0j(parcel, ZonePolicy.CREATOR));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 5:
                            D80(parcel.readString(), A00(parcel));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 6:
                            DhA(A00(parcel), (ZonePolicy) AbstractC58323PtF.A0j(parcel, ZonePolicy.CREATOR), parcel.readString());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 7:
                            DXr(A00(parcel), (ZonePolicy) AbstractC58323PtF.A0j(parcel, ZonePolicy.CREATOR), parcel.readString(), AbstractC37304Gc5.A1W(parcel));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 8:
                            CkU(A00(parcel), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 9:
                            Cjh(A00(parcel), parcel.readString(), parcel.readString(), AbstractC37304Gc5.A1W(parcel));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 10:
                            parcel.readString();
                            parcel.readLong();
                            parcel.readLong();
                            parcel.readLong();
                            parcel.readLong();
                            parcel.readLong();
                            parcel.readInt();
                            parcel.readInt();
                            parcel.readInt();
                            parcel.readInt();
                            ClassLoader A0g = AbstractC58319PtB.A0g(this);
                            parcel.readHashMap(A0g);
                            parcel.readInt();
                            parcel.readString();
                            parcel.readHashMap(A0g);
                            BaseBundle baseBundle = (BaseBundle) AbstractC58323PtF.A0j(parcel, Bundle.CREATOR);
                            AbstractC58323PtF.A0j(parcel, ZonePolicy.CREATOR);
                            A03 = C0f9.A03(106605151);
                            if (baseBundle != null) {
                                baseBundle.getBoolean("Tracking.ENABLED", true);
                            }
                            i4 = 1112252519;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 11:
                            DXe(A00(parcel), parcel.readString(), parcel.readString());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            DXX(A00(parcel), parcel.readString(), parcel.readInt(), parcel.readLong());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                            DXU(parcel.readInt(), parcel.readString(), A00(parcel));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 14:
                            EIW(A00(parcel), parcel.createLongArray());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case Process.SIGTERM /* 15 */:
                            parcel.readString();
                            parcel.readString();
                            parcel.readHashMap(AbstractC58319PtB.A0g(this));
                            AbstractC58323PtF.A0j(parcel, Bundle.CREATOR);
                            AbstractC58323PtF.A0j(parcel, ZonePolicy.CREATOR);
                            A03 = C0f9.A03(-1120837566);
                            i4 = -1393129909;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 16:
                            Dcx(parcel.readHashMap(AbstractC58319PtB.A0g(this)));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 17:
                            Dxb(A00(parcel), parcel.readHashMap(AbstractC58319PtB.A0g(this)));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 18:
                            Clr(A00(parcel), parcel.readHashMap(AbstractC58319PtB.A0g(this)));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case Process.SIGSTOP /* 19 */:
                            ArrayList BfY = BfY();
                            parcel2.writeNoException();
                            parcel2.writeStringList(BfY);
                            i3 = -399314222;
                            break;
                        case 20:
                            PrefetchCacheEntry BfX = BfX(parcel.readString());
                            parcel2.writeNoException();
                            AbstractC62773SQp.A01(parcel2, BfX, 1);
                            i3 = -399314222;
                            break;
                        case 21:
                            BrowserLiteJSBridgeCall browserLiteJSBridgeCall = (BrowserLiteJSBridgeCall) AbstractC58323PtF.A0j(parcel, BrowserLiteJSBridgeCall.CREATOR);
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            if (readStrongBinder == null) {
                                browserLiteJSBridgeCallback = null;
                            } else {
                                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback");
                                if (queryLocalInterface != null && (queryLocalInterface instanceof BrowserLiteJSBridgeCallback)) {
                                    browserLiteJSBridgeCallback = (BrowserLiteJSBridgeCallback) queryLocalInterface;
                                } else {
                                    ?? obj = new Object();
                                    int A033 = C0f9.A03(1706335356);
                                    obj.A00 = readStrongBinder;
                                    C0f9.A0A(2128347639, A033);
                                    browserLiteJSBridgeCallback = obj;
                                }
                            }
                            DO3(browserLiteJSBridgeCall, browserLiteJSBridgeCallback);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 22:
                            Epk();
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 23:
                            DL0(parcel.readString(), parcel.readArrayList(AbstractC58319PtB.A0g(this)));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 24:
                            i5 = CKB(parcel.readString());
                            parcel2.writeNoException();
                            parcel2.writeInt(i5);
                            i3 = -399314222;
                            break;
                        case 25:
                            String CoI = CoI(parcel.readString());
                            parcel2.writeNoException();
                            parcel2.writeString(CoI);
                            i3 = -399314222;
                            break;
                        case 26:
                            String readString = parcel.readString();
                            IBinder readStrongBinder2 = parcel.readStrongBinder();
                            if (readStrongBinder2 == null) {
                                autofillOptOutCallback = null;
                            } else {
                                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.facebook.browser.lite.ipc.AutofillOptOutCallback");
                                if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof AutofillOptOutCallback)) {
                                    autofillOptOutCallback = (AutofillOptOutCallback) queryLocalInterface2;
                                } else {
                                    ?? obj2 = new Object();
                                    int A034 = C0f9.A03(720787706);
                                    obj2.A00 = readStrongBinder2;
                                    C0f9.A0A(464571067, A034);
                                    autofillOptOutCallback = obj2;
                                }
                            }
                            CyU(autofillOptOutCallback, readString);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 27:
                            IBinder readStrongBinder3 = parcel.readStrongBinder();
                            if (readStrongBinder3 == null) {
                                autofillScriptCallback = null;
                            } else {
                                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.facebook.browser.lite.ipc.AutofillScriptCallback");
                                if (queryLocalInterface3 != null && (queryLocalInterface3 instanceof AutofillScriptCallback)) {
                                    autofillScriptCallback = (AutofillScriptCallback) queryLocalInterface3;
                                } else {
                                    ?? obj3 = new Object();
                                    int A035 = C0f9.A03(-1557325651);
                                    obj3.A00 = readStrongBinder3;
                                    C0f9.A0A(516694902, A035);
                                    autofillScriptCallback = obj3;
                                }
                            }
                            AV1(autofillScriptCallback);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 28:
                            IBinder readStrongBinder4 = parcel.readStrongBinder();
                            if (readStrongBinder4 == null) {
                                autofillContactDataCallback = null;
                            } else {
                                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.facebook.browser.lite.ipc.AutofillContactDataCallback");
                                if (queryLocalInterface4 != null && (queryLocalInterface4 instanceof AutofillContactDataCallback)) {
                                    autofillContactDataCallback = (AutofillContactDataCallback) queryLocalInterface4;
                                } else {
                                    ?? obj4 = new Object();
                                    int A036 = C0f9.A03(-846231890);
                                    obj4.A00 = readStrongBinder4;
                                    C0f9.A0A(-1543772660, A036);
                                    autofillContactDataCallback = obj4;
                                }
                            }
                            AV0(autofillContactDataCallback);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                            parcel.readString();
                            A03 = C0f9.A03(2118996129);
                            i4 = -1636469484;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 30:
                            EUK();
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 31:
                            C0f9.A0A(-76652560, C0f9.A03(-1825849807));
                            parcel2.writeNoException();
                            parcel2.writeInt(i5);
                            i3 = -399314222;
                            break;
                        case 32:
                            A03 = C0f9.A03(759588264);
                            i4 = 1469028969;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 33:
                            A03 = C0f9.A03(-2060747393);
                            i4 = 1424864757;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 34:
                            A03 = C0f9.A03(344094765);
                            i4 = -899047213;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 35:
                            Cgs(parcel.readString());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 36:
                            AbstractC58323PtF.A0j(parcel, Bundle.CREATOR);
                            A03 = C0f9.A03(2139039858);
                            i4 = -37096398;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 37:
                            AbstractC58323PtF.A0j(parcel, Bundle.CREATOR);
                            A03 = C0f9.A03(841277013);
                            i4 = -121653057;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 38:
                            parcel.readString();
                            A03 = C0f9.A03(409635166);
                            i4 = -1179273335;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 39:
                            AbstractC58323PtF.A0j(parcel, Bundle.CREATOR);
                            A03 = C0f9.A03(1947487564);
                            i4 = 1258691220;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 40:
                            DxW(parcel.readString(), A00(parcel));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case Seq.NULL_REFNUM /* 41 */:
                            DHR();
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case Seq.RefTracker.REF_OFFSET /* 42 */:
                            i5 = CJz(A00(parcel), (ZonePolicy) AbstractC58323PtF.A0j(parcel, ZonePolicy.CREATOR), parcel.readString());
                            parcel2.writeNoException();
                            parcel2.writeInt(i5);
                            i3 = -399314222;
                            break;
                        case 43:
                            parcel.readString();
                            A03 = C0f9.A03(1191894845);
                            i4 = 27819589;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 44:
                            parcel.readString();
                            parcel.readHashMap(AbstractC58319PtB.A0g(this));
                            AbstractC58323PtF.A0j(parcel, Bundle.CREATOR);
                            AbstractC58323PtF.A0j(parcel, ZonePolicy.CREATOR);
                            A03 = C0f9.A03(99181187);
                            i4 = -1265326759;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 45:
                            AEI(A00(parcel), (ZonePolicy) AbstractC58323PtF.A0j(parcel, ZonePolicy.CREATOR), parcel.readString(), parcel.readHashMap(AbstractC58319PtB.A0g(this)));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                            Dkq();
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 47:
                            parcel.readString();
                            A03 = C0f9.A03(-1843404699);
                            i4 = -1755510600;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 48:
                            parcel.readString();
                            IBinder readStrongBinder5 = parcel.readStrongBinder();
                            if (readStrongBinder5 != null) {
                                readStrongBinder5.queryLocalInterface("com.facebook.browser.lite.ipc.IsUrlSavedCallback");
                                ExternalProvider externalProvider = ExternalProviders.A07;
                                externalProvider.A07().A00(6, 22, 615095521, 0L, externalProvider.A07().A00(6, 21, -690544592, 0L, 0));
                            }
                            A03 = C0f9.A03(-1386816484);
                            i4 = 1606403484;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 49:
                            parcel.readString();
                            parcel.readString();
                            parcel.readString();
                            parcel.readString();
                            parcel.readInt();
                            MoreInfoCallback.Stub.A00(parcel.readStrongBinder());
                            A03 = C0f9.A03(-1212417697);
                            i4 = 2111832146;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                            parcel.readString();
                            parcel.readString();
                            parcel.readString();
                            parcel.readString();
                            AbstractC58323PtF.A0j(parcel, Bundle.CREATOR);
                            IABBloksGraphQLCallback.Stub.A00(parcel.readStrongBinder());
                            A03 = C0f9.A03(1205641577);
                            i4 = -1738423570;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 51:
                            DL2(A00(parcel), IABBloksGraphQLCallback.Stub.A00(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 52:
                            String readString2 = parcel.readString();
                            String readString3 = parcel.readString();
                            String readString4 = parcel.readString();
                            String readString5 = parcel.readString();
                            boolean A1V = AbstractC37304Gc5.A1V(parcel);
                            Bundle A00 = A00(parcel);
                            IBinder readStrongBinder6 = parcel.readStrongBinder();
                            if (readStrongBinder6 == null) {
                                iABExpandableFooterCallback = null;
                            } else {
                                IInterface queryLocalInterface5 = readStrongBinder6.queryLocalInterface("com.facebook.browser.lite.ipc.IABExpandableFooterCallback");
                                if (queryLocalInterface5 != null && (queryLocalInterface5 instanceof IABExpandableFooterCallback)) {
                                    iABExpandableFooterCallback = (IABExpandableFooterCallback) queryLocalInterface5;
                                } else {
                                    ?? obj5 = new Object();
                                    int A037 = C0f9.A03(979870901);
                                    obj5.A00 = readStrongBinder6;
                                    C0f9.A0A(-1815032394, A037);
                                    iABExpandableFooterCallback = obj5;
                                }
                            }
                            DL4(A00, iABExpandableFooterCallback, readString2, readString3, readString4, readString5, A1V);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 53:
                            DL5(A00(parcel), IABExtensionEventHandlerCallback.Stub.A00(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 54:
                            parcel.readString();
                            parcel.readString();
                            parcel.createStringArrayList();
                            parcel.readString();
                            parcel.readString();
                            AbstractC58323PtF.A0j(parcel, Bundle.CREATOR);
                            IABBloksGraphQLCallback.Stub.A00(parcel.readStrongBinder());
                            A03 = C0f9.A03(-1700785247);
                            i4 = 1015980573;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 55:
                            DL7(A00(parcel), IABExtensionEventHandlerCallback.Stub.A00(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readString());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 56:
                            String readString6 = parcel.readString();
                            String readString7 = parcel.readString();
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            String readString8 = parcel.readString();
                            String readString9 = parcel.readString();
                            Bundle A002 = A00(parcel);
                            IBinder readStrongBinder7 = parcel.readStrongBinder();
                            if (readStrongBinder7 == null) {
                                iABExtensionPreExitHandlerBloksCallback = null;
                            } else {
                                IInterface queryLocalInterface6 = readStrongBinder7.queryLocalInterface("com.facebook.browser.lite.ipc.IABExtensionPreExitHandlerBloksCallback");
                                if (queryLocalInterface6 != null && (queryLocalInterface6 instanceof IABExtensionPreExitHandlerBloksCallback)) {
                                    iABExtensionPreExitHandlerBloksCallback = (IABExtensionPreExitHandlerBloksCallback) queryLocalInterface6;
                                } else {
                                    ?? obj6 = new Object();
                                    int A038 = C0f9.A03(1293900710);
                                    obj6.A00 = readStrongBinder7;
                                    C0f9.A0A(2117773616, A038);
                                    iABExtensionPreExitHandlerBloksCallback = obj6;
                                }
                            }
                            DL6(A002, iABExtensionPreExitHandlerBloksCallback, readString6, readString7, readString8, readString9, createStringArrayList);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 57:
                            parcel.readString();
                            parcel.readString();
                            parcel.readString();
                            AbstractC58323PtF.A0j(parcel, Bundle.CREATOR);
                            IBinder readStrongBinder8 = parcel.readStrongBinder();
                            if (readStrongBinder8 != null) {
                                readStrongBinder8.queryLocalInterface("com.facebook.browser.lite.ipc.IABExtensionStatesHandlerCallback");
                                ExternalProvider externalProvider2 = ExternalProviders.A07;
                                externalProvider2.A07().A00(6, 22, 2017802123, 0L, externalProvider2.A07().A00(6, 21, -539093955, 0L, 0));
                            }
                            A03 = C0f9.A03(946111903);
                            i4 = 1452341977;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 58:
                            parcel.readString();
                            parcel.readString();
                            A03 = C0f9.A03(-1149940949);
                            i4 = -1326793971;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 59:
                            parcel.readString();
                            parcel.readString();
                            MoreInfoCallback.Stub.A00(parcel.readStrongBinder());
                            A03 = C0f9.A03(1034853812);
                            i4 = 2044911922;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 60:
                            AbstractC58323PtF.A0j(parcel, Bundle.CREATOR);
                            A03 = C0f9.A03(-1117100260);
                            i4 = -422307955;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 61:
                            parcel.readHashMap(AbstractC58319PtB.A0g(this));
                            A03 = C0f9.A03(698023710);
                            i4 = 1394730892;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 62:
                            Bundle A003 = A00(parcel);
                            IBinder readStrongBinder9 = parcel.readStrongBinder();
                            if (readStrongBinder9 == null) {
                                onShopsLiteCallback = null;
                            } else {
                                IInterface queryLocalInterface7 = readStrongBinder9.queryLocalInterface("com.facebook.browser.lite.ipc.OnShopsLiteCallback");
                                if (queryLocalInterface7 != null && (queryLocalInterface7 instanceof OnShopsLiteCallback)) {
                                    onShopsLiteCallback = (OnShopsLiteCallback) queryLocalInterface7;
                                } else {
                                    ?? obj7 = new Object();
                                    int A039 = C0f9.A03(-895528790);
                                    obj7.A00 = readStrongBinder9;
                                    C0f9.A0A(1650200906, A039);
                                    onShopsLiteCallback = obj7;
                                }
                            }
                            E2w(A003, onShopsLiteCallback);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case StringTreeSet.PAYLOAD_MASK /* 63 */:
                            AbstractC58323PtF.A0j(parcel, Bundle.CREATOR);
                            A03 = C0f9.A03(-1726659738);
                            i4 = 970531915;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 64:
                            AbstractC58323PtF.A0j(parcel, Bundle.CREATOR);
                            A03 = C0f9.A03(-391554795);
                            i4 = -83157578;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 65:
                            AbstractC58323PtF.A0j(parcel, Bundle.CREATOR);
                            IBinder readStrongBinder10 = parcel.readStrongBinder();
                            if (readStrongBinder10 != null) {
                                readStrongBinder10.queryLocalInterface("com.facebook.browser.lite.ipc.ShopsLiteEligibilityCallback");
                                ExternalProvider externalProvider3 = ExternalProviders.A07;
                                externalProvider3.A07().A00(6, 22, 31780565, 0L, externalProvider3.A07().A00(6, 21, 649094977, 0L, 0));
                            }
                            A03 = C0f9.A03(-1328961372);
                            i4 = 1009514798;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 66:
                            CKL(A00(parcel));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 67:
                            A03 = C0f9.A03(181188311);
                            i4 = -1215627359;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 68:
                            parcel.readString();
                            parcel.readString();
                            A03 = C0f9.A03(-803467261);
                            i4 = 1978581140;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 69:
                            parcel.readString();
                            A03 = C0f9.A03(727812043);
                            i4 = -291732096;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 70:
                            parcel.readString();
                            parcel.readString();
                            parcel.readInt();
                            A03 = C0f9.A03(-712695208);
                            i4 = 160403363;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 71:
                            parcel.readString();
                            parcel.readString();
                            parcel.readInt();
                            A03 = C0f9.A03(-1617947190);
                            i4 = 1390101569;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 72:
                            parcel.readString();
                            parcel.readString();
                            parcel.readLong();
                            A03 = C0f9.A03(-1026249787);
                            i4 = -1547289604;
                            C0f9.A0A(i4, A03);
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 73:
                            parcel.readString();
                            parcel.readString();
                            int readInt = parcel.readInt();
                            C0f9.A0A(1682756204, C0f9.A03(-774321207));
                            i5 = readInt;
                            parcel2.writeNoException();
                            parcel2.writeInt(i5);
                            i3 = -399314222;
                            break;
                        case 74:
                            parcel.readString();
                            parcel.readString();
                            int i6 = parcel.readInt() != 0 ? 1 : 0;
                            C0f9.A0A(772328719, C0f9.A03(1513703752));
                            i5 = i6;
                            parcel2.writeNoException();
                            parcel2.writeInt(i5);
                            i3 = -399314222;
                            break;
                        case 75:
                            parcel.readString();
                            parcel.readString();
                            long readLong = parcel.readLong();
                            C0f9.A0A(496264777, C0f9.A03(557280527));
                            parcel2.writeNoException();
                            parcel2.writeLong(readLong);
                            i3 = -399314222;
                            break;
                        case 76:
                            CJX(parcel.readString(), parcel.readString());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 77:
                            CiY(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readHashMap(AbstractC58319PtB.A0g(this)));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 78:
                            CJW(parcel.readString());
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                        case 79:
                            CiX(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readHashMap(AbstractC58319PtB.A0g(this)));
                            parcel2.writeNoException();
                            i3 = -399314222;
                            break;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.browser.lite.ipc.BrowserLiteCallback");
                    i3 = -1800119072;
                }
                C0f9.A0A(i3, A032);
                return z;
            }
            z = super.onTransact(i, parcel, parcel2, i2);
            i3 = -1944335588;
            C0f9.A0A(i3, A032);
            return z;
        }

        public BrowserLiteCallbackImpl() {
            int A03 = C0f9.A03(-48400316);
            attachInterface(this, "com.facebook.browser.lite.ipc.BrowserLiteCallback");
            C0f9.A0A(-1722318555, A03);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new BrowserLiteCallbackImpl();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int A04 = C0f9.A04(150097003);
        super.onDestroy();
        C6QM.A00(this);
        C0f9.A0B(1098470020, A04);
    }
}
