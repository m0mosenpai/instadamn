package X;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public final class BAA extends C0YY implements InterfaceC16660sJ {
    public static final BAA A00 = new BAA();

    public BAA() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C14360o3.A0B(bitmap, 0);
        return AbstractC167007dF.A0o(Integer.valueOf(bitmap.getWidth()), bitmap.getHeight());
    }
}
