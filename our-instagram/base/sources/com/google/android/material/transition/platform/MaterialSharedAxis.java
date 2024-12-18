package com.google.android.material.transition.platform;

import X.AbstractC25230BEn;
import X.LWD;
import X.XCF;
import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class MaterialSharedAxis extends MaterialVisibility {
    public static final int DEFAULT_THEMED_DURATION_ATTR = 2130970692;
    public static final int DEFAULT_THEMED_EASING_ATTR = 2130970702;

    /* renamed from: X, reason: collision with root package name */
    public static final int f6X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    public final int axis;
    public final boolean forward;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.XCF, X.LWC] */
    public static XCF createPrimaryAnimatorProvider(int i, boolean z) {
        int i2;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return new LWD(z);
                }
                throw AbstractC25230BEn.A0n("Invalid axis: ", i);
            }
            i2 = 48;
            if (z) {
                i2 = 80;
            }
        } else {
            i2 = 8388611;
            if (z) {
                i2 = 8388613;
            }
        }
        ?? obj = new Object();
        obj.A00 = i2;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.XCF] */
    public static XCF createSecondaryAnimatorProvider() {
        return new Object();
    }

    public int getAxis() {
        return this.axis;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ XCF getPrimaryAnimatorProvider() {
        return this.primaryAnimatorProvider;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ XCF getSecondaryAnimatorProvider() {
        return this.secondaryAnimatorProvider;
    }

    public boolean isForward() {
        return this.forward;
    }

    @Override // com.google.android.material.transition.platform.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(XCF xcf) {
        return this.additionalAnimatorProviders.remove(xcf);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.XCF] */
    public MaterialSharedAxis(int i, boolean z) {
        super(createPrimaryAnimatorProvider(i, z), new Object());
        this.axis = i;
        this.forward = z;
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
