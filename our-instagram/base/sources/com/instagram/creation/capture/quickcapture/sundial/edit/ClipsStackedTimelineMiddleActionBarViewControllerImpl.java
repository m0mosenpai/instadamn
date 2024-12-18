package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.AbstractC001900j;
import X.AbstractC003100w;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC185558Kx;
import X.AbstractC187378Sf;
import X.AbstractC25228BEl;
import X.AbstractC25235BEs;
import X.AbstractC31172DnG;
import X.AbstractC53242c7;
import X.AbstractC55200OeA;
import X.AbstractC56952jT;
import X.AbstractC59962oe;
import X.C00O;
import X.C0fQ;
import X.C14360o3;
import X.C187358Sd;
import X.C50868Mdz;
import X.C56302iJ;
import X.C8TF;
import X.DHO;
import X.EnumC189218Zt;
import X.InterfaceC19390xP;
import X.InterfaceC58284Psc;
import X.MSW;
import X.MSX;
import X.MSY;
import X.MY0;
import X.ViewOnClickListenerC55460OkF;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.music.common.ui.LoadingSpinnerView;
import java.text.DecimalFormat;
import java.util.List;

/* loaded from: classes9.dex */
public final class ClipsStackedTimelineMiddleActionBarViewControllerImpl implements InterfaceC58284Psc {
    public final AbstractC59962oe A00;
    public final C187358Sd A01;
    public final C50868Mdz A02;
    public IgImageView loadingSpinnerBackground;
    public LoadingSpinnerView loadingSpinnerView;
    public IgSimpleImageView playButton;
    public IgSimpleImageView redoButton;
    public LoadingSpinnerView scrollingAudioLoadingSpinnerView;
    public TextView timeStampTextView;
    public IgSimpleImageView undoButton;

    private final String A00(String str) {
        int i;
        int i2;
        Context requireContext;
        int i3;
        Object[] objArr;
        Integer valueOf;
        Integer A0i;
        Integer A0i2;
        int i4;
        Integer A0i3;
        Integer A0i4;
        List A0m = AbstractC167007dF.A0m(str, ":", 0);
        if (A0m.size() == 2) {
            String A14 = MSW.A14(A0m, 0);
            if (A14 != null && (A0i4 = AbstractC003100w.A0i(A14)) != null) {
                i4 = A0i4.intValue();
            } else {
                i4 = 0;
            }
            String A142 = MSW.A14(A0m, 1);
            if (A142 != null && (A0i3 = AbstractC003100w.A0i(A142)) != null) {
                i = A0i3.intValue();
            } else {
                i = 0;
            }
            if (i4 > 0) {
                requireContext = this.A00.requireContext();
                i3 = 2131955914;
                objArr = new Object[2];
                AbstractC25235BEs.A1R(objArr, i4, 0);
                valueOf = Integer.valueOf(i);
                objArr[1] = valueOf;
            }
            requireContext = this.A00.requireContext();
            i3 = 2131955915;
            objArr = AbstractC25228BEl.A1Y(i);
        } else {
            List A0m2 = AbstractC167007dF.A0m(str, ".", 0);
            String A143 = MSW.A14(A0m2, 0);
            if (A143 != null && (A0i2 = AbstractC003100w.A0i(A143)) != null) {
                i = A0i2.intValue();
            } else {
                i = 0;
            }
            if (A0m2.size() == 2) {
                String A144 = MSW.A14(A0m2, 1);
                if (A144 != null && (A0i = AbstractC003100w.A0i(A144)) != null) {
                    i2 = A0i.intValue();
                } else {
                    i2 = 0;
                }
                requireContext = this.A00.requireContext();
                i3 = 2131955913;
                objArr = new Object[2];
                AbstractC25235BEs.A1R(objArr, i, 0);
                valueOf = Integer.valueOf(i2);
                objArr[1] = valueOf;
            }
            requireContext = this.A00.requireContext();
            i3 = 2131955915;
            objArr = AbstractC25228BEl.A1Y(i);
        }
        return requireContext.getString(i3, objArr);
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC58284Psc
    public final void Cnq(int i) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC58284Psc
    public final void DuY(int i) {
    }

    @Override // X.InterfaceC58284Psc
    public final InterfaceC19390xP Dut() {
        return null;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        C56302iJ c56302iJ;
        Object obj;
        C14360o3.A0B(view, 0);
        C56302iJ c56302iJ2 = null;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            TextView A0T = AbstractC166997dE.A0T(viewGroup, R.id.play_time_stamp);
            C14360o3.A0B(A0T, 0);
            this.timeStampTextView = A0T;
            IgSimpleImageView A0I = MSX.A0I(viewGroup, R.id.play_button);
            C14360o3.A0B(A0I, 0);
            this.playButton = A0I;
            ADl(EnumC189218Zt.A04);
            AbstractC56952jT.A01(A04());
            IgSimpleImageView A0I2 = MSX.A0I(viewGroup, R.id.stacked_timeline_undo_button);
            this.undoButton = A0I2;
            if (A0I2 != null) {
                A0I2.setImageResource(R.drawable.instagram_undo_pano_filled_24);
            }
            IgSimpleImageView igSimpleImageView = this.undoButton;
            if (igSimpleImageView != null) {
                ViewOnClickListenerC55460OkF.A00(igSimpleImageView, 0, this);
            }
            IgSimpleImageView A0I3 = MSX.A0I(viewGroup, R.id.stacked_timeline_redo_button);
            this.redoButton = A0I3;
            if (A0I3 != null) {
                A0I3.setImageResource(R.drawable.instagram_redo_pano_filled_24);
            }
            IgSimpleImageView igSimpleImageView2 = this.redoButton;
            if (igSimpleImageView2 != null) {
                ViewOnClickListenerC55460OkF.A00(igSimpleImageView2, 1, this);
            }
            viewGroup.removeView(view.findViewById(R.id.stacked_timeline_undo_redo_guideline));
            IgSimpleImageView igSimpleImageView3 = this.undoButton;
            if (igSimpleImageView3 != null) {
                igSimpleImageView3.setBackgroundResource(R.drawable.gray_circle);
            }
            IgSimpleImageView igSimpleImageView4 = this.redoButton;
            if (igSimpleImageView4 != null) {
                igSimpleImageView4.setBackgroundResource(R.drawable.gray_circle);
            }
            IgSimpleImageView igSimpleImageView5 = this.undoButton;
            if (igSimpleImageView5 != null) {
                layoutParams = igSimpleImageView5.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof C56302iJ) {
                c56302iJ = (C56302iJ) layoutParams;
                if (c56302iJ != null) {
                    c56302iJ.A0N = R.id.stacked_timeline_redo_button;
                    c56302iJ.A0G = R.id.working_area_border_line;
                }
            } else {
                c56302iJ = null;
            }
            IgSimpleImageView igSimpleImageView6 = this.redoButton;
            if (igSimpleImageView6 != null) {
                obj = igSimpleImageView6.getLayoutParams();
            } else {
                obj = null;
            }
            if ((obj instanceof C56302iJ) && (c56302iJ2 = (C56302iJ) obj) != null) {
                c56302iJ2.A0M = 0;
                c56302iJ2.A0G = R.id.working_area_border_line;
                c56302iJ2.setMarginEnd(AbstractC167017dG.A06(viewGroup.getContext()));
            }
            IgSimpleImageView igSimpleImageView7 = this.undoButton;
            if (igSimpleImageView7 != null) {
                igSimpleImageView7.setLayoutParams(c56302iJ);
            }
            IgSimpleImageView igSimpleImageView8 = this.redoButton;
            if (igSimpleImageView8 != null) {
                igSimpleImageView8.setLayoutParams(c56302iJ2);
            }
            LoadingSpinnerView loadingSpinnerView = new LoadingSpinnerView(AbstractC166997dE.A0L(viewGroup));
            Resources resources = loadingSpinnerView.getResources();
            loadingSpinnerView.setLayoutParams(new C56302iJ((int) resources.getDimension(R.dimen.abc_dialog_padding_material), (int) resources.getDimension(R.dimen.abc_dialog_padding_material)));
            loadingSpinnerView.setId(View.generateViewId());
            loadingSpinnerView.setVisibility(8);
            viewGroup.addView(loadingSpinnerView);
            this.loadingSpinnerView = loadingSpinnerView;
            IgImageView A0Z = AbstractC31172DnG.A0Z(viewGroup, R.id.loading_spinner_background);
            C14360o3.A0B(A0Z, 0);
            this.loadingSpinnerBackground = A0Z;
            LoadingSpinnerView loadingSpinnerView2 = (LoadingSpinnerView) viewGroup.requireViewById(R.id.loading_spinner);
            C14360o3.A0B(loadingSpinnerView2, 0);
            this.scrollingAudioLoadingSpinnerView = loadingSpinnerView2;
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A01(ClipsStackedTimelineMiddleActionBarViewControllerImpl clipsStackedTimelineMiddleActionBarViewControllerImpl, String str) {
        Context requireContext;
        int i;
        Object[] objArr;
        String str2 = null;
        if (AbstractC001900j.A0a(str, "/", false)) {
            List A0m = AbstractC167007dF.A0m(str, " / ", 0);
            String A14 = MSW.A14(A0m, 0);
            String A142 = MSW.A14(A0m, 1);
            if (A0m.size() == 2 && A14 != null && A142 != null) {
                String A00 = clipsStackedTimelineMiddleActionBarViewControllerImpl.A00(A14);
                String A002 = clipsStackedTimelineMiddleActionBarViewControllerImpl.A00(A142);
                requireContext = clipsStackedTimelineMiddleActionBarViewControllerImpl.A00.requireContext();
                i = 2131955912;
                objArr = new Object[]{A00, A002};
            }
            clipsStackedTimelineMiddleActionBarViewControllerImpl.A03().setContentDescription(str2);
        }
        requireContext = clipsStackedTimelineMiddleActionBarViewControllerImpl.A00.requireContext();
        i = 2131955911;
        objArr = new Object[]{clipsStackedTimelineMiddleActionBarViewControllerImpl.A00(str)};
        str2 = requireContext.getString(i, objArr);
        clipsStackedTimelineMiddleActionBarViewControllerImpl.A03().setContentDescription(str2);
    }

    public static final boolean A02(ClipsStackedTimelineMiddleActionBarViewControllerImpl clipsStackedTimelineMiddleActionBarViewControllerImpl) {
        AbstractC187378Sf A0E = clipsStackedTimelineMiddleActionBarViewControllerImpl.A01.A0E();
        if (clipsStackedTimelineMiddleActionBarViewControllerImpl.A02.A0K.A0A.A02() != EnumC189218Zt.A05 && (A0E instanceof C8TF)) {
            return false;
        }
        return true;
    }

    public final TextView A03() {
        TextView textView = this.timeStampTextView;
        if (textView != null) {
            return textView;
        }
        C14360o3.A0F("timeStampTextView");
        throw C00O.createAndThrow();
    }

    public final IgSimpleImageView A04() {
        IgSimpleImageView igSimpleImageView = this.playButton;
        if (igSimpleImageView != null) {
            return igSimpleImageView;
        }
        C14360o3.A0F("playButton");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58284Psc
    public final void CMl() {
        int A02 = MSY.A02(this.undoButton);
        IgSimpleImageView igSimpleImageView = this.redoButton;
        if (igSimpleImageView != null) {
            igSimpleImageView.setVisibility(A02);
        }
    }

    @Override // X.InterfaceC58284Psc
    public final void EcG(boolean z) {
        IgSimpleImageView igSimpleImageView = this.redoButton;
        if (igSimpleImageView != null) {
            igSimpleImageView.setEnabled(z);
        }
        Drawable drawable = this.A00.requireContext().getDrawable(R.drawable.instagram_redo_pano_filled_24);
        if (drawable != null) {
            float f = 0.4f;
            if (z) {
                f = 1.0f;
            }
            drawable.setAlpha((int) (f * 255.0f));
        }
        IgSimpleImageView igSimpleImageView2 = this.redoButton;
        if (igSimpleImageView2 != null) {
            igSimpleImageView2.setImageDrawable(drawable);
        }
    }

    @Override // X.InterfaceC58284Psc
    public final void Efp(int i, boolean z, int i2) {
        if (z) {
            String format = new DecimalFormat("#.00").format(Float.valueOf(i / 1000.0f));
            TextView A03 = A03();
            AbstractC59962oe abstractC59962oe = this.A00;
            AbstractC166987dD.A1O(abstractC59962oe.requireContext(), A03, AbstractC53242c7.A0H(abstractC59962oe.requireContext(), R.attr.igds_color_creation_tools_yellow));
            A03().setText(format);
            A01(this, A03().getText().toString());
            return;
        }
        AbstractC185558Kx.A00((int) AbstractC166987dD.A0L(i), new DHO(i2, 12, this));
    }

    @Override // X.InterfaceC58284Psc
    public final void EgK(boolean z) {
        IgSimpleImageView igSimpleImageView = this.undoButton;
        if (igSimpleImageView != null) {
            igSimpleImageView.setEnabled(z);
        }
        Drawable drawable = this.A00.requireContext().getDrawable(R.drawable.instagram_undo_pano_filled_24);
        if (drawable != null) {
            float f = 0.4f;
            if (z) {
                f = 1.0f;
            }
            drawable.setAlpha((int) (f * 255.0f));
        }
        IgSimpleImageView igSimpleImageView2 = this.undoButton;
        if (igSimpleImageView2 != null) {
            igSimpleImageView2.setImageDrawable(drawable);
        }
    }

    @Override // X.InterfaceC58284Psc
    public final void ElG() {
        IgSimpleImageView igSimpleImageView = this.undoButton;
        if (igSimpleImageView != null) {
            igSimpleImageView.setVisibility(0);
        }
        IgSimpleImageView igSimpleImageView2 = this.redoButton;
        if (igSimpleImageView2 != null) {
            igSimpleImageView2.setVisibility(0);
        }
    }

    @Override // X.InterfaceC58284Psc
    public final void FAI(boolean z) {
        int i;
        LoadingSpinnerView loadingSpinnerView = this.loadingSpinnerView;
        if (loadingSpinnerView != null) {
            if (z) {
                loadingSpinnerView.setLoadingStatus(MY0.A02);
                i = 0;
            } else {
                loadingSpinnerView.setLoadingStatus(MY0.A03);
                i = 8;
            }
            loadingSpinnerView.setVisibility(i);
            return;
        }
        C14360o3.A0F("loadingSpinnerView");
        throw C00O.createAndThrow();
    }

    public ClipsStackedTimelineMiddleActionBarViewControllerImpl(AbstractC59962oe abstractC59962oe, C187358Sd c187358Sd, C50868Mdz c50868Mdz) {
        this.A00 = abstractC59962oe;
        this.A01 = c187358Sd;
        this.A02 = c50868Mdz;
    }

    @Override // X.InterfaceC58284Psc
    public final void ADl(EnumC189218Zt enumC189218Zt) {
        IgSimpleImageView A04 = A04();
        int ordinal = enumC189218Zt.ordinal();
        int i = R.drawable.instagram_play_pano_filled_24;
        if (ordinal == 2) {
            i = R.drawable.instagram_pause_pano_filled_24;
        }
        A04.setImageResource(i);
        IgSimpleImageView A042 = A04();
        Context requireContext = this.A00.requireContext();
        int i2 = 2131955647;
        if (ordinal == 2) {
            i2 = 2131955640;
        }
        A042.setContentDescription(requireContext.getText(i2));
    }

    @Override // X.InterfaceC58284Psc
    public final void APu() {
        String str;
        A04().setVisibility(8);
        A04().setEnabled(false);
        IgImageView igImageView = this.loadingSpinnerBackground;
        if (igImageView != null) {
            igImageView.setVisibility(0);
            LoadingSpinnerView loadingSpinnerView = this.scrollingAudioLoadingSpinnerView;
            if (loadingSpinnerView != null) {
                loadingSpinnerView.setLoadingStatus(MY0.A02);
                LoadingSpinnerView loadingSpinnerView2 = this.scrollingAudioLoadingSpinnerView;
                if (loadingSpinnerView2 != null) {
                    loadingSpinnerView2.setVisibility(0);
                    return;
                }
            }
            str = "scrollingAudioLoadingSpinnerView";
        } else {
            str = "loadingSpinnerBackground";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58284Psc
    public final void ATn() {
        if (A04().getVisibility() != 0) {
            AbstractC55200OeA.A02(A04());
        }
        if (A03().getVisibility() != 0) {
            AbstractC55200OeA.A02(A03());
        }
    }

    @Override // X.InterfaceC58284Psc
    public final void CMg() {
        String str;
        A04().setVisibility(0);
        A04().setEnabled(true);
        IgImageView igImageView = this.loadingSpinnerBackground;
        if (igImageView != null) {
            igImageView.setVisibility(8);
            LoadingSpinnerView loadingSpinnerView = this.scrollingAudioLoadingSpinnerView;
            if (loadingSpinnerView != null) {
                loadingSpinnerView.setLoadingStatus(MY0.A03);
                LoadingSpinnerView loadingSpinnerView2 = this.scrollingAudioLoadingSpinnerView;
                if (loadingSpinnerView2 != null) {
                    loadingSpinnerView2.setVisibility(8);
                    return;
                }
            }
            str = "scrollingAudioLoadingSpinnerView";
        } else {
            str = "loadingSpinnerBackground";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58284Psc
    public final void DCO(float f) {
        A04().setAlpha(f);
        A03().setAlpha(f);
        IgSimpleImageView igSimpleImageView = this.undoButton;
        if (igSimpleImageView != null) {
            igSimpleImageView.setAlpha(f);
        }
        IgSimpleImageView igSimpleImageView2 = this.redoButton;
        if (igSimpleImageView2 != null) {
            igSimpleImageView2.setAlpha(f);
        }
    }

    @Override // X.InterfaceC58284Psc
    public final void Eau(boolean z) {
        A04().setClickable(z);
    }

    @Override // X.InterfaceC58284Psc
    public final void Eav(View.OnClickListener onClickListener) {
        C0fQ.A00(onClickListener, A04());
    }
}
