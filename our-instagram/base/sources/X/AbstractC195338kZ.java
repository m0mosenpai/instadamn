package X;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;

/* renamed from: X.8kZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC195338kZ {
    public static C53082bp A00(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            Object A01 = A01(context);
            if (A01 != null) {
                LocaleList A00 = AbstractC195348ka.A00(A01);
                C53082bp c53082bp = C53082bp.A01;
                return new C53082bp(new C53092bq(A00));
            }
            return C53082bp.A01;
        }
        return C53082bp.A00(AbstractC196448ma.A00(context));
    }

    public static Object A01(Context context) {
        return context.getSystemService("locale");
    }
}
