package com.google.android.material.transition.platform;

import X.AbstractC153306uz;
import X.AbstractC25230BEn;
import X.AbstractC63041SbH;
import X.C65P;
import X.C65Q;
import X.C65T;
import X.C66337U9s;
import X.C68930VeU;
import X.C69210Vjd;
import X.C72G;
import X.WGK;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.TypedValue;
import android.view.View;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class MaterialContainerTransform extends Transition {
    public static final float ELEVATION_NOT_SET = -1.0f;
    public static final int FADE_MODE_CROSS = 2;
    public static final int FADE_MODE_IN = 0;
    public static final int FADE_MODE_OUT = 1;
    public static final int FADE_MODE_THROUGH = 3;
    public static final int FIT_MODE_AUTO = 0;
    public static final int FIT_MODE_HEIGHT = 2;
    public static final int FIT_MODE_WIDTH = 1;
    public static final String TAG = "MaterialContainerTransform";
    public static final int TRANSITION_DIRECTION_AUTO = 0;
    public static final int TRANSITION_DIRECTION_ENTER = 1;
    public static final int TRANSITION_DIRECTION_RETURN = 2;
    public boolean appliedThemeValues;
    public int containerColor;
    public boolean drawDebugEnabled;
    public int drawingViewId;
    public boolean elevationShadowEnabled;
    public int endContainerColor;
    public float endElevation;
    public C65Q endShapeAppearanceModel;
    public View endView;
    public int endViewId;
    public int fadeMode;
    public C68930VeU fadeProgressThresholds;
    public int fitMode;
    public boolean holdAtEndEnabled;
    public boolean pathMotionCustom;
    public C68930VeU scaleMaskProgressThresholds;
    public C68930VeU scaleProgressThresholds;
    public int scrimColor;
    public C68930VeU shapeMaskProgressThresholds;
    public int startContainerColor;
    public float startElevation;
    public C65Q startShapeAppearanceModel;
    public View startView;
    public int startViewId;
    public int transitionDirection;
    public static final String PROP_BOUNDS = "materialContainerTransition:bounds";
    public static final String PROP_SHAPE_APPEARANCE = "materialContainerTransition:shapeAppearance";
    public static final String[] TRANSITION_PROPS = {PROP_BOUNDS, PROP_SHAPE_APPEARANCE};
    public static final C69210Vjd DEFAULT_ENTER_THRESHOLDS = new C69210Vjd(new C68930VeU(0.0f, 0.25f), new C68930VeU(0.0f, 1.0f), new C68930VeU(0.0f, 1.0f), new C68930VeU(0.0f, 0.75f));
    public static final C69210Vjd DEFAULT_RETURN_THRESHOLDS = new C69210Vjd(new C68930VeU(0.6f, 0.9f), new C68930VeU(0.0f, 1.0f), new C68930VeU(0.0f, 0.9f), new C68930VeU(0.3f, 0.9f));
    public static final C69210Vjd DEFAULT_ENTER_THRESHOLDS_ARC = new C69210Vjd(new C68930VeU(0.1f, 0.4f), new C68930VeU(0.1f, 1.0f), new C68930VeU(0.1f, 1.0f), new C68930VeU(0.1f, 0.9f));
    public static final C69210Vjd DEFAULT_RETURN_THRESHOLDS_ARC = new C69210Vjd(new C68930VeU(0.6f, 0.9f), new C68930VeU(0.0f, 0.9f), new C68930VeU(0.0f, 0.9f), new C68930VeU(0.2f, 0.9f));

    /* JADX WARN: Removed duplicated region for block: B:30:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void captureValues(android.transition.TransitionValues r6, android.view.View r7, int r8, X.C65Q r9) {
        /*
            r0 = -1
            if (r8 == r0) goto L7c
            android.view.View r2 = r6.view
            android.graphics.RectF r0 = X.WGK.A00
            android.view.View r7 = r2.findViewById(r8)
            if (r7 != 0) goto L1c
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r1 = r0.getResourceName(r8)
        L15:
            int r0 = r2.getId()
            if (r0 != r8) goto L6f
            r7 = r2
        L1c:
            r6.view = r7
        L1e:
            android.view.View r5 = r6.view
            boolean r0 = r5.isLaidOut()
            if (r0 != 0) goto L32
            int r0 = r5.getWidth()
            if (r0 != 0) goto L32
            int r0 = r5.getHeight()
            if (r0 == 0) goto L69
        L32:
            android.view.ViewParent r0 = r5.getParent()
            if (r0 != 0) goto L6a
            android.graphics.RectF r0 = X.WGK.A00
            int r0 = r5.getLeft()
            float r4 = (float) r0
            int r0 = r5.getTop()
            float r2 = (float) r0
            int r0 = r5.getRight()
            float r1 = (float) r0
            int r0 = r5.getBottom()
            float r0 = (float) r0
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r4, r2, r1, r0)
        L53:
            java.util.Map r1 = r6.values
            java.lang.String r0 = "materialContainerTransition:bounds"
            r1.put(r0, r3)
            java.util.Map r2 = r6.values
            X.65Q r0 = getShapeAppearance(r5, r9)
            X.65Q r1 = X.WGK.A04(r3, r0)
            java.lang.String r0 = "materialContainerTransition:shapeAppearance"
            r2.put(r0, r1)
        L69:
            return
        L6a:
            android.graphics.RectF r3 = X.WGK.A03(r5)
            goto L53
        L6f:
            android.view.ViewParent r2 = r2.getParent()
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L9a
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L9a
            goto L15
        L7c:
            if (r7 != 0) goto L1c
            android.view.View r0 = r6.view
            r2 = 2131436619(0x7f0b244b, float:1.8495114E38)
            java.lang.Object r0 = r0.getTag(r2)
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L1e
            android.view.View r0 = r6.view
            java.lang.Object r7 = r0.getTag(r2)
            android.view.View r7 = (android.view.View) r7
            android.view.View r1 = r6.view
            r0 = 0
            r1.setTag(r2, r0)
            goto L1c
        L9a:
            java.lang.String r0 = " is not a valid ancestor"
            java.lang.IllegalArgumentException r0 = X.AbstractC167007dF.A0c(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.MaterialContainerTransform.captureValues(android.transition.TransitionValues, android.view.View, int, X.65Q):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fc, code lost:
    
        if (r0 >= 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b9, code lost:
    
        if (r1 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b6, code lost:
    
        r24 = X.VZY.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bb, code lost:
    
        r24 = X.VZY.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        if (r1 != false) goto L40;
     */
    @Override // android.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator createAnimator(android.view.ViewGroup r37, android.transition.TransitionValues r38, android.transition.TransitionValues r39) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.MaterialContainerTransform.createAnimator(android.view.ViewGroup, android.transition.TransitionValues, android.transition.TransitionValues):android.animation.Animator");
    }

    public static RectF calculateDrawableBounds(View view, View view2, float f, float f2) {
        if (view2 != null) {
            RectF A03 = WGK.A03(view2);
            A03.offset(f, f2);
            return A03;
        }
        return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
    }

    public static float getElevationOrDefault(float f, View view) {
        if (f == -1.0f) {
            return view.getElevation();
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C65Q getShapeAppearance(View view, C65Q c65q) {
        C72G c72g;
        if (c65q == null) {
            if (view.getTag(R.id.mtrl_motion_snapshot_view) instanceof C65Q) {
                return (C65Q) view.getTag(R.id.mtrl_motion_snapshot_view);
            }
            Context context = view.getContext();
            int transitionShapeAppearanceResId = getTransitionShapeAppearanceResId(context);
            if (transitionShapeAppearanceResId != -1) {
                c72g = C65Q.A02(context, new C65T(0.0f), transitionShapeAppearanceResId, 0);
            } else {
                if (view instanceof C65P) {
                    return ((C65P) view).getShapeAppearanceModel();
                }
                c72g = new C72G();
            }
            return new C65Q(c72g);
        }
        return c65q;
    }

    private C69210Vjd getThresholdsOrDefault(boolean z, C69210Vjd c69210Vjd, C69210Vjd c69210Vjd2) {
        if (!z) {
            c69210Vjd = c69210Vjd2;
        }
        C68930VeU c68930VeU = this.fadeProgressThresholds;
        C68930VeU c68930VeU2 = c69210Vjd.A00;
        RectF rectF = WGK.A00;
        if (c68930VeU == null) {
            c68930VeU = c68930VeU2;
        }
        C68930VeU c68930VeU3 = this.scaleProgressThresholds;
        C68930VeU c68930VeU4 = c69210Vjd.A01;
        if (c68930VeU3 == null) {
            c68930VeU3 = c68930VeU4;
        }
        C68930VeU c68930VeU5 = this.scaleMaskProgressThresholds;
        C68930VeU c68930VeU6 = c69210Vjd.A02;
        if (c68930VeU5 == null) {
            c68930VeU5 = c68930VeU6;
        }
        C68930VeU c68930VeU7 = this.shapeMaskProgressThresholds;
        C68930VeU c68930VeU8 = c69210Vjd.A03;
        if (c68930VeU7 == null) {
            c68930VeU7 = c68930VeU8;
        }
        return new C69210Vjd(c68930VeU, c68930VeU3, c68930VeU5, c68930VeU7);
    }

    private boolean isEntering(RectF rectF, RectF rectF2) {
        int i = this.transitionDirection;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw AbstractC25230BEn.A0n("Invalid transition direction: ", i);
        }
        RectF rectF3 = WGK.A00;
        if (rectF2.width() * rectF2.height() <= rectF.width() * rectF.height()) {
            return false;
        }
        return true;
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues, this.endView, this.endViewId, this.endShapeAppearanceModel);
    }

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        captureValues(transitionValues, this.startView, this.startViewId, this.startShapeAppearanceModel);
    }

    public int getContainerColor() {
        return this.containerColor;
    }

    public int getDrawingViewId() {
        return this.drawingViewId;
    }

    public int getEndContainerColor() {
        return this.endContainerColor;
    }

    public float getEndElevation() {
        return this.endElevation;
    }

    public C65Q getEndShapeAppearanceModel() {
        return this.endShapeAppearanceModel;
    }

    public View getEndView() {
        return this.endView;
    }

    public int getEndViewId() {
        return this.endViewId;
    }

    public int getFadeMode() {
        return this.fadeMode;
    }

    public C68930VeU getFadeProgressThresholds() {
        return this.fadeProgressThresholds;
    }

    public int getFitMode() {
        return this.fitMode;
    }

    public C68930VeU getScaleMaskProgressThresholds() {
        return this.scaleMaskProgressThresholds;
    }

    public C68930VeU getScaleProgressThresholds() {
        return this.scaleProgressThresholds;
    }

    public int getScrimColor() {
        return this.scrimColor;
    }

    public C68930VeU getShapeMaskProgressThresholds() {
        return this.shapeMaskProgressThresholds;
    }

    public int getStartContainerColor() {
        return this.startContainerColor;
    }

    public float getStartElevation() {
        return this.startElevation;
    }

    public C65Q getStartShapeAppearanceModel() {
        return this.startShapeAppearanceModel;
    }

    public View getStartView() {
        return this.startView;
    }

    public int getStartViewId() {
        return this.startViewId;
    }

    public int getTransitionDirection() {
        return this.transitionDirection;
    }

    @Override // android.transition.Transition
    public String[] getTransitionProperties() {
        return TRANSITION_PROPS;
    }

    public boolean isDrawDebugEnabled() {
        return this.drawDebugEnabled;
    }

    public boolean isElevationShadowEnabled() {
        return this.elevationShadowEnabled;
    }

    public boolean isHoldAtEndEnabled() {
        return this.holdAtEndEnabled;
    }

    public void setAllContainerColors(int i) {
        this.containerColor = i;
        this.startContainerColor = i;
        this.endContainerColor = i;
    }

    public MaterialContainerTransform(Context context, boolean z) {
        this.drawDebugEnabled = false;
        this.holdAtEndEnabled = false;
        this.pathMotionCustom = false;
        this.appliedThemeValues = false;
        this.drawingViewId = android.R.id.content;
        this.startViewId = -1;
        this.endViewId = -1;
        this.containerColor = 0;
        this.startContainerColor = 0;
        this.endContainerColor = 0;
        this.scrimColor = 1375731712;
        this.transitionDirection = 0;
        this.fadeMode = 0;
        this.fitMode = 0;
        this.elevationShadowEnabled = true;
        this.startElevation = -1.0f;
        this.endElevation = -1.0f;
        maybeApplyThemeValues(context, z);
        this.appliedThemeValues = true;
    }

    private C69210Vjd buildThresholdsGroup(boolean z) {
        C69210Vjd c69210Vjd;
        C69210Vjd c69210Vjd2;
        PathMotion pathMotion = getPathMotion();
        if (!(pathMotion instanceof ArcMotion) && !(pathMotion instanceof C66337U9s)) {
            c69210Vjd = DEFAULT_ENTER_THRESHOLDS;
            c69210Vjd2 = DEFAULT_RETURN_THRESHOLDS;
        } else {
            c69210Vjd = DEFAULT_ENTER_THRESHOLDS_ARC;
            c69210Vjd2 = DEFAULT_RETURN_THRESHOLDS_ARC;
        }
        return getThresholdsOrDefault(z, c69210Vjd, c69210Vjd2);
    }

    public static C65Q captureShapeAppearance(View view, RectF rectF, C65Q c65q) {
        return WGK.A04(rectF, getShapeAppearance(view, c65q));
    }

    public static int getTransitionShapeAppearanceResId(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private void maybeApplyThemeValues(Context context, boolean z) {
        PathMotion patternPathMotion;
        WGK.A05(AbstractC153306uz.A02, context, this, R.attr.motionEasingStandard);
        int i = R.attr.motionDurationMedium2;
        if (z) {
            i = R.attr.motionDurationLong1;
        }
        WGK.A06(context, this, i);
        if (!this.pathMotionCustom) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(R.attr.motionPath, typedValue, true)) {
                int i2 = typedValue.type;
                if (i2 == 16) {
                    int i3 = typedValue.data;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            patternPathMotion = new PathMotion();
                        } else {
                            throw AbstractC25230BEn.A0n("Invalid motion path type: ", i3);
                        }
                    } else {
                        return;
                    }
                } else if (i2 == 3) {
                    patternPathMotion = new PatternPathMotion(AbstractC63041SbH.A00(String.valueOf(typedValue.string)));
                } else {
                    throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
                }
                setPathMotion(patternPathMotion);
            }
        }
    }

    public void setContainerColor(int i) {
        this.containerColor = i;
    }

    public void setDrawDebugEnabled(boolean z) {
        this.drawDebugEnabled = z;
    }

    public void setDrawingViewId(int i) {
        this.drawingViewId = i;
    }

    public void setElevationShadowEnabled(boolean z) {
        this.elevationShadowEnabled = z;
    }

    public void setEndContainerColor(int i) {
        this.endContainerColor = i;
    }

    public void setEndElevation(float f) {
        this.endElevation = f;
    }

    public void setEndShapeAppearanceModel(C65Q c65q) {
        this.endShapeAppearanceModel = c65q;
    }

    public void setEndView(View view) {
        this.endView = view;
    }

    public void setEndViewId(int i) {
        this.endViewId = i;
    }

    public void setFadeMode(int i) {
        this.fadeMode = i;
    }

    public void setFadeProgressThresholds(C68930VeU c68930VeU) {
        this.fadeProgressThresholds = c68930VeU;
    }

    public void setFitMode(int i) {
        this.fitMode = i;
    }

    public void setHoldAtEndEnabled(boolean z) {
        this.holdAtEndEnabled = z;
    }

    @Override // android.transition.Transition
    public void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.pathMotionCustom = true;
    }

    public void setScaleMaskProgressThresholds(C68930VeU c68930VeU) {
        this.scaleMaskProgressThresholds = c68930VeU;
    }

    public void setScaleProgressThresholds(C68930VeU c68930VeU) {
        this.scaleProgressThresholds = c68930VeU;
    }

    public void setScrimColor(int i) {
        this.scrimColor = i;
    }

    public void setShapeMaskProgressThresholds(C68930VeU c68930VeU) {
        this.shapeMaskProgressThresholds = c68930VeU;
    }

    public void setStartContainerColor(int i) {
        this.startContainerColor = i;
    }

    public void setStartElevation(float f) {
        this.startElevation = f;
    }

    public void setStartShapeAppearanceModel(C65Q c65q) {
        this.startShapeAppearanceModel = c65q;
    }

    public void setStartView(View view) {
        this.startView = view;
    }

    public void setStartViewId(int i) {
        this.startViewId = i;
    }

    public void setTransitionDirection(int i) {
        this.transitionDirection = i;
    }

    public MaterialContainerTransform() {
        this.drawDebugEnabled = false;
        this.holdAtEndEnabled = false;
        this.pathMotionCustom = false;
        this.appliedThemeValues = false;
        this.drawingViewId = android.R.id.content;
        this.startViewId = -1;
        this.endViewId = -1;
        this.containerColor = 0;
        this.startContainerColor = 0;
        this.endContainerColor = 0;
        this.scrimColor = 1375731712;
        this.transitionDirection = 0;
        this.fadeMode = 0;
        this.fitMode = 0;
        this.elevationShadowEnabled = true;
        this.startElevation = -1.0f;
        this.endElevation = -1.0f;
    }
}
