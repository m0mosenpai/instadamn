package X;

import android.graphics.Matrix;

/* loaded from: classes10.dex */
public final class TYY extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Matrix get() {
        Object obj = super.get();
        C14360o3.A0A(obj);
        Matrix matrix = (Matrix) obj;
        matrix.reset();
        return matrix;
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return AbstractC166987dD.A0Q();
    }
}
