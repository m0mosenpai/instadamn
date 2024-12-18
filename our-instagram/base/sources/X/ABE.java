package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.List;

/* loaded from: classes4.dex */
public final class ABE {
    public List A01 = AbstractC166987dD.A1E();
    public AnimatorSet A00 = new AnimatorSet();

    public final void A00(View view, C153336v2 c153336v2, int i) {
        long j;
        List list = this.A01;
        if (c153336v2.A00 == 0 && i == 0) {
            j = 0;
        } else {
            j = 50;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.setStartDelay(j);
        ofFloat.addListener(new ANB(1, this, view));
        list.add(ofFloat);
    }
}
