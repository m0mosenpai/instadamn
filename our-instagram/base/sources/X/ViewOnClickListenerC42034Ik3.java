package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.ProductDiscountInformationDict;
import com.instagram.api.schemas.StoryUnlockableStickerData;
import com.instagram.api.schemas.SubmittedSubPostManageType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.shopping.fragment.cart.ShoppingCartFragment;
import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import com.instagram.ui.emptystaterow.EmptyStateView;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import go.Seq;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ik3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42034Ik3 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnClickListenerC42034Ik3(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, int i) {
        this.A00 = i;
        if (3 - i != 0) {
            this.A02 = c6fq;
            this.A01 = interfaceC103384lE;
        } else {
            this.A01 = c6fq;
            this.A02 = interfaceC103384lE;
        }
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        C0fQ.A00(new ViewOnClickListenerC42034Ik3(i, obj, obj2), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        int A052;
        int i2;
        C50679MYx c50679MYx;
        String str2;
        List list;
        Refinement refinement;
        int A053;
        int i3;
        C2Fb c2Fb;
        ImageView imageView;
        Context context;
        int i4;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-2138823349);
                ((EmptyStateView) this.A01).A0L();
                C41620IbA c41620IbA = ((RecentAdActivityFragment) this.A02).A01;
                if (c41620IbA == null) {
                    str = "adsHistoryDataFetcher";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                c41620IbA.A01();
                i = -325871077;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(343197609);
                C42277Io1 c42277Io1 = (C42277Io1) this.A02;
                C6FP.A03(c42277Io1.A07, c42277Io1.A08, C6FW.A01, (InterfaceC103384lE) this.A01);
                i = 1000431445;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A052 = C0f9.A05(-1228666783);
                C42277Io1 c42277Io12 = (C42277Io1) this.A02;
                UserSession userSession = (UserSession) this.A01;
                C6FG c6fg = c42277Io12.A07;
                C6BQ.A0I(c6fg, new C37766Gjh(c42277Io12, 0));
                C42576Isu c42576Isu = new C42576Isu(c42277Io12);
                String A0j = AbstractC167017dG.A0j();
                String str3 = "";
                String A0J = c42277Io12.A08.A0J();
                if (A0J != null) {
                    str3 = A0J;
                }
                ISE.A01(userSession, c42576Isu, A0j, str3, "profile_shop");
                C1XJ.A00.A0b((Activity) c42277Io12.A09.getValue(), C6BQ.A00(c6fg), userSession, A0j, c42576Isu.getModuleName());
                i2 = -22682765;
                C0f9.A0C(i2, A052);
                return;
            case 3:
                A05 = C0f9.A05(-1282784605);
                C131845xK.A00((C6FQ) this.A01, C6FW.A01, (InterfaceC103384lE) this.A02);
                i = 1824304273;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(-645366252);
                C131845xK.A00((C6FQ) this.A02, C6FW.A01, (InterfaceC103384lE) this.A01);
                i = 1618116941;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A053 = C0f9.A05(-410028044);
                C38365Gu1 c38365Gu1 = (C38365Gu1) this.A02;
                InterfaceC37791pH interfaceC37791pH = (InterfaceC37791pH) this.A01;
                C22P c22p = C22P.A3K;
                ACRType aCRType = ACRType.A07;
                UserSession userSession2 = c38365Gu1.A03;
                C8JY A00 = C8JX.A00(userSession2);
                A00.A00(c22p, aCRType);
                if (interfaceC37791pH.getId() != null) {
                    InterfaceC38101pu AsP = interfaceC37791pH.AsP();
                    String str4 = null;
                    if (AsP != null && AsP.getMediaId() != null) {
                        Bundle A002 = AbstractC86593tX.A0C(c22p).A00();
                        A002.putString(AbstractC111324zv.A00(80), interfaceC37791pH.getId());
                        A002.putSerializable(MSV.A00(17), C5JK.A05);
                        InterfaceC38101pu AsP2 = interfaceC37791pH.AsP();
                        if (AsP2 != null) {
                            str4 = AsP2.getMediaId();
                        }
                        A002.putString(AbstractC111324zv.A00(603), str4);
                        C14360o3.A0B(aCRType, 0);
                        A002.putString(AbstractC111324zv.A00(145), aCRType.A00);
                        FragmentActivity fragmentActivity = c38365Gu1.A01;
                        C6XJ A02 = C6XJ.A02(fragmentActivity, A002, userSession2, TransparentModalActivity.class, "clips_camera");
                        AbstractC31179DnN.A1S(A02);
                        A02.A0A(fragmentActivity, 9587);
                        i3 = 1080159323;
                        C0f9.A0C(i3, A053);
                        return;
                    }
                }
                A00.A02("story_highlights_item_null_metadata");
                i3 = 1080159323;
                C0f9.A0C(i3, A053);
                return;
            case 6:
                A052 = C0f9.A05(1210820049);
                C38334GtU c38334GtU = (C38334GtU) this.A02;
                C40997IDs c40997IDs = c38334GtU.A01;
                if (c40997IDs != null) {
                    C41027IEw c41027IEw = ((KZ8) c38334GtU.A04.getValue()).A00;
                    C42276Io0 c42276Io0 = c40997IDs.A00;
                    UserSession userSession3 = c42276Io0.A0R;
                    C38929HCc c38929HCc = c42276Io0.A0V;
                    C153756vk c153756vk = c42276Io0.A0Q;
                    long j = c42276Io0.A0M;
                    if (c41027IEw != null) {
                        c50679MYx = c41027IEw.A00;
                    } else {
                        c50679MYx = null;
                    }
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c38929HCc, userSession3), "instagram_audio_spotify_account_link_tap");
                    if (A0f.isSampled()) {
                        AbstractC37303Gc4.A0n(A0f, "audio_page", j);
                        AbstractC37303Gc4.A0e(A0f, c153756vk);
                        A0f.AAP("account_link_entry_point", "audio_page");
                        String str5 = null;
                        if (c50679MYx != null) {
                            str2 = c50679MYx.A00;
                        } else {
                            str2 = null;
                        }
                        A0f.AAP("spotify_listen_url", str2);
                        if (c50679MYx != null) {
                            str5 = c50679MYx.A01;
                        }
                        A0f.AAP("spotify_track_id", str5);
                        A0f.Cht();
                    }
                }
                C4A7 c4a7 = (C4A7) c38334GtU.A04.getValue();
                AbstractC166987dD.A1Z(new MC7(c38334GtU.A03, this.A01, c4a7, null, 19), c4a7.A01);
                i2 = 674899432;
                C0f9.A0C(i2, A052);
                return;
            case 7:
                A053 = C0f9.A05(-1570147581);
                C38211GrG c38211GrG = (C38211GrG) this.A01;
                C14360o3.A0A(view);
                C37931GmT c37931GmT = (C37931GmT) this.A02;
                C14360o3.A0B(view, 0);
                C38208GrD c38208GrD = c38211GrG.A03;
                InterfaceC60442pS interfaceC60442pS = c38211GrG.A04;
                AbstractC37301Gc2.A07(c38208GrD.A00).A0B(view, new String[0]);
                UserSession userSession4 = c38211GrG.A02;
                Fragment fragment = c38211GrG.A01;
                if (C14360o3.A0K(interfaceC60442pS.getModuleName(), "explore_popular")) {
                    c2Fb = C2Fb.A1l;
                } else {
                    c2Fb = C2Fb.A3J;
                }
                C37952Gmu c37952Gmu = new C37952Gmu(fragment, userSession4, new C42541IsK(userSession4, c37931GmT), interfaceC60442pS, c2Fb);
                c37952Gmu.A01(c37931GmT.BQN());
                c37952Gmu.A09 = 0;
                c37952Gmu.A0i = c38211GrG.A05;
                c37952Gmu.A0f = interfaceC60442pS.getModuleName();
                C37953Gmv.A02(c37952Gmu);
                i3 = 1967559278;
                C0f9.A0C(i3, A053);
                return;
            case 8:
                A05 = C0f9.A05(-935831795);
                ((AbstractC42425IqS) this.A01).DKV((C38321qM) this.A02);
                i = -312646667;
                C0f9.A0C(i, A05);
                return;
            case 9:
                A05 = C0f9.A05(148110160);
                ((InterfaceC43449JHn) this.A01).DKV((C38321qM) this.A02);
                i = 732054894;
                C0f9.A0C(i, A05);
                return;
            case 10:
                A05 = C0f9.A05(-400952103);
                ((C38115Gpi) this.A02).A02.invoke(this.A01);
                i = -440530798;
                C0f9.A0C(i, A05);
                return;
            case 11:
                A05 = C0f9.A05(1035560506);
                ((C38112Gpf) this.A02).A02.invoke(this.A01);
                i = 1234158485;
                C0f9.A0C(i, A05);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A05 = C0f9.A05(922665503);
                ((C38114Gph) this.A02).A02.invoke(this.A01);
                i = 962699465;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A05 = C0f9.A05(-1331901856);
                ((AbstractC42425IqS) this.A01).DKV((C38321qM) this.A02);
                i = 1210384945;
                C0f9.A0C(i, A05);
                return;
            case 14:
                A052 = C0f9.A05(-441005825);
                int bindingAdapterPosition = ((C3OO) this.A01).getBindingAdapterPosition();
                if (bindingAdapterPosition != -1) {
                    C38363Gtz c38363Gtz = (C38363Gtz) this.A02;
                    InterfaceC43408JFy interfaceC43408JFy = c38363Gtz.A01;
                    C51755Mte c51755Mte = c38363Gtz.A00;
                    if (c51755Mte != null && (list = (List) c51755Mte.A00) != null && (refinement = (Refinement) list.get(bindingAdapterPosition)) != null) {
                        interfaceC43408JFy.DeK(refinement, bindingAdapterPosition);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                i2 = 2122453319;
                C0f9.A0C(i2, A052);
                return;
            case Process.SIGTERM /* 15 */:
                A053 = C0f9.A05(171332805);
                C38P c38p = (C38P) this.A02;
                C3YT A003 = C3YS.A00(c38p.getSession());
                C38321qM c38321qM = (C38321qM) this.A01;
                A003.A02(c38321qM, false);
                C65823Tug c65823Tug = c38p.A06;
                str = "grid";
                if (c65823Tug != null) {
                    C75113Zb BRZ = c65823Tug.A0E.BRZ(c38321qM);
                    BRZ.A0D(0);
                    C41771Ien.A05(c38p, c38p.E6P().A00(), c38p.getSession(), c38321qM, BRZ, "sfplt_in_menu", BRZ.A1G, BRZ.A1F, c38p.getSessionId(), null, null, AbstractC25226BEj.A1G(c38321qM), BRZ.getPosition(), false);
                    C65823Tug c65823Tug2 = c38p.A06;
                    if (c65823Tug2 != null) {
                        String id = c38321qM.getId();
                        if (id != null) {
                            c65823Tug2.A08(id);
                            i3 = -608324144;
                            C0f9.A0C(i3, A053);
                            return;
                        } else {
                            IllegalStateException A0g = AbstractC166997dE.A0g();
                            C0f9.A0C(1260922444, A053);
                            throw A0g;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 16:
                A05 = C0f9.A05(-1059220364);
                JG0 jg0 = ((C38987HEp) this.A02).A00;
                IEW iew = (IEW) this.A01;
                Fragment fragment2 = (Fragment) jg0;
                AbstractC13900nG.A00(AbstractC31176DnK.A05(fragment2, iew), iew.A01);
                C9GR.A09(fragment2.getContext(), fragment2.getString(2131956831));
                i = 309006563;
                C0f9.A0C(i, A05);
                return;
            case 17:
                A05 = C0f9.A05(2122808355);
                H8D.A04((H8D) this.A02, (C55101ObE) this.A01);
                i = -877462168;
                C0f9.A0C(i, A05);
                return;
            case 18:
                A053 = C0f9.A05(-86767600);
                if (((View) this.A01).getContext() != null) {
                    HDL hdl = (HDL) this.A02;
                    C38333GtS c38333GtS = (C38333GtS) hdl.A0D.getValue();
                    C55101ObE c55101ObE = hdl.A00;
                    List list2 = (List) ((C37838Gks) c38333GtS.A04.getValue()).A06;
                    String A01 = C38333GtS.A01(c55101ObE, list2, C38333GtS.A02(c38333GtS), true);
                    C42342Ip4 c42342Ip4 = c38333GtS.A02;
                    C32545EUv c32545EUv = new C32545EUv(6, list2, c38333GtS, true);
                    ArrayList A12 = AbstractC166997dE.A12(list2, 0);
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        String A2u = AbstractC31172DnG.A0i(it).A2u();
                        if (A2u != null) {
                            A12.add(A2u);
                        }
                    }
                    c42342Ip4.A03.A01(SubmittedSubPostManageType.A05, c32545EUv, c42342Ip4.A04, A01, A12);
                }
                i3 = 2088138191;
                C0f9.A0C(i3, A053);
                return;
            case Process.SIGSTOP /* 19 */:
                A05 = C0f9.A05(1053869259);
                i = -1469767462;
                C0f9.A0C(i, A05);
                return;
            case 20:
                A05 = C0f9.A05(-1347114214);
                IMQ imq = (IMQ) this.A02;
                imq.A00(imq.A01 + 1);
                AbstractC13880nE.A0O(((C38526Gwm) this.A01).A05);
                i = -1293702154;
                C0f9.A0C(i, A05);
                return;
            case 21:
                A05 = C0f9.A05(22927848);
                ((IMQ) this.A02).A00(r1.A01 - 1);
                AbstractC13880nE.A0O(((C38526Gwm) this.A01).A05);
                i = 943377971;
                C0f9.A0C(i, A05);
                return;
            case 22:
                A05 = C0f9.A05(422177259);
                ((JH9) this.A01).DJi((C38321qM) this.A02);
                i = -855519183;
                C0f9.A0C(i, A05);
                return;
            case 23:
                A053 = C0f9.A05(-1256810421);
                EditText editText = (EditText) this.A01;
                List A004 = AbstractC41677Id6.A00(editText.getText().toString());
                C38909HBg c38909HBg = (C38909HBg) this.A02;
                c38909HBg.A03.addAll(A004);
                AbstractC13880nE.A0O(editText);
                c38909HBg.A01 = true;
                AbstractC31179DnN.A0x(c38909HBg);
                i3 = 830937349;
                C0f9.A0C(i3, A053);
                return;
            case 24:
                A05 = C0f9.A05(-616489836);
                V1R.A07((V1R) this.A02, ((C41057IGa) this.A01).A02);
                i = -1881076112;
                C0f9.A0C(i, A05);
                return;
            case 25:
                A05 = C0f9.A05(-1919812248);
                Fragment fragment3 = (Fragment) this.A02;
                C193328hC A0O = AbstractC31175DnJ.A0O(fragment3);
                A0O.A0A(2131964221);
                A0O.A09(2131964220);
                A0O.A0L(new DialogInterfaceOnClickListenerC55321Ogj(31, this.A01, fragment3), 2131964223);
                A0O.A0I(null, 2131964219);
                A0O.A04();
                AbstractC166987dD.A1W(A0O);
                i = 1586966131;
                C0f9.A0C(i, A05);
                return;
            case 26:
                A05 = C0f9.A05(-109896863);
                ((Runnable) this.A02).run();
                i = -928044795;
                C0f9.A0C(i, A05);
                return;
            case 27:
                A05 = C0f9.A05(1192944695);
                HMQ hmq = (HMQ) this.A02;
                int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                hmq.A00.DJB((MUD) this.A01);
                i = -203595536;
                C0f9.A0C(i, A05);
                return;
            case 28:
                A05 = C0f9.A05(1350676896);
                HMR hmr = (HMR) this.A02;
                int i6 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                hmr.A00.DTm((MUD) this.A01);
                i = 401111369;
                C0f9.A0C(i, A05);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A05 = C0f9.A05(-1863313237);
                HMT hmt = (HMT) this.A02;
                int i7 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                hmt.A00.DZN((MusicSearchPlaylist) this.A01);
                i = -1605144293;
                C0f9.A0C(i, A05);
                return;
            case 30:
                A05 = C0f9.A05(-688200147);
                HMS hms = (HMS) this.A02;
                int i8 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                hms.A00.DZN((MusicSearchPlaylist) this.A01);
                i = 329060316;
                C0f9.A0C(i, A05);
                return;
            case 31:
                A053 = C0f9.A05(-1134837377);
                C14360o3.A0B(view, 0);
                Context A0L = AbstractC166997dE.A0L(view);
                JIN jin = (JIN) this.A01;
                if (!AbstractC41656Ibo.A02(A0L, jin)) {
                    i3 = -2099216620;
                } else {
                    Integer num = C05F.A00;
                    HMZ hmz = (HMZ) this.A02;
                    int i9 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    Integer num2 = hmz.A02;
                    InterfaceC43461JHz interfaceC43461JHz = hmz.A0N;
                    int bindingAdapterPosition2 = hmz.getBindingAdapterPosition();
                    String str6 = hmz.A0R;
                    if (num == num2) {
                        interfaceC43461JHz.DYv(jin, str6, bindingAdapterPosition2);
                    } else {
                        interfaceC43461JHz.Dov(jin, str6, bindingAdapterPosition2);
                    }
                    i3 = 1504461505;
                }
                C0f9.A0C(i3, A053);
                return;
            case 32:
                A05 = C0f9.A05(-792291592);
                ((Activity) ((Context) this.A02)).onBackPressed();
                i = 1417230763;
                C0f9.A0C(i, A05);
                return;
            case 33:
                A05 = C0f9.A05(1078594352);
                ((EmptyStateView) this.A01).A0L();
                HD4 hd4 = (HD4) this.A02;
                C41188ILb c41188ILb = hd4.A09;
                String str7 = null;
                if (c41188ILb == null) {
                    str = "dataFetcher";
                } else {
                    String str8 = hd4.A0F;
                    if (str8 == null) {
                        str = "adId";
                    } else {
                        if (hd4.A06 == null) {
                            str7 = hd4.A0G;
                        }
                        c41188ILb.A00(str8, str7, hd4.A0H);
                        i = 102447527;
                        C0f9.A0C(i, A05);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 34:
                A05 = C0f9.A05(-2090018165);
                ((C42749Ivn) this.A02).A01.A0t((EnumC125765mR) this.A01);
                i = 1289375506;
                C0f9.A0C(i, A05);
                return;
            case 35:
                ((C38930HCd) this.A01).A04.A01((C41628IbJ) this.A02);
                return;
            case 36:
                ReelDashboardFragment reelDashboardFragment = (ReelDashboardFragment) this.A01;
                C41181vS A0G = reelDashboardFragment.A0G();
                if (A0G == null) {
                    return;
                }
                reelDashboardFragment.A0M(A0G.A0k, A0G.A0j);
                return;
            case 37:
                A053 = C0f9.A05(-1735263846);
                C39444HbW c39444HbW = (C39444HbW) this.A02;
                C4QW c4qw = c39444HbW.A02;
                if (c4qw.isPlaying()) {
                    c4qw.E3d("tapped");
                    imageView = (ImageView) this.A01;
                    context = c39444HbW.A00;
                    i4 = R.drawable.instagram_play_pano_filled_24;
                } else {
                    c4qw.E4T("tapped", false);
                    imageView = (ImageView) this.A01;
                    context = c39444HbW.A00;
                    i4 = R.drawable.instagram_pause_pano_filled_24;
                }
                AbstractC166997dE.A19(context, imageView, i4);
                i3 = 1021811612;
                C0f9.A0C(i3, A053);
                return;
            case 38:
                A05 = C0f9.A05(1237378686);
                C41624IbE c41624IbE = (C41624IbE) this.A01;
                if (c41624IbE.A00) {
                    C97634Zy c97634Zy = (C97634Zy) this.A02;
                    int i10 = c41624IbE.A01;
                    C97624Zx c97624Zx = c97634Zy.A00;
                    if (c97624Zx.A00 == -1) {
                        Boolean bool = Boolean.TRUE;
                        Wm1 wm1 = c97624Zx.A07;
                        wm1.getClass();
                        if (bool.equals(wm1.A02.A01)) {
                            InterfaceC97614Zw interfaceC97614Zw = c97624Zx.A05;
                            interfaceC97614Zw.getClass();
                            InterfaceC41201vU interfaceC41201vU = c97624Zx.A04;
                            interfaceC41201vU.getClass();
                            Wm1 wm12 = c97624Zx.A07;
                            wm12.getClass();
                            interfaceC97614Zw.Dct(interfaceC41201vU, c97624Zx, wm12, i10);
                        }
                    }
                }
                i = 1051396008;
                C0f9.A0C(i, A05);
                return;
            case 39:
                A05 = C0f9.A05(-1880790096);
                ((C38355Gtr) this.A01).A02.A00((StoryUnlockableStickerData) this.A02);
                i = -926407339;
                C0f9.A0C(i, A05);
                return;
            case 40:
                A05 = C0f9.A05(1963512577);
                ((C38945HCu) this.A01).A02.A00((StoryUnlockableStickerData) this.A02);
                i = -1869179861;
                C0f9.A0C(i, A05);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A05 = C0f9.A05(-1573999907);
                ((InterfaceC144666fm) this.A01).E0y(((C41551w4) this.A02).A0H);
                i = 984693395;
                C0f9.A0C(i, A05);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A05 = C0f9.A05(-1916269012);
                C38337GtX c38337GtX = (C38337GtX) this.A02;
                InterfaceC11380iw interfaceC11380iw = c38337GtX.A02;
                String A0j2 = AbstractC167017dG.A0j();
                UserSession userSession5 = c38337GtX.A03;
                HYM hym = (HYM) this.A01;
                String str9 = hym.A07;
                AbstractC37670Gi3.A0I(EnumC39636HiR.SONG, c38337GtX.A01, interfaceC11380iw, userSession5, null, AbstractC25231BEo.A0j(0, str9), A0j2, null, hym.A00.A07, null, null, null, str9, false);
                c38337GtX.A05.D1Q(hym);
                i = -274050689;
                C0f9.A0C(i, A05);
                return;
            case 43:
                A05 = C0f9.A05(-1244015245);
                AbstractC37301Gc2.A1P((ShoppingCartFragment) this.A01, ((H7B) this.A02).A01, "index_view_product_thumbnail");
                i = 1930904818;
                C0f9.A0C(i, A05);
                return;
            case 44:
                A05 = C0f9.A05(1037379501);
                ((ShoppingCartFragment) this.A01).DSu(((H7B) this.A02).A01);
                i = 1856471873;
                C0f9.A0C(i, A05);
                return;
            case 45:
                A05 = C0f9.A05(-1507324161);
                ((ShoppingCartFragment) this.A01).DSr(((H7B) this.A02).A01);
                i = 1912984536;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A05 = C0f9.A05(-2035970682);
                ((ShoppingCartFragment) this.A01).DSt(((H7B) this.A02).A01);
                i = -1097038626;
                C0f9.A0C(i, A05);
                return;
            case 47:
                A05 = C0f9.A05(-981068478);
                ((ShoppingCartFragment) this.A01).DSv(((H7B) this.A02).A01);
                i = -635721929;
                C0f9.A0C(i, A05);
                return;
            case 48:
                A05 = C0f9.A05(480335089);
                AbstractC37301Gc2.A1P((ShoppingCartFragment) this.A01, ((H7B) this.A02).A01, "index_view_view_cart_button");
                i = -1290131361;
                C0f9.A0C(i, A05);
                return;
            case 49:
                A05 = C0f9.A05(1427266320);
                AbstractC37301Gc2.A1P((ShoppingCartFragment) this.A01, ((H7B) this.A02).A01, "index_view_view_cart_button");
                i = 2115417056;
                C0f9.A0C(i, A05);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A053 = C0f9.A05(-1221132691);
                ShoppingCartFragment shoppingCartFragment = (ShoppingCartFragment) this.A01;
                H7B h7b = (H7B) this.A02;
                User user = h7b.A01;
                C41634IbP c41634IbP = h7b.A00;
                AbstractC37300Gc1.A0G(shoppingCartFragment.A02).A0B();
                C1563470e A0G2 = AbstractC37300Gc1.A0G(shoppingCartFragment.A02);
                A0G2.A0B();
                if (c41634IbP.A01 == 0) {
                    C0w9.A03("instagram_shopping_bag_index", "Attempting to checkout with a cart with no available items to checkout.");
                } else {
                    String A005 = AbstractC76433bn.A00(user);
                    String A09 = A0G2.A09(A005);
                    A09.getClass();
                    String A022 = AbstractC58442PvL.A02();
                    List list3 = c41634IbP.A09;
                    boolean z = true;
                    C18C.A0F(!list3.isEmpty());
                    if (((C41730Ie1) list3.get(0)).A04() == null) {
                        z = false;
                    }
                    C18C.A0F(z);
                    ProductCheckoutProperties productCheckoutProperties = ((C41730Ie1) list3.get(0)).A04().A01.A0C;
                    productCheckoutProperties.getClass();
                    C41585IaY c41585IaY = (C41585IaY) C41585IaY.A04.getValue();
                    UserSession userSession6 = shoppingCartFragment.A02;
                    c41585IaY.A00 = userSession6;
                    IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule = c41585IaY.A01;
                    if (igReactPurchaseExperienceBridgeModule != null) {
                        igReactPurchaseExperienceBridgeModule.mUserSession = userSession6;
                    }
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        Product A04 = ((C41730Ie1) it2.next()).A04();
                        if (A04 != null) {
                            A1E.add(A04);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    c41585IaY.A03 = A1E;
                    IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule2 = c41585IaY.A01;
                    if (igReactPurchaseExperienceBridgeModule2 != null) {
                        igReactPurchaseExperienceBridgeModule2.mProducts = A1E;
                    }
                    HashSet A1H = AbstractC166987dD.A1H();
                    IgFundedIncentive igFundedIncentive = shoppingCartFragment.A03;
                    if (igFundedIncentive != null) {
                        A1H.add(igFundedIncentive.A07);
                    }
                    UserSession userSession7 = shoppingCartFragment.A02;
                    String str10 = shoppingCartFragment.A0I;
                    String str11 = shoppingCartFragment.A0C;
                    String str12 = shoppingCartFragment.A0D;
                    String str13 = shoppingCartFragment.A0G;
                    String str14 = shoppingCartFragment.A0E;
                    str14.getClass();
                    shoppingCartFragment.A0A.Cqg(AbstractC41734Ie6.A00(userSession7, productCheckoutProperties, user, A005, A022, "instagram_shopping_bag_index", str10, str11, str12, str13, "index_view_buy_now", "index_view_buy_now", str14, A09, shoppingCartFragment.A0H, list3, A1H));
                    C41731Ie2 c41731Ie2 = shoppingCartFragment.A08;
                    String str15 = shoppingCartFragment.A0I;
                    String str16 = shoppingCartFragment.A0E;
                    str16.getClass();
                    c41731Ie2.A04(c41634IbP, null, str15, A005, A022, str16, A09, c41634IbP.A00);
                    shoppingCartFragment.A01.flowEndSuccess(shoppingCartFragment.A00);
                }
                i3 = -1144992207;
                C0f9.A0C(i3, A053);
                return;
            case 51:
                A05 = C0f9.A05(-581080900);
                ((InterfaceC43453JHr) this.A01).DSu(((C42313Iob) this.A02).A00);
                i = -262281949;
                C0f9.A0C(i, A05);
                return;
            case 52:
                A05 = C0f9.A05(-2079116353);
                ((InterfaceC43453JHr) this.A01).DSr(((C42313Iob) this.A02).A00);
                i = -611338900;
                C0f9.A0C(i, A05);
                return;
            case 53:
                A05 = C0f9.A05(1217744597);
                ((InterfaceC43453JHr) this.A01).DSt(((C42313Iob) this.A02).A00);
                i = 926747176;
                C0f9.A0C(i, A05);
                return;
            case 54:
                A05 = C0f9.A05(-756257407);
                ((InterfaceC43453JHr) this.A01).DSv(((C42313Iob) this.A02).A00);
                i = -118348506;
                C0f9.A0C(i, A05);
                return;
            case 55:
                A05 = C0f9.A05(-866171231);
                ((C42824Ix0) this.A01).A05(((C42293IoH) this.A02).A00);
                i = 1071076117;
                C0f9.A0C(i, A05);
                return;
            case 56:
                A052 = C0f9.A05(1621963654);
                C42824Ix0 c42824Ix0 = (C42824Ix0) this.A02;
                C41730Ie1 c41730Ie1 = (C41730Ie1) this.A01;
                c41730Ie1.A04().getClass();
                MerchantShoppingCartFragment merchantShoppingCartFragment = c42824Ix0.A00;
                merchantShoppingCartFragment.A0F = c41730Ie1;
                C41731Ie2 c41731Ie22 = merchantShoppingCartFragment.A09;
                String str17 = merchantShoppingCartFragment.A0U;
                String str18 = merchantShoppingCartFragment.A0N;
                String str19 = merchantShoppingCartFragment.A0Q;
                String str20 = merchantShoppingCartFragment.A0T;
                boolean A1a = AbstractC167017dG.A1a(str17, str18);
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c41731Ie22.A02, "instagram_shopping_bag_edit_item");
                String A054 = c41730Ie1.A05();
                C14360o3.A07(A054);
                A0f2.A9K("product_id", AbstractC25228BEl.A13(A054));
                A0f2.AAP("quantity", String.valueOf(c41730Ie1.A03()));
                Product A042 = c41730Ie1.A04();
                boolean z2 = true;
                if (A042 == null || A042.A0P != A1a) {
                    z2 = false;
                }
                A0f2.A7v("is_in_stock", Boolean.valueOf(z2));
                A0f2.AAP("merchant_id", str17);
                String str21 = c41731Ie22.A05;
                if (str21 != null) {
                    A0f2.AAP("merchant_bag_entry_point", str21);
                    String str22 = c41731Ie22.A06;
                    if (str22 != null) {
                        A0f2.AAP("merchant_bag_prior_module", str22);
                        A0f2.AAP("checkout_session_id", str18);
                        String str23 = c41731Ie22.A08;
                        if (str23 == null) {
                            str23 = "";
                        }
                        A0f2.AAP("shopping_session_id", str23);
                        A0f2.AAP("global_bag_entry_point", c41731Ie22.A00);
                        A0f2.AAP("global_bag_prior_module", c41731Ie22.A04);
                        if (str19 != null) {
                            A0f2.A9K("global_bag_id", AbstractC166997dE.A0j(str19));
                        }
                        AbstractC37303Gc4.A0m(A0f2, str20);
                        A0f2.Cht();
                        if (merchantShoppingCartFragment.mParentFragment instanceof BottomSheetFragment) {
                            C1XJ.A00.A0h(merchantShoppingCartFragment.requireContext(), null, c41730Ie1.A04());
                        } else {
                            Product A043 = c41730Ie1.A04();
                            C14360o3.A0B(A043, A1a ? 1 : 0);
                            HashMap A1G = AbstractC166987dD.A1G();
                            List list4 = A043.A0O;
                            if (list4 != null && !list4.isEmpty()) {
                                if (list4.isEmpty()) {
                                    throw AbstractC31172DnG.A0u();
                                }
                                list4.size();
                                A1G.size();
                                if (!c41730Ie1.A05().equals(A043.A0H)) {
                                    boolean z3 = !C70Y.A00(merchantShoppingCartFragment.A02).A08(A043);
                                    C41730Ie1 A08 = AbstractC37301Gc2.A0O(merchantShoppingCartFragment).A08(c41730Ie1, A043, merchantShoppingCartFragment.A0U);
                                    if (A08 != null) {
                                        C41731Ie2 c41731Ie23 = merchantShoppingCartFragment.A09;
                                        String str24 = merchantShoppingCartFragment.A0U;
                                        String str25 = merchantShoppingCartFragment.A0N;
                                        String str26 = merchantShoppingCartFragment.A0Q;
                                        String str27 = merchantShoppingCartFragment.A0T;
                                        C14360o3.A0B(str25, A1a ? 1 : 0);
                                        InterfaceC02590Ai A0f3 = AbstractC166987dD.A0f(c41731Ie23.A02, "instagram_shopping_bag_item_edited");
                                        String str28 = c41731Ie23.A08;
                                        if (str28 == null) {
                                            str28 = "";
                                        }
                                        A0f3.AAP("shopping_session_id", str28);
                                        String A055 = A08.A05();
                                        C14360o3.A07(A055);
                                        A0f3.A9K("product_id", AbstractC25228BEl.A13(A055));
                                        A0f3.AAK(C4SX.A00(str24), "merchant_id");
                                        String str29 = c41731Ie23.A06;
                                        if (str29 != null) {
                                            A0f3.AAP("merchant_bag_prior_module", str29);
                                            String str30 = c41731Ie23.A05;
                                            if (str30 != null) {
                                                A0f3.AAP("merchant_bag_entry_point", str30);
                                                A0f3.AAP("quantity", String.valueOf(A08.A03()));
                                                Product A044 = A08.A04();
                                                boolean z4 = true;
                                                if (A044 == null || A044.A0P != A1a) {
                                                    z4 = false;
                                                }
                                                A0f3.A7v("is_in_stock", Boolean.valueOf(z4));
                                                A0f3.A7v("is_initial_add", AbstractC31173DnH.A0e(A0f3, "checkout_session_id", str25, z3));
                                                A0f3.AAP("global_bag_prior_module", c41731Ie23.A04);
                                                A0f3.AAP("global_bag_entry_point", c41731Ie23.A00);
                                                String A056 = c41730Ie1.A05();
                                                C14360o3.A07(A056);
                                                A0f3.A9K("original_product_id", AbstractC003100w.A0k(10, A056));
                                                if (str26 != null) {
                                                    A0f3.A9K("global_bag_id", AbstractC003100w.A0k(10, str26));
                                                }
                                                if (str27 != null) {
                                                    A0f3.A9K("merchant_bag_id", AbstractC003100w.A0k(10, str27));
                                                }
                                                A0f3.Cht();
                                            } else {
                                                throw AbstractC166987dD.A14("Required value was null.");
                                            }
                                        } else {
                                            throw AbstractC166987dD.A14("Required value was null.");
                                        }
                                    }
                                }
                            } else {
                                throw AbstractC31172DnG.A0u();
                            }
                        }
                        i2 = -932983725;
                        C0f9.A0C(i2, A052);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 57:
                A05 = C0f9.A05(-1226385411);
                C42824Ix0.A01((C42824Ix0) this.A01, (Product) this.A02, "shopping_bag_item_product_thumbnail");
                i = -907123804;
                C0f9.A0C(i, A05);
                return;
            case 58:
                A05 = C0f9.A05(1698161703);
                C42824Ix0.A01((C42824Ix0) this.A01, (Product) this.A02, "shopping_bag_item_product_name");
                i = -2042601081;
                C0f9.A0C(i, A05);
                return;
            case 59:
                A053 = C0f9.A05(2072433645);
                C42824Ix0 c42824Ix02 = (C42824Ix0) this.A02;
                C41730Ie1 c41730Ie12 = (C41730Ie1) this.A01;
                Product A045 = c41730Ie12.A04();
                A045.getClass();
                ProductCheckoutProperties productCheckoutProperties2 = A045.A01.A0C;
                productCheckoutProperties2.getClass();
                int intValue = productCheckoutProperties2.BJM().intValue();
                int intValue2 = A045.A01.A0C.A0E.intValue();
                if (intValue2 != -1) {
                    intValue = Math.min(intValue, intValue2);
                }
                ArrayList A1E2 = AbstractC166987dD.A1E();
                int A03 = c41730Ie12.A03();
                int i11 = 0;
                for (int i12 = 1; i12 <= intValue; i12++) {
                    if (i12 == A03) {
                        i11 = i12 - 1;
                    }
                    A1E2.add(AbstractC13670mt.A06("%d", AbstractC25228BEl.A1Y(i12)));
                }
                MerchantShoppingCartFragment merchantShoppingCartFragment2 = c42824Ix02.A00;
                merchantShoppingCartFragment2.A0K = new J16(c42824Ix02, c41730Ie12, A03);
                merchantShoppingCartFragment2.A0B.Crl(A1E2, i11, merchantShoppingCartFragment2.requireContext().getString(2131971217));
                i3 = 1133607611;
                C0f9.A0C(i3, A053);
                return;
            case 60:
                A05 = C0f9.A05(-1779115326);
                ((C42824Ix0) this.A02).A05((C41730Ie1) this.A01);
                i = 371892881;
                C0f9.A0C(i, A05);
                return;
            case 61:
                A053 = C0f9.A05(-231614356);
                C42824Ix0 c42824Ix03 = (C42824Ix0) this.A02;
                C41730Ie1 c41730Ie13 = (C41730Ie1) this.A01;
                Product A046 = c41730Ie13.A04();
                A046.getClass();
                MerchantShoppingCartFragment merchantShoppingCartFragment3 = c42824Ix03.A00;
                C41634IbP A057 = C70Y.A00(merchantShoppingCartFragment3.A02).A05(merchantShoppingCartFragment3.A0U);
                if (A057 != null && Collections.unmodifiableList(A057.A06).size() > 1) {
                    AbstractC37301Gc2.A0O(merchantShoppingCartFragment3).A0F(c41730Ie13, merchantShoppingCartFragment3.A0U);
                    MerchantShoppingCartFragment.A00(EnumC39539HdB.A03, merchantShoppingCartFragment3, C70Y.A00(merchantShoppingCartFragment3.A02).A05(merchantShoppingCartFragment3.A0U));
                    merchantShoppingCartFragment3.mRecyclerView.post(new RunnableC43132J4v(c42824Ix03, A046));
                } else {
                    C42824Ix0.A00(c42824Ix03, A046);
                    AbstractC37301Gc2.A0O(merchantShoppingCartFragment3).A0F(c41730Ie13, merchantShoppingCartFragment3.A0U);
                }
                C41731Ie2 c41731Ie24 = merchantShoppingCartFragment3.A09;
                String str31 = merchantShoppingCartFragment3.A0U;
                String str32 = merchantShoppingCartFragment3.A0N;
                String str33 = merchantShoppingCartFragment3.A0Q;
                String str34 = merchantShoppingCartFragment3.A0T;
                AbstractC25230BEn.A15(1, str31, str32);
                InterfaceC02590Ai A006 = C41730Ie1.A00(c41731Ie24.A02, c41730Ie13, "instagram_shopping_bag_save_for_later");
                C41730Ie1.A02(A006, c41730Ie13);
                Product A047 = c41730Ie13.A04();
                boolean z5 = true;
                if (A047 == null || !A047.A0P) {
                    z5 = false;
                }
                AbstractC37303Gc4.A0s(A006, str31, z5);
                String str35 = c41731Ie24.A05;
                if (str35 != null) {
                    A006.AAP("merchant_bag_entry_point", str35);
                    String str36 = c41731Ie24.A06;
                    if (str36 != null) {
                        C41731Ie2.A02(A006, c41731Ie24, C41731Ie2.A01(A006, c41731Ie24, "merchant_bag_prior_module", str36, str32), str33);
                        AbstractC37303Gc4.A0m(A006, str34);
                        A006.Cht();
                        i3 = 851982079;
                        C0f9.A0C(i3, A053);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 62:
                A05 = C0f9.A05(1751183270);
                ((JHK) this.A01).Cvf((Product) this.A02);
                i = -1256292921;
                C0f9.A0C(i, A05);
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                A05 = C0f9.A05(1776459103);
                ((JHK) this.A01).Db8((Product) this.A02);
                i = 1811407225;
                C0f9.A0C(i, A05);
                return;
            case 64:
                A05 = C0f9.A05(1581771092);
                ((C42334Iow) this.A02).A02.A02.invoke(this.A01);
                i = -1272943856;
                C0f9.A0C(i, A05);
                return;
            case 65:
                A05 = C0f9.A05(1548665136);
                ((C42334Iow) this.A02).A02.A03.invoke(this.A01);
                i = -1696262613;
                C0f9.A0C(i, A05);
                return;
            case 66:
                A052 = C0f9.A05(283075016);
                ProductCollectionFragment productCollectionFragment = ((HFZ) this.A02).A00;
                User user2 = (User) this.A01;
                if (productCollectionFragment.A0A.A02.ordinal() == 16) {
                    ProductCollectionFragment.A00(productCollectionFragment, user2.getUsername(), "shopping_incentive_user_picture", "incentive");
                }
                i2 = 2074421320;
                C0f9.A0C(i2, A052);
                return;
            case 67:
                A05 = C0f9.A05(1267142976);
                ((JGN) this.A01).Dhl((C38818H7j) this.A02);
                i = -1182872963;
                C0f9.A0C(i, A05);
                return;
            case 68:
                A05 = C0f9.A05(-298977816);
                ((C38975HEd) this.A02).A03.DKJ((C41191ILf) this.A01);
                i = 537944892;
                C0f9.A0C(i, A05);
                return;
            case 69:
                A05 = C0f9.A05(1537330678);
                ((C38510GwV) this.A01).A01.A00();
                ((C42329Ior) this.A02).A01.A02.invoke();
                i = -2001919664;
                C0f9.A0C(i, A05);
                return;
            default:
                A053 = C0f9.A05(941389450);
                ID3 id3 = (ID3) this.A01;
                ProductDiscountInformationDict productDiscountInformationDict = (ProductDiscountInformationDict) this.A02;
                C38932HCf c38932HCf = id3.A00;
                c38932HCf.A01 = productDiscountInformationDict.getId();
                c38932HCf.A02 = true;
                IK2 ik2 = (IK2) c38932HCf.A08.getValue();
                String A0e = AbstractC37302Gc3.A0e((User) c38932HCf.A09.getValue());
                C14360o3.A0A(A0e);
                C14360o3.A0B(A0e, 1);
                Long A0j3 = AbstractC25231BEo.A0j(0, productDiscountInformationDict.getId());
                if (A0j3 != null) {
                    InterfaceC02590Ai A0f4 = AbstractC166987dD.A0f(ik2.A00, "shops_promotions_link_tap");
                    A0f4.A9K("discount_id", A0j3);
                    AbstractC31171DnF.A1I(A0f4, ik2.A02);
                    C0Zx c0Zx = new C0Zx();
                    AbstractC37300Gc1.A0v(c0Zx, ik2.A03);
                    AbstractC37300Gc1.A0w(c0Zx, ik2.A04);
                    c0Zx.A06("shopping_session_id", ik2.A05);
                    AbstractC37301Gc2.A13(A0f4, c0Zx, "submodule", ik2.A01.getModuleName());
                    AbstractC37301Gc2.A18(A0f4, A0e);
                    A0f4.Cht();
                }
                AbstractC167007dF.A16(c38932HCf.A00);
                i3 = 1633075895;
                C0f9.A0C(i3, A053);
                return;
        }
    }

    public ViewOnClickListenerC42034Ik3(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
