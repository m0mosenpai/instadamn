package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import com.instagram.arlink.fragment.NametagController;

/* loaded from: classes8.dex */
public final class KFB extends AbstractC60592pi {
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Activity A04;
    public final RectF A05;
    public final RectF A06;
    public final NametagController A07;
    public final AbstractC59962oe A08;

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        C44065Jdq c44065Jdq = new C44065Jdq(this, 1);
        View view = this.A08.mView;
        if (view != null && this.A05 != null && !this.A01) {
            this.A01 = true;
            view.setVisibility(4);
            view.post(new RunnableC49984M4z(view, this, c44065Jdq));
            return;
        }
        c44065Jdq.onFinish();
    }

    public KFB(Activity activity, RectF rectF, RectF rectF2, NametagController nametagController, AbstractC59962oe abstractC59962oe) {
        this.A04 = activity;
        this.A08 = abstractC59962oe;
        this.A07 = nametagController;
        this.A05 = rectF;
        this.A06 = rectF2;
        this.A03 = AbstractC13880nE.A0A(activity);
        this.A02 = AbstractC13880nE.A09(activity);
    }
}
