package instagram.features.stories.fragment;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25231BEo;
import X.AbstractC25651Mw;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC31178DnM;
import X.AbstractC33235ElU;
import X.AbstractC50522MSa;
import X.AbstractC53242c7;
import X.AbstractC53625NnW;
import X.AbstractC55150OdD;
import X.AnonymousClass229;
import X.AnonymousClass773;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C183938Du;
import X.C1ON;
import X.C22C;
import X.C25531Mh;
import X.C25671My;
import X.C31335Dq0;
import X.C31722DwR;
import X.C34626FNj;
import X.C34965Fap;
import X.C34966Faq;
import X.C35473Fl9;
import X.C448124l;
import X.C50762MbT;
import X.C52772NXd;
import X.C52773NXe;
import X.C55536OlV;
import X.C56021Ots;
import X.C56023Otu;
import X.C56034Ou6;
import X.C5F6;
import X.C9GR;
import X.EPV;
import X.EnumC114925Hg;
import X.EnumC183928Dt;
import X.GHX;
import X.GYP;
import X.InterfaceC41501vz;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.InterfaceC60442pS;
import X.MSW;
import X.PI1;
import X.ViewOnClickListenerC55463OkI;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.instagram.actionbar.ActionButton;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.reels.InstagramShopLink;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelMultiProductLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes9.dex */
public class ReelMoreOptionsFragment extends AbstractC33235ElU implements InterfaceC60442pS, InterfaceC60122ou {
    public Intent A00;
    public C1ON A01;
    public UserSession A02;
    public ReelMoreOptionsModel A03;
    public ReelMoreOptionsModel A04;
    public AbstractC53625NnW A05;
    public AbstractC53625NnW A06;
    public C35473Fl9 A07;
    public GHX A08;
    public GHX A09;
    public GHX A0A;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public int A0N;
    public C34965Fap A0O;
    public C34965Fap A0P;
    public C31335Dq0 A0Q;
    public EPV A0R;
    public Boolean A0S;
    public Integer A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public Drawable mAddIconDrawable;
    public Drawable mInfoIconDrawable;
    public ActionButton mSaveButton;
    public final HashSet A0g = AbstractC166987dD.A1H();
    public Boolean A0B = null;
    public Integer A0C = C05F.A0C;
    public final TextView.OnEditorActionListener A0h = new C55536OlV(this, 5);
    public final GYP A0i = new PI1(this);
    public final View.OnClickListener A0b = new ViewOnClickListenerC55463OkI(this, 57);
    public final View.OnClickListener A0a = new ViewOnClickListenerC55463OkI(this, 58);
    public final View.OnClickListener A0d = new ViewOnClickListenerC55463OkI(this, 59);
    public final View.OnClickListener A0c = new ViewOnClickListenerC55463OkI(this, 60);
    public final View.OnClickListener A0Z = new ViewOnClickListenerC55463OkI(this, 61);
    public final View.OnClickListener A0Y = new ViewOnClickListenerC55463OkI(this, 62);
    public final InterfaceC41501vz A0e = C56034Ou6.A00(this, 41);
    public final InterfaceC41501vz A0f = C56034Ou6.A00(this, 42);

    public static void A02(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, GHX ghx, ReelMoreOptionsFragment reelMoreOptionsFragment, boolean z) {
        Drawable drawable;
        if (z) {
            drawable = null;
        } else {
            drawable = reelMoreOptionsFragment.mAddIconDrawable;
        }
        ghx.A02 = drawable;
        if (z) {
            onClickListener = null;
        }
        ghx.A04 = onClickListener;
        ghx.A06 = !z;
        if (reelMoreOptionsFragment.getContext() != null) {
            ghx.A00 = reelMoreOptionsFragment.getContext().getColor(AbstractC53242c7.A0C(reelMoreOptionsFragment.getContext()));
        }
        if (!z) {
            onClickListener2 = null;
        }
        ghx.A03 = onClickListener2;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_more_options";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    private C34965Fap A00(CharSequence charSequence) {
        C34965Fap c34965Fap = new C34965Fap(charSequence);
        c34965Fap.A01 = 8388627;
        c34965Fap.A05 = new C34626FNj(AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material), AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap), AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        c34965Fap.A00 = 1.33f;
        c34965Fap.A03 = R.style.ReelMoreOptionsFooter;
        return c34965Fap;
    }

    private void A03(EnumC183928Dt enumC183928Dt) {
        C183938Du c183938Du = new C183938Du(this.A03);
        c183938Du.A09 = enumC183928Dt;
        this.A03 = c183938Du.A01();
    }

    public static void A04(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        ReelMoreOptionsModel reelMoreOptionsModel = reelMoreOptionsFragment.A03;
        EnumC183928Dt enumC183928Dt = reelMoreOptionsModel.A09;
        String str = reelMoreOptionsModel.A0C;
        String str2 = reelMoreOptionsModel.A0B;
        String str3 = reelMoreOptionsModel.A0A;
        ProfileShopLink profileShopLink = reelMoreOptionsModel.A06;
        InstagramShopLink instagramShopLink = reelMoreOptionsModel.A03;
        ProductCollectionLink productCollectionLink = reelMoreOptionsModel.A04;
        ProductCollectionLink productCollectionLink2 = reelMoreOptionsModel.A05;
        ReelProductLink reelProductLink = reelMoreOptionsModel.A08;
        ReelMultiProductLink reelMultiProductLink = reelMoreOptionsModel.A07;
        BrandedContentGatingInfo brandedContentGatingInfo = reelMoreOptionsModel.A00;
        List list = reelMoreOptionsModel.A0D;
        BrandedContentProjectMetadata brandedContentProjectMetadata = reelMoreOptionsModel.A01;
        boolean z = reelMoreOptionsModel.A0E;
        boolean z2 = reelMoreOptionsModel.A0F;
        ReelMoreOptionsModel A00 = C183938Du.A00(brandedContentGatingInfo, brandedContentProjectMetadata, reelMoreOptionsModel.A02, instagramShopLink, productCollectionLink, productCollectionLink2, profileShopLink, reelMultiProductLink, reelProductLink, enumC183928Dt, str3, str2, str, list, z, z2, reelMoreOptionsFragment.A0F, reelMoreOptionsFragment.A0L);
        reelMoreOptionsFragment.A03 = A00;
        if (A00.A01()) {
            C9GR.A07(reelMoreOptionsFragment.getActivity(), 2131954561);
        }
        Intent intent = reelMoreOptionsFragment.A00;
        intent.getClass();
        intent.putExtra("MORE_OPTIONS_MODEL", reelMoreOptionsFragment.A03);
        reelMoreOptionsFragment.requireActivity().setResult(-1, reelMoreOptionsFragment.A00);
        if (AbstractC166987dD.A10(reelMoreOptionsFragment.A02).A2I()) {
            if (AbstractC31178DnM.A1X(C06090Tz.A05, reelMoreOptionsFragment.A02, 36321572054705780L)) {
                C22C A01 = AnonymousClass229.A01(reelMoreOptionsFragment.A02);
                boolean z3 = reelMoreOptionsFragment.A0F;
                C448124l c448124l = A01.A09;
                C25531Mh A0G = MSW.A0G(c448124l);
                EnumC114925Hg A0J = c448124l.A0J();
                if (AbstractC25226BEj.A1Z(A0G) && A0J != null) {
                    MSW.A1W(A0G);
                    AbstractC50522MSa.A1H(A0G, A0J, c448124l, "ADS_MODE_SETTINGS_SAVE");
                    A0G.A0O("ads_mode_boost_story_enabled", Boolean.valueOf(z3));
                    A0G.Cht();
                }
                if (reelMoreOptionsFragment.A0F) {
                    C448124l A0S = MSW.A0S(reelMoreOptionsFragment.A02);
                    C25531Mh A0G2 = MSW.A0G(A0S);
                    EnumC114925Hg A0J2 = A0S.A0J();
                    if (AbstractC25226BEj.A1Z(A0G2) && A0J2 != null) {
                        MSW.A1W(A0G2);
                        AbstractC50522MSa.A1H(A0G2, A0J2, A0S, "ADS_MODE_CAMERA_POST_CAPTURE_EDIT_SESSION_START");
                        A0G2.A0O("ads_mode_boost_story_enabled", AbstractC166997dE.A0b());
                        A0G2.Cht();
                    }
                }
            }
        }
        AbstractC25226BEj.A1Q(reelMoreOptionsFragment);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r0 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0A(instagram.features.stories.fragment.ReelMoreOptionsFragment r4) {
        /*
            com.instagram.actionbar.ActionButton r0 = r4.mSaveButton
            if (r0 == 0) goto L28
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r1 = r4.A03
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r4.A04
            boolean r0 = r1.equals(r0)
            r3 = 0
            if (r0 == 0) goto L1b
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r4.A03
            java.util.List r0 = r0.A0D
            if (r0 == 0) goto L29
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
        L1b:
            r2 = 1
        L1c:
            com.instagram.actionbar.ActionButton r1 = r4.mSaveButton
            boolean r0 = r4.A0M
            if (r0 != 0) goto L25
            if (r2 == 0) goto L25
            r3 = 1
        L25:
            r1.setEnabled(r3)
        L28:
            return
        L29:
            boolean r1 = r4.A0L
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r2 = r4.A03
            boolean r0 = r2.A0H
            if (r1 != r0) goto L1b
            boolean r1 = r4.A0E
            boolean r0 = r2.A0E
            if (r1 != r0) goto L1b
            boolean r0 = r4.A0I
            if (r0 == 0) goto L45
            X.Fl9 r0 = r4.A07
            java.lang.String r0 = r0.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1b
        L45:
            boolean r0 = r4.A0G
            if (r0 == 0) goto L50
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r0 = r4.A03
            java.lang.String r0 = r0.A0A
            if (r0 == 0) goto L50
            goto L1b
        L50:
            com.instagram.reels.fragment.model.ReelMoreOptionsModel r2 = r4.A03
            X.8Dt r1 = r2.A09
            if (r1 != 0) goto L58
            X.8Dt r1 = X.EnumC183928Dt.A08
        L58:
            X.8Dt r0 = X.EnumC183928Dt.A05
            if (r1 == r0) goto L1b
            boolean r0 = r2.A0F
            r2 = 0
            if (r0 == 0) goto L1c
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.stories.fragment.ReelMoreOptionsFragment.A0A(instagram.features.stories.fragment.ReelMoreOptionsFragment):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0216, code lost:
    
        if (r0 != null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0B(instagram.features.stories.fragment.ReelMoreOptionsFragment r10, java.lang.Integer r11) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.stories.fragment.ReelMoreOptionsFragment.A0B(instagram.features.stories.fragment.ReelMoreOptionsFragment, java.lang.Integer):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        ?? obj = new Object();
        obj.A02 = this.A0U;
        obj.A00 = R.drawable.instagram_arrow_back_24;
        ActionButton A00 = C31722DwR.A00(new ViewOnClickListenerC55463OkI(this, 55), interfaceC56362iU, obj);
        this.mSaveButton = A00;
        A00.setVisibility(0);
        AbstractC31176DnK.A1C(new ViewOnClickListenerC55463OkI(this, 56), AbstractC31176DnK.A0I(), interfaceC56362iU);
        A0A(this);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    private C34966Faq A01() {
        C34966Faq c34966Faq = new C34966Faq(new ViewOnClickListenerC55463OkI(this, 54), 2131952336);
        List A00 = this.A03.A00();
        String A002 = AbstractC55150OdD.A00(requireContext(), this.A03.A01, A00, this.A0L);
        c34966Faq.A03 = A002;
        if (A002.isEmpty()) {
            c34966Faq.A06 = true;
        }
        return c34966Faq;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa A[LOOP:0: B:25:0x00f4->B:27:0x00fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0107  */
    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.stories.fragment.ReelMoreOptionsFragment.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractC33235ElU, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2065898790);
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.getClass();
        onCreateView.setBackgroundColor(AbstractC53242c7.A00(requireContext()));
        C0f9.A09(-757928980, A02);
        return onCreateView;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(16813303);
        super.onDestroy();
        C25671My A00 = AbstractC25651Mw.A00(this.A02);
        A00.A02(this.A0e, C56021Ots.class);
        A00.A02(this.A0f, C56023Otu.class);
        C0f9.A09(2080074506, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(357770566);
        super.onDestroyView();
        ReelMoreOptionsFragmentLifecycleUtil.cleanupReferences(this);
        C22C A01 = AnonymousClass229.A01(this.A02);
        EnumC183928Dt enumC183928Dt = this.A03.A09;
        if (enumC183928Dt == null) {
            enumC183928Dt = EnumC183928Dt.A08;
        }
        A01.A20("reel_more_options", Integer.toString(enumC183928Dt.A00), this.A0X, this.A0D);
        C0f9.A09(226498598, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("saved_instance_state_more_options_model", this.A03);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        super.onViewCreated(view, bundle);
        this.A0Q = new C31335Dq0(getString(2131975046));
        Drawable drawable = requireContext().getDrawable(R.drawable.instagram_add_pano_outline_24);
        this.mAddIconDrawable = drawable;
        AbstractC25231BEo.A0x(requireContext(), drawable.mutate(), R.color.grey_5);
        Drawable drawable2 = requireContext().getDrawable(R.drawable.instagram_info_pano_outline_24);
        this.mInfoIconDrawable = drawable2;
        AbstractC25231BEo.A0x(requireContext(), drawable2.mutate(), R.color.grey_5);
        String string = getString(2131969913);
        boolean z = true;
        SpannableStringBuilder A08 = AbstractC31178DnM.A08(this, string, 2131954562);
        AnonymousClass773.A05(A08, new C50762MbT(this), string);
        this.A0P = A00(A08);
        GHX ghx = new GHX(getString(2131977039), getString(2131972329));
        this.A0A = ghx;
        A02(this.A0b, this.A0a, ghx, this, !TextUtils.isEmpty(this.A03.A0C));
        String string2 = getString(2131977038);
        String str = this.A03.A0C;
        if (str == null) {
            str = "";
        }
        this.A07 = new C35473Fl9(this.A0h, this.A0i, Integer.valueOf(Constants.LOAD_RESULT_WITH_VDEX_ODEX), string2, str, true);
        if (this.A0G) {
            if (getContext() != null) {
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC166997dE.A0r(getContext().getResources(), string, 2131953157));
                AnonymousClass773.A05(A0H, new C50762MbT(this), string);
                this.A0O = A00(A0H);
            }
            GHX ghx2 = new GHX(getString(2131953156), getString(2131972329));
            this.A08 = ghx2;
            A02(this.A0Z, this.A0Y, ghx2, this, AbstractC167007dF.A1W(this.A03.A0A));
            this.A05 = new C52773NXe(this.A02, this, this.A03.A0A);
        }
        if (this.A0H) {
            C5F6 B4r = AbstractC31174DnI.A0m(this.A02).B4r();
            B4r.getClass();
            this.A09 = new GHX(B4r.C0x(), getString(2131972329));
            String str2 = this.A0V;
            Integer num2 = this.A0T;
            num2.getClass();
            Boolean bool = this.A0S;
            bool.getClass();
            this.A06 = new C52772NXd(bool, num2, str2, this.A0W);
            GHX ghx3 = this.A09;
            View.OnClickListener onClickListener = this.A0d;
            View.OnClickListener onClickListener2 = this.A0c;
            EnumC183928Dt enumC183928Dt = this.A03.A09;
            if (enumC183928Dt == null) {
                enumC183928Dt = EnumC183928Dt.A08;
            }
            if (enumC183928Dt != EnumC183928Dt.A05) {
                z = false;
            }
            A02(onClickListener, onClickListener2, ghx3, this, z);
        }
        if (!TextUtils.isEmpty(this.A03.A0C)) {
            num = C05F.A00;
        } else {
            ReelMoreOptionsModel reelMoreOptionsModel = this.A03;
            if (reelMoreOptionsModel.A0A != null) {
                num = C05F.A0N;
            } else {
                EnumC183928Dt enumC183928Dt2 = reelMoreOptionsModel.A09;
                if (enumC183928Dt2 == null) {
                    enumC183928Dt2 = EnumC183928Dt.A08;
                }
                if (enumC183928Dt2 == EnumC183928Dt.A05) {
                    num = C05F.A01;
                } else {
                    num = C05F.A0C;
                }
            }
        }
        A0B(this, num);
        getScrollingViewProxy().EPJ(this.A0R);
        C22C A01 = AnonymousClass229.A01(this.A02);
        Boolean valueOf = Boolean.valueOf(this.A0K);
        C448124l c448124l = A01.A09;
        C25531Mh A0G = MSW.A0G(c448124l);
        EnumC114925Hg A0J = c448124l.A0J();
        if (AbstractC25226BEj.A1Z(A0G) && A0J != null) {
            MSW.A1W(A0G);
            AbstractC50522MSa.A1H(A0G, A0J, c448124l, "ADS_MODE_PARTNER_ADS_SETTINGS_SCREEN_SHOWN");
            A0G.A0O("ads_mode_boost_story_enabled", valueOf);
            A0G.Cht();
        }
    }
}
