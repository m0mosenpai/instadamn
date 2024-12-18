package X;

import android.animation.Animator;
import com.instagram.model.mediatype.ProductType;

/* renamed from: X.FhG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35281FhG implements Animator.AnimatorListener {
    public final /* synthetic */ ProductType A00;
    public final /* synthetic */ C143436di A01;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C35281FhG(ProductType productType, C143436di c143436di) {
        this.A00 = productType;
        this.A01 = c143436di;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        long currentTimeMillis;
        InterfaceC19610xo ARD;
        String str;
        int ordinal = this.A00.ordinal();
        if (ordinal != 1) {
            if (ordinal != 9) {
                if (ordinal == 13) {
                    InterfaceC19630xq interfaceC19630xq = this.A01.A01;
                    AbstractC167007dF.A18(interfaceC19630xq, "exclusive_content_animation_tall_video_count", AbstractC31172DnG.A01(interfaceC19630xq, "exclusive_content_animation_tall_video_count") + 1);
                    currentTimeMillis = System.currentTimeMillis();
                    ARD = interfaceC19630xq.ARD();
                    str = "exclusive_content_animation_tall_video_timestamp";
                } else {
                    throw new UnsupportedOperationException("ProductType does not match");
                }
            } else {
                InterfaceC19630xq interfaceC19630xq2 = this.A01.A01;
                AbstractC167007dF.A18(interfaceC19630xq2, "exclusive_content_animation_story_count", AbstractC31172DnG.A01(interfaceC19630xq2, "exclusive_content_animation_story_count") + 1);
                currentTimeMillis = System.currentTimeMillis();
                ARD = interfaceC19630xq2.ARD();
                str = "exclusive_content_animation_story_timestamp";
            }
        } else {
            InterfaceC19630xq interfaceC19630xq3 = this.A01.A01;
            AbstractC167007dF.A18(interfaceC19630xq3, "exclusive_content_animation_post_count", AbstractC31172DnG.A01(interfaceC19630xq3, "exclusive_content_animation_post_count") + 1);
            currentTimeMillis = System.currentTimeMillis();
            ARD = interfaceC19630xq3.ARD();
            str = "exclusive_content_animation_post_timestamp";
        }
        ARD.E7G(str, currentTimeMillis);
        ARD.apply();
    }
}
