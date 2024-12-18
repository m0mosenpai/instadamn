package X;

import android.animation.ValueAnimator;

/* loaded from: classes8.dex */
public final class LMA implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final Object A01;

    public static Object A00(LMA lma, Object obj) {
        C14360o3.A0B(obj, 0);
        return lma.A01;
    }

    public LMA(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A01(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new LMA(obj, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x0520, code lost:
    
        if (r0 == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x044a, code lost:
    
        if (r0 > r4) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0466, code lost:
    
        if (r14 > r4) goto L136;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x047b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0491 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x049b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x046b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0473  */
    /* JADX WARN: Type inference failed for: r4v10, types: [X.Jii] */
    /* JADX WARN: Type inference failed for: r4v12, types: [X.Jii] */
    /* JADX WARN: Type inference failed for: r4v14, types: [X.KKb] */
    /* JADX WARN: Type inference failed for: r4v21, types: [X.KKd] */
    /* JADX WARN: Type inference failed for: r4v33, types: [X.Jix] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.Jj0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.graphics.drawable.ShapeDrawable] */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.facebook.smartcapture.components.DottedAlignmentView] */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v12, types: [X.Jjs] */
    /* JADX WARN: Type inference failed for: r6v13, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v15, types: [com.instagram.igds.components.stepperheader.IgdsStepperHeader] */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.facebook.smartcapture.components.DarkenedFrameView] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAnimationUpdate(android.animation.ValueAnimator r19) {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LMA.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
