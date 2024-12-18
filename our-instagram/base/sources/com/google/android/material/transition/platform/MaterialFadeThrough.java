package com.google.android.material.transition.platform;

import X.LWB;
import X.LWD;
import X.XCF;
import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class MaterialFadeThrough extends MaterialVisibility {
    public static final float DEFAULT_START_SCALE = 0.92f;
    public static final int DEFAULT_THEMED_DURATION_ATTR = 2130970692;
    public static final int DEFAULT_THEMED_EASING_ATTR = 2130970702;

    public static XCF createSecondaryAnimatorProvider() {
        LWD lwd = new LWD(true);
        lwd.A02 = false;
        lwd.A00 = 0.92f;
        return lwd;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.XCF] */
    public MaterialFadeThrough() {
        super(new Object(), createSecondaryAnimatorProvider());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.LWB] */
    public static LWB createPrimaryAnimatorProvider() {
        return new Object();
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ XCF getSecondaryAnimatorProvider() {
        return this.secondaryAnimatorProvider;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(XCF xcf) {
        return this.additionalAnimatorProviders.remove(xcf);
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
    public int getDurationThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_DURATION_ATTR;
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
