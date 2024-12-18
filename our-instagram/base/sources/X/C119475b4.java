package X;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: X.5b4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119475b4 extends C0YY implements InterfaceC16620sF {
    public static final C119475b4 A00 = new C119475b4();

    public C119475b4() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((Matrix) obj2).set(((View) obj).getMatrix());
        return C0eB.A00;
    }
}
