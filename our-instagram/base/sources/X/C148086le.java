package X;

import android.animation.Animator;
import android.content.Context;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.6le, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148086le {
    public ImageView A00;
    public InterfaceC58682mR A01;
    public final Context A02;

    public final void A00() {
        InterfaceC58682mR interfaceC58682mR;
        if (this.A00 != null && (interfaceC58682mR = this.A01) != null) {
            interfaceC58682mR.pause();
            InterfaceC58682mR interfaceC58682mR2 = this.A01;
            if (interfaceC58682mR2 != null) {
                interfaceC58682mR2.EMk(0.0f);
            }
            ImageView imageView = this.A00;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
    }

    public final void A01(Animator.AnimatorListener animatorListener) {
        InterfaceC58682mR interfaceC58682mR;
        InterfaceC58682mR interfaceC58682mR2;
        ImageView imageView = this.A00;
        if (imageView != null && (interfaceC58682mR = this.A01) != null && !interfaceC58682mR.isPlaying()) {
            imageView.setVisibility(0);
            if (animatorListener != null && (interfaceC58682mR2 = this.A01) != null) {
                interfaceC58682mR2.A8x(animatorListener);
            }
            InterfaceC58682mR interfaceC58682mR3 = this.A01;
            if (interfaceC58682mR3 != null) {
                interfaceC58682mR3.EMk(0.0f);
            }
            InterfaceC58682mR interfaceC58682mR4 = this.A01;
            if (interfaceC58682mR4 != null) {
                interfaceC58682mR4.E4S();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.2mO] */
    public final void A02(ImageView imageView, Integer num) {
        AnonymousClass693 anonymousClass693;
        Context context;
        int i;
        this.A00 = imageView;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                if (intValue != 1) {
                    if (intValue == 3) {
                        context = this.A02;
                        i = R.drawable.notes_birthdays_confetti_phase1_animation;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    context = this.A02;
                    i = R.drawable.ig_notes_vday_vday_final_half;
                }
            } else {
                context = this.A02;
                i = R.drawable.ig_notes_vday_vday_final_full;
            }
            anonymousClass693 = (C58652mO) context.getDrawable(i);
        } else {
            anonymousClass693 = C68U.A00(this.A02, R.raw.countdown_sticker_confetti);
        }
        this.A01 = anonymousClass693;
        ImageView imageView2 = this.A00;
        if (imageView2 != null) {
            imageView2.setImageDrawable(anonymousClass693);
        }
        InterfaceC58682mR interfaceC58682mR = this.A01;
        if (interfaceC58682mR != null) {
            interfaceC58682mR.A8x(new C35279FhE(this));
        }
    }

    public C148086le(Context context) {
        this.A02 = context;
    }
}
