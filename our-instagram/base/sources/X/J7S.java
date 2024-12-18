package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.flashmedia.FlashMediaCacheImpl;
import com.instagram.feed.media.flashmedia.FlashMediaRepository;
import com.instagram.feed.tifu.TifuViewModel;
import com.instagram.feed.tifu.api.TifuApiHelper;
import com.instagram.model.mediasize.VideoVersionIntf;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class J7S extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J7S(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC59502nt interfaceC59502nt;
        String str;
        Object obj;
        C38321qM c38321qM;
        String str2;
        ILZ ilz;
        FragmentActivity activity;
        User user;
        String A00;
        switch (this.A00) {
            case 0:
                InterfaceC43523JKj interfaceC43523JKj = (InterfaceC43523JKj) this.A01;
                if (interfaceC43523JKj != null) {
                    return interfaceC43523JKj.F7o();
                }
                return null;
            case 1:
                List list = (List) this.A01;
                if (list != null) {
                    ArrayList A0q = AbstractC167017dG.A0q(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        A0q.add(((JLC) it.next()).F7o());
                    }
                    return A0q;
                }
                return null;
            case 2:
                List list2 = (List) this.A01;
                if (list2 != null) {
                    ArrayList A0q2 = AbstractC167017dG.A0q(list2);
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        A0q2.add(((VideoVersionIntf) it2.next()).F7o());
                    }
                    return A0q2;
                }
                return null;
            case 3:
                InterfaceC43524JKk interfaceC43524JKk = (InterfaceC43524JKk) this.A01;
                if (interfaceC43524JKk != null) {
                    return interfaceC43524JKk.F7o();
                }
                return null;
            case 4:
                List list3 = (List) this.A01;
                if (list3 != null) {
                    ArrayList A0q3 = AbstractC167017dG.A0q(list3);
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        AbstractC31178DnM.A1U(A0q3, it3);
                    }
                    return A0q3;
                }
                return null;
            case 5:
                List list4 = (List) this.A01;
                if (list4 != null) {
                    ArrayList A0q4 = AbstractC167017dG.A0q(list4);
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        A0q4.add(((InterfaceC2042391v) it4.next()).F7o());
                    }
                    return A0q4;
                }
                return null;
            case 6:
                AnonymousClass924 anonymousClass924 = (AnonymousClass924) this.A01;
                if (anonymousClass924 != null) {
                    return anonymousClass924.F7o();
                }
                return null;
            case 7:
                InterfaceC43580JMo interfaceC43580JMo = (InterfaceC43580JMo) this.A01;
                if (interfaceC43580JMo != null) {
                    return interfaceC43580JMo.F7o();
                }
                return null;
            case 8:
                List list5 = (List) this.A01;
                if (list5 != null) {
                    ArrayList A0q5 = AbstractC167017dG.A0q(list5);
                    Iterator it5 = list5.iterator();
                    while (it5.hasNext()) {
                        A0q5.add(((WhatsAppChannelShareToIgStoryStickerTappableObject) it5.next()).F7o());
                    }
                    return A0q5;
                }
                return null;
            case 9:
                UserSession userSession = (UserSession) this.A01;
                return new C37891Glm(C1AT.A01(userSession).A04(C1AV.A2f, C3YT.class), userSession);
            case 10:
                return new FlashMediaRepository((UserSession) this.A01);
            case 11:
                return new FlashMediaCacheImpl((UserSession) this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new OZZ((UserSession) this.A01);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new EgZ((UserSession) this.A01);
            case 14:
            case 30:
            case 34:
            case 35:
                return this.A01;
            case Process.SIGTERM /* 15 */:
            case 21:
            case 31:
                return AbstractC25226BEj.A1C(this.A01);
            case 16:
            case 22:
            case 32:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 17:
                HDL hdl = (HDL) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(hdl.A0C);
                String string = hdl.requireArguments().getString("parent_media_id");
                List stringArrayList = hdl.requireArguments().getStringArrayList("initial_media_id_list");
                if (stringArrayList == null) {
                    stringArrayList = C16930sl.A00;
                }
                return new HHW(A0r, string, hdl.requireArguments().getString("next_max_id"), stringArrayList);
            case 18:
            case Process.SIGSTOP /* 19 */:
                C26830Bss c26830Bss = (C26830Bss) this.A01;
                FragmentActivity activity2 = c26830Bss.getActivity();
                if (activity2 != null && (user = c26830Bss.A00) != null && (A00 = AbstractC76433bn.A00(user)) != null) {
                    InterfaceC09390do interfaceC09390do = c26830Bss.A01;
                    C31368DqX A01 = AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), A00, AbstractC111324zv.A00(2830), AbstractC111324zv.A00(1157));
                    C140966Yy A0c = AbstractC25231BEo.A0c(activity2, interfaceC09390do);
                    A0c.A08();
                    C31368DqX.A02(A0c, AbstractC166987dD.A0r(interfaceC09390do), AbstractC31364DqT.A02(), A01);
                }
                return C0eB.A00;
            case 20:
                C26830Bss c26830Bss2 = (C26830Bss) this.A01;
                String str3 = ((C38333GtS) c26830Bss2.A02.getValue()).A03;
                if (str3 != null && (activity = c26830Bss2.getActivity()) != null) {
                    AbstractC12990ll A0o = AbstractC166987dD.A0o(c26830Bss2.A01);
                    C35028Fc1 A002 = C35028Fc1.A00(str3);
                    A002.A0E = AbstractC111324zv.A00(1157);
                    A002.A0N = true;
                    AbstractC31177DnL.A0o(activity, A002.A01(), A0o, "single_media_feed");
                }
                return C0eB.A00;
            case 23:
                return ((Fragment) this.A01).requireParentFragment();
            case 24:
                return Integer.valueOf(((C37994Gnf) this.A01).A00);
            case 25:
                return Integer.valueOf(((C37994Gnf) this.A01).A01);
            case 26:
                return Boolean.valueOf(this.A01 instanceof C40971v4);
            case 27:
                C45125Jxu c45125Jxu = (C45125Jxu) this.A01;
                boolean z = c45125Jxu.A02;
                EnumC71343Hv enumC71343Hv = EnumC71343Hv.A0H;
                if (z) {
                    ilz = new ILZ(enumC71343Hv);
                    ilz.A01 = (Integer) AbstractC25226BEj.A1C(((C37995Gng) c45125Jxu.A00).A02);
                } else {
                    ilz = new ILZ(enumC71343Hv);
                }
                return ilz.A00();
            case 28:
                return new C5LZ((UserSession) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new C115645La((UserSession) this.A01);
            case 33:
                KBN kbn = (KBN) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(kbn.A0E);
                String str4 = kbn.A0A;
                if (str4 == null) {
                    str = "userId";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return new C52280NBv(A0r2, str4);
            case 36:
                TifuViewModel tifuViewModel = (TifuViewModel) this.A01;
                AnonymousClass386 anonymousClass386 = tifuViewModel.A05;
                C4dV c4dV = tifuViewModel.A09;
                anonymousClass386.D42(c4dV, tifuViewModel.A0A);
                C0UO c0uo = tifuViewModel.A0G;
                C5Hc c5Hc = ((C132335yC) c0uo.getValue()).A06;
                int i = ((C132335yC) c0uo.getValue()).A00;
                C9C6 c9c6 = (C9C6) AbstractC001800i.A0O(c5Hc, i);
                Integer num = null;
                if (c9c6 != null) {
                    c38321qM = (C38321qM) c9c6.A00;
                } else {
                    c38321qM = null;
                }
                InterfaceC132105xl interfaceC132105xl = tifuViewModel.A06;
                String A0h = AbstractC37301Gc2.A0h(c38321qM);
                String str5 = c4dV.A06;
                if (c38321qM != null) {
                    str2 = AbstractC25226BEj.A1G(c38321qM);
                } else {
                    str2 = null;
                }
                String str6 = c4dV.A07;
                if (i < c5Hc.size()) {
                    num = Integer.valueOf(i);
                }
                interfaceC132105xl.CmH(num, A0h, str5, str2, str6, AbstractC123875j1.A00(tifuViewModel.A0E), c5Hc.size());
                return C0eB.A00;
            case 37:
                return new TifuApiHelper((UserSession) this.A01);
            case 38:
                return Integer.valueOf(((C25660BVw) this.A01).A00.A03());
            case 39:
                return AbstractC133095zb.A00((Iterable) this.A01);
            case 40:
                Iterator it6 = ((C6IF) ((LazyListState) this.A01).A02()).A0D.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        obj = it6.next();
                        if (((C137036Ig) ((InterfaceC137046Ii) obj)).A02 >= 0) {
                        }
                    } else {
                        obj = null;
                    }
                }
                InterfaceC137046Ii interfaceC137046Ii = (InterfaceC137046Ii) obj;
                int i2 = -1;
                if (interfaceC137046Ii != null) {
                    C137036Ig c137036Ig = (C137036Ig) interfaceC137046Ii;
                    if ((((C6IF) r2.A02()).A07 - c137036Ig.A02) / c137036Ig.A09 >= 0.99f) {
                        i2 = c137036Ig.A07;
                    }
                }
                return Integer.valueOf(i2);
            case Seq.NULL_REFNUM /* 41 */:
                C86803ts c86803ts = (C86803ts) this.A01;
                InterfaceC80023hr interfaceC80023hr = c86803ts.A03;
                C38321qM c38321qM2 = c86803ts.A00;
                str = "thumbnailMedia";
                if (c38321qM2 != null) {
                    interfaceC80023hr.DOY(c86803ts.A02, c38321qM2, c38321qM2, c86803ts.A05);
                    return C0eB.A00;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 43:
                return ((C692439k) this.A01).A04.A02.getValue();
            case 44:
                return new C80113i0(((IJZ) this.A01).A02);
            case 45:
                EnumC71343Hv enumC71343Hv2 = EnumC71343Hv.A0f;
                C75113Zb c75113Zb = (C75113Zb) this.A01;
                return AbstractC22726A0w.A00(enumC71343Hv2, c75113Zb, c75113Zb.A3e);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C80463ib c80463ib = (C80463ib) this.A01;
                if (c80463ib != null && C14360o3.A0K(c80463ib.A01, HLV.A00) && (interfaceC59502nt = c80463ib.A00) != null) {
                    interfaceC59502nt.cancel();
                }
                return C0eB.A00;
            case 47:
                if (((C26427BmA) this.A01).A00.A0Y()) {
                    return C4JD.A04;
                }
                return C4JD.A03;
            case 48:
                AbstractC86053sc.A03((C86073se) this.A01);
                return C0eB.A00;
            case 49:
                return ((C0UO) this.A01).getValue();
        }
    }
}
