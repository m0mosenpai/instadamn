package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;

/* renamed from: X.HGm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39036HGm extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new C110644yc(context, null, 0);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        C110644yc c110644yc = (C110644yc) view;
        C14360o3.A0B(c110644yc, 0);
        ValueAnimator valueAnimator = c110644yc.A04;
        valueAnimator.cancel();
        valueAnimator.start();
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    public C39036HGm(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
    }
}
