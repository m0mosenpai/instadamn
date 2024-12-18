package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes5.dex */
public final class BX9 extends AbstractC65806TuP {
    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new ImageView(context);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        int i;
        float A00;
        C27881CQs A002;
        C27881CQs A003;
        EnumC25700BXk enumC25700BXk;
        C66238U5i c66238U5i = (C66238U5i) view;
        C14360o3.A0B(c66238U5i, 0);
        AbstractC167017dG.A1P(c6fg, c102884kP);
        int A03 = c102884kP.A03(40, 0);
        C102884kP A08 = c102884kP.A08(35);
        String str = "4.0dp";
        String A0L = c102884kP.A0L(36);
        if (A0L != null) {
            str = A0L;
        }
        C102884kP A082 = c102884kP.A08(41);
        C102884kP A083 = c102884kP.A08(38);
        String str2 = "rectangle";
        String A0H = c102884kP.A0H();
        if (A0H != null) {
            str2 = A0H;
        }
        if (A08 != null) {
            i = C6BK.A00(c6fg, A08, 0);
        } else {
            i = -1;
        }
        try {
            A00 = C6BE.A01(str);
        } catch (C41M e) {
            AbstractC25241Le.A03("CDSGlimmerViewUtils", e);
            A00 = U5C.A00(c6fg.A00, 4.0f);
        }
        if (A082 != null) {
            A002 = C27881CQs.A00(A082.A02(36, 0.3f), A082.A02(35, 0.5f));
        } else {
            A002 = C27881CQs.A00(0.3f, 0.5f);
        }
        if (A083 != null) {
            A003 = C27881CQs.A00(A083.A02(36, 0.066f), A083.A02(35, 0.11f));
        } else {
            A003 = C27881CQs.A00(0.066f, 0.11f);
        }
        if ("circle".equalsIgnoreCase(str2)) {
            enumC25700BXk = EnumC25700BXk.CIRCLE;
        } else {
            enumC25700BXk = EnumC25700BXk.RECTANGLE;
        }
        c66238U5i.A01(new BXA(A002, A003, enumC25700BXk, A00, A03, i, c6fg.A05));
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

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    public BX9(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
