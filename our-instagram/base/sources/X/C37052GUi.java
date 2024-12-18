package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.fragment.thread.threaddetail.customization.ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import java.util.Map;

/* renamed from: X.GUi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37052GUi extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37052GUi(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C37052GUi(obj, i));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r7v25, types: [X.GHa, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        InterfaceC83733oI interfaceC83733oI;
        C83693oE A02;
        String str;
        ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem;
        ELx eLx;
        E70 e70;
        C81613kW c81613kW;
        C81613kW Aic;
        C81613kW Aic2;
        C81613kW Aic3;
        switch (this.A00) {
            case 0:
                C34640FNx c34640FNx = (C34640FNx) this.A01;
                return AbstractC31175DnJ.A07(c34640FNx.A02, (ViewGroup) c34640FNx.A07.getValue(), R.layout.direct_persistent_menu_url_buttons_container, false);
            case 1:
                View A0E = AbstractC31173DnH.A0E(AbstractC31171DnF.A07(((C34640FNx) this.A01).A03, R.id.url_button_items), R.layout.direct_persistent_menu_url_buttons_root_container);
                C14360o3.A0C(A0E, "null cannot be cast to non-null type android.view.ViewGroup");
                return A0E;
            case 2:
                return C2JD.A00(((C48257LXg) this.A01).A04);
            case 3:
                return C137756Lx.A03.A01((UserSession) this.A01, EnumC132075xi.A0F);
            case 4:
                KDL kdl = (KDL) this.A01;
                return new C7G0(AbstractC166987dD.A0r(kdl.A05), ((DirectThreadKey) kdl.A06.getValue()).A00);
            case 5:
            case 14:
            case 27:
            case 31:
            case 35:
                return this.A01;
            case 6:
            case Process.SIGTERM /* 15 */:
            case 28:
            case 32:
            case 36:
                return AbstractC25226BEj.A1C(this.A01);
            case 7:
            case 16:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 33:
            case 37:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 8:
                return new C32560EVk(AbstractC166987dD.A0r(((KDL) this.A01).A05));
            case 9:
                return new C36268FzL((UserSession) this.A01);
            case 10:
                return new C163527Tp(AbstractC166987dD.A0r(((C32314ELd) this.A01).A17));
            case 11:
                C32314ELd c32314ELd = (C32314ELd) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c32314ELd.A17);
                InterfaceC83733oI interfaceC83733oI2 = c32314ELd.A0c;
                if (interfaceC83733oI2 == null) {
                    C14360o3.A0F("threadId");
                    throw C00O.createAndThrow();
                }
                return new EWM(A0r, null, AbstractC31171DnF.A0c(interfaceC83733oI2));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C36861nj A00 = AbstractC34103F3f.A00();
                C32314ELd c32314ELd2 = (C32314ELd) this.A01;
                Context requireContext = c32314ELd2.requireContext();
                c32314ELd2.A0N();
                A00.A00(requireContext, c32314ELd2, "all");
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C32314ELd c32314ELd3 = (C32314ELd) this.A01;
                C5G2 c5g2 = c32314ELd3.A0W;
                if (c5g2 != null) {
                    E70 e702 = c32314ELd3.A0Z;
                    if (e702 != null && (interfaceC83733oI = e702.A0L) != null && (A02 = AbstractC1345466e.A02(interfaceC83733oI)) != null && (str = A02.A00) != null) {
                        c5g2.A02.add(str);
                    }
                    c5g2.A01 = false;
                }
                return C0eB.A00;
            case 17:
                C32314ELd c32314ELd4 = (C32314ELd) this.A01;
                return new FKW(c32314ELd4, AbstractC166987dD.A0r(c32314ELd4.A17));
            case 18:
                return new C34507FIt(AbstractC166987dD.A0r(((C32328ELw) this.A01).A0I));
            case Process.SIGSTOP /* 19 */:
                return AbstractC31176DnK.A0V(((C32328ELw) this.A01).A0I);
            case 20:
                return AbstractC25235BEs.A0U(this.A01);
            case 21:
                return new C32557EVh(AbstractC166987dD.A0r(((C32328ELw) this.A01).A0I));
            case 22:
                ((InterfaceC74953Yl) this.A01).Egh(AbstractC166997dE.A0a());
                return C0eB.A00;
            case 23:
            case 24:
            case 25:
            case 26:
                AbstractC166987dD.A1Y(this.A01);
                return C0eB.A00;
            case 30:
                C26709Bqq c26709Bqq = (C26709Bqq) this.A01;
                UserSession A0r2 = AbstractC166987dD.A0r(c26709Bqq.A01);
                Parcelable parcelable = c26709Bqq.requireArguments().getParcelable(AbstractC43591JPw.A00(1311));
                if (parcelable instanceof ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem) {
                    threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem = (ThreadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem) parcelable;
                } else {
                    threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem = null;
                }
                return new C35766Fr3(A0r2, threadDetailCustomGroupNameAndImageViewModel$PickerItem$EmojiItem);
            case 34:
                EIL eil = (EIL) this.A01;
                InterfaceC09390do interfaceC09390do = eil.A02;
                UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                InterfaceC83733oI A002 = AbstractC35077Fco.A00(eil.requireArguments(), "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
                if (A002 != null) {
                    String A0Y = AbstractC31175DnJ.A0Y(eil.requireArguments(), "thread_title");
                    ImageUrl imageUrl = (ImageUrl) eil.requireArguments().getParcelable("thread_picture_image_url");
                    List parcelableArrayList = eil.requireArguments().getParcelableArrayList("members_picture_image_url");
                    if (parcelableArrayList == null) {
                        parcelableArrayList = C16930sl.A00;
                    }
                    return new C32580EWf(A0r3, imageUrl, new C34427FFr(AbstractC166987dD.A0r(interfaceC09390do)), A002, A0Y, parcelableArrayList, AbstractC167007dF.A1P(eil.requireArguments().getInt("DirectThreadDetailFragment.THREAD_SUBTYPE"), 47));
                }
                throw AbstractC31172DnG.A0t();
            case 38:
                return new C32561EVl(AbstractC166987dD.A0r(((KDN) this.A01).A01));
            case 39:
                return ((Fragment) this.A01).requireView().findViewById(R.id.change_nickname_edit_text);
            case 40:
                return AbstractC166997dE.A0S(((Fragment) this.A01).requireView(), R.id.nickname_text_count_down);
            case Seq.NULL_REFNUM /* 41 */:
                Fragment fragment = (Fragment) this.A01;
                C211739Zk c211739Zk = new C211739Zk(AbstractC166997dE.A0p(fragment.requireContext(), 2131959111), null);
                c211739Zk.A00 = 2131959119;
                c211739Zk.A01 = new G81(fragment, 4);
                c211739Zk.A02 = true;
                return c211739Zk;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new C32429EQh(((EQN) this.A01).A00);
            case 43:
                eLx = (ELx) this.A01;
                ELx.A00(eLx);
                return C0eB.A00;
            case 44:
                eLx = (ELx) this.A01;
                E70 e703 = eLx.A04;
                if (e703 != null) {
                    int i = 1 - e703.A02;
                    InterfaceC83733oI interfaceC83733oI3 = e703.A0L;
                    String str2 = e703.A0Q;
                    int i2 = e703.A0A;
                    int i3 = e703.A08;
                    String str3 = e703.A0P;
                    ImageUrl imageUrl2 = e703.A0C;
                    String str4 = e703.A0N;
                    boolean z = e703.A12;
                    boolean z2 = e703.A10;
                    boolean z3 = e703.A0w;
                    int i4 = e703.A04;
                    int i5 = e703.A0B;
                    boolean z4 = e703.A0v;
                    boolean z5 = e703.A0o;
                    boolean z6 = e703.A0q;
                    boolean z7 = e703.A0n;
                    boolean z8 = e703.A0u;
                    boolean z9 = e703.A0z;
                    boolean z10 = e703.A0i;
                    boolean z11 = e703.A0k;
                    boolean z12 = e703.A13;
                    boolean z13 = e703.A0s;
                    boolean z14 = e703.A0r;
                    boolean z15 = e703.A0e;
                    boolean z16 = e703.A0d;
                    boolean z17 = e703.A0y;
                    Map map = e703.A0X;
                    MessagingUser messagingUser = e703.A0F;
                    List list = e703.A0T;
                    List list2 = e703.A00;
                    List list3 = e703.A0S;
                    C32065E6r c32065E6r = e703.A0J;
                    List list4 = e703.A0R;
                    boolean z18 = e703.A0j;
                    String str5 = e703.A0O;
                    CreatorSubscriberThreadInfo creatorSubscriberThreadInfo = e703.A0G;
                    boolean z19 = e703.A0l;
                    boolean z20 = e703.A0p;
                    boolean z21 = e703.A0g;
                    boolean z22 = e703.A0x;
                    boolean z23 = e703.A0m;
                    InterfaceC83733oI interfaceC83733oI4 = e703.A0K;
                    int i6 = e703.A09;
                    C81543kP c81543kP = e703.A0E;
                    int i7 = e703.A07;
                    int i8 = e703.A06;
                    EnumC160877Iv enumC160877Iv = e703.A0I;
                    C1118752z c1118752z = e703.A0H;
                    boolean z24 = e703.A11;
                    Long l = e703.A0M;
                    boolean z25 = e703.A0h;
                    int i9 = e703.A01;
                    Map map2 = e703.A0U;
                    boolean z26 = e703.A0f;
                    boolean z27 = e703.A0t;
                    C81613kW c81613kW2 = e703.A0D;
                    int i10 = e703.A03;
                    int i11 = e703.A05;
                    Map map3 = e703.A0V;
                    Map map4 = e703.A0W;
                    AbstractC31179DnN.A1V(interfaceC83733oI3, messagingUser, list, list2);
                    AbstractC31179DnN.A1W(list3, c32065E6r, enumC160877Iv, c1118752z, map2);
                    e70 = new E70(imageUrl2, c81613kW2, c81543kP, messagingUser, creatorSubscriberThreadInfo, c1118752z, enumC160877Iv, c32065E6r, interfaceC83733oI3, interfaceC83733oI4, l, str2, str3, str4, str5, list, list2, list3, list4, map, map2, map3, map4, i2, i3, i4, i5, i6, i7, i8, i9, i, i10, i11, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27);
                } else {
                    e70 = null;
                }
                eLx.A04 = e70;
                ELx.A00(eLx);
                return C0eB.A00;
            case 45:
                G3M g3m = (G3M) this.A01;
                DirectThreadKey A01 = E70.A01(g3m.A06);
                C81663kb B3U = g3m.A05.B3U(A01);
                if (B3U != null) {
                    c81613kW = B3U.Aic();
                } else {
                    c81613kW = null;
                }
                boolean A022 = C161867Mw.A02(c81613kW);
                C35744Fqc c35744Fqc = new C35744Fqc(4, B3U, g3m, A01);
                InterfaceC190658cN interfaceC190658cN = g3m.A07;
                ?? obj = new Object();
                obj.A04 = 2131959083;
                obj.A01 = 2131959084;
                obj.A0D = A022;
                obj.A08 = c35744Fqc;
                obj.A09 = interfaceC190658cN;
                return obj;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                G3M g3m2 = (G3M) this.A01;
                return new GHY(g3m2.A00, new ViewOnClickListenerC35680FpF(g3m2, 23), "Bulk Send");
            case 47:
                G3M g3m3 = (G3M) this.A01;
                DirectThreadKey A012 = E70.A01(g3m3.A06);
                C81663kb B3U2 = g3m3.A05.B3U(A012);
                boolean z28 = true;
                if (B3U2 == null || (Aic = B3U2.Aic()) == null || Aic.A02 == 0) {
                    z28 = false;
                }
                return C36731GHa.A02(new C35744Fqc(5, B3U2, g3m3, A012), 2131959134, z28);
            case 48:
                G3M g3m4 = (G3M) this.A01;
                C81663kb B3U3 = g3m4.A05.B3U(E70.A01(g3m4.A06));
                boolean z29 = false;
                if (B3U3 != null && (Aic2 = B3U3.Aic()) != null && Aic2.A03 == C81613kW.A07) {
                    z29 = true;
                }
                return new C36731GHa(new C35745Fqd(g3m4, 16), g3m4.A08, 2131959151, z29);
            case 49:
                G3M g3m5 = (G3M) this.A01;
                C81663kb B3U4 = g3m5.A05.B3U(E70.A01(g3m5.A06));
                boolean z30 = false;
                if (B3U4 != null && (Aic3 = B3U4.Aic()) != null && Aic3.A03 == 1) {
                    z30 = true;
                }
                return new C36731GHa(new C35745Fqd(g3m5, 17), g3m5.A08, 2131959152, z30);
        }
    }
}
