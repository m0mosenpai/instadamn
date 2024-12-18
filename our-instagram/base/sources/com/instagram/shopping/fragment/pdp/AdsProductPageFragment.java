package com.instagram.shopping.fragment.pdp;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC18680vv;
import X.AbstractC23021Ah;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.AbstractC40801I6d;
import X.AbstractC41071vF;
import X.AbstractC41356ISb;
import X.AbstractC42328Ioq;
import X.AbstractC42951yN;
import X.AbstractC58442PvL;
import X.AbstractC59962oe;
import X.AnonymousClass001;
import X.AnonymousClass309;
import X.C05F;
import X.C0f9;
import X.C11520jB;
import X.C128205qp;
import X.C14360o3;
import X.C1GL;
import X.C1ON;
import X.C23031Ai;
import X.C25621Ms;
import X.C25671My;
import X.C2TN;
import X.C37330GcY;
import X.C37460Gee;
import X.C37816GkW;
import X.C38321qM;
import X.C38383GuK;
import X.C38642Gyj;
import X.C38655Gyw;
import X.C38683GzO;
import X.C38801rC;
import X.C39334HYz;
import X.C39350HZp;
import X.C39352HZr;
import X.C39703HjZ;
import X.C3LO;
import X.C3ZH;
import X.C3ZM;
import X.C41192ILg;
import X.C41595Iai;
import X.C41617Ib7;
import X.C41621IbB;
import X.C41622IbC;
import X.C41632IbN;
import X.C41693IdM;
import X.C41702IdW;
import X.C41723Idu;
import X.C41726Idx;
import X.C41727Idy;
import X.C41729Ie0;
import X.C41753IeT;
import X.C42235InL;
import X.C42236InM;
import X.C42256Ing;
import X.C42261Inl;
import X.C42274Iny;
import X.C42347Ip9;
import X.C42923Iyb;
import X.C43121yf;
import X.C4SX;
import X.C51D;
import X.C51E;
import X.C56352iT;
import X.C57112jm;
import X.C61372qz;
import X.C62862tP;
import X.C62882tR;
import X.C64742wY;
import X.C64842wi;
import X.C70073Cr;
import X.C9BP;
import X.EnumC27385C6o;
import X.EnumC39591He1;
import X.EnumC39623HeX;
import X.HBA;
import X.HH1;
import X.HHF;
import X.HZ0;
import X.HZ1;
import X.HZ2;
import X.HZ3;
import X.HZ4;
import X.HZ5;
import X.HZ6;
import X.HZ7;
import X.I92;
import X.I93;
import X.ID2;
import X.IDM;
import X.IH5;
import X.IHG;
import X.IIM;
import X.IIU;
import X.IIY;
import X.IJE;
import X.IJH;
import X.IKJ;
import X.ILQ;
import X.IMP;
import X.IN1;
import X.IND;
import X.INL;
import X.INQ;
import X.ISV;
import X.InterfaceC02590Ai;
import X.InterfaceC1119153d;
import X.InterfaceC41501vz;
import X.InterfaceC43419JGj;
import X.InterfaceC56362iU;
import X.InterfaceC56392iX;
import X.InterfaceC60122ou;
import X.InterfaceC60442pS;
import X.InterfaceC72783Nz;
import X.J0U;
import X.JI6;
import X.JID;
import X.ViewOnClickListenerC42033Ik2;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.shopping.intf.ProductDetailsPageArguments;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class AdsProductPageFragment extends AbstractC59962oe implements JI6, AnonymousClass309, C51E, C51D, InterfaceC1119153d, InterfaceC60122ou, InterfaceC72783Nz, InterfaceC43419JGj {
    public C62862tP A00;
    public UserSession A01;
    public C38321qM A02;
    public C64842wi A03;
    public C64742wY A04;
    public IMP A05;
    public C41702IdW A06;
    public C41727Idy A07;
    public INQ A08;
    public C41729Ie0 A09;
    public HHF A0A;
    public HZ1 A0B;
    public C41621IbB A0C;
    public HZ6 A0D;
    public HZ5 A0E;
    public HZ4 A0F;
    public HZ7 A0G;
    public HZ3 A0H;
    public HZ0 A0I;
    public HZ2 A0J;
    public IIM A0K;
    public C41192ILg A0L;
    public ProductDetailsPageArguments A0M;
    public JID A0N;
    public ILQ A0P;
    public IIY A0Q;
    public C41622IbC A0R;
    public INL A0S;
    public Product A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public boolean A0Y;
    public C62882tR A0Z;
    public IJE A0a;
    public IND A0b;
    public HH1 A0c;
    public C41693IdM A0d;
    public C39334HYz A0e;
    public C41632IbN A0f;
    public J0U A0g;
    public ID2 A0h;
    public IIU A0i;
    public IHG A0j;
    public boolean A0k;
    public FrameLayout mBaseFrameLayout;
    public RecyclerView mRecyclerView;
    public final C61372qz A0s = new C61372qz();
    public final InterfaceC41501vz A0q = new C42261Inl(this, 3);
    public final InterfaceC41501vz A0p = C37816GkW.A00(this, 37);
    public final InterfaceC41501vz A0o = C37816GkW.A00(this, 38);
    public C41726Idx A0O = new C41726Idx(new C41753IeT());
    public final String A0n = AbstractC58442PvL.A02();
    public final C37330GcY A0r = new C37330GcY();
    public final C38383GuK A0l = new C38383GuK();
    public final C57112jm A0m = C57112jm.A00();

    public final void A02(HBA hba, C38655Gyw c38655Gyw) {
        JID jid;
        String str;
        this.A0k = true;
        UserSession userSession = this.A01;
        boolean z = c38655Gyw.A0A;
        if (z) {
            jid = null;
        } else {
            jid = this.A0N;
        }
        C42923Iyb A00 = AbstractC40801I6d.A00(userSession, hba, jid);
        IKJ ikj = A00.A00;
        this.A0T = ikj.A03;
        User user = ikj.A04;
        if (user != null) {
            this.A0A.A00(C56352iT.A0t.A03(requireActivity()), this.A0T.A01.A08, user);
        }
        A01(this.A0T);
        C41726Idx A002 = this.A0P.A00(A00, this.A0O);
        C41753IeT c41753IeT = new C41753IeT(A002);
        C41595Iai c41595Iai = A002.A02;
        EnumC39591He1 enumC39591He1 = c41595Iai.A00;
        EnumC39591He1 enumC39591He12 = c41595Iai.A04;
        EnumC39591He1 enumC39591He13 = c41595Iai.A05;
        EnumC39591He1 enumC39591He14 = c41595Iai.A01;
        EnumC39591He1 enumC39591He15 = c41595Iai.A02;
        EnumC39591He1 enumC39591He16 = EnumC39591He1.A05;
        c41753IeT.A02 = new C41595Iai(enumC39591He1, enumC39591He14, enumC39591He15, enumC39591He16, enumC39591He12, enumC39591He13, true);
        A00(A00, new C41726Idx(c41753IeT));
        this.A0C.A01();
        C41753IeT c41753IeT2 = new C41753IeT(this.A0O);
        C41595Iai c41595Iai2 = this.A0O.A02;
        c41753IeT2.A02 = new C41595Iai(c41595Iai2.A00, c41595Iai2.A01, c41595Iai2.A02, enumC39591He16, c41595Iai2.A04, c41595Iai2.A05, c41595Iai2.A06);
        C41726Idx.A01(this, c41753IeT2);
        if (z) {
            C41702IdW c41702IdW = this.A06;
            C4SX c4sx = null;
            C38683GzO A0M = AbstractC37304Gc5.A0M(c41702IdW, this.A0T);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41702IdW.A02, "instagram_ads_app_load_success");
            if (A0f.isSampled()) {
                C38642Gyj c38642Gyj = c41702IdW.A01;
                if (c38642Gyj == null || (str = c38642Gyj.A05) == null) {
                    str = "";
                }
                AbstractC37300Gc1.A0o(A0f, C41702IdW.A00(A0f, c41702IdW, str));
                if (A0M != null) {
                    c4sx = A0M.A01;
                }
                C41702IdW.A01(A0f, c41702IdW, AbstractC37304Gc5.A0b(c4sx, A0f, A0M));
                A0f.Cht();
            }
            C41702IdW c41702IdW2 = this.A06;
            Product product = this.A0T;
            c41702IdW2.A02(product, this.A0O.A04.A01(this.A01, product).size());
        }
        UserSession userSession2 = this.A01;
        Product product2 = this.A0T;
        C14360o3.A0B(userSession2, 0);
        C14360o3.A0B(product2, 1);
        C42347Ip9 A003 = I92.A00(userSession2, false);
        C14360o3.A0B(A003, 2);
        A003.A0G(EnumC39623HeX.A06, product2);
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        User BSW;
        HHF hhf;
        String str;
        UserSession userSession;
        Boolean AkY;
        Product product;
        interfaceC56362iU.EkS(true);
        C38321qM c38321qM = this.A02;
        if (c38321qM != null && c38321qM.A2E(this.A01) != null) {
            hhf = this.A0A;
            BSW = this.A02.A2E(this.A01);
        } else {
            JID jid = this.A0N;
            if (jid != null && (BSW = jid.BSW()) != null) {
                hhf = this.A0A;
            }
            str = this.A0U;
            userSession = this.A01;
            if (str.equals(userSession.userId) || C2TN.A00(userSession) || ((AkY = AbstractC166987dD.A10(this.A01).A03.AkY()) != null && AkY.booleanValue() && this.A0U.equals(this.A01.userId) && (product = this.A0T) != null && product.A02())) {
                C3LO A0B = AbstractC31171DnF.A0B();
                A0B.A06 = R.drawable.instagram_more_vertical_pano_outline_24;
                A0B.A05 = 2131966337;
                AbstractC31176DnK.A1B(new ViewOnClickListenerC42033Ik2(this, 54), A0B, interfaceC56362iU);
            }
            return;
        }
        hhf.A00(interfaceC56362iU, null, BSW);
        str = this.A0U;
        userSession = this.A01;
        if (str.equals(userSession.userId)) {
        }
        C3LO A0B2 = AbstractC31171DnF.A0B();
        A0B2.A06 = R.drawable.instagram_more_vertical_pano_outline_24;
        A0B2.A05 = 2131966337;
        AbstractC31176DnK.A1B(new ViewOnClickListenerC42033Ik2(this, 54), A0B2, interfaceC56362iU);
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_ads_app";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x007d. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.1vV, java.lang.Object] */
    private void A00(JID jid, C41726Idx c41726Idx) {
        C38321qM c38321qM;
        C3ZM A03;
        this.A0N = jid;
        this.A0O = c41726Idx;
        this.A05.A00(jid, c41726Idx);
        IIM iim = this.A0K;
        JID jid2 = this.A0N;
        C41726Idx c41726Idx2 = this.A0O;
        C14360o3.A0B(jid2, 0);
        ArrayList A12 = AbstractC166997dE.A12(c41726Idx2, 1);
        Product product = c41726Idx2.A09;
        if (product != null) {
            List Brm = jid2.Brm(product.A0H);
            int size = Brm.size();
            for (int i = 0; i < size; i++) {
                int intValue = ((AbstractC42328Ioq) Brm.get(i)).A01.intValue();
                if (intValue != 8) {
                    if (intValue == 17) {
                        if (!A12.isEmpty()) {
                            C14360o3.A0C(A12.get(A12.size() - 1), "null cannot be cast to non-null type instagram.core.uigraph.creation.SimpleUiGraphNodeParams<com.instagram.uigraph.data.UiGraphNodeData<com.instagram.shopping.controller.pdp.prefetch.ProductDetailsPagePrefetchMetadata>>");
                        }
                        throw AbstractC166987dD.A15("getProductFeedResponse");
                    }
                } else {
                    C41723Idu c41723Idu = c41726Idx2.A04;
                    UserSession userSession = iim.A01;
                    List A01 = c41723Idu.A01(userSession, product);
                    int size2 = A01.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Object obj = A01.get(i2);
                        C14360o3.A07(obj);
                        IN1 in1 = (IN1) obj;
                        switch (in1.A02.intValue()) {
                            case 1:
                                c38321qM = ((C39350HZp) in1).A00;
                                A03 = C3ZH.A03(iim.A00, userSession, c38321qM, C05F.A00, iim.A02.getModuleName());
                                A12.add(new C9BP(new C43121yf(A03, new Object()), i, i2));
                                break;
                            case 2:
                            case 3:
                            default:
                                ExtendedImageUrl A00 = in1.A00(iim.A00);
                                if (A00 != null) {
                                    A03 = C3ZH.A06(userSession, A00, iim.A02.getModuleName());
                                    A12.add(new C9BP(new C43121yf(A03, new Object()), i, i2));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                break;
                            case 5:
                                c38321qM = ((C39352HZr) in1).A00;
                                A03 = C3ZH.A03(iim.A00, userSession, c38321qM, C05F.A00, iim.A02.getModuleName());
                                A12.add(new C9BP(new C43121yf(A03, new Object()), i, i2));
                                break;
                        }
                    }
                }
            }
            AbstractC42951yN.A00(iim.A01).A06(iim.A02.getModuleName(), A12);
        }
    }

    private void A01(Product product) {
        String str;
        C41729Ie0 c41729Ie0 = this.A09;
        C14360o3.A0B(product, 0);
        c41729Ie0.A03 = product;
        C41622IbC c41622IbC = this.A0R;
        c41622IbC.A06.A00 = product;
        c41622IbC.A08.A00 = product;
        c41622IbC.A00 = product;
        IJE ije = this.A0a;
        if (!ije.A00) {
            ije.A00 = true;
            UserSession userSession = ije.A02;
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            if (product.A04() && !A00.A1u()) {
                InterfaceC60442pS interfaceC60442pS = ije.A03;
                FragmentActivity fragmentActivity = ije.A01;
                String str2 = ije.A04;
                User user = product.A0B;
                if (user != null) {
                    str = user.getUsername();
                } else {
                    str = "";
                }
                AbstractC41356ISb.A00(fragmentActivity, interfaceC60442pS, userSession, str2, str);
            }
        }
    }

    public final void A03(boolean z) {
        String str;
        String str2;
        ProductTileMedia productTileMedia;
        String str3;
        if (!z && this.A0N.getNextMaxId() == null) {
            return;
        }
        C41753IeT c41753IeT = new C41753IeT(this.A0O);
        C41595Iai c41595Iai = this.A0O.A02;
        C41753IeT.A02(c41595Iai, c41753IeT, c41595Iai.A06);
        C41726Idx.A01(this, c41753IeT);
        IIU iiu = this.A0i;
        String str4 = this.A0W;
        String str5 = this.A0U;
        String str6 = this.A0M.A0M;
        String str7 = null;
        if (str6 != null) {
            C38801rC c38801rC = C38321qM.A0h;
            str = C38801rC.A06(str6);
        } else {
            str = null;
        }
        ProductDetailsPageArguments productDetailsPageArguments = this.A0M;
        String str8 = null;
        if (!productDetailsPageArguments.A0a && (((productTileMedia = productDetailsPageArguments.A03) != null && (str3 = productTileMedia.A02) != null) || (str3 = productDetailsPageArguments.A0K) != null)) {
            C38801rC c38801rC2 = C38321qM.A0h;
            str8 = C38801rC.A06(str3);
        }
        C38321qM c38321qM = this.A02;
        if (c38321qM != null && c38321qM.CdW()) {
            str2 = AbstractC41071vF.A0F(this.A01, this.A02);
        } else {
            str2 = null;
        }
        JID jid = this.A0N;
        if (jid != null && !z) {
            str7 = jid.getNextMaxId();
        }
        ProductDetailsPageArguments productDetailsPageArguments2 = this.A0M;
        C38655Gyw c38655Gyw = new C38655Gyw(str4, str5, str, str8, str2, str7, productDetailsPageArguments2.A0H, this.A0O.A03.A03, productDetailsPageArguments2.A0D, z, productDetailsPageArguments2.A0b, AbstractC167007dF.A1W(this.A0T), this.mParentFragment instanceof BottomSheetFragment);
        HashSet hashSet = iiu.A03;
        if (hashSet.contains(c38655Gyw)) {
            return;
        }
        if (!c38655Gyw.A0A && c38655Gyw.A05 == null) {
            return;
        }
        C42274Iny c42274Iny = iiu.A01;
        HashMap hashMap = c42274Iny.A03;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        Iterator A14 = AbstractC166997dE.A14(hashMap);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            if (AbstractC166987dD.A0N(A1K.getValue()) < System.currentTimeMillis()) {
                A1I.put(A1K.getKey(), A1K.getValue());
            }
        }
        Iterator A0l = AbstractC167007dF.A0l(A1I);
        while (A0l.hasNext()) {
            Object next = A0l.next();
            c42274Iny.A01.remove(next);
            hashMap.remove(next);
        }
        HBA hba = (HBA) c42274Iny.A01.get(c38655Gyw);
        if (hba != null) {
            iiu.A00.A02(hba, c38655Gyw);
            return;
        }
        hashSet.add(c38655Gyw);
        IJH ijh = iiu.A02;
        IDM idm = new IDM(iiu);
        String A0g = AnonymousClass001.A0g("ads/app/products/", c38655Gyw.A07, "/details/");
        C25621Ms A0M = AbstractC31177DnL.A0M(ijh.A01);
        A0M.A0B(A0g);
        A0M.A9s("merchant_id", c38655Gyw.A04);
        A0M.A9s("shopping_bag_enabled", "false");
        A0M.A9s(AbstractC111324zv.A00(64), ijh.A04.toString());
        A0M.A9s("device_width", String.valueOf(ijh.A00));
        A0M.A0I("should_fetch_hero_carousel", c38655Gyw.A0B);
        A0M.A0H("source_media_id", c38655Gyw.A08);
        A0M.A0H("pinned_media_id", c38655Gyw.A06);
        A0M.A0H("ads_tracking_token", c38655Gyw.A00);
        A0M.A0H("max_id", c38655Gyw.A05);
        A0M.A0H(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c38655Gyw.A02);
        A0M.A0F("should_show_all_catalogs_last", Boolean.valueOf(c38655Gyw.A0C));
        A0M.A0H("featured_product_permission_id", c38655Gyw.A03);
        A0M.A9s("ig_recyclerview_adapter_enabled", "true");
        A0M.A0H("marketer_id", c38655Gyw.A01);
        A0M.A0F("is_caller_bottom_sheet", Boolean.valueOf(c38655Gyw.A09));
        C1ON A0e = AbstractC25227BEk.A0e(A0M, HBA.class, ISV.class);
        C37460Gee c37460Gee = new C37460Gee(12, idm, ijh, c38655Gyw);
        C1GL c1gl = ijh.A03.A00;
        A0e.A00 = c37460Gee;
        c1gl.schedule(A0e);
    }

    @Override // X.JI6
    public final JID BUL() {
        return this.A0N;
    }

    @Override // X.JI6
    public final C38321qM Byj() {
        return this.A02;
    }

    @Override // X.JI6
    public final C41726Idx C02() {
        return this.A0O;
    }

    @Override // X.InterfaceC43419JGj
    public final void D2w(C39703HjZ c39703HjZ) {
        C41753IeT c41753IeT = new C41753IeT(this.A0O);
        IH5 ih5 = this.A0O.A06;
        C14360o3.A0B(ih5, 1);
        c41753IeT.A06 = new IH5(c39703HjZ, ih5.A00, ih5.A01);
        C41726Idx.A01(this, c41753IeT);
    }

    @Override // X.JI6
    public final void EZF(JID jid) {
        A00(jid, this.A0O);
    }

    @Override // X.JI6
    public final void Eej(C41726Idx c41726Idx) {
        A00(this.A0N, c41726Idx);
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final boolean isScrolledToBottom() {
        if (this.mRecyclerView == null) {
            return true;
        }
        return !r1.canScrollVertically(1);
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (((LinearLayoutManager) recyclerView.A0D).A1a() == 1 && this.mRecyclerView.getChildAt(0).getTop() >= 0)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ff, code lost:
    
        if (r0.A04() == false) goto L30;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.pdp.AdsProductPageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6P() {
        C11520jB A0B = AbstractC37300Gc1.A0B();
        A0B.A06(this.A0r.A00);
        return A0B;
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6Q(C38321qM c38321qM) {
        return E6P();
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 15) {
            UserSession userSession = this.A01;
            long j = C42274Iny.A04;
            I93.A00(userSession).A00();
            A03(true);
            return;
        }
        if (i2 != -1 || i != 7) {
            return;
        }
        intent.getClass();
        String stringExtra = intent.getStringExtra("item_id");
        String stringExtra2 = intent.getStringExtra("source_id");
        if (stringExtra == null || stringExtra2 == null) {
            return;
        }
        Product product = this.A0O.A09;
        product.getClass();
        List A01 = this.A0O.A04.A01(this.A01, product);
        for (int i3 = 0; i3 < A01.size(); i3++) {
            if (((IN1) A01.get(i3)).A01().equals(stringExtra)) {
                C41753IeT c41753IeT = new C41753IeT(this.A0O);
                C41617Ib7 c41617Ib7 = new C41617Ib7(this.A0O.A04);
                c41617Ib7.A03 = Integer.valueOf(i3);
                c41753IeT.A04 = new C41723Idu(c41617Ib7);
                C41726Idx.A01(this, c41753IeT);
                IMP imp = this.A05;
                imp.A00(imp.A00, imp.A01);
                imp.A04.notifyDataSetChanged();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0536, code lost:
    
        if (r4.A01.A0F != null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x068a  */
    /* JADX WARN: Type inference failed for: r3v42, types: [X.ICy, X.HYz] */
    /* JADX WARN: Type inference failed for: r3v90, types: [java.lang.Object, X.1oD] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r44) {
        /*
            Method dump skipped, instructions count: 1679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.fragment.pdp.AdsProductPageFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1044524053);
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.product_details_page_layout, viewGroup, false);
        this.mBaseFrameLayout = frameLayout;
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = this.mBaseFrameLayout;
        C0f9.A09(-1418270454, A02);
        return frameLayout2;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        C38683GzO A03;
        String str2;
        String str3;
        C4SX c4sx;
        int A02 = C0f9.A02(2010863285);
        super.onDestroy();
        C41702IdW c41702IdW = this.A06;
        C38683GzO A0M = AbstractC37304Gc5.A0M(c41702IdW, this.A0T);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41702IdW.A02, "instagram_ads_app_surface_end");
        if (A0f.isSampled()) {
            C38642Gyj c38642Gyj = c41702IdW.A01;
            if (c38642Gyj != null) {
                str3 = c38642Gyj.A05;
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            AbstractC37300Gc1.A0o(A0f, C41702IdW.A00(A0f, c41702IdW, str3));
            if (A0M != null) {
                c4sx = A0M.A01;
            } else {
                c4sx = null;
            }
            C41702IdW.A01(A0f, c41702IdW, AbstractC37304Gc5.A0b(c4sx, A0f, A0M));
            A0f.Cht();
        }
        if (!this.A0k) {
            Product product = this.A0T;
            C41702IdW c41702IdW2 = this.A06;
            if (product == null) {
                String str4 = this.A0W;
                String str5 = this.A0U;
                AbstractC167017dG.A1N(str4, str5);
                A03 = new C38683GzO(C4SX.A00(str5), null, null, null, null, null, null, AbstractC167027dH.A03(str4));
            } else {
                A03 = C128205qp.A03(c41702IdW2.A03, product);
            }
            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c41702IdW2.A02, "instagram_ads_app_abandon");
            if (A0f2.isSampled()) {
                C38642Gyj c38642Gyj2 = c41702IdW2.A01;
                if (c38642Gyj2 == null || (str2 = c38642Gyj2.A05) == null) {
                    str2 = "";
                }
                AbstractC37300Gc1.A0o(A0f2, C41702IdW.A00(A0f2, c41702IdW2, str2));
                C41702IdW.A01(A0f2, c41702IdW2, C38683GzO.A00(A0f2, A03));
                A0f2.Cht();
            }
        }
        HZ6 hz6 = this.A0D;
        AbstractC25651Mw.A00(hz6.A01).A02(hz6.A00, C42256Ing.class);
        IIM iim = this.A0K;
        iim.A03.A08(iim.A02.getModuleName());
        unregisterLifecycleListener(this.A0Z);
        unregisterLifecycleListener(this.A0A);
        unregisterLifecycleListener(this.A04);
        C25671My A00 = AbstractC25651Mw.A00(this.A01);
        A00.A02(this.A0q, C70073Cr.class);
        A00.A02(this.A0p, C42236InM.class);
        A00.A02(this.A0o, C42235InL.class);
        C41693IdM c41693IdM = this.A0d;
        JI6 ji6 = c41693IdM.A04;
        Product product2 = ji6.C02().A08;
        if (product2 != null && ji6.BUL().CLy() && !c41693IdM.A02 && !C41693IdM.A09.contains(c41693IdM.A05)) {
            str = "785516298687912";
        } else {
            String str6 = c41693IdM.A06;
            if (!str6.startsWith("tags_list_") && !"instagram_shopping_pdp".equals(str6) && product2 != null && product2.A04() && product2.A0P) {
                str = "2463936483829671";
            }
            C0f9.A09(1252303073, A02);
        }
        C41693IdM.A00(c41693IdM, str);
        C0f9.A09(1252303073, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1150024813);
        super.onDestroyView();
        AdsProductPageFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(1156095657, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(928976259);
        super.onPause();
        C38383GuK c38383GuK = this.A0l;
        Map map = c38383GuK.A00;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            ((RecyclerView) it.next()).A15(c38383GuK);
        }
        map.clear();
        this.A08.A02("fragment_paused");
        C0f9.A09(-574478748, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1531202901);
        super.onResume();
        C41693IdM c41693IdM = this.A0d;
        Product product = c41693IdM.A04.C02().A08;
        if (product != null && product.A04() && c41693IdM.A01) {
            C41693IdM.A00(c41693IdM, "2479230905637782");
        }
        if (this.A0Y && isAdded()) {
            this.A0Y = false;
            AbstractC25226BEj.A1P(this);
        }
        C0f9.A09(-1988561707, A02);
    }

    @Override // X.JI6
    public final void Eec(C38321qM c38321qM) {
        this.A02 = c38321qM;
    }
}
