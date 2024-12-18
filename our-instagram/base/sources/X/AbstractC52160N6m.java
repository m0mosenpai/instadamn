package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

/* renamed from: X.N6m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52160N6m extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "IGTVVideoCoverPickerInfoFragment";
    public int A00;
    public int A01;
    public FrameLayout A03;
    public ImageView A04;
    public SeekBar A05;
    public IgImageView A06;
    public C50743Max A07;
    public boolean A08;
    public View A09;
    public View A0A;
    public FrameLayout A0B;
    public final InterfaceC09390do A0C = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A0D = C57538PgC.A00(this, C57538PgC.A01(this, 34), new C57251PbZ(28, null, this), AbstractC25225BEi.A1D(IGTVUploadViewModel.class), 35);
    public int A02 = 1;

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0233  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC52160N6m.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void Dp1() {
        String str;
        View view = this.A09;
        if (view == null) {
            str = "leftCoverPhotoOverlay";
        } else {
            view.animate().alpha(1.0f).setDuration(200L);
            View view2 = this.A0A;
            if (view2 == null) {
                str = "rightCoverPhotoOverlay";
            } else {
                MSX.A0A(view2, 1.0f).setDuration(200L);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    public final void DoA() {
        Context requireContext = requireContext();
        String str = "addFromGalleryIcon";
        if (!this.A08) {
            FrameLayout frameLayout = this.A03;
            if (frameLayout != null) {
                frameLayout.setAlpha(1.0f);
                this.A08 = true;
                C50743Max c50743Max = this.A07;
                if (c50743Max != null) {
                    c50743Max.A09 = false;
                    ImageView imageView = this.A04;
                    if (imageView != null) {
                        imageView.setPressed(false);
                        AbstractC31173DnH.A11(requireContext, imageView, AbstractC53242c7.A0H(requireContext, R.attr.glyphColorPrimary));
                        AbstractC31173DnH.A0z(requireContext, imageView, R.drawable.add_from_gallery_selector);
                        FrameLayout frameLayout2 = this.A0B;
                        if (frameLayout2 == null) {
                            str = "addFromGalleryLayout";
                        } else {
                            frameLayout2.setBackground(null);
                        }
                    }
                } else {
                    str = "thumb";
                }
            } else {
                str = "frameContainer";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        ImageView imageView2 = this.A04;
        if (imageView2 != null) {
            AbstractC25231BEo.A0x(requireContext, imageView2.getBackground(), AbstractC53242c7.A08(requireContext));
            View view = this.A09;
            if (view == null) {
                str = "leftCoverPhotoOverlay";
            } else {
                view.animate().alpha(0.8f).setDuration(200L);
                View view2 = this.A0A;
                if (view2 == null) {
                    str = "rightCoverPhotoOverlay";
                } else {
                    MSX.A0A(view2, 0.8f).setDuration(200L);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(368772603);
        super.onCreate(bundle);
        requireArguments();
        this.A00 = AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.activation_card_icon_container_width);
        this.A01 = AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.audio_page_audio_filter_tooltip_vertical_offset);
        int A07 = AbstractC13880nE.A07(requireContext()) - (AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap) * 2);
        int A022 = MSW.A02(A07, this.A01);
        this.A02 = A022;
        this.A01 = A07 / A022;
        C0f9.A09(1853125744, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(215032928);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.cover_picker_tab_fragment, false);
        C0f9.A09(158756353, A02);
        return A0R;
    }
}
