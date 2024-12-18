package X;

import android.content.Context;
import android.widget.ImageView;

/* renamed from: X.VNi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68348VNi {
    public static final void A00(Context context, ImageView imageView, VET vet) {
        int i = vet.A00;
        int i2 = vet.A01;
        W5t A0A = C2FP.A0A();
        if (context == null) {
            context = imageView.getContext();
        }
        C14360o3.A0A(context);
        imageView.setImageDrawable(A0A.A04(context, i, i2));
    }
}
