package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* loaded from: classes8.dex */
public final class KCW extends AbstractC59962oe implements InterfaceC60072op, InterfaceC189488aT, InterfaceC50436MOq {
    public static final String __redex_internal_original_name = "DirectStickerTrayFragment";
    public int A00;
    public int A01;
    public MRR A02;
    public EnumC46186KcO A03;
    public C3DN A04;
    public String A05;
    public ViewGroup A06;
    public C7IK A07;
    public C47765L7l A08;
    public C36302Fzx A09;
    public DirectThreadKey A0A;
    public String A0B;
    public List A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final C06N A0H = new JZQ(this, 0);
    public final InterfaceC09390do A0G = AbstractC60492pY.A02(this);
    public final String A0I = "direct_sticker_tray_fragment";
    public final boolean A0K = true;
    public final boolean A0J = true;

    @Override // X.InterfaceC50436MOq
    public final void ADq(C7IK c7ik) {
        C14360o3.A0B(c7ik, 0);
        this.A07 = c7ik;
        A02();
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -1;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 0.8f;
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        AbstractC226039yM.A00(context, AbstractC166987dD.A0r(this.A0G));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttachFragment(Fragment fragment) {
        FragmentActivity activity;
        Resources.Theme theme;
        C14360o3.A0B(fragment, 0);
        C7IK c7ik = this.A07;
        if (c7ik != null && (fragment instanceof InterfaceC50436MOq)) {
            ((InterfaceC50436MOq) fragment).ADq(c7ik);
        }
        if (fragment instanceof C45499KCo) {
            ((C45499KCo) fragment).A07 = new C47326Kvb(this);
            return;
        }
        if (fragment instanceof C45446KAh) {
            ((C45446KAh) fragment).A00 = new C48660Lfn(this);
            return;
        }
        if (fragment instanceof C45493KCi) {
            ((C45493KCi) fragment).A01 = new C47327Kvc(this);
            return;
        }
        if (!(fragment instanceof C52166N6v)) {
            return;
        }
        if (!C1H6.A03() && (activity = getActivity()) != null && (theme = activity.getTheme()) != null) {
            theme.applyStyle(R.style.MusicCreationLightOverlayTheme, true);
        }
        ((C52166N6v) fragment).A05 = new C49523Luc(this, 3);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        this.A06 = AbstractC31173DnH.A0F(view, R.id.direct_sticker_tray_root_container);
        boolean z = requireArguments.getBoolean("param_extra_should_hide_drag_handler", false);
        View A0S = AbstractC166997dE.A0S(view, R.id.drag_handle);
        if (z) {
            A0S.setVisibility(8);
        } else if (AbstractC56862jK.A00(requireContext())) {
            ViewOnClickListenerC48072LPx.A01(A0S, 24, this);
            AbstractC56932jR.A06(A0S, 500L);
            AbstractC166997dE.A18(requireContext(), A0S, 2131956237);
        }
        this.A0E = requireArguments.getBoolean("param_extra_avatar_enabled", false);
        this.A0F = requireArguments.getBoolean("param_extra_is_msys_thread", false);
        this.A0C = requireArguments.getStringArrayList("param_extra_social_stickers_user_ids");
        EnumC46186KcO enumC46186KcO = EnumC46186KcO.values()[requireArguments.getInt("param_extra_entry_point", 0)];
        this.A03 = enumC46186KcO;
        if (enumC46186KcO == null) {
            C14360o3.A0F("entryPoint");
            throw C00O.createAndThrow();
        }
        if (enumC46186KcO == EnumC46186KcO.A02) {
            this.A05 = requireArguments.getString("param_extra_bottom_sheet_session_id", "");
            A05(this, "");
        } else {
            A04(this);
        }
        A02();
        ViewGroup viewGroup = this.A06;
        if (viewGroup != null) {
            this.A08 = new C47765L7l(requireContext(), viewGroup);
        }
        getChildFragmentManager().A0r(this.A0H);
    }

    public static final MQw A01(Fragment fragment) {
        boolean z = fragment instanceof MQw;
        Object obj = fragment;
        if (!z) {
            if (fragment instanceof C51D) {
                obj = new C48776Lhj(fragment);
            } else {
                return null;
            }
        }
        return (MQw) obj;
    }

    private final void A02() {
        InterfaceC50436MOq interfaceC50436MOq;
        ViewGroup viewGroup;
        Drawable background;
        C7IK c7ik = this.A07;
        if (c7ik != null && this.mView != null && (viewGroup = this.A06) != null && (background = viewGroup.getBackground()) != null) {
            background.setColorFilter(c7ik.A09, PorterDuff.Mode.SRC);
        }
        if (getContext() != null) {
            InterfaceC08430c6 A0O = getChildFragmentManager().A0O(R.id.fragment_container);
            if ((A0O instanceof InterfaceC50436MOq) && (interfaceC50436MOq = (InterfaceC50436MOq) A0O) != null) {
                interfaceC50436MOq.ADq(this.A07);
            }
        }
    }

    public static final void A03(AvatarCoinFlipConfig avatarCoinFlipConfig, KCW kcw) {
        EIQ A00 = AbstractC33777Ew3.A00(avatarCoinFlipConfig, "ig_direct_thread", C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(kcw.A0G), 36322285019277419L));
        kcw.A0D = true;
        C3DN c3dn = kcw.A04;
        if (c3dn != null) {
            c3dn.A0U(C05F.A04);
        }
        C14240no A0F = AbstractC43593JPy.A0F(kcw);
        A0F.A0I(null);
        AbstractC43593JPy.A1D(A00, A0F);
        kcw.A0D = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d5, code lost:
    
        if (r2 == X.EnumC46186KcO.A0B) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e1, code lost:
    
        if (r2 == X.EnumC46186KcO.A0B) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x009f, code lost:
    
        if (r5 == X.EnumC46186KcO.A06) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.KCW r47) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KCW.A04(X.KCW):void");
    }

    public static final void A05(KCW kcw, String str) {
        String str2;
        InterfaceC09390do interfaceC09390do = kcw.A0G;
        if (AbstractC46801Kmw.A00(AbstractC166987dD.A0r(interfaceC09390do))) {
            MRR mrr = kcw.A02;
            if (mrr != null) {
                mrr.Ekm();
                return;
            }
            return;
        }
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        L6D l6d = new L6D(kcw);
        EnumC46186KcO enumC46186KcO = kcw.A03;
        if (enumC46186KcO == null) {
            str2 = "entryPoint";
        } else {
            String str3 = kcw.A05;
            if (str3 == null) {
                str2 = "bottomSheetSessionId";
            } else {
                Bundle A0C = AbstractC31177DnL.A0C(A0r);
                KCS kcs = new KCS();
                AbstractC31173DnH.A1C(A0C, A0r);
                A0C.putString("param_extra_initial_search_term", str);
                A0C.putString("param_extra_bottom_sheet_session_id", str3);
                A0C.putString("param_extra_entry_point", enumC46186KcO.toString());
                kcs.setArguments(A0C);
                kcs.A07 = l6d;
                Integer num = C05F.A0j;
                LJM.A00(EnumC46271Ke3.AI_STICKER, AbstractC31171DnF.A0D(KCS.__redex_internal_original_name), A0r, null, null, num, C05F.A00, null, null, str3);
                C14240no A0F = AbstractC43593JPy.A0F(kcw);
                A0F.A0I(null);
                AbstractC43593JPy.A1D(kcs, A0F);
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
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
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return this.A0J;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        if (!this.A0D) {
            return 1.0f;
        }
        return 0.65f;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0I;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0G);
    }

    @Override // X.AbstractC59962oe
    public final boolean isContainerFragment() {
        return this.A0K;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        MQw A01 = A01(A00());
        if (A01 != null) {
            A01.onBottomSheetPositionChanged(i, i2);
        }
        C47765L7l c47765L7l = this.A08;
        if (c47765L7l == null) {
            C14360o3.A0F("roundedCornerHelper");
            throw C00O.createAndThrow();
        }
        c47765L7l.A00(i);
    }

    private final Fragment A00() {
        if (isAdded()) {
            return getChildFragmentManager().A0O(R.id.fragment_container);
        }
        return null;
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 0.8f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
        MQw A01 = A01(A00());
        if (A01 != null) {
            A01.DOM();
        }
        this.A00 = 0;
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
        MQw A01 = A01(A00());
        if (A01 != null) {
            A01.DON(i);
        }
        C3DN c3dn = this.A04;
        if (c3dn != null) {
            c3dn.A0U(C05F.A04);
        }
        this.A00 = i;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        MQw A01 = A01(A00());
        if (A01 != null) {
            return A01.isScrolledToTop();
        }
        return true;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Fragment A00;
        super.onActivityResult(i, i2, intent);
        if (getContext() != null && (A00 = A00()) != null) {
            A00.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        InterfaceC08430c6 A00 = A00();
        if ((A00 instanceof InterfaceC60072op) && ((InterfaceC60072op) A00).onBackPressed()) {
            return true;
        }
        if (A00 instanceof C45499KCo) {
            C45499KCo c45499KCo = (C45499KCo) A00;
            MSU msu = c45499KCo.A0C;
            if (msu != null) {
                str = ((C49639LwW) msu).A02;
            } else {
                str = null;
            }
            if ("stickers".equals(str)) {
                InterfaceC08430c6 interfaceC08430c6 = c45499KCo.A04;
                if ((interfaceC08430c6 instanceof InterfaceC60072op) && ((InterfaceC60072op) interfaceC08430c6).onBackPressed()) {
                    return true;
                }
            }
        }
        if (getChildFragmentManager().A0L() > 0) {
            getChildFragmentManager().A0b();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
        C45499KCo c45499KCo;
        MSU msu;
        Fragment A00 = A00();
        if ((A00 instanceof C45499KCo) && (c45499KCo = (C45499KCo) A00) != null && (msu = c45499KCo.A0C) != null) {
            String str = ((C49639LwW) msu).A02;
            InterfaceC19610xo ARD = new C47328Kvd(C1AT.A01(AbstractC166987dD.A0r(this.A0G))).A00.ARD();
            ARD.E7K("last_used_sticker_tab", str);
            ARD.apply();
        }
        MRR mrr = this.A02;
        if (mrr != null) {
            mrr.Dvf();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-362236174);
        super.onCreate(bundle);
        this.A04 = AbstractC25230BEn.A0m(this);
        AbstractC12990ll A0M = AbstractC31178DnM.A0M(this.A0G);
        this.A09 = (C36302Fzx) A0M.A01(C36302Fzx.class, new C50152MDf(A0M, 19));
        C0f9.A09(-998890101, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-528768750);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_direct_sticker_tray, false);
        C0f9.A09(-732933243, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(27460493);
        super.onDestroy();
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        childFragmentManager.A0F.remove(this.A0H);
        C0f9.A09(866773520, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1653033494);
        super.onDestroyView();
        this.A06 = null;
        C0f9.A09(960143085, A02);
    }
}
