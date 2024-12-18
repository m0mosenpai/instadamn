package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;

/* renamed from: X.425, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass425 {
    public static final void A00(Context context, C206199Bc c206199Bc, InterfaceC86303t2 interfaceC86303t2, C3YD c3yd) {
        int i;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(interfaceC86303t2, 2);
        C14360o3.A0B(c206199Bc, 3);
        if (!c206199Bc.A04) {
            c3yd.A0A();
            return;
        }
        AbstractC86373tA.A00((View.OnClickListener) ((InterfaceC16660sJ) ((C9BH) c206199Bc.A01).A00).invoke(c3yd), interfaceC86303t2, (C3t9) c206199Bc.A02, null, c3yd);
        if (c206199Bc.A03) {
            i = AbstractC53242c7.A0H(context, R.attr.feedLikeActiveColor);
        } else {
            i = R.color.igds_icon_on_color;
        }
        int color = context.getColor(i);
        C3YD.A07(c3yd);
        C80593io c80593io = c3yd.A06;
        if (c80593io == null) {
            return;
        }
        c80593io.A02.setColorFilter(color);
    }
}
