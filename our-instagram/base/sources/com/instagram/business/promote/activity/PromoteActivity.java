package com.instagram.business.promote.activity;

import X.AbstractC018607g;
import X.AbstractC06930Yk;
import X.AbstractC111324zv;
import X.AbstractC115105If;
import X.AbstractC13670mt;
import X.AbstractC138316On;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC192798gL;
import X.AbstractC2044893h;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31180DnO;
import X.AbstractC43591JPw;
import X.AbstractC43594JPz;
import X.AbstractC65702TsY;
import X.AbstractC67958V3x;
import X.AbstractC68465VRv;
import X.AbstractC70133W6h;
import X.AbstractC83893oY;
import X.AnonymousClass001;
import X.C00O;
import X.C019707r;
import X.C05F;
import X.C06090Tz;
import X.C08790ch;
import X.C09530e4;
import X.C0Zx;
import X.C0f9;
import X.C115115Ig;
import X.C140966Yy;
import X.C14360o3;
import X.C16930sl;
import X.C18920wW;
import X.C18C;
import X.C18U;
import X.C192108fB;
import X.C195928le;
import X.C1GJ;
import X.C1ON;
import X.C1QT;
import X.C1XM;
import X.C25531Mh;
import X.C25621Ms;
import X.C2JM;
import X.C32393EOu;
import X.C3LO;
import X.C3LY;
import X.C3T1;
import X.C41254INv;
import X.C50259MHo;
import X.C56352iT;
import X.C63994SxR;
import X.C66566UNc;
import X.C67789UyO;
import X.C67837UzA;
import X.C67889V0w;
import X.C67908V1x;
import X.C67909V1y;
import X.C69859Vwk;
import X.C6PZ;
import X.C70172WEu;
import X.C70399WUb;
import X.C70630WeA;
import X.C70816WhZ;
import X.C907442n;
import X.C9GR;
import X.EnumC39597He7;
import X.EnumC53368NjJ;
import X.H9T;
import X.InterfaceC02590Ai;
import X.InterfaceC08430c6;
import X.InterfaceC09390do;
import X.InterfaceC16660sJ;
import X.InterfaceC60122ou;
import X.InterfaceC65494TlI;
import X.InterfaceC72021XFj;
import X.MSV;
import X.UPA;
import X.UPI;
import X.V0Y;
import X.V22;
import X.VEA;
import X.VG4;
import X.VHX;
import X.VRD;
import X.W2Z;
import X.W6E;
import X.W6f;
import X.WG3;
import X.WGU;
import X.WGs;
import X.WW0;
import X.X31;
import X.XAD;
import X.XAE;
import X.XAF;
import X.XCO;
import X.XCP;
import X.XDE;
import X.XFZ;
import android.content.Intent;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.instagram.api.schemas.AdsAPIInstagramPosition;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.api.schemas.XFBCTXWelcomeMessageStatus;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.boost.model.AdCreativeAuthorizationCategory;
import com.instagram.business.promote.model.LinkingAuthState;
import com.instagram.business.promote.model.PromoteAudience;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.business.promote.model.SpecialRequirementCategory;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.model.mediatype.ProductType;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class PromoteActivity extends BaseFragmentActivity implements InterfaceC72021XFj, XFZ, XDE, XCP, InterfaceC65494TlI, XCO, XAD, XAF {
    public PromoteData A00;
    public PromoteState A01;
    public SpinnerImageView A02;
    public boolean A03;
    public PermissionsModule A04;
    public final InterfaceC09390do A06 = C1XM.A00(new X31(this, 15));
    public final InterfaceC09390do A0A = C1XM.A00(new X31(this, 19));
    public final InterfaceC09390do A05 = C1XM.A00(new X31(this, 14));
    public final InterfaceC09390do A07 = C1XM.A00(new X31(this, 16));
    public final InterfaceC09390do A09 = C1XM.A00(new X31(this, 18));
    public final InterfaceC09390do A08 = C1XM.A00(new X31(this, 17));

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.XDE
    public final void Cn9(String str, String str2) {
        C14360o3.A0B(str2, 1);
        C70816WhZ A00 = VRD.A00(getSession());
        C67908V1x c67908V1x = C67908V1x.A00;
        C70816WhZ.A01(c67908V1x, A00, AnonymousClass001.A0R(str2, "_screen_rendering_success"));
        C67909V1y c67909V1y = C67909V1y.A00;
        C70816WhZ.A01(c67909V1y, A00, AnonymousClass001.A0R(str2, "_screen_rendering_success"));
        C70816WhZ A002 = VRD.A00(getSession());
        C1QT c1qt = A002.A00;
        c1qt.flowAnnotate(c67909V1y.A00, "analytic_module", str);
        c1qt.flowAnnotate(c67909V1y.A00, "destination_screen", str2);
        C70816WhZ.A01(c67909V1y, A002, "navigation_success");
        long j = c67909V1y.A00;
        if (j != 0) {
            c1qt.flowEndSuccess(j);
            c67909V1y.A00 = 0L;
        }
        PromoteData promoteData = this.A00;
        if (promoteData != null) {
            if (!promoteData.A2V) {
                InterfaceC09390do interfaceC09390do = this.A07;
                C70399WUb A0N = AbstractC65702TsY.A0N(interfaceC09390do);
                PromoteData promoteData2 = this.A00;
                if (promoteData2 != null) {
                    String str3 = promoteData2.A1S;
                    EnumC39597He7 enumC39597He7 = promoteData2.A12;
                    A0N.A02 = str3;
                    C0Zx c0Zx = new C0Zx();
                    c0Zx.A03("is_business_user_access_token_enabled", true);
                    c0Zx.A03("is_business_user_access_token_enabled_and_cached", Boolean.valueOf(A0N.A04));
                    LinkingAuthState linkingAuthState = A0N.A00;
                    if (linkingAuthState == null) {
                        linkingAuthState = LinkingAuthState.A03;
                    }
                    c0Zx.A06("token_auth_state", linkingAuthState.toString());
                    if (enumC39597He7 != null) {
                        c0Zx.A06("media_boosted_status", enumC39597He7.toString());
                    }
                    C18920wW c18920wW = A0N.A05;
                    InterfaceC02590Ai A003 = c18920wW.A00(c18920wW.A00, "promoted_posts_enter");
                    A003.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A0N.A01);
                    AbstractC65702TsY.A1E(A003, A0N, "waterfall_id", A0N.A03);
                    A003.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2);
                    A003.AAQ(c0Zx, "configurations");
                    A003.A8R(VHX.IG_ANDROID, "creation_platform_id");
                    A003.AAP("bfa_platform", "native_android");
                    A003.Cht();
                    PromoteData promoteData3 = this.A00;
                    if (promoteData3 != null) {
                        if (promoteData3.A2C) {
                            C70399WUb A0N2 = AbstractC65702TsY.A0N(interfaceC09390do);
                            PromoteData promoteData4 = this.A00;
                            if (promoteData4 != null) {
                                ProductType productType = promoteData4.A17;
                                String str4 = promoteData4.A1S;
                                HashMap hashMap = new HashMap();
                                hashMap.put("media_igid", str4);
                                C18920wW c18920wW2 = A0N2.A05;
                                InterfaceC02590Ai A004 = c18920wW2.A00(c18920wW2.A00, MSV.A00(52));
                                EnumC53368NjJ enumC53368NjJ = null;
                                if (productType != null) {
                                    int ordinal = productType.ordinal();
                                    if (ordinal != 1) {
                                        if (ordinal != 9) {
                                            if (ordinal == 13) {
                                                enumC53368NjJ = EnumC53368NjJ.BIO_IG_REELS;
                                            }
                                        } else {
                                            enumC53368NjJ = EnumC53368NjJ.BIO_IG_STORY;
                                        }
                                    } else {
                                        enumC53368NjJ = EnumC53368NjJ.BIO_IG_POST;
                                    }
                                }
                                A004.A8R(enumC53368NjJ, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                                A004.A9M("extra_data", hashMap);
                                A004.AAP("event", "seller_boost_bio_started");
                                A004.Cht();
                            }
                        }
                        C1QT c1qt2 = VRD.A00(getSession()).A00;
                        c1qt2.flowAnnotate(c67908V1x.A00, "analytic_module", str);
                        c1qt2.flowAnnotate(c67908V1x.A00, "initial_screen", str2);
                        long j2 = c67908V1x.A00;
                        if (j2 != 0) {
                            c1qt2.flowEndSuccess(j2);
                            c67908V1x.A00 = 0L;
                        }
                        PromoteData promoteData5 = this.A00;
                        if (promoteData5 != null) {
                            promoteData5.A2V = true;
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("promoteData");
        throw C00O.createAndThrow();
    }

    @Override // X.XDE
    public final void CnA(String str) {
        C14360o3.A0B(str, 0);
        C70816WhZ A00 = VRD.A00(getSession());
        C67909V1y c67909V1y = C67909V1y.A00;
        if (c67909V1y.A00 != 0) {
            C70816WhZ.A00(c67909V1y, A00);
        }
        C1QT c1qt = A00.A00;
        long flowStartForMarker = c1qt.flowStartForMarker(c67909V1y.A01, str, true);
        c67909V1y.A00 = flowStartForMarker;
        c1qt.flowAnnotate(flowStartForMarker, "source_screen", str);
        C70816WhZ.A01(c67909V1y, A00, "navigation_start");
    }

    @Override // X.XDE
    public final void CnB(String str) {
        C14360o3.A0B(str, 0);
        C70816WhZ A00 = VRD.A00(getSession());
        C70816WhZ.A01(C67908V1x.A00, A00, AnonymousClass001.A0R(str, "_screen_rendering_start"));
        C70816WhZ.A01(C67909V1y.A00, A00, AnonymousClass001.A0R(str, "_screen_rendering_start"));
    }

    @Override // X.XAF
    public final void Dc7(PromoteState promoteState, Integer num) {
        AbstractC167007dF.A1K(promoteState, num);
        int intValue = num.intValue();
        boolean z = false;
        if (intValue != 0 && intValue != 3) {
            return;
        }
        PromoteData promoteData = this.A00;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        String str = promoteData.A1Z;
        if (str != null) {
            z = WGs.A0S(promoteData, str);
        }
        promoteState.A0D(z);
    }

    @Override // X.InterfaceC65494TlI
    public final void EJF(PermissionsModule permissionsModule, String[] strArr, int i) {
        C14360o3.A0B(strArr, 0);
        this.A04 = permissionsModule;
        requestPermissions(strArr, i);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        String str;
        C14360o3.A0B(bundle, 0);
        PromoteData promoteData = this.A00;
        if (promoteData == null) {
            str = "promoteData";
        } else {
            bundle.putParcelable("PromoteActivity.saveInstanceState.PromoteData", promoteData);
            PromoteState promoteState = this.A01;
            if (promoteState == null) {
                str = "promoteState";
            } else {
                bundle.putParcelable("PromoteActivity.saveInstanceState.PromoteState", promoteState);
                bundle.putBoolean("PromoteActivity.saveInstanceState.hasGoneThroughNoCachePrevalidationBloksFlow", this.A03);
                super.onSaveInstanceState(bundle);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final C70399WUb A00(PromoteActivity promoteActivity) {
        return AbstractC65702TsY.A0N(promoteActivity.A07);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000f. Please report as an issue. */
    private final Integer A01() {
        PromoteData promoteData = this.A00;
        if (promoteData != null) {
            String str = promoteData.A1K;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2039677941:
                        if (str.equals("ad_tools_ctd_aymt")) {
                            return C05F.A0N;
                        }
                        break;
                    case -1541613254:
                        if (str.equals("messaging_hub")) {
                            return C05F.A0j;
                        }
                        break;
                    case 481190433:
                        if (str.equals("direct_ctd_aymt")) {
                            return C05F.A0C;
                        }
                        break;
                    case 1097160416:
                        if (str.equals("messaging_hub_ctwa")) {
                            return C05F.A0u;
                        }
                        break;
                }
            }
            if (promoteData.A2i) {
                return C05F.A0Y;
            }
            if (promoteData.A2h) {
                return C05F.A01;
            }
            if (!C14360o3.A0K(str, "aymt_dropoff")) {
                return null;
            }
            PromoteData promoteData2 = this.A00;
            if (promoteData2 != null) {
                String str2 = promoteData2.A1Y;
                if (str2 == null) {
                    return null;
                }
                Integer num = C05F.A15;
                if (!str2.equals("aymt_ctwa_dropoff")) {
                    num = C05F.A1F;
                    if (!str2.equals("aymt_ctd_dropoff")) {
                        num = C05F.A02;
                        if (!str2.equals("aymt_pv_dropoff")) {
                            num = C05F.A1I;
                            if (!str2.equals("aymt_wv_dropoff")) {
                                return null;
                            }
                        }
                    }
                }
                return num;
            }
        }
        C14360o3.A0F("promoteData");
        throw C00O.createAndThrow();
    }

    public static final void A03(PromoteActivity promoteActivity) {
        SpinnerImageView spinnerImageView = promoteActivity.A02;
        if (spinnerImageView == null) {
            C14360o3.A0F("loadingSpinner");
            throw C00O.createAndThrow();
        }
        spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
    }

    public static final void A05(PromoteActivity promoteActivity) {
        W2Z w2z = (W2Z) promoteActivity.A08.getValue();
        PromoteData promoteData = promoteActivity.A00;
        if (promoteData != null) {
            String str = promoteData.A1K;
            C14360o3.A06(str);
            InterfaceC09390do interfaceC09390do = promoteActivity.A07;
            String str2 = AbstractC65702TsY.A0N(interfaceC09390do).A03;
            C14360o3.A07(str2);
            C25531Mh c25531Mh = w2z.A00;
            c25531Mh.A0k("pro_identity_open_pro2pro_bloks");
            c25531Mh.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            c25531Mh.A0R("flow_id", str2);
            c25531Mh.Cht();
            W2Z.A00(w2z).markerPoint(409679146, "pro_identity_launch_pro2pro_bloks");
            W2Z.A00(w2z).markerAnnotate(409679146, "has_skipped_bloks", false);
            C70816WhZ.A01(C67908V1x.A00, VRD.A00(promoteActivity.getSession()), "launch_posm_1_from_native_start");
            PromoteData promoteData2 = promoteActivity.A00;
            if (promoteData2 != null) {
                if (promoteData2.A1b != null) {
                    AbstractC65702TsY.A0N(interfaceC09390do).A0S(AbstractC43591JPw.A00(670), "posm1_bfa");
                }
                C08790ch A00 = AbstractC018607g.A00(promoteActivity);
                UserSession session = promoteActivity.getSession();
                PromoteData promoteData3 = promoteActivity.A00;
                if (promoteData3 != null) {
                    String str3 = promoteData3.A1K;
                    C14360o3.A06(str3);
                    String str4 = AbstractC65702TsY.A0N(interfaceC09390do).A03;
                    C14360o3.A07(str4);
                    PromoteData promoteData4 = promoteActivity.A00;
                    if (promoteData4 != null) {
                        String str5 = promoteData4.A1b;
                        C14360o3.A0B(session, 1);
                        Integer num = C05F.A0N;
                        String A002 = AbstractC111324zv.A00(1182);
                        LinkedHashMap A02 = AbstractC70133W6h.A02(str5);
                        ArrayList arrayList = new ArrayList();
                        AbstractC166997dE.A1R(VEA.A09, str3, arrayList);
                        AbstractC166997dE.A1R(VEA.A0B, A002, arrayList);
                        AbstractC166997dE.A1R(VEA.A0C, str4, arrayList);
                        AbstractC166997dE.A1R(VEA.A0G, 4, arrayList);
                        VEA vea = VEA.A0A;
                        JSONObject jSONObject = new JSONObject();
                        Iterator A0l = AbstractC167007dF.A0l(A02);
                        while (A0l.hasNext()) {
                            String str6 = (String) A0l.next();
                            jSONObject.put(str6, A02.get(str6));
                        }
                        AbstractC166997dE.A1R(vea, jSONObject, arrayList);
                        JSONObject jSONObject2 = new JSONObject();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C09530e4 c09530e4 = (C09530e4) it.next();
                            jSONObject2.put(((VEA) c09530e4.A00).A00, c09530e4.A01);
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("server_params", jSONObject2);
                        AbstractC192798gL A05 = C192108fB.A05(session, "com.bloks.www.ig_promote.linking.async_flow_controller", AbstractC167017dG.A0r("params", AbstractC166987dD.A19(jSONObject3)));
                        A05.A00(new C32393EOu(2, promoteActivity, num, session));
                        C1GJ.A00(promoteActivity, A00, A05);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F("promoteData");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.0pQ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(com.instagram.business.promote.activity.PromoteActivity r19) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.promote.activity.PromoteActivity.A06(com.instagram.business.promote.activity.PromoteActivity):void");
    }

    public static final void A08(PromoteActivity promoteActivity, String str) {
        if (str == null) {
            str = AbstractC166997dE.A0p(promoteActivity, 2131970899);
        }
        C9GR.A09(promoteActivity, str);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    /* renamed from: A0n, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        return (UserSession) this.A0A.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [X.0sl] */
    @Override // X.XAD
    public final void AMs(VG4 vg4, XAE xae) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        String obj;
        String str6;
        Date date;
        Object arrayList;
        String str7;
        String str8;
        HashMap hashMap;
        Object obj2;
        PromoteData promoteData = this.A00;
        if (promoteData != null) {
            if (promoteData.A0D()) {
                UserSession session = getSession();
                PromoteData promoteData2 = this.A00;
                if (promoteData2 != null) {
                    List A02 = A02();
                    V22 v22 = new V22(vg4, AbstractC65702TsY.A0N(this.A07), this, xae, 1);
                    C14360o3.A0B(session, 0);
                    XIGIGBoostDestination xIGIGBoostDestination = promoteData2.A0i;
                    if (xIGIGBoostDestination != null) {
                        List list = promoteData2.A1v;
                        C14360o3.A06(list);
                        Currency currency = promoteData2.A1j;
                        C14360o3.A06(currency);
                        String str9 = promoteData2.A1A;
                        C14360o3.A06(str9);
                        XFBCTXWelcomeMessageStatus xFBCTXWelcomeMessageStatus = promoteData2.A0a;
                        XIGIGBoostCallToAction A01 = C70172WEu.A01(promoteData2);
                        int i2 = promoteData2.A0I;
                        int i3 = promoteData2.A0A;
                        boolean z = promoteData2.A2w;
                        boolean contains = promoteData2.A21.contains(SpecialRequirementCategory.A08);
                        boolean z2 = promoteData2.A2s;
                        boolean z3 = promoteData2.A2d;
                        boolean z4 = promoteData2.A2K;
                        ArrayList A0K = WGs.A0K(promoteData2.A0i, session, promoteData2.A2f);
                        AdCreativeAuthorizationCategory adCreativeAuthorizationCategory = promoteData2.A0k;
                        C14360o3.A06(adCreativeAuthorizationCategory);
                        String str10 = promoteData2.A1b;
                        List A00 = AbstractC68465VRv.A00(promoteData2);
                        PromoteData.A02(promoteData2);
                        if (AbstractC83893oY.A00(promoteData2.A20)) {
                            arrayList = C16930sl.A00;
                        } else {
                            arrayList = new ArrayList();
                            Iterator it = promoteData2.A20.iterator();
                            while (it.hasNext()) {
                                AbstractC166997dE.A1S(it.next(), arrayList);
                            }
                        }
                        ArrayList A0A = promoteData2.A0A();
                        if (WGs.A0P(promoteData2.A06())) {
                            str7 = null;
                        } else {
                            str7 = promoteData2.A1Z;
                        }
                        String str11 = promoteData2.A1I;
                        PromoteAudience A07 = promoteData2.A07();
                        if (A07 != null) {
                            str8 = A07.A06;
                        } else {
                            str8 = null;
                        }
                        String str12 = promoteData2.A1J;
                        ImmutableList A03 = promoteData2.A03();
                        XIGIGBoostDestination xIGIGBoostDestination2 = promoteData2.A0j;
                        if (C18U.A06(C06090Tz.A05, session, 36318509743020264L)) {
                            PromoteAudience A072 = promoteData2.A07();
                            if (A072 != null && A072.A0C) {
                                hashMap = new HashMap();
                                hashMap.put("beneficiary", promoteData2.A1C);
                                hashMap.put("payor", promoteData2.A1D);
                            } else {
                                hashMap = null;
                            }
                        } else {
                            hashMap = null;
                        }
                        C70399WUb.A00(session).A0S(vg4.toString(), "create_promotion_attempt");
                        ArrayList A0q = AbstractC167017dG.A0q(list);
                        for (Object obj3 : list) {
                            String str13 = C70399WUb.A00(session).A03;
                            C14360o3.A07(str13);
                            if (A03 == null) {
                                obj2 = C16930sl.A00;
                            } else {
                                obj2 = A03;
                            }
                            LinkedHashMap A073 = AbstractC06930Yk.A07(new C09530e4("fb_auth_token", str9), new C09530e4("flow_id", str13), new C09530e4("media_id", obj3), new C09530e4("destination", xIGIGBoostDestination.toString()), new C09530e4("authorization_category", adCreativeAuthorizationCategory.toString()), new C09530e4("call_to_action", A01.toString()), new C09530e4("total_budget_with_offset", String.valueOf(i2)), new C09530e4("duration_in_days", String.valueOf(i3)), new C09530e4("run_continuously", Boolean.valueOf(z)), new C09530e4("is_political_ad", Boolean.valueOf(contains)), new C09530e4("is_story_placement_eligible", Boolean.valueOf(z2)), new C09530e4("is_explore_placement_eligible", Boolean.valueOf(z3)), new C09530e4("has_product_tags", Boolean.valueOf(z4)), new C09530e4("instagram_positions", A02), new C09530e4("currency", currency.getCurrencyCode()), new C09530e4("additional_publisher_platforms", A0K), new C09530e4("regulated_categories", obj2), new C09530e4("messaging_destinations", arrayList));
                            if (hashMap != null) {
                                A073.put("dsa_data", hashMap);
                            }
                            if (A00 != null) {
                                A073.put("profile_visit_enabled_secondary_cta", A00);
                            }
                            if (A0A != null) {
                                A073.put("ad_format_preferences", A0A);
                            }
                            if (xFBCTXWelcomeMessageStatus != null) {
                                A073.put("ctx_welcome_message_status_v2", xFBCTXWelcomeMessageStatus.toString());
                            }
                            if (str10 != null) {
                                A073.put("selected_audio_spec", new JSONObject(str10));
                            }
                            if (str11 != null) {
                                A073.put("website_url", str11);
                            }
                            if (str7 != null) {
                                A073.put("audience_id", str7);
                            }
                            if (str8 != null) {
                                A073.put("regulated_target_spec_string", new JSONObject(str8));
                            }
                            if (str12 != null) {
                                A073.put("draft_id", str12);
                            }
                            if (xIGIGBoostDestination2 != null) {
                                A073.put("messaging_tool_selected", xIGIGBoostDestination2.toString());
                            }
                            A0q.add(new JSONObject(AbstractC06930Yk.A0B(A073)));
                        }
                        String A0b = AbstractC31175DnJ.A0b(A0q);
                        C14360o3.A07(A0b);
                        C25621Ms A0c = AbstractC167017dG.A0c(session);
                        A0c.A0B("ads/promote/create_promotion_split_test/");
                        A0c.A9s("fb_auth_token", str9);
                        A0c.A9s("promotion_requests", A0b);
                        A0c.A0P(null, C67789UyO.class, C69859Vwk.class, false);
                        C1ON A0N = A0c.A0N();
                        ((AbstractC67958V3x) v22).A02 = WG3.A01("/api/v1/ads/promote/create_promotion_split_test/");
                        A0N.A00 = v22;
                        C1GJ.A03(A0N);
                        return;
                    }
                    return;
                }
            } else {
                W6E w6e = (W6E) this.A05.getValue();
                String A0b2 = AbstractC31175DnJ.A0b(A02());
                V22 v222 = new V22(vg4, AbstractC65702TsY.A0N(this.A07), this, xae, 0);
                UserSession userSession = w6e.A08;
                C70399WUb.A00(userSession).A0S(vg4.toString(), "create_promotion_attempt");
                PromoteData promoteData3 = w6e.A03;
                ArrayList A0K2 = WGs.A0K(promoteData3.A0i, userSession, promoteData3.A2f);
                String str14 = null;
                if (WGs.A0P(promoteData3.A06())) {
                    str = null;
                } else {
                    str = promoteData3.A1Z;
                }
                LeadForm leadForm = promoteData3.A16;
                if (leadForm == null) {
                    str2 = null;
                } else {
                    str2 = leadForm.A03;
                }
                C14360o3.A0B(userSession, 0);
                if (C18U.A06(C06090Tz.A05, userSession, 36318509743020264L)) {
                    PromoteAudience A074 = promoteData3.A07();
                    if (A074 != null && A074.A0C) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("beneficiary", promoteData3.A1C);
                        hashMap2.put("payor", promoteData3.A1D);
                        str3 = new Gson().A0B(hashMap2);
                    } else {
                        str3 = null;
                    }
                } else {
                    str3 = null;
                }
                PromoteAudience A075 = promoteData3.A07();
                if (A075 != null) {
                    str14 = A075.A06;
                }
                if (w6e.A04.A09 && (date = promoteData3.A1k) != null) {
                    i = (int) (date.getTime() / 1000);
                } else {
                    i = -1;
                }
                Currency currency2 = promoteData3.A1j;
                String str15 = promoteData3.A1A;
                String str16 = w6e.A02.A03;
                String str17 = promoteData3.A1S;
                XIGIGBoostDestination xIGIGBoostDestination3 = promoteData3.A0i;
                XFBCTXWelcomeMessageStatus xFBCTXWelcomeMessageStatus2 = promoteData3.A0a;
                XIGIGBoostCallToAction A012 = C70172WEu.A01(promoteData3);
                int i4 = promoteData3.A0I;
                int i5 = promoteData3.A0A;
                boolean z5 = promoteData3.A2w;
                boolean contains2 = promoteData3.A21.contains(SpecialRequirementCategory.A08);
                boolean z6 = promoteData3.A2s;
                boolean z7 = promoteData3.A2d;
                boolean z8 = promoteData3.A2K;
                AdCreativeAuthorizationCategory adCreativeAuthorizationCategory2 = promoteData3.A0k;
                String str18 = promoteData3.A1b;
                List A002 = AbstractC68465VRv.A00(promoteData3);
                if (A002 != null) {
                    str4 = AbstractC31175DnJ.A0b(A002);
                } else {
                    str4 = null;
                }
                String A09 = promoteData3.A09();
                ArrayList A0A2 = promoteData3.A0A();
                if (A0A2 != null) {
                    str5 = new Gson().A0B(A0A2);
                } else {
                    str5 = null;
                }
                String str19 = promoteData3.A1I;
                String str20 = null;
                String str21 = promoteData3.A1J;
                ImmutableList A032 = promoteData3.A03();
                XIGIGBoostDestination xIGIGBoostDestination4 = promoteData3.A0j;
                if (AbstractC83893oY.A00(promoteData3.A1x)) {
                    obj = null;
                } else {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it2 = promoteData3.A1x.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next().toString());
                    }
                    obj = jSONArray.toString();
                }
                Set set = promoteData3.A25;
                if (set != null) {
                    str6 = new Gson().A0B(set);
                } else {
                    str6 = null;
                }
                String str22 = promoteData3.A1d;
                String str23 = promoteData3.A1g;
                C25621Ms A0c2 = AbstractC167017dG.A0c(userSession);
                A0c2.A0B("ads/promote/create_promotion_v2/");
                A0c2.A9s("fb_auth_token", str15);
                A0c2.A9s("flow_id", str16);
                A0c2.A9s("media_id", str17);
                A0c2.A9s("authorization_category", adCreativeAuthorizationCategory2.toString());
                String str24 = null;
                if (xFBCTXWelcomeMessageStatus2 != null) {
                    str20 = xFBCTXWelcomeMessageStatus2.toString();
                }
                A0c2.A0H("ctx_welcome_message_status_v2", str20);
                A0c2.A9s("call_to_action", A012.toString());
                A0c2.A9s("total_budget_with_offset", String.valueOf(i4));
                A0c2.A9s("duration_in_days", String.valueOf(i5));
                A0c2.A0I("run_continuously", z5);
                A0c2.A0I("is_political_ad", contains2);
                A0c2.A0I("is_story_placement_eligible", z6);
                A0c2.A0I("is_explore_placement_eligible", z7);
                A0c2.A0I("has_product_tags", z8);
                A0c2.A9s("instagram_positions", A0b2);
                A0c2.A9s("additional_publisher_platforms", AbstractC31175DnJ.A0b(A0K2));
                if (xIGIGBoostDestination3 != null) {
                    str24 = xIGIGBoostDestination3.toString();
                }
                A0c2.A0H("destination", str24);
                A0c2.A0H("selected_audio_spec", str18);
                A0c2.A0H("website_url", str19);
                A0c2.A0H("audience_id", str);
                A0c2.A0H("currency", currency2.getCurrencyCode());
                A0c2.A0H("regulated_target_spec_string", str14);
                A0c2.A0H("draft_id", str21);
                A0c2.A0H("lead_gen_form_id", str2);
                A0c2.A0H("dsa_data", str3);
                A0c2.A0H("profile_visit_enabled_secondary_cta", str4);
                A0c2.A0H("message_extensions", obj);
                A0c2.A0H("regulated_categories", AbstractC31175DnJ.A0b(A032));
                A0c2.A0H("regional_regulated_categories", str6);
                A0c2.A0H("taiwan_fin_serv_beneficiary_id", str22);
                A0c2.A0H("taiwan_fin_serv_funder_id", str23);
                A0c2.A0S(H9T.class, C41254INv.class);
                if (!AbstractC13670mt.A0B(str5)) {
                    A0c2.A9s("ad_format_preferences", str5);
                }
                if (xIGIGBoostDestination4 != null) {
                    A0c2.A9s("messaging_tool_selected", xIGIGBoostDestination4.toString());
                }
                if (!AbstractC13670mt.A0B(A09)) {
                    A0c2.A9s("messaging_destinations", A09);
                }
                if (i > 0) {
                    A0c2.A0D(TraceFieldType.StartTime, i);
                }
                C1ON A0N2 = A0c2.A0N();
                ((AbstractC67958V3x) v222).A02 = WG3.A01("/api/v1/ads/promote/create_promotion_v2/");
                A0N2.A00 = v222;
                w6e.A07.schedule(A0N2);
                return;
            }
        }
        C14360o3.A0F("promoteData");
        throw C00O.createAndThrow();
    }

    @Override // X.XCP
    public final void AUv() {
        W6E w6e = (W6E) this.A05.getValue();
        ArrayList BIR = BIR();
        ArrayList A0q = AbstractC167017dG.A0q(BIR);
        Iterator it = BIR.iterator();
        while (it.hasNext()) {
            AbstractC166997dE.A1S(it.next(), A0q);
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) A0q);
        C2JM c2jm = new C2JM();
        UserSession userSession = w6e.A08;
        boolean A1X = AbstractC43594JPz.A1X(c2jm, PublicKeyCredentialControllerUtility.JSON_KEY_ID, userSession.userId);
        PromoteData promoteData = w6e.A03;
        c2jm.A04("access_token", promoteData.A1A);
        c2jm.A04("media_id", promoteData.A1S);
        c2jm.A04("flow_type", promoteData.A0l.toString());
        c2jm.A05("instagram_positions", copyOf);
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        if (xIGIGBoostDestination != null) {
            c2jm.A04("ig_boost_destination", xIGIGBoostDestination.toString());
        }
        if (!AbstractC83893oY.A00(promoteData.A03())) {
            ImmutableList A03 = promoteData.A03();
            A03.getClass();
            c2jm.A05("regulated_categories", ImmutableList.copyOf((Collection) A03));
        }
        C195928le A00 = C195928le.A00(userSession);
        C18C.A0E(A1X);
        C907442n c907442n = new C907442n(c2jm, C66566UNc.class, "IGPromoteAdFormatPreferencesQuery", false);
        A00.ATV(new C63994SxR(3), new WW0(w6e, 8), c907442n);
    }

    @Override // X.XCO
    public final void AV2() {
        W2Z.A00((W2Z) this.A08.getValue()).markerPoint(409679146, "pro_identity_fetch_buat");
        A09(this, new C50259MHo(this, 46));
    }

    @Override // X.InterfaceC72021XFj
    public final ArrayList BIR() {
        PromoteData promoteData = this.A00;
        if (promoteData != null) {
            List<AdsAPIInstagramPosition> list = promoteData.A1r;
            C14360o3.A06(list);
            UserSession session = getSession();
            PromoteData promoteData2 = this.A00;
            if (promoteData2 != null) {
                XIGIGBoostDestination xIGIGBoostDestination = promoteData2.A0i;
                ArrayList A12 = AbstractC166997dE.A12(session, 1);
                for (AdsAPIInstagramPosition adsAPIInstagramPosition : list) {
                    if (C6PZ.A03(adsAPIInstagramPosition, xIGIGBoostDestination, session)) {
                        A12.add(adsAPIInstagramPosition);
                    }
                }
                return A12;
            }
        }
        C14360o3.A0F("promoteData");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC72021XFj
    public final PromoteData BiY() {
        PromoteData promoteData = this.A00;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        return promoteData;
    }

    @Override // X.XFZ
    public final PromoteState Bia() {
        PromoteState promoteState = this.A01;
        if (promoteState == null) {
            C14360o3.A0F("promoteState");
            throw C00O.createAndThrow();
        }
        return promoteState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if (r36 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        r0.A0D = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        r0.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0149, code lost:
    
        if (r36 != false) goto L27;
     */
    @Override // X.XCP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CqW(com.instagram.common.typedurl.ImageUrl r33, java.lang.String r34, java.lang.String r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.promote.activity.PromoteActivity.CqW(com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    private final List A02() {
        ArrayList BIR = BIR();
        UserSession session = getSession();
        PromoteData promoteData = this.A00;
        if (promoteData != null) {
            XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
            if (xIGIGBoostDestination != null) {
                ArrayList A00 = C6PZ.A00(xIGIGBoostDestination, session, BIR);
                ArrayList arrayList = new ArrayList();
                Iterator it = A00.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    AdsAPIInstagramPosition adsAPIInstagramPosition = (AdsAPIInstagramPosition) next;
                    if (adsAPIInstagramPosition == AdsAPIInstagramPosition.A0A) {
                        PromoteData promoteData2 = this.A00;
                        if (promoteData2 != null) {
                            XIGIGBoostDestination xIGIGBoostDestination2 = promoteData2.A0i;
                            if (xIGIGBoostDestination2 != null) {
                                if (C6PZ.A03(adsAPIInstagramPosition, xIGIGBoostDestination2, getSession())) {
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                    arrayList.add(next);
                }
                ArrayList A0q = AbstractC167017dG.A0q(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AbstractC166997dE.A1S(it2.next(), A0q);
                }
                return A0q;
            }
            throw new IllegalStateException("Required value was null.");
        }
        C14360o3.A0F("promoteData");
        throw C00O.createAndThrow();
    }

    public static final void A04(PromoteActivity promoteActivity) {
        AbstractC65702TsY.A0q();
        Bundle bundle = new Bundle();
        bundle.putString("error_title", null);
        bundle.putString(TraceFieldType.Error, null);
        bundle.putString("error_type", "unknown_error");
        bundle.putString("ad_account_id", null);
        V0Y v0y = new V0Y();
        v0y.setArguments(bundle);
        C140966Yy A0C = AbstractC31180DnO.A0C(promoteActivity, promoteActivity.getSession());
        A0C.A0B(null, v0y);
        A0C.A04();
    }

    public static final void A07(PromoteActivity promoteActivity, AbstractC115105If abstractC115105If) {
        Object obj;
        Throwable A01;
        C67837UzA c67837UzA;
        UPA upa;
        Fragment v0y;
        C140966Yy c140966Yy;
        C115115Ig c115115Ig;
        C67837UzA c67837UzA2;
        C115115Ig c115115Ig2;
        A03(promoteActivity);
        String str = null;
        C70816WhZ.A01(C67908V1x.A00, VRD.A00(promoteActivity.getSession()), "fetch_init_promote_failed");
        boolean z = abstractC115105If instanceof C115115Ig;
        String str2 = null;
        if (z && (c115115Ig2 = (C115115Ig) abstractC115105If) != null) {
            obj = c115115Ig2.A00;
        } else {
            obj = null;
        }
        if (obj != null) {
            if (z && (c115115Ig = (C115115Ig) abstractC115105If) != null && (c67837UzA2 = (C67837UzA) c115115Ig.A00) != null) {
                str = c67837UzA2.mErrorType;
                str2 = c67837UzA2.getErrorMessage();
                if (str2 == null) {
                    str2 = "response is present in onFail, but there's no error message";
                }
                UPA upa2 = c67837UzA2.A01;
                if (upa2 != null) {
                    str = upa2.A01.toString();
                    str2 = upa2.A03;
                }
            }
        } else if (abstractC115105If != null && (A01 = abstractC115105If.A01()) != null) {
            str = ErrorIdentifier.A0r.toString();
            str2 = A01.getMessage();
            if (str2 == null) {
                str2 = A01.toString();
            }
        } else {
            PromoteData promoteData = promoteActivity.A00;
            if (promoteData != null) {
                if (promoteData.A1A == null) {
                    str = ErrorIdentifier.A04.toString();
                    str2 = "Access Token Null";
                } else {
                    str = ErrorIdentifier.A18.toString();
                    str2 = "onFail is called, but ApiError contains neither error nor response.";
                }
            }
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        InterfaceC09390do interfaceC09390do = promoteActivity.A07;
        C70399WUb A0N = AbstractC65702TsY.A0N(interfaceC09390do);
        String obj2 = VG4.A0k.toString();
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        A0N.A0W(obj2, "initial_fetch", str3);
        C70399WUb A0N2 = AbstractC65702TsY.A0N(interfaceC09390do);
        PromoteData promoteData2 = promoteActivity.A00;
        if (promoteData2 != null) {
            A0N2.A00 = promoteData2.A0n;
            String str4 = promoteData2.A1S;
            EnumC39597He7 enumC39597He7 = promoteData2.A12;
            if (str == null) {
                str = ErrorIdentifier.A18.toString();
            }
            if (str2 == null) {
                str2 = "";
            }
            A0N2.A0Q(enumC39597He7, str4, obj2, str, str2);
            if (abstractC115105If != null && (c67837UzA = (C67837UzA) abstractC115105If.A00()) != null && (upa = c67837UzA.A01) != null) {
                UPI upi = upa.A00;
                if (upa.A01 == ErrorIdentifier.A05) {
                    UserSession session = promoteActivity.getSession();
                    if (C18U.A06(AbstractC166997dE.A0U(session), session, 36321172622681270L)) {
                        AbstractC65702TsY.A0q();
                        VG4 vg4 = VG4.A1E;
                        Bundle bundle = new Bundle();
                        bundle.putString(OptSvcAnalyticsStore.LOGGING_KEY_STEP, vg4.toString());
                        v0y = new C67889V0w();
                        v0y.setArguments(bundle);
                        c140966Yy = new C140966Yy(promoteActivity, promoteActivity.getSession());
                        c140966Yy.A0D(v0y);
                        c140966Yy.A04();
                        return;
                    }
                }
                AbstractC65702TsY.A0q();
                ErrorIdentifier errorIdentifier = upa.A01;
                String str5 = upi.A03;
                String str6 = upa.A02;
                String str7 = upi.A02;
                String str8 = upi.A05;
                Bundle A0E = AbstractC31174DnI.A0E(errorIdentifier, 0);
                A0E.putString("error_title", str5);
                A0E.putString(TraceFieldType.Error, str6);
                A0E.putString("error_type", errorIdentifier.toString());
                A0E.putString("ad_account_id", str7);
                A0E.putString("paymentMethodID", str8);
                v0y = new V0Y();
                v0y.setArguments(A0E);
                c140966Yy = new C140966Yy(promoteActivity, promoteActivity.getSession());
                c140966Yy.A0D = false;
                c140966Yy.A0D(v0y);
                c140966Yy.A04();
                return;
            }
            A04(promoteActivity);
            return;
        }
        C14360o3.A0F("promoteData");
        throw C00O.createAndThrow();
    }

    public static final void A09(PromoteActivity promoteActivity, InterfaceC16660sJ interfaceC16660sJ) {
        C70816WhZ.A01(C67908V1x.A00, VRD.A00(promoteActivity.getSession()), "fetch_buat_start");
        C70630WeA c70630WeA = new C70630WeA(promoteActivity, interfaceC16660sJ);
        UserSession session = promoteActivity.getSession();
        PromoteData promoteData = promoteActivity.A00;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        String str = promoteData.A1K;
        C14360o3.A06(str);
        W6f.A01(promoteActivity, c70630WeA, session, str);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final int A0X() {
        return R.layout.promote_activity;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0Z() {
        int A00;
        InterfaceC08430c6 A0O = getSupportFragmentManager().A0O(R.id.layout_container_main);
        if (A0O instanceof InterfaceC60122ou) {
            C56352iT AYT = AYT();
            if (AYT != null) {
                AYT.A0X((InterfaceC60122ou) A0O);
                return;
            }
            return;
        }
        C56352iT AYT2 = AYT();
        if (AYT2 == null) {
            return;
        }
        AYT2.EkF(true);
        PromoteData promoteData = this.A00;
        if (promoteData != null) {
            PromoteLaunchOrigin promoteLaunchOrigin = promoteData.A0v;
            if (promoteLaunchOrigin == PromoteLaunchOrigin.A03) {
                A00 = 2131970828;
            } else if (promoteLaunchOrigin == PromoteLaunchOrigin.A04) {
                A00 = 2131970424;
            } else {
                A00 = AbstractC138316On.A00(promoteData.A17, false);
            }
            String string = getString(A00);
            C14360o3.A0A(string);
            AYT2.setTitle(string);
            C3LO c3lo = new C3LO();
            PromoteData promoteData2 = this.A00;
            if (promoteData2 != null) {
                boolean z = promoteData2.A2u;
                int i = R.drawable.instagram_x_pano_outline_24;
                if (z) {
                    i = R.drawable.instagram_arrow_back_24;
                }
                c3lo.A01(i);
                c3lo.A0G = this.A0I;
                AYT2.Ehd(new C3LY(c3lo));
                AYT2.A0U(R.attr.glyphColorPrimary);
                AYT2.EkS(true);
                AYT2.EkG(false);
                return;
            }
        }
        C14360o3.A0F("promoteData");
        throw C00O.createAndThrow();
    }

    @Override // X.XCO
    public final void CJg(LinkingAuthState linkingAuthState, String str, boolean z) {
        if (str.length() == 0) {
            finish();
            return;
        }
        PromoteData promoteData = this.A00;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        promoteData.A1A = str;
        promoteData.A0n = linkingAuthState;
        promoteData.A2J = z;
        W2Z.A00((W2Z) this.A08.getValue()).markerPoint(409679146, "pro_identity_continue_with_bloks_access_token");
        A06(this);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (!(getSupportFragmentManager().A0O(R.id.layout_container_main) instanceof InterfaceC60122ou)) {
            AbstractC65702TsY.A0N(this.A07).A0G(VG4.A1E, "cancel_button");
        }
        super.onBackPressed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ec, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36317332922897496L) != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, com.instagram.business.promote.model.PromoteData] */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.promote.activity.PromoteActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(-197881867);
        super.onDestroy();
        PromoteData promoteData = this.A00;
        if (promoteData != null) {
            if (promoteData.A2x) {
                WGU.A06(getSession());
                C019707r.A00(this).A02(new Intent("IGBoostPostSubmitSuccessNotification"));
                PromoteData promoteData2 = this.A00;
                if (promoteData2 != null) {
                    C1GJ.A03(AbstractC2044893h.A04(getSession(), promoteData2.A1S));
                }
            }
            C0f9.A07(623729464, A00);
            return;
        }
        C14360o3.A0F("promoteData");
        throw C00O.createAndThrow();
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        int A00 = C0f9.A00(-482133159);
        super.onPause();
        PromoteState promoteState = this.A01;
        if (promoteState == null) {
            C14360o3.A0F("promoteState");
            throw C00O.createAndThrow();
        }
        promoteState.A0B(this);
        C0f9.A07(1886758207, A00);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        AbstractC167017dG.A1P(strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
        PermissionsModule permissionsModule = this.A04;
        if (permissionsModule != null && permissionsModule.onRequestPermissionsResult(i, strArr, iArr)) {
            this.A04 = null;
        }
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(-1131770224);
        super.onResume();
        PromoteState promoteState = this.A01;
        if (promoteState == null) {
            C14360o3.A0F("promoteState");
            throw C00O.createAndThrow();
        }
        promoteState.A0A(this);
        C0f9.A07(-1175231021, A00);
    }
}
