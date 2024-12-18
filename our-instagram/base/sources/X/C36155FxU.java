package X;

import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.save.model.SavedCollection;
import com.instagram.urlhandlers.directgroupinvite.DirectGroupInviteHandlerActivity;
import com.instagram.user.model.Product;
import com.instagram.user.userlist.fragment.UnifiedFollowFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FxU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36155FxU implements InterfaceC41501vz {
    public final int A00;
    public final Object A01;

    public C36155FxU(EM6 em6, int i) {
        this.A00 = i;
        if (10 - i != 0) {
            this.A01 = em6;
        } else {
            this.A01 = em6;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        int i2;
        int i3;
        C34947FaX c34947FaX;
        int A032;
        int i4;
        String str;
        C32403EPe c32403EPe;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(104085845);
                int A033 = C0f9.A03(-1633331765);
                ELU elu = ((EVG) this.A01).A00;
                if (elu != null) {
                    C36007Fv5 A00 = C36007Fv5.A00();
                    InterfaceC09390do interfaceC09390do = elu.A06;
                    if (AbstractC31171DnF.A1X(A00.A02(AbstractC166987dD.A0o(interfaceC09390do), "ig_android_growth_fx_access_fb_ig_find_fb_friends", ELU.__redex_internal_original_name))) {
                        AbstractC34354FCw.A00(AbstractC166987dD.A0o(interfaceC09390do), "find_friends_fb");
                        if (C36007Fv5.A00().A02(AbstractC166987dD.A0o(interfaceC09390do), "ig_android_growth_fx_access_fb_ig_find_fb_friends", ELU.__redex_internal_original_name) != null) {
                            C1ON A02 = AbstractC35079Fcq.A02(AbstractC166987dD.A0o(interfaceC09390do), C16030qx.A02.A05(elu.requireContext()), null, C36007Fv5.A00().A02(AbstractC166987dD.A0o(interfaceC09390do), "ig_android_growth_fx_access_fb_ig_find_fb_friends", ELU.__redex_internal_original_name), true);
                            A02.A00 = new ESR(elu);
                            elu.schedule(A02);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                }
                C0f9.A0A(-1252596527, A033);
                i = -1311723672;
                C0f9.A0A(i, A03);
                return;
            case 1:
                A032 = C0f9.A03(1601413289);
                C0f9.A0A(1919807226, C0f9.A03(-990716426));
                i4 = 1273964576;
                C0f9.A0A(i4, A032);
                return;
            case 2:
                A032 = C0f9.A03(-1218621393);
                int A034 = C0f9.A03(-1601928493);
                C35017Fbq c35017Fbq = (C35017Fbq) this.A01;
                synchronized (c35017Fbq) {
                    if (c35017Fbq.A00) {
                        C1GJ.A03(new G09(c35017Fbq));
                    }
                }
                C0f9.A0A(1158426495, A034);
                i4 = 1794830504;
                C0f9.A0A(i4, A032);
                return;
            case 3:
                A032 = C0f9.A03(-2033333024);
                int A035 = C0f9.A03(981642245);
                C36007Fv5 A002 = C36007Fv5.A00();
                EVI evi = (EVI) this.A01;
                C07270a1 c07270a1 = evi.A06;
                String A022 = A002.A02(c07270a1, "ig_android_growth_FX_access_fbig_create_cp_claiming", "LandingLifecycleListener");
                Bundle bundle = evi.A05.mArguments;
                if (bundle != null && bundle.get("autologin") != null && !evi.A02 && A022 != null) {
                    evi.A00.A0B(c07270a1, C36007Fv5.A00().A01(c07270a1, "ig_android_growth_FX_access_fbig_create_cp_claiming", "LandingLifecycleListener"), A022, true);
                    evi.A02 = true;
                }
                C0f9.A0A(609477488, A035);
                i4 = 1043468691;
                C0f9.A0A(i4, A032);
                return;
            case 4:
                A032 = C0f9.A03(833238453);
                int A036 = C0f9.A03(492506767);
                C32287EJz c32287EJz = (C32287EJz) this.A01;
                EQ2 eq2 = c32287EJz.A03;
                if (eq2 == null) {
                    str = "accountAdapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                eq2.A00(C32287EJz.A01(c32287EJz));
                C0f9.A0A(295315926, A036);
                i4 = 1468965382;
                C0f9.A0A(i4, A032);
                return;
            case 5:
                A032 = C0f9.A03(-520689660);
                C36106Fwg c36106Fwg = (C36106Fwg) obj;
                int A0N = AbstractC167017dG.A0N(c36106Fwg, 1909460045);
                if (c36106Fwg.A00 == C05F.A01 && !c36106Fwg.A02 && C1VN.A00 != null) {
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put("selected_method", c36106Fwg.A01);
                    C32286EJy c32286EJy = (C32286EJy) this.A01;
                    C34649FOh c34649FOh = c32286EJy.A0E;
                    if (c34649FOh == null) {
                        str = "userForEditing";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    Date date = c34649FOh.A0P;
                    if (date != null) {
                        Calendar calendar = Calendar.getInstance();
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTime(date);
                        int i5 = calendar.get(1) - calendar2.get(1);
                        calendar2.set(1, calendar.get(1));
                        if (calendar2.after(calendar)) {
                            i5--;
                        }
                        A1G.put("original_stated_age", String.valueOf(i5));
                    }
                    AbstractC31282Dp4.A00().A00(c32286EJy.requireActivity(), AbstractC166987dD.A0r(c32286EJy.A0L), "1917255341800707", A1G);
                }
                C0f9.A0A(309087062, A0N);
                i4 = -1914965580;
                C0f9.A0A(i4, A032);
                return;
            case 6:
                A032 = C0f9.A03(-267919954);
                int A037 = C0f9.A03(656203745);
                ((C35146Fen) this.A01).A00.A04("reg_flow_extras_serialize_key");
                C0f9.A0A(521956278, A037);
                i4 = 2136596674;
                C0f9.A0A(i4, A032);
                return;
            case 7:
                A03 = C0f9.A03(1329222197);
                C36116Fwq c36116Fwq = (C36116Fwq) obj;
                int A0N2 = AbstractC167017dG.A0N(c36116Fwq, -320177586);
                C38288GsX c38288GsX = (C38288GsX) this.A01;
                FragmentActivity activity = c38288GsX.getActivity();
                if (activity != null && activity.isFinishing()) {
                    i2 = -2080121844;
                } else {
                    Iterator it = c36116Fwq.A01.iterator();
                    while (it.hasNext()) {
                        C38288GsX.A04(AbstractC31172DnG.A0i(it), c38288GsX, c36116Fwq.A00);
                    }
                    i2 = 392137577;
                }
                C0f9.A0A(i2, A0N2);
                i = 351380597;
                C0f9.A0A(i, A03);
                return;
            case 8:
                A032 = C0f9.A03(-780258402);
                C36117Fwr c36117Fwr = (C36117Fwr) obj;
                int A0N3 = AbstractC167017dG.A0N(c36117Fwr, -1098425890);
                if (c36117Fwr.A01 == C05F.A0C) {
                    ((C38288GsX) this.A01).A0C = c36117Fwr.A00;
                }
                C0f9.A0A(-937840451, A0N3);
                i4 = -1011825412;
                C0f9.A0A(i4, A032);
                return;
            case 9:
                A032 = C0f9.A03(753375456);
                C36110Fwk c36110Fwk = (C36110Fwk) obj;
                int A0N4 = AbstractC167017dG.A0N(c36110Fwk, -83574908);
                C38288GsX c38288GsX2 = (C38288GsX) this.A01;
                C38321qM c38321qM = c36110Fwk.A00.A00;
                C14360o3.A07(c38321qM);
                C38288GsX.A04(c38321qM, c38288GsX2, c36110Fwk.A01);
                C0f9.A0A(-1456720894, A0N4);
                i4 = 415298094;
                C0f9.A0A(i4, A032);
                return;
            case 10:
                EM6 em6 = (EM6) this.A01;
                C36110Fwk c36110Fwk2 = (C36110Fwk) obj;
                C40958ICf c40958ICf = c36110Fwk2.A00;
                if (!em6.A0L.equals(c36110Fwk2.A01) || !c40958ICf.A00.CcN()) {
                    return;
                }
                if (em6.A0E != EnumC33416Epn.A05 && !c40958ICf.A00.BqL().contains(em6.A0L)) {
                    return;
                }
                GI1 gi1 = em6.A0B;
                EnumC39557HdT enumC39557HdT = EnumC39557HdT.A04;
                List list = gi1.A06.A01;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        EnumC39557HdT enumC39557HdT2 = ((InterfaceC37180GZr) it2.next()).C4n().A00;
                        enumC39557HdT2.getClass();
                        if (enumC39557HdT2 == enumC39557HdT) {
                            return;
                        }
                    }
                }
                EM6.A03(em6);
                return;
            case 11:
                A03 = C0f9.A03(-921282128);
                C36116Fwq c36116Fwq2 = (C36116Fwq) obj;
                int A038 = C0f9.A03(300538074);
                EM6 em62 = (EM6) this.A01;
                String str2 = em62.A0L;
                String str3 = c36116Fwq2.A00;
                if ((str2.equals(str3) || em62.A0T) && str3 != null) {
                    List list2 = c36116Fwq2.A01;
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!AbstractC31172DnG.A0i(it3).BqL().contains(str3)) {
                            }
                        } else {
                            if (em62.A0T) {
                                em62.A0L = str3;
                            }
                            EM6.A03(em62);
                            int size = list2.size();
                            if (EM6.A0A(em62)) {
                                em62.A00 += size;
                            } else {
                                SavedCollection savedCollection = em62.A0C;
                                if (savedCollection != null) {
                                    savedCollection.A0E = Integer.valueOf(AbstractC167017dG.A0K(savedCollection.A0E) + size);
                                }
                            }
                            EM6.A05(em62);
                        }
                    }
                }
                C0f9.A0A(567627769, A038);
                i = 1471099813;
                C0f9.A0A(i, A03);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A03 = C0f9.A03(520074259);
                C36117Fwr c36117Fwr2 = (C36117Fwr) obj;
                int A039 = C0f9.A03(1644825114);
                C14360o3.A0B(c36117Fwr2, 0);
                int intValue = c36117Fwr2.A01.intValue();
                if (intValue != 0) {
                    if (intValue == 1) {
                        InterfaceC37179GZq interfaceC37179GZq = ((C34964Fao) this.A01).A06;
                        String str4 = c36117Fwr2.A00.A0F;
                        C14360o3.A07(str4);
                        interfaceC37179GZq.EFA(str4);
                    }
                } else {
                    ((C34964Fao) this.A01).A06.AAa(c36117Fwr2.A00);
                }
                C0f9.A0A(1008281406, A039);
                i = -1971212253;
                C0f9.A0A(i, A03);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A032 = C0f9.A03(514201478);
                C36110Fwk c36110Fwk3 = (C36110Fwk) obj;
                int A0N5 = AbstractC167017dG.A0N(c36110Fwk3, 943931289);
                C34964Fao c34964Fao = (C34964Fao) this.A01;
                String str5 = c36110Fwk3.A01;
                C38321qM c38321qM2 = c36110Fwk3.A00.A00;
                C14360o3.A07(c38321qM2);
                if (C34964Fao.A00(c38321qM2, c34964Fao, str5, c36110Fwk3.A02)) {
                    c34964Fao.A06.ECo(null);
                }
                C0f9.A0A(-1892189798, A0N5);
                i4 = -88877096;
                C0f9.A0A(i4, A032);
                return;
            case 14:
                A03 = C0f9.A03(-1831699452);
                C36116Fwq c36116Fwq3 = (C36116Fwq) obj;
                int A0310 = C0f9.A03(2001593049);
                C14360o3.A0B(c36116Fwq3, 0);
                Iterator it4 = c36116Fwq3.A01.iterator();
                while (true) {
                    boolean z = false;
                    while (it4.hasNext()) {
                        boolean A003 = C34964Fao.A00(AbstractC31172DnG.A0i(it4), (C34964Fao) this.A01, c36116Fwq3.A00, false);
                        if (z || A003) {
                            z = true;
                        }
                    }
                    if (z) {
                        ((C34964Fao) this.A01).A06.ECo(null);
                    }
                    C0f9.A0A(1469026256, A0310);
                    i = -1698157716;
                    C0f9.A0A(i, A03);
                    return;
                    break;
                }
            case Process.SIGTERM /* 15 */:
                A03 = C0f9.A03(1817571857);
                C3HW c3hw = (C3HW) obj;
                int A0311 = C0f9.A03(-882399390);
                int i6 = 0;
                C14360o3.A0B(c3hw, 0);
                InterfaceC76653cC interfaceC76653cC = c3hw.A00;
                if (interfaceC76653cC instanceof Product) {
                    C14360o3.A0C(interfaceC76653cC, AbstractC111324zv.A00(1147));
                    Product product = (Product) interfaceC76653cC;
                    ImageInfo imageInfo = product.A08;
                    if (imageInfo == null) {
                        i3 = 1626006502;
                        C0f9.A0A(i3, A0311);
                        i = -2106870870;
                        C0f9.A0A(i, A03);
                        return;
                    }
                    C34964Fao c34964Fao2 = (C34964Fao) this.A01;
                    boolean A0312 = AbstractC1563570f.A00(c34964Fao2.A04).A03(product);
                    EQI eqi = c34964Fao2.A05;
                    C32949Eeg c32949Eeg = eqi.A04;
                    C14360o3.A0B(c32949Eeg, 0);
                    int size2 = c32949Eeg.A01.size();
                    if (!A0312) {
                        boolean z2 = false;
                        while (true) {
                            if (i6 < size2) {
                                SavedCollection savedCollection2 = (SavedCollection) c32949Eeg.A01.get(i6);
                                if (savedCollection2.A07 == EnumC33416Epn.A0C) {
                                    boolean A1P = AbstractC167007dF.A1P(Collections.unmodifiableList(savedCollection2.A0M).size(), 4);
                                    ArrayList A1E = AbstractC166987dD.A1E();
                                    Iterator A13 = AbstractC31174DnI.A13(savedCollection2.A0M);
                                    boolean z3 = false;
                                    while (A13.hasNext()) {
                                        ProductImageContainer productImageContainer = (ProductImageContainer) A13.next();
                                        if (C14360o3.A0K(productImageContainer.BGx(), imageInfo)) {
                                            z3 = true;
                                        } else {
                                            A1E.add(productImageContainer);
                                        }
                                    }
                                    savedCollection2.A04(A1E);
                                    if (z3 && A1P) {
                                        z2 = true;
                                    }
                                } else {
                                    i6++;
                                }
                            }
                        }
                        EQI.A00(eqi);
                        if (z2) {
                            c34964Fao2.A06.ECo(null);
                        }
                    } else {
                        while (true) {
                            if (i6 < size2) {
                                SavedCollection savedCollection3 = (SavedCollection) c32949Eeg.A01.get(i6);
                                if (savedCollection3.A07 == EnumC33416Epn.A0C) {
                                    List<ProductImageContainer> A19 = AbstractC31172DnG.A19(savedCollection3.A0M);
                                    ProductImageContainerImpl productImageContainerImpl = new ProductImageContainerImpl(imageInfo.F5B(), null);
                                    ArrayList A0z = AbstractC31174DnI.A0z(productImageContainerImpl);
                                    for (ProductImageContainer productImageContainer2 : A19) {
                                        if (!C14360o3.A0K(productImageContainerImpl.BGx(), productImageContainer2.BGx())) {
                                            A0z.add(productImageContainer2);
                                        }
                                    }
                                    savedCollection3.A04(A0z);
                                } else {
                                    i6++;
                                }
                            }
                        }
                        EQI.A00(eqi);
                    }
                }
                i3 = 1039912098;
                C0f9.A0A(i3, A0311);
                i = -2106870870;
                C0f9.A0A(i, A03);
                return;
            case 16:
                C0f9.A03(-1675073079);
                C0f9.A03(390810217);
                throw AbstractC166987dD.A15("getSuccess");
            case 17:
                A032 = C0f9.A03(809092374);
                int A0313 = C0f9.A03(-1659664340);
                C35150Fes.A01((C35150Fes) this.A01);
                C0f9.A0A(-87629621, A0313);
                i4 = -1126275187;
                C0f9.A0A(i4, A032);
                return;
            case 18:
                A032 = C0f9.A03(-921022656);
                int A0314 = C0f9.A03(-1150527068);
                C33232ElR.A00((C33232ElR) this.A01);
                C0f9.A0A(-1244071500, A0314);
                i4 = -595309449;
                C0f9.A0A(i4, A032);
                return;
            case Process.SIGSTOP /* 19 */:
                A032 = C0f9.A03(932748392);
                int A0315 = C0f9.A03(-2067702409);
                C33227ElJ c33227ElJ = (C33227ElJ) this.A01;
                c33227ElJ.setItems(C33227ElJ.A00(c33227ElJ));
                C0f9.A0A(-2090592512, A0315);
                i4 = 1093597476;
                C0f9.A0A(i4, A032);
                return;
            case 20:
                A032 = C0f9.A03(-826549431);
                int A0N6 = AbstractC167017dG.A0N(obj, 1935217864);
                ELU elu2 = (ELU) this.A01;
                CallerContext callerContext = ELU.A0B;
                if (elu2.mLifecycleRegistry.A07().A00(C07S.CREATED)) {
                    ELU.A01(elu2);
                }
                C0f9.A0A(1178066948, A0N6);
                i4 = 22249079;
                C0f9.A0A(i4, A032);
                return;
            case 21:
                A032 = C0f9.A03(987945879);
                int A0316 = C0f9.A03(-516213443);
                ENN enn = (ENN) this.A01;
                if (enn.isAdded() && (c32403EPe = enn.A00) != null) {
                    c32403EPe.A0C();
                }
                C0f9.A0A(857709705, A0316);
                i4 = -1276136438;
                C0f9.A0A(i4, A032);
                return;
            case 22:
                A032 = C0f9.A03(454803372);
                int A0317 = C0f9.A03(-1113183059);
                C05290Qb A07 = C0b3.A00().A07();
                DirectGroupInviteHandlerActivity directGroupInviteHandlerActivity = (DirectGroupInviteHandlerActivity) this.A01;
                A07.A0G(directGroupInviteHandlerActivity, directGroupInviteHandlerActivity.getIntent());
                directGroupInviteHandlerActivity.finish();
                C0f9.A0A(-2140286243, A0317);
                i4 = -427811871;
                C0f9.A0A(i4, A032);
                return;
            case 23:
                A032 = C0f9.A03(-175363389);
                int A0318 = C0f9.A03(-1001260861);
                ((EVJ) this.A01).A01();
                C0f9.A0A(-1513135341, A0318);
                i4 = -188579151;
                C0f9.A0A(i4, A032);
                return;
            case 24:
                A032 = C0f9.A03(1315957704);
                int A0319 = C0f9.A03(-1379259926);
                ((EVJ) this.A01).A01();
                C0f9.A0A(-251940315, A0319);
                i4 = 1200497883;
                C0f9.A0A(i4, A032);
                return;
            case 25:
                A032 = C0f9.A03(900786204);
                int A0320 = C0f9.A03(920389247);
                ((EVJ) this.A01).A01();
                C0f9.A0A(-764083493, A0320);
                i4 = -654350468;
                C0f9.A0A(i4, A032);
                return;
            case 26:
                A03 = C0f9.A03(379089641);
                C42281xI c42281xI = (C42281xI) obj;
                int A0321 = C0f9.A03(1763486996);
                C36289Fzj c36289Fzj = (C36289Fzj) this.A01;
                C34946FaW c34946FaW = (C34946FaW) c36289Fzj.A00.get();
                WeakReference weakReference = c36289Fzj.A01;
                if (weakReference == null) {
                    c34947FaX = null;
                } else {
                    c34947FaX = (C34947FaX) weakReference.get();
                }
                if (c34946FaW != null || c34947FaX != null) {
                    C11T.A02(new RunnableC36961GQe(this, c42281xI, c34946FaW, c34947FaX));
                }
                C0f9.A0A(-633506920, A0321);
                i = -2051837605;
                C0f9.A0A(i, A03);
                return;
            case 27:
                A032 = C0f9.A03(-1138664972);
                int A0322 = C0f9.A03(588713356);
                C31542DtS c31542DtS = ((C31535DtK) this.A01).A0E;
                if (c31542DtS == null) {
                    str = "followListAdapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                c31542DtS.A0G(false, false);
                C0f9.A0A(-397346867, A0322);
                i4 = -288082977;
                C0f9.A0A(i4, A032);
                return;
            case 28:
                A032 = C0f9.A03(-837117391);
                C36105Fwf c36105Fwf = (C36105Fwf) obj;
                int A0323 = C0f9.A03(-916761397);
                if (c36105Fwf != null) {
                    EnumC31556Dtg enumC31556Dtg = c36105Fwf.A01;
                    int i7 = c36105Fwf.A00;
                    if (i7 != -1) {
                        UnifiedFollowFragment unifiedFollowFragment = (UnifiedFollowFragment) this.A01;
                        unifiedFollowFragment.A02 = i7;
                        TextView textView = (TextView) unifiedFollowFragment.A0T.get(enumC31556Dtg);
                        if (textView != null) {
                            textView.setText(UnifiedFollowFragment.A00(enumC31556Dtg, unifiedFollowFragment));
                        }
                    }
                }
                C0f9.A0A(-1520055404, A0323);
                i4 = 1837221063;
                C0f9.A0A(i4, A032);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A032 = C0f9.A03(1107158050);
                int A0324 = C0f9.A03(632606828);
                ENR.A01((ENR) this.A01);
                C0f9.A0A(1516645223, A0324);
                i4 = 1456129718;
                C0f9.A0A(i4, A032);
                return;
            default:
                A032 = C0f9.A03(-1843007840);
                int A0325 = C0f9.A03(-1050976489);
                ENO.A01((ENO) this.A01);
                C0f9.A0A(868670031, A0325);
                i4 = -136788656;
                C0f9.A0A(i4, A032);
                return;
        }
    }

    public C36155FxU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
