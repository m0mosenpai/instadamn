package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;

/* renamed from: X.KaS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46071KaS extends AbstractC87373uv {
    public final /* synthetic */ long A00;
    public final /* synthetic */ NoteAvatarView A01;

    @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C14360o3.A0B(animator, 0);
        NoteAvatarView noteAvatarView = this.A01;
        noteAvatarView.getNoteBubbleView().setVisibility(8);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(this.A00);
        UserSession userSession = noteAvatarView.A05;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        ofFloat.setStartDelay(C18U.A01(C06090Tz.A05, userSession, 36610765088037071L) * 1000);
        ofFloat.addListener(new C46074KaV(noteAvatarView, 2));
        LMA.A01(ofFloat, noteAvatarView, 20);
        ofFloat.start();
        animator.removeListener(this);
    }

    public C46071KaS(NoteAvatarView noteAvatarView, long j) {
        this.A01 = noteAvatarView;
        this.A00 = j;
    }
}
