package com.google.android.material.transition.platform;

import X.AbstractC153306uz;
import X.AbstractC68354VNo;
import X.WGK;
import X.XCF;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class MaterialVisibility extends Visibility {
    public final List additionalAnimatorProviders = new ArrayList();
    public final XCF primaryAnimatorProvider;
    public XCF secondaryAnimatorProvider;

    public int getDurationThemeAttrResId(boolean z) {
        return 0;
    }

    public int getEasingThemeAttrResId(boolean z) {
        return 0;
    }

    public abstract XCF getSecondaryAnimatorProvider();

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return createAnimator(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return createAnimator(viewGroup, view, false);
    }

    public abstract boolean removeAdditionalAnimatorProvider(XCF xcf);

    public abstract void setSecondaryAnimatorProvider(XCF xcf);

    public static void addAnimatorIfNeeded(List list, XCF xcf, ViewGroup viewGroup, View view, boolean z) {
        Animator AM4;
        if (xcf != null) {
            if (z) {
                AM4 = xcf.ALf(view, viewGroup);
            } else {
                AM4 = xcf.AM4(view, viewGroup);
            }
            if (AM4 != null) {
                list.add(AM4);
            }
        }
    }

    private Animator createAnimator(ViewGroup viewGroup, View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        addAnimatorIfNeeded(arrayList, this.primaryAnimatorProvider, viewGroup, view, z);
        addAnimatorIfNeeded(arrayList, this.secondaryAnimatorProvider, viewGroup, view, z);
        Iterator it = this.additionalAnimatorProviders.iterator();
        while (it.hasNext()) {
            addAnimatorIfNeeded(arrayList, (XCF) it.next(), viewGroup, view, z);
        }
        maybeApplyThemeValues(viewGroup.getContext(), z);
        AbstractC68354VNo.A00(animatorSet, arrayList);
        return animatorSet;
    }

    public void addAdditionalAnimatorProvider(XCF xcf) {
        this.additionalAnimatorProviders.add(xcf);
    }

    public void clearAdditionalAnimatorProvider() {
        this.additionalAnimatorProviders.clear();
    }

    public XCF getPrimaryAnimatorProvider() {
        return this.primaryAnimatorProvider;
    }

    public MaterialVisibility(XCF xcf, XCF xcf2) {
        this.primaryAnimatorProvider = xcf;
        this.secondaryAnimatorProvider = xcf2;
    }

    private void maybeApplyThemeValues(Context context, boolean z) {
        WGK.A06(context, this, getDurationThemeAttrResId(z));
        WGK.A05(getDefaultEasingInterpolator(z), context, this, getEasingThemeAttrResId(z));
    }

    public TimeInterpolator getDefaultEasingInterpolator(boolean z) {
        return AbstractC153306uz.A02;
    }
}
