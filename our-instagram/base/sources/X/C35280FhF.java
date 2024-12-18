package X;

import android.animation.Animator;
import android.view.View;
import com.facebook.R;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.ui.widget.spinner.RefreshSpinner;

/* renamed from: X.FhF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35280FhF implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;

    public C35280FhF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (5 - this.A00 == 0) {
            ((C36472G6w) this.A01).A00.setVisibility(8);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        String str;
        int i;
        View view;
        switch (this.A00) {
            case 0:
                EKa eKa = (EKa) this.A01;
                AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse = (AvatarCoinFlipBackgroundOptionResponse) AbstractC31172DnG.A0J(((C31475DsJ) eKa.A0I.getValue()).A06).A05;
                if (avatarCoinFlipBackgroundOptionResponse != null) {
                    str = avatarCoinFlipBackgroundOptionResponse.A03;
                } else {
                    str = null;
                }
                if (C14360o3.A0K(str, "Gray")) {
                    i = AbstractC53242c7.A0H(eKa.getContext(), R.attr.igds_color_creation_tools_grey_06);
                } else {
                    i = R.color.audio_bar_action_color_enabled;
                }
                RefreshSpinner refreshSpinner = eKa.A06;
                if (refreshSpinner != null) {
                    AbstractC31173DnH.A11(eKa.requireContext(), refreshSpinner, i);
                }
                AbstractC167007dF.A0w(eKa.A06);
                return;
            case 1:
                EKa.A02((EKa) this.A01);
                return;
            case 2:
                return;
            case 3:
                AbstractC31181DnP.A0q((EKa) this.A01);
                return;
            case 4:
                FKC fkc = (FKC) this.A01;
                AnonymousClass693 anonymousClass693 = fkc.A01;
                view = fkc.A00;
                if (view == null || anonymousClass693 == null) {
                    return;
                }
                anonymousClass693.pause();
                anonymousClass693.EMk(0.0f);
                view.setVisibility(8);
                return;
            default:
                view = ((C36472G6w) this.A01).A00;
                view.setVisibility(8);
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (2 - this.A00 == 0) {
            AbstractC31181DnP.A0q((EKa) this.A01);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
