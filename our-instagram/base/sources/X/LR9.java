package X;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;

/* loaded from: classes8.dex */
public final class LR9 implements Animation.AnimationListener {
    public final /* synthetic */ AlphaAnimation A00;
    public final /* synthetic */ C6C9 A01;
    public final /* synthetic */ C48572Le9 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C14510oO A04;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public LR9(AlphaAnimation alphaAnimation, C6C9 c6c9, C48572Le9 c48572Le9, String str, C14510oO c14510oO) {
        this.A04 = c14510oO;
        this.A00 = alphaAnimation;
        this.A02 = c48572Le9;
        this.A03 = str;
        this.A01 = c6c9;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C14510oO c14510oO = this.A04;
        if (c14510oO.A00) {
            AlphaAnimation alphaAnimation = this.A00;
            alphaAnimation.setStartOffset(3500L);
            NoteAvatarView noteAvatarView = (NoteAvatarView) this.A02.A03.get();
            if (noteAvatarView != null) {
                noteAvatarView.getNoteBubbleView().startAnimation(alphaAnimation);
            }
            c14510oO.A00 = false;
            return;
        }
        NotesRepository notesRepository = this.A02.A02;
        String str = this.A03;
        notesRepository.A0P(str);
        notesRepository.A0Q(this.A01.A0H, str);
    }
}
