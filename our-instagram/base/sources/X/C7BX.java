package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.7BX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7BX extends LinearGradient implements InterfaceC161477Li {
    public static float A03;
    public static final WeakHashMap A04 = new WeakHashMap();
    public int A00;
    public final C7BY A01;
    public final WeakReference A02;

    public C7BX(Shader.TileMode tileMode, Drawable drawable, int[] iArr, float f) {
        super(0.0f, 0.0f, 0.0f, f, iArr, (float[]) null, tileMode);
        C7BY c7by = new C7BY(this);
        this.A01 = c7by;
        this.A02 = new WeakReference(drawable);
        A04.put(this, true);
        c7by.Eg1(C1H4.A01(A03));
    }

    public static final void A00(C7BX c7bx) {
        c7bx.A01.Eg1(C1H4.A01(A03 + c7bx.A00));
        Drawable drawable = (Drawable) c7bx.A02.get();
        if (drawable != null) {
            drawable.invalidateSelf();
        }
    }

    @Override // X.InterfaceC161477Li
    public final void Eg1(int i) {
        this.A00 = i;
        A00(this);
    }
}
