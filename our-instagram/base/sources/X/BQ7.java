package X;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.SeekBar;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BQ7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ SeekBar A01;
    public final /* synthetic */ BPE A02;

    public BQ7(ViewGroup viewGroup, SeekBar seekBar, BPE bpe) {
        this.A01 = seekBar;
        this.A02 = bpe;
        this.A00 = viewGroup;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            SeekBar seekBar = this.A01;
            seekBar.setMaxHeight(AbstractC25230BEn.A0D(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int"));
            seekBar.setMinHeight(AbstractC25230BEn.A0D(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int"));
        }
        SeekBar seekBar2 = this.A01;
        seekBar2.getLayoutParams().height = AbstractC25230BEn.A0D(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        BPE bpe = this.A02;
        ViewGroup viewGroup = this.A00;
        AbstractC166997dE.A0S(viewGroup, R.id.scrubber_action).getLayoutParams().height = AbstractC25230BEn.A0D(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        UserSession userSession = bpe.A06;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 2342165586291730765L)) {
            seekBar2.requestLayout();
            AbstractC166997dE.A0S(viewGroup, R.id.video_countdown).requestLayout();
        }
    }
}
