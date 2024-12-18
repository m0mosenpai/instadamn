package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes11.dex */
public final class U7D extends AbstractC135366Al {
    public final C102884kP A00;

    @Override // X.AbstractC135366Al
    public final /* bridge */ /* synthetic */ Object A00(Context context, View view, Object obj, Object obj2) {
        C102884kP c102884kP = this.A00;
        view.setScaleX(c102884kP.A02(136, 1.0f));
        view.setScaleY(c102884kP.A02(137, 1.0f));
        view.setTranslationX(c102884kP.A02(144, 0.0f));
        view.setTranslationY(c102884kP.A02(145, 0.0f));
        view.setRotation(c102884kP.A02(138, 0.0f));
        view.setAlpha(c102884kP.A02(141, 1.0f));
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setRotation(0.0f);
        view.setAlpha(1.0f);
    }

    public U7D(C102884kP c102884kP, long j) {
        super(j);
        this.A00 = c102884kP;
    }

    @Override // X.AbstractC135366Al
    public final /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2, Object obj3, Object obj4) {
        return AbstractC25229BEm.A1Z(AbstractC103044kf.A00());
    }
}
