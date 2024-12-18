package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.Jgy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44254Jgy extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new C44255Jgz(context);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        ImageView imageView = (ImageView) view;
        C14360o3.A0B(imageView, 0);
        AbstractC167017dG.A1P(c6fg, c102884kP);
        C102884kP A08 = c102884kP.A08(35);
        if (A08 != null) {
            imageView.setColorFilter(C6BK.A00(c6fg, A08, 0));
            return null;
        }
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        ImageView imageView = (ImageView) view;
        C14360o3.A0B(imageView, 0);
        imageView.clearColorFilter();
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    public C44254Jgy(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
