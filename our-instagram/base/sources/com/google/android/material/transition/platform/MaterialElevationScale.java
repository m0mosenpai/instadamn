package com.google.android.material.transition.platform;

import X.C70549Wcf;
import X.LWD;
import X.XCF;
import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class MaterialElevationScale extends MaterialVisibility {
    public static final float DEFAULT_SCALE = 0.85f;
    public final boolean growing;

    public static LWD createPrimaryAnimatorProvider(boolean z) {
        LWD lwd = new LWD(z);
        lwd.A01 = 0.85f;
        lwd.A00 = 0.85f;
        return lwd;
    }

    public static XCF createSecondaryAnimatorProvider() {
        return new C70549Wcf();
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ XCF getSecondaryAnimatorProvider() {
        return this.secondaryAnimatorProvider;
    }

    public boolean isGrowing() {
        return this.growing;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(XCF xcf) {
        return this.additionalAnimatorProviders.remove(xcf);
    }

    public MaterialElevationScale(boolean z) {
        super(createPrimaryAnimatorProvider(z), new C70549Wcf());
        this.growing = z;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(XCF xcf) {
        super.addAdditionalAnimatorProvider(xcf);
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
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
