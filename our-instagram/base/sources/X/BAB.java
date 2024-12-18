package X;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public final class BAB extends C0YY implements InterfaceC16660sJ {
    public static final BAB A00 = new BAB();

    public BAB() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C14360o3.A0B(bitmap, 0);
        bitmap.recycle();
        return C0eB.A00;
    }
}
