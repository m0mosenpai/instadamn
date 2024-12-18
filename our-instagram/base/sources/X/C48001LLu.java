package X;

import android.animation.ValueAnimator;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;

/* renamed from: X.LLu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48001LLu implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ NoteAvatarView A00;

    public C48001LLu(NoteAvatarView noteAvatarView) {
        this.A00 = noteAvatarView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        float A00 = AbstractC167017dG.A00(valueAnimator);
        NoteAvatarView noteAvatarView = this.A00;
        noteAvatarView.getNoteBubbleView().setScaleX(A00);
        noteAvatarView.getNoteBubbleView().setScaleY(A00);
    }
}
