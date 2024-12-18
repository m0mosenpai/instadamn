package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WHe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class DialogInterfaceOnClickListenerC70206WHe implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DialogInterfaceOnClickListenerC70206WHe(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String str2;
        String str3;
        UserSession userSession;
        EnumC33493ErS enumC33493ErS;
        VHh vHh;
        Integer num;
        HashSet hashSet;
        C67923V2n c67923V2n;
        Object obj;
        Object obj2;
        switch (this.A00) {
            case 0:
                W55 w55 = (W55) this.A01;
                android.net.Uri uri = (android.net.Uri) this.A02;
                C42961yO.A0A.A05(new GS6(uri, w55, "open"));
                w55.A01.A00.A00.startActivity(new Intent("android.intent.action.VIEW").setData(W55.A05.buildUpon().appendQueryParameter("static_map_url", uri.toString()).build()).setFlags(268435456));
                return;
            case 1:
                V0N v0n = (V0N) this.A02;
                W6I w6i = v0n.A00;
                if (w6i == null) {
                    str = "adsManagerLogger";
                } else {
                    w6i.A0A("ads_manager_highlights_hub", WGU.A01((VG5) this.A01), v0n.A07, null);
                    C3FR c3fr = v0n.A03;
                    if (c3fr != null) {
                        c3fr.EWc(true);
                        InterfaceC70513Em interfaceC70513Em = v0n.A04;
                        str = "pullToRefresh";
                        if (interfaceC70513Em != null) {
                            interfaceC70513Em.setIsLoading(true);
                            InterfaceC70513Em interfaceC70513Em2 = v0n.A04;
                            if (interfaceC70513Em2 != null) {
                                if (!(interfaceC70513Em2 instanceof C71094Wnq)) {
                                    C67920V2k c67920V2k = v0n.A01;
                                    if (c67920V2k == null) {
                                        str = "promoteAdToolsAdapter";
                                    } else {
                                        c67920V2k.A00(new ArrayList());
                                        SpinnerImageView spinnerImageView = v0n.A05;
                                        if (spinnerImageView != null) {
                                            spinnerImageView.setLoadingStatus(C3T1.LOADING);
                                        }
                                    }
                                }
                                W6f.A01(v0n.requireActivity(), new C70618Wdw(v0n, 0), (UserSession) v0n.A0B.getValue(), "ads_manager_highlights_hub");
                                return;
                            }
                        }
                    }
                    str = "recyclerViewProxy";
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 2:
                V16 v16 = (V16) this.A02;
                C3FR c3fr2 = v16.A0H;
                if (c3fr2 == null) {
                    str2 = "recyclerViewProxy";
                } else {
                    c3fr2.EWc(true);
                    InterfaceC70513Em interfaceC70513Em3 = v16.A0J;
                    str = "pullToRefresh";
                    if (interfaceC70513Em3 != null) {
                        interfaceC70513Em3.setIsLoading(true);
                        InterfaceC70513Em interfaceC70513Em4 = v16.A0J;
                        if (interfaceC70513Em4 != null) {
                            if (!(interfaceC70513Em4 instanceof C71094Wnq)) {
                                C67920V2k c67920V2k2 = v16.A0B;
                                if (c67920V2k2 == null) {
                                    str2 = "promoteAdToolsAdapter";
                                } else {
                                    c67920V2k2.A00(new ArrayList());
                                    SpinnerImageView spinnerImageView2 = v16.A0K;
                                    if (spinnerImageView2 == null) {
                                        str2 = "loadingSpinner";
                                    } else {
                                        spinnerImageView2.setLoadingStatus(C3T1.LOADING);
                                    }
                                }
                            }
                            V16.A02(new C70620Wdy(3, v16, this.A01), v16);
                            return;
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 3:
                V16.A0A((V16) this.A02, (C70654Wea) this.A01, "promotion_list");
                return;
            case 4:
                V15 v15 = (V15) this.A02;
                C3FR c3fr3 = v15.A04;
                if (c3fr3 != null) {
                    c3fr3.EWc(true);
                    InterfaceC70513Em interfaceC70513Em5 = v15.A05;
                    str = "pullToRefresh";
                    if (interfaceC70513Em5 != null) {
                        interfaceC70513Em5.setIsLoading(true);
                        InterfaceC70513Em interfaceC70513Em6 = v15.A05;
                        if (interfaceC70513Em6 != null) {
                            if (!(interfaceC70513Em6 instanceof C71094Wnq)) {
                                C67920V2k c67920V2k3 = v15.A02;
                                if (c67920V2k3 == null) {
                                    str = "pastPromotionsAdapter";
                                } else {
                                    c67920V2k3.A00(new ArrayList());
                                    SpinnerImageView spinnerImageView3 = v15.A06;
                                    if (spinnerImageView3 == null) {
                                        str = "loadingSpinner";
                                    } else {
                                        spinnerImageView3.setLoadingStatus(C3T1.LOADING);
                                    }
                                }
                            }
                            W6f.A01(v15.requireActivity(), new C70620Wdy(5, v15, this.A01), (UserSession) v15.A0I.getValue(), "ads_manager");
                            return;
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "recyclerViewProxy";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
            case 6:
            default:
                AbstractC31177DnL.A0u((Context) this.A01, (UserSession) this.A02, C2Fb.A35, "https://www.facebook.com/business/help/131439120265224");
                return;
            case 7:
                V0Q v0q = (V0Q) this.A02;
                FragmentActivity requireActivity = v0q.requireActivity();
                UserSession userSession2 = (UserSession) v0q.A0C.getValue();
                String str4 = v0q.A03;
                if (str4 == null) {
                    str = "entryPoint";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                W6f.A01(requireActivity, (XCJ) this.A01, userSession2, str4);
                return;
            case 8:
                ((XCV) this.A01).DsW();
                C69608VsB c69608VsB = (C69608VsB) this.A02;
                Activity activity = c69608VsB.A01;
                if (activity == null || !c69608VsB.A04) {
                    return;
                }
                activity.finish();
                return;
            case 9:
                WDF wdf = (WDF) this.A01;
                Boolean bool = (Boolean) this.A02;
                InterfaceC69973Cg interfaceC69973Cg = wdf.A0E;
                EnumC69983Ch enumC69983Ch = EnumC69983Ch.A03;
                C43846JaA c43846JaA = new C43846JaA(enumC69983Ch);
                c43846JaA.A0A = false;
                c43846JaA.A05 = false;
                interfaceC69973Cg.EoI(EnumC33447EqK.A0C, new MediaCaptureConfig(c43846JaA), enumC69983Ch);
                C18920wW c18920wW = wdf.A0C;
                str3 = wdf.A0G;
                boolean booleanValue = wdf.A04.booleanValue();
                C162337Ov.A0c(c18920wW, str3, "photo_from_library", booleanValue);
                if (bool.booleanValue()) {
                    C142846ck A00 = AbstractC147806l5.A00(wdf.A0D);
                    int i2 = wdf.A06;
                    String str5 = wdf.A0H;
                    C25531Mh A0E = C25531Mh.A0E(A00.A03);
                    if (((AbstractC02600Aj) A0E).A00.isSampled()) {
                        AbstractC31175DnJ.A1B(A0E, A00);
                        AbstractC31174DnI.A1I(A0E, "photo_gallery_rendered");
                        A0E.A0o(AbstractC111324zv.A00(4075));
                        AbstractC31177DnL.A1H(A0E, A00, AbstractC31179DnN.A0a(A0E, "change_photo_dialog", str3, str5, i2));
                    }
                }
                if (booleanValue) {
                    C68744VbN c68744VbN = wdf.A0F;
                    C14360o3.A0B(str3, 0);
                    AbstractC65703TsZ.A1M(c68744VbN.A00, "armadillo_igd_group_profile_set_group_photo_choose_from_library", str3);
                }
                if (wdf.A05 != "message_thread") {
                    return;
                }
                userSession = wdf.A0D;
                AbstractC167007dF.A1K(userSession, str3);
                enumC33493ErS = EnumC33493ErS.CHANGE_PHOTO;
                vHh = VHh.LIBRARY;
                AbstractC68473VSe.A00(enumC33493ErS, vHh, userSession, str3);
                return;
            case 10:
                WDF wdf2 = (WDF) this.A01;
                Boolean bool2 = (Boolean) this.A02;
                InterfaceC69973Cg interfaceC69973Cg2 = wdf2.A0E;
                EnumC69983Ch enumC69983Ch2 = EnumC69983Ch.A03;
                C43846JaA c43846JaA2 = new C43846JaA(enumC69983Ch2);
                c43846JaA2.A0A = false;
                c43846JaA2.A05 = false;
                interfaceC69973Cg2.EoK(EnumC33447EqK.A0C, new MediaCaptureConfig(c43846JaA2), enumC69983Ch2);
                C18920wW c18920wW2 = wdf2.A0C;
                str3 = wdf2.A0G;
                boolean booleanValue2 = wdf2.A04.booleanValue();
                C162337Ov.A0c(c18920wW2, str3, "photo_from_camera", booleanValue2);
                if (bool2.booleanValue()) {
                    C142846ck A002 = AbstractC147806l5.A00(wdf2.A0D);
                    int i3 = wdf2.A06;
                    String str6 = wdf2.A0H;
                    C25531Mh A0E2 = C25531Mh.A0E(A002.A03);
                    if (((AbstractC02600Aj) A0E2).A00.isSampled()) {
                        AbstractC31175DnJ.A1B(A0E2, A002);
                        AbstractC31174DnI.A1I(A0E2, "thread_take_photo");
                        A0E2.A0o("take_photo_item");
                        AbstractC31177DnL.A1H(A0E2, A002, AbstractC31179DnN.A0a(A0E2, "change_photo_dialog", str3, str6, i3));
                    }
                }
                if (booleanValue2) {
                    C68744VbN c68744VbN2 = wdf2.A0F;
                    C14360o3.A0B(str3, 0);
                    AbstractC65703TsZ.A1M(c68744VbN2.A00, "armadillo_igd_group_profile_set_group_photo_take_photo_with_camera", str3);
                }
                if (wdf2.A05 != "message_thread") {
                    return;
                }
                userSession = wdf2.A0D;
                AbstractC167007dF.A1K(userSession, str3);
                enumC33493ErS = EnumC33493ErS.CHANGE_PHOTO;
                vHh = VHh.CAMERA;
                AbstractC68473VSe.A00(enumC33493ErS, vHh, userSession, str3);
                return;
            case 11:
                WDF wdf3 = (WDF) this.A01;
                Boolean bool3 = (Boolean) this.A02;
                if (wdf3.A04.booleanValue()) {
                    C68744VbN c68744VbN3 = wdf3.A0F;
                    String str7 = wdf3.A0G;
                    C14360o3.A0B(str7, 0);
                    AbstractC65703TsZ.A1M(c68744VbN3.A00, "armadillo_igd_group_profile_set_group_photo_cancel", str7);
                }
                if (bool3.booleanValue()) {
                    C142846ck A003 = AbstractC147806l5.A00(wdf3.A0D);
                    int i4 = wdf3.A06;
                    String str8 = wdf3.A0G;
                    String str9 = wdf3.A0H;
                    C25531Mh A0E3 = C25531Mh.A0E(A003.A03);
                    if (((AbstractC02600Aj) A0E3).A00.isSampled()) {
                        AbstractC31175DnJ.A1B(A0E3, A003);
                        AbstractC31174DnI.A1I(A0E3, "thread_update_photo_cancel");
                        A0E3.A0o("cancel_group_photo_item");
                        AbstractC31177DnL.A1H(A0E3, A003, AbstractC31179DnN.A0a(A0E3, "change_photo_dialog", str8, str9, i4));
                    }
                }
                if (dialogInterface == null) {
                    return;
                }
                dialogInterface.dismiss();
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                WDF wdf4 = (WDF) this.A01;
                if (((Boolean) this.A02).booleanValue()) {
                    C142846ck A004 = AbstractC147806l5.A00(wdf4.A0D);
                    int i5 = wdf4.A06;
                    String str10 = wdf4.A0G;
                    String str11 = wdf4.A0H;
                    C25531Mh A0E4 = C25531Mh.A0E(A004.A03);
                    if (((AbstractC02600Aj) A0E4).A00.isSampled()) {
                        AbstractC31175DnJ.A1B(A0E4, A004);
                        AbstractC31174DnI.A1I(A0E4, "thread_remove_photo");
                        A0E4.A0o("remove_group_photo_item");
                        AbstractC31177DnL.A1H(A0E4, A004, AbstractC31179DnN.A0a(A0E4, "change_photo_dialog", str10, str11, i5));
                    }
                }
                C18920wW c18920wW3 = wdf4.A0C;
                str3 = wdf4.A0G;
                boolean booleanValue3 = wdf4.A04.booleanValue();
                C162337Ov.A0c(c18920wW3, str3, "photo_removed", booleanValue3);
                XAZ xaz = wdf4.A02;
                if (xaz != null) {
                    new C67858Uzp().A0B(wdf4.A0B, ReactProgressBarViewManager.PROP_PROGRESS);
                    C41761wQ c41761wQ = wdf4.A00;
                    C7TQ c7tq = wdf4.A01;
                    if (c7tq != null && c41761wQ != null && booleanValue3) {
                        if (C18U.A06(C06090Tz.A05, wdf4.A0D, 36317113878582059L)) {
                            C3o9 c3o9 = wdf4.A03;
                            c3o9.getClass();
                            c41761wQ.A02(c7tq.EGS(c3o9), new C71179WpQ(wdf4, 1));
                        }
                    }
                    UserSession userSession3 = wdf4.A0D;
                    C1ON A05 = DirectThreadApi.A05(userSession3, str3);
                    A05.A00 = new C67856Uzb(userSession3, xaz, wdf4, 3);
                    C1GJ.A03(A05);
                }
                if (wdf4.A05 != "message_thread") {
                    return;
                }
                userSession = wdf4.A0D;
                AbstractC167017dG.A1N(userSession, str3);
                enumC33493ErS = EnumC33493ErS.CHANGE_PHOTO;
                vHh = VHh.REMOVE;
                AbstractC68473VSe.A00(enumC33493ErS, vHh, userSession, str3);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                WGH.A06((Activity) this.A01, null);
                InterfaceC71983XDs interfaceC71983XDs = (InterfaceC71983XDs) this.A02;
                if (interfaceC71983XDs == null) {
                    return;
                }
                interfaceC71983XDs.Dat();
                return;
            case 14:
                AbstractC69975Vyq.A00(((C71120WoH) this.A01).A01, ((C69427VnC) this.A02).A07, C05F.A04);
                C1V1.A01().A05("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
                return;
            case Process.SIGTERM /* 15 */:
                String str12 = ((String[]) this.A01)[i];
                C4RP c4rp = ((C66354UBs) this.A02).A0Z.A00.A09;
                if (str12 == null || str12.length() == 0) {
                    return;
                }
                C4RQ c4rq = c4rp.A0I;
                C4RQ.A05(c4rq, "setCustomQuality: %s", str12);
                AbstractC166997dE.A1H(c4rq.A0E, str12, 13);
                return;
            case 16:
                C84923qg c84923qg = (C84923qg) this.A01;
                WD6 wd6 = (WD6) this.A02;
                if (c84923qg == null) {
                    c67923V2n = wd6.A02;
                    C70083W2b c70083W2b = c67923V2n.A06;
                    X25 x25 = c70083W2b.A00;
                    ImmutableSet A03 = ImmutableSet.A03(x25);
                    C14360o3.A07(A03);
                    hashSet = new HashSet(A03);
                    HashSet hashSet2 = new HashSet();
                    Integer num2 = null;
                    if (wd6.A05) {
                        num2 = C05F.A0N;
                    }
                    Iterator A13 = AbstractC166997dE.A13(hashSet);
                    while (A13.hasNext()) {
                        C84923qg c84923qg2 = (C84923qg) AbstractC166997dE.A0l(A13);
                        c84923qg2.A0P = true;
                        String str13 = c84923qg2.A0F;
                        if (str13 != null) {
                            Iterator it = c70083W2b.A01.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (str13.equals(((C84923qg) obj2).A0G)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            C84923qg c84923qg3 = (C84923qg) obj2;
                            if (c84923qg3 != null) {
                                c84923qg3.A0P = true;
                                hashSet2.add(c84923qg3);
                            }
                        }
                    }
                    hashSet.addAll(hashSet2);
                    wd6.A03.A01(C05F.A00, num2, hashSet);
                    ImmutableSet A032 = ImmutableSet.A03(x25);
                    C14360o3.A07(A032);
                    c70083W2b.A02.addAll(A032);
                    x25.clear();
                } else {
                    if (wd6.A00 == null) {
                        return;
                    }
                    if (wd6.A05) {
                        num = C05F.A0N;
                    } else {
                        num = null;
                    }
                    c84923qg.A0P = true;
                    hashSet = new HashSet();
                    hashSet.add(c84923qg);
                    String str14 = c84923qg.A0F;
                    if (str14 != null) {
                        Iterator it2 = wd6.A02.A06.A01.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                if (str14.equals(((C84923qg) obj).A0G)) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        C84923qg c84923qg4 = (C84923qg) obj;
                        if (c84923qg4 != null) {
                            hashSet.add(c84923qg4);
                            c84923qg4.A0P = true;
                        }
                    }
                    wd6.A03.A01(C05F.A00, num, hashSet);
                    c67923V2n = wd6.A02;
                    c67923V2n.A06.A02.addAll(hashSet);
                }
                WD6.A00(wd6, hashSet);
                LimitedCommentsFragment limitedCommentsFragment = wd6.A04;
                limitedCommentsFragment.A03.A01(limitedCommentsFragment.A01);
                c67923V2n.A00();
                return;
            case 17:
                C28261Yl c28261Yl = C28261Yl.A00;
                LimitedCommentsFragment limitedCommentsFragment2 = (LimitedCommentsFragment) this.A01;
                c28261Yl.A02(limitedCommentsFragment2.A00, (List) this.A02, null);
                limitedCommentsFragment2.A03.A06.A00.clear();
                limitedCommentsFragment2.A03.A00();
                C9GR.A08(limitedCommentsFragment2.getContext(), 2131965134, 0);
                return;
        }
    }
}
