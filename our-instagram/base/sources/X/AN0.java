package X;

import android.animation.Animator;
import com.instagram.reels.common.ui.StoryTypeSelectorView;

/* loaded from: classes4.dex */
public final class AN0 implements Animator.AnimatorListener {
    public final /* synthetic */ StoryTypeSelectorView A00;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    public AN0(StoryTypeSelectorView storyTypeSelectorView) {
        this.A00 = storyTypeSelectorView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        StoryTypeSelectorView storyTypeSelectorView = this.A00;
        storyTypeSelectorView.A03 = false;
        StoryTypeSelectorView.A01(storyTypeSelectorView);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A03 = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.A00.A03 = true;
    }
}
