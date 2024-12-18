package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

/* renamed from: X.MaX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50730MaX extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;

    public C50730MaX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        int i;
        switch (this.A00) {
            case 0:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 1:
                C14360o3.A0B(animator, 0);
                super.onAnimationEnd(animator);
                ((OW2) this.A01).A01.start();
                return;
            case 2:
            case 6:
            default:
                return;
            case 3:
                C54787OJe c54787OJe = (C54787OJe) this.A01;
                c54787OJe.A06.setVisibility(8);
                view = c54787OJe.A07;
                i = 0;
                view.setVisibility(i);
                return;
            case 4:
                ((C54768OIf) this.A01).A00 = false;
                return;
            case 5:
                view = ((FilmstripTimelineView) this.A01).A09;
                i = 8;
                view.setVisibility(i);
                return;
            case 7:
                view = (View) this.A01;
                i = 8;
                view.setVisibility(i);
                return;
            case 8:
                view = (View) this.A01;
                i = 4;
                view.setVisibility(i);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view;
        switch (this.A00) {
            case 2:
                C54787OJe c54787OJe = (C54787OJe) this.A01;
                c54787OJe.A07.setVisibility(4);
                view = c54787OJe.A06;
                break;
            case 3:
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                view = (View) this.A01;
                break;
            case 7:
                return;
        }
        view.setVisibility(0);
    }
}
