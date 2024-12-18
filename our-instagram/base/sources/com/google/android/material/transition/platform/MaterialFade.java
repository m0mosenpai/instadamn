package com.google.android.material.transition.platform;

import X.AbstractC153306uz;
import X.C70549Wcf;
import X.LWD;
import X.XCF;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class MaterialFade extends MaterialVisibility {
    public static final float DEFAULT_FADE_END_THRESHOLD_ENTER = 0.3f;
    public static final float DEFAULT_START_SCALE = 0.8f;
    public static final int DEFAULT_THEMED_EASING_ATTR = 2130970701;
    public static final int DEFAULT_THEMED_INCOMING_DURATION_ATTR = 2130970697;
    public static final int DEFAULT_THEMED_OUTGOING_DURATION_ATTR = 2130970696;

    public static XCF createSecondaryAnimatorProvider() {
        LWD lwd = new LWD(true);
        lwd.A02 = false;
        lwd.A00 = 0.8f;
        return lwd;
    }

    public static C70549Wcf createPrimaryAnimatorProvider() {
        C70549Wcf c70549Wcf = new C70549Wcf();
        c70549Wcf.A00 = 0.3f;
        return c70549Wcf;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public int getDurationThemeAttrResId(boolean z) {
        if (z) {
            return DEFAULT_THEMED_INCOMING_DURATION_ATTR;
        }
        return DEFAULT_THEMED_OUTGOING_DURATION_ATTR;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ XCF getSecondaryAnimatorProvider() {
        return this.secondaryAnimatorProvider;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(XCF xcf) {
        return this.additionalAnimatorProviders.remove(xcf);
    }

    public MaterialFade() {
        super(createPrimaryAnimatorProvider(), createSecondaryAnimatorProvider());
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(XCF xcf) {
        super.addAdditionalAnimatorProvider(xcf);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public TimeInterpolator getDefaultEasingInterpolator(boolean z) {
        return AbstractC153306uz.A03;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public int getEasingThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_EASING_ATTR;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(XCF xcf) {
        this.secondaryAnimatorProvider = xcf;
    }
}
