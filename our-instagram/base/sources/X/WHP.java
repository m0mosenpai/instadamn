package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebookpay.form.fragment.model.FormClickEvent;
import com.facebookpay.form.fragment.model.FormLoggingEvents;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.form.model.FormCountry;
import com.facebookpay.logging.LoggingContext;
import com.google.common.collect.ImmutableList;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class WHP implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public WHP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        C18920wW c18920wW;
        String str2;
        C70399WUb A0N;
        VG4 vg4;
        String str3;
        V0W v0w;
        C70399WUb c70399WUb;
        VG4 vg42;
        String str4;
        V0W v0w2;
        FragmentActivity requireActivity;
        UserSession session;
        String str5;
        String str6;
        Object obj;
        AbstractC129435t5 abstractC129435t5;
        switch (this.A00) {
            case 0:
                UG6 ug6 = (UG6) this.A01;
                ug6.A00 = i;
                ug6.onClick(dialogInterface, -1);
                dialogInterface.dismiss();
                return;
            case 1:
                C5t6 c5t6 = ((C67676Uvo) this.A01).A00;
                if (c5t6 != null) {
                    FormCountry formCountry = (FormCountry) c5t6.A02.get(i);
                    if (formCountry == null) {
                        return;
                    }
                    obj = formCountry.A00;
                    abstractC129435t5 = c5t6;
                    abstractC129435t5.A05.A0B(obj);
                    return;
                }
                str = "viewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 2:
                C67675Uvn c67675Uvn = (C67675Uvn) this.A01;
                AbstractC129435t5 abstractC129435t52 = c67675Uvn.A00;
                if (abstractC129435t52 != null) {
                    obj = C67675Uvn.A00(c67675Uvn)[i];
                    abstractC129435t5 = abstractC129435t52;
                    if (obj == null) {
                        return;
                    }
                    abstractC129435t5.A05.A0B(obj);
                    return;
                }
                str = "viewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 3:
                UFR ufr = (UFR) this.A01;
                FormParams formParams = ufr.A01;
                FormClickEvent formClickEvent = null;
                if (formParams != null) {
                    FormLoggingEvents formLoggingEvents = formParams.A09;
                    if (formLoggingEvents != null) {
                        formClickEvent = formLoggingEvents.A02;
                    }
                    VKJ vkj = ufr.A0E;
                    if (vkj != null) {
                        LoggingContext loggingContext = ufr.A03;
                        Long l = null;
                        if (loggingContext != null) {
                            String str7 = formParams.A0H;
                            if (str7 != null) {
                                l = AbstractC25228BEl.A13(str7);
                            }
                            vkj.A02(UFR.A00(formParams.A04), loggingContext, l, UFS.A01(ufr.A06()));
                        }
                        str = "loggingContext";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    UFR.A02(formClickEvent, ufr);
                    ufr.A0C.A0B(1);
                    return;
                }
                str = "formParams";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 4:
                UFR ufr2 = (UFR) this.A01;
                FormParams formParams2 = ufr2.A01;
                FormClickEvent formClickEvent2 = null;
                if (formParams2 != null) {
                    FormLoggingEvents formLoggingEvents2 = formParams2.A09;
                    if (formLoggingEvents2 != null) {
                        formClickEvent2 = formLoggingEvents2.A00;
                    }
                    VKJ vkj2 = ufr2.A0E;
                    if (vkj2 != null) {
                        LoggingContext loggingContext2 = ufr2.A03;
                        Long l2 = null;
                        if (loggingContext2 != null) {
                            String str8 = formParams2.A0H;
                            if (str8 != null) {
                                l2 = AbstractC25228BEl.A13(str8);
                            }
                            vkj2.A00(UFR.A00(formParams2.A04), loggingContext2, l2, UFS.A01(ufr2.A06()));
                        }
                        str = "loggingContext";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    UFR.A02(formClickEvent2, ufr2);
                    dialogInterface.dismiss();
                    return;
                }
                str = "formParams";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 34:
            default:
                ((InterfaceC16820sZ) this.A01).invoke();
                return;
            case 25:
                HashMap hashMap = new HashMap();
                hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "direct_inbox_setting_entrypoint");
                C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(369), hashMap);
                V16 v16 = (V16) this.A01;
                A01.A04(v16.requireActivity(), new IgBloksScreenConfig(v16.getSession()));
                W6I w6i = v16.A07;
                if (w6i != null) {
                    c18920wW = w6i.A00;
                    str2 = "igd_inbox_ad_creation_education_dialog_learn_more_click";
                    AbstractC31179DnN.A1N(c18920wW, str2);
                    return;
                }
                str = "adsManagerLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 26:
                W6I w6i2 = ((V16) this.A01).A07;
                if (w6i2 != null) {
                    c18920wW = w6i2.A00;
                    str2 = "igd_inbox_ad_creation_education_dialog_get_started_click";
                    AbstractC31179DnN.A1N(c18920wW, str2);
                    return;
                }
                str = "adsManagerLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 27:
                HashMap hashMap2 = new HashMap();
                hashMap2.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "direct_inbox_setting_entrypoint");
                C66277U6x A012 = C66277U6x.A01(AbstractC111324zv.A00(369), hashMap2);
                V16 v162 = (V16) this.A01;
                A012.A04(v162.requireActivity(), new IgBloksScreenConfig(v162.getSession()));
                return;
            case 28:
                V12 v12 = (V12) this.A01;
                W65 w65 = v12.A05;
                if (w65 == null) {
                    str = "nextButtonHolder";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                w65.A05(false);
                A0N = AbstractC65702TsY.A0N(v12.A0T);
                vg4 = VG4.A0T;
                str3 = "min_duration_warning_for_ctd_increase_duration_button";
                A0N.A0G(vg4, str3);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                V12 v122 = (V12) this.A01;
                V12.A07(v122);
                A0N = AbstractC65702TsY.A0N(v122.A0T);
                vg4 = VG4.A0T;
                str3 = "min_duration_warning_for_ctd_not_now_button";
                A0N.A0G(vg4, str3);
                return;
            case 30:
                C67871V0c c67871V0c = (C67871V0c) this.A01;
                ((W6I) c67871V0c.A0E.getValue()).A0A("campaign_controls_budget_duration", "update_budget_duration_button", C67871V0c.A00(c67871V0c).A1S, null);
                UserSession userSession = (UserSession) c67871V0c.A0I.getValue();
                FragmentActivity requireActivity2 = c67871V0c.requireActivity();
                String str9 = C67871V0c.A00(c67871V0c).A1S;
                if (str9 != null) {
                    String str10 = c67871V0c.A07;
                    int i2 = C67871V0c.A00(c67871V0c).A0A;
                    int i3 = C67871V0c.A00(c67871V0c).A07;
                    String str11 = C67871V0c.A00(c67871V0c).A1K;
                    if (str11 != null) {
                        C70655Web c70655Web = new C70655Web(c67871V0c);
                        C14360o3.A0B(userSession, 0);
                        c70655Web.onStart();
                        W6f.A01(requireActivity2, new C70624We2(requireActivity2, c67871V0c, c70655Web, userSession, str9, str10, i2, i3), userSession, str11);
                        return;
                    }
                    throw new IllegalStateException("entryPoint parameter cannot be null");
                }
                throw new IllegalStateException("mediaId parameter cannot be null");
            case 31:
                C70606Wdk c70606Wdk = ((C70652WeY) this.A01).A00;
                if (c70606Wdk != null) {
                    C70605Wdj c70605Wdj = c70606Wdk.A02;
                    if (c70605Wdj != null) {
                        C70908WkB c70908WkB = c70605Wdj.A03;
                        c70908WkB.A03 = true;
                        C70908WkB.A02(c70908WkB);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
                throw AbstractC166997dE.A0g();
            case 32:
                C67891V0y c67891V0y = (C67891V0y) this.A01;
                AbstractC65702TsY.A0N(c67891V0y.A05).A0Z(VG4.A14.toString(), "DECLINED_NON_DISCRIMINATION", null);
                c67891V0y.A02 = false;
                AbstractC25226BEj.A1Q(c67891V0y);
                return;
            case 33:
                ((InterfaceC16620sF) this.A01).invoke(dialogInterface, Integer.valueOf(i));
                return;
            case 35:
                v0w = (V0W) this.A01;
                c70399WUb = v0w.A01;
                if (c70399WUb != null) {
                    vg42 = VG4.A0d;
                    str4 = "soft_upsell_for_wa_hacky_link_change_ad_goal_button";
                    c70399WUb.A0G(vg42, str4);
                    V0W.A01(v0w);
                    return;
                }
                str = "promoteLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 36:
            case 38:
                V0W v0w3 = (V0W) this.A01;
                W65 w652 = v0w3.A02;
                if (w652 != null) {
                    w652.A05(false);
                }
                C70399WUb c70399WUb2 = v0w3.A01;
                if (c70399WUb2 != null) {
                    c70399WUb2.A0G(VG4.A0d, "soft_upsell_for_wa_hacky_link_cancel_button");
                    V0W.A03(v0w3);
                    return;
                }
                str = "promoteLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 37:
                v0w2 = (V0W) this.A01;
                C70399WUb c70399WUb3 = v0w2.A01;
                if (c70399WUb3 != null) {
                    c70399WUb3.A0G(VG4.A0d, "soft_upsell_for_wa_hacky_link_whatsapp_button");
                    requireActivity = v0w2.requireActivity();
                    session = v0w2.getSession();
                    str5 = "PromoteWebsite";
                    str6 = "linking_entry_point_soft_upsell_hacky_wa_ads";
                    C97F.A03(requireActivity, v0w2, session, str5, str6);
                    return;
                }
                str = "promoteLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 39:
                v0w = (V0W) this.A01;
                c70399WUb = v0w.A01;
                if (c70399WUb != null) {
                    vg42 = VG4.A0d;
                    str4 = "reduce_hacky_way_promote_ctwa_dialog_change_ad_goal_button";
                    c70399WUb.A0G(vg42, str4);
                    V0W.A01(v0w);
                    return;
                }
                str = "promoteLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 40:
                V0W v0w4 = (V0W) this.A01;
                W65 w653 = v0w4.A02;
                if (w653 != null) {
                    w653.A05(false);
                }
                A0N = v0w4.A01;
                if (A0N != null) {
                    vg4 = VG4.A0d;
                    str3 = "reduce_hacky_way_promote_ctwa_dialog_cancel_button";
                    A0N.A0G(vg4, str3);
                    return;
                }
                str = "promoteLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case Seq.NULL_REFNUM /* 41 */:
                v0w2 = (V0W) this.A01;
                C70399WUb c70399WUb4 = v0w2.A01;
                if (c70399WUb4 != null) {
                    c70399WUb4.A0G(VG4.A0d, "reduce_hacky_way_promote_igwa_linking_dialog_add_whatsapp_button");
                    requireActivity = v0w2.requireActivity();
                    session = v0w2.getSession();
                    str5 = "PromoteWebsite";
                    str6 = "linking_entry_point_unconventional_wa_ads";
                    C97F.A03(requireActivity, v0w2, session, str5, str6);
                    return;
                }
                str = "promoteLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                V0W v0w5 = (V0W) this.A01;
                W65 w654 = v0w5.A02;
                if (w654 != null) {
                    w654.A05(false);
                }
                A0N = v0w5.A01;
                if (A0N != null) {
                    vg4 = VG4.A0d;
                    str3 = "reduce_hacky_way_promote_igwa_linking_dialog_cancel_button";
                    A0N.A0G(vg4, str3);
                    return;
                }
                str = "promoteLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 43:
                ((XCV) this.A01).DsV();
                return;
            case 44:
                C69608VsB c69608VsB = (C69608VsB) this.A01;
                Activity activity = c69608VsB.A01;
                if (activity != null) {
                    UserSession userSession2 = c69608VsB.A02;
                    C63397SjR A0y = AbstractC25228BEl.A0y(activity, userSession2, C2Fb.A1b, "https://www.facebook.com/legal/camera_effects_platform_terms");
                    A0y.A0E(userSession2.userId);
                    A0y.A0S = c69608VsB.A03;
                    A0y.A0A();
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 45:
                V17 v17 = (V17) this.A01;
                C40701ud A013 = AbstractC40691uc.A01((UserSession) v17.A03.getValue());
                ImmutableList.Builder builder = ImmutableList.builder();
                UGc uGc = v17.A00;
                if (uGc != null) {
                    ImmutableList immutableList = uGc.A00;
                    ArrayList arrayList = new ArrayList();
                    int i4 = 0;
                    Iterator<E> it = immutableList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        UGc uGc2 = v17.A00;
                        if (uGc2 != null) {
                            if (uGc2.A03.contains(Integer.valueOf(i4))) {
                                arrayList.add(next);
                            }
                            i4 = i5;
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        String A07 = ((C2JS) it2.next()).A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        if (A07 != null) {
                            arrayList2.add(A07);
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C2JS c2js = (C2JS) it3.next();
                        if (c2js.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID) != null) {
                            builder.add((Object) c2js.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
                        }
                    }
                    C2JM c2jm = new C2JM();
                    C2JM c2jm2 = new C2JM();
                    boolean A1X = AbstractC43594JPz.A1X(c2jm, "client_mutation_id", AbstractC43593JPy.A0w());
                    ImmutableList build = builder.build();
                    c2jm.A05(AbstractC111324zv.A00(3190), build);
                    PandoGraphQLRequest A00 = WWB.A00(c2jm, c2jm2, A1X, AbstractC167007dF.A1W(build));
                    C14360o3.A0A(A00);
                    A013.ATV(new C70434WVm(v17, 6), new WW3(3, v17, arrayList2), A00);
                    return;
                }
                C14360o3.A0F("itemAdapter");
                throw C00O.createAndThrow();
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C65762Ttd c65762Ttd = (C65762Ttd) this.A01;
                W6f.A00(c65762Ttd.A0E, new C70618Wdw(c65762Ttd, 6), c65762Ttd.A0G);
                C65762Ttd.A01(c65762Ttd);
                return;
            case 47:
                V0R v0r = (V0R) this.A01;
                Activity activity2 = v0r.A00;
                if (activity2 != null) {
                    AbstractC13880nE.A0K(activity2);
                    Activity activity3 = v0r.A00;
                    if (activity3 != null) {
                        activity3.onBackPressed();
                        return;
                    }
                }
                str = "activity";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 48:
                V0R v0r2 = (V0R) this.A01;
                v0r2.A08().setChecked(false);
                if (!v0r2.A0C) {
                    return;
                }
                View view = v0r2.A03;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                } else {
                    str = "messageSection";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            case 49:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                dialogInterface.dismiss();
                return;
            case 51:
                InterfaceC71983XDs interfaceC71983XDs = (InterfaceC71983XDs) this.A01;
                if (interfaceC71983XDs == null) {
                    return;
                }
                interfaceC71983XDs.onCancel();
                return;
            case 52:
                W44.A00 = false;
                ((InterfaceC16820sZ) this.A01).invoke();
                dialogInterface.dismiss();
                return;
            case 53:
                ((View) this.A01).setEnabled(true);
                return;
            case 54:
                return;
        }
    }
}
