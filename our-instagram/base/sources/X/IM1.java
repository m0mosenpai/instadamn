package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class IM1 {
    public Animator A00;
    public final long A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ UserSession A03;

    public IM1(View view, UserSession userSession) {
        this.A03 = userSession;
        this.A02 = view;
        this.A01 = ((long) C18U.A00(AbstractC25228BEl.A0l(userSession), userSession, 37163634753470759L)) * 1000;
    }

    public final List A00(float f, long j) {
        View view = this.A02;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", f);
        ofFloat.setDuration(j);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f);
        ofFloat2.setDuration(j);
        return AbstractC16960so.A1Q(ofFloat, ofFloat2);
    }
}
