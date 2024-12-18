package X;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.View;

/* renamed from: X.7KJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7KJ {
    public final View A00;
    public final InterfaceC09390do A01 = C1XM.A00(new C9ED(this, 43));

    public static final JUX A00(C7KJ c7kj) {
        Context context = c7kj.A00.getContext();
        C14360o3.A0A(context);
        JUX jux = new JUX((int) AbstractC13880nE.A00(context, 6.0f), (int) AbstractC13880nE.A00(context, 3.0f), (int) AbstractC13880nE.A00(context, 3.0f));
        int i = Build.VERSION.SDK_INT;
        int A09 = AbstractC53242c7.A09(context);
        if (i < 29) {
            jux.setColorFilter(context.getColor(A09), PorterDuff.Mode.SRC_ATOP);
            return jux;
        }
        jux.setColorFilter(new BlendModeColorFilter(context.getColor(A09), BlendMode.SRC_ATOP));
        return jux;
    }

    public C7KJ(View view) {
        this.A00 = view;
    }
}
