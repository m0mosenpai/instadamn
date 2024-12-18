package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes11.dex */
public final class U78 extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new ImageView(context);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        C66238U5i c66238U5i = (C66238U5i) view;
        C14360o3.A0B(c66238U5i, 0);
        AbstractC167017dG.A1P(c6fg, c102884kP);
        int i = -16777216;
        C102884kP A08 = c102884kP.A08(35);
        int i2 = 24;
        if (A08 != null) {
            try {
                String A0G = A08.A0G();
                float f = 24.0f;
                if (A0G != null) {
                    f = C6BE.A01(A0G);
                }
                i2 = (int) f;
            } catch (C41M unused) {
            }
            C102884kP A082 = A08.A08(35);
            if (A082 != null) {
                i = C6BK.A00(c6fg, A082, 0);
            }
        }
        c66238U5i.A01(new U5F(c6fg.A00, 2.0f, i, i2));
        c66238U5i.A00();
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        C66238U5i c66238U5i = (C66238U5i) view;
        C14360o3.A0B(c66238U5i, 0);
        Animatable animatable = c66238U5i.A00;
        if (animatable != null) {
            animatable.stop();
        }
        c66238U5i.A01 = false;
    }

    public U78(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }
}
