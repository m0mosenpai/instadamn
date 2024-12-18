package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.AbstractC003100w;
import X.AbstractC13880nE;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25228BEl;
import X.AbstractC31172DnG;
import X.AbstractC31174DnI;
import X.AbstractC53880NsC;
import X.AbstractC55200OeA;
import X.AbstractC56952jT;
import X.AbstractC59962oe;
import X.AnonymousClass001;
import X.C00O;
import X.C05A;
import X.C0fQ;
import X.C14360o3;
import X.EnumC189218Zt;
import X.InterfaceC19390xP;
import X.InterfaceC58284Psc;
import X.MSW;
import X.MSX;
import X.MSY;
import X.MY0;
import X.ViewOnClickListenerC55457OkB;
import X.ViewOnLayoutChangeListenerC55476OkV;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.ui.LoadingSpinnerView;
import java.text.DecimalFormat;
import java.util.List;

/* loaded from: classes9.dex */
public final class BaselStackedTimelineMiddleActionViewControllerImpl implements InterfaceC58284Psc {
    public final Context A01;
    public final AbstractC59962oe A02;
    public final int A04;
    public final ClipsCreationViewModel A06;
    public IgImageView addClipsFloatingButton;
    public View elementsContainer;
    public TextView fullDurationTimeStampTextView;
    public NestedScrollView nestedScrollView;
    public IgSimpleImageView playButton;
    public TextView playbackTimeStampTextView;
    public IgSimpleImageView redoButton;
    public LoadingSpinnerView scrollingAudioLoadingSpinnerView;
    public IgSimpleImageView undoButton;
    public final C05A A03 = MSY.A0u(0);
    public boolean A00 = true;
    public final ViewOnLayoutChangeListenerC55476OkV A05 = new ViewOnLayoutChangeListenerC55476OkV(this, 2);

    public BaselStackedTimelineMiddleActionViewControllerImpl(AbstractC59962oe abstractC59962oe, ClipsCreationViewModel clipsCreationViewModel, int i) {
        this.A02 = abstractC59962oe;
        this.A06 = clipsCreationViewModel;
        this.A04 = i;
        this.A01 = abstractC59962oe.requireContext();
    }

    private final String A01(String str) {
        int i;
        int i2;
        Object[] A1Y;
        Integer A0i;
        Integer A0i2;
        int i3 = 0;
        List A0m = AbstractC167007dF.A0m(str, ":", 0);
        if (A0m.size() >= 2) {
            String A14 = MSW.A14(A0m, 0);
            if (A14 != null && (A0i2 = AbstractC003100w.A0i(A14)) != null) {
                i = A0i2.intValue();
            } else {
                i = 0;
            }
            String A142 = MSW.A14(A0m, 1);
            if (A142 != null && (A0i = AbstractC003100w.A0i(A142)) != null) {
                i3 = A0i.intValue();
            }
            Context context = this.A01;
            if (i > 0) {
                i2 = 2131955914;
                A1Y = AbstractC25228BEl.A1Z(Integer.valueOf(i), i3);
            } else {
                i2 = 2131955915;
                A1Y = AbstractC25228BEl.A1Y(i3);
            }
            return context.getString(i2, A1Y);
        }
        return null;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC58284Psc
    public final void FAI(boolean z) {
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
        C14360o3.A0B(view, 0);
        this.A00 = true;
        if (view instanceof ViewGroup) {
            TextView A0T = AbstractC166997dE.A0T(view, R.id.play_time_stamp);
            C14360o3.A0B(A0T, 0);
            this.playbackTimeStampTextView = A0T;
            TextView A0T2 = AbstractC166997dE.A0T(view, R.id.full_duration_time_stamp);
            C14360o3.A0B(A0T2, 0);
            this.fullDurationTimeStampTextView = A0T2;
            IgSimpleImageView A0I = MSX.A0I(view, R.id.play_button);
            C14360o3.A0B(A0I, 0);
            this.playButton = A0I;
            AbstractC56952jT.A01(A02());
            IgSimpleImageView A0I2 = MSX.A0I(view, R.id.stacked_timeline_undo_button);
            this.undoButton = A0I2;
            if (A0I2 != null) {
                A0I2.setImageResource(R.drawable.instagram_undo_pano_filled_24);
            }
            IgSimpleImageView igSimpleImageView = this.undoButton;
            if (igSimpleImageView != null) {
                ViewOnClickListenerC55457OkB.A01(igSimpleImageView, 29, this);
            }
            IgSimpleImageView A0I3 = MSX.A0I(view, R.id.stacked_timeline_redo_button);
            this.redoButton = A0I3;
            if (A0I3 != null) {
                A0I3.setImageResource(R.drawable.instagram_redo_pano_filled_24);
            }
            IgSimpleImageView igSimpleImageView2 = this.redoButton;
            if (igSimpleImageView2 != null) {
                ViewOnClickListenerC55457OkB.A01(igSimpleImageView2, 30, this);
            }
            this.addClipsFloatingButton = AbstractC31172DnG.A0Z(view, R.id.add_clips_button);
            this.nestedScrollView = (NestedScrollView) view.requireViewById(R.id.clips_editor_tracks_nested_scrollview);
            View requireViewById = view.requireViewById(R.id.clips_editor_elements_container);
            requireViewById.addOnLayoutChangeListener(this.A05);
            this.elementsContainer = requireViewById;
            LoadingSpinnerView loadingSpinnerView = (LoadingSpinnerView) view.requireViewById(R.id.loading_spinner);
            C14360o3.A0B(loadingSpinnerView, 0);
            this.scrollingAudioLoadingSpinnerView = loadingSpinnerView;
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final String A00(int i) {
        String A0g = AnonymousClass001.A0g(DateUtils.formatElapsedTime(i / 1000), ":", new DecimalFormat("00").format(Integer.valueOf(((i % 1000) * 30) / 1000)));
        C14360o3.A07(A0g);
        return A0g;
    }

    public final IgSimpleImageView A02() {
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
    public final void Cnq(int i) {
        int i2;
        int i3;
        NestedScrollView nestedScrollView = this.nestedScrollView;
        if (nestedScrollView != null) {
            i2 = nestedScrollView.getHeight();
        } else {
            i2 = 0;
        }
        int i4 = i2 - i;
        View view = this.elementsContainer;
        if (view != null) {
            i3 = view.getPaddingTop();
        } else {
            i3 = 0;
        }
        int i5 = i4 + i3;
        View view2 = this.elementsContainer;
        if (view2 != null) {
            if (i5 < 0) {
                i5 = 0;
            }
            view2.setPadding(0, i5, 0, 0);
        }
        if (this.A00) {
            NestedScrollView nestedScrollView2 = this.nestedScrollView;
            if (nestedScrollView2 != null) {
                nestedScrollView2.scrollTo(0, i);
            }
            this.A00 = false;
        }
    }

    @Override // X.InterfaceC58284Psc
    public final void DuY(int i) {
        int i2;
        Context context = this.A01;
        int A00 = AbstractC53880NsC.A00(context, MSW.A04(this.A06)) - (this.A04 / 2);
        IgImageView igImageView = this.addClipsFloatingButton;
        if (igImageView != null) {
            i2 = igImageView.getWidth();
        } else {
            i2 = 0;
        }
        float A002 = A00 + i2 + AbstractC13880nE.A00(context, 22.0f);
        IgImageView igImageView2 = this.addClipsFloatingButton;
        if (igImageView2 != null) {
            float f = A002 - i;
            if (f > 0.0f) {
                f = 0.0f;
            }
            igImageView2.setTranslationX(f);
        }
    }

    @Override // X.InterfaceC58284Psc
    public final InterfaceC19390xP Dut() {
        return this.A03;
    }

    @Override // X.InterfaceC58284Psc
    public final void EcG(boolean z) {
        IgSimpleImageView igSimpleImageView = this.redoButton;
        if (igSimpleImageView != null) {
            igSimpleImageView.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        }
        IgSimpleImageView igSimpleImageView2 = this.redoButton;
        if (igSimpleImageView2 != null) {
            igSimpleImageView2.setEnabled(z);
        }
        Drawable drawable = this.A02.requireContext().getDrawable(R.drawable.instagram_redo_pano_filled_24);
        if (drawable != null) {
            float f = 0.4f;
            if (z) {
                f = 1.0f;
            }
            drawable.setAlpha((int) (f * 255.0f));
        }
        IgSimpleImageView igSimpleImageView3 = this.redoButton;
        if (igSimpleImageView3 != null) {
            igSimpleImageView3.setImageDrawable(drawable);
        }
    }

    @Override // X.InterfaceC58284Psc
    public final void EgK(boolean z) {
        IgSimpleImageView igSimpleImageView = this.undoButton;
        if (igSimpleImageView != null) {
            igSimpleImageView.setEnabled(z);
        }
        Drawable drawable = this.A02.requireContext().getDrawable(R.drawable.instagram_undo_pano_filled_24);
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
    public final void ADl(EnumC189218Zt enumC189218Zt) {
        IgSimpleImageView A02 = A02();
        int ordinal = enumC189218Zt.ordinal();
        int i = R.drawable.instagram_play_pano_filled_24;
        if (ordinal == 2) {
            i = R.drawable.instagram_pause_pano_filled_24;
        }
        A02.setImageResource(i);
        IgSimpleImageView A022 = A02();
        Context requireContext = this.A02.requireContext();
        int i2 = 2131955647;
        if (ordinal == 2) {
            i2 = 2131955640;
        }
        A022.setContentDescription(requireContext.getText(i2));
    }

    @Override // X.InterfaceC58284Psc
    public final void APu() {
        A02().setVisibility(4);
        A02().setEnabled(false);
        LoadingSpinnerView loadingSpinnerView = this.scrollingAudioLoadingSpinnerView;
        if (loadingSpinnerView != null) {
            loadingSpinnerView.setLoadingStatus(MY0.A02);
            LoadingSpinnerView loadingSpinnerView2 = this.scrollingAudioLoadingSpinnerView;
            if (loadingSpinnerView2 != null) {
                loadingSpinnerView2.setVisibility(0);
                return;
            }
        }
        C14360o3.A0F("scrollingAudioLoadingSpinnerView");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58284Psc
    public final void ATn() {
        if (A02().getVisibility() != 0) {
            AbstractC55200OeA.A02(A02());
        }
        TextView textView = this.playbackTimeStampTextView;
        if (textView != null) {
            if (textView.getVisibility() != 0) {
                TextView textView2 = this.playbackTimeStampTextView;
                if (textView2 != null) {
                    AbstractC55200OeA.A02(textView2);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("playbackTimeStampTextView");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58284Psc
    public final void CMg() {
        A02().setVisibility(0);
        A02().setEnabled(true);
        LoadingSpinnerView loadingSpinnerView = this.scrollingAudioLoadingSpinnerView;
        if (loadingSpinnerView != null) {
            loadingSpinnerView.setLoadingStatus(MY0.A03);
            LoadingSpinnerView loadingSpinnerView2 = this.scrollingAudioLoadingSpinnerView;
            if (loadingSpinnerView2 != null) {
                loadingSpinnerView2.setVisibility(8);
                return;
            }
        }
        C14360o3.A0F("scrollingAudioLoadingSpinnerView");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58284Psc
    public final void DCO(float f) {
        A02().setAlpha(f);
        TextView textView = this.playbackTimeStampTextView;
        if (textView != null) {
            textView.setAlpha(f);
        } else {
            C14360o3.A0F("playbackTimeStampTextView");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC58284Psc
    public final void Eau(boolean z) {
        A02().setClickable(z);
    }

    @Override // X.InterfaceC58284Psc
    public final void Eav(View.OnClickListener onClickListener) {
        C0fQ.A00(onClickListener, A02());
    }

    @Override // X.InterfaceC58284Psc
    public final void Efp(int i, boolean z, int i2) {
        String str;
        String A00 = A00(i);
        String A002 = A00(i2);
        TextView textView = this.playbackTimeStampTextView;
        if (textView != null) {
            textView.setText(A00);
            TextView textView2 = this.fullDurationTimeStampTextView;
            if (textView2 != null) {
                textView2.setText(A002);
                String A0t = AbstractC31174DnI.A0t(this.A01, A01(A00), A01(A002), 2131955912);
                C14360o3.A07(A0t);
                TextView textView3 = this.playbackTimeStampTextView;
                if (textView3 != null) {
                    textView3.setContentDescription(A0t);
                    TextView textView4 = this.fullDurationTimeStampTextView;
                    if (textView4 != null) {
                        textView4.setContentDescription(A0t);
                        return;
                    }
                }
            }
            str = "fullDurationTimeStampTextView";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "playbackTimeStampTextView";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
