package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6fW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144506fW {
    public final ValueAnimator A00;
    public final View A01;
    public final UserSession A02;

    public C144506fW(UserSession userSession, C57012jc c57012jc) {
        this.A02 = userSession;
        View requireViewById = c57012jc.A01().requireViewById(R.id.polaroid_sticker_overlay_container);
        C14360o3.A07(requireViewById);
        this.A01 = requireViewById;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(1400L);
        duration.setStartDelay(300L);
        this.A00 = duration;
    }

    public final void A00(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, InterfaceC30951Dj8 interfaceC30951Dj8, boolean z) {
        if (this.A01.getVisibility() == 0) {
            ValueAnimator valueAnimator = this.A00;
            if (!valueAnimator.isStarted()) {
                valueAnimator.removeAllListeners();
                valueAnimator.addUpdateListener(new C28519CiD(valueAnimator, this));
                valueAnimator.addListener(new C41778Ieu(c38321qM, interfaceC60442pS, this, z));
                valueAnimator.addListener(new C28513Ci7(this, interfaceC30951Dj8));
                valueAnimator.start();
            }
        }
    }
}
