package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;

/* renamed from: X.N5f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52131N5f extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "PanavisionCCPNuxBottomSheetFragment";
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public PrimerBottomSheetConfig A02;
    public CharSequence A03;
    public final CallerContext A04 = CallerContext.A01(__redex_internal_original_name);
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return isVisible();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(768359051);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.primer_bottom_sheet, viewGroup, false);
        C0f9.A09(-155579344, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int i;
        int i2;
        int A02 = C0f9.A02(1383165557);
        super.onResume();
        View view = this.mView;
        if (view != null) {
            C200108tF c200108tF = C200108tF.A01;
            InterfaceC09390do interfaceC09390do = this.A05;
            boolean A06 = C200108tF.A06(AbstractC166987dD.A0r(interfaceC09390do));
            boolean A0C = AbstractC46542Bs.A00(AbstractC166987dD.A0r(interfaceC09390do)).A0C();
            InfoItem infoItem = null;
            if (A06) {
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                CallerContext callerContext = this.A04;
                C14360o3.A06(callerContext);
                C51624MrH A01 = C200108tF.A01(callerContext, A0r);
                if (A01 != null) {
                    int ordinal = A01.A01.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 5) {
                                    i2 = 2131955634;
                                }
                            } else {
                                i2 = 2131955632;
                            }
                        } else {
                            i2 = 2131955633;
                        }
                    } else {
                        i2 = 2131955635;
                    }
                    infoItem = new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_facebook_circle_pano_outline_24), Integer.valueOf(R.color.igds_primary_text), AbstractC25227BEk.A0v(this, i2), null);
                }
            } else {
                if (A0C) {
                    i = 2131955630;
                } else if (c200108tF.A0F(AbstractC166987dD.A0r(interfaceC09390do))) {
                    UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                    C14360o3.A0B(A0r2, 0);
                    if (C196218mC.A00(A0r2) && !AbstractC46542Bs.A00(A0r2).A0C()) {
                        i = 2131955636;
                    }
                }
                infoItem = new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_facebook_circle_pano_outline_24), Integer.valueOf(R.color.igds_primary_text), AbstractC25227BEk.A0v(this, i), null);
            }
            TitleIcon titleIcon = new TitleIcon(new ColorTint(0, AbstractC53242c7.A0H(getContext(), R.attr.igds_color_gradient_red), AbstractC53242c7.A0H(getContext(), R.attr.igds_color_gradient_purple)), R.drawable.instagram_reels_outline_96);
            String A0v = AbstractC25227BEk.A0v(this, 2131955617);
            IconConfig.SimpleIconConfig simpleIconConfig = new IconConfig.SimpleIconConfig(R.drawable.instagram_music_pano_outline_24);
            Integer valueOf = Integer.valueOf(R.color.igds_primary_text);
            PrimerBottomSheetConfig primerBottomSheetConfig = new PrimerBottomSheetConfig(titleIcon, null, null, null, null, null, null, null, __redex_internal_original_name, AbstractC25227BEk.A0v(this, 2131968948), AbstractC25227BEk.A0v(this, 2131963271), null, AbstractC16960so.A1R(new InfoItem(simpleIconConfig, valueOf, A0v, null), AbstractC50523MSb.A0L(valueOf, AbstractC25227BEk.A0v(this, 2131955618), R.drawable.instagram_user_circle_pano_outline_24), AbstractC50523MSb.A0L(valueOf, AbstractC25227BEk.A0v(this, 2131955631), R.drawable.instagram_remix_pano_outline_24), infoItem), 2131955639, false, false, false);
            this.A02 = primerBottomSheetConfig;
            IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(view, R.id.headline);
            TitleIcon titleIcon2 = primerBottomSheetConfig.A01;
            if (titleIcon2 != null) {
                Context requireContext = requireContext();
                Drawable drawable = requireContext.getDrawable(titleIcon2.A00);
                Drawable drawable2 = drawable;
                if (drawable == null) {
                    drawable2 = null;
                } else {
                    ColorTint colorTint = titleIcon2.A01;
                    if (colorTint != null) {
                        if (colorTint.A02 == 0) {
                            drawable2 = C3LQ.A03(requireContext, drawable, requireContext.getColor(colorTint.A01), requireContext.getColor(colorTint.A00));
                        } else {
                            drawable2 = drawable;
                        }
                    }
                }
                igdsHeadline.setImageDrawable(drawable2);
            }
            igdsHeadline.setHeadline(2131955639);
            AbstractC31172DnG.A0G(view, R.id.info_list).setAdapter(new Jnp(null, null, primerBottomSheetConfig.A0D));
            IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AbstractC166997dE.A0R(view, R.id.primer_bottom_button);
            igdsBottomButtonLayout.setPrimaryActionText(primerBottomSheetConfig.A0B);
            igdsBottomButtonLayout.setPrimaryActionOnClickListener(this.A00);
            igdsBottomButtonLayout.setSecondaryActionText(primerBottomSheetConfig.A0C);
            igdsBottomButtonLayout.setSecondaryActionOnClickListener(this.A01);
            igdsBottomButtonLayout.setFooterAboveActionText(this.A03);
        }
        C0f9.A09(1795259151, A02);
    }
}
