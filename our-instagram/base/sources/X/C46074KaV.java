package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;
import com.instagram.ui.widget.expandingtextview.ExpandingEllipsizingTextView;
import com.instagram.ui.widget.volume.VolumeIndicator;

/* renamed from: X.KaV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46074KaV extends AbstractC87373uv {
    public final int A00;
    public final Object A01;

    public C46074KaV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.A00) {
            case 3:
            case 7:
                C14360o3.A0B(animator, 0);
                onAnimationEnd(animator);
                return;
            case 4:
            case 5:
            case 6:
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        Handler A0J;
        Runnable m2m;
        switch (this.A00) {
            case 0:
                L7y l7y = (L7y) this.A01;
                l7y.A00();
                l7y.A00 = true;
                return;
            case 1:
            default:
                super.onAnimationEnd(animator);
                return;
            case 2:
                C14360o3.A0B(animator, 0);
                UserSession userSession = ((NoteAvatarView) this.A01).A05;
                if (userSession == null) {
                    AbstractC31171DnF.A0y();
                    throw C00O.createAndThrow();
                }
                InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
                int i = A0x.getInt("notes_creation_self_pog_animation_cta_variant", 0);
                InterfaceC19610xo ARD = A0x.ARD();
                ARD.E7D("notes_creation_self_pog_animation_cta_variant", (i + 1) % 4);
                ARD.apply();
                animator.removeListener(this);
                return;
            case 3:
                C14360o3.A0B(animator, 0);
                view = ((NoteAvatarView) this.A01).A08;
                view.setVisibility(4);
                animator.removeListener(this);
                return;
            case 4:
                C43771JXk c43771JXk = (C43771JXk) this.A01;
                LGO lgo = c43771JXk.A03;
                c43771JXk.A02 = lgo;
                if (lgo == null) {
                    return;
                }
                c43771JXk.A03 = null;
                C43771JXk.A00(c43771JXk);
                float[] A1b = AbstractC43592JPx.A1b();
                // fill-array-data instruction
                A1b[0] = 0.0f;
                A1b[1] = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
                ofFloat.setDuration(c43771JXk.A05);
                LMA.A01(ofFloat, c43771JXk, 21);
                c43771JXk.A01 = ofFloat;
                ofFloat.start();
                return;
            case 5:
                A0J = AbstractC167007dF.A0J();
                m2m = new M2M((N7L) this.A01);
                A0J.postDelayed(m2m, 50L);
                return;
            case 6:
                A0J = AbstractC167007dF.A0J();
                m2m = new M2N((N7M) this.A01);
                A0J.postDelayed(m2m, 50L);
                return;
            case 7:
                C14360o3.A0B(animator, 0);
                view = (View) this.A01;
                view.setVisibility(4);
                animator.removeListener(this);
                return;
            case 8:
                ExpandingEllipsizingTextView expandingEllipsizingTextView = (ExpandingEllipsizingTextView) this.A01;
                ExpandingEllipsizingTextView.A02(expandingEllipsizingTextView, expandingEllipsizingTextView.A00);
                return;
            case 9:
                VolumeIndicator volumeIndicator = (VolumeIndicator) this.A01;
                volumeIndicator.setVisibility(8);
                volumeIndicator.A00 = null;
                return;
        }
    }

    @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.A00) {
            case 1:
                AbstractC167007dF.A0w((View) this.A01);
                return;
            case 2:
                ((NoteAvatarView) this.A01).getNoteBubbleView().setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
