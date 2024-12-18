package X;

import android.graphics.drawable.Drawable;
import java.util.function.Predicate;

/* renamed from: X.B1x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24949B1x implements Predicate {
    public static final C24949B1x A00 = new C24949B1x();

    @Override // java.util.function.Predicate
    public final /* bridge */ /* synthetic */ boolean test(Object obj) {
        C6RB c6rb;
        Drawable drawable = (Drawable) obj;
        C14360o3.A0B(drawable, 0);
        Integer num = null;
        if ((drawable instanceof C6RB) && (c6rb = (C6RB) drawable) != null) {
            num = c6rb.A0M;
        }
        return AbstractC167007dF.A1X(num, C05F.A00);
    }
}
