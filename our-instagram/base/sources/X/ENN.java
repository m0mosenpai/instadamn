package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class ENN extends C38K implements InterfaceC60442pS, InterfaceC189488aT, C51D, InterfaceC60122ou, InterfaceC37295Gbw {
    public static final String __redex_internal_original_name = "PeopleTagListFragment";
    public C32403EPe A00;
    public C34469FHh A01;
    public User A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public List A08;
    public List A09;
    public boolean A0A;
    public boolean A0B;
    public C25671My A0D;
    public EnumC40111tc A0E;
    public Eg6 A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public boolean A0K;
    public int A0C = -2;
    public final InterfaceC09390do A0L = AbstractC60492pY.A02(this);
    public final C36155FxU A0M = new C36155FxU(this, 21);
    public final boolean A0O = true;
    public final C42106IlG A0N = new C42106IlG(4);

    @Override // X.InterfaceC43444JHi
    public final void A8F(User user) {
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC43445JHj
    public final void CvL(Product product) {
    }

    @Override // X.InterfaceC43444JHi
    public final void D7m(User user) {
    }

    @Override // X.InterfaceC43445JHj
    public final void D9a(Product product) {
    }

    @Override // X.InterfaceC43422JGm
    public final void D9b(ProductCollection productCollection) {
    }

    @Override // X.InterfaceC37183GZu
    public final void DFR(FBUserTag fBUserTag) {
    }

    @Override // X.InterfaceC37184GZv
    public final void DKa(User user, boolean z) {
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC37184GZv
    public final void Dew(User user) {
    }

    @Override // X.GYN
    public final void Ds5() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b6, code lost:
    
        if (X.AbstractC31175DnJ.A1X(r23, r0) == true) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e1  */
    @Override // X.InterfaceC37184GZv, X.InterfaceC37182GZt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dy8(com.instagram.user.model.User r23, int r24) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ENN.Dy8(com.instagram.user.model.User, int):void");
    }

    @Override // X.InterfaceC43444JHi
    public final void EDC(View view) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.InterfaceC43445JHj
    public final boolean Eja(Product product) {
        return false;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        String string = requireArguments().getString(DialogModule.KEY_TITLE);
        interfaceC56362iU.setTitle(string);
        if (string == null || string.length() == 0) {
            interfaceC56362iU.C95().setImportantForAccessibility(2);
        }
        if (!this.A0K) {
            interfaceC56362iU.EkS(true);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
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
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC05560Rg.A00(this);
        ((AbstractC05560Rg) this).A04.setAdapter((ListAdapter) this.A00);
        AbstractC05560Rg.A00(this);
        ((AbstractC05560Rg) this).A04.setDivider(null);
        Eg6 eg6 = this.A0F;
        if (eg6 == null) {
            C14360o3.A0F("itemImpressionLogger");
            throw C00O.createAndThrow();
        }
        AbstractC05560Rg.A00(this);
        ListView listView = ((AbstractC05560Rg) this).A04;
        ListView listView2 = eg6.A00;
        if (listView2 != null) {
            listView2.setOnScrollListener(null);
            eg6.A00 = null;
        }
        eg6.A00 = listView;
        listView.setOnScrollListener(eg6);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return AbstractC166987dD.A0o(this.A0L);
    }

    @Override // X.InterfaceC37182GZt
    public final void DDE(Context context, User user, String str, int i) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setType("text/plain");
        intent.addFlags(268435456);
        intent.setData(AbstractC08820cl.A01(this.A0N, "mailto:rubyzhang@meta.com"));
        C12260kU.A0E(context, intent);
    }

    @Override // X.InterfaceC37183GZu
    public final void DFQ(FBUserTag fBUserTag) {
        String str;
        String str2 = this.A0H;
        List list = this.A08;
        if (str2 != null && str2.length() != 0 && list != null && !list.isEmpty()) {
            ArrayList A1E = AbstractC166987dD.A1E();
            List list2 = this.A09;
            if (list2 != null && !list2.isEmpty()) {
                A1E.addAll(list2);
            }
            A1E.addAll(list);
            AnonymousClass426 anonymousClass426 = AnonymousClass426.A00;
            UserSession A0r = AbstractC166987dD.A0r(this.A0L);
            String str3 = this.A07;
            if (str3 == null) {
                str = "mediaId";
            } else {
                String str4 = this.A0G;
                if (str4 == null) {
                    str = "bottomsheetEntryPoint";
                } else {
                    anonymousClass426.A05(A0r, fBUserTag, str3, str2, str4, A1E);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(AbstractC111324zv.A00(3204), this.A0I);
        C14360o3.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return this.A0C;
    }

    @Override // X.InterfaceC37183GZu
    public final FragmentActivity B8O() {
        return getActivity();
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7, reason: merged with bridge method [inline-methods] */
    public final float Cpk() {
        return Math.min(1.0f, (AbstractC13880nE.A09(requireContext()) * 0.8f) / requireView().getHeight());
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return this.A0O;
    }

    @Override // X.InterfaceC37182GZt
    public final void DT2(User user, int i) {
        C36881nl A01 = C36881nl.A01(requireActivity(), this, AbstractC166987dD.A0r(this.A0L), "direct_thread");
        AbstractC31179DnN.A1Q(A01, user);
        A01.A06();
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        ListView A0W = A0W();
        if (A0W != null && A0W.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        ArrayList parcelableArrayList;
        String str3;
        String str4;
        BottomSheetFragment bottomSheetFragment;
        String str5;
        JM3 Arn;
        String AdL;
        JM3 Arn2;
        String AdD;
        User A2C;
        int A02 = C0f9.A02(-1372827899);
        super.onCreate(bundle);
        this.A0J = requireArguments().getString("shopping_session_id");
        this.A07 = AbstractC31173DnH.A0j(requireArguments(), "media_id");
        Serializable serializable = requireArguments().getSerializable("media_type");
        C14360o3.A0C(serializable, MSV.A00(531));
        serializable.getClass();
        this.A0E = (EnumC40111tc) serializable;
        this.A0I = requireArguments().getString("prior_module");
        this.A0K = requireArguments().getBoolean("is_launched_as_bottom_sheet", true);
        this.A03 = requireArguments().getString(MSV.A00(29));
        this.A0H = requireArguments().getString(MSV.A00(186), "");
        this.A0G = requireArguments().getString(MSV.A00(185), "");
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        InterfaceC09390do interfaceC09390do = this.A0L;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String str6 = this.A07;
        if (str6 == null) {
            str3 = "mediaId";
        } else {
            EnumC40111tc enumC40111tc = this.A0E;
            if (enumC40111tc == null) {
                str3 = "mediaType";
            } else {
                this.A0F = new Eg6(this, A0r, enumC40111tc, str6);
                this.A0A = requireArguments().getBoolean(MSV.A00(486), false);
                this.A0B = requireArguments().getBoolean(AbstractC111324zv.A00(4742), false);
                C1DX A0Z = AbstractC31176DnK.A0Z(interfaceC09390do);
                String str7 = this.A07;
                if (str7 != null) {
                    C38321qM A022 = A0Z.A02(str7);
                    if (A022 != null && (A2C = A022.A2C()) != null) {
                        this.A06 = A2C.getId();
                    }
                    C1DX A0Z2 = AbstractC31176DnK.A0Z(interfaceC09390do);
                    String str8 = this.A07;
                    if (str8 != null) {
                        C38321qM A023 = A0Z2.A02(str8);
                        if (A023 != null && (Arn2 = A023.A0C.Arn()) != null && (AdD = Arn2.AdD()) != null) {
                            this.A04 = AdD;
                        }
                        C1DX A0Z3 = AbstractC31176DnK.A0Z(interfaceC09390do);
                        String str9 = this.A07;
                        if (str9 != null) {
                            C38321qM A024 = A0Z3.A02(str9);
                            if (A024 != null && (Arn = A024.A0C.Arn()) != null && (AdL = Arn.AdL()) != null) {
                                this.A05 = AdL;
                            }
                            Context requireContext = requireContext();
                            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                            Integer num = C05F.A00;
                            boolean z = requireArguments().getBoolean(MSV.A00(1606), true);
                            String str10 = this.A06;
                            String str11 = this.A07;
                            str = "mediaId";
                            C189478aR c189478aR = null;
                            if (str11 != null) {
                                String str12 = this.A03;
                                String str13 = this.A04;
                                String str14 = this.A05;
                                Bundle bundle2 = this.mArguments;
                                if (bundle2 != null) {
                                    str2 = bundle2.getString(AbstractC43591JPw.A00(49));
                                } else {
                                    str2 = null;
                                }
                                C32403EPe c32403EPe = new C32403EPe(requireContext, this, A0r2, this, num, str10, str11, str12, str13, str14, str2, z, true, false, false);
                                boolean z2 = requireArguments().getBoolean(AbstractC111324zv.A00(3101));
                                if (c32403EPe.A09 != z2) {
                                    c32403EPe.A09 = z2;
                                }
                                ArrayList parcelableArrayList2 = requireArguments().getParcelableArrayList(MSV.A00(121));
                                this.A09 = parcelableArrayList2;
                                if (parcelableArrayList2 != null && !parcelableArrayList2.isEmpty()) {
                                    C1ON A04 = AbstractC151506rw.A04(AbstractC166987dD.A0r(interfaceC09390do), parcelableArrayList2, 0L, true, false);
                                    C31714DwJ.A00(A04, c32403EPe, 5);
                                    schedule(A04);
                                    c32403EPe.A0E(parcelableArrayList2);
                                }
                                if (this.A0A) {
                                    C23031Ai A0l = AbstractC25230BEn.A0l(interfaceC09390do);
                                    if (!AbstractC167017dG.A1b(A0l, A0l.A0k, C23031Ai.A8c, 95)) {
                                        if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36326309403572032L)) {
                                            C38801rC c38801rC = C38321qM.A0h;
                                            String str15 = this.A07;
                                            if (str15 != null) {
                                                Long A0j = AbstractC25231BEo.A0j(0, C38801rC.A06(str15));
                                                c32403EPe.A07 = true;
                                                c32403EPe.A01 = new FLM(this, c32403EPe, A0j);
                                                if (A0j != null) {
                                                    AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
                                                    if (this.A0B) {
                                                        str5 = "collaborators_bottomsheet_reels";
                                                    } else {
                                                        str5 = "collaborators_bottomsheet_feed";
                                                    }
                                                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(this, A0o, 0), "ig_collaborator_bottom_sheet_education_banner_impression");
                                                    if (A0f.isSampled()) {
                                                        A0f.A9K("media_id", A0j);
                                                        A0f.AAP("entrypoint", str5);
                                                        A0f.Cht();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int i2 = Build.VERSION.SDK_INT;
                                String A00 = MSV.A00(588);
                                Bundle requireArguments = requireArguments();
                                if (i2 >= 33) {
                                    parcelableArrayList = requireArguments.getParcelableArrayList(A00, FBUserTag.class);
                                } else {
                                    parcelableArrayList = requireArguments.getParcelableArrayList(A00);
                                }
                                this.A08 = parcelableArrayList;
                                List list = c32403EPe.A0I;
                                list.clear();
                                if (parcelableArrayList != null) {
                                    list.addAll(parcelableArrayList);
                                }
                                c32403EPe.A0C();
                                this.A00 = c32403EPe;
                                if (this.A0A) {
                                    if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36326309403703105L)) {
                                        Fragment fragment = this.mParentFragment;
                                        if ((fragment instanceof BottomSheetFragment) && (bottomSheetFragment = (BottomSheetFragment) fragment) != null) {
                                            c189478aR = bottomSheetFragment.A02;
                                        }
                                        C38801rC c38801rC2 = C38321qM.A0h;
                                        String str16 = this.A07;
                                        if (str16 != null) {
                                            Long A0j2 = AbstractC25231BEo.A0j(0, C38801rC.A06(str16));
                                            if (c189478aR != null) {
                                                c189478aR.A0K(new C189458aP(new ViewOnClickListenerC35684FpJ(57, c189478aR, this, A0j2), null, "", R.drawable.instagram_info_pano_outline_24, 0).A00(), true);
                                            }
                                            if (A0j2 != null) {
                                                AbstractC12990ll A0o2 = AbstractC166987dD.A0o(interfaceC09390do);
                                                if (this.A0B) {
                                                    str4 = "collaborators_bottomsheet_reels";
                                                } else {
                                                    str4 = "collaborators_bottomsheet_feed";
                                                }
                                                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(this, A0o2, 0), "ig_collaborator_bottom_sheet_education_info_button_impression");
                                                if (A0f2.isSampled()) {
                                                    A0f2.A9K("media_id", A0j2);
                                                    A0f2.AAP("entrypoint", str4);
                                                    A0f2.Cht();
                                                }
                                            }
                                        }
                                    }
                                }
                                C25671My A0Q = AbstractC31176DnK.A0Q(interfaceC09390do);
                                this.A0D = A0Q;
                                if (A0Q == null) {
                                    str3 = "igEventBus";
                                } else {
                                    A0Q.A01(this.A0M, C3MC.class);
                                    C60752pz c60752pz = ((C38K) this).A03;
                                    if (c60752pz.A00 == null) {
                                        c60752pz.A00 = "tags_list";
                                    }
                                    C0f9.A09(-931815926, A02);
                                    return;
                                }
                            }
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                    }
                }
                str = "mediaId";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-927443018);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.tag_list, viewGroup, false);
        C0f9.A09(648489333, A02);
        return inflate;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-426930072);
        super.onDestroy();
        C25671My c25671My = this.A0D;
        if (c25671My == null) {
            C14360o3.A0F("igEventBus");
            throw C00O.createAndThrow();
        }
        c25671My.A02(this.A0M, C3MC.class);
        C0f9.A09(-91006159, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1968603500);
        super.onDestroyView();
        Eg6 eg6 = this.A0F;
        if (eg6 == null) {
            C14360o3.A0F("itemImpressionLogger");
            throw C00O.createAndThrow();
        }
        ListView listView = eg6.A00;
        if (listView != null) {
            listView.setOnScrollListener(null);
            eg6.A00 = null;
        }
        C0f9.A09(-1808126961, A02);
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1694016676);
        super.onResume();
        C32403EPe c32403EPe = this.A00;
        if (c32403EPe != null) {
            C0fA.A00(c32403EPe, 944304796);
        }
        C0f9.A09(1994515606, A02);
    }
}
